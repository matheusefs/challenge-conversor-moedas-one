# 💱 Conversor de Moedas em Java

Este projeto é um **Conversor de Moedas desenvolvido em Java** que utiliza uma API de taxas de câmbio para realizar conversões entre diferentes moedas em tempo real.

O programa funciona através de um **menu interativo no console**, permitindo que o usuário escolha a conversão desejada e informe o valor a ser convertido.

---

# 🚀 Funcionalidades

* Conversão de moedas em tempo real
* Integração com API de câmbio
* Interface textual interativa no console
* Suporte para múltiplas moedas

Moedas disponíveis:

* USD – Dólar Americano
* BRL – Real Brasileiro
* ARS – Peso Argentino
* BOB – Boliviano Boliviano
* CLP – Peso Chileno
* COP – Peso Colombiano

---

# 🛠 Tecnologias Utilizadas

* Java
* Gson (para leitura de JSON)
* HttpClient / HttpRequest / HttpResponse
* ExchangeRate API
* IntelliJ IDEA

---

# ⚙️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seu-usuario/conversor-moedas.git
```

### 2️⃣ Abrir no IntelliJ

Abra o projeto utilizando o **IntelliJ IDEA**.

### 3️⃣ Adicionar a biblioteca Gson

Adicione a biblioteca Gson ao projeto para fazer o parsing do JSON retornado pela API.

### 4️⃣ Adicionar sua chave da API

No arquivo `Main.java`, substitua:

```
String chaveApi = "SUA_CHAVE_AQUI";
```

pela sua chave obtida no site da ExchangeRate API.

### 5️⃣ Executar o programa

Execute a classe `Main.java`.

---

# 🎮 Exemplo de uso

```
=== Conversor de Moedas ===
1 - USD → BRL
2 - BRL → USD
3 - USD → ARS
4 - USD → BOB
5 - USD → CLP
6 - USD → COP
7 - Sair

Escolha uma opção: 3
Digite o valor: 10

Resultado:
10 USD = 52.54 BRL
```

---

# 📚 Aprendizados

Durante o desenvolvimento deste projeto foram aplicados conceitos importantes como:

* Consumo de APIs em Java
* Manipulação de JSON
* Uso da biblioteca Gson
* Programação orientada a objetos
* Tratamento de exceções
* Interação com usuário via console

---

# 👨‍💻 Autor

Matheus Emanuel

Projeto desenvolvido durante o **Programa ONE (Oracle Next Education)**.
