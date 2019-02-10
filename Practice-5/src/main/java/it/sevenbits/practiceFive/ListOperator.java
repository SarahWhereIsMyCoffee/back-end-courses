package it.sevenbits.practiceFive;

import java.util.List;

public class ListOperator {

    public <E extends Comparable<E>> E max(final List<E> list, final int startElementIndex, final int finishElementIndex) {
        E maxElement = list.get(startElementIndex);

        for (int i = startElementIndex + 1; i < finishElementIndex + 1; i++) {
            maxElement = (maxElement.compareTo(list.get(i)) < 0) ? list.get(i) : maxElement;
        }
        return maxElement;
    }

    public <E> void changeElementsPosition(final List<E> list, final int startElementIndex, final int finishElementIndex) {
        E firstElement = list.get(startElementIndex);
        list.set(startElementIndex, list.get(finishElementIndex));
        list.set(finishElementIndex, firstElement);
    }
}
