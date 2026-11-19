package p297y;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.widget.ImageView;
import androidx.compose.p012ui.graphics.AbstractC2682e1;
import androidx.lifecycle.Lifecycle;
import coil3.AbstractC5313d;
import coil3.C5304c;
import coil3.target.ImageViewTarget;
import coil3.util.AbstractC5349d;
import kotlin.jvm.functions.Function1;
import p079d0.InterfaceC7734c;
import p090e0.AbstractC7805c;
import p151k.AbstractC8243n;
import p151k.InterfaceC8239j;
import p297y.C9924e;

/* renamed from: y.i */
/* loaded from: classes3.dex */
public abstract class AbstractC9928i {

    /* renamed from: a */
    public static final C5304c.c f17842a = new C5304c.c(InterfaceC7734c.a.f13036b);

    /* renamed from: b */
    public static final C5304c.c f17843b = new C5304c.c(AbstractC5349d.m2941a());

    /* renamed from: c */
    public static final C5304c.c f17844c = new C5304c.c(AbstractC5349d.m2943c());

    /* renamed from: d */
    public static final C5304c.c f17845d;

    /* renamed from: e */
    public static final C5304c.c f17846e;

    /* renamed from: f */
    public static final C5304c.c f17847f;

    /* renamed from: g */
    public static final C5304c.c f17848g;

    static {
        Boolean bool = Boolean.TRUE;
        f17845d = new C5304c.c(bool);
        f17846e = new C5304c.c(null);
        f17847f = new C5304c.c(bool);
        f17848g = new C5304c.c(Boolean.FALSE);
    }

    /* renamed from: c */
    public static final C9924e.a m17090c(C9924e.a aVar, final int i9) {
        return aVar.m17048f(new Function1() { // from class: y.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC9928i.m17091d(i9, (C9924e) obj);
            }
        });
    }

    /* renamed from: d */
    public static final InterfaceC8239j m17091d(int i9, C9924e c9924e) {
        return AbstractC8243n.m13270c(AbstractC7805c.m12181c(c9924e.m17019c(), i9));
    }

    /* renamed from: e */
    public static final boolean m17092e(C9924e c9924e) {
        return ((Boolean) AbstractC5313d.m2686a(c9924e, f17847f)).booleanValue();
    }

    /* renamed from: f */
    public static final C5304c.c m17093f(C5304c.c.a aVar) {
        return f17848g;
    }

    /* renamed from: g */
    public static final boolean m17094g(C9924e c9924e) {
        return ((Boolean) AbstractC5313d.m2686a(c9924e, f17848g)).booleanValue();
    }

    /* renamed from: h */
    public static final boolean m17095h(C9932m c9932m) {
        return ((Boolean) AbstractC5313d.m2687b(c9932m, f17848g)).booleanValue();
    }

    /* renamed from: i */
    public static final Bitmap.Config m17096i(C9924e c9924e) {
        return (Bitmap.Config) AbstractC5313d.m2686a(c9924e, f17843b);
    }

    /* renamed from: j */
    public static final Bitmap.Config m17097j(C9932m c9932m) {
        return (Bitmap.Config) AbstractC5313d.m2687b(c9932m, f17843b);
    }

    /* renamed from: k */
    public static final C5304c.c m17098k(C5304c.c.a aVar) {
        return f17843b;
    }

    /* renamed from: l */
    public static final ColorSpace m17099l(C9932m c9932m) {
        return AbstractC2682e1.m1076a(AbstractC5313d.m2687b(c9932m, f17844c));
    }

    /* renamed from: m */
    public static final Lifecycle m17100m(C9924e c9924e) {
        return (Lifecycle) AbstractC5313d.m2686a(c9924e, f17846e);
    }

    /* renamed from: n */
    public static final boolean m17101n(C9932m c9932m) {
        return ((Boolean) AbstractC5313d.m2687b(c9932m, f17845d)).booleanValue();
    }

    /* renamed from: o */
    public static final InterfaceC7734c.a m17102o(C9924e c9924e) {
        return (InterfaceC7734c.a) AbstractC5313d.m2686a(c9924e, f17842a);
    }

    /* renamed from: p */
    public static final C9924e.a m17103p(C9924e.a aVar, final int i9) {
        return aVar.m17049g(new Function1() { // from class: y.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC9928i.m17104q(i9, (C9924e) obj);
            }
        });
    }

    /* renamed from: q */
    public static final InterfaceC8239j m17104q(int i9, C9924e c9924e) {
        return AbstractC8243n.m13270c(AbstractC7805c.m12181c(c9924e.m17019c(), i9));
    }

    /* renamed from: r */
    public static final C9924e.a m17105r(C9924e.a aVar, ImageView imageView) {
        return aVar.m17053k(new ImageViewTarget(imageView));
    }
}
