/*
	Метод greeting задан следующим образом:

	def greeting(name: String) {
		println(prefix + name)
	}

	Он должен брать prefix из текущей зоны видимости, конкатенировать с переданным именем и выводить приветствие на экран. 
	В объекте Config требуемое значение prefix лежит в поле name.

	Задание: Допишите код так, чтобы метод greeting выполнился корректно .

	Примечание: метод greeting и объект Config находятся в текущей области видимости.
*/

import Config.{name => prefix}
val name = "Oleg"
greeting(name)
