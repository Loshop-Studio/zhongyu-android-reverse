package p000a.p005b.p006c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p000a.p021e.C0131c;

/* renamed from: a.b.c.i */
/* loaded from: classes.dex */
public abstract class AbstractC0023i {

    /* renamed from: b */
    public static final C0131c<WeakReference<AbstractC0023i>> f63b = new C0131c<>();

    /* renamed from: c */
    public static final Object f64c = new Object();

    /* renamed from: s */
    public static void m32s(AbstractC0023i abstractC0023i) {
        synchronized (f64c) {
            Iterator<WeakReference<AbstractC0023i>> it = f63b.iterator();
            while (it.hasNext()) {
                AbstractC0023i abstractC0023i2 = it.next().get();
                if (abstractC0023i2 == abstractC0023i || abstractC0023i2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: c */
    public abstract void mo33c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public Context mo34d(Context context) {
        return context;
    }

    /* renamed from: e */
    public abstract <T extends View> T mo35e(int i);

    /* renamed from: f */
    public int mo36f() {
        return -100;
    }

    /* renamed from: g */
    public abstract MenuInflater mo37g();

    /* renamed from: h */
    public abstract AbstractC0015a mo38h();

    /* renamed from: i */
    public abstract void mo39i();

    /* renamed from: j */
    public abstract void mo40j();

    /* renamed from: k */
    public abstract void mo41k(Configuration configuration);

    /* renamed from: l */
    public abstract void mo42l(Bundle bundle);

    /* renamed from: m */
    public abstract void mo43m();

    /* renamed from: n */
    public abstract void mo44n(Bundle bundle);

    /* renamed from: o */
    public abstract void mo45o();

    /* renamed from: p */
    public abstract void mo46p(Bundle bundle);

    /* renamed from: q */
    public abstract void mo47q();

    /* renamed from: r */
    public abstract void mo48r();

    /* renamed from: t */
    public abstract boolean mo49t(int i);

    /* renamed from: u */
    public abstract void mo50u(int i);

    /* renamed from: v */
    public abstract void mo51v(View view);

    /* renamed from: w */
    public abstract void mo52w(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: x */
    public void mo53x(int i) {
    }

    /* renamed from: y */
    public abstract void mo54y(CharSequence charSequence);
}
