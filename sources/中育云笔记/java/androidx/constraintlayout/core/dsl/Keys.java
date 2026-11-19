package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class Keys {
    public void append(StringBuilder sb2, String str, int i10) {
        if (i10 != Integer.MIN_VALUE) {
            sb2.append(str);
            sb2.append(":'");
            sb2.append(i10);
            sb2.append("',\n");
        }
    }

    public String unpack(String[] strArr) {
        StringBuilder sb2 = new StringBuilder("[");
        int i10 = 0;
        while (i10 < strArr.length) {
            sb2.append(i10 == 0 ? "'" : ",'");
            sb2.append(strArr[i10]);
            sb2.append("'");
            i10++;
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void append(StringBuilder sb2, String str, String str2) {
        if (str2 != null) {
            sb2.append(str);
            sb2.append(":'");
            sb2.append(str2);
            sb2.append("',\n");
        }
    }

    public void append(StringBuilder sb2, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb2.append(str);
        sb2.append(":");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public void append(StringBuilder sb2, String str, String[] strArr) {
        if (strArr != null) {
            sb2.append(str);
            sb2.append(":");
            sb2.append(unpack(strArr));
            sb2.append(",\n");
        }
    }

    public void append(StringBuilder sb2, String str, float[] fArr) {
        if (fArr != null) {
            sb2.append(str);
            sb2.append("percentWidth:");
            sb2.append(Arrays.toString(fArr));
            sb2.append(",\n");
        }
    }
}
