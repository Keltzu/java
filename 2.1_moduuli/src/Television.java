import java.util.Scanner;

class Television {
    private int channel;
    private static final int MAX_CHANNEL = 10;

    public Television() {
        this.channel = 1;
    }

    public void watch(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Watching channel " + channel);
            channel++;
            if (channel > MAX_CHANNEL) {
                channel = 1;
            }
        }
    }
}

class TelevisionViewer {
    public static void main(String[] args) {
        Television tv = new Television();
        int days = 10;
        int[] channelsPerDay = {3, 4, 6, 4, 6, 4, 6, 4, 6, 4};

        for (int day = 1; day <= days; day++) {
            System.out.println("Woke up, day " + day);
            tv.watch(channelsPerDay[day - 1]);
            System.out.println("Falling asleep");
        }
    }
}
