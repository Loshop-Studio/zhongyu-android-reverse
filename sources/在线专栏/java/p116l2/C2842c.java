package p116l2;

import android.util.Base64;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p082e3.C2478d;
import p082e3.C2498x;

/* renamed from: l2.c */
/* loaded from: classes.dex */
public final class C2842c {

    /* renamed from: a */
    @NotNull
    public static final C2842c f10943a = new C2842c();

    private C2842c() {
    }

    @NotNull
    /* renamed from: a */
    public final String m9539a(@NotNull String special) {
        C2769l.m9241e(special, "special");
        String strSubstring = special.substring(0, special.length() - 32);
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] third = Base64.decode(C2498x.m8417K0(strSubstring).toString(), 0);
        C2769l.m9240d(third, "third");
        return new String(third, C2478d.f10082b);
    }
}
