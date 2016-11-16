package com.epam.javacourses2016.task6;

import java.util.HashMap;

/**
 * Сложить два многочлена, если коэффициенты многочленов хранятся в объекте HashMap.
 * Степень элемента многочлена – ключ, коэффициент элемента многочлена – значение.
 * Коэффициенты многочления, ключи для которых отсутствуют в карте, равны нулю.
 */
public class SolverTask6 {

    /**
     * Осуществляет сложение двух многочленов.
     * @param first Первый многочлен.
     * @param second Второй многочлен.
     * @return Многочлен, полученный в результате сложения.
     */
    public HashMap<Integer, Integer> addPolynomials(HashMap<Integer, Integer> first, HashMap<Integer, Integer> second) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (Integer powFirst : first.keySet()) {
            for (Integer powSecond : second.keySet()) {
                if (powFirst.equals(powSecond)) {
                    result.put(powFirst, first.get(powFirst)+second.get(powSecond));
                    break;
                }
                else {
                    result.put(powFirst, first.get(powFirst));
                }
            }
        }
        return result;
    }
}
