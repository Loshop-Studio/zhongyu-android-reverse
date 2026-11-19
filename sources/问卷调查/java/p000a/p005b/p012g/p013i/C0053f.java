package p000a.p005b.p012g.p013i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
import p000a.p005b.p012g.p013i.InterfaceC0061n;

/* renamed from: a.b.g.i.f */
/* loaded from: classes.dex */
public class C0053f extends BaseAdapter {

    /* renamed from: b */
    public C0054g f426b;

    /* renamed from: c */
    public int f427c = -1;

    /* renamed from: d */
    public boolean f428d;

    /* renamed from: e */
    public final boolean f429e;

    /* renamed from: f */
    public final LayoutInflater f430f;

    /* renamed from: g */
    public final int f431g;

    public C0053f(C0054g c0054g, LayoutInflater layoutInflater, boolean z, int i) {
        this.f429e = z;
        this.f430f = layoutInflater;
        this.f426b = c0054g;
        this.f431g = i;
        m194a();
    }

    /* renamed from: a */
    public void m194a() {
        C0054g c0054g = this.f426b;
        C0056i c0056i = c0054g.f454v;
        if (c0056i != null) {
            c0054g.m204i();
            ArrayList<C0056i> arrayList = c0054g.f442j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == c0056i) {
                    this.f427c = i;
                    return;
                }
            }
        }
        this.f427c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0056i getItem(int i) {
        ArrayList<C0056i> arrayListM207l;
        if (this.f429e) {
            C0054g c0054g = this.f426b;
            c0054g.m204i();
            arrayListM207l = c0054g.f442j;
        } else {
            arrayListM207l = this.f426b.m207l();
        }
        int i2 = this.f427c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListM207l.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0056i> arrayListM207l;
        if (this.f429e) {
            C0054g c0054g = this.f426b;
            c0054g.m204i();
            arrayListM207l = c0054g.f442j;
        } else {
            arrayListM207l = this.f426b.m207l();
        }
        int i = this.f427c;
        int size = arrayListM207l.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f430f.inflate(this.f431g, viewGroup, false);
        }
        int i2 = getItem(i).f465b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f426b.mo208m() && i2 != (i3 >= 0 ? getItem(i3).f465b : i2));
        InterfaceC0061n.a aVar = (InterfaceC0061n.a) view;
        if (this.f428d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo251d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m194a();
        super.notifyDataSetChanged();
    }
}
