package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.widget.C0236v;
import androidx.core.view.C0358u;
import p015c.C1041d;
import p015c.C1044g;

/* renamed from: androidx.appcompat.view.menu.q */
/* loaded from: classes.dex */
final class ViewOnKeyListenerC0135q extends AbstractC0129k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: v */
    private static final int f673v = C1044g.f5894o;

    /* renamed from: b */
    private final Context f674b;

    /* renamed from: c */
    private final C0125g f675c;

    /* renamed from: d */
    private final C0124f f676d;

    /* renamed from: e */
    private final boolean f677e;

    /* renamed from: f */
    private final int f678f;

    /* renamed from: g */
    private final int f679g;

    /* renamed from: h */
    private final int f680h;

    /* renamed from: i */
    final C0236v f681i;

    /* renamed from: l */
    private PopupWindow.OnDismissListener f684l;

    /* renamed from: m */
    private View f685m;

    /* renamed from: n */
    View f686n;

    /* renamed from: o */
    private InterfaceC0131m.a f687o;

    /* renamed from: p */
    ViewTreeObserver f688p;

    /* renamed from: q */
    private boolean f689q;

    /* renamed from: r */
    private boolean f690r;

    /* renamed from: s */
    private int f691s;

    /* renamed from: u */
    private boolean f693u;

    /* renamed from: j */
    final ViewTreeObserver.OnGlobalLayoutListener f682j = new a();

    /* renamed from: k */
    private final View.OnAttachStateChangeListener f683k = new b();

    /* renamed from: t */
    private int f692t = 0;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0135q.this.mo450a() || ViewOnKeyListenerC0135q.this.f681i.m673z()) {
                return;
            }
            View view = ViewOnKeyListenerC0135q.this.f686n;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0135q.this.dismiss();
            } else {
                ViewOnKeyListenerC0135q.this.f681i.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0135q.this.f688p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0135q.this.f688p = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0135q viewOnKeyListenerC0135q = ViewOnKeyListenerC0135q.this;
                viewOnKeyListenerC0135q.f688p.removeGlobalOnLayoutListener(viewOnKeyListenerC0135q.f682j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0135q(Context context, C0125g c0125g, View view, int i4, int i5, boolean z3) {
        this.f674b = context;
        this.f675c = c0125g;
        this.f677e = z3;
        this.f676d = new C0124f(c0125g, LayoutInflater.from(context), z3, f673v);
        this.f679g = i4;
        this.f680h = i5;
        Resources resources = context.getResources();
        this.f678f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1041d.f5775d));
        this.f685m = view;
        this.f681i = new C0236v(context, null, i4, i5);
        c0125g.addMenuPresenter(this, context);
    }

    /* renamed from: q */
    private boolean m533q() {
        View view;
        if (mo450a()) {
            return true;
        }
        if (this.f689q || (view = this.f685m) == null) {
            return false;
        }
        this.f686n = view;
        this.f681i.m653I(this);
        this.f681i.m654J(this);
        this.f681i.m652H(true);
        View view2 = this.f686n;
        boolean z3 = this.f688p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f688p = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f682j);
        }
        view2.addOnAttachStateChangeListener(this.f683k);
        this.f681i.m646B(view2);
        this.f681i.m649E(this.f692t);
        if (!this.f690r) {
            this.f691s = AbstractC0129k.m514e(this.f676d, null, this.f674b, this.f678f);
            this.f690r = true;
        }
        this.f681i.m648D(this.f691s);
        this.f681i.m651G(2);
        this.f681i.m650F(m517d());
        this.f681i.show();
        ListView listViewMo453f = this.f681i.mo453f();
        listViewMo453f.setOnKeyListener(this);
        if (this.f693u && this.f675c.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f674b).inflate(C1044g.f5893n, (ViewGroup) listViewMo453f, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f675c.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            listViewMo453f.addHeaderView(frameLayout, null, false);
        }
        this.f681i.mo634n(this.f676d);
        this.f681i.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    /* renamed from: a */
    public boolean mo450a() {
        return !this.f689q && this.f681i.mo450a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: b */
    public void mo451b(C0125g c0125g) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    public void dismiss() {
        if (mo450a()) {
            this.f681i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    /* renamed from: f */
    public ListView mo453f() {
        return this.f681i.mo453f();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: g */
    public void mo454g(View view) {
        this.f685m = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: i */
    public void mo455i(boolean z3) {
        this.f676d.m473d(z3);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: j */
    public void mo456j(int i4) {
        this.f692t = i4;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: k */
    public void mo457k(int i4) {
        this.f681i.m662j(i4);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: l */
    public void mo458l(PopupWindow.OnDismissListener onDismissListener) {
        this.f684l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: m */
    public void mo459m(boolean z3) {
        this.f693u = z3;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: n */
    public void mo460n(int i4) {
        this.f681i.m661h(i4);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void onCloseMenu(C0125g c0125g, boolean z3) {
        if (c0125g != this.f675c) {
            return;
        }
        dismiss();
        InterfaceC0131m.a aVar = this.f687o;
        if (aVar != null) {
            aVar.onCloseMenu(c0125g, z3);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f689q = true;
        this.f675c.close();
        ViewTreeObserver viewTreeObserver = this.f688p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f688p = this.f686n.getViewTreeObserver();
            }
            this.f688p.removeGlobalOnLayoutListener(this.f682j);
            this.f688p = null;
        }
        this.f686n.removeOnAttachStateChangeListener(this.f683k);
        PopupWindow.OnDismissListener onDismissListener = this.f684l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean onSubMenuSelected(SubMenuC0136r subMenuC0136r) {
        if (subMenuC0136r.hasVisibleItems()) {
            C0130l c0130l = new C0130l(this.f674b, subMenuC0136r, this.f686n, this.f677e, this.f679g, this.f680h);
            c0130l.m529j(this.f687o);
            c0130l.m526g(AbstractC0129k.m515o(subMenuC0136r));
            c0130l.m528i(this.f684l);
            this.f684l = null;
            this.f675c.close(false);
            int iM659b = this.f681i.m659b();
            int iM663l = this.f681i.m663l();
            if ((Gravity.getAbsoluteGravity(this.f692t, C0358u.m1978A(this.f685m)) & 7) == 5) {
                iM659b += this.f685m.getWidth();
            }
            if (c0130l.m532n(iM659b, iM663l)) {
                InterfaceC0131m.a aVar = this.f687o;
                if (aVar == null) {
                    return true;
                }
                aVar.mo252a(subMenuC0136r);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void setCallback(InterfaceC0131m.a aVar) {
        this.f687o = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    public void show() {
        if (!m533q()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void updateMenuView(boolean z3) {
        this.f690r = false;
        C0124f c0124f = this.f676d;
        if (c0124f != null) {
            c0124f.notifyDataSetChanged();
        }
    }
}
