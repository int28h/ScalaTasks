/*
 * Ваша задача - рассчитать плотность вероятности ﻿нормального распределения 
 * по заданным математическому ожиданию μ, среднеквадратичному отклонению σ 
 * и значению случайной величины ﻿x
 * Формула: p = 1 / (σ * sqrt(2 * pi)) * exp^(-((x - μ) ^ 2 /2 * σ ^ 2))
 * 
 * Реализуйте метод:
 * def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
 * ...
 * } 
 */

  def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
    var distribution: Double = (1 / (sigma * Math.sqrt(2 * Math.PI))) *
      (Math.pow(Math.E, (0 - Math.pow(x - mu, 2)) / (2 * Math.pow(sigma, 2))))
    distribution
  }