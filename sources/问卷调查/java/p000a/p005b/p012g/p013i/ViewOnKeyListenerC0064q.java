package p000a.p005b.p012g.p013i;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p005b.p014h.C0074c0;
import p000a.p005b.p014h.C0088j0;

/* renamed from: a.b.g.i.q */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0064q extends AbstractC0058k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0060m, View.OnKeyListener {

    /* renamed from: c */
    public final Context f516c;

    /* renamed from: d */
    public final C0054g f517d;

    /* renamed from: e */
    public final C0053f f518e;

    /* renamed from: f */
    public final boolean f519f;

    /* renamed from: g */
    public final int f520g;

    /* renamed from: h */
    public final int f521h;

    /* renamed from: i */
    public final int f522i;

    /* renamed from: j */
    public final C0088j0 f523j;

    /* renamed from: m */
    public PopupWindow.OnDismissListener f526m;

    /* renamed from: n */
    public View f527n;

    /* renamed from: o */
    public View f528o;

    /* renamed from: p */
    public InterfaceC0060m.a f529p;

    /* renamed from: q */
    public ViewTreeObserver f530q;

    /* renamed from: r */
    public boolean f531r;

    /* renamed from: s */
    public boolean f532s;

    /* renamed from: t */
    public int f533t;

    /* renamed from: v */
    public boolean f535v;

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f524k = new a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f525l = new b();

    /* renamed from: u */
    public int f534u = 0;

    /* renamed from: a.b.g.i.q$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (ViewOnKeyListenerC0064q.this.mo171a()) {
                ViewOnKeyListenerC0064q viewOnKeyListenerC0064q = ViewOnKeyListenerC0064q.this;
                if (viewOnKeyListenerC0064q.f523j.f669z) {
                    return;
                }
                View view = viewOnKeyListenerC0064q.f528o;
                if (view == null || !view.isShown()) {
                    ViewOnKeyListenerC0064q.this.dismiss();
                } else {
                    ViewOnKeyListenerC0064q.this.f523j.mo172b();
                }
            }
        }
    }

    /* renamed from: a.b.g.i.q$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0064q.this.f530q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0064q.this.f530q = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0064q viewOnKeyListenerC0064q = ViewOnKeyListenerC0064q.this;
                viewOnKeyListenerC0064q.f530q.removeGlobalOnLayoutListener(viewOnKeyListenerC0064q.f524k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0064q(Context context, C0054g c0054g, View view, int i, int i2, boolean z) {
        this.f516c = context;
        this.f517d = c0054g;
        this.f519f = z;
        this.f518e = new C0053f(c0054g, LayoutInflater.from(context), z, C1088R.layout.abc_popup_menu_item_layout);
        this.f521h = i;
        this.f522i = i2;
        Resources resources = context.getResources();
        this.f520g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1088R.dimen.abc_config_prefDialogWidth));
        this.f527n = view;
        this.f523j = new C0088j0(context, null, i, i2);
        c0054g.m197b(this, context);
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    /* renamed from: a */
    public boolean mo171a() {
        return !this.f531r && this.f523j.mo171a();
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    /* renamed from: b */
    public void mo172b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View view;
        boolean z = true;
        if (!mo171a()) {
            if (this.f531r || (view = this.f527n) == null) {
                z = false;
            } else {
                this.f528o = view;
                this.f523j.f644A.setOnDismissListener(this);
                C0088j0 c0088j0 = this.f523j;
                c0088j0.f661r = this;
                c0088j0.m332s(true);
                View view2 = this.f528o;
                boolean z2 = this.f530q == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f530q = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f524k);
                }
                view2.addOnAttachStateChangeListener(this.f525l);
                C0088j0 c0088j02 = this.f523j;
                c0088j02.f660q = view2;
                c0088j02.f656m = this.f534u;
                if (!this.f532s) {
                    this.f533t = AbstractC0058k.m242n(this.f518e, null, this.f516c, this.f520g);
                    this.f532s = true;
                }
                this.f523j.m331r(this.f533t);
                this.f523j.f644A.setInputMethodMode(2);
                C0088j0 c0088j03 = this.f523j;
                Rect rect = this.f501b;
                Objects.requireNonNull(c0088j03);
                c0088j03.f668y = rect != null ? new Rect(rect) : null;
                this.f523j.mo172b();
                C0074c0 c0074c0 = this.f523j.f647d;
                c0074c0.setOnKeyListener(this);
                if (this.f535v && this.f517d.f445m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f516c).inflate(C1088R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0074c0, false);
                    TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                    if (textView != null) {
                        textView.setText(this.f517d.f445m);
                    }
                    frameLayout.setEnabled(false);
                    c0074c0.addHeaderView(frameLayout, null, false);
                }
                this.f523j.mo329o(this.f518e);
                this.f523j.mo172b();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: c */
    public void mo173c(C0054g c0054g, boolean z) {
        if (c0054g != this.f517d) {
            return;
        }
        dismiss();
        InterfaceC0060m.a aVar = this.f529p;
        if (aVar != null) {
            aVar.mo82c(c0054g, z);
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    public void dismiss() {
        if (mo171a()) {
            this.f523j.dismiss();
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: e */
    public void mo167e(InterfaceC0060m.a aVar) {
        this.f529p = aVar;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    /* renamed from: f */
    public ListView mo174f() {
        return this.f523j.f647d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo175g(p000a.p005b.p012g.p013i.SubMenuC0065r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L78
            a.b.g.i.l r0 = new a.b.g.i.l
            android.content.Context r3 = r9.f516c
            android.view.View r5 = r9.f528o
            boolean r6 = r9.f519f
            int r7 = r9.f521h
            int r8 = r9.f522i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            a.b.g.i.m$a r2 = r9.f529p
            r0.m247d(r2)
            boolean r2 = p000a.p005b.p012g.p013i.AbstractC0058k.m243v(r10)
            r0.f509h = r2
            a.b.g.i.k r3 = r0.f511j
            if (r3 == 0) goto L2a
            r3.mo181p(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f526m
            r0.f512k = r2
            r2 = 0
            r9.f526m = r2
            a.b.g.i.g r2 = r9.f517d
            r2.m198c(r1)
            a.b.h.j0 r2 = r9.f523j
            int r3 = r2.f650g
            boolean r4 = r2.f653j
            if (r4 != 0) goto L40
            r2 = r1
            goto L42
        L40:
            int r2 = r2.f651h
        L42:
            int r4 = r9.f534u
            android.view.View r5 = r9.f527n
            java.util.WeakHashMap<android.view.View, a.h.j.v> r6 = p000a.p031h.p043j.C0266o.f1616a
            int r5 = r5.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5c
            android.view.View r4 = r9.f527n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5c:
            boolean r4 = r0.m245b()
            r5 = 1
            if (r4 == 0) goto L64
            goto L6d
        L64:
            android.view.View r4 = r0.f507f
            if (r4 != 0) goto L6a
            r0 = r1
            goto L6e
        L6a:
            r0.m248e(r3, r2, r5, r5)
        L6d:
            r0 = r5
        L6e:
            if (r0 == 0) goto L78
            a.b.g.i.m$a r0 = r9.f529p
            if (r0 == 0) goto L77
            r0.mo83d(r10)
        L77:
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p012g.p013i.ViewOnKeyListenerC0064q.mo175g(a.b.g.i.r):boolean");
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: h */
    public boolean mo176h() {
        return false;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: i */
    public void mo177i(boolean z) {
        this.f532s = false;
        C0053f c0053f = this.f518e;
        if (c0053f != null) {
            c0053f.notifyDataSetChanged();
        }
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: l */
    public void mo178l(C0054g c0054g) {
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: o */
    public void mo180o(View view) {
        this.f527n = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f531r = true;
        this.f517d.m198c(true);
        ViewTreeObserver viewTreeObserver = this.f530q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f530q = this.f528o.getViewTreeObserver();
            }
            this.f530q.removeGlobalOnLayoutListener(this.f524k);
            this.f530q = null;
        }
        this.f528o.removeOnAttachStateChangeListener(this.f525l);
        PopupWindow.OnDismissListener onDismissListener = this.f526m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: p */
    public void mo181p(boolean z) {
        this.f518e.f428d = z;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: q */
    public void mo182q(int i) {
        this.f534u = i;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: r */
    public void mo183r(int i) {
        this.f523j.f650g = i;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: s */
    public void mo184s(PopupWindow.OnDismissListener onDismissListener) {
        this.f526m = onDismissListener;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: t */
    public void mo185t(boolean z) {
        this.f535v = z;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: u */
    public void mo186u(int i) {
        C0088j0 c0088j0 = this.f523j;
        c0088j0.f651h = i;
        c0088j0.f653j = true;
    }
}
