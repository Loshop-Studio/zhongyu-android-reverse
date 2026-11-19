package kotlin.text;

import java.util.regex.Matcher;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import p200x6.C6756f;

/* renamed from: kotlin.text.m */
/* loaded from: classes4.dex */
public final class C5852m implements InterfaceC5850k {

    /* renamed from: a */
    public final Matcher f9264a;

    /* renamed from: b */
    public final CharSequence f9265b;

    /* renamed from: c */
    public final C5851l f9266c = new C5851l(this);

    public C5852m(Matcher matcher, CharSequence charSequence) {
        this.f9264a = matcher;
        this.f9265b = charSequence;
    }

    /* renamed from: a */
    public final C6756f m5370a() {
        Matcher matcher = this.f9264a;
        return AbstractC5806u.m5260N(matcher.start(), matcher.end());
    }

    /* renamed from: b */
    public final C5852m m5371b() {
        Matcher matcher = this.f9264a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f9265b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        AbstractC5830k.m5329f(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new C5852m(matcher2, charSequence);
        }
        return null;
    }
}
