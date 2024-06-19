/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

/**
 *
 * @author MARITIME 02
 */
public class save {

    private static int id;

    public static int getID() {
        return id;
    }

    public static void setID(int accountId) {
        id = accountId;
    }

    public static void logout() {
        id = -1;
    }
}
