package p000a.p052k.p053b;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.widget.imageview.preview.p159ui.PreviewActivity;
import p000a.p052k.p053b.AbstractC0319l0;
import p000a.p057m.AbstractC0355d;
import p000a.p068t.p069a.AbstractC0445a;
import p070b.p113c.p114a.p116e.p128f.p133c.p136e.C0842h;

@Deprecated
/* renamed from: a.k.b.h0 */
/* loaded from: classes.dex */
public abstract class AbstractC0311h0 extends AbstractC0445a {

    /* renamed from: c */
    public final AbstractC0301c0 f1880c;

    /* renamed from: g */
    public boolean f1884g;

    /* renamed from: e */
    public AbstractC0319l0 f1882e = null;

    /* renamed from: f */
    public ComponentCallbacksC0320m f1883f = null;

    /* renamed from: d */
    public final int f1881d = 0;

    @Deprecated
    public AbstractC0311h0(AbstractC0301c0 abstractC0301c0) {
        this.f1880c = abstractC0301c0;
    }

    /* renamed from: j */
    public static String m1076j(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: b */
    public void mo1077b(ViewGroup viewGroup) {
        AbstractC0319l0 abstractC0319l0 = this.f1882e;
        if (abstractC0319l0 != null) {
            if (!this.f1884g) {
                try {
                    this.f1884g = true;
                    C0294a c0294a = (C0294a) abstractC0319l0;
                    if (c0294a.f1939g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c0294a.f1762p.m1009D(c0294a, true);
                } finally {
                    this.f1884g = false;
                }
            }
            this.f1882e = null;
        }
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: d */
    public Object mo1078d(ViewGroup viewGroup, int i) {
        if (this.f1882e == null) {
            this.f1882e = new C0294a(this.f1880c);
        }
        long j = i;
        C0842h c0842hM1014I = this.f1880c.m1014I(m1076j(viewGroup.getId(), j));
        if (c0842hM1014I != null) {
            this.f1882e.m1129b(new AbstractC0319l0.a(7, c0842hM1014I));
        } else {
            c0842hM1014I = PreviewActivity.this.f5224r.get(i);
            this.f1882e.mo974c(viewGroup.getId(), c0842hM1014I, m1076j(viewGroup.getId(), j), 1);
        }
        if (c0842hM1014I != this.f1883f) {
            c0842hM1014I.m1181s0(false);
            if (this.f1881d == 1) {
                this.f1882e.mo975d(c0842hM1014I, AbstractC0355d.b.STARTED);
            } else {
                c0842hM1014I.mo1187v0(false);
            }
        }
        return c0842hM1014I;
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: e */
    public boolean mo1079e(View view, Object obj) {
        return ((ComponentCallbacksC0320m) obj).f1963G == view;
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: f */
    public void mo1080f(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: g */
    public Parcelable mo1081g() {
        return null;
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: h */
    public void mo1082h(ViewGroup viewGroup, int i, Object obj) {
        ComponentCallbacksC0320m componentCallbacksC0320m = (ComponentCallbacksC0320m) obj;
        ComponentCallbacksC0320m componentCallbacksC0320m2 = this.f1883f;
        if (componentCallbacksC0320m != componentCallbacksC0320m2) {
            if (componentCallbacksC0320m2 != null) {
                componentCallbacksC0320m2.m1181s0(false);
                if (this.f1881d == 1) {
                    if (this.f1882e == null) {
                        this.f1882e = new C0294a(this.f1880c);
                    }
                    this.f1882e.mo975d(this.f1883f, AbstractC0355d.b.STARTED);
                } else {
                    this.f1883f.mo1187v0(false);
                }
            }
            componentCallbacksC0320m.m1181s0(true);
            if (this.f1881d == 1) {
                if (this.f1882e == null) {
                    this.f1882e = new C0294a(this.f1880c);
                }
                this.f1882e.mo975d(componentCallbacksC0320m, AbstractC0355d.b.RESUMED);
            } else {
                componentCallbacksC0320m.mo1187v0(true);
            }
            this.f1883f = componentCallbacksC0320m;
        }
    }

    @Override // p000a.p068t.p069a.AbstractC0445a
    /* renamed from: i */
    public void mo1083i(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
