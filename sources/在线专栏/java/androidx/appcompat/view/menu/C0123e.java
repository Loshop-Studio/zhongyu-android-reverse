package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.view.menu.InterfaceC0132n;
import java.util.ArrayList;
import p015c.C1044g;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0123e implements InterfaceC0131m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f593a;

    /* renamed from: b */
    LayoutInflater f594b;

    /* renamed from: c */
    C0125g f595c;

    /* renamed from: d */
    ExpandedMenuView f596d;

    /* renamed from: e */
    int f597e;

    /* renamed from: f */
    int f598f;

    /* renamed from: g */
    int f599g;

    /* renamed from: h */
    private InterfaceC0131m.a f600h;

    /* renamed from: i */
    a f601i;

    /* renamed from: j */
    private int f602j;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class a extends BaseAdapter {

        /* renamed from: a */
        private int f603a = -1;

        public a() {
            m468a();
        }

        /* renamed from: a */
        void m468a() {
            C0127i expandedItem = C0123e.this.f595c.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<C0127i> nonActionItems = C0123e.this.f595c.getNonActionItems();
                int size = nonActionItems.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (nonActionItems.get(i4) == expandedItem) {
                        this.f603a = i4;
                        return;
                    }
                }
            }
            this.f603a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0127i getItem(int i4) {
            ArrayList<C0127i> nonActionItems = C0123e.this.f595c.getNonActionItems();
            int i5 = i4 + C0123e.this.f597e;
            int i6 = this.f603a;
            if (i6 >= 0 && i5 >= i6) {
                i5++;
            }
            return nonActionItems.get(i5);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0123e.this.f595c.getNonActionItems().size() - C0123e.this.f597e;
            return this.f603a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0123e c0123e = C0123e.this;
                view = c0123e.f594b.inflate(c0123e.f599g, viewGroup, false);
            }
            ((InterfaceC0132n.a) view).initialize(getItem(i4), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m468a();
            super.notifyDataSetChanged();
        }
    }

    public C0123e(Context context, int i4) {
        this(i4, 0);
        this.f593a = context;
        this.f594b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m464a() {
        if (this.f601i == null) {
            this.f601i = new a();
        }
        return this.f601i;
    }

    /* renamed from: b */
    public InterfaceC0132n m465b(ViewGroup viewGroup) {
        if (this.f596d == null) {
            this.f596d = (ExpandedMenuView) this.f594b.inflate(C1044g.f5888i, viewGroup, false);
            if (this.f601i == null) {
                this.f601i = new a();
            }
            this.f596d.setAdapter((ListAdapter) this.f601i);
            this.f596d.setOnItemClickListener(this);
        }
        return this.f596d;
    }

    /* renamed from: c */
    public void m466c(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f596d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean collapseItemActionView(C0125g c0125g, C0127i c0127i) {
        return false;
    }

    /* renamed from: d */
    public void m467d(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f596d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean expandItemActionView(C0125g c0125g, C0127i c0127i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public int getId() {
        return this.f602j;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void initForMenu(Context context, C0125g c0125g) {
        if (this.f598f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f598f);
            this.f593a = contextThemeWrapper;
            this.f594b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f593a != null) {
            this.f593a = context;
            if (this.f594b == null) {
                this.f594b = LayoutInflater.from(context);
            }
        }
        this.f595c = c0125g;
        a aVar = this.f601i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void onCloseMenu(C0125g c0125g, boolean z3) {
        InterfaceC0131m.a aVar = this.f600h;
        if (aVar != null) {
            aVar.onCloseMenu(c0125g, z3);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        this.f595c.performItemAction(this.f601i.getItem(i4), this, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void onRestoreInstanceState(Parcelable parcelable) {
        m466c((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public Parcelable onSaveInstanceState() {
        if (this.f596d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m467d(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean onSubMenuSelected(SubMenuC0136r subMenuC0136r) {
        if (!subMenuC0136r.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0126h(subMenuC0136r).m475c(null);
        InterfaceC0131m.a aVar = this.f600h;
        if (aVar == null) {
            return true;
        }
        aVar.mo252a(subMenuC0136r);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void setCallback(InterfaceC0131m.a aVar) {
        this.f600h = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void updateMenuView(boolean z3) {
        a aVar = this.f601i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public C0123e(int i4, int i5) {
        this.f599g = i4;
        this.f598f = i5;
    }
}
