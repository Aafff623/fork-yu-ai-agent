package com.threetwoa.yuaiagent.agent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

/**
 * ReAct（Reasoning and Acting）单步模板。
 * {@link #think()} 只负责决策，{@link #act()} 才允许触发工具副作用，便于子类分别测试推理与执行。
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Slf4j
public abstract class ReActAgent extends BaseAgent {

    /**
     * 根据当前消息和 Agent 状态判断是否需要调用工具。
     *
     * @return {@code true} 表示进入行动阶段，{@code false} 表示本轮无需副作用
     */
    public abstract boolean think();

    /**
     * 执行推理阶段选定的行动。实现应把工具异常转换为可诊断结果，避免污染后续状态。
     *
     * @return 行动执行结果
     */
    public abstract String act();

    /**
     * 执行单个步骤：思考和行动
     *
     * @return 步骤执行结果
     */
    @Override
    public String step() {
        try {
            boolean shouldAct = think();
            if (!shouldAct) {
                return "思考完成 - 无需行动";
            }
            return act();
        } catch (Exception e) {
            log.error("ReAct step failed", e);
            return "步骤执行失败：" + e.getMessage();
        }
    }

}
