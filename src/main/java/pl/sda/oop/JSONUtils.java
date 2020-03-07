package pl.sda.oop;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONUtils {


    public void writeWorkerList(String filename, List<Worker> workers){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filename), workers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeDepartmentList(String filename, List<Department> departments){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filename), departments);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeCompanyList(String filename, List<Company> companies){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filename), companies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readList(String filename){
        File file = new File(filename);
        ObjectMapper mapper = new ObjectMapper();

        try {
            Worker workers[] = mapper.readValue(file, Worker[].class);
            for (int x = 0; x< workers.length; x++){

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
