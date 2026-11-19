package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class Keys {
    public void append(StringBuilder sb, String str, int i6) {
        if (i6 != Integer.MIN_VALUE) {
            sb.append(str);
            sb.append(":'");
            sb.append(i6);
            sb.append("',\n");
        }
    }

    public String unpack(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        int i6 = 0;
        while (i6 < strArr.length) {
            sb.append(i6 == 0 ? "'" : ",'");
            sb.append(strArr[i6]);
            sb.append("'");
            i6++;
        }
        sb.append("]");
        return sb.toString();
    }

    public void append(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            sb.append(":'");
            sb.append(str2);
            sb.append("',\n");
        }
    }

    public void append(StringBuilder sb, String str, float f6) {
        if (Float.isNaN(f6)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f6);
        sb.append(",\n");
    }

    public void append(StringBuilder sb, String str, String[] strArr) {
        if (strArr != null) {
            sb.append(str);
            sb.append(":");
            sb.append(unpack(strArr));
            sb.append(",\n");
        }
    }

    public void append(StringBuilder sb, String str, float[] fArr) {
        if (fArr != null) {
            sb.append(str);
            sb.append("percentWidth:");
            sb.append(Arrays.toString(fArr));
            sb.append(",\n");
        }
    }
}
