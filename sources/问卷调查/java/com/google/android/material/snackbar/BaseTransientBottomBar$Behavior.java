package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import p070b.p074b.p075a.p076a.p102x.C0683a;
import p070b.p074b.p075a.p076a.p102x.C0686d;
import p070b.p074b.p075a.p076a.p102x.C0687e;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C0683a f4973h = new C0683a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: B */
    public boolean mo2612B(View view) {
        Objects.requireNonNull(this.f4973h);
        return view instanceof C0686d;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: j */
    public boolean mo1673j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(this.f4973h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0687e.f4111c == null) {
                    C0687e.f4111c = new C0687e();
                }
                synchronized (C0687e.f4111c.f4112a) {
                }
            }
        } else if (coordinatorLayout.m1653p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0687e.f4111c == null) {
                C0687e.f4111c = new C0687e();
            }
            synchronized (C0687e.f4111c.f4112a) {
            }
        }
        return super.mo1673j(coordinatorLayout, view, motionEvent);
    }
}
