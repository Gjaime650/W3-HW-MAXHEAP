package s25.cs146;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WordFreq[] objArry = new WordFreq[10];

        objArry[0] = new WordFreq("happy",400);
        objArry[1] = new WordFreq("satisfied",100);
        objArry[2] = new WordFreq("neutral",300);
        objArry[3] = new WordFreq("would buy again",200);
        objArry[4] = new WordFreq("terrible",160);
        objArry[5] = new WordFreq("inconvenient",900);
        objArry[6] = new WordFreq("difficult to use",100);
        objArry[7] = new WordFreq("easy to use",140);
        objArry[8] = new WordFreq("would recommend to friends",800);
        objArry[9] = new WordFreq("visit the store",700);

    }
}