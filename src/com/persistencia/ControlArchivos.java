/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persistencia;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
/**
 *
 * @author Esteban Arteaga
 */
public final class ControlArchivos {
    public static ArrayList<String[]> leerArchivoJadel(String ruta){
        //arrayList donde se van a guardar todos los datos
        ArrayList<String[]> datos = new ArrayList<>();
        File fileExcel = new File(ruta);
        try (FileInputStream file = new FileInputStream(fileExcel)) {
            // leer archivo excel
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            //obtener la hoja que se va leer
            XSSFSheet sheet = worbook.getSheetAt(0);
            //obtener todas las filas de la hoja excel
            Iterator<Row> rowIterator = sheet.iterator();
            Row row;
            // se recorre cada fila hasta el final
            while (rowIterator.hasNext()) {
                row = rowIterator.next();
		//se obtiene las celdas por fila
            	Iterator<Cell> cellIterator = row.cellIterator();
		Cell cell;
		
                //vector donde se van a guardar los datos por paciente
                String s[] = new String[10];
                try {
                    //se extrae el dato de tipo de documento
                    cell = cellIterator.next();
                    s[0] = cell.getStringCellValue();
                    
                    //se extrae el numero de documento
                    cell = cellIterator.next();
                    s[1] = cell.getStringCellValue();
                    
                    //se extrae el primer apellido
                    cell = cellIterator.next();
                    s[2] = cell.getStringCellValue();
                    
                    //se extrae el segundo apellido
                    cell = cellIterator.next();
                    s[3] = cell.getStringCellValue();
                    
                    //se extrael el primer nombre
                    cell = cellIterator.next();
                    s[4] = cell.getStringCellValue();
                    
                    //se extrae el segundo nombre
                    cell = cellIterator.next();
                    s[5] = cell.getStringCellValue();
                    
                    //se extrae la fecha de nacimiento
                    cell = cellIterator.next();
                    s[6] = new SimpleDateFormat("yyyy-MM-dd").format(cell.getDateCellValue());
                    
                    //se extrae el tipo el sexo del paciente
                    cell = cellIterator.next();
                    s[7] = cell.getStringCellValue();
                    
                    //se extrae el tipo de servicio
                    cell = cellIterator.next();
                    s[8] = cell.getStringCellValue();
                    
                    //se extrae la fecha del servicio
                    cell = cellIterator.next();
                    s[9] = new SimpleDateFormat("yyyy-MM-dd").format(cell.getDateCellValue());
                    datos.add(s);
                } catch (Exception e) {
                   System.out.println(e.getMessage());
                }
                
            }
	} catch (Exception e) {
            System.out.println(e.getMessage());
	}
        return datos;
    }
    
    public static ArrayList<String[]> leerArchivoColposcopia(String ruta){
        //arrayList donde se van a guardar todos los datos
        ArrayList<String[]> datos = new ArrayList<>();
        File fileExcel = new File(ruta);
        try (FileInputStream file = new FileInputStream(fileExcel)) {
            // leer archivo excel
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            //obtener la hoja que se va leer
            XSSFSheet sheet = worbook.getSheetAt(0);
            //obtener todas las filas de la hoja excel
            Iterator<Row> rowIterator = sheet.iterator();
            Row row;
            // se recorre cada fila hasta el final
            while (rowIterator.hasNext()) {
                row = rowIterator.next();
		//se obtiene las celdas por fila
            	Iterator<Cell> cellIterator = row.cellIterator();
		Cell cell;
		
                //vector donde se van a guardar los datos por paciente
                String s[] = new String[10];
                try {
                    //se extrae el dato de tipo de documento
                    cell = cellIterator.next();
                    s[0] = cell.getStringCellValue();
                    
                    //se extrae el numero de documento
                    cell = cellIterator.next();
                    s[1] = cell.getStringCellValue();
                    
                    //se extrae el primer apellido
                    cell = cellIterator.next();
                    s[2] = cell.getStringCellValue();
                    
                    //se extrae el segundo apellido
                    cell = cellIterator.next();
                    s[3] = cell.getStringCellValue();
                    
                    //se extrael el primer nombre
                    cell = cellIterator.next();
                    s[4] = cell.getStringCellValue();
                    
                    //se extrae el segundo nombre
                    cell = cellIterator.next();
                    s[5] = cell.getStringCellValue();
                    
                    //se extrae la fecha de nacimiento
                    cell = cellIterator.next();
                    s[6] = new SimpleDateFormat("yyyy-MM-dd").format(cell.getDateCellValue());
                    
                    //se extrae el tipo el sexo del paciente
                    cell = cellIterator.next();
                    s[7] = cell.getStringCellValue();
                    
                    //se extrae el tipo de servicio
                    cell = cellIterator.next();
                    s[8] = cell.getStringCellValue();
                    
                    //se extrae la fecha del servicio
                    cell = cellIterator.next();
                    s[9] = new SimpleDateFormat("yyyy-MM-dd").format(cell.getDateCellValue());
                    datos.add(s);
                } catch (Exception e) {
                   System.out.println(e.getMessage());
                }
                
            }
	} catch (Exception e) {
            System.out.println(e.getMessage());
	}
        return datos;
    }
    
    //funcion para validar que el formato del archivo es en excel
    public boolean validarArchivoExcel(String ruta){
        File file = new File(ruta);
        if(file.getName().endsWith("xlsx"))
            return true;
        return false;
    }
}
