package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        int frameLength = 270;
        int framesPerStage = 4;

        int frame = 1;
        while (true) {

            if (frame <= framesPerStage) Print.stage1();
            else if (frame <= framesPerStage * 2) Print.stage2();
            else if (frame <= framesPerStage * 3) Print.stage3();
            else Print.stage4();

            if (frame == framesPerStage * 4) frame = 1;
            else frame++;

            Thread.sleep(frameLength);
        }
    }
}
