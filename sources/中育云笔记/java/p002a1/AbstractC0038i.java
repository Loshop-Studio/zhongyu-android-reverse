package p002a1;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p109d1.AbstractC8909j;
import p428z0.InterfaceC11953b;

/* renamed from: a1.i */
/* loaded from: classes3.dex */
public abstract class AbstractC0038i extends AbstractC0030a {

    /* renamed from: h */
    public static boolean f19h;

    /* renamed from: i */
    public static int f20i = R$id.glide_custom_view_target_tag;

    /* renamed from: c */
    public final View f21c;

    /* renamed from: d */
    public final a f22d;

    /* renamed from: e */
    public View.OnAttachStateChangeListener f23e;

    /* renamed from: f */
    public boolean f24f;

    /* renamed from: g */
    public boolean f25g;

    /* renamed from: a1.i$a */
    public static final class a {

        /* renamed from: e */
        public static Integer f26e;

        /* renamed from: a */
        public final View f27a;

        /* renamed from: b */
        public final List f28b = new ArrayList();

        /* renamed from: c */
        public boolean f29c;

        /* renamed from: d */
        public ViewTreeObserverOnPreDrawListenerC12057a f30d;

        /* renamed from: a1.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC12057a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: c */
            public final WeakReference f31c;

            public ViewTreeObserverOnPreDrawListenerC12057a(a aVar) {
                this.f31c = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = (a) this.f31c.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m81a();
                return true;
            }
        }

        public a(View view) {
            this.f27a = view;
        }

        /* renamed from: c */
        public static int m80c(Context context) {
            if (f26e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC8909j.m17468d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f26e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f26e.intValue();
        }

        /* renamed from: a */
        public void m81a() {
            if (this.f28b.isEmpty()) {
                return;
            }
            int iM86g = m86g();
            int iM85f = m85f();
            if (m88i(iM86g, iM85f)) {
                m89j(iM86g, iM85f);
                m82b();
            }
        }

        /* renamed from: b */
        public void m82b() {
            ViewTreeObserver viewTreeObserver = this.f27a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f30d);
            }
            this.f30d = null;
            this.f28b.clear();
        }

        /* renamed from: d */
        public void m83d(InterfaceC0036g interfaceC0036g) {
            int iM86g = m86g();
            int iM85f = m85f();
            if (m88i(iM86g, iM85f)) {
                interfaceC0036g.mo75d(iM86g, iM85f);
                return;
            }
            if (!this.f28b.contains(interfaceC0036g)) {
                this.f28b.add(interfaceC0036g);
            }
            if (this.f30d == null) {
                ViewTreeObserver viewTreeObserver = this.f27a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC12057a viewTreeObserverOnPreDrawListenerC12057a = new ViewTreeObserverOnPreDrawListenerC12057a(this);
                this.f30d = viewTreeObserverOnPreDrawListenerC12057a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC12057a);
            }
        }

        /* renamed from: e */
        public final int m84e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f29c && this.f27a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f27a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m80c(this.f27a.getContext());
        }

        /* renamed from: f */
        public final int m85f() {
            int paddingTop = this.f27a.getPaddingTop() + this.f27a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f27a.getLayoutParams();
            return m84e(this.f27a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int m86g() {
            int paddingLeft = this.f27a.getPaddingLeft() + this.f27a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f27a.getLayoutParams();
            return m84e(this.f27a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m87h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m88i(int i10, int i11) {
            return m87h(i10) && m87h(i11);
        }

        /* renamed from: j */
        public final void m89j(int i10, int i11) {
            ArrayList arrayList = new ArrayList(this.f28b);
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                ((InterfaceC0036g) obj).mo75d(i10, i11);
            }
        }

        /* renamed from: k */
        public void m90k(InterfaceC0036g interfaceC0036g) {
            this.f28b.remove(interfaceC0036g);
        }
    }

    public AbstractC0038i(View view) {
        this.f21c = (View) AbstractC8909j.m17468d(view);
        this.f22d = new a(view);
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: a */
    public InterfaceC11953b mo65a() {
        Object objM76i = m76i();
        if (objM76i == null) {
            return null;
        }
        if (objM76i instanceof InterfaceC11953b) {
            return (InterfaceC11953b) objM76i;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p002a1.AbstractC0030a, p002a1.InterfaceC0037h
    /* renamed from: c */
    public void mo61c(Drawable drawable) {
        super.mo61c(drawable);
        m77j();
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: d */
    public void mo66d(InterfaceC0036g interfaceC0036g) {
        this.f22d.m90k(interfaceC0036g);
    }

    @Override // p002a1.AbstractC0030a, p002a1.InterfaceC0037h
    /* renamed from: e */
    public void mo62e(Drawable drawable) {
        super.mo62e(drawable);
        this.f22d.m82b();
        if (this.f24f) {
            return;
        }
        m78k();
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: g */
    public void mo67g(InterfaceC0036g interfaceC0036g) {
        this.f22d.m83d(interfaceC0036g);
    }

    @Override // p002a1.InterfaceC0037h
    /* renamed from: h */
    public void mo68h(InterfaceC11953b interfaceC11953b) {
        m79l(interfaceC11953b);
    }

    /* renamed from: i */
    public final Object m76i() {
        return this.f21c.getTag(f20i);
    }

    /* renamed from: j */
    public final void m77j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f23e;
        if (onAttachStateChangeListener == null || this.f25g) {
            return;
        }
        this.f21c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f25g = true;
    }

    /* renamed from: k */
    public final void m78k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f23e;
        if (onAttachStateChangeListener == null || !this.f25g) {
            return;
        }
        this.f21c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f25g = false;
    }

    /* renamed from: l */
    public final void m79l(Object obj) {
        f19h = true;
        this.f21c.setTag(f20i, obj);
    }

    public String toString() {
        return "Target for: " + this.f21c;
    }
}
