package ru.vsu.cs.menshikovnik;

import java.util.*;

public class Solution {

    public static List<Student> searchTheBestStudent(ArrayList<Student> list) {
        List<Student> best = new ArrayList<>();
        List<Student> woman = new ArrayList<>();
        List<Student> men = new ArrayList<>();
        for (Student student : list) {
            if (student.sex.equals("Женский")) {
                woman.add(student);
            }
            if (student.sex.equals("Мужской")) {
                men.add(student);
            }
        }

        for (int numCourse = 1; numCourse <= 4; numCourse++) {
            addTheBestStudent(men, best, numCourse);
            addTheBestStudent(woman, best, numCourse);
        }
        for (int i = 0; i < best.size() - 1; ) {
            Student student = best.get(i);
            Student student1 = best.get(i + 1);
            if (student.course == student1.course) {
                if (i == best.size() - 2) {
                    break;
                }
                i += 2;
                student = best.get(i);
                if (i != best.size() - 1) student1 = best.get(i + 1);
            }
            if (i != best.size() - 1) {
                if (student.course != student1.course) {
                    best.remove(student);
                    student = best.get(i);
                }
            }
            if (i == best.size() - 1) best.remove(student);
        }

        return best;
    }
    public static void addTheBestStudent(List<Student> list,List<Student> best, int numCourse){
        Random rnd = new Random();
        List<Student> bestStudentRepeat = new ArrayList<>();
        int maxStudent = 0;
            for (Student student : list) {
                if (student.averageScore > maxStudent && student.course == numCourse) {
                    maxStudent = student.averageScore;
                }
            }
            for (Student student : list) {
                if (student.averageScore == maxStudent && student.course == numCourse) {
                    for (Student student1 : list) {
                        if (student.averageScore == student1.averageScore && student1.course == numCourse) {
                            bestStudentRepeat.add(student1);
                        }
                    }
                    Student randomElement = bestStudentRepeat.get(rnd.nextInt(bestStudentRepeat.size()));
                    best.add(randomElement);
                    bestStudentRepeat.clear();
                    break;
                }
        }
    }
}