package p209q3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$style;
import com.xuexiang.xui.utils.AbstractC6480e;
import com.xuexiang.xui.utils.AbstractC6482g;
import p242t3.C9381a;
import p253u3.InterfaceC9539b;
import p264v3.AbstractC9664c;

/* renamed from: q3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8883a {

    /* renamed from: a */
    public Context f15129a;

    /* renamed from: b */
    public ViewGroup f15130b;

    /* renamed from: c */
    public ViewGroup f15131c;

    /* renamed from: d */
    public ViewGroup f15132d;

    /* renamed from: e */
    public C9381a f15133e;

    /* renamed from: f */
    public boolean f15134f;

    /* renamed from: g */
    public Animation f15135g;

    /* renamed from: h */
    public Animation f15136h;

    /* renamed from: i */
    public boolean f15137i;

    /* renamed from: k */
    public Dialog f15139k;

    /* renamed from: l */
    public View f15140l;

    /* renamed from: j */
    public int f15138j = 80;

    /* renamed from: m */
    public boolean f15141m = true;

    /* renamed from: n */
    public View.OnKeyListener f15142n = new d();

    /* renamed from: o */
    public final View.OnTouchListener f15143o = new e();

    /* renamed from: q3.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC8883a.this.m14927f();
        }
    }

    /* renamed from: q3.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC8883a abstractC8883a = AbstractC8883a.this;
            abstractC8883a.f15133e.f16291A.removeView(abstractC8883a.f15131c);
            AbstractC8883a.this.f15137i = false;
            AbstractC8883a.this.f15134f = false;
            AbstractC8883a.m14925d(AbstractC8883a.this);
        }
    }

    /* renamed from: q3.a$d */
    public class d implements View.OnKeyListener {
        public d() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 != 4 || keyEvent.getAction() != 0 || !AbstractC8883a.this.m14937p()) {
                return false;
            }
            AbstractC8883a.this.m14927f();
            return true;
        }
    }

    /* renamed from: q3.a$e */
    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            AbstractC8883a.this.m14927f();
            return false;
        }
    }

    /* renamed from: q3.a$f */
    public class f implements DialogInterface.OnDismissListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            AbstractC8883a.m14925d(AbstractC8883a.this);
        }
    }

    public AbstractC8883a(Context context) {
        this.f15129a = context;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC9539b m14925d(AbstractC8883a abstractC8883a) {
        abstractC8883a.getClass();
        return null;
    }

    /* renamed from: e */
    public void m14926e() {
        if (this.f15132d != null) {
            Dialog dialog = new Dialog(this.f15129a, R$style.XUIDialog_Custom);
            this.f15139k = dialog;
            dialog.setCancelable(this.f15133e.f16311U);
            this.f15139k.setContentView(this.f15132d);
            Window window = this.f15139k.getWindow();
            if (window != null) {
                window.setWindowAnimations(R$style.picker_view_scale_anim);
                window.setGravity(17);
                m14942u(window);
            }
            this.f15139k.setOnDismissListener(new f());
        }
    }

    /* renamed from: f */
    public void m14927f() {
        if (mo14936o()) {
            m14928g();
            return;
        }
        if (this.f15134f) {
            return;
        }
        if (this.f15141m) {
            this.f15135g.setAnimationListener(new b());
            this.f15130b.startAnimation(this.f15135g);
        } else {
            m14929h();
        }
        this.f15134f = true;
    }

    /* renamed from: g */
    public final void m14928g() {
        Dialog dialog = this.f15139k;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: h */
    public void m14929h() {
        this.f15133e.f16291A.post(new c());
    }

    /* renamed from: i */
    public View m14930i(int i10) {
        return this.f15130b.findViewById(i10);
    }

    /* renamed from: j */
    public final Animation m14931j() {
        return AnimationUtils.loadAnimation(this.f15129a, AbstractC9664c.m16165a(this.f15138j, true));
    }

    /* renamed from: k */
    public final Animation m14932k() {
        return AnimationUtils.loadAnimation(this.f15129a, AbstractC9664c.m16165a(this.f15138j, false));
    }

    /* renamed from: l */
    public final int m14933l(Window window) {
        Display defaultDisplay = window.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    /* renamed from: m */
    public void m14934m() {
        this.f15136h = m14931j();
        this.f15135g = m14932k();
    }

    /* renamed from: n */
    public void m14935n() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f15129a);
        if (mo14936o()) {
            ViewGroup viewGroup = (ViewGroup) layoutInflaterFrom.inflate(R$layout.xui_layout_picker_view_base, (ViewGroup) null, false);
            this.f15132d = viewGroup;
            viewGroup.setBackgroundColor(0);
            ViewGroup viewGroup2 = (ViewGroup) this.f15132d.findViewById(R$id.content_container);
            this.f15130b = viewGroup2;
            layoutParams.leftMargin = 30;
            layoutParams.rightMargin = 30;
            viewGroup2.setLayoutParams(layoutParams);
            m14926e();
            this.f15132d.setOnClickListener(new a());
        } else {
            C9381a c9381a = this.f15133e;
            if (c9381a.f16291A == null) {
                c9381a.f16291A = (ViewGroup) ((Activity) this.f15129a).getWindow().getDecorView();
            }
            ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(R$layout.xui_layout_picker_view_base, this.f15133e.f16291A, false);
            this.f15131c = viewGroup3;
            viewGroup3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            int i10 = this.f15133e.f16308R;
            if (i10 != -1) {
                this.f15131c.setBackgroundColor(i10);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.f15131c.findViewById(R$id.content_container);
            this.f15130b = viewGroup4;
            viewGroup4.setLayoutParams(layoutParams);
        }
        m14940s(true);
    }

    /* renamed from: o */
    public abstract boolean mo14936o();

    /* renamed from: p */
    public boolean m14937p() {
        if (mo14936o()) {
            return false;
        }
        return this.f15131c.getParent() != null || this.f15137i;
    }

    /* renamed from: q */
    public final void m14938q(View view) {
        this.f15133e.f16291A.addView(view);
        if (this.f15141m) {
            this.f15130b.startAnimation(this.f15136h);
        }
    }

    /* renamed from: r */
    public void m14939r() {
        Dialog dialog = this.f15139k;
        if (dialog != null) {
            dialog.setCancelable(this.f15133e.f16311U);
        }
    }

    /* renamed from: s */
    public void m14940s(boolean z9) {
        ViewGroup viewGroup = mo14936o() ? this.f15132d : this.f15131c;
        viewGroup.setFocusable(z9);
        viewGroup.setFocusableInTouchMode(z9);
        if (z9) {
            viewGroup.setOnKeyListener(this.f15142n);
        } else {
            viewGroup.setOnKeyListener(null);
        }
    }

    /* renamed from: t */
    public AbstractC8883a m14941t(boolean z9) {
        ViewGroup viewGroup = this.f15131c;
        if (viewGroup != null) {
            View viewFindViewById = viewGroup.findViewById(R$id.outmost_container);
            if (z9) {
                viewFindViewById.setOnTouchListener(this.f15143o);
                return this;
            }
            viewFindViewById.setOnTouchListener(null);
        }
        return this;
    }

    /* renamed from: u */
    public final void m14942u(Window window) {
        int iM14933l = m14933l(window);
        Context context = this.f15129a;
        int iM5385p = AbstractC6482g.m5385p(context, R$attr.md_dialog_horizontal_margin, AbstractC6480e.m5359e(context, R$dimen.default_md_dialog_horizontal_margin_phone));
        int iM5384o = AbstractC6482g.m5384o(this.f15129a, R$attr.md_dialog_max_width);
        int i10 = iM14933l - (iM5385p * 2);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = Math.min(iM5384o, i10);
        window.setAttributes(layoutParams);
    }

    /* renamed from: v */
    public void m14943v() {
        if (mo14936o()) {
            m14944w();
        } else {
            if (m14937p()) {
                return;
            }
            this.f15137i = true;
            m14938q(this.f15131c);
            this.f15131c.requestFocus();
        }
    }

    /* renamed from: w */
    public final void m14944w() {
        Dialog dialog = this.f15139k;
        if (dialog != null) {
            dialog.show();
        }
    }

    /* renamed from: q3.a$b */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC8883a.this.m14929h();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
