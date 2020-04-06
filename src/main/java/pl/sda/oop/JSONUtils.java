package pl.sda.oop;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSONUtils {


    public static void writeWorkerList(String filename, List<Worker> workers){
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(filename), workers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Worker> readWorkerList(String filename) {
        File file = new File(filename);
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<Worker> workers = new ArrayList<>();
            Worker[] workersTable = mapper.readValue(file, Worker[].class);
            for (Worker it:workersTable){
                workers.add(it);
            }

            return workers;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
