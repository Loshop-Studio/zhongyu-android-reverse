package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0124f;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.C0127i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public class C0236v extends ListPopupWindow implements InterfaceC0235u {

    /* renamed from: K */
    private static Method f1221K;

    /* renamed from: J */
    private InterfaceC0235u f1222J;

    /* renamed from: androidx.appcompat.widget.v$a */
    public static class a extends C0232r {

        /* renamed from: o */
        final int f1223o;

        /* renamed from: p */
        final int f1224p;

        /* renamed from: q */
        private InterfaceC0235u f1225q;

        /* renamed from: r */
        private MenuItem f1226r;

        public a(Context context, boolean z3) {
            super(context, z3);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1223o = 21;
                this.f1224p = 22;
            } else {
                this.f1223o = 22;
                this.f1224p = 21;
            }
        }

        @Override // androidx.appcompat.widget.C0232r
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo993d(int i4, int i5, int i6, int i7, int i8) {
            return super.mo993d(i4, i5, i6, i7, i8);
        }

        @Override // androidx.appcompat.widget.C0232r
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo994e(MotionEvent motionEvent, int i4) {
            return super.mo994e(motionEvent, i4);
        }

        @Override // androidx.appcompat.widget.C0232r, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0232r, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0232r, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0232r, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C0232r, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            C0124f c0124f;
            int iPointToPosition;
            int i4;
            if (this.f1225q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0124f = (C0124f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    c0124f = (C0124f) adapter;
                }
                C0127i item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i4 = iPointToPosition - headersCount) >= 0 && i4 < c0124f.getCount()) {
                    item = c0124f.getItem(i4);
                }
                MenuItem menuItem = this.f1226r;
                if (menuItem != item) {
                    C0125g c0125gM471b = c0124f.m471b();
                    if (menuItem != null) {
                        this.f1225q.mo462d(c0125gM471b, menuItem);
                    }
                    this.f1226r = item;
                    if (item != null) {
                        this.f1225q.mo461c(c0125gM471b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i4, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i4 == this.f1223o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i4 != this.f1224p) {
                return super.onKeyDown(i4, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C0124f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0124f) adapter).m471b().close(false);
            return true;
        }

        @Override // androidx.appcompat.widget.C0232r, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0235u interfaceC0235u) {
            this.f1225q = interfaceC0235u;
        }

        @Override // androidx.appcompat.widget.C0232r, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1221K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0236v(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    /* renamed from: P */
    public void m1006P(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f896F.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: Q */
    public void m1007Q(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f896F.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: R */
    public void m1008R(InterfaceC0235u interfaceC0235u) {
        this.f1222J = interfaceC0235u;
    }

    /* renamed from: S */
    public void m1009S(boolean z3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.f896F.setTouchModal(z3);
            return;
        }
        Method method = f1221K;
        if (method != null) {
            try {
                method.invoke(this.f896F, Boolean.valueOf(z3));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0235u
    /* renamed from: c */
    public void mo461c(C0125g c0125g, MenuItem menuItem) {
        InterfaceC0235u interfaceC0235u = this.f1222J;
        if (interfaceC0235u != null) {
            interfaceC0235u.mo461c(c0125g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0235u
    /* renamed from: d */
    public void mo462d(C0125g c0125g, MenuItem menuItem) {
        InterfaceC0235u interfaceC0235u = this.f1222J;
        if (interfaceC0235u != null) {
            interfaceC0235u.mo462d(c0125g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    /* renamed from: q */
    C0232r mo665q(Context context, boolean z3) {
        a aVar = new a(context, z3);
        aVar.setHoverListener(this);
        return aVar;
    }
}
