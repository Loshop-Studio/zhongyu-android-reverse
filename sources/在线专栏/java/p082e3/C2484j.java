package p082e3;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: e3.j */
/* loaded from: classes.dex */
public final class C2484j implements Serializable {

    /* renamed from: b */
    @NotNull
    public static final a f10107b = new a(null);

    /* renamed from: a */
    @NotNull
    private final Pattern f10108a;

    /* renamed from: e3.j$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }
    }

    public C2484j(@NotNull Pattern nativePattern) {
        C2769l.m9241e(nativePattern, "nativePattern");
        this.f10108a = nativePattern;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2482h m8277b(C2484j c2484j, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return c2484j.m8278a(charSequence, i4);
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC2482h m8278a(@NotNull CharSequence input, int i4) {
        C2769l.m9241e(input, "input");
        Matcher matcher = this.f10108a.matcher(input);
        C2769l.m9240d(matcher, "nativePattern.matcher(input)");
        return C2485k.m8283c(matcher, i4, input);
    }

    /* renamed from: c */
    public final boolean m8279c(@NotNull CharSequence input) {
        C2769l.m9241e(input, "input");
        return this.f10108a.matcher(input).matches();
    }

    @NotNull
    /* renamed from: d */
    public final String m8280d(@NotNull CharSequence input, @NotNull String replacement) {
        C2769l.m9241e(input, "input");
        C2769l.m9241e(replacement, "replacement");
        String strReplaceAll = this.f10108a.matcher(input).replaceAll(replacement);
        C2769l.m9240d(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    @NotNull
    public String toString() {
        String string = this.f10108a.toString();
        C2769l.m9240d(string, "nativePattern.toString()");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2484j(@NotNull String pattern) {
        C2769l.m9241e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        C2769l.m9240d(patternCompile, "compile(pattern)");
        this(patternCompile);
    }
}
