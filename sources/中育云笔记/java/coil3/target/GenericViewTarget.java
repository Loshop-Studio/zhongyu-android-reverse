package coil3.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import p212k.AbstractC9761o;
import p212k.InterfaceC9756j;
import p412y.InterfaceC11880b;
import p427z.InterfaceC11951d;

/* loaded from: classes3.dex */
public abstract class GenericViewTarget<T extends View> implements InterfaceC11880b, InterfaceC11951d, DefaultLifecycleObserver {

    /* renamed from: c */
    public boolean f3914c;

    @Override // p412y.InterfaceC11879a
    /* renamed from: a */
    public void mo3279a(InterfaceC9756j interfaceC9756j) {
        m3285g(interfaceC9756j);
    }

    @Override // p412y.InterfaceC11879a
    /* renamed from: b */
    public void mo3280b(InterfaceC9756j interfaceC9756j) {
        m3285g(interfaceC9756j);
    }

    @Override // p412y.InterfaceC11879a
    /* renamed from: c */
    public void mo3281c(InterfaceC9756j interfaceC9756j) {
        m3285g(interfaceC9756j);
    }

    /* renamed from: d */
    public abstract Drawable mo3282d();

    /* renamed from: e */
    public abstract void mo3283e(Drawable drawable);

    /* renamed from: f */
    public final void m3284f() {
        Object objMo3282d = mo3282d();
        Animatable animatable = objMo3282d instanceof Animatable ? (Animatable) objMo3282d : null;
        if (animatable == null) {
            return;
        }
        if (this.f3914c) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* renamed from: g */
    public final void m3285g(InterfaceC9756j interfaceC9756j) {
        Drawable drawableM19678a = interfaceC9756j != null ? AbstractC9761o.m19678a(interfaceC9756j, getView().getResources()) : null;
        Object objMo3282d = mo3282d();
        Animatable animatable = objMo3282d instanceof Animatable ? (Animatable) objMo3282d : null;
        if (animatable != null) {
            animatable.stop();
        }
        mo3283e(drawableM19678a);
        m3284f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        this.f3914c = true;
        m3284f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        this.f3914c = false;
        m3284f();
    }
}
