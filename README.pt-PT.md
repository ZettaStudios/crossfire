![](banner.jpg)
[![](https://img.shields.io/github/workflow/status/ZettaStudios/crossfire/Ubuntu%2016.04%20-%20Java%20-%20Maven?label=Ubuntu%2016.04&logo=ubuntu&logoColor=white&style=flat-square)](https://github.com/ZettaStudios/crossfire/actions/workflows/ubuntu-16.04-java-maven.yml)
[![](https://img.shields.io/github/workflow/status/ZettaStudios/crossfire/Ubuntu%2018.04%20-%20Java%20-%20Maven?label=Ubuntu%2018.04&logo=ubuntu&logoColor=white&style=flat-square)](https://github.com/ZettaStudios/crossfire/actions/workflows/ubuntu-18.04-java-maven.yml)
[![](https://img.shields.io/github/workflow/status/ZettaStudios/crossfire/Ubuntu%2020.04%20-%20Java%20-%20Maven?label=Ubuntu%2020.04&logo=ubuntu&logoColor=white&style=flat-square)](https://github.com/ZettaStudios/crossfire/actions/workflows/ubuntu-20.04-java-maven.yml)
[![](https://img.shields.io/github/workflow/status/ZettaStudios/crossfire/Windows%202016%20-%20Java%20-%20Maven?label=Windows%202016&logo=windows&style=flat-square)](https://github.com/ZettaStudios/crossfire/actions/workflows/windows-2016-java-maven.yml)
[![](https://img.shields.io/github/workflow/status/ZettaStudios/crossfire/Windows%202019%20-%20Java%20-%20Maven?label=Windows%202019&logo=windows&style=flat-square)](https://github.com/ZettaStudios/crossfire/actions/workflows/windows-2019-java-maven.yml)
[![](https://img.shields.io/github/workflow/status/ZettaStudios/crossfire/macOS%20Big%20Sur%2011.0%20-%20Java%20-%20Maven?label=macOS%20Big%20Sur%2011.0&logo=apple&style=flat-square)](https://github.com/ZettaStudios/crossfire/actions/workflows/macos-11.0-java-maven.yml)
[![](https://img.shields.io/github/workflow/status/ZettaStudios/crossfire/macOS%20Catalina%2010.15%20-%20Java%20-%20Maven?label=macOS%20Catalina%2010.15&logo=apple&style=flat-square)](https://github.com/ZettaStudios/crossfire/actions/workflows/macos-10.15-java-maven.yml)

[English](README.md) | Português

# CrossFire Emulator (Versão Java)
**Olá a todos!** Este é um **projecto ambicioso**, temos ainda muitos objetivos a atingir e gostaríamos de **apreciar** qualquer ajuda que nos é fornecido. Estamos felizes por disponibilizar o **código fonte** do nosso servidor, muitos dos Enum já criados estão na ordem correta e com a sua correta escrita para enviar os packets. Utilize o servidor como desejar, não temos restrições desde que atribua os créditos deste repositório.

## Visão geral
Isto é um projeto que está a ser desenvolvida pela comunidade, e não está afiliado a nenhuma das empresas pertencentes à [Neowiz](https://www.neowiz.com/), [Playgra (Arario)](http://playgra.com/), [VTC Game](https://www.vtcgame.vn/), [Tencent](https://www.tencent.com/), [Z8Games](https://www.z8games.com/), [GameClub](https://www.gameclub.ph/) and [LYTO](https://www.lytogame.com/). O projeto é desenvolvido com o Java versão 8 possibilitando que seja possível executar em maioria dos servidores de hoje em dia, e com a ferramenta de automação de compilação chamada Maven.

## Autenticação no servidor de Login
O projeto ainda não tem qualquer tipo de gestão de bases de dados ou simuladores, o mesmo para simular o servidor de login, utilizamos dados estáticos para efeitos de testes. Mais tarde, será implementada toda uma interface para este tipo de gestão.

Abaixo estão os dados para efetuar a autenticação.

| |LOGIN|PASSWORD|
|---|---|---|
|Conta|`oreki`|`oreki`

## UML Diagrams
Um pequeno esquema sobre a network do servidor.

![](diagram.png)
