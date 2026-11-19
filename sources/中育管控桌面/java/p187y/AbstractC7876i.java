package p187y;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import androidx.compose.p009ui.graphics.AbstractC2019e1;
import androidx.lifecycle.Lifecycle;
import coil3.AbstractC4559d;
import coil3.C4550c;
import coil3.util.AbstractC4595d;
import kotlin.jvm.functions.Function1;
import p015b0.InterfaceC4397c;
import p023c0.AbstractC4458c;
import p087k.AbstractC6616o;
import p087k.InterfaceC6611j;
import p187y.C7872e;

/* renamed from: y.i */
/* loaded from: classes3.dex */
public abstract class AbstractC7876i {

    /* renamed from: a */
    public static final C4550c.c f10581a = new C4550c.c(InterfaceC4397c.a.f1240b);

    /* renamed from: b */
    public static final C4550c.c f10582b = new C4550c.c(AbstractC4595d.m2050a());

    /* renamed from: c */
    public static final C4550c.c f10583c = new C4550c.c(AbstractC4595d.m2052c());

    /* renamed from: d */
    public static final C4550c.c f10584d;

    /* renamed from: e */
    public static final C4550c.c f10585e;

    /* renamed from: f */
    public static final C4550c.c f10586f;

    /* renamed from: g */
    public static final C4550c.c f10587g;

    static {
        Boolean bool = Boolean.TRUE;
        f10584d = new C4550c.c(bool);
        f10585e = new C4550c.c(null);
        f10586f = new C4550c.c(bool);
        f10587g = new C4550c.c(Boolean.FALSE);
    }

    /* renamed from: c */
    public static final C7872e.a m9644c(C7872e.a aVar, final int i6) {
        return aVar.m9602e(new Function1() { // from class: y.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC7876i.m9645d(i6, (C7872e) obj);
            }
        });
    }

    /* renamed from: d */
    public static final InterfaceC6611j m9645d(int i6, C7872e c7872e) {
        return AbstractC6616o.m7570c(AbstractC4458c.m1530c(c7872e.m9574c(), i6));
    }

    /* renamed from: e */
    public static final boolean m9646e(C7872e c7872e) {
        return ((Boolean) AbstractC4559d.m1786a(c7872e, f10586f)).booleanValue();
    }

    /* renamed from: f */
    public static final C4550c.c m9647f(C4550c.c.a aVar) {
        return f10587g;
    }

    /* renamed from: g */
    public static final boolean m9648g(C7872e c7872e) {
        return ((Boolean) AbstractC4559d.m1786a(c7872e, f10587g)).booleanValue();
    }

    /* renamed from: h */
    public static final boolean m9649h(C7880m c7880m) {
        return ((Boolean) AbstractC4559d.m1787b(c7880m, f10587g)).booleanValue();
    }

    /* renamed from: i */
    public static final Bitmap.Config m9650i(C7872e c7872e) {
        return (Bitmap.Config) AbstractC4559d.m1786a(c7872e, f10582b);
    }

    /* renamed from: j */
    public static final Bitmap.Config m9651j(C7880m c7880m) {
        return (Bitmap.Config) AbstractC4559d.m1787b(c7880m, f10582b);
    }

    /* renamed from: k */
    public static final C4550c.c m9652k(C4550c.c.a aVar) {
        return f10582b;
    }

    /* renamed from: l */
    public static final ColorSpace m9653l(C7880m c7880m) {
        return AbstractC2019e1.m360a(AbstractC4559d.m1787b(c7880m, f10583c));
    }

    /* renamed from: m */
    public static final Lifecycle m9654m(C7872e c7872e) {
        return (Lifecycle) AbstractC4559d.m1786a(c7872e, f10585e);
    }

    /* renamed from: n */
    public static final boolean m9655n(C7880m c7880m) {
        return ((Boolean) AbstractC4559d.m1787b(c7880m, f10584d)).booleanValue();
    }

    /* renamed from: o */
    public static final InterfaceC4397c.a m9656o(C7872e c7872e) {
        return (InterfaceC4397c.a) AbstractC4559d.m1786a(c7872e, f10581a);
    }

    /* renamed from: p */
    public static final C7872e.a m9657p(C7872e.a aVar, final int i6) {
        return aVar.m9603f(new Function1() { // from class: y.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC7876i.m9658q(i6, (C7872e) obj);
            }
        });
    }

    /* renamed from: q */
    public static final InterfaceC6611j m9658q(int i6, C7872e c7872e) {
        return AbstractC6616o.m7570c(AbstractC4458c.m1530c(c7872e.m9574c(), i6));
    }
}
