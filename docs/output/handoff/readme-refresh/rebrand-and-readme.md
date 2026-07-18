# Handoff · Rebrand and README

- 状态：completed
- 完成日期：2026-07-18
- 提交：`f559dad`
- 维护者：threetwoa

## 范围

身份/包名迁移、营销清理、核心注释重写、README 信息架构、初始化资产补全。

## 实施边界

没有主动改变产品主流程；第三方许可证、依赖坐标和 upstream 来源保留。需要外部服务的验证不伪造通过。

## 验证

`./mvnw compile；MCP 子模块 mvn compile；前端 npm run build`

## 风险

模型输出不可信；工具包含文件/网络/终端副作用；SSE 清理和 maxSteps 是资源边界；外部模型与向量库配置不可入库。

## 回滚

以提交 `f559dad` 为原子边界回退身份迁移；若仅回退文档，应确保包名和 README 不重新产生冲突身份。
