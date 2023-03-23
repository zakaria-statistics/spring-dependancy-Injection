package computer;

public class UC {

    private VGA vga;
    private USB usb;

    public UC() {
    }
    public UC(VGA vga, USB usb) {
        this.vga = vga;
        this.usb = usb;

    }



    public int readData(){
        return usb.read();
    }
    public void printData(String data){
        System.out.println("*************");
        vga.print(data);
        System.out.println("*************");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }





    public void setUsb(USB usb1) {
        this.usb = usb;
    }

    public USB getUsb() {
        return usb;
    }


}
