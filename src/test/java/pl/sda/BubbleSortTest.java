package pl.sda;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSortTest {

    private List<String> names;
    private final List<String> sortedNames = Arrays.asList(
            "Justyna", "Monika",
            "Ola", "Ola");
    private BubbleSort bubbleSort;

    @BeforeEach
    void initialize() {
        bubbleSort = new BubbleSort();
        names = Arrays.asList("Monika", "Ola",
                "Justyna", "Ola");
    }

    @Test
    void testNotEmptyAndHasRightSize() {
        List<String> result = bubbleSort.sort(names);
        Assertions.assertThat(result)
                .hasSize(names.size())
                .isNotEmpty();
    }

    @Test
    void testSortHasCorrectOrder() {
        List<String> result = bubbleSort.sort(names);
        Assertions.assertThat(result)
                .isEqualTo(sortedNames);
    }

}
