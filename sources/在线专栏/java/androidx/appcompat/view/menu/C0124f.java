package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0132n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class C0124f extends BaseAdapter {

    /* renamed from: a */
    C0125g f605a;

    /* renamed from: b */
    private int f606b = -1;

    /* renamed from: c */
    private boolean f607c;

    /* renamed from: d */
    private final boolean f608d;

    /* renamed from: e */
    private final LayoutInflater f609e;

    /* renamed from: f */
    private final int f610f;

    public C0124f(C0125g c0125g, LayoutInflater layoutInflater, boolean z3, int i4) {
        this.f608d = z3;
        this.f609e = layoutInflater;
        this.f605a = c0125g;
        this.f610f = i4;
        m470a();
    }

    /* renamed from: a */
    void m470a() {
        C0127i expandedItem = this.f605a.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<C0127i> nonActionItems = this.f605a.getNonActionItems();
            int size = nonActionItems.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (nonActionItems.get(i4) == expandedItem) {
                    this.f606b = i4;
                    return;
                }
            }
        }
        this.f606b = -1;
    }

    /* renamed from: b */
    public C0125g m471b() {
        return this.f605a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0127i getItem(int i4) {
        ArrayList<C0127i> nonActionItems = this.f608d ? this.f605a.getNonActionItems() : this.f605a.getVisibleItems();
        int i5 = this.f606b;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return nonActionItems.get(i4);
    }

    /* renamed from: d */
    public void m473d(boolean z3) {
        this.f607c = z3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f606b < 0 ? (this.f608d ? this.f605a.getNonActionItems() : this.f605a.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f609e.inflate(this.f610f, viewGroup, false);
        }
        int groupId = getItem(i4).getGroupId();
        int i5 = i4 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f605a.isGroupDividerEnabled() && groupId != (i5 >= 0 ? getItem(i5).getGroupId() : groupId));
        InterfaceC0132n.a aVar = (InterfaceC0132n.a) view;
        if (this.f607c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i4), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m470a();
        super.notifyDataSetChanged();
    }
}
