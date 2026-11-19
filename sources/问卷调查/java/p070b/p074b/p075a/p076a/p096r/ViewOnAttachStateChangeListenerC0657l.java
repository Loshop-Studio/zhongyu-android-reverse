package p070b.p074b.p075a.p076a.p096r;

import android.view.View;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: b.b.a.a.r.l */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0657l implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }
}
