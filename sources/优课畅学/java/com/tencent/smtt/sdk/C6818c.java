package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.C6847d;
import java.io.IOException;
import java.util.UnknownFormatConversionException;

/* renamed from: com.tencent.smtt.sdk.c */
/* loaded from: classes4.dex */
public class C6818c {

    /* renamed from: a */
    static int f6882a = 5;

    /* renamed from: b */
    static int f6883b = 16;

    /* renamed from: c */
    static char[] f6884c = new char[16];

    /* renamed from: d */
    static String f6885d = "dex2oat-cmdline";

    /* renamed from: e */
    static long f6886e = 4096;

    /* renamed from: a */
    public static String m6198a(Context context, String str) throws IOException {
        C6847d c6847d = new C6847d(str);
        c6847d.m6283a(f6884c);
        c6847d.m6285a(f6884c[f6882a] == 1);
        c6847d.m6284a(f6886e);
        return m6199a(new String(m6200a(c6847d)));
    }

    /* renamed from: a */
    private static String m6199a(String str) {
        String[] strArrSplit = str.split(new String("\u0000"));
        int i10 = 0;
        while (i10 < strArrSplit.length) {
            int i11 = i10 + 1;
            String str2 = strArrSplit[i10];
            i10 += 2;
            String str3 = strArrSplit[i11];
            if (str2.equals(f6885d)) {
                return str3;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static char[] m6200a(C6847d c6847d) throws IOException {
        char[] cArr = new char[4];
        char[] cArr2 = new char[4];
        c6847d.m6283a(cArr);
        if (cArr[0] != 'o' || cArr[1] != 'a' || cArr[2] != 't') {
            throw new UnknownFormatConversionException(String.format("Invalid art magic %c%c%c", Character.valueOf(cArr[0]), Character.valueOf(cArr[1]), Character.valueOf(cArr[2])));
        }
        c6847d.m6283a(cArr2);
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        if (cArr2[1] <= '4') {
            c6847d.m6282a();
            c6847d.m6282a();
            c6847d.m6282a();
        }
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        c6847d.m6282a();
        char[] cArr3 = new char[c6847d.m6282a()];
        c6847d.m6283a(cArr3);
        return cArr3;
    }
}
