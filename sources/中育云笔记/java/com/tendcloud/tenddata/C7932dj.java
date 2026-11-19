package com.tendcloud.tenddata;

import android.text.TextUtils;
import com.tendcloud.tenddata.C7902cg;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;

/* renamed from: com.tendcloud.tenddata.dj */
/* loaded from: classes5.dex */
public final class C7932dj {

    /* renamed from: a */
    private static final String f14706a = "Archimedes_p";

    /* renamed from: b */
    private static final int f14707b = 1000000000;

    /* renamed from: a */
    public static int m11713a() {
        try {
            C7902cg.b bVar = C7902cg.b.AES_DATA_LOCK;
            C7902cg.getFileLock(bVar.toString());
            int iM11693a = C7929dg.m11693a(m11717b());
            if (iM11693a == 0) {
                iM11693a = C7912cq.m11603b().nextInt(f14707b);
                m11714a(iM11693a);
            }
            C7902cg.releaseFileLock(bVar.toString());
            return iM11693a;
        } catch (Throwable unused) {
            C7902cg.releaseFileLock(C7902cg.b.AES_DATA_LOCK.toString());
            return 0;
        }
    }

    /* renamed from: b */
    private static int[][] m11717b() {
        int i10;
        try {
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            int i11 = 0;
            for (int i12 = 1; i12 < 4; i12++) {
                String strM11702a = C7931di.m11702a(f14706a + i12);
                if (!TextUtils.isEmpty(strM11702a)) {
                    arrayList.add(strM11702a);
                    i11++;
                }
            }
            int i13 = 4;
            while (true) {
                if (i13 >= 6) {
                    break;
                }
                String strM11708b = C7931di.m11708b(f14706a + i13);
                if (!TextUtils.isEmpty(strM11708b)) {
                    arrayList.add(strM11708b);
                    i11++;
                }
                i13++;
            }
            if (i11 < 4) {
                for (i10 = 6; i10 < 8; i10++) {
                    String strM11710c = C7931di.m11710c(C7843ab.f14307g.getPackageName() + i10);
                    if (!TextUtils.isEmpty(strM11710c)) {
                        arrayList.add(strM11710c);
                    }
                }
            }
            if (arrayList.size() < 4) {
                return null;
            }
            for (int i14 = 0; i14 < 4; i14++) {
                sb2.append((String) arrayList.get(i14));
            }
            return m11716a(sb2.toString(), 4, 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m11714a(int i10) {
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList(16);
        int i14 = 0;
        do {
            int[] iArr = new int[3];
            int[] iArr2 = new int[7];
            int[] iArr3 = new int[7];
            SecureRandom secureRandomM11603b = C7912cq.m11603b();
            for (int i15 = 0; i15 < 3; i15++) {
                iArr[i15] = secureRandomM11603b.nextInt(1000);
            }
            for (int i16 = 0; i16 < 7; i16++) {
                iArr2[i16] = secureRandomM11603b.nextInt(100);
            }
            int i17 = 0;
            while (true) {
                i11 = 1;
                if (i17 >= 7) {
                    break;
                }
                int i18 = iArr[0];
                int i19 = iArr2[i17];
                iArr3[i17] = (i18 * i19 * i19 * i19) + (iArr[1] * i19 * i19) + (iArr[2] * i19) + i10;
                arrayList.add(iArr2[i17] + "," + iArr3[i17] + ",");
                i17++;
            }
            if (m11715a(arrayList, i10)) {
                break;
            }
            arrayList.clear();
            i14++;
        } while (i14 < 7);
        while (true) {
            i12 = 4;
            if (i11 >= 4) {
                break;
            }
            C7931di.m11703a(f14706a + i11, (String) arrayList.get(i11 - 1));
            i11++;
        }
        while (true) {
            if (i12 >= 6) {
                break;
            }
            C7931di.m11709b(f14706a + i12, (String) arrayList.get(i12 - 1));
            i12++;
        }
        for (i13 = 6; i13 < 8; i13++) {
            C7931di.m11711c(C7843ab.f14307g.getPackageName() + i13, (String) arrayList.get(i13 - 1));
        }
    }

    /* renamed from: a */
    private static boolean m11715a(ArrayList<String> arrayList, int i10) {
        String strConcat = "";
        for (int i11 = 0; i11 < 4; i11++) {
            try {
                strConcat = strConcat.concat(arrayList.get(i11));
            } catch (Throwable unused) {
            }
        }
        return i10 == C7929dg.m11693a(m11716a(strConcat, 4, 2));
    }

    /* renamed from: a */
    private static int[][] m11716a(String str, int i10, int i11) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i11);
        String[] strArrSplit = str.split(",");
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                iArr[i13][i14] = Integer.parseInt(strArrSplit[i12]);
                i12++;
            }
        }
        return iArr;
    }
}
