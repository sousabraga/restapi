# restapi
Simple example of a REST API

Um simples exemplo de API REST com Spring.

A API contém dois endpoints:

O primeiro recebe uma palavra por parâmetro que deve se chamar "word", e informa se a palavra é palíndromo juntamente com o tempo que levou para processar em milisegundos.

https://example-restapi.herokuapp.com/palindrome

O segundo recebe um texto por parâmetro que deve se chamar "text", e informa o primeiro caractere que não se repete juntamente com o tempo que levou para processar em milisegundos.

https://example-restapi.herokuapp.com/firstChar

Ambos endpoints podem receber requisições do tipo GET e POST.

A aplicação está deployada no Heroku. 
