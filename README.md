# DeepSeek AI Chat with Spring Boot

This is a Spring Boot project that integrates the Ollama framework with the DeepSeek AI model (`deepseek-r1:1.5b`) to provide an interactive AI chat experience locally. The application features both standard and streaming API endpoints for AI responses, along with a simple, modern web UI.

## Features
- **AI Chat**: Ask questions and get responses powered by DeepSeek AI.
- **Standard Response**: Get a single response via the `/api/ai/prompt` endpoint.
- **Streaming Response**: Stream responses in real-time via the `/api/ai/prompt/stream` endpoint.
- **Modern UI**: A responsive and animated chat interface built with HTML, CSS, and JavaScript.
- **Local Deployment**: Runs locally using Ollama and the DeepSeek model.

## Prerequisites
Before you begin, ensure you have the following installed:

1. **Java 17 or higher** - Required for Spring Boot.
2. **Maven** - For dependency management and building the project.
3. **Ollama** - A local AI framework to run the DeepSeek model.
   - Install Ollama: Follow the instructions [here](https://ollama.ai/).
   - Pull the DeepSeek model: Run `ollama pull deepseek-r1:1.5b` in your terminal.
4. **Git** - To clone the repository.

## Project Structure
spring-ai-deepseek/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/piyush/deepseekdemo/spring_ai_deepseek/
│   │   │       ├── SpringBootAiDeepseekApplication.java   # Main application class
│   │   │       ├── controller/
│   │   │       │   ├── AiChatController.java             # REST API controller
│   │   │       │   └── HomePageController.java           # Home page controller
│   │   │       └── services/
│   │   │           └── AIChatService.java                # Service to interact with DeepSeek
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html                            # Frontend UI
│   │       └── application.properties                    # Configuration file
├── pom.xml                                               # Maven dependencies
└── README.md                                             # This file


## Setup Instructions
Follow these steps to set up and run the project locally:

### 1. Clone the Repository
```bash
git clone https://github.com/thepiyushrai/spring-ai-deepseek.git
cd spring-ai-deepseek

## 2. Install Dependencies
mvn clean install

## 3. Configure Ollama
bash
ollama serve

## 4. Download the DeepSeek model (deepseek-r1:1.5b) using:
bash

ollama pull deepseek-r1:1.5b

Verify that the Ollama server is running by checking http://localhost:11434/ (the default URL) in your browser or via a tool like curl.


