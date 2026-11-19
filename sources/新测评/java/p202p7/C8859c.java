package p202p7;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: p7.c */
/* loaded from: classes5.dex */
public final class C8859c {

    /* renamed from: d */
    public static a[] f15064d;

    /* renamed from: e */
    public static final C8859c f15065e = new C8859c();

    /* renamed from: a */
    public static String[] f15061a = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};

    /* renamed from: b */
    public static String[] f15062b = {"", "十", "百", "千"};

    /* renamed from: c */
    public static String[] f15063c = {"", "万", "亿", "万亿"};

    /* renamed from: p7.c$a */
    public static final class a {

        /* renamed from: a */
        public String f15066a;

        /* renamed from: b */
        public int f15067b;

        /* renamed from: c */
        public Boolean f15068c;

        public a(String name, int i10, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(name, "name");
            this.f15066a = name;
            this.f15067b = i10;
            this.f15068c = bool;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        a aVar = new a("十", 10, bool);
        a aVar2 = new a("百", 100, bool);
        a aVar3 = new a("千", 1000, bool);
        Boolean bool2 = Boolean.TRUE;
        f15064d = new a[]{aVar, aVar2, aVar3, new a("万", 10000, bool2), new a("亿", 100000000, bool2)};
    }

    /* renamed from: a */
    public final String m14858a(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i10 == 0) {
            stringBuffer.insert(0, f15061a[0]);
        }
        boolean z9 = false;
        int i11 = 0;
        while (i10 > 0) {
            int i12 = i10 % 10000;
            if (z9) {
                stringBuffer.insert(0, f15061a[0]);
            }
            String strM14859b = m14859b(i12);
            StringBuilder sb = new StringBuilder();
            sb.append(strM14859b);
            String[] strArr = f15063c;
            sb.append(i12 != 0 ? strArr[i11] : strArr[0]);
            stringBuffer.insert(0, sb.toString());
            z9 = true;
            if (1 > i12 || 999 < i12) {
                z9 = false;
            }
            i11++;
            i10 /= 10000;
        }
        String string = stringBuffer.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "returnStr.toString()");
        return string;
    }

    /* renamed from: b */
    public final String m14859b(int i10) {
        StringBuffer stringBuffer = new StringBuffer();
        int i11 = 0;
        boolean z9 = true;
        while (i10 > 0) {
            int i12 = i10 % 10;
            if (i12 != 0) {
                StringBuffer stringBuffer2 = new StringBuffer(f15061a[i12]);
                stringBuffer2.append(f15062b[i11]);
                stringBuffer.insert(0, (CharSequence) stringBuffer2);
                z9 = false;
            } else if (i10 == 0 || !z9) {
                stringBuffer.insert(0, f15061a[i12]);
                z9 = true;
            }
            i11++;
            i10 /= 10;
        }
        String string = stringBuffer.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "returnStr.toString()");
        return string;
    }
}
