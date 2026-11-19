package p082e3;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p014b3.C1034c;
import p014b3.C1037f;

/* renamed from: e3.k */
/* loaded from: classes.dex */
public final class C2485k {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final InterfaceC2482h m8283c(Matcher matcher, int i4, CharSequence charSequence) {
        if (matcher.find(i4)) {
            return new C2483i(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final C1034c m8284d(MatchResult matchResult, int i4) {
        return C1037f.m4828i(matchResult.start(i4), matchResult.end(i4));
    }
}
