package p084f1;

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
import p073e1.InterfaceC7325b;
import p117i1.AbstractC7651j;

/* renamed from: f1.i */
/* loaded from: classes3.dex */
public abstract class AbstractC7432i extends AbstractC7424a {

    /* renamed from: f */
    public static boolean f12134f;

    /* renamed from: g */
    public static int f12135g = R$id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final View f12136a;

    /* renamed from: b */
    public final a f12137b;

    /* renamed from: c */
    public View.OnAttachStateChangeListener f12138c;

    /* renamed from: d */
    public boolean f12139d;

    /* renamed from: e */
    public boolean f12140e;

    /* renamed from: f1.i$a */
    public static final class a {

        /* renamed from: e */
        public static Integer f12141e;

        /* renamed from: a */
        public final View f12142a;

        /* renamed from: b */
        public final List f12143b = new ArrayList();

        /* renamed from: c */
        public boolean f12144c;

        /* renamed from: d */
        public ViewTreeObserverOnPreDrawListenerC10144a f12145d;

        /* renamed from: f1.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC10144a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f12146a;

            public ViewTreeObserverOnPreDrawListenerC10144a(a aVar) {
                this.f12146a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = (a) this.f12146a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m11971a();
                return true;
            }
        }

        public a(View view) {
            this.f12142a = view;
        }

        /* renamed from: c */
        public static int m11970c(Context context) {
            if (f12141e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC7651j.m12683d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f12141e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f12141e.intValue();
        }

        /* renamed from: a */
        public void m11971a() {
            if (this.f12143b.isEmpty()) {
                return;
            }
            int iM11976g = m11976g();
            int iM11975f = m11975f();
            if (m11978i(iM11976g, iM11975f)) {
                m11979j(iM11976g, iM11975f);
                m11972b();
            }
        }

        /* renamed from: b */
        public void m11972b() {
            ViewTreeObserver viewTreeObserver = this.f12142a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f12145d);
            }
            this.f12145d = null;
            this.f12143b.clear();
        }

        /* renamed from: d */
        public void m11973d(InterfaceC7430g interfaceC7430g) {
            int iM11976g = m11976g();
            int iM11975f = m11975f();
            if (m11978i(iM11976g, iM11975f)) {
                interfaceC7430g.mo3719d(iM11976g, iM11975f);
                return;
            }
            if (!this.f12143b.contains(interfaceC7430g)) {
                this.f12143b.add(interfaceC7430g);
            }
            if (this.f12145d == null) {
                ViewTreeObserver viewTreeObserver = this.f12142a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC10144a viewTreeObserverOnPreDrawListenerC10144a = new ViewTreeObserverOnPreDrawListenerC10144a(this);
                this.f12145d = viewTreeObserverOnPreDrawListenerC10144a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10144a);
            }
        }

        /* renamed from: e */
        public final int m11974e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f12144c && this.f12142a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f12142a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m11970c(this.f12142a.getContext());
        }

        /* renamed from: f */
        public final int m11975f() {
            int paddingTop = this.f12142a.getPaddingTop() + this.f12142a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f12142a.getLayoutParams();
            return m11974e(this.f12142a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int m11976g() {
            int paddingLeft = this.f12142a.getPaddingLeft() + this.f12142a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f12142a.getLayoutParams();
            return m11974e(this.f12142a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m11977h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m11978i(int i10, int i11) {
            return m11977h(i10) && m11977h(i11);
        }

        /* renamed from: j */
        public final void m11979j(int i10, int i11) {
            ArrayList arrayList = new ArrayList(this.f12143b);
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                ((InterfaceC7430g) obj).mo3719d(i10, i11);
            }
        }

        /* renamed from: k */
        public void m11980k(InterfaceC7430g interfaceC7430g) {
            this.f12143b.remove(interfaceC7430g);
        }
    }

    public AbstractC7432i(View view) {
        this.f12136a = (View) AbstractC7651j.m12683d(view);
        this.f12137b = new a(view);
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: a */
    public InterfaceC7325b mo11957a() {
        Object objM11966i = m11966i();
        if (objM11966i == null) {
            return null;
        }
        if (objM11966i instanceof InterfaceC7325b) {
            return (InterfaceC7325b) objM11966i;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: c */
    public void mo11958c(InterfaceC7325b interfaceC7325b) {
        m11969l(interfaceC7325b);
    }

    @Override // p084f1.AbstractC7424a, p084f1.InterfaceC7431h
    /* renamed from: e */
    public void mo11954e(Drawable drawable) {
        super.mo11954e(drawable);
        m11967j();
    }

    @Override // p084f1.AbstractC7424a, p084f1.InterfaceC7431h
    /* renamed from: f */
    public void mo3703f(Drawable drawable) {
        super.mo3703f(drawable);
        this.f12137b.m11972b();
        if (this.f12139d) {
            return;
        }
        m11968k();
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: g */
    public void mo11959g(InterfaceC7430g interfaceC7430g) {
        this.f12137b.m11980k(interfaceC7430g);
    }

    @Override // p084f1.InterfaceC7431h
    /* renamed from: h */
    public void mo11960h(InterfaceC7430g interfaceC7430g) {
        this.f12137b.m11973d(interfaceC7430g);
    }

    /* renamed from: i */
    public final Object m11966i() {
        return this.f12136a.getTag(f12135g);
    }

    /* renamed from: j */
    public final void m11967j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12138c;
        if (onAttachStateChangeListener == null || this.f12140e) {
            return;
        }
        this.f12136a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f12140e = true;
    }

    /* renamed from: k */
    public final void m11968k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12138c;
        if (onAttachStateChangeListener == null || !this.f12140e) {
            return;
        }
        this.f12136a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f12140e = false;
    }

    /* renamed from: l */
    public final void m11969l(Object obj) {
        f12134f = true;
        this.f12136a.setTag(f12135g, obj);
    }

    public String toString() {
        return "Target for: " + this.f12136a;
    }
}
