package p168e.p169q;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p160d.p161e.C1001g;
import p160d.p162f.p164b.C1011d;
import p160d.p167i.C1022c;

/* renamed from: e.q.b */
/* loaded from: classes.dex */
public final class C1045b {

    /* renamed from: a */
    public static final byte[] f5576a;

    /* renamed from: b */
    public static final C1022c f5577b;

    /* renamed from: c */
    public static final String f5578c;

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e2, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p168e.p169q.C1045b.<clinit>():void");
    }

    /* renamed from: a */
    public static final String m2838a(String str, Object... objArr) {
        C1011d.m2809e(str, "format");
        C1011d.m2809e(objArr, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        C1011d.m2808d(str2, "java.lang.String.format(locale, format, *args)");
        return str2;
    }

    @SafeVarargs
    /* renamed from: b */
    public static final <T> List<T> m2839b(T... tArr) {
        List listAsList;
        C1011d.m2809e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        C1011d.m2809e(objArrCopyOf, "elements");
        if (objArrCopyOf.length > 0) {
            C1011d.m2809e(objArrCopyOf, "$this$asList");
            listAsList = Arrays.asList(objArrCopyOf);
            C1011d.m2808d(listAsList, "ArraysUtilJVM.asList(this)");
        } else {
            listAsList = C1001g.f5478b;
        }
        List<T> listUnmodifiableList = Collections.unmodifiableList(listAsList);
        C1011d.m2808d(listUnmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return listUnmodifiableList;
    }
}
