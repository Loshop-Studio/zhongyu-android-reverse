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

/* renamed from: e0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC8339d implements InterfaceC8344i {

    /* renamed from: f */
    public static final int f15829f = R$id.glide_custom_view_target_tag;

    /* renamed from: a */
    public final a f15830a;

    /* renamed from: b */
    public final View f15831b;

    /* renamed from: c */
    public View.OnAttachStateChangeListener f15832c;

    /* renamed from: d */
    public boolean f15833d;

    /* renamed from: e */
    public boolean f15834e;

    /* renamed from: e0.d$a */
    public static final class a {

        /* renamed from: e */
        public static Integer f15835e;

        /* renamed from: a */
        public final View f15836a;

        /* renamed from: b */
        public final List f15837b = new ArrayList();

        /* renamed from: c */
        public boolean f15838c;

        /* renamed from: d */
        public ViewTreeObserverOnPreDrawListenerC10802a f15839d;

        /* renamed from: e0.d$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC10802a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference f15840a;

            public ViewTreeObserverOnPreDrawListenerC10802a(a aVar) {
                this.f15840a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("CustomViewTarget", 2);
                a aVar = (a) this.f15840a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.m13559a();
                return true;
            }
        }

        public a(View view) {
            this.f15836a = view;
        }

        /* renamed from: c */
        public static int m13558c(Context context) {
            if (f15835e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC8706j.m14181d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f15835e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f15835e.intValue();
        }

        /* renamed from: a */
        public void m13559a() {
            if (this.f15837b.isEmpty()) {
                return;
            }
            int iM13564g = m13564g();
            int iM13563f = m13563f();
            if (m13566i(iM13564g, iM13563f)) {
                m13567j(iM13564g, iM13563f);
                m13560b();
            }
        }

        /* renamed from: b */
        public void m13560b() {
            ViewTreeObserver viewTreeObserver = this.f15836a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f15839d);
            }
            this.f15839d = null;
            this.f15837b.clear();
        }

        /* renamed from: d */
        public void m13561d(InterfaceC8343h interfaceC8343h) {
            int iM13564g = m13564g();
            int iM13563f = m13563f();
            if (m13566i(iM13564g, iM13563f)) {
                interfaceC8343h.mo3163d(iM13564g, iM13563f);
                return;
            }
            if (!this.f15837b.contains(interfaceC8343h)) {
                this.f15837b.add(interfaceC8343h);
            }
            if (this.f15839d == null) {
                ViewTreeObserver viewTreeObserver = this.f15836a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC10802a viewTreeObserverOnPreDrawListenerC10802a = new ViewTreeObserverOnPreDrawListenerC10802a(this);
                this.f15839d = viewTreeObserverOnPreDrawListenerC10802a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC10802a);
            }
        }

        /* renamed from: e */
        public final int m13562e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f15838c && this.f15836a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f15836a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m13558c(this.f15836a.getContext());
        }

        /* renamed from: f */
        public final int m13563f() {
            int paddingTop = this.f15836a.getPaddingTop() + this.f15836a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f15836a.getLayoutParams();
            return m13562e(this.f15836a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: g */
        public final int m13564g() {
            int paddingLeft = this.f15836a.getPaddingLeft() + this.f15836a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f15836a.getLayoutParams();
            return m13562e(this.f15836a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* renamed from: h */
        public final boolean m13565h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean m13566i(int i10, int i11) {
            return m13565h(i10) && m13565h(i11);
        }

        /* renamed from: j */
        public final void m13567j(int i10, int i11) {
            Iterator it = new ArrayList(this.f15837b).iterator();
            while (it.hasNext()) {
                ((InterfaceC8343h) it.next()).mo3163d(i10, i11);
            }
        }

        /* renamed from: k */
        public void m13568k(InterfaceC8343h interfaceC8343h) {
            this.f15837b.remove(interfaceC8343h);
        }
    }

    public AbstractC8339d(View view) {
        this.f15831b = (View) AbstractC8706j.m14181d(view);
        this.f15830a = new a(view);
    }

    /* renamed from: i */
    private Object m13553i() {
        return this.f15831b.getTag(f15829f);
    }

    /* renamed from: j */
    private void m13554j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f15832c;
        if (onAttachStateChangeListener == null || this.f15834e) {
            return;
        }
        this.f15831b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f15834e = true;
    }

    /* renamed from: k */
    private void m13555k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f15832c;
        if (onAttachStateChangeListener == null || !this.f15834e) {
            return;
        }
        this.f15831b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f15834e = false;
    }

    /* renamed from: n */
    private void m13556n(Object obj) {
        this.f15831b.setTag(f15829f, obj);
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: b */
    public final void mo13549b(InterfaceC8343h interfaceC8343h) {
        this.f15830a.m13568k(interfaceC8343h);
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: c */
    public final void mo13550c(InterfaceC8343h interfaceC8343h) {
        this.f15830a.m13561d(interfaceC8343h);
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: d */
    public final void mo13546d(Drawable drawable) {
        m13554j();
        m13557m(drawable);
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: e */
    public final InterfaceC8270b mo13551e() {
        Object objM13553i = m13553i();
        if (objM13553i == null) {
            return null;
        }
        if (objM13553i instanceof InterfaceC8270b) {
            return (InterfaceC8270b) objM13553i;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: f */
    public final void mo3147f(Drawable drawable) {
        this.f15830a.m13560b();
        mo2817l(drawable);
        if (this.f15833d) {
            return;
        }
        m13555k();
    }

    @Override // p081e0.InterfaceC8344i
    /* renamed from: g */
    public final void mo13552g(InterfaceC8270b interfaceC8270b) {
        m13556n(interfaceC8270b);
    }

    /* renamed from: l */
    public abstract void mo2817l(Drawable drawable);

    public String toString() {
        return "Target for: " + this.f15831b;
    }

    @Override // p001a0.InterfaceC0012l
    public void onDestroy() {
    }

    @Override // p001a0.InterfaceC0012l
    public void onStart() {
    }

    @Override // p001a0.InterfaceC0012l
    public void onStop() {
    }

    /* renamed from: m */
    public void m13557m(Drawable drawable) {
    }
}
