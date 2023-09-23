package src;

import java.util.ArrayList;
import java.util.Collections;

public class MusicalNote implements Comparable<MusicalNote> {

    public static enum pitch {C, D, E, F, G, A, B};
    int octave;  // 0 to 7
    pitch pit;
    MusicalNote (int oct, pitch p) {
        octave = oct;
        pit = p;
    };

    public static void main(String args[]) {
        int oct1 = 1;
        int oct2 = 2;
        int oct3 = 3;
        int oct4 = 4;
        int oct5 = 5;
        int oct6 = 6;
        int oct7 = 7;

        pitch p1 = pitch.C;
        pitch p2 = pitch.D;
        pitch p3 = pitch.E;
        pitch p4 = pitch.F;
        pitch p5 = pitch.G;
        pitch p6 = pitch.A;
        pitch p7 = pitch.B;

        MusicalNote es1 = new MusicalNote(oct1, p1);
        MusicalNote es2 = new MusicalNote(oct3, p3);
        MusicalNote es3 = new MusicalNote(oct5, p5);
        MusicalNote es4 = new MusicalNote(oct7, p7);
        MusicalNote es5 = new MusicalNote(oct6, p6);
        MusicalNote es6 = new MusicalNote(oct2, p2);
        MusicalNote es7 = new MusicalNote(oct4, p4);

        MusicalNote es8 = new  MusicalNote(oct7, p1);
        MusicalNote es9 = new  MusicalNote(oct7, p3);
        MusicalNote es10 = new MusicalNote(oct7, p5);
        MusicalNote es11 = new MusicalNote(oct7, p6);
        MusicalNote es12 = new MusicalNote(oct7, p2);
        MusicalNote es13 = new MusicalNote(oct7, p4);
        MusicalNote es14 = new MusicalNote(oct7, p7);
//        EnumSorting es15 = new EnumSorting(oct1, p1);
//        EnumSorting es16 = new EnumSorting(oct1, p1);
/*
        EnumSorting es8 = new EnumSorting(oct1, p1);
        EnumSorting es9 = new EnumSorting(oct1, p1);
        EnumSorting es10 = new EnumSorting(oct1, p1);
        EnumSorting es11 = new EnumSorting(oct1, p1);
        EnumSorting es12 = new EnumSorting(oct1, p1);
        EnumSorting es13 = new EnumSorting(oct1, p1);
        EnumSorting es14 = new EnumSorting(oct1, p1);
        EnumSorting es15 = new EnumSorting(oct1, p1);
        EnumSorting es16 = new EnumSorting(oct1, p1);
 */
        ArrayList<MusicalNote> enumSortingList = new ArrayList<MusicalNote>();
        enumSortingList.add(es1);
        enumSortingList.add(es2);
        enumSortingList.add(es3);
        enumSortingList.add(es4);
        enumSortingList.add(es5);
        enumSortingList.add(es6);
        enumSortingList.add(es7);
        enumSortingList.add(es8);
        enumSortingList.add(es10);
        enumSortingList.add(es12);
        enumSortingList.add(es14);
        enumSortingList.add(es9);
        enumSortingList.add(es11);
        enumSortingList.add(es13);

        System.out.println("Original List");
        for (MusicalNote esl : enumSortingList ) {
            System.out.println("Octave is: " + esl.octave + " Pitch is: " + esl.pit);
        }

        Collections.sort(enumSortingList);

        System.out.println("Sorted List");
        for (MusicalNote esl : enumSortingList ) {
            System.out.println("Octave is: " + esl.octave + " Pitch is: " + esl.pit);
        }

/*
        for (pitch p: pitch.values() ) {
            System.out.println("Index is: " + p.ordinal() + " Value is: " + p);
        }
*/
    }
/*
    @Override
    public int compareTo(EnumSorting obj) {
        int flag = this.octave - obj.octave;
        if(flag == 0)
            flag= this.pit.compareTo(obj.pit);
        return flag;
    }
*/
    @Override
    public int compareTo(MusicalNote obj) {
        int flag = obj.octave - this.octave;
        if(flag == 0)
            flag= obj.pit.compareTo(this.pit);
        return flag;
    }
}
