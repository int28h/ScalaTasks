/*
На вход программе подается имя пользователя, email и список его коммитов, возможно пустой 
(коммит - одно из ключевых понятий системы контроля версий Git - https://ru.wikipedia.org/wiki/Git. 
В данном контексте - это просто строка).

Считанные построчно данные лежат в списке input. После имени мог стоять как пробел, так и перенос строки,
каждый коммит был в отдельной строчке. 
Другими словами, первые два элемента списка это либо имя и электронная почта, 
либо имя с почтой через пробел и первый коммит. 
Используя pattern-matching и регулярные выражения напечатайте через пробел имя пользователя и домен 
электронной почты (все, что стоит после собаки). Для некорректных данных напачатайте "invalid".

Подсказка: регулярное выражение для имени "[a-zA-Z]+", для электронного адреса "\\w+@\\w+\\.\\w+" . Для 
извлечения параметров используйте круглые скобки, чтобы объявить группы в нужных местах.

Считывать ничего не нужно, переменная input: List[String] уже проинициализирована.
*/
val name = "([a-zA-Z]+)".r
val domain = "(\\w+@\\w+\\.\\w+)".r
val email = "([a-zA-Z]+) (\\w+@\\w+\\.\\w+)".r

val result = input match {
  case List(email(name, email), _*) => s"$name ${email.substring(email.indexOf("@") + 1)}"
  case List(name(name), domain(email), _*) => s"$name ${email.substring(email.indexOf("@") + 1)}"
  case _ => "invalid"
}
println(result)
