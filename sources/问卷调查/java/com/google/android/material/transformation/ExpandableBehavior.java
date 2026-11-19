package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.p094p.InterfaceC0637a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0503c<View> {

    /* renamed from: a */
    public int f5070a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class ViewTreeObserverOnPreDrawListenerC0949a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final /* synthetic */ View f5071b;

        /* renamed from: c */
        public final /* synthetic */ int f5072c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC0637a f5073d;

        public ViewTreeObserverOnPreDrawListenerC0949a(View view, int i, InterfaceC0637a interfaceC0637a) {
            this.f5071b = view;
            this.f5072c = i;
            this.f5073d = interfaceC0637a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f5071b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f5070a == this.f5072c) {
                InterfaceC0637a interfaceC0637a = this.f5073d;
                expandableBehavior.mo2716C((View) interfaceC0637a, this.f5071b, interfaceC0637a.mo2217a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f5070a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5070a = 0;
    }

    /* renamed from: B */
    public final boolean m2715B(boolean z) {
        if (!z) {
            return this.f5070a == 1;
        }
        int i = this.f5070a;
        return i == 0 || i == 2;
    }

    /* renamed from: C */
    public abstract boolean mo2716C(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: g */
    public boolean mo1670g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC0637a interfaceC0637a = (InterfaceC0637a) view2;
        if (!m2715B(interfaceC0637a.mo2217a())) {
            return false;
        }
        this.f5070a = interfaceC0637a.mo2217a() ? 1 : 2;
        return mo2716C((View) interfaceC0637a, view, interfaceC0637a.mo2217a(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0503c
    /* renamed from: k */
    public boolean mo1674k(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC0637a interfaceC0637a;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (!view.isLaidOut()) {
            List<View> listM1647d = coordinatorLayout.m1647d(view);
            int size = listM1647d.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    interfaceC0637a = null;
                    break;
                }
                View view2 = listM1647d.get(i2);
                if (mo1667d(coordinatorLayout, view, view2)) {
                    interfaceC0637a = (InterfaceC0637a) view2;
                    break;
                }
                i2++;
            }
            if (interfaceC0637a != null && m2715B(interfaceC0637a.mo2217a())) {
                int i3 = interfaceC0637a.mo2217a() ? 1 : 2;
                this.f5070a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC0949a(view, i3, interfaceC0637a));
            }
        }
        return false;
    }
}
