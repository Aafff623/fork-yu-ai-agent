# Project Glossary

| 术语 | 含义 |
|---|---|
| Origin | `Aafff623/fork-yu-ai-agent`，当前二开远程仓库 |
| Upstream | 原作者李鱼皮（liyupi）的原始项目远程，用于同步来源、历史与许可证信息 |
| Product root | src/main/java/ 后端与 Agent；yu-ai-agent-frontend/ 前端；yu-image-search-mcp-server/ MCP 服务 |
| Main flow | 用户问题 → 对话记忆/RAG → Agent 推理 → 工具或 MCP 调用 → SSE 输出 → 终止判定 |
| Handoff | 实施前后的任务合同，记录范围、验证、风险和回滚 |
| ADR | 影响长期维护的架构决策记录 |
| Mock | 演示或降级数据；必须显式标注，不等同真实执行 |
| Secret | API Key、私钥、数据库口令等不得提交的运行凭据 |
