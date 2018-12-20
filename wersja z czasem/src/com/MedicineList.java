package com;


import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalTime;
import java.util.Vector;

import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class MedicineList extends JList<ListEntry>
{
    private Vector<ListEntry> list;

    MedicineList()
    {
        super();
        this.list = new Vector<>();
        this.setFont(new Font("name", Font.ROMAN_BASELINE, 15));
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public void addElement(String medicineName)
    {
        list.add(new ListEntry(medicineName));
        update();
    }

    public void clearList()
   {
        list.clear();
        update();
    }

    public void deleteSelectedElement()
    {
        list.remove(this.getSelectedIndex());
        update();
    }

    public String timeUpdate()
    {
    	
    	String time = LocalTime.now().toString();
    	return time;
    }
    
    public void PillsSelectedElement(int pills)
    {
        // TODO Handle already taken  error ??
        // TODO Handle wrong time error pm am?
        list.get(this.getSelectedIndex()).takeIt(pills);
        
       // System.out.println(timeUpdate());
        update();
    }
    public void TimeSelectedElement(String time)
    {
        
        list.get(this.getSelectedIndex()).getTime(time);
        update();
    }

    private void update()
    {
        this.setListData(list);
    }

    public boolean isNotSelected()
    {
        return this.getSelectedIndex() == -1;
    }

    public void saveListToFile()
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream("list.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list);
            out.close();
            fileOut.close();
        } catch (IOException i)
        {
            i.printStackTrace();
        }
    }

    public void loadListFromFile()
    {
        try
        {
            FileInputStream fileIn = new FileInputStream("list.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            list = (Vector<ListEntry>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i)
        {
            i.printStackTrace();
        } catch (ClassNotFoundException c)
        {
            System.out.println("Error");
            c.printStackTrace();
        }
        update();
    }


}