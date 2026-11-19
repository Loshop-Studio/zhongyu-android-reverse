package com.friday.lecture.widget;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.friday.lecture.widget.LifecycleFrameLayout;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class LifecycleFrameLayout extends FrameLayout implements LifecycleOwner {

    /* renamed from: c */
    public final InterfaceC10773d f8958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleFrameLayout(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        this.f8958c = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: n3.a
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return LifecycleFrameLayout.m6859b(this.f24592c);
            }
        });
    }

    /* renamed from: b */
    public static final LifecycleRegistry m6859b(LifecycleFrameLayout lifecycleFrameLayout) {
        return lifecycleFrameLayout.mo6640c();
    }

    private final LifecycleRegistry getMRegistry() {
        return (LifecycleRegistry) this.f8958c.getValue();
    }

    /* renamed from: c */
    public abstract LifecycleRegistry mo6640c();

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getMRegistry();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getMRegistry().setCurrentState(Lifecycle.State.CREATED);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getMRegistry().setCurrentState(Lifecycle.State.DESTROYED);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            getMRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        } else if (i10 == 4 || i10 == 8) {
            getMRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }
}
