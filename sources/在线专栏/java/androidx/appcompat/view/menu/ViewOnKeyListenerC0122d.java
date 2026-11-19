package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.widget.C0236v;
import androidx.appcompat.widget.InterfaceC0235u;
import androidx.core.view.C0342e;
import androidx.core.view.C0358u;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p015c.C1041d;
import p015c.C1044g;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
final class ViewOnKeyListenerC0122d extends AbstractC0129k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: B */
    private static final int f556B = C1044g.f5886g;

    /* renamed from: A */
    boolean f557A;

    /* renamed from: b */
    private final Context f558b;

    /* renamed from: c */
    private final int f559c;

    /* renamed from: d */
    private final int f560d;

    /* renamed from: e */
    private final int f561e;

    /* renamed from: f */
    private final boolean f562f;

    /* renamed from: g */
    final Handler f563g;

    /* renamed from: o */
    private View f571o;

    /* renamed from: p */
    View f572p;

    /* renamed from: r */
    private boolean f574r;

    /* renamed from: s */
    private boolean f575s;

    /* renamed from: t */
    private int f576t;

    /* renamed from: u */
    private int f577u;

    /* renamed from: w */
    private boolean f579w;

    /* renamed from: x */
    private InterfaceC0131m.a f580x;

    /* renamed from: y */
    ViewTreeObserver f581y;

    /* renamed from: z */
    private PopupWindow.OnDismissListener f582z;

    /* renamed from: h */
    private final List<C0125g> f564h = new ArrayList();

    /* renamed from: i */
    final List<d> f565i = new ArrayList();

    /* renamed from: j */
    final ViewTreeObserver.OnGlobalLayoutListener f566j = new a();

    /* renamed from: k */
    private final View.OnAttachStateChangeListener f567k = new b();

    /* renamed from: l */
    private final InterfaceC0235u f568l = new c();

    /* renamed from: m */
    private int f569m = 0;

    /* renamed from: n */
    private int f570n = 0;

    /* renamed from: v */
    private boolean f578v = false;

    /* renamed from: q */
    private int f573q = m447u();

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0122d.this.mo450a() || ViewOnKeyListenerC0122d.this.f565i.size() <= 0 || ViewOnKeyListenerC0122d.this.f565i.get(0).f590a.m673z()) {
                return;
            }
            View view = ViewOnKeyListenerC0122d.this.f572p;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0122d.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0122d.this.f565i.iterator();
            while (it.hasNext()) {
                it.next().f590a.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0122d.this.f581y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0122d.this.f581y = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0122d viewOnKeyListenerC0122d = ViewOnKeyListenerC0122d.this;
                viewOnKeyListenerC0122d.f581y.removeGlobalOnLayoutListener(viewOnKeyListenerC0122d.f566j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class c implements InterfaceC0235u {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ d f586a;

            /* renamed from: b */
            final /* synthetic */ MenuItem f587b;

            /* renamed from: c */
            final /* synthetic */ C0125g f588c;

            a(d dVar, MenuItem menuItem, C0125g c0125g) {
                this.f586a = dVar;
                this.f587b = menuItem;
                this.f588c = c0125g;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f586a;
                if (dVar != null) {
                    ViewOnKeyListenerC0122d.this.f557A = true;
                    dVar.f591b.close(false);
                    ViewOnKeyListenerC0122d.this.f557A = false;
                }
                if (this.f587b.isEnabled() && this.f587b.hasSubMenu()) {
                    this.f588c.performItemAction(this.f587b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0235u
        /* renamed from: c */
        public void mo461c(C0125g c0125g, MenuItem menuItem) {
            ViewOnKeyListenerC0122d.this.f563g.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0122d.this.f565i.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                } else if (c0125g == ViewOnKeyListenerC0122d.this.f565i.get(i4).f591b) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 == -1) {
                return;
            }
            int i5 = i4 + 1;
            ViewOnKeyListenerC0122d.this.f563g.postAtTime(new a(i5 < ViewOnKeyListenerC0122d.this.f565i.size() ? ViewOnKeyListenerC0122d.this.f565i.get(i5) : null, menuItem, c0125g), c0125g, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0235u
        /* renamed from: d */
        public void mo462d(C0125g c0125g, MenuItem menuItem) {
            ViewOnKeyListenerC0122d.this.f563g.removeCallbacksAndMessages(c0125g);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class d {

        /* renamed from: a */
        public final C0236v f590a;

        /* renamed from: b */
        public final C0125g f591b;

        /* renamed from: c */
        public final int f592c;

        public d(C0236v c0236v, C0125g c0125g, int i4) {
            this.f590a = c0236v;
            this.f591b = c0125g;
            this.f592c = i4;
        }

        /* renamed from: a */
        public ListView m463a() {
            return this.f590a.mo453f();
        }
    }

    public ViewOnKeyListenerC0122d(Context context, View view, int i4, int i5, boolean z3) {
        this.f558b = context;
        this.f571o = view;
        this.f560d = i4;
        this.f561e = i5;
        this.f562f = z3;
        Resources resources = context.getResources();
        this.f559c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1041d.f5775d));
        this.f563g = new Handler();
    }

    /* renamed from: q */
    private C0236v m443q() {
        C0236v c0236v = new C0236v(this.f558b, null, this.f560d, this.f561e);
        c0236v.m1008R(this.f568l);
        c0236v.m654J(this);
        c0236v.m653I(this);
        c0236v.m646B(this.f571o);
        c0236v.m649E(this.f570n);
        c0236v.m652H(true);
        c0236v.m651G(2);
        return c0236v;
    }

    /* renamed from: r */
    private int m444r(C0125g c0125g) {
        int size = this.f565i.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (c0125g == this.f565i.get(i4).f591b) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: s */
    private MenuItem m445s(C0125g c0125g, C0125g c0125g2) {
        int size = c0125g.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = c0125g.getItem(i4);
            if (item.hasSubMenu() && c0125g2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: t */
    private View m446t(d dVar, C0125g c0125g) {
        C0124f c0124f;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemM445s = m445s(dVar.f591b, c0125g);
        if (menuItemM445s == null) {
            return null;
        }
        ListView listViewM463a = dVar.m463a();
        ListAdapter adapter = listViewM463a.getAdapter();
        int i4 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0124f = (C0124f) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0124f = (C0124f) adapter;
            headersCount = 0;
        }
        int count = c0124f.getCount();
        while (true) {
            if (i4 >= count) {
                i4 = -1;
                break;
            }
            if (menuItemM445s == c0124f.getItem(i4)) {
                break;
            }
            i4++;
        }
        if (i4 != -1 && (firstVisiblePosition = (i4 + headersCount) - listViewM463a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM463a.getChildCount()) {
            return listViewM463a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: u */
    private int m447u() {
        return C0358u.m1978A(this.f571o) == 1 ? 0 : 1;
    }

    /* renamed from: v */
    private int m448v(int i4) {
        List<d> list = this.f565i;
        ListView listViewM463a = list.get(list.size() - 1).m463a();
        int[] iArr = new int[2];
        listViewM463a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f572p.getWindowVisibleDisplayFrame(rect);
        return this.f573q == 1 ? (iArr[0] + listViewM463a.getWidth()) + i4 > rect.right ? 0 : 1 : iArr[0] - i4 < 0 ? 1 : 0;
    }

    /* renamed from: w */
    private void m449w(C0125g c0125g) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d dVar;
        View viewM446t;
        int i4;
        int i5;
        int i6;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f558b);
        C0124f c0124f = new C0124f(c0125g, layoutInflaterFrom, this.f562f, f556B);
        if (!mo450a() && this.f578v) {
            c0124f.m473d(true);
        } else if (mo450a()) {
            c0124f.m473d(AbstractC0129k.m515o(c0125g));
        }
        int iM514e = AbstractC0129k.m514e(c0124f, null, this.f558b, this.f559c);
        C0236v c0236vM443q = m443q();
        c0236vM443q.mo634n(c0124f);
        c0236vM443q.m648D(iM514e);
        c0236vM443q.m649E(this.f570n);
        if (this.f565i.size() > 0) {
            List<d> list = this.f565i;
            dVar = list.get(list.size() - 1);
            viewM446t = m446t(dVar, c0125g);
        } else {
            dVar = null;
            viewM446t = null;
        }
        if (viewM446t != null) {
            c0236vM443q.m1009S(false);
            c0236vM443q.m1006P(null);
            int iM448v = m448v(iM514e);
            boolean z3 = iM448v == 1;
            this.f573q = iM448v;
            if (Build.VERSION.SDK_INT >= 26) {
                c0236vM443q.m646B(viewM446t);
                i5 = 0;
                i4 = 0;
            } else {
                int[] iArr = new int[2];
                this.f571o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewM446t.getLocationOnScreen(iArr2);
                if ((this.f570n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f571o.getWidth();
                    iArr2[0] = iArr2[0] + viewM446t.getWidth();
                }
                i4 = iArr2[0] - iArr[0];
                i5 = iArr2[1] - iArr[1];
            }
            if ((this.f570n & 5) == 5) {
                if (!z3) {
                    iM514e = viewM446t.getWidth();
                    i6 = i4 - iM514e;
                }
                i6 = i4 + iM514e;
            } else {
                if (z3) {
                    iM514e = viewM446t.getWidth();
                    i6 = i4 + iM514e;
                }
                i6 = i4 - iM514e;
            }
            c0236vM443q.m662j(i6);
            c0236vM443q.m655K(true);
            c0236vM443q.m661h(i5);
        } else {
            if (this.f574r) {
                c0236vM443q.m662j(this.f576t);
            }
            if (this.f575s) {
                c0236vM443q.m661h(this.f577u);
            }
            c0236vM443q.m650F(m517d());
        }
        this.f565i.add(new d(c0236vM443q, c0125g, this.f573q));
        c0236vM443q.show();
        ListView listViewMo453f = c0236vM443q.mo453f();
        listViewMo453f.setOnKeyListener(this);
        if (dVar == null && this.f579w && c0125g.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C1044g.f5893n, (ViewGroup) listViewMo453f, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0125g.getHeaderTitle());
            listViewMo453f.addHeaderView(frameLayout, null, false);
            c0236vM443q.show();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    /* renamed from: a */
    public boolean mo450a() {
        return this.f565i.size() > 0 && this.f565i.get(0).f590a.mo450a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: b */
    public void mo451b(C0125g c0125g) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c0125g.addMenuPresenter(this, this.f558b);
        if (mo450a()) {
            m449w(c0125g);
        } else {
            this.f564h.add(c0125g);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: c */
    protected boolean mo452c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    public void dismiss() {
        int size = this.f565i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f565i.toArray(new d[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                d dVar = dVarArr[i4];
                if (dVar.f590a.mo450a()) {
                    dVar.f590a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    /* renamed from: f */
    public ListView mo453f() {
        if (this.f565i.isEmpty()) {
            return null;
        }
        return this.f565i.get(r0.size() - 1).m463a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: g */
    public void mo454g(View view) {
        if (this.f571o != view) {
            this.f571o = view;
            this.f570n = C0342e.m1928b(this.f569m, C0358u.m1978A(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: i */
    public void mo455i(boolean z3) {
        this.f578v = z3;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: j */
    public void mo456j(int i4) {
        if (this.f569m != i4) {
            this.f569m = i4;
            this.f570n = C0342e.m1928b(i4, C0358u.m1978A(this.f571o));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: k */
    public void mo457k(int i4) {
        this.f574r = true;
        this.f576t = i4;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: l */
    public void mo458l(PopupWindow.OnDismissListener onDismissListener) {
        this.f582z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: m */
    public void mo459m(boolean z3) {
        this.f579w = z3;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0129k
    /* renamed from: n */
    public void mo460n(int i4) {
        this.f575s = true;
        this.f577u = i4;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void onCloseMenu(C0125g c0125g, boolean z3) {
        int iM444r = m444r(c0125g);
        if (iM444r < 0) {
            return;
        }
        int i4 = iM444r + 1;
        if (i4 < this.f565i.size()) {
            this.f565i.get(i4).f591b.close(false);
        }
        d dVarRemove = this.f565i.remove(iM444r);
        dVarRemove.f591b.removeMenuPresenter(this);
        if (this.f557A) {
            dVarRemove.f590a.m1007Q(null);
            dVarRemove.f590a.m647C(0);
        }
        dVarRemove.f590a.dismiss();
        int size = this.f565i.size();
        if (size > 0) {
            this.f573q = this.f565i.get(size - 1).f592c;
        } else {
            this.f573q = m447u();
        }
        if (size != 0) {
            if (z3) {
                this.f565i.get(0).f591b.close(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0131m.a aVar = this.f580x;
        if (aVar != null) {
            aVar.onCloseMenu(c0125g, true);
        }
        ViewTreeObserver viewTreeObserver = this.f581y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f581y.removeGlobalOnLayoutListener(this.f566j);
            }
            this.f581y = null;
        }
        this.f572p.removeOnAttachStateChangeListener(this.f567k);
        this.f582z.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f565i.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f565i.get(i4);
            if (!dVar.f590a.mo450a()) {
                break;
            } else {
                i4++;
            }
        }
        if (dVar != null) {
            dVar.f591b.close(false);
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
    public boolean onSubMenuSelected(SubMenuC0136r subMenuC0136r) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (d dVar : this.f565i) {
            if (subMenuC0136r == dVar.f591b) {
                dVar.m463a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0136r.hasVisibleItems()) {
            return false;
        }
        mo451b(subMenuC0136r);
        InterfaceC0131m.a aVar = this.f580x;
        if (aVar != null) {
            aVar.mo252a(subMenuC0136r);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void setCallback(InterfaceC0131m.a aVar) {
        this.f580x = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0134p
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo450a()) {
            return;
        }
        Iterator<C0125g> it = this.f564h.iterator();
        while (it.hasNext()) {
            m449w(it.next());
        }
        this.f564h.clear();
        View view = this.f571o;
        this.f572p = view;
        if (view != null) {
            boolean z3 = this.f581y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f581y = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f566j);
            }
            this.f572p.addOnAttachStateChangeListener(this.f567k);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void updateMenuView(boolean z3) {
        Iterator<d> it = this.f565i.iterator();
        while (it.hasNext()) {
            AbstractC0129k.m516p(it.next().m463a().getAdapter()).notifyDataSetChanged();
        }
    }
}
