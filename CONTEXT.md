# Yu AI Agent · Context

## 一句话定位

围绕 RAG、工具调用、MCP 和 ReAct 自主规划的智能体实践工程。

## 产品主链路

用户问题 → 对话记忆/RAG → Agent 推理 → 工具或 MCP 调用 → SSE 输出 → 终止判定。

## 代码边界

src/main/java/ 后端与 Agent；yu-ai-agent-frontend/ 前端；yu-image-search-mcp-server/ MCP 服务。

## 技术与运行环境

Spring Boot、Spring AI、LangChain4j、PgVector、Vue 3、MCP。

## 当前事实

- 当前二开维护者为 `threetwoa`。
- `origin` 指向增强仓，`upstream` 指向原始项目。
- 最近二开提交 `f559dad` 完成身份迁移、营销清理、核心注释和 README 重构。
- 上游里程碑：6d4608c：升级 Spring AI 1.0；01efbc4：引入自主规划 Agent；4dd8a48：接入 MCP。

## 关键风险

模型输出不可信；工具包含文件/网络/终端副作用；SSE 清理和 maxSteps 是资源边界；外部模型与向量库配置不可入库。

## 推荐阅读顺序

1. README：产品定位与启动入口。
2. 本文件与 `docs/agents/domain.md`：边界和术语。
3. 入口模块与主链路服务。
4. 配置、持久化、测试和部署文件。
5. `docs/adr/` 与 `docs/output/handoff/`：决策和已交付变更。
