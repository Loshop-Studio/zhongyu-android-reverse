package p000a.p005b.p014h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import p000a.p005b.p012g.p013i.C0053f;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p012g.p013i.C0056i;

/* renamed from: a.b.h.j0 */
/* loaded from: classes.dex */
public class C0088j0 extends C0084h0 implements InterfaceC0086i0 {

    /* renamed from: F */
    public static Method f686F;

    /* renamed from: E */
    public InterfaceC0086i0 f687E;

    /* renamed from: a.b.h.j0$a */
    public static class a extends C0074c0 {

        /* renamed from: o */
        public final int f688o;

        /* renamed from: p */
        public final int f689p;

        /* renamed from: q */
        public InterfaceC0086i0 f690q;

        /* renamed from: r */
        public MenuItem f691r;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f688o = 21;
                this.f689p = 22;
            } else {
                this.f688o = 22;
                this.f689p = 21;
            }
        }

        @Override // p000a.p005b.p014h.C0074c0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f690q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                }
                C0053f c0053f = (C0053f) adapter;
                C0056i item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i = iPointToPosition - headersCount) >= 0 && i < c0053f.getCount()) {
                    item = c0053f.getItem(i);
                }
                MenuItem menuItem = this.f691r;
                if (menuItem != item) {
                    C0054g c0054g = c0053f.f426b;
                    if (menuItem != null) {
                        this.f690q.mo189k(c0054g, menuItem);
                    }
                    this.f691r = item;
                    if (item != null) {
                        this.f690q.mo188h(c0054g, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f688o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f689p) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0053f) adapter).f426b.m198c(false);
            return true;
        }

        public void setHoverListener(InterfaceC0086i0 interfaceC0086i0) {
            this.f690q = interfaceC0086i0;
        }

        @Override // p000a.p005b.p014h.C0074c0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f686F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0088j0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // p000a.p005b.p014h.InterfaceC0086i0
    /* renamed from: h */
    public void mo188h(C0054g c0054g, MenuItem menuItem) {
        InterfaceC0086i0 interfaceC0086i0 = this.f687E;
        if (interfaceC0086i0 != null) {
            interfaceC0086i0.mo188h(c0054g, menuItem);
        }
    }

    @Override // p000a.p005b.p014h.InterfaceC0086i0
    /* renamed from: k */
    public void mo189k(C0054g c0054g, MenuItem menuItem) {
        InterfaceC0086i0 interfaceC0086i0 = this.f687E;
        if (interfaceC0086i0 != null) {
            interfaceC0086i0.mo189k(c0054g, menuItem);
        }
    }

    @Override // p000a.p005b.p014h.C0084h0
    /* renamed from: q */
    public C0074c0 mo330q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
