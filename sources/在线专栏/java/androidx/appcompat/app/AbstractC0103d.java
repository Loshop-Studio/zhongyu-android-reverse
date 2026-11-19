package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0248b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p088g.AbstractC2620b;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public abstract class AbstractC0103d {

    /* renamed from: a */
    private static int f339a = -100;

    /* renamed from: b */
    private static final C0248b<WeakReference<AbstractC0103d>> f340b = new C0248b<>();

    /* renamed from: c */
    private static final Object f341c = new Object();

    AbstractC0103d() {
    }

    /* renamed from: E */
    public static void m272E(int i4) {
        if (i4 != -1 && i4 != 0 && i4 != 1 && i4 != 2 && i4 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f339a != i4) {
            f339a = i4;
            m274d();
        }
    }

    /* renamed from: a */
    static void m273a(AbstractC0103d abstractC0103d) {
        synchronized (f341c) {
            m279z(abstractC0103d);
            f340b.add(new WeakReference<>(abstractC0103d));
        }
    }

    /* renamed from: d */
    private static void m274d() {
        synchronized (f341c) {
            Iterator<WeakReference<AbstractC0103d>> it = f340b.iterator();
            while (it.hasNext()) {
                AbstractC0103d abstractC0103d = it.next().get();
                if (abstractC0103d != null) {
                    abstractC0103d.mo213c();
                }
            }
        }
    }

    /* renamed from: g */
    public static AbstractC0103d m275g(Activity activity, InterfaceC0102c interfaceC0102c) {
        return new AppCompatDelegateImpl(activity, interfaceC0102c);
    }

    /* renamed from: h */
    public static AbstractC0103d m276h(Dialog dialog, InterfaceC0102c interfaceC0102c) {
        return new AppCompatDelegateImpl(dialog, interfaceC0102c);
    }

    /* renamed from: j */
    public static int m277j() {
        return f339a;
    }

    /* renamed from: y */
    static void m278y(AbstractC0103d abstractC0103d) {
        synchronized (f341c) {
            m279z(abstractC0103d);
        }
    }

    /* renamed from: z */
    private static void m279z(AbstractC0103d abstractC0103d) {
        synchronized (f341c) {
            Iterator<WeakReference<AbstractC0103d>> it = f340b.iterator();
            while (it.hasNext()) {
                AbstractC0103d abstractC0103d2 = it.next().get();
                if (abstractC0103d2 == abstractC0103d || abstractC0103d2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract boolean mo190A(int i4);

    /* renamed from: B */
    public abstract void mo191B(int i4);

    /* renamed from: C */
    public abstract void mo193C(View view);

    /* renamed from: D */
    public abstract void mo194D(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: F */
    public abstract void mo195F(Toolbar toolbar);

    /* renamed from: G */
    public void mo196G(int i4) {
    }

    /* renamed from: H */
    public abstract void mo198H(CharSequence charSequence);

    /* renamed from: I */
    public abstract AbstractC2620b mo199I(AbstractC2620b.a aVar);

    /* renamed from: b */
    public abstract void mo211b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract boolean mo213c();

    @Deprecated
    /* renamed from: e */
    public void m280e(Context context) {
    }

    /* renamed from: f */
    public Context mo215f(Context context) {
        m280e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo218i(int i4);

    /* renamed from: k */
    public abstract InterfaceC0100a mo220k();

    /* renamed from: l */
    public int mo221l() {
        return -100;
    }

    /* renamed from: m */
    public abstract MenuInflater mo222m();

    /* renamed from: n */
    public abstract ActionBar mo223n();

    /* renamed from: o */
    public abstract void mo224o();

    /* renamed from: p */
    public abstract void mo225p();

    /* renamed from: q */
    public abstract void mo227q(Configuration configuration);

    /* renamed from: r */
    public abstract void mo229r(Bundle bundle);

    /* renamed from: s */
    public abstract void mo231s();

    /* renamed from: t */
    public abstract void mo233t(Bundle bundle);

    /* renamed from: u */
    public abstract void mo234u();

    /* renamed from: v */
    public abstract void mo236v(Bundle bundle);

    /* renamed from: w */
    public abstract void mo238w();

    /* renamed from: x */
    public abstract void mo239x();
}
