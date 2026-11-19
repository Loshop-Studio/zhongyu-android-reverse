package coil3.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import p001a0.InterfaceC0005b;
import p015b0.InterfaceC4398d;
import p087k.AbstractC6616o;
import p087k.InterfaceC6611j;

@Metadata(m7879d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0018\u0010\u0007R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u001e\u0010!\u001a\u0004\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, m7880d2 = {"Lcoil3/target/GenericViewTarget;", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "La0/b;", "Lb0/d;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Lk/j;", "placeholder", "", "c", "(Lk/j;)V", "error", "b", "result", "a", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "image", "g", "f", "", "Z", "isStarted", "Landroid/graphics/drawable/Drawable;", "d", "()Landroid/graphics/drawable/Drawable;", "e", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "coil-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public abstract class GenericViewTarget<T extends View> implements InterfaceC0005b, InterfaceC4398d, DefaultLifecycleObserver {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean isStarted;

    @Override // p001a0.InterfaceC0004a
    /* renamed from: a */
    public void mo5a(InterfaceC6611j result) {
        m2017g(result);
    }

    @Override // p001a0.InterfaceC0004a
    /* renamed from: b */
    public void mo6b(InterfaceC6611j error) {
        m2017g(error);
    }

    @Override // p001a0.InterfaceC0004a
    /* renamed from: c */
    public void mo7c(InterfaceC6611j placeholder) {
        m2017g(placeholder);
    }

    /* renamed from: d */
    public abstract Drawable mo2014d();

    /* renamed from: e */
    public abstract void mo2015e(Drawable drawable);

    /* renamed from: f */
    public final void m2016f() {
        Object objMo2014d = mo2014d();
        Animatable animatable = objMo2014d instanceof Animatable ? (Animatable) objMo2014d : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* renamed from: g */
    public final void m2017g(InterfaceC6611j image) {
        Drawable drawableM7568a = image != null ? AbstractC6616o.m7568a(image, getView().getResources()) : null;
        Object objMo2014d = mo2014d();
        Animatable animatable = objMo2014d instanceof Animatable ? (Animatable) objMo2014d : null;
        if (animatable != null) {
            animatable.stop();
        }
        mo2015e(drawableM7568a);
        m2016f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        this.isStarted = true;
        m2016f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        this.isStarted = false;
        m2016f();
    }
}
