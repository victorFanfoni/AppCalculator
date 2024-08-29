AppCalculator

Descrição

AppCalculator é um aplicativo de calculadora para Android, desenvolvido para facilitar operações matemáticas básicas como adição, subtração, multiplicação e divisão. Com uma interface intuitiva e responsiva, ele oferece uma experiência de uso simples e eficiente, ideal para quem precisa realizar cálculos rápidos no dia a dia.

Funcionalidades

Operações Matemáticas Básicas: Suporte para adição, subtração, multiplicação e divisão.
Manipulação de Parênteses: Permite a utilização de parênteses para cálculos mais complexos.
Avaliação de Expressões: Integração com a biblioteca mxparser para avaliar expressões matemáticas em tempo real.
Modo de Tela Cheia: O aplicativo utiliza o modo edge-to-edge, aproveitando ao máximo a tela do dispositivo.
Histórico de Cálculos: Exibe a expressão atual e o resultado na tela, permitindo revisões rápidas.
Limpeza de Entradas: Inclui botões para limpar a última entrada ou toda a expressão.

Tecnologias Utilizadas

Linguagem de Programação: Kotlin
Interface de Usuário: XML com LinearLayout, TableLayout, e ConstraintLayout
Biblioteca de Avaliação de Expressões: mxparser

Estrutura do Código

MainActivity.kt
Inicialização: A MainActivity é responsável por configurar a interface do usuário e definir o comportamento dos botões.
Botões: Cada botão da interface tem uma função específica, seja para inserir números, operadores ou limpar as entradas.
Cálculos: As expressões matemáticas inseridas são avaliadas em tempo real, exibindo o resultado automaticamente.
Limpeza de Dados: O botão "CE" limpa todo o conteúdo do campo de cálculo e o campo de resultado.

Como Usar

Instalação: Clone o repositório, abra o projeto no Android Studio e execute o aplicativo em um emulador ou dispositivo físico.
Interface: Use os botões na tela para inserir números e operadores. O resultado do cálculo será exibido automaticamente.
Limpeza: Utilize os botões de limpeza para apagar entradas específicas ou todo o cálculo.
