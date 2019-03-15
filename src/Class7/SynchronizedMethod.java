package Class7;

/**
 * Created by a-19-k on 3/5/19.
 */
class Line {
    synchronized public void getLine() {
        for (int i = 0; i < 3; i++) { System.out.println(i); try {
            Thread.sleep(400); } catch (Exception e) {
            System.out.println(e); }
        } }
}
class Train extends Thread { Line line;
    Train(Line line) { this.line = line;
    }
    @Override
    public void run() {
        line.getLine(); }
}
class SynchronizedMethod {
    public static void main(String args[]) { Line line = new Line();
        Train trainOne = new Train(line); Train trainTwo = new Train(line);
        trainOne.start();
        trainTwo.start(); }
}

