package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C0119a;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0336a0;
import androidx.core.view.C0358u;
import androidx.core.view.C0362y;
import com.google.android.material.badge.BadgeDrawable;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p015c.C1038a;
import p015c.C1042e;
import p015c.C1043f;
import p015c.C1045h;
import p015c.C1047j;
import p073d.C2443a;

/* renamed from: androidx.appcompat.widget.h0 */
/* loaded from: classes.dex */
public class C0216h0 implements InterfaceC0230p {

    /* renamed from: a */
    Toolbar f1098a;

    /* renamed from: b */
    private int f1099b;

    /* renamed from: c */
    private View f1100c;

    /* renamed from: d */
    private View f1101d;

    /* renamed from: e */
    private Drawable f1102e;

    /* renamed from: f */
    private Drawable f1103f;

    /* renamed from: g */
    private Drawable f1104g;

    /* renamed from: h */
    private boolean f1105h;

    /* renamed from: i */
    CharSequence f1106i;

    /* renamed from: j */
    private CharSequence f1107j;

    /* renamed from: k */
    private CharSequence f1108k;

    /* renamed from: l */
    Window.Callback f1109l;

    /* renamed from: m */
    boolean f1110m;

    /* renamed from: n */
    private ActionMenuPresenter f1111n;

    /* renamed from: o */
    private int f1112o;

    /* renamed from: p */
    private int f1113p;

    /* renamed from: q */
    private Drawable f1114q;

    /* renamed from: androidx.appcompat.widget.h0$a */
    class a implements View.OnClickListener {

        /* renamed from: a */
        final C0119a f1115a;

        a() {
            this.f1115a = new C0119a(C0216h0.this.f1098a.getContext(), 0, R.id.home, 0, 0, C0216h0.this.f1106i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0216h0 c0216h0 = C0216h0.this;
            Window.Callback callback = c0216h0.f1109l;
            if (callback == null || !c0216h0.f1110m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1115a);
        }
    }

    /* renamed from: androidx.appcompat.widget.h0$b */
    class b extends C0336a0 {

        /* renamed from: a */
        private boolean f1117a = false;

        /* renamed from: b */
        final /* synthetic */ int f1118b;

        b(int i4) {
            this.f1118b = i4;
        }

        @Override // androidx.core.view.C0336a0, androidx.core.view.InterfaceC0363z
        public void onAnimationCancel(View view) {
            this.f1117a = true;
        }

        @Override // androidx.core.view.InterfaceC0363z
        public void onAnimationEnd(View view) {
            if (this.f1117a) {
                return;
            }
            C0216h0.this.f1098a.setVisibility(this.f1118b);
        }

        @Override // androidx.core.view.C0336a0, androidx.core.view.InterfaceC0363z
        public void onAnimationStart(View view) {
            C0216h0.this.f1098a.setVisibility(0);
        }
    }

    public C0216h0(Toolbar toolbar, boolean z3) {
        this(toolbar, z3, C1045h.f5902a, C1042e.f5819n);
    }

    /* renamed from: F */
    private void m846F(CharSequence charSequence) {
        this.f1106i = charSequence;
        if ((this.f1099b & 8) != 0) {
            this.f1098a.setTitle(charSequence);
        }
    }

    /* renamed from: G */
    private void m847G() {
        if ((this.f1099b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1108k)) {
                this.f1098a.setNavigationContentDescription(this.f1113p);
            } else {
                this.f1098a.setNavigationContentDescription(this.f1108k);
            }
        }
    }

    /* renamed from: H */
    private void m848H() {
        if ((this.f1099b & 4) == 0) {
            this.f1098a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1098a;
        Drawable drawable = this.f1104g;
        if (drawable == null) {
            drawable = this.f1114q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: I */
    private void m849I() {
        Drawable drawable;
        int i4 = this.f1099b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) == 0 || (drawable = this.f1103f) == null) {
            drawable = this.f1102e;
        }
        this.f1098a.setLogo(drawable);
    }

    /* renamed from: w */
    private int m850w() {
        if (this.f1098a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1114q = this.f1098a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void m851A(int i4) {
        m852B(i4 == 0 ? null : getContext().getString(i4));
    }

    /* renamed from: B */
    public void m852B(CharSequence charSequence) {
        this.f1108k = charSequence;
        m847G();
    }

    /* renamed from: C */
    public void m853C(Drawable drawable) {
        this.f1104g = drawable;
        m848H();
    }

    /* renamed from: D */
    public void m854D(CharSequence charSequence) {
        this.f1107j = charSequence;
        if ((this.f1099b & 8) != 0) {
            this.f1098a.setSubtitle(charSequence);
        }
    }

    /* renamed from: E */
    public void m855E(CharSequence charSequence) {
        this.f1105h = true;
        m846F(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: a */
    public void mo856a(Menu menu, InterfaceC0131m.a aVar) {
        if (this.f1111n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1098a.getContext());
            this.f1111n = actionMenuPresenter;
            actionMenuPresenter.m436i(C1043f.f5860g);
        }
        this.f1111n.setCallback(aVar);
        this.f1098a.setMenu((C0125g) menu, this.f1111n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: b */
    public boolean mo857b() {
        return this.f1098a.isOverflowMenuShowing();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: c */
    public void mo858c() {
        this.f1110m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    public void collapseActionView() {
        this.f1098a.collapseActionView();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: d */
    public boolean mo859d() {
        return this.f1098a.isOverflowMenuShowPending();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: e */
    public boolean mo860e() {
        return this.f1098a.hideOverflowMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: f */
    public boolean mo861f() {
        return this.f1098a.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: g */
    public boolean mo862g() {
        return this.f1098a.canShowOverflowMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    public Context getContext() {
        return this.f1098a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    public CharSequence getTitle() {
        return this.f1098a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: h */
    public void mo863h() {
        this.f1098a.dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: i */
    public void mo864i(InterfaceC0131m.a aVar, C0125g.a aVar2) {
        this.f1098a.setMenuCallbacks(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: j */
    public void mo865j(C0240z c0240z) {
        View view = this.f1100c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1098a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1100c);
            }
        }
        this.f1100c = c0240z;
        if (c0240z == null || this.f1112o != 2) {
            return;
        }
        this.f1098a.addView(c0240z, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1100c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.f120a = BadgeDrawable.BOTTOM_START;
        c0240z.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: k */
    public ViewGroup mo866k() {
        return this.f1098a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: l */
    public void mo867l(boolean z3) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: m */
    public boolean mo868m() {
        return this.f1098a.hasExpandedActionView();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: n */
    public void mo869n(int i4) {
        View view;
        int i5 = this.f1099b ^ i4;
        this.f1099b = i4;
        if (i5 != 0) {
            if ((i5 & 4) != 0) {
                if ((i4 & 4) != 0) {
                    m847G();
                }
                m848H();
            }
            if ((i5 & 3) != 0) {
                m849I();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    this.f1098a.setTitle(this.f1106i);
                    this.f1098a.setSubtitle(this.f1107j);
                } else {
                    this.f1098a.setTitle((CharSequence) null);
                    this.f1098a.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f1101d) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                this.f1098a.addView(view);
            } else {
                this.f1098a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: o */
    public int mo870o() {
        return this.f1099b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: p */
    public Menu mo871p() {
        return this.f1098a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: q */
    public void mo872q(int i4) {
        m880z(i4 != 0 ? C2443a.m8169d(getContext(), i4) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: r */
    public int mo873r() {
        return this.f1112o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: s */
    public C0362y mo874s(int i4, long j4) {
        return C0358u.m2022c(this.f1098a).m2121a(i4 == 0 ? 1.0f : IGoodView.DEFAULT_TO_ALPHA).m2124d(j4).m2126f(new b(i4));
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    public void setIcon(int i4) {
        setIcon(i4 != 0 ? C2443a.m8169d(getContext(), i4) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    public void setVisibility(int i4) {
        this.f1098a.setVisibility(i4);
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    public void setWindowCallback(Window.Callback callback) {
        this.f1109l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1105h) {
            return;
        }
        m846F(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: t */
    public void mo875t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: u */
    public void mo876u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    /* renamed from: v */
    public void mo877v(boolean z3) {
        this.f1098a.setCollapsible(z3);
    }

    /* renamed from: x */
    public void m878x(View view) {
        View view2 = this.f1101d;
        if (view2 != null && (this.f1099b & 16) != 0) {
            this.f1098a.removeView(view2);
        }
        this.f1101d = view;
        if (view == null || (this.f1099b & 16) == 0) {
            return;
        }
        this.f1098a.addView(view);
    }

    /* renamed from: y */
    public void m879y(int i4) {
        if (i4 == this.f1113p) {
            return;
        }
        this.f1113p = i4;
        if (TextUtils.isEmpty(this.f1098a.getNavigationContentDescription())) {
            m851A(this.f1113p);
        }
    }

    /* renamed from: z */
    public void m880z(Drawable drawable) {
        this.f1103f = drawable;
        m849I();
    }

    public C0216h0(Toolbar toolbar, boolean z3, int i4, int i5) {
        Drawable drawable;
        this.f1112o = 0;
        this.f1113p = 0;
        this.f1098a = toolbar;
        this.f1106i = toolbar.getTitle();
        this.f1107j = toolbar.getSubtitle();
        this.f1105h = this.f1106i != null;
        this.f1104g = toolbar.getNavigationIcon();
        C0214g0 c0214g0M815v = C0214g0.m815v(toolbar.getContext(), null, C1047j.f6052a, C1038a.f5739c, 0);
        this.f1114q = c0214g0M815v.m822g(C1047j.f6108l);
        if (z3) {
            CharSequence charSequenceM831p = c0214g0M815v.m831p(C1047j.f6138r);
            if (!TextUtils.isEmpty(charSequenceM831p)) {
                m855E(charSequenceM831p);
            }
            CharSequence charSequenceM831p2 = c0214g0M815v.m831p(C1047j.f6128p);
            if (!TextUtils.isEmpty(charSequenceM831p2)) {
                m854D(charSequenceM831p2);
            }
            Drawable drawableM822g = c0214g0M815v.m822g(C1047j.f6118n);
            if (drawableM822g != null) {
                m880z(drawableM822g);
            }
            Drawable drawableM822g2 = c0214g0M815v.m822g(C1047j.f6113m);
            if (drawableM822g2 != null) {
                setIcon(drawableM822g2);
            }
            if (this.f1104g == null && (drawable = this.f1114q) != null) {
                m853C(drawable);
            }
            mo869n(c0214g0M815v.m826k(C1047j.f6088h, 0));
            int iM829n = c0214g0M815v.m829n(C1047j.f6083g, 0);
            if (iM829n != 0) {
                m878x(LayoutInflater.from(this.f1098a.getContext()).inflate(iM829n, (ViewGroup) this.f1098a, false));
                mo869n(this.f1099b | 16);
            }
            int iM828m = c0214g0M815v.m828m(C1047j.f6098j, 0);
            if (iM828m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1098a.getLayoutParams();
                layoutParams.height = iM828m;
                this.f1098a.setLayoutParams(layoutParams);
            }
            int iM820e = c0214g0M815v.m820e(C1047j.f6078f, -1);
            int iM820e2 = c0214g0M815v.m820e(C1047j.f6073e, -1);
            if (iM820e >= 0 || iM820e2 >= 0) {
                this.f1098a.setContentInsetsRelative(Math.max(iM820e, 0), Math.max(iM820e2, 0));
            }
            int iM829n2 = c0214g0M815v.m829n(C1047j.f6143s, 0);
            if (iM829n2 != 0) {
                Toolbar toolbar2 = this.f1098a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iM829n2);
            }
            int iM829n3 = c0214g0M815v.m829n(C1047j.f6133q, 0);
            if (iM829n3 != 0) {
                Toolbar toolbar3 = this.f1098a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iM829n3);
            }
            int iM829n4 = c0214g0M815v.m829n(C1047j.f6123o, 0);
            if (iM829n4 != 0) {
                this.f1098a.setPopupTheme(iM829n4);
            }
        } else {
            this.f1099b = m850w();
        }
        c0214g0M815v.m835w();
        m879y(i4);
        this.f1108k = this.f1098a.getNavigationContentDescription();
        this.f1098a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.InterfaceC0230p
    public void setIcon(Drawable drawable) {
        this.f1102e = drawable;
        m849I();
    }
}
