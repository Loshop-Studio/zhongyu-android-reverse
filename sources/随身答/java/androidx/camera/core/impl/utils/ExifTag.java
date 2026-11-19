package androidx.camera.core.impl.utils;

/* loaded from: classes.dex */
class ExifTag {
    public final String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    public ExifTag(String str, int i9, int i10) {
        this.name = str;
        this.number = i9;
        this.primaryFormat = i10;
        this.secondaryFormat = -1;
    }

    public boolean isFormatCompatible(int i9) {
        int i10;
        int i11 = this.primaryFormat;
        if (i11 == 7 || i9 == 7 || i11 == i9 || (i10 = this.secondaryFormat) == i9) {
            return true;
        }
        if ((i11 == 4 || i10 == 4) && i9 == 3) {
            return true;
        }
        if ((i11 == 9 || i10 == 9) && i9 == 8) {
            return true;
        }
        return (i11 == 12 || i10 == 12) && i9 == 11;
    }

    public ExifTag(String str, int i9, int i10, int i11) {
        this.name = str;
        this.number = i9;
        this.primaryFormat = i10;
        this.secondaryFormat = i11;
    }
}
