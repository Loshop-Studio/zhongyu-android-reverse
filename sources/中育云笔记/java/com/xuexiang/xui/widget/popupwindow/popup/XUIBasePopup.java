package com.xuexiang.xui.widget.popupwindow.popup;

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

/* loaded from: classes5.dex */
public abstract class XUIBasePopup {

    /* renamed from: a */
    public Context f16650a;

    /* renamed from: b */
    public PopupWindow f16651b;

    /* renamed from: c */
    public RootView f16652c;

    /* renamed from: d */
    public View f16653d;

    /* renamed from: f */
    public WindowManager f16655f;

    /* renamed from: g */
    public PopupWindow.OnDismissListener f16656g;

    /* renamed from: e */
    public Drawable f16654e = null;

    /* renamed from: h */
    public Point f16657h = new Point();

    /* renamed from: i */
    public int f16658i = 0;

    /* renamed from: j */
    public int f16659j = 0;

    /* renamed from: k */
    public boolean f16660k = true;

    public class RootView extends FrameLayout {
        public RootView(Context context) {
            super(context);
        }

        @Override // android.view.View
        public void onConfigurationChanged(Configuration configuration) {
            if (XUIBasePopup.this.f16651b != null && XUIBasePopup.this.f16651b.isShowing()) {
                XUIBasePopup.this.f16651b.dismiss();
            }
            XUIBasePopup.this.m13056h(configuration);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup$a */
    public class ViewOnTouchListenerC8196a implements View.OnTouchListener {
        public ViewOnTouchListenerC8196a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                XUIBasePopup.this.f16651b.dismiss();
            }
            return false;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup$b */
    public class ViewOnAttachStateChangeListenerC8197b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC8197b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (XUIBasePopup.this.m13054f()) {
                XUIBasePopup.this.m13051c();
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup$c */
    public class C8198c implements PopupWindow.OnDismissListener {
        public C8198c() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            XUIBasePopup.this.m13057i();
            if (XUIBasePopup.this.f16656g != null) {
                XUIBasePopup.this.f16656g.onDismiss();
            }
        }
    }

    public XUIBasePopup(Context context) {
        this.f16650a = context;
        PopupWindow popupWindow = new PopupWindow(context);
        this.f16651b = popupWindow;
        popupWindow.setTouchInterceptor(new ViewOnTouchListenerC8196a());
        this.f16655f = (WindowManager) context.getSystemService("window");
    }

    /* renamed from: c */
    public void m13051c() {
        this.f16651b.dismiss();
    }

    /* renamed from: d */
    public Context m13052d() {
        return this.f16650a;
    }

    /* renamed from: e */
    public PopupWindow m13053e() {
        return this.f16651b;
    }

    /* renamed from: f */
    public boolean m13054f() {
        PopupWindow popupWindow = this.f16651b;
        return popupWindow != null && popupWindow.isShowing();
    }

    /* renamed from: g */
    public final void m13055g() {
        this.f16653d.measure(-2, -2);
        this.f16659j = this.f16653d.getMeasuredWidth();
        this.f16658i = this.f16653d.getMeasuredHeight();
    }

    /* renamed from: h */
    public void m13056h(Configuration configuration) {
    }

    /* renamed from: i */
    public void m13057i() {
    }

    /* renamed from: j */
    public void m13058j() {
    }

    /* renamed from: k */
    public abstract Point mo2849k(View view);

    /* renamed from: l */
    public final void m13059l() {
        if (this.f16652c == null) {
            throw new IllegalStateException("setContentView was not called with a view to display.");
        }
        m13058j();
        Drawable drawable = this.f16654e;
        if (drawable == null) {
            this.f16651b.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            this.f16651b.setBackgroundDrawable(drawable);
        }
        this.f16651b.setWidth(-2);
        this.f16651b.setHeight(-2);
        this.f16651b.setTouchable(true);
        this.f16651b.setFocusable(true);
        this.f16651b.setOutsideTouchable(true);
        this.f16651b.setContentView(this.f16652c);
    }

    /* renamed from: m */
    public void mo2850m(View view) {
        if (view == null) {
            throw new IllegalStateException("setContentView was not called with a view to display.");
        }
        RootView rootView = new RootView(this.f16650a);
        this.f16652c = rootView;
        rootView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f16653d = view;
        this.f16652c.addView(view);
        this.f16651b.setContentView(this.f16652c);
        this.f16651b.setOnDismissListener(new C8198c());
    }

    /* renamed from: n */
    public final void m13060n(View view) {
        m13061o(view, view);
    }

    /* renamed from: o */
    public final void m13061o(View view, View view2) {
        m13059l();
        this.f16655f.getDefaultDisplay().getSize(this.f16657h);
        if (this.f16659j == 0 || this.f16658i == 0 || !this.f16660k) {
            m13055g();
        }
        Point pointMo2849k = mo2849k(view2);
        this.f16651b.showAtLocation(view, 0, pointMo2849k.x, pointMo2849k.y);
        view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC8197b());
    }
}
