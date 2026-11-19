package p310qd;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p265nd.AbstractC10410o;
import p265nd.C10405j;

/* renamed from: qd.n */
/* loaded from: classes6.dex */
public abstract class AbstractC10807n {
    /* renamed from: e */
    public static final InterfaceC10804k m23204e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new C10806m(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: f */
    public static final InterfaceC10804k m23205f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C10806m(matcher, charSequence);
        }
        return null;
    }

    /* renamed from: g */
    public static final C10405j m23206g(MatchResult matchResult) {
        return AbstractC10410o.m21768u(matchResult.start(), matchResult.end());
    }

    /* renamed from: h */
    public static final C10405j m23207h(MatchResult matchResult, int i10) {
        return AbstractC10410o.m21768u(matchResult.start(i10), matchResult.end(i10));
    }
}
