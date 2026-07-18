# Architecture Overview

## 系统定位

围绕 RAG、工具调用、MCP 和 ReAct 自主规划的智能体实践工程。

## 主链路

```text
用户问题 → 对话记忆/RAG → Agent 推理 → 工具或 MCP 调用 → SSE 输出 → 终止判定
```

## 模块边界

- src/main/java/ 后端与 Agent
- yu-ai-agent-frontend/ 前端
- yu-image-search-mcp-server/ MCP 服务

## 技术栈

Spring Boot、Spring AI、LangChain4j、PgVector、Vue 3、MCP。

## 运行时依赖与失败模型

模型输出不可信；工具包含文件/网络/终端副作用；SSE 清理和 maxSteps 是资源边界；外部模型与向量库配置不可入库。外部依赖不可用时，系统应返回明确失败或采用文档化的保守降级；不得产生看似成功但不可审计的结果。

## 变更检查表

- 公共模型或接口是否影响多个模块？
- 配置键、扫描路径、Mapper namespace 或 SPI 文件是否同步？
- 新增外部调用是否有超时、限流和错误语义？
- 日志是否避开凭据与个人数据？
- README、CONTEXT 和 ADR 是否仍与实现一致？
