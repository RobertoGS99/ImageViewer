/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

/**
 *
 * @author Admin
 */
public interface Command {
    String name();
    void execute();
}
