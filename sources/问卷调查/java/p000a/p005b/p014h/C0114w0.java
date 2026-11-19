package p000a.p005b.p014h;

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
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0494d;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Objects;
import p000a.p005b.C0014b;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p012g.p013i.C0056i;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0275x;

/* renamed from: a.b.h.w0 */
/* loaded from: classes.dex */
public class C0114w0 implements InterfaceC0068a0 {

    /* renamed from: a */
    public Toolbar f822a;

    /* renamed from: b */
    public int f823b;

    /* renamed from: c */
    public View f824c;

    /* renamed from: d */
    public View f825d;

    /* renamed from: e */
    public Drawable f826e;

    /* renamed from: f */
    public Drawable f827f;

    /* renamed from: g */
    public Drawable f828g;

    /* renamed from: h */
    public boolean f829h;

    /* renamed from: i */
    public CharSequence f830i;

    /* renamed from: j */
    public CharSequence f831j;

    /* renamed from: k */
    public CharSequence f832k;

    /* renamed from: l */
    public Window.Callback f833l;

    /* renamed from: m */
    public boolean f834m;

    /* renamed from: n */
    public C0073c f835n;

    /* renamed from: o */
    public int f836o;

    /* renamed from: p */
    public Drawable f837p;

    /* renamed from: a.b.h.w0$a */
    public class a extends C0275x {

        /* renamed from: a */
        public boolean f838a = false;

        /* renamed from: b */
        public final /* synthetic */ int f839b;

        public a(int i) {
            this.f839b = i;
        }

        @Override // p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: a */
        public void mo88a(View view) {
            if (this.f838a) {
                return;
            }
            C0114w0.this.f822a.setVisibility(this.f839b);
        }

        @Override // p000a.p031h.p043j.C0275x, p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: b */
        public void mo97b(View view) {
            C0114w0.this.f822a.setVisibility(0);
        }

        @Override // p000a.p031h.p043j.C0275x, p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: c */
        public void mo257c(View view) {
            this.f838a = true;
        }
    }

    public C0114w0(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.f836o = 0;
        this.f822a = toolbar;
        this.f830i = toolbar.getTitle();
        this.f831j = toolbar.getSubtitle();
        this.f829h = this.f830i != null;
        this.f828g = toolbar.getNavigationIcon();
        C0110u0 c0110u0M414q = C0110u0.m414q(toolbar.getContext(), null, C0014b.f26a, C1088R.attr.actionBarStyle, 0);
        int i = 15;
        this.f837p = c0110u0M414q.m421g(15);
        if (z) {
            CharSequence charSequenceM428n = c0110u0M414q.m428n(27);
            if (!TextUtils.isEmpty(charSequenceM428n)) {
                this.f829h = true;
                this.f830i = charSequenceM428n;
                if ((this.f823b & 8) != 0) {
                    this.f822a.setTitle(charSequenceM428n);
                }
            }
            CharSequence charSequenceM428n2 = c0110u0M414q.m428n(25);
            if (!TextUtils.isEmpty(charSequenceM428n2)) {
                this.f831j = charSequenceM428n2;
                if ((this.f823b & 8) != 0) {
                    this.f822a.setSubtitle(charSequenceM428n2);
                }
            }
            Drawable drawableM421g = c0110u0M414q.m421g(20);
            if (drawableM421g != null) {
                this.f827f = drawableM421g;
                m433y();
            }
            Drawable drawableM421g2 = c0110u0M414q.m421g(17);
            if (drawableM421g2 != null) {
                this.f826e = drawableM421g2;
                m433y();
            }
            if (this.f828g == null && (drawable = this.f837p) != null) {
                this.f828g = drawable;
                m432x();
            }
            mo278u(c0110u0M414q.m424j(10, 0));
            int iM426l = c0110u0M414q.m426l(9, 0);
            if (iM426l != 0) {
                View viewInflate = LayoutInflater.from(this.f822a.getContext()).inflate(iM426l, (ViewGroup) this.f822a, false);
                View view = this.f825d;
                if (view != null && (this.f823b & 16) != 0) {
                    this.f822a.removeView(view);
                }
                this.f825d = viewInflate;
                if (viewInflate != null && (this.f823b & 16) != 0) {
                    this.f822a.addView(viewInflate);
                }
                mo278u(this.f823b | 16);
            }
            int iM425k = c0110u0M414q.m425k(13, 0);
            if (iM425k > 0) {
                ViewGroup.LayoutParams layoutParams = this.f822a.getLayoutParams();
                layoutParams.height = iM425k;
                this.f822a.setLayoutParams(layoutParams);
            }
            int iM419e = c0110u0M414q.m419e(7, -1);
            int iM419e2 = c0110u0M414q.m419e(3, -1);
            if (iM419e >= 0 || iM419e2 >= 0) {
                Toolbar toolbar2 = this.f822a;
                int iMax = Math.max(iM419e, 0);
                int iMax2 = Math.max(iM419e2, 0);
                toolbar2.m1614d();
                toolbar2.f2978u.m365a(iMax, iMax2);
            }
            int iM426l2 = c0110u0M414q.m426l(28, 0);
            if (iM426l2 != 0) {
                Toolbar toolbar3 = this.f822a;
                Context context = toolbar3.getContext();
                toolbar3.f2970m = iM426l2;
                TextView textView = toolbar3.f2960c;
                if (textView != null) {
                    textView.setTextAppearance(context, iM426l2);
                }
            }
            int iM426l3 = c0110u0M414q.m426l(26, 0);
            if (iM426l3 != 0) {
                Toolbar toolbar4 = this.f822a;
                Context context2 = toolbar4.getContext();
                toolbar4.f2971n = iM426l3;
                TextView textView2 = toolbar4.f2961d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iM426l3);
                }
            }
            int iM426l4 = c0110u0M414q.m426l(22, 0);
            if (iM426l4 != 0) {
                this.f822a.setPopupTheme(iM426l4);
            }
        } else {
            if (this.f822a.getNavigationIcon() != null) {
                this.f837p = this.f822a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f823b = i;
        }
        c0110u0M414q.f810b.recycle();
        if (C1088R.string.abc_action_bar_up_description != this.f836o) {
            this.f836o = C1088R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f822a.getNavigationContentDescription())) {
                int i2 = this.f836o;
                this.f832k = i2 != 0 ? mo277t().getString(i2) : null;
                m431w();
            }
        }
        this.f832k = this.f822a.getNavigationContentDescription();
        this.f822a.setNavigationOnClickListener(new ViewOnClickListenerC0112v0(this));
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: a */
    public boolean mo258a() {
        return this.f822a.m1631u();
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: b */
    public void mo259b(Menu menu, InterfaceC0060m.a aVar) {
        C0056i c0056i;
        if (this.f835n == null) {
            C0073c c0073c = new C0073c(this.f822a.getContext());
            this.f835n = c0073c;
            Objects.requireNonNull(c0073c);
        }
        C0073c c0073c2 = this.f835n;
        c0073c2.f375f = aVar;
        Toolbar toolbar = this.f822a;
        C0054g c0054g = (C0054g) menu;
        if (c0054g == null && toolbar.f2959b == null) {
            return;
        }
        toolbar.m1616f();
        C0054g c0054g2 = toolbar.f2959b.f2829q;
        if (c0054g2 == c0054g) {
            return;
        }
        if (c0054g2 != null) {
            c0054g2.m216u(toolbar.f2955K);
            c0054g2.m216u(toolbar.f2956L);
        }
        if (toolbar.f2956L == null) {
            toolbar.f2956L = toolbar.new C0494d();
        }
        c0073c2.f564r = true;
        if (c0054g != null) {
            c0054g.m197b(c0073c2, toolbar.f2968k);
            c0054g.m197b(toolbar.f2956L, toolbar.f2968k);
        } else {
            c0073c2.mo191j(toolbar.f2968k, null);
            Toolbar.C0494d c0494d = toolbar.f2956L;
            C0054g c0054g3 = c0494d.f2987b;
            if (c0054g3 != null && (c0056i = c0494d.f2988c) != null) {
                c0054g3.mo199d(c0056i);
            }
            c0494d.f2987b = null;
            c0073c2.mo177i(true);
            toolbar.f2956L.mo177i(true);
        }
        toolbar.f2959b.setPopupTheme(toolbar.f2969l);
        toolbar.f2959b.setPresenter(c0073c2);
        toolbar.f2955K = c0073c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo260c() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f822a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f2959b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            a.b.h.c r0 = r0.f2833u
            if (r0 == 0) goto L1e
            a.b.h.c$c r3 = r0.f569w
            if (r3 != 0) goto L19
            boolean r0 = r0.m289m()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0114w0.mo260c():boolean");
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    public void collapseActionView() {
        Toolbar.C0494d c0494d = this.f822a.f2956L;
        C0056i c0056i = c0494d == null ? null : c0494d.f2988c;
        if (c0056i != null) {
            c0056i.collapseActionView();
        }
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: d */
    public void mo261d() {
        this.f834m = true;
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: e */
    public boolean mo262e() {
        return this.f822a.m1625o();
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: f */
    public boolean mo263f() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f822a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f2959b) != null && actionMenuView.f2832t;
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: g */
    public boolean mo264g() {
        ActionMenuView actionMenuView = this.f822a.f2959b;
        if (actionMenuView != null) {
            C0073c c0073c = actionMenuView.f2833u;
            if (c0073c != null && c0073c.m287f()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    public CharSequence getTitle() {
        return this.f822a.getTitle();
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: h */
    public void mo265h() {
        C0073c c0073c;
        ActionMenuView actionMenuView = this.f822a.f2959b;
        if (actionMenuView == null || (c0073c = actionMenuView.f2833u) == null) {
            return;
        }
        c0073c.m285a();
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: i */
    public C0273v mo266i(int i, long j) {
        C0273v c0273vM862a = C0266o.m862a(this.f822a);
        c0273vM862a.m886a(i == 0 ? 1.0f : 0.0f);
        c0273vM862a.m888c(j);
        a aVar = new a(i);
        View view = c0273vM862a.f1632a.get();
        if (view != null) {
            c0273vM862a.m890e(view, aVar);
        }
        return c0273vM862a;
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: j */
    public int mo267j() {
        return this.f823b;
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: k */
    public void mo268k(int i) {
        this.f822a.setVisibility(i);
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: l */
    public void mo269l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: m */
    public boolean mo270m() {
        Toolbar.C0494d c0494d = this.f822a.f2956L;
        return (c0494d == null || c0494d.f2988c == null) ? false : true;
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: n */
    public void mo271n(int i) {
        this.f827f = i != 0 ? C0034a.m129a(mo277t(), i) : null;
        m433y();
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: o */
    public void mo272o(C0096n0 c0096n0) {
        View view = this.f824c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f822a;
            if (parent == toolbar) {
                toolbar.removeView(this.f824c);
            }
        }
        this.f824c = null;
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: p */
    public ViewGroup mo273p() {
        return this.f822a;
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: q */
    public void mo274q(boolean z) {
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: r */
    public void mo275r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: s */
    public void mo276s(boolean z) {
        this.f822a.setCollapsible(z);
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    public void setIcon(int i) {
        this.f826e = i != 0 ? C0034a.m129a(mo277t(), i) : null;
        m433y();
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    public void setIcon(Drawable drawable) {
        this.f826e = drawable;
        m433y();
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    public void setWindowCallback(Window.Callback callback) {
        this.f833l = callback;
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f829h) {
            return;
        }
        this.f830i = charSequence;
        if ((this.f823b & 8) != 0) {
            this.f822a.setTitle(charSequence);
        }
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: t */
    public Context mo277t() {
        return this.f822a.getContext();
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: u */
    public void mo278u(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f823b ^ i;
        this.f823b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m431w();
                }
                m432x();
            }
            if ((i2 & 3) != 0) {
                m433y();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f822a.setTitle(this.f830i);
                    toolbar = this.f822a;
                    charSequence = this.f831j;
                } else {
                    charSequence = null;
                    this.f822a.setTitle((CharSequence) null);
                    toolbar = this.f822a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f825d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f822a.addView(view);
            } else {
                this.f822a.removeView(view);
            }
        }
    }

    @Override // p000a.p005b.p014h.InterfaceC0068a0
    /* renamed from: v */
    public int mo279v() {
        return 0;
    }

    /* renamed from: w */
    public final void m431w() {
        if ((this.f823b & 4) != 0) {
            if (TextUtils.isEmpty(this.f832k)) {
                this.f822a.setNavigationContentDescription(this.f836o);
            } else {
                this.f822a.setNavigationContentDescription(this.f832k);
            }
        }
    }

    /* renamed from: x */
    public final void m432x() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f823b & 4) != 0) {
            toolbar = this.f822a;
            drawable = this.f828g;
            if (drawable == null) {
                drawable = this.f837p;
            }
        } else {
            toolbar = this.f822a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: y */
    public final void m433y() {
        Drawable drawable;
        int i = this.f823b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f827f) == null) {
            drawable = this.f826e;
        }
        this.f822a.setLogo(drawable);
    }
}
