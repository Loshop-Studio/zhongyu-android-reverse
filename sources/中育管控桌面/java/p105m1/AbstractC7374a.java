package p105m1;

import java.util.ArrayList;

/* renamed from: m1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7374a {
    /* renamed from: a */
    public static int[] m8403a(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length != 0) {
            int i6 = 0;
            iArr2[0] = 0;
            for (int i7 = 1; i7 < iArr.length; i7++) {
                if (iArr[i7] != iArr[i7 - 1]) {
                    i6++;
                }
                iArr2[i7] = i6;
            }
        }
        return iArr2;
    }

    /* renamed from: b */
    public static int[] m8404b(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i6 = -1;
        int i7 = 0;
        while (i7 < length) {
            int i8 = iArr[i7];
            Integer numValueOf = Integer.valueOf(i8);
            if (i6 != i8) {
                arrayList.add(numValueOf);
            }
            i7++;
            i6 = i8;
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        return iArr2;
    }
}
