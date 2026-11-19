package p188y0;

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
import p016b1.AbstractC4408j;
import p181x0.InterfaceC7824b;

/* renamed from: y0.i */
/* loaded from: classes3.dex */
public abstract class AbstractC7895i extends AbstractC7887a {

    /* renamed from: f */
    public static boolean f10613f;

    /* renamed from: g */
    public static int f10614g = R$id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final View f10615a;

    /* renamed from: b */
    public final a f10616b;

    /* renamed from: c */
    public View.OnAttachStateChangeListener f10617c;

    /* renamed from: d */
    public boolean f10618d;

    /* renamed from: e */
    public boolean f10619e;

    /* renamed from: y0.i$a */
    public static final class a {

        /* renamed from: e */
        public static Integer f10620e;

        /* renamed from: a */
        public final View f10621a;

        /* renamed from: b */
        public final List f10622b = new ArrayList();

        /* renamed from: c */
        public boolean f10623c;

        /* renamed from: d */
        public ViewTreeObserverOnPreDrawListenerC8042a f10624d;

        /* renamed from: y0.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC8042a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f10625a;

            public ViewTreeObserverOnPreDrawListenerC8042a(a aVar) {
                this.f10625a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = (a) this.f10625a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m9696a();
                return true;
            }
        }

        public a(View view) {
            this.f10621a = view;
        }

        /* renamed from: c */
        public static int m9695c(Context context) {
            if (f10620e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC4408j.m1438d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f10620e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f10620e.intValue();
        }

        /* renamed from: a */
        public void m9696a() {
            if (this.f10622b.isEmpty()) {
                return;
            }
            int iM9701g = m9701g();
            int iM9700f = m9700f();
            if (m9703i(iM9701g, iM9700f)) {
                m9704j(iM9701g, iM9700f);
                m9697b();
            }
        }

        /* renamed from: b */
        public void m9697b() {
            ViewTreeObserver viewTreeObserver = this.f10621a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f10624d);
            }
            this.f10624d = null;
            this.f10622b.clear();
        }

        /* renamed from: d */
        public void m9698d(InterfaceC7893g interfaceC7893g) {
            int iM9701g = m9701g();
            int iM9700f = m9700f();
            if (m9703i(iM9701g, iM9700f)) {
                interfaceC7893g.mo2899d(iM9701g, iM9700f);
                return;
            }
            if (!this.f10622b.contains(interfaceC7893g)) {
                this.f10622b.add(interfaceC7893g);
            }
            if (this.f10624d == null) {
                ViewTreeObserver viewTreeObserver = this.f10621a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC8042a viewTreeObserverOnPreDrawListenerC8042a = new ViewTreeObserverOnPreDrawListenerC8042a(this);
                this.f10624d = viewTreeObserverOnPreDrawListenerC8042a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8042a);
            }
        }

        /* renamed from: e */
        public final int m9699e(int i6, int i7, int i8) {
            int i9 = i7 - i8;
            if (i9 > 0) {
                return i9;
            }
            if (this.f10623c && this.f10621a.isLayoutRequested()) {
                return 0;
            }
            int i10 = i6 - i8;
            if (i10 > 0) {
                return i10;
            }
            if (this.f10621a.isLayoutRequested() || i7 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m9695c(this.f10621a.getContext());
        }

        /* renamed from: f */
        public final int m9700f() {
            int paddingTop = this.f10621a.getPaddingTop() + this.f10621a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f10621a.getLayoutParams();
            return m9699e(this.f10621a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int m9701g() {
            int paddingLeft = this.f10621a.getPaddingLeft() + this.f10621a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f10621a.getLayoutParams();
            return m9699e(this.f10621a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m9702h(int i6) {
            return i6 > 0 || i6 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m9703i(int i6, int i7) {
            return m9702h(i6) && m9702h(i7);
        }

        /* renamed from: j */
        public final void m9704j(int i6, int i7) {
            ArrayList arrayList = new ArrayList(this.f10622b);
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                ((InterfaceC7893g) obj).mo2899d(i6, i7);
            }
        }

        /* renamed from: k */
        public void m9705k(InterfaceC7893g interfaceC7893g) {
            this.f10622b.remove(interfaceC7893g);
        }
    }

    public AbstractC7895i(View view) {
        this.f10615a = (View) AbstractC4408j.m1438d(view);
        this.f10616b = new a(view);
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: a */
    public InterfaceC7824b mo9681a() {
        Object objM9690j = m9690j();
        if (objM9690j == null) {
            return null;
        }
        if (objM9690j instanceof InterfaceC7824b) {
            return (InterfaceC7824b) objM9690j;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p188y0.AbstractC7887a, p188y0.InterfaceC7894h
    /* renamed from: e */
    public void mo9678e(Drawable drawable) {
        super.mo9678e(drawable);
        m9692l();
    }

    @Override // p188y0.AbstractC7887a, p188y0.InterfaceC7894h
    /* renamed from: f */
    public void mo2883f(Drawable drawable) {
        super.mo2883f(drawable);
        this.f10616b.m9697b();
        if (this.f10618d) {
            return;
        }
        m9693m();
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: g */
    public void mo9682g(InterfaceC7893g interfaceC7893g) {
        this.f10616b.m9698d(interfaceC7893g);
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: h */
    public void mo9683h(InterfaceC7824b interfaceC7824b) {
        m9694n(interfaceC7824b);
    }

    @Override // p188y0.InterfaceC7894h
    /* renamed from: i */
    public void mo9684i(InterfaceC7893g interfaceC7893g) {
        this.f10616b.m9705k(interfaceC7893g);
    }

    /* renamed from: j */
    public final Object m9690j() {
        return this.f10615a.getTag(f10614g);
    }

    /* renamed from: k */
    public View m9691k() {
        return this.f10615a;
    }

    /* renamed from: l */
    public final void m9692l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f10617c;
        if (onAttachStateChangeListener == null || this.f10619e) {
            return;
        }
        this.f10615a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f10619e = true;
    }

    /* renamed from: m */
    public final void m9693m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f10617c;
        if (onAttachStateChangeListener == null || !this.f10619e) {
            return;
        }
        this.f10615a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f10619e = false;
    }

    /* renamed from: n */
    public final void m9694n(Object obj) {
        f10613f = true;
        this.f10615a.setTag(f10614g, obj);
    }

    public String toString() {
        return "Target for: " + this.f10615a;
    }
}
