package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p005b.p014h.C0088j0;
import p000a.p005b.p014h.InterfaceC0086i0;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.b.g.i.d */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0051d extends AbstractC0058k implements InterfaceC0060m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public PopupWindow.OnDismissListener f382A;

    /* renamed from: B */
    public boolean f383B;

    /* renamed from: c */
    public final Context f384c;

    /* renamed from: d */
    public final int f385d;

    /* renamed from: e */
    public final int f386e;

    /* renamed from: f */
    public final int f387f;

    /* renamed from: g */
    public final boolean f388g;

    /* renamed from: h */
    public final Handler f389h;

    /* renamed from: p */
    public View f397p;

    /* renamed from: q */
    public View f398q;

    /* renamed from: r */
    public int f399r;

    /* renamed from: s */
    public boolean f400s;

    /* renamed from: t */
    public boolean f401t;

    /* renamed from: u */
    public int f402u;

    /* renamed from: v */
    public int f403v;

    /* renamed from: x */
    public boolean f405x;

    /* renamed from: y */
    public InterfaceC0060m.a f406y;

    /* renamed from: z */
    public ViewTreeObserver f407z;

    /* renamed from: i */
    public final List<C0054g> f390i = new ArrayList();

    /* renamed from: j */
    public final List<d> f391j = new ArrayList();

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f392k = new a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f393l = new b();

    /* renamed from: m */
    public final InterfaceC0086i0 f394m = new c();

    /* renamed from: n */
    public int f395n = 0;

    /* renamed from: o */
    public int f396o = 0;

    /* renamed from: w */
    public boolean f404w = false;

    /* renamed from: a.b.g.i.d$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!ViewOnKeyListenerC0051d.this.mo171a() || ViewOnKeyListenerC0051d.this.f391j.size() <= 0 || ViewOnKeyListenerC0051d.this.f391j.get(0).f415a.f669z) {
                return;
            }
            View view = ViewOnKeyListenerC0051d.this.f398q;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0051d.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0051d.this.f391j.iterator();
            while (it.hasNext()) {
                it.next().f415a.mo172b();
            }
        }
    }

    /* renamed from: a.b.g.i.d$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0051d.this.f407z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0051d.this.f407z = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0051d viewOnKeyListenerC0051d = ViewOnKeyListenerC0051d.this;
                viewOnKeyListenerC0051d.f407z.removeGlobalOnLayoutListener(viewOnKeyListenerC0051d.f392k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a.b.g.i.d$c */
    public class c implements InterfaceC0086i0 {

        /* renamed from: a.b.g.i.d$c$a */
        public class a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ d f411b;

            /* renamed from: c */
            public final /* synthetic */ MenuItem f412c;

            /* renamed from: d */
            public final /* synthetic */ C0054g f413d;

            public a(d dVar, MenuItem menuItem, C0054g c0054g) {
                this.f411b = dVar;
                this.f412c = menuItem;
                this.f413d = c0054g;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f411b;
                if (dVar != null) {
                    ViewOnKeyListenerC0051d.this.f383B = true;
                    dVar.f416b.m198c(false);
                    ViewOnKeyListenerC0051d.this.f383B = false;
                }
                if (this.f412c.isEnabled() && this.f412c.hasSubMenu()) {
                    this.f413d.m213r(this.f412c, 4);
                }
            }
        }

        public c() {
        }

        @Override // p000a.p005b.p014h.InterfaceC0086i0
        /* renamed from: h */
        public void mo188h(C0054g c0054g, MenuItem menuItem) {
            ViewOnKeyListenerC0051d.this.f389h.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0051d.this.f391j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0054g == ViewOnKeyListenerC0051d.this.f391j.get(i).f416b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ViewOnKeyListenerC0051d.this.f389h.postAtTime(new a(i2 < ViewOnKeyListenerC0051d.this.f391j.size() ? ViewOnKeyListenerC0051d.this.f391j.get(i2) : null, menuItem, c0054g), c0054g, SystemClock.uptimeMillis() + 200);
        }

        @Override // p000a.p005b.p014h.InterfaceC0086i0
        /* renamed from: k */
        public void mo189k(C0054g c0054g, MenuItem menuItem) {
            ViewOnKeyListenerC0051d.this.f389h.removeCallbacksAndMessages(c0054g);
        }
    }

    /* renamed from: a.b.g.i.d$d */
    public static class d {

        /* renamed from: a */
        public final C0088j0 f415a;

        /* renamed from: b */
        public final C0054g f416b;

        /* renamed from: c */
        public final int f417c;

        public d(C0088j0 c0088j0, C0054g c0054g, int i) {
            this.f415a = c0088j0;
            this.f416b = c0054g;
            this.f417c = i;
        }
    }

    public ViewOnKeyListenerC0051d(Context context, View view, int i, int i2, boolean z) {
        this.f384c = context;
        this.f397p = view;
        this.f386e = i;
        this.f387f = i2;
        this.f388g = z;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        this.f399r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f385d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1088R.dimen.abc_config_prefDialogWidth));
        this.f389h = new Handler();
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    /* renamed from: a */
    public boolean mo171a() {
        return this.f391j.size() > 0 && this.f391j.get(0).f415a.mo171a();
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    /* renamed from: b */
    public void mo172b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo171a()) {
            return;
        }
        Iterator<C0054g> it = this.f390i.iterator();
        while (it.hasNext()) {
            m187w(it.next());
        }
        this.f390i.clear();
        View view = this.f397p;
        this.f398q = view;
        if (view != null) {
            boolean z = this.f407z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f407z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f392k);
            }
            this.f398q.addOnAttachStateChangeListener(this.f393l);
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: c */
    public void mo173c(C0054g c0054g, boolean z) {
        int i;
        int size = this.f391j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (c0054g == this.f391j.get(i2).f416b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < this.f391j.size()) {
            this.f391j.get(i3).f416b.m198c(false);
        }
        d dVarRemove = this.f391j.remove(i2);
        dVarRemove.f416b.m216u(this);
        if (this.f383B) {
            dVarRemove.f415a.f644A.setExitTransition(null);
            dVarRemove.f415a.f644A.setAnimationStyle(0);
        }
        dVarRemove.f415a.dismiss();
        int size2 = this.f391j.size();
        if (size2 > 0) {
            i = this.f391j.get(size2 - 1).f417c;
        } else {
            View view = this.f397p;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            i = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        this.f399r = i;
        if (size2 != 0) {
            if (z) {
                this.f391j.get(0).f416b.m198c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0060m.a aVar = this.f406y;
        if (aVar != null) {
            aVar.mo82c(c0054g, true);
        }
        ViewTreeObserver viewTreeObserver = this.f407z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f407z.removeGlobalOnLayoutListener(this.f392k);
            }
            this.f407z = null;
        }
        this.f398q.removeOnAttachStateChangeListener(this.f393l);
        this.f382A.onDismiss();
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    public void dismiss() {
        int size = this.f391j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f391j.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f415a.mo171a()) {
                    dVar.f415a.dismiss();
                }
            }
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: e */
    public void mo167e(InterfaceC0060m.a aVar) {
        this.f406y = aVar;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0063p
    /* renamed from: f */
    public ListView mo174f() {
        if (this.f391j.isEmpty()) {
            return null;
        }
        return this.f391j.get(r0.size() - 1).f415a.f647d;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: g */
    public boolean mo175g(SubMenuC0065r subMenuC0065r) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (d dVar : this.f391j) {
            if (subMenuC0065r == dVar.f416b) {
                dVar.f415a.f647d.requestFocus();
                return true;
            }
        }
        if (!subMenuC0065r.hasVisibleItems()) {
            return false;
        }
        subMenuC0065r.m197b(this, this.f384c);
        if (mo171a()) {
            m187w(subMenuC0065r);
        } else {
            this.f390i.add(subMenuC0065r);
        }
        InterfaceC0060m.a aVar = this.f406y;
        if (aVar != null) {
            aVar.mo83d(subMenuC0065r);
        }
        return true;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: h */
    public boolean mo176h() {
        return false;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: i */
    public void mo177i(boolean z) {
        Iterator<d> it = this.f391j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f415a.f647d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0053f) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: l */
    public void mo178l(C0054g c0054g) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c0054g.m197b(this, this.f384c);
        if (mo171a()) {
            m187w(c0054g);
        } else {
            this.f390i.add(c0054g);
        }
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: m */
    public boolean mo179m() {
        return false;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: o */
    public void mo180o(View view) {
        if (this.f397p != view) {
            this.f397p = view;
            int i = this.f395n;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            this.f396o = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f391j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f391j.get(i);
            if (!dVar.f415a.mo171a()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f416b.m198c(false);
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
        this.f404w = z;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: q */
    public void mo182q(int i) {
        if (this.f395n != i) {
            this.f395n = i;
            View view = this.f397p;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            this.f396o = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: r */
    public void mo183r(int i) {
        this.f400s = true;
        this.f402u = i;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: s */
    public void mo184s(PopupWindow.OnDismissListener onDismissListener) {
        this.f382A = onDismissListener;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: t */
    public void mo185t(boolean z) {
        this.f405x = z;
    }

    @Override // p000a.p005b.p012g.p013i.AbstractC0058k
    /* renamed from: u */
    public void mo186u(int i) {
        this.f401t = true;
        this.f403v = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m187w(p000a.p005b.p012g.p013i.C0054g r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p012g.p013i.ViewOnKeyListenerC0051d.m187w(a.b.g.i.g):void");
    }
}
