package p030c0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: c0.r */
/* loaded from: classes3.dex */
public final class C5093r {

    /* renamed from: a */
    public static final C5093r f2659a = new C5093r();

    /* renamed from: a */
    public final String m2707a(String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = (String) AbstractC5094s.f2660a.get(lowerCase);
        return str2 == null ? AbstractC5095t.m2710a(lowerCase) : str2;
    }

    /* renamed from: b */
    public final String m2708b(String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        return m2707a(StringsKt.substringAfterLast(StringsKt.substringAfterLast$default(StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }
}
