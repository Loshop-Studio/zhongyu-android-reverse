package p380w;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.compose.p014ui.graphics.AbstractC2753e1;
import androidx.lifecycle.Lifecycle;
import coil3.AbstractC5455d;
import coil3.C5454c;
import coil3.target.ImageViewTarget;
import coil3.util.AbstractC5491d;
import p001a0.AbstractC0006c;
import p181hd.InterfaceC9540l;
import p212k.AbstractC9761o;
import p212k.InterfaceC9756j;
import p380w.C11627g;
import p427z.InterfaceC11950c;

/* renamed from: w.j */
/* loaded from: classes3.dex */
public abstract class AbstractC11630j {

    /* renamed from: a */
    public static final C5454c.c f27617a = new C5454c.c(InterfaceC11950c.a.f28306b);

    /* renamed from: b */
    public static final C5454c.c f27618b = new C5454c.c(AbstractC5491d.m3318a());

    /* renamed from: c */
    public static final C5454c.c f27619c = new C5454c.c(AbstractC5491d.m3320c());

    /* renamed from: d */
    public static final C5454c.c f27620d;

    /* renamed from: e */
    public static final C5454c.c f27621e;

    /* renamed from: f */
    public static final C5454c.c f27622f;

    /* renamed from: g */
    public static final C5454c.c f27623g;

    static {
        Boolean bool = Boolean.TRUE;
        f27620d = new C5454c.c(bool);
        f27621e = new C5454c.c(null);
        f27622f = new C5454c.c(bool);
        f27623g = new C5454c.c(Boolean.FALSE);
    }

    /* renamed from: b */
    public static final C11627g.a m25725b(C11627g.a aVar, final int i10) {
        return aVar.m25679g(new InterfaceC9540l() { // from class: w.i
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return AbstractC11630j.m25727d(i10, (C11627g) obj);
            }
        });
    }

    /* renamed from: c */
    public static final C11627g.a m25726c(C11627g.a aVar, Drawable drawable) {
        return aVar.m25680h(drawable != null ? AbstractC9761o.m19680c(drawable) : null);
    }

    /* renamed from: d */
    public static final InterfaceC9756j m25727d(int i10, C11627g c11627g) {
        return AbstractC9761o.m19680c(AbstractC0006c.m14c(c11627g.m25647c(), i10));
    }

    /* renamed from: e */
    public static final boolean m25728e(C11627g c11627g) {
        return ((Boolean) AbstractC5455d.m3053a(c11627g, f27622f)).booleanValue();
    }

    /* renamed from: f */
    public static final C5454c.c m25729f(C5454c.c.a aVar) {
        return f27623g;
    }

    /* renamed from: g */
    public static final boolean m25730g(C11627g c11627g) {
        return ((Boolean) AbstractC5455d.m3053a(c11627g, f27623g)).booleanValue();
    }

    /* renamed from: h */
    public static final boolean m25731h(C11634n c11634n) {
        return ((Boolean) AbstractC5455d.m3054b(c11634n, f27623g)).booleanValue();
    }

    /* renamed from: i */
    public static final Bitmap.Config m25732i(C11627g c11627g) {
        return (Bitmap.Config) AbstractC5455d.m3053a(c11627g, f27618b);
    }

    /* renamed from: j */
    public static final Bitmap.Config m25733j(C11634n c11634n) {
        return (Bitmap.Config) AbstractC5455d.m3054b(c11634n, f27618b);
    }

    /* renamed from: k */
    public static final C5454c.c m25734k(C5454c.c.a aVar) {
        return f27618b;
    }

    /* renamed from: l */
    public static final ColorSpace m25735l(C11634n c11634n) {
        return AbstractC2753e1.m1148a(AbstractC5455d.m3054b(c11634n, f27619c));
    }

    /* renamed from: m */
    public static final Lifecycle m25736m(C11627g c11627g) {
        return (Lifecycle) AbstractC5455d.m3053a(c11627g, f27621e);
    }

    /* renamed from: n */
    public static final boolean m25737n(C11634n c11634n) {
        return ((Boolean) AbstractC5455d.m3054b(c11634n, f27620d)).booleanValue();
    }

    /* renamed from: o */
    public static final InterfaceC11950c.a m25738o(C11627g c11627g) {
        return (InterfaceC11950c.a) AbstractC5455d.m3053a(c11627g, f27617a);
    }

    /* renamed from: p */
    public static final C11627g.a m25739p(C11627g.a aVar, Drawable drawable) {
        return aVar.m25685n(drawable != null ? AbstractC9761o.m19680c(drawable) : null);
    }

    /* renamed from: q */
    public static final C11627g.a m25740q(C11627g.a aVar, ImageView imageView) {
        return aVar.m25689s(new ImageViewTarget(imageView));
    }
}
