package p000a.p005b.p006c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p005b.p006c.AbstractC0015a;
import p000a.p005b.p012g.AbstractC0040a;
import p000a.p005b.p012g.C0045f;
import p000a.p005b.p012g.C0046g;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p014h.C0073c;
import p000a.p005b.p014h.InterfaceC0068a0;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.C0275x;
import p000a.p031h.p043j.InterfaceC0274w;
import p000a.p031h.p043j.InterfaceC0276y;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.b.c.s */
/* loaded from: classes.dex */
public class C0033s extends AbstractC0015a implements ActionBarOverlayLayout.InterfaceC0466d {

    /* renamed from: a */
    public Context f178a;

    /* renamed from: b */
    public Context f179b;

    /* renamed from: c */
    public ActionBarOverlayLayout f180c;

    /* renamed from: d */
    public ActionBarContainer f181d;

    /* renamed from: e */
    public InterfaceC0068a0 f182e;

    /* renamed from: f */
    public ActionBarContextView f183f;

    /* renamed from: g */
    public View f184g;

    /* renamed from: h */
    public boolean f185h;

    /* renamed from: i */
    public d f186i;

    /* renamed from: j */
    public AbstractC0040a f187j;

    /* renamed from: k */
    public AbstractC0040a.a f188k;

    /* renamed from: l */
    public boolean f189l;

    /* renamed from: m */
    public ArrayList<AbstractC0015a.b> f190m;

    /* renamed from: n */
    public boolean f191n;

    /* renamed from: o */
    public int f192o;

    /* renamed from: p */
    public boolean f193p;

    /* renamed from: q */
    public boolean f194q;

    /* renamed from: r */
    public boolean f195r;

    /* renamed from: s */
    public boolean f196s;

    /* renamed from: t */
    public C0046g f197t;

    /* renamed from: u */
    public boolean f198u;

    /* renamed from: v */
    public boolean f199v;

    /* renamed from: w */
    public final InterfaceC0274w f200w;

    /* renamed from: x */
    public final InterfaceC0274w f201x;

    /* renamed from: y */
    public final InterfaceC0276y f202y;

    /* renamed from: z */
    public static final Interpolator f177z = new AccelerateInterpolator();

    /* renamed from: A */
    public static final Interpolator f176A = new DecelerateInterpolator();

    /* renamed from: a.b.c.s$a */
    public class a extends C0275x {
        public a() {
        }

        @Override // p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: a */
        public void mo88a(View view) {
            View view2;
            C0033s c0033s = C0033s.this;
            if (c0033s.f193p && (view2 = c0033s.f184g) != null) {
                view2.setTranslationY(0.0f);
                C0033s.this.f181d.setTranslationY(0.0f);
            }
            C0033s.this.f181d.setVisibility(8);
            C0033s.this.f181d.setTransitioning(false);
            C0033s c0033s2 = C0033s.this;
            c0033s2.f197t = null;
            AbstractC0040a.a aVar = c0033s2.f188k;
            if (aVar != null) {
                aVar.mo85b(c0033s2.f187j);
                c0033s2.f187j = null;
                c0033s2.f188k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C0033s.this.f180c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    /* renamed from: a.b.c.s$b */
    public class b extends C0275x {
        public b() {
        }

        @Override // p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: a */
        public void mo88a(View view) {
            C0033s c0033s = C0033s.this;
            c0033s.f197t = null;
            c0033s.f181d.requestLayout();
        }
    }

    /* renamed from: a.b.c.s$c */
    public class c implements InterfaceC0276y {
        public c() {
        }
    }

    /* renamed from: a.b.c.s$d */
    public class d extends AbstractC0040a implements C0054g.a {

        /* renamed from: d */
        public final Context f206d;

        /* renamed from: e */
        public final C0054g f207e;

        /* renamed from: f */
        public AbstractC0040a.a f208f;

        /* renamed from: g */
        public WeakReference<View> f209g;

        public d(Context context, AbstractC0040a.a aVar) {
            this.f206d = context;
            this.f208f = aVar;
            C0054g c0054g = new C0054g(context);
            c0054g.f444l = 1;
            this.f207e = c0054g;
            c0054g.f437e = this;
        }

        @Override // p000a.p005b.p012g.p013i.C0054g.a
        /* renamed from: a */
        public void mo79a(C0054g c0054g) {
            if (this.f208f == null) {
                return;
            }
            mo121i();
            C0073c c0073c = C0033s.this.f183f.f544e;
            if (c0073c != null) {
                c0073c.m290n();
            }
        }

        @Override // p000a.p005b.p012g.p013i.C0054g.a
        /* renamed from: b */
        public boolean mo80b(C0054g c0054g, MenuItem menuItem) {
            AbstractC0040a.a aVar = this.f208f;
            if (aVar != null) {
                return aVar.mo86c(this, menuItem);
            }
            return false;
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: c */
        public void mo115c() {
            C0033s c0033s = C0033s.this;
            if (c0033s.f186i != this) {
                return;
            }
            if (!c0033s.f194q) {
                this.f208f.mo85b(this);
            } else {
                c0033s.f187j = this;
                c0033s.f188k = this.f208f;
            }
            this.f208f = null;
            C0033s.this.m111d(false);
            ActionBarContextView actionBarContextView = C0033s.this.f183f;
            if (actionBarContextView.f2781l == null) {
                actionBarContextView.m1573h();
            }
            C0033s.this.f182e.mo273p().sendAccessibilityEvent(32);
            C0033s c0033s2 = C0033s.this;
            c0033s2.f180c.setHideOnContentScrollEnabled(c0033s2.f199v);
            C0033s.this.f186i = null;
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: d */
        public View mo116d() {
            WeakReference<View> weakReference = this.f209g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: e */
        public Menu mo117e() {
            return this.f207e;
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: f */
        public MenuInflater mo118f() {
            return new C0045f(this.f206d);
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: g */
        public CharSequence mo119g() {
            return C0033s.this.f183f.getSubtitle();
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: h */
        public CharSequence mo120h() {
            return C0033s.this.f183f.getTitle();
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: i */
        public void mo121i() {
            if (C0033s.this.f186i != this) {
                return;
            }
            this.f207e.m221z();
            try {
                this.f208f.mo84a(this, this.f207e);
            } finally {
                this.f207e.m220y();
            }
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: j */
        public boolean mo122j() {
            return C0033s.this.f183f.f2789t;
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: k */
        public void mo123k(View view) {
            C0033s.this.f183f.setCustomView(view);
            this.f209g = new WeakReference<>(view);
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: l */
        public void mo124l(int i) throws Resources.NotFoundException {
            C0033s.this.f183f.setSubtitle(C0033s.this.f178a.getResources().getString(i));
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: m */
        public void mo125m(CharSequence charSequence) {
            C0033s.this.f183f.setSubtitle(charSequence);
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: n */
        public void mo126n(int i) throws Resources.NotFoundException {
            C0033s.this.f183f.setTitle(C0033s.this.f178a.getResources().getString(i));
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: o */
        public void mo127o(CharSequence charSequence) {
            C0033s.this.f183f.setTitle(charSequence);
        }

        @Override // p000a.p005b.p012g.AbstractC0040a
        /* renamed from: p */
        public void mo128p(boolean z) {
            this.f286c = z;
            C0033s.this.f183f.setTitleOptional(z);
        }
    }

    public C0033s(Activity activity, boolean z) {
        new ArrayList();
        this.f190m = new ArrayList<>();
        this.f192o = 0;
        this.f193p = true;
        this.f196s = true;
        this.f200w = new a();
        this.f201x = new b();
        this.f202y = new c();
        View decorView = activity.getWindow().getDecorView();
        m112e(decorView);
        if (z) {
            return;
        }
        this.f184g = decorView.findViewById(R.id.content);
    }

    public C0033s(Dialog dialog) {
        new ArrayList();
        this.f190m = new ArrayList<>();
        this.f192o = 0;
        this.f193p = true;
        this.f196s = true;
        this.f200w = new a();
        this.f201x = new b();
        this.f202y = new c();
        m112e(dialog.getWindow().getDecorView());
    }

    @Override // p000a.p005b.p006c.AbstractC0015a
    /* renamed from: a */
    public void mo14a(boolean z) {
        if (z == this.f189l) {
            return;
        }
        this.f189l = z;
        int size = this.f190m.size();
        for (int i = 0; i < size; i++) {
            this.f190m.get(i).m17a(z);
        }
    }

    @Override // p000a.p005b.p006c.AbstractC0015a
    /* renamed from: b */
    public Context mo15b() {
        if (this.f179b == null) {
            TypedValue typedValue = new TypedValue();
            this.f178a.getTheme().resolveAttribute(C1088R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f179b = new ContextThemeWrapper(this.f178a, i);
            } else {
                this.f179b = this.f178a;
            }
        }
        return this.f179b;
    }

    @Override // p000a.p005b.p006c.AbstractC0015a
    /* renamed from: c */
    public void mo16c(boolean z) {
        if (this.f185h) {
            return;
        }
        int i = z ? 4 : 0;
        int iMo267j = this.f182e.mo267j();
        this.f185h = true;
        this.f182e.mo278u((i & 4) | (iMo267j & (-5)));
    }

    /* renamed from: d */
    public void m111d(boolean z) {
        C0273v c0273vMo266i;
        C0273v c0273vM256e;
        if (z) {
            if (!this.f195r) {
                this.f195r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f180c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m114g(false);
            }
        } else if (this.f195r) {
            this.f195r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f180c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m114g(false);
        }
        ActionBarContainer actionBarContainer = this.f181d;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        if (!actionBarContainer.isLaidOut()) {
            if (z) {
                this.f182e.mo268k(4);
                this.f183f.setVisibility(0);
                return;
            } else {
                this.f182e.mo268k(0);
                this.f183f.setVisibility(8);
                return;
            }
        }
        if (z) {
            c0273vM256e = this.f182e.mo266i(4, 100L);
            c0273vMo266i = this.f183f.m256e(0, 200L);
        } else {
            c0273vMo266i = this.f182e.mo266i(0, 200L);
            c0273vM256e = this.f183f.m256e(8, 100L);
        }
        C0046g c0046g = new C0046g();
        c0046g.f345a.add(c0273vM256e);
        View view = c0273vM256e.f1632a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = c0273vMo266i.f1632a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        c0046g.f345a.add(c0273vMo266i);
        c0046g.m162b();
    }

    /* renamed from: e */
    public final void m112e(View view) {
        InterfaceC0068a0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C1088R.id.decor_content_parent);
        this.f180c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(C1088R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC0068a0) {
            wrapper = (InterfaceC0068a0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sbM2079g = C0561a.m2079g("Can't make a decor toolbar out of ");
                sbM2079g.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sbM2079g.toString());
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f182e = wrapper;
        this.f183f = (ActionBarContextView) view.findViewById(C1088R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C1088R.id.action_bar_container);
        this.f181d = actionBarContainer;
        InterfaceC0068a0 interfaceC0068a0 = this.f182e;
        if (interfaceC0068a0 == null || this.f183f == null || actionBarContainer == null) {
            throw new IllegalStateException(C0033s.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f178a = interfaceC0068a0.mo277t();
        boolean z = (this.f182e.mo267j() & 4) != 0;
        if (z) {
            this.f185h = true;
        }
        Context context = this.f178a;
        this.f182e.mo274q((context.getApplicationInfo().targetSdkVersion < 14) || z);
        m113f(context.getResources().getBoolean(C1088R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f178a.obtainStyledAttributes(null, C0014b.f26a, C1088R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f180c;
            if (!actionBarOverlayLayout2.f2806i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f199v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f181d;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public final void m113f(boolean z) {
        this.f191n = z;
        if (z) {
            this.f181d.setTabContainer(null);
            this.f182e.mo272o(null);
        } else {
            this.f182e.mo272o(null);
            this.f181d.setTabContainer(null);
        }
        boolean z2 = this.f182e.mo279v() == 2;
        this.f182e.mo276s(!this.f191n && z2);
        this.f180c.setHasNonEmbeddedTabs(!this.f191n && z2);
    }

    /* renamed from: g */
    public final void m114g(boolean z) {
        View view;
        View view2;
        View view3;
        if (!(this.f195r || !this.f194q)) {
            if (this.f196s) {
                this.f196s = false;
                C0046g c0046g = this.f197t;
                if (c0046g != null) {
                    c0046g.m161a();
                }
                if (this.f192o != 0 || (!this.f198u && !z)) {
                    this.f200w.mo88a(null);
                    return;
                }
                this.f181d.setAlpha(1.0f);
                this.f181d.setTransitioning(true);
                C0046g c0046g2 = new C0046g();
                float f2 = -this.f181d.getHeight();
                if (z) {
                    this.f181d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r9[1];
                }
                C0273v c0273vM862a = C0266o.m862a(this.f181d);
                c0273vM862a.m892g(f2);
                c0273vM862a.m891f(this.f202y);
                if (!c0046g2.f349e) {
                    c0046g2.f345a.add(c0273vM862a);
                }
                if (this.f193p && (view = this.f184g) != null) {
                    C0273v c0273vM862a2 = C0266o.m862a(view);
                    c0273vM862a2.m892g(f2);
                    if (!c0046g2.f349e) {
                        c0046g2.f345a.add(c0273vM862a2);
                    }
                }
                Interpolator interpolator = f177z;
                boolean z2 = c0046g2.f349e;
                if (!z2) {
                    c0046g2.f347c = interpolator;
                }
                if (!z2) {
                    c0046g2.f346b = 250L;
                }
                InterfaceC0274w interfaceC0274w = this.f200w;
                if (!z2) {
                    c0046g2.f348d = interfaceC0274w;
                }
                this.f197t = c0046g2;
                c0046g2.m162b();
                return;
            }
            return;
        }
        if (this.f196s) {
            return;
        }
        this.f196s = true;
        C0046g c0046g3 = this.f197t;
        if (c0046g3 != null) {
            c0046g3.m161a();
        }
        this.f181d.setVisibility(0);
        if (this.f192o == 0 && (this.f198u || z)) {
            this.f181d.setTranslationY(0.0f);
            float f3 = -this.f181d.getHeight();
            if (z) {
                this.f181d.getLocationInWindow(new int[]{0, 0});
                f3 -= r9[1];
            }
            this.f181d.setTranslationY(f3);
            C0046g c0046g4 = new C0046g();
            C0273v c0273vM862a3 = C0266o.m862a(this.f181d);
            c0273vM862a3.m892g(0.0f);
            c0273vM862a3.m891f(this.f202y);
            if (!c0046g4.f349e) {
                c0046g4.f345a.add(c0273vM862a3);
            }
            if (this.f193p && (view3 = this.f184g) != null) {
                view3.setTranslationY(f3);
                C0273v c0273vM862a4 = C0266o.m862a(this.f184g);
                c0273vM862a4.m892g(0.0f);
                if (!c0046g4.f349e) {
                    c0046g4.f345a.add(c0273vM862a4);
                }
            }
            Interpolator interpolator2 = f176A;
            boolean z3 = c0046g4.f349e;
            if (!z3) {
                c0046g4.f347c = interpolator2;
            }
            if (!z3) {
                c0046g4.f346b = 250L;
            }
            InterfaceC0274w interfaceC0274w2 = this.f201x;
            if (!z3) {
                c0046g4.f348d = interfaceC0274w2;
            }
            this.f197t = c0046g4;
            c0046g4.m162b();
        } else {
            this.f181d.setAlpha(1.0f);
            this.f181d.setTranslationY(0.0f);
            if (this.f193p && (view2 = this.f184g) != null) {
                view2.setTranslationY(0.0f);
            }
            this.f201x.mo88a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f180c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}
