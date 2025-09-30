class download extends Thread{
    String filename;
    download (String filename){
        this.filename = filename;
    }
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            System.out.println("Downloading " + filename + " ... " + (i * 20) + "%");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(filename + " download interrupted!");
            }
        }
        System.out.println(filename + " download completed!");
    }
}
class main3{
    public static void main(String[]arge){
        download f1 = new download("movie mp3");
        download f2 = new download("movie mp4");
        download f3 = new download("movie mp5");
        f1.start();
        f2.start();
        f3.start();
    }
}