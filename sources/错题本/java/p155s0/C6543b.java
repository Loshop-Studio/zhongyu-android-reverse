package p155s0;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.R$id;
import com.bumptech.glide.request.C3420a;
import java.util.ArrayList;
import p147r0.InterfaceC6444b;
import p185v7.AbstractC6675d;

/* renamed from: s0.b */
/* loaded from: classes2.dex */
public final class C6543b extends AbstractC6542a {

    /* renamed from: f */
    public static final int f10913f = R$id.glide_custom_view_target_tag;

    /* renamed from: b */
    public final ImageView f10914b;

    /* renamed from: c */
    public final C6551j f10915c;

    /* renamed from: d */
    public Animatable f10916d;

    /* renamed from: e */
    public final /* synthetic */ int f10917e;

    public C6543b(ImageView imageView, int i) {
        this.f10917e = i;
        AbstractC6675d.m6344f(imageView, "Argument must not be null");
        this.f10914b = imageView;
        this.f10915c = new C6551j(imageView);
    }

    @Override // p155s0.AbstractC6542a, p155s0.InterfaceC6550i
    /* renamed from: a */
    public final InterfaceC6444b mo6101a() {
        Object tag = this.f10914b.getTag(f10913f);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC6444b) {
            return (InterfaceC6444b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: b */
    public final void mo6102b(C3420a c3420a) {
        this.f10915c.f10932b.remove(c3420a);
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: c */
    public final void mo2380c(Object obj) {
        m6188i(obj);
        if (!(obj instanceof Animatable)) {
            this.f10916d = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f10916d = animatable;
        animatable.start();
    }

    @Override // p155s0.InterfaceC6550i
    /* renamed from: d */
    public final void mo6103d(C3420a c3420a) throws Throwable {
        C6551j c6551j = this.f10915c;
        ArrayList arrayList = c6551j.f10932b;
        View view = c6551j.f10931a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iM6190a = c6551j.m6190a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iM6190a2 = c6551j.m6190a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iM6190a > 0 || iM6190a == Integer.MIN_VALUE) && (iM6190a2 > 0 || iM6190a2 == Integer.MIN_VALUE)) {
            c3420a.m2431m(iM6190a, iM6190a2);
            return;
        }
        if (!arrayList.contains(c3420a)) {
            arrayList.add(c3420a);
        }
        if (c6551j.f10933c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC6545d viewTreeObserverOnPreDrawListenerC6545d = new ViewTreeObserverOnPreDrawListenerC6545d(c6551j);
            c6551j.f10933c = viewTreeObserverOnPreDrawListenerC6545d;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC6545d);
        }
    }

    @Override // p155s0.AbstractC6542a, p155s0.InterfaceC6550i
    /* renamed from: e */
    public final void mo6104e(Drawable drawable) {
        m6188i(null);
        this.f10916d = null;
        this.f10914b.setImageDrawable(drawable);
    }

    @Override // p155s0.AbstractC6542a, p155s0.InterfaceC6550i
    /* renamed from: f */
    public final void mo5786f(Drawable drawable) {
        C6551j c6551j = this.f10915c;
        ViewTreeObserver viewTreeObserver = c6551j.f10931a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c6551j.f10933c);
        }
        c6551j.f10933c = null;
        c6551j.f10932b.clear();
        Animatable animatable = this.f10916d;
        if (animatable != null) {
            animatable.stop();
        }
        m6188i(null);
        this.f10916d = null;
        this.f10914b.setImageDrawable(drawable);
    }

    @Override // p155s0.AbstractC6542a, p155s0.InterfaceC6550i
    /* renamed from: g */
    public final void mo6105g(C3420a c3420a) {
        this.f10914b.setTag(f10913f, c3420a);
    }

    @Override // p155s0.AbstractC6542a, p155s0.InterfaceC6550i
    /* renamed from: h */
    public final void mo2381h(Drawable drawable) {
        m6188i(null);
        this.f10916d = null;
        this.f10914b.setImageDrawable(drawable);
    }

    /* renamed from: i */
    public final void m6188i(Object obj) {
        switch (this.f10917e) {
            case 0:
                this.f10914b.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f10914b.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // p155s0.AbstractC6542a, p127o0.InterfaceC6260f
    public final void onStart() {
        Animatable animatable = this.f10916d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // p155s0.AbstractC6542a, p127o0.InterfaceC6260f
    public final void onStop() {
        Animatable animatable = this.f10916d;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final String toString() {
        return "Target for: " + this.f10914b;
    }
}
