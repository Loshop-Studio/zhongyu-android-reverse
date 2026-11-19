package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
class ExifTag {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    public ExifTag(String str, int i, int i8) {
        this.name = str;
        this.number = i;
        this.primaryFormat = i8;
        this.secondaryFormat = -1;
    }

    public boolean isFormatCompatible(int i) {
        int i8;
        int i9 = this.primaryFormat;
        if (i9 == 7 || i == 7 || i9 == i || (i8 = this.secondaryFormat) == i) {
            return true;
        }
        if ((i9 == 4 || i8 == 4) && i == 3) {
            return true;
        }
        if ((i9 == 9 || i8 == 9) && i == 8) {
            return true;
        }
        return (i9 == 12 || i8 == 12) && i == 11;
    }

    public ExifTag(String str, int i, int i8, int i9) {
        this.name = str;
        this.number = i;
        this.primaryFormat = i8;
        this.secondaryFormat = i9;
    }
}
