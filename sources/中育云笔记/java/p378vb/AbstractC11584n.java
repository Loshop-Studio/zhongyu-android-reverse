package p378vb;

import com.blankj.utilcode.util.SPUtils;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: vb.n */
/* loaded from: classes6.dex */
public abstract class AbstractC11584n {
    /* renamed from: a */
    public static final Integer m25504a() {
        if (m25512i().contains("BACKGROUND_COLOR_INT")) {
            return Integer.valueOf(m25512i().getInt("BACKGROUND_COLOR_INT"));
        }
        return null;
    }

    /* renamed from: b */
    public static final Float m25505b() {
        if (m25512i().contains("ERASER_SIZE_FLOAT")) {
            return Float.valueOf(m25512i().getFloat("ERASER_SIZE_FLOAT"));
        }
        return null;
    }

    /* renamed from: c */
    public static final Integer m25506c() {
        if (m25512i().contains("PEN_COLOR")) {
            return Integer.valueOf(m25512i().getInt("PEN_COLOR"));
        }
        return null;
    }

    /* renamed from: d */
    public static final Integer m25507d() {
        if (m25512i().contains("PEN_SIZE_LEVEL")) {
            return Integer.valueOf(m25512i().getInt("PEN_SIZE_LEVEL"));
        }
        return null;
    }

    /* renamed from: e */
    public static final Integer m25508e() {
        if (m25512i().contains("PEN_TYPE_LEVEL")) {
            return Integer.valueOf(m25512i().getInt("PEN_TYPE_LEVEL"));
        }
        return null;
    }

    /* renamed from: f */
    public static final Integer m25509f() {
        if (m25512i().contains("TEXT_COLOR")) {
            return Integer.valueOf(m25512i().getInt("TEXT_COLOR"));
        }
        return null;
    }

    /* renamed from: g */
    public static final Float m25510g() {
        if (m25512i().contains("TEXT_SIZE")) {
            return Float.valueOf(m25512i().getFloat("TEXT_SIZE"));
        }
        return null;
    }

    /* renamed from: h */
    public static final Boolean m25511h() {
        if (m25512i().contains("IS_TOUCHABLE")) {
            return Boolean.valueOf(m25512i().getBoolean("IS_TOUCHABLE"));
        }
        return null;
    }

    /* renamed from: i */
    public static final SPUtils m25512i() {
        SPUtils sPUtils = SPUtils.getInstance("VIEW");
        AbstractC9979u.m20293f(sPUtils, "getInstance(...)");
        return sPUtils;
    }

    /* renamed from: j */
    public static final void m25513j(Integer num) {
        if (num != null) {
            m25512i().put("BACKGROUND_COLOR_INT", num.intValue());
        }
    }

    /* renamed from: k */
    public static final void m25514k(Float f10) {
        if (f10 != null) {
            m25512i().put("ERASER_SIZE_FLOAT", f10.floatValue());
        }
    }

    /* renamed from: l */
    public static final void m25515l(Integer num) {
        if (num != null) {
            m25512i().put("PEN_COLOR", num.intValue());
        }
    }

    /* renamed from: m */
    public static final void m25516m(Integer num) {
        if (num != null) {
            m25512i().put("PEN_SIZE_LEVEL", num.intValue());
        }
    }

    /* renamed from: n */
    public static final void m25517n(Integer num) {
        if (num != null) {
            m25512i().put("PEN_TYPE_LEVEL", num.intValue());
        }
    }

    /* renamed from: o */
    public static final void m25518o(Integer num) {
        if (num != null) {
            m25512i().put("TEXT_COLOR", num.intValue());
        }
    }

    /* renamed from: p */
    public static final void m25519p(Float f10) {
        if (f10 != null) {
            m25512i().put("TEXT_SIZE", f10.floatValue());
        }
    }

    /* renamed from: q */
    public static final void m25520q(Boolean bool) {
        if (bool != null) {
            m25512i().put("IS_TOUCHABLE", bool.booleanValue());
        }
    }
}
