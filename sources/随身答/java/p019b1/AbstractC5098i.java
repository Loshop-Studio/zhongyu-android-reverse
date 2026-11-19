package p019b1;

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
import p002a1.InterfaceC0010b;
import p091e1.AbstractC7837i;

/* renamed from: b1.i */
/* loaded from: classes3.dex */
public abstract class AbstractC5098i extends AbstractC5090a {

    /* renamed from: f */
    public static boolean f2194f;

    /* renamed from: g */
    public static int f2195g = R$id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final View f2196a;

    /* renamed from: b */
    public final a f2197b;

    /* renamed from: c */
    public View.OnAttachStateChangeListener f2198c;

    /* renamed from: d */
    public boolean f2199d;

    /* renamed from: e */
    public boolean f2200e;

    /* renamed from: b1.i$a */
    public static final class a {

        /* renamed from: e */
        public static Integer f2201e;

        /* renamed from: a */
        public final View f2202a;

        /* renamed from: b */
        public final List f2203b = new ArrayList();

        /* renamed from: c */
        public boolean f2204c;

        /* renamed from: d */
        public ViewTreeObserverOnPreDrawListenerC10049a f2205d;

        /* renamed from: b1.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC10049a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f2206a;

            public ViewTreeObserverOnPreDrawListenerC10049a(a aVar) {
                this.f2206a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = (a) this.f2206a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m2153a();
                return true;
            }
        }

        public a(View view) {
            this.f2202a = view;
        }

        /* renamed from: c */
        public static int m2152c(Context context) {
            if (f2201e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC7837i.m12256d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f2201e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f2201e.intValue();
        }

        /* renamed from: a */
        public void m2153a() {
            if (this.f2203b.isEmpty()) {
                return;
            }
            int iM2158g = m2158g();
            int iM2157f = m2157f();
            if (m2160i(iM2158g, iM2157f)) {
                m2161j(iM2158g, iM2157f);
                m2154b();
            }
        }

        /* renamed from: b */
        public void m2154b() {
            ViewTreeObserver viewTreeObserver = this.f2202a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f2205d);
            }
            this.f2205d = null;
            this.f2203b.clear();
        }

        /* renamed from: d */
        public void m2155d(InterfaceC5096g interfaceC5096g) {
            int iM2158g = m2158g();
            int iM2157f = m2157f();
            if (m2160i(iM2158g, iM2157f)) {
                interfaceC5096g.mo2147d(iM2158g, iM2157f);
                return;
            }
            if (!this.f2203b.contains(interfaceC5096g)) {
                this.f2203b.add(interfaceC5096g);
            }
            if (this.f2205d == null) {
                ViewTreeObserver viewTreeObserver = this.f2202a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC10049a viewTreeObserverOnPreDrawListenerC10049a = new ViewTreeObserverOnPreDrawListenerC10049a(this);
                this.f2205d = viewTreeObserverOnPreDrawListenerC10049a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10049a);
            }
        }

        /* renamed from: e */
        public final int m2156e(int i9, int i10, int i11) {
            int i12 = i10 - i11;
            if (i12 > 0) {
                return i12;
            }
            if (this.f2204c && this.f2202a.isLayoutRequested()) {
                return 0;
            }
            int i13 = i9 - i11;
            if (i13 > 0) {
                return i13;
            }
            if (this.f2202a.isLayoutRequested() || i10 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m2152c(this.f2202a.getContext());
        }

        /* renamed from: f */
        public final int m2157f() {
            int paddingTop = this.f2202a.getPaddingTop() + this.f2202a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f2202a.getLayoutParams();
            return m2156e(this.f2202a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int m2158g() {
            int paddingLeft = this.f2202a.getPaddingLeft() + this.f2202a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f2202a.getLayoutParams();
            return m2156e(this.f2202a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m2159h(int i9) {
            return i9 > 0 || i9 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m2160i(int i9, int i10) {
            return m2159h(i9) && m2159h(i10);
        }

        /* renamed from: j */
        public final void m2161j(int i9, int i10) {
            ArrayList arrayList = new ArrayList(this.f2203b);
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((InterfaceC5096g) obj).mo2147d(i9, i10);
            }
        }

        /* renamed from: k */
        public void m2162k(InterfaceC5096g interfaceC5096g) {
            this.f2203b.remove(interfaceC5096g);
        }
    }

    public AbstractC5098i(View view) {
        this.f2196a = (View) AbstractC7837i.m12256d(view);
        this.f2197b = new a(view);
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: a */
    public InterfaceC0010b mo2137a() {
        Object objM2148i = m2148i();
        if (objM2148i == null) {
            return null;
        }
        if (objM2148i instanceof InterfaceC0010b) {
            return (InterfaceC0010b) objM2148i;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: d */
    public void mo2138d(InterfaceC0010b interfaceC0010b) {
        m2151l(interfaceC0010b);
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: e */
    public void mo2139e(InterfaceC5096g interfaceC5096g) {
        this.f2197b.m2162k(interfaceC5096g);
    }

    @Override // p019b1.AbstractC5090a, p019b1.InterfaceC5097h
    /* renamed from: f */
    public void mo2133f(Drawable drawable) {
        super.mo2133f(drawable);
        m2149j();
    }

    @Override // p019b1.AbstractC5090a, p019b1.InterfaceC5097h
    /* renamed from: g */
    public void mo2134g(Drawable drawable) {
        super.mo2134g(drawable);
        this.f2197b.m2154b();
        if (this.f2199d) {
            return;
        }
        m2150k();
    }

    @Override // p019b1.InterfaceC5097h
    /* renamed from: h */
    public void mo2140h(InterfaceC5096g interfaceC5096g) {
        this.f2197b.m2155d(interfaceC5096g);
    }

    /* renamed from: i */
    public final Object m2148i() {
        return this.f2196a.getTag(f2195g);
    }

    /* renamed from: j */
    public final void m2149j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f2198c;
        if (onAttachStateChangeListener == null || this.f2200e) {
            return;
        }
        this.f2196a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f2200e = true;
    }

    /* renamed from: k */
    public final void m2150k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f2198c;
        if (onAttachStateChangeListener == null || !this.f2200e) {
            return;
        }
        this.f2196a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f2200e = false;
    }

    /* renamed from: l */
    public final void m2151l(Object obj) {
        f2194f = true;
        this.f2196a.setTag(f2195g, obj);
    }

    public String toString() {
        return "Target for: " + this.f2196a;
    }
}
