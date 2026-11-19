package p207p2;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* renamed from: p2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9639a {

    /* renamed from: a */
    public Context f19301a;

    /* renamed from: b */
    public PopupWindow f19302b;

    /* renamed from: c */
    public d f19303c;

    /* renamed from: d */
    public View f19304d;

    /* renamed from: f */
    public WindowManager f19306f;

    /* renamed from: g */
    public PopupWindow.OnDismissListener f19307g;

    /* renamed from: e */
    public Drawable f19305e = null;

    /* renamed from: h */
    public Point f19308h = new Point();

    /* renamed from: i */
    public int f19309i = 0;

    /* renamed from: j */
    public int f19310j = 0;

    /* renamed from: k */
    public boolean f19311k = true;

    /* renamed from: p2.a$a */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                AbstractC9639a.this.f19302b.dismiss();
            }
            return false;
        }
    }

    /* renamed from: p2.a$c */
    public class c implements PopupWindow.OnDismissListener {
        public c() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            AbstractC9639a.this.m18213i();
            if (AbstractC9639a.this.f19307g != null) {
                AbstractC9639a.this.f19307g.onDismiss();
            }
        }
    }

    /* renamed from: p2.a$d */
    public class d extends FrameLayout {
        public d(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            if (AbstractC9639a.this.f19302b != null && AbstractC9639a.this.f19302b.isShowing()) {
                AbstractC9639a.this.f19302b.dismiss();
            }
            AbstractC9639a.this.m18212h(configuration);
        }
    }

    public AbstractC9639a(Context context) {
        this.f19301a = context;
        PopupWindow popupWindow = new PopupWindow(context);
        this.f19302b = popupWindow;
        popupWindow.setTouchInterceptor(new a());
        this.f19306f = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: c */
    public void m18207c() {
        this.f19302b.dismiss();
    }

    /* renamed from: d */
    public Context m18208d() {
        return this.f19301a;
    }

    /* renamed from: e */
    public PopupWindow m18209e() {
        return this.f19302b;
    }

    /* renamed from: f */
    public boolean m18210f() {
        PopupWindow popupWindow = this.f19302b;
        return popupWindow != null && popupWindow.isShowing();
    }

    /* renamed from: g */
    public final void m18211g() {
        this.f19304d.measure(-2, -2);
        this.f19310j = this.f19304d.getMeasuredWidth();
        this.f19309i = this.f19304d.getMeasuredHeight();
    }

    /* renamed from: k */
    public abstract Point mo18215k(View view);

    /* renamed from: l */
    public final void m18216l() {
        if (this.f19303c == null) {
            throw new IllegalStateException("setContentView was not called with a view to display.");
        }
        m18214j();
        Drawable drawable = this.f19305e;
        if (drawable == null) {
            this.f19302b.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            this.f19302b.setBackgroundDrawable(drawable);
        }
        this.f19302b.setWidth(-2);
        this.f19302b.setHeight(-2);
        this.f19302b.setTouchable(true);
        this.f19302b.setFocusable(true);
        this.f19302b.setOutsideTouchable(true);
        this.f19302b.setContentView(this.f19303c);
    }

    /* renamed from: m */
    public void mo18217m(View view) {
        if (view == null) {
            throw new IllegalStateException("setContentView was not called with a view to display.");
        }
        d dVar = new d(this.f19301a);
        this.f19303c = dVar;
        dVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f19304d = view;
        this.f19303c.addView(view);
        this.f19302b.setContentView(this.f19303c);
        this.f19302b.setOnDismissListener(new c());
    }

    /* renamed from: n */
    public AbstractC9639a m18218n(PopupWindow.OnDismissListener onDismissListener) {
        this.f19307g = onDismissListener;
        return this;
    }

    /* renamed from: o */
    public final void m18219o(View view) {
        m18220p(view, view);
    }

    /* renamed from: p */
    public final void m18220p(View view, View view2) {
        m18216l();
        this.f19306f.getDefaultDisplay().getSize(this.f19308h);
        if (this.f19310j == 0 || this.f19309i == 0 || !this.f19311k) {
            m18211g();
        }
        Point pointMo18215k = mo18215k(view2);
        this.f19302b.showAtLocation(view, 0, pointMo18215k.x, pointMo18215k.y);
        view2.addOnAttachStateChangeListener(new b());
    }

    /* renamed from: i */
    public void m18213i() {
    }

    /* renamed from: j */
    public void m18214j() {
    }

    /* renamed from: p2.a$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (AbstractC9639a.this.m18210f()) {
                AbstractC9639a.this.m18207c();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    /* renamed from: h */
    public void m18212h(Configuration configuration) {
    }
}
