package p145r1;

import java.util.ArrayList;

/* renamed from: r1.a */
/* loaded from: classes.dex */
public class C3026a {
    /* renamed from: a */
    public static int[] m10160a(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length == 0) {
            return iArr2;
        }
        int i4 = 0;
        iArr2[0] = 0;
        for (int i5 = 1; i5 < iArr.length; i5++) {
            if (iArr[i5] != iArr[i5 - 1]) {
                i4++;
            }
            iArr2[i5] = i4;
        }
        return iArr2;
    }

    /* renamed from: b */
    public static int[] m10161b(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (int i4 : iArr) {
            Integer numValueOf = Integer.valueOf(i4);
            if (iIntValue != numValueOf.intValue()) {
                arrayList.add(numValueOf);
            }
            iIntValue = numValueOf.intValue();
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }
}
