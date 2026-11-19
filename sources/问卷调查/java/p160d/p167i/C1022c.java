package p160d.p167i;

import java.io.Serializable;
import java.util.regex.Pattern;
import p160d.p162f.p164b.C1011d;

/* renamed from: d.i.c */
/* loaded from: classes.dex */
public final class C1022c implements Serializable {

    /* renamed from: b */
    public final Pattern f5506b;

    public C1022c(String str) {
        C1011d.m2809e(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        C1011d.m2808d(patternCompile, "Pattern.compile(pattern)");
        C1011d.m2809e(patternCompile, "nativePattern");
        this.f5506b = patternCompile;
    }

    public String toString() {
        String string = this.f5506b.toString();
        C1011d.m2808d(string, "nativePattern.toString()");
        return string;
    }
}
