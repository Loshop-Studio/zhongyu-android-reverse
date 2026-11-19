package p070b.p074b.p075a.p076a.p082e;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.p044a0.InterfaceC0247d;

/* renamed from: b.b.a.a.e.a */
/* loaded from: classes.dex */
public class C0588a implements InterfaceC0247d {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f3586a;

    public C0588a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3586a = swipeDismissBehavior;
    }

    @Override // p000a.p031h.p043j.p044a0.InterfaceC0247d
    /* renamed from: a */
    public boolean mo832a(View view, InterfaceC0247d.a aVar) {
        boolean z = false;
        if (!this.f3586a.mo2612B(view)) {
            return false;
        }
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = this.f3586a.f4804c;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        Objects.requireNonNull(this.f3586a);
        return true;
    }
}
