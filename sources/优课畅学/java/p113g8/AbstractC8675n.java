package p113g8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p077d8.AbstractC8323h;
import p077d8.C8321f;

/* renamed from: g8.n */
/* loaded from: classes5.dex */
public abstract class AbstractC8675n {
    /* renamed from: e */
    public static final InterfaceC8672k m14069e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new C8673l(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: f */
    public static final InterfaceC8672k m14070f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C8673l(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: g */
    public static final C8321f m14071g(MatchResult matchResult) {
        return AbstractC8323h.m13525t(matchResult.start(), matchResult.end());
    }

    /* renamed from: h */
    public static final C8321f m14072h(MatchResult matchResult, int i10) {
        return AbstractC8323h.m13525t(matchResult.start(i10), matchResult.end(i10));
    }
}
