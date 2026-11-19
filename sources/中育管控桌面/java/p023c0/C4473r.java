package p023c0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: c0.r */
/* loaded from: classes3.dex */
public final class C4473r {

    /* renamed from: a */
    public static final C4473r f1339a = new C4473r();

    /* renamed from: a */
    public final String m1565a(String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = (String) AbstractC4474s.f1340a.get(lowerCase);
        return str2 == null ? AbstractC4475t.m1568a(lowerCase) : str2;
    }

    /* renamed from: b */
    public final String m1566b(String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        return m1565a(StringsKt.substringAfterLast(StringsKt.substringAfterLast$default(StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }
}
