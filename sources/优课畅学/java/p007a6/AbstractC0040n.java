package p007a6;

import com.blankj.utilcode.util.C5389z;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: a6.n */
/* loaded from: classes5.dex */
public abstract class AbstractC0040n {
    /* renamed from: a */
    public static final Integer m97a() {
        if (m105i().m2688a("BACKGROUND_COLOR_INT")) {
            return Integer.valueOf(m105i().m2693h("BACKGROUND_COLOR_INT"));
        }
        return null;
    }

    /* renamed from: b */
    public static final Float m98b() {
        if (m105i().m2688a("ERASER_SIZE_FLOAT")) {
            return Float.valueOf(m105i().m2691d("ERASER_SIZE_FLOAT"));
        }
        return null;
    }

    /* renamed from: c */
    public static final Integer m99c() {
        if (m105i().m2688a("PEN_COLOR")) {
            return Integer.valueOf(m105i().m2693h("PEN_COLOR"));
        }
        return null;
    }

    /* renamed from: d */
    public static final Integer m100d() {
        if (m105i().m2688a("PEN_SIZE_LEVEL")) {
            return Integer.valueOf(m105i().m2693h("PEN_SIZE_LEVEL"));
        }
        return null;
    }

    /* renamed from: e */
    public static final Integer m101e() {
        if (m105i().m2688a("PEN_TYPE_LEVEL")) {
            return Integer.valueOf(m105i().m2693h("PEN_TYPE_LEVEL"));
        }
        return null;
    }

    /* renamed from: f */
    public static final Integer m102f() {
        if (m105i().m2688a("TEXT_COLOR")) {
            return Integer.valueOf(m105i().m2693h("TEXT_COLOR"));
        }
        return null;
    }

    /* renamed from: g */
    public static final Float m103g() {
        if (m105i().m2688a("TEXT_SIZE")) {
            return Float.valueOf(m105i().m2691d("TEXT_SIZE"));
        }
        return null;
    }

    /* renamed from: h */
    public static final Boolean m104h() {
        if (m105i().m2688a("IS_TOUCHABLE")) {
            return Boolean.valueOf(m105i().m2689b("IS_TOUCHABLE"));
        }
        return null;
    }

    /* renamed from: i */
    public static final C5389z m105i() {
        C5389z c5389zM2685f = C5389z.m2685f("VIEW");
        AbstractC9133u.m16132f(c5389zM2685f, "getInstance(...)");
        return c5389zM2685f;
    }

    /* renamed from: j */
    public static final void m106j(Integer num) {
        if (num != null) {
            m105i().m2701q("BACKGROUND_COLOR_INT", num.intValue());
        }
    }

    /* renamed from: k */
    public static final void m107k(Float f10) {
        if (f10 != null) {
            m105i().m2699o("ERASER_SIZE_FLOAT", f10.floatValue());
        }
    }

    /* renamed from: l */
    public static final void m108l(Integer num) {
        if (num != null) {
            m105i().m2701q("PEN_COLOR", num.intValue());
        }
    }

    /* renamed from: m */
    public static final void m109m(Integer num) {
        if (num != null) {
            m105i().m2701q("PEN_SIZE_LEVEL", num.intValue());
        }
    }

    /* renamed from: n */
    public static final void m110n(Integer num) {
        if (num != null) {
            m105i().m2701q("PEN_TYPE_LEVEL", num.intValue());
        }
    }

    /* renamed from: o */
    public static final void m111o(Integer num) {
        if (num != null) {
            m105i().m2701q("TEXT_COLOR", num.intValue());
        }
    }

    /* renamed from: p */
    public static final void m112p(Float f10) {
        if (f10 != null) {
            m105i().m2699o("TEXT_SIZE", f10.floatValue());
        }
    }

    /* renamed from: q */
    public static final void m113q(Boolean bool) {
        if (bool != null) {
            m105i().m2705u("IS_TOUCHABLE", bool.booleanValue());
        }
    }
}
