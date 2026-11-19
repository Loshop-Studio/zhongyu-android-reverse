package p081e0;

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
import p069d0.InterfaceC8270b;
import p116h0.AbstractC8706j;

/* renamed from: e0.j */
/* loaded from: classes3.dex */
public abstract class AbstractC8345j extends AbstractC8336a {

    /* renamed from: f */
    public static boolean f15842f;

    /* renamed from: g */
    public static int f15843g = R$id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final View f15844a;

    /* renamed from: b */
    public final a f15845b;

    /* renamed from: c */
    public View.OnAttachStateChangeListener f15846c;

    /* renamed from: d */
    public boolean f15847d;

    /* renamed from: e */
    public boolean f15848e;

    /* renamed from: e0.j$a */
    public static final class a {

        /* renamed from: e */
        public static Integer f15849e;

        /* renamed from: a */
        public final View f15850a;

        /* renamed from: b */
        public final List f15851b = new ArrayList();

        /* renamed from: c */
        public boolean f15852c;

        /* renamed from: d */
        public ViewTreeObserverOnPreDrawListenerC10803a f15853d;

        /* renamed from: e0.j$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC10803a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f15854a;

            public ViewTreeObserverOnPreDrawListenerC10803a(a aVar) {
                this.f15854a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = (a) this.f15854a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m13579a();
                return true;
            }
        }

        public a(View view) {
            this.f15850a = view;
        }

        /* renamed from: c */
        public static int m13578c(Context context) {
            if (f15849e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC8706j.m14181d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f15849e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f15849e.intValue();
        }

        /* renamed from: a */
        public void m13579a() {
            if (this.f15851b.isEmpty()) {
                return;
            }
            int iM13584g = m13584g();
            int iM13583f = m13583f();
            if (m13586i(iM13584g, iM13583f)) {
                m13587j(iM13584g, iM13583f);
                m13580b();
            }
        }

        /* renamed from: b */
        public void m13580b() {
            ViewTreeObserver viewTreeObserver = this.f15850a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f15853d);
            }
            this.f15853d = null;
            this.f15851b.clear();
        }

        /* renamed from: d */
        public void m13581d(InterfaceC8343h interfaceC8343h) {
            int iM13584g = m13584g();
            int iM13583f = m13583f();
            if (m13586i(iM13584g, iM13583f)) {
                interfaceC8343h.mo3163d(iM13584g, iM13583f);
                return;
            }
            if (!this.f15851b.contains(interfaceC8343h)) {
                this.f15851b.add(interfaceC8343h);
            }
            if (this.f15853d == null) {
                ViewTreeObserver viewTreeObserver = this.f15850a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC10803a viewTreeObserverOnPreDrawListenerC10803a = new ViewTreeObserverOnPreDrawListenerC10803a(this);
                this.f15853d = viewTreeObserverOnPreDrawListenerC10803a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10803a);
            }
        }

        /* renamed from: e */
        public final int m13582e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f15852c && this.f15850a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f15850a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m13578c(this.f15850a.getContext());
        }

        /* renamed from: f */
        public final int m13583f() {
            int paddingTop = this.f15850a.getPaddingTop() + this.f15850a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f15850a.getLayoutParams();
            return m13582e(this.f15850a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int m13584g() {
            int paddingLeft = this.f15850a.getPaddingLeft() + this.f15850a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f15850a.getLayoutParams();
            return m13582e(this.f15850a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m13585h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m13586i(int i10, int i11) {
            return m13585h(i10) && m13585h(i11);
        }

        /* renamed from: j */
        public final void m13587j(int i10, int i11) {
            Iterator it = new ArrayList(this.f15851b).iterator();
            while (it.hasNext()) {
                ((InterfaceC8343h) it.next()).mo3163d(i10, i11);
            }
        }

        /* renamed from: k */
        public void m13588k(InterfaceC8343h interfaceC8343h) {
            this.f15851b.remove(interfaceC8343h);
        }
    }

    public AbstractC8345j(View view) {
        this.f15844a = (View) AbstractC8706j.m14181d(view);
        this.f15845b = new a(view);
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: b */
    public void mo13549b(InterfaceC8343h interfaceC8343h) {
        this.f15845b.m13588k(interfaceC8343h);
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: c */
    public void mo13550c(InterfaceC8343h interfaceC8343h) {
        this.f15845b.m13581d(interfaceC8343h);
    }

    @Override // p081e0.AbstractC8336a, p081e0.InterfaceC8344i
    /* renamed from: d */
    public void mo13546d(Drawable drawable) {
        super.mo13546d(drawable);
        m13575j();
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: e */
    public InterfaceC8270b mo13551e() {
        Object objM13574i = m13574i();
        if (objM13574i == null) {
            return null;
        }
        if (objM13574i instanceof InterfaceC8270b) {
            return (InterfaceC8270b) objM13574i;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p081e0.AbstractC8336a, p081e0.InterfaceC8344i
    /* renamed from: f */
    public void mo3147f(Drawable drawable) {
        super.mo3147f(drawable);
        this.f15845b.m13580b();
        if (this.f15847d) {
            return;
        }
        m13576k();
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: g */
    public void mo13552g(InterfaceC8270b interfaceC8270b) {
        m13577l(interfaceC8270b);
    }

    /* renamed from: i */
    public final Object m13574i() {
        return this.f15844a.getTag(f15843g);
    }

    /* renamed from: j */
    public final void m13575j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f15846c;
        if (onAttachStateChangeListener == null || this.f15848e) {
            return;
        }
        this.f15844a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f15848e = true;
    }

    /* renamed from: k */
    public final void m13576k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f15846c;
        if (onAttachStateChangeListener == null || !this.f15848e) {
            return;
        }
        this.f15844a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f15848e = false;
    }

    /* renamed from: l */
    public final void m13577l(Object obj) {
        f15842f = true;
        this.f15844a.setTag(f15843g, obj);
    }

    public String toString() {
        return "Target for: " + this.f15844a;
    }
}
