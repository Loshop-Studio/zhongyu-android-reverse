package p155s0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bumptech.glide.R$id;
import com.bumptech.glide.request.C3420a;
import java.util.ArrayList;
import p147r0.InterfaceC6444b;
import p185v7.AbstractC6675d;

/* renamed from: s0.f */
/* loaded from: classes2.dex */
public abstract class AbstractC6547f implements InterfaceC6550i {

    /* renamed from: c */
    public static final int f10927c = R$id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final C6546e f10928a;

    /* renamed from: b */
    public final View f10929b;

    public AbstractC6547f(View view) {
        AbstractC6675d.m6344f(view, "Argument must not be null");
        this.f10929b = view;
        this.f10928a = new C6546e(view);
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: a */
    public final InterfaceC6444b mo6101a() {
        Object tag = this.f10929b.getTag(f10927c);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC6444b) {
            return (InterfaceC6444b) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: b */
    public final void mo6102b(C3420a c3420a) {
        this.f10928a.f10925b.remove(c3420a);
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: d */
    public final void mo6103d(C3420a c3420a) throws Throwable {
        C6546e c6546e = this.f10928a;
        ArrayList arrayList = c6546e.f10925b;
        View view = c6546e.f10924a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM6189a = c6546e.m6189a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM6189a2 = c6546e.m6189a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM6189a > 0 || iM6189a == Integer.MIN_VALUE) && (iM6189a2 > 0 || iM6189a2 == Integer.MIN_VALUE)) {
            c3420a.m2431m(iM6189a, iM6189a2);
            return;
        }
        if (!arrayList.contains(c3420a)) {
            arrayList.add(c3420a);
        }
        if (c6546e.f10926c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC6545d viewTreeObserverOnPreDrawListenerC6545d = new ViewTreeObserverOnPreDrawListenerC6545d(c6546e);
            c6546e.f10926c = viewTreeObserverOnPreDrawListenerC6545d;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC6545d);
        }
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: f */
    public final void mo5786f(Drawable drawable) {
        C6546e c6546e = this.f10928a;
        ViewTreeObserver viewTreeObserver = c6546e.f10924a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c6546e.f10926c);
        }
        c6546e.f10926c = null;
        c6546e.f10925b.clear();
        mo2382i(drawable);
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: g */
    public final void mo6105g(C3420a c3420a) {
        this.f10929b.setTag(f10927c, c3420a);
    }

    /* renamed from: i */
    public abstract void mo2382i(Drawable drawable);

    public final String toString() {
        return "Target for: " + this.f10929b;
    }

    @Override // p127o0.InterfaceC6260f
    public final void onDestroy() {
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStart() {
    }

    @Override // p127o0.InterfaceC6260f
    public final void onStop() {
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: e */
    public final void mo6104e(Drawable drawable) {
    }
}
