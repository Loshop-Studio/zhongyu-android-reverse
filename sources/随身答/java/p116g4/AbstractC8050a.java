package p116g4;

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
import com.xuexiang.xui.utils.AbstractC6799e;
import com.xuexiang.xui.utils.AbstractC6801g;
import p146j4.C8213a;
import p156k4.InterfaceC8271b;
import p168l4.AbstractC8886c;

/* renamed from: g4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8050a {

    /* renamed from: a */
    public Context f13641a;

    /* renamed from: b */
    public ViewGroup f13642b;

    /* renamed from: c */
    public ViewGroup f13643c;

    /* renamed from: d */
    public ViewGroup f13644d;

    /* renamed from: e */
    public C8213a f13645e;

    /* renamed from: f */
    public boolean f13646f;

    /* renamed from: g */
    public Animation f13647g;

    /* renamed from: h */
    public Animation f13648h;

    /* renamed from: i */
    public boolean f13649i;

    /* renamed from: k */
    public Dialog f13651k;

    /* renamed from: l */
    public View f13652l;

    /* renamed from: j */
    public int f13650j = 80;

    /* renamed from: m */
    public boolean f13653m = true;

    /* renamed from: n */
    public View.OnKeyListener f13654n = new d();

    /* renamed from: o */
    public final View.OnTouchListener f13655o = new e();

    /* renamed from: g4.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC8050a.this.m12728f();
        }
    }

    /* renamed from: g4.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC8050a abstractC8050a = AbstractC8050a.this;
            abstractC8050a.f13645e.f14234A.removeView(abstractC8050a.f13643c);
            AbstractC8050a.this.f13649i = false;
            AbstractC8050a.this.f13646f = false;
            AbstractC8050a.m12726d(AbstractC8050a.this);
        }
    }

    /* renamed from: g4.a$d */
    public class d implements View.OnKeyListener {
        public d() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            if (i9 != 4 || keyEvent.getAction() != 0 || !AbstractC8050a.this.m12738p()) {
                return false;
            }
            AbstractC8050a.this.m12728f();
            return true;
        }
    }

    /* renamed from: g4.a$e */
    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            AbstractC8050a.this.m12728f();
            return false;
        }
    }

    /* renamed from: g4.a$f */
    public class f implements DialogInterface.OnDismissListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            AbstractC8050a.m12726d(AbstractC8050a.this);
        }
    }

    public AbstractC8050a(Context context) {
        this.f13641a = context;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC8271b m12726d(AbstractC8050a abstractC8050a) {
        abstractC8050a.getClass();
        return null;
    }

    /* renamed from: e */
    public void m12727e() {
        if (this.f13644d != null) {
            Dialog dialog = new Dialog(this.f13641a, R$style.XUIDialog_Custom);
            this.f13651k = dialog;
            dialog.setCancelable(this.f13645e.f14254U);
            this.f13651k.setContentView(this.f13644d);
            Window window = this.f13651k.getWindow();
            if (window != null) {
                window.setWindowAnimations(R$style.picker_view_scale_anim);
                window.setGravity(17);
                m12743u(window);
            }
            this.f13651k.setOnDismissListener(new f());
        }
    }

    /* renamed from: f */
    public void m12728f() {
        if (mo12737o()) {
            m12729g();
            return;
        }
        if (this.f13646f) {
            return;
        }
        if (this.f13653m) {
            this.f13647g.setAnimationListener(new b());
            this.f13642b.startAnimation(this.f13647g);
        } else {
            m12730h();
        }
        this.f13646f = true;
    }

    /* renamed from: g */
    public final void m12729g() {
        Dialog dialog = this.f13651k;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: h */
    public void m12730h() {
        this.f13645e.f14234A.post(new c());
    }

    /* renamed from: i */
    public View m12731i(int i9) {
        return this.f13642b.findViewById(i9);
    }

    /* renamed from: j */
    public final Animation m12732j() {
        return AnimationUtils.loadAnimation(this.f13641a, AbstractC8886c.m13810a(this.f13650j, true));
    }

    /* renamed from: k */
    public final Animation m12733k() {
        return AnimationUtils.loadAnimation(this.f13641a, AbstractC8886c.m13810a(this.f13650j, false));
    }

    /* renamed from: l */
    public final int m12734l(Window window) {
        Display defaultDisplay = window.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x;
    }

    /* renamed from: m */
    public void m12735m() {
        this.f13648h = m12732j();
        this.f13647g = m12733k();
    }

    /* renamed from: n */
    public void m12736n() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13641a);
        if (mo12737o()) {
            ViewGroup viewGroup = (ViewGroup) layoutInflaterFrom.inflate(R$layout.xui_layout_picker_view_base, (ViewGroup) null, false);
            this.f13644d = viewGroup;
            viewGroup.setBackgroundColor(0);
            ViewGroup viewGroup2 = (ViewGroup) this.f13644d.findViewById(R$id.content_container);
            this.f13642b = viewGroup2;
            layoutParams.leftMargin = 30;
            layoutParams.rightMargin = 30;
            viewGroup2.setLayoutParams(layoutParams);
            m12727e();
            this.f13644d.setOnClickListener(new a());
        } else {
            C8213a c8213a = this.f13645e;
            if (c8213a.f14234A == null) {
                c8213a.f14234A = (ViewGroup) ((Activity) this.f13641a).getWindow().getDecorView();
            }
            ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(R$layout.xui_layout_picker_view_base, this.f13645e.f14234A, false);
            this.f13643c = viewGroup3;
            viewGroup3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            int i9 = this.f13645e.f14251R;
            if (i9 != -1) {
                this.f13643c.setBackgroundColor(i9);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.f13643c.findViewById(R$id.content_container);
            this.f13642b = viewGroup4;
            viewGroup4.setLayoutParams(layoutParams);
        }
        m12741s(true);
    }

    /* renamed from: o */
    public abstract boolean mo12737o();

    /* renamed from: p */
    public boolean m12738p() {
        if (mo12737o()) {
            return false;
        }
        return this.f13643c.getParent() != null || this.f13649i;
    }

    /* renamed from: q */
    public final void m12739q(View view) {
        this.f13645e.f14234A.addView(view);
        if (this.f13653m) {
            this.f13642b.startAnimation(this.f13648h);
        }
    }

    /* renamed from: r */
    public void m12740r() {
        Dialog dialog = this.f13651k;
        if (dialog != null) {
            dialog.setCancelable(this.f13645e.f14254U);
        }
    }

    /* renamed from: s */
    public void m12741s(boolean z9) {
        ViewGroup viewGroup = mo12737o() ? this.f13644d : this.f13643c;
        viewGroup.setFocusable(z9);
        viewGroup.setFocusableInTouchMode(z9);
        if (z9) {
            viewGroup.setOnKeyListener(this.f13654n);
        } else {
            viewGroup.setOnKeyListener(null);
        }
    }

    /* renamed from: t */
    public AbstractC8050a m12742t(boolean z9) {
        ViewGroup viewGroup = this.f13643c;
        if (viewGroup != null) {
            View viewFindViewById = viewGroup.findViewById(R$id.outmost_container);
            if (z9) {
                viewFindViewById.setOnTouchListener(this.f13655o);
                return this;
            }
            viewFindViewById.setOnTouchListener(null);
        }
        return this;
    }

    /* renamed from: u */
    public final void m12743u(Window window) {
        int iM12734l = m12734l(window);
        int iM6482o = AbstractC6801g.m6482o(this.f13641a, R$attr.md_dialog_horizontal_margin, AbstractC6799e.m6459d(R$dimen.default_md_dialog_horizontal_margin_phone));
        int iM6481n = AbstractC6801g.m6481n(this.f13641a, R$attr.md_dialog_max_width);
        int i9 = iM12734l - (iM6482o * 2);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = Math.min(iM6481n, i9);
        window.setAttributes(layoutParams);
    }

    /* renamed from: v */
    public void m12744v() {
        if (mo12737o()) {
            m12745w();
        } else {
            if (m12738p()) {
                return;
            }
            this.f13649i = true;
            m12739q(this.f13643c);
            this.f13643c.requestFocus();
        }
    }

    /* renamed from: w */
    public final void m12745w() {
        Dialog dialog = this.f13651k;
        if (dialog != null) {
            dialog.show();
        }
    }

    /* renamed from: g4.a$b */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            AbstractC8050a.this.m12730h();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
