/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ArchieQT
 */
public class searchtable {

    public static void table(JTable name, JTextField search) {
        DefaultTableModel model = (DefaultTableModel) name.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        name.setRowSorter(obj);
        obj.setRowFilter(javax.swing.RowFilter.regexFilter(search.getText()));
    }
}
