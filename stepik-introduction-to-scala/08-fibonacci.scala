def fibs(num: Int): Int = {
  if (num == 1) 1
  else if (num == 2) 1
  else fibs(num - 1) + fibs(num - 2)
}