package p090e0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: e0.q */
/* loaded from: classes3.dex */
public final class C7819q {

    /* renamed from: a */
    public static final C7819q f13131a = new C7819q();

    /* renamed from: a */
    public final String m12214a(String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = (String) AbstractC7820r.f13132a.get(lowerCase);
        return str2 == null ? AbstractC7821s.m12217a(lowerCase) : str2;
    }

    /* renamed from: b */
    public final String m12215b(String str) {
        if (StringsKt.isBlank(str)) {
            return null;
        }
        return m12214a(StringsKt.substringAfterLast(StringsKt.substringAfterLast$default(StringsKt.substringBeforeLast$default(StringsKt.substringBeforeLast$default(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }
}
