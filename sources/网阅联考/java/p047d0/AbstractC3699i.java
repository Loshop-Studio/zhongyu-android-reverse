package p047d0;

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
import java.util.Iterator;
import java.util.List;
import p016c0.InterfaceC2751b;
import p062g0.AbstractC3749i;

/* renamed from: d0.i */
/* loaded from: classes2.dex */
public abstract class AbstractC3699i extends AbstractC3691a {

    /* renamed from: f */
    public static boolean f4316f;

    /* renamed from: g */
    public static int f4317g = R$id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final View f4318a;

    /* renamed from: b */
    public final a f4319b;

    /* renamed from: c */
    public View.OnAttachStateChangeListener f4320c;

    /* renamed from: d */
    public boolean f4321d;

    /* renamed from: e */
    public boolean f4322e;

    /* renamed from: d0.i$a */
    public static final class a {

        /* renamed from: e */
        public static Integer f4323e;

        /* renamed from: a */
        public final View f4324a;

        /* renamed from: b */
        public final List f4325b = new ArrayList();

        /* renamed from: c */
        public boolean f4326c;

        /* renamed from: d */
        public ViewTreeObserverOnPreDrawListenerC4757a f4327d;

        /* renamed from: d0.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC4757a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f4328a;

            public ViewTreeObserverOnPreDrawListenerC4757a(a aVar) {
                this.f4328a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                a aVar = (a) this.f4328a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m4686a();
                return true;
            }
        }

        public a(View view) {
            this.f4324a = view;
        }

        /* renamed from: c */
        public static int m4685c(Context context) {
            if (f4323e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC3749i.m4768d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f4323e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f4323e.intValue();
        }

        /* renamed from: a */
        public void m4686a() {
            if (this.f4325b.isEmpty()) {
                return;
            }
            int iM4691g = m4691g();
            int iM4690f = m4690f();
            if (m4693i(iM4691g, iM4690f)) {
                m4694j(iM4691g, iM4690f);
                m4687b();
            }
        }

        /* renamed from: b */
        public void m4687b() {
            ViewTreeObserver viewTreeObserver = this.f4324a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f4327d);
            }
            this.f4327d = null;
            this.f4325b.clear();
        }

        /* renamed from: d */
        public void m4688d(InterfaceC3697g interfaceC3697g) {
            int iM4691g = m4691g();
            int iM4690f = m4690f();
            if (m4693i(iM4691g, iM4690f)) {
                interfaceC3697g.mo2030e(iM4691g, iM4690f);
                return;
            }
            if (!this.f4325b.contains(interfaceC3697g)) {
                this.f4325b.add(interfaceC3697g);
            }
            if (this.f4327d == null) {
                ViewTreeObserver viewTreeObserver = this.f4324a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC4757a viewTreeObserverOnPreDrawListenerC4757a = new ViewTreeObserverOnPreDrawListenerC4757a(this);
                this.f4327d = viewTreeObserverOnPreDrawListenerC4757a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC4757a);
            }
        }

        /* renamed from: e */
        public final int m4689e(int i4, int i5, int i6) {
            int i7 = i5 - i6;
            if (i7 > 0) {
                return i7;
            }
            if (this.f4326c && this.f4324a.isLayoutRequested()) {
                return 0;
            }
            int i8 = i4 - i6;
            if (i8 > 0) {
                return i8;
            }
            if (this.f4324a.isLayoutRequested() || i5 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m4685c(this.f4324a.getContext());
        }

        /* renamed from: f */
        public final int m4690f() {
            int paddingTop = this.f4324a.getPaddingTop() + this.f4324a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f4324a.getLayoutParams();
            return m4689e(this.f4324a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int m4691g() {
            int paddingLeft = this.f4324a.getPaddingLeft() + this.f4324a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f4324a.getLayoutParams();
            return m4689e(this.f4324a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m4692h(int i4) {
            return i4 > 0 || i4 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m4693i(int i4, int i5) {
            return m4692h(i4) && m4692h(i5);
        }

        /* renamed from: j */
        public final void m4694j(int i4, int i5) {
            Iterator it = new ArrayList(this.f4325b).iterator();
            while (it.hasNext()) {
                ((InterfaceC3697g) it.next()).mo2030e(i4, i5);
            }
        }

        /* renamed from: k */
        public void m4695k(InterfaceC3697g interfaceC3697g) {
            this.f4325b.remove(interfaceC3697g);
        }
    }

    public AbstractC3699i(View view) {
        this.f4318a = (View) AbstractC3749i.m4768d(view);
        this.f4319b = new a(view);
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: b */
    public void mo4672b(InterfaceC3697g interfaceC3697g) {
        this.f4319b.m4688d(interfaceC3697g);
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: d */
    public void mo4673d(InterfaceC2751b interfaceC2751b) {
        m4684m(interfaceC2751b);
    }

    @Override // p047d0.AbstractC3691a, p047d0.InterfaceC3698h
    /* renamed from: e */
    public void mo4669e(Drawable drawable) {
        super.mo4669e(drawable);
        m4682k();
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: g */
    public void mo4674g(InterfaceC3697g interfaceC3697g) {
        this.f4319b.m4695k(interfaceC3697g);
    }

    @Override // p047d0.InterfaceC3698h
    /* renamed from: h */
    public InterfaceC2751b mo4675h() {
        Object objM4681j = m4681j();
        if (objM4681j == null) {
            return null;
        }
        if (objM4681j instanceof InterfaceC2751b) {
            return (InterfaceC2751b) objM4681j;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p047d0.AbstractC3691a, p047d0.InterfaceC3698h
    /* renamed from: i */
    public void mo2004i(Drawable drawable) {
        super.mo2004i(drawable);
        this.f4319b.m4687b();
        if (this.f4321d) {
            return;
        }
        m4683l();
    }

    /* renamed from: j */
    public final Object m4681j() {
        return this.f4318a.getTag(f4317g);
    }

    /* renamed from: k */
    public final void m4682k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4320c;
        if (onAttachStateChangeListener == null || this.f4322e) {
            return;
        }
        this.f4318a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f4322e = true;
    }

    /* renamed from: l */
    public final void m4683l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f4320c;
        if (onAttachStateChangeListener == null || !this.f4322e) {
            return;
        }
        this.f4318a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f4322e = false;
    }

    /* renamed from: m */
    public final void m4684m(Object obj) {
        f4316f = true;
        this.f4318a.setTag(f4317g, obj);
    }

    public String toString() {
        return "Target for: " + this.f4318a;
    }
}
