> ## Documentação da API - CRIO
>
> ### Descrição
> Esta API foi desenvolvida para o sistema CRIO, que gerencia o agendamento de eventos no Centro de Inovação de Criciúma. A API suporta a criação, atualização e gerenciamento de eventos, podendo ser acessada via HTTP.
>
> ### Pré-requisitos
> Para executar este projeto localmente, certifique-se de ter as seguintes ferramentas instaladas:
> - [Docker](https://www.docker.com/get-started)
> - Git
>
> ### Passo a passo para configuração
>
> 1. **Clone o repositório**
>    ```bash
>    git clone https://github.com/usuario/repo-crio.git
>    cd repo-crio
>    ```
>
> 2. **Crie o arquivo `.env`**  
>    Copie o arquivo `.env.example` e ajuste as variáveis de ambiente conforme suas necessidades:
>    ```bash
>    cp .env.example .env
>    ```
>
> 3. **Construção e inicialização com Docker**
>    Execute os seguintes comandos para construir e iniciar o container da aplicação:
>    ```bash
>    docker-compose build
>    docker-compose up -d
>    ```
>
> 4. **Acesse a API**
>    Após a inicialização, a API estará acessível em `http://localhost:3000` (ajuste o número da porta conforme configuração).
>
> 5. **Executar testes**
>    Caso existam testes configurados, execute-os com:
>    ```bash
>    docker-compose exec app npm test
>    ```
>
> ### Estrutura de Endpoints
>
> - `GET /api/events`: Lista todos os eventos
> - `POST /api/events`: Cria um novo evento
> - `PUT /api/events/:id`: Atualiza um evento existente
> - `DELETE /api/events/:id`: Exclui um evento
>
> ### Contribuição
> Se você deseja contribuir, por favor, envie um pull request com suas alterações. Certifique-se de documentar as mudanças no changelog.
>
> ### Licença
> Este projeto é licenciado sob a [MIT License](LICENSE).
