# 🌿 Calculadora de Emissões de Carbono

Uma **calculadora simples em Java** que estima a **emissão mensal de carbono (CO₂)** de uma empresa com base em diferentes fontes:

* Combustível de veículos
* Consumo de eletricidade
* Uso de gás natural
* Geração de resíduos
* Consumo de papel

O programa solicita ao usuário os dados mensais e retorna a **emissão total em kg de CO₂**.

---

## 🎯 Objetivo

O objetivo é **avaliar o impacto ambiental de uma empresa** a partir de dados de consumo, ajudando na conscientização e na adoção de práticas sustentáveis.

---

## 🧠 Tecnologias Utilizadas

* **Java**
* **Visual Studio Code**

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos

* Java JDK
* Um editor de código ou IDE (como IntelliJ, VS Code ou Eclipse)

---

### Passos

1. **Clone o repositório ou copie o código:**
   ```bash
   git clone https://github.com/mariasoaresv/Projeto-EcoNova.git
   ```
2. **Abra o arquivo `Calculadora.java`** no seu editor ou IDE.
3. **Compile o código.**

---

## 🧮 Como Funciona o Cálculo

A calculadora utiliza **fatores médios de emissão** para estimar a quantidade de CO₂ gerada:

| Fonte de Emissão       | Fator de Emissão (kg CO₂ por unidade) |
| ---------------------- | ------------------------------------- |
| Gasolina (litro)       | 2.31                                  |
| Álcool (litro)         | 1.86                                  |
| Diesel (litro)         | 2.68                                  |
| Energia elétrica (kWh) | 0.50                                  |
| Gás natural (m³)       | 2.00                                  |
| Resíduos (kg)          | 1.20                                  |
| Papel (kg)             | 1.50                                  |

Para cada categoria, o programa faz o cálculo:

*Emissão = Fator de Emissão × Quantidade informada pelo usuário*
O resultado final é a **soma das emissões totais** de cada categoria.

---

## 🔍 Melhorias Futuras

* Salvar os dados em um banco de dados
* Gerar relatórios em PDF com o histórico de emissões
* Desenvolver versão web com acesso por login

---

## 🌐 Contato

💻 **GitHub:** [mariasoaresv](https://github.com/mariasoaresv)
🔗 **LinkedIn:** [linkedin.com/in/mariasoaresv](https://linkedin.com/in/maria-fernanda-soares-silva)
