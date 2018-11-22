package pl.sda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

    List<String> sort(List<String> names) {
        List<String> namesCopy = new ArrayList<>(names);
        Collections.sort(namesCopy);
        return namesCopy;
    }
}
