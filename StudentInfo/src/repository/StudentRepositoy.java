/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAcess.StudentDAO;
import model.Student;
import java.util.ArrayList;

/**
 *
 * @author DiepTCNN
 */
public class StudentRepositoy implements IStudentRepository{

    @Override
    public void display(ArrayList<Student> lt) {
        StudentDAO.Instance().display(lt);
    }
    
}   