package entity;

public class BinaryFeatureEntity {
    private byte[] letterImage;
    private int[][] bp01Int;
    private String scan01Str;
    private String letterImageStr;

    public byte[] getLetterImage() {
        return letterImage;
    }

    public void setLetterImage(byte[] value) {
        letterImage = value;
    }

    public int[][] getBp01Int() {
        return bp01Int;
    }

    public void setBp01Int(int[][] value) {
        bp01Int = value;
    }

    public String getScan01Str() {
        return scan01Str;
    }

    public void setScan01Str(String value) {
        scan01Str = value;
    }

    public String getLetterImageStr() {
        return letterImageStr;
    }

    public void setLetterImageStr(String value) {
        letterImageStr = value;
    }
}
