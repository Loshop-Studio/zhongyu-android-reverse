package coil3.target;

import android.graphics.drawable.Drawable;
import android.view.DefaultLifecycleObserver;
import android.view.LifecycleOwner;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import coil3.InterfaceC3305k;
import kotlin.Metadata;
import p171u.InterfaceC6608a;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcoil3/target/GenericViewTarget;", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "coil-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class GenericViewTarget<T extends View> implements DefaultLifecycleObserver, InterfaceC6608a {
    /* renamed from: a */
    public abstract Drawable mo2281a();

    /* renamed from: b */
    public final void m2282b(InterfaceC3305k interfaceC3305k) {
        if (interfaceC3305k != null) {
            throw null;
        }
        mo2281a();
        throw null;
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: f */
    public final void mo112f(InterfaceC3305k interfaceC3305k) {
        m2282b(interfaceC3305k);
        throw null;
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: m */
    public final void mo119m(InterfaceC3305k interfaceC3305k) {
        m2282b(interfaceC3305k);
        throw null;
    }

    @Override // android.view.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        mo2281a();
        throw null;
    }

    @Override // android.view.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        mo2281a();
        throw null;
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: q */
    public final void mo123q(InterfaceC3305k interfaceC3305k) {
        m2282b(interfaceC3305k);
        throw null;
    }
}
