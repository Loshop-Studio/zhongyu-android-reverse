package p000a.p005b.p012g.p013i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.Objects;
import p000a.p005b.p006c.DialogInterfaceC0018d;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p005b.p012g.p013i.InterfaceC0061n;

/* renamed from: a.b.g.i.e */
/* loaded from: classes.dex */
public class C0052e implements InterfaceC0060m, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Context f418b;

    /* renamed from: c */
    public LayoutInflater f419c;

    /* renamed from: d */
    public C0054g f420d;

    /* renamed from: e */
    public ExpandedMenuView f421e;

    /* renamed from: f */
    public InterfaceC0060m.a f422f;

    /* renamed from: g */
    public a f423g;

    /* renamed from: a.b.g.i.e$a */
    public class a extends BaseAdapter {

        /* renamed from: b */
        public int f424b = -1;

        public a() {
            m192a();
        }

        /* renamed from: a */
        public void m192a() {
            C0054g c0054g = C0052e.this.f420d;
            C0056i c0056i = c0054g.f454v;
            if (c0056i != null) {
                c0054g.m204i();
                ArrayList<C0056i> arrayList = c0054g.f442j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == c0056i) {
                        this.f424b = i;
                        return;
                    }
                }
            }
            this.f424b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0056i getItem(int i) {
            C0054g c0054g = C0052e.this.f420d;
            c0054g.m204i();
            ArrayList<C0056i> arrayList = c0054g.f442j;
            Objects.requireNonNull(C0052e.this);
            int i2 = i + 0;
            int i3 = this.f424b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            C0054g c0054g = C0052e.this.f420d;
            c0054g.m204i();
            int size = c0054g.f442j.size();
            Objects.requireNonNull(C0052e.this);
            int i = size + 0;
            return this.f424b < 0 ? i : i - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0052e.this.f419c.inflate(C1088R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((InterfaceC0061n.a) view).mo251d(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m192a();
            super.notifyDataSetChanged();
        }
    }

    public C0052e(Context context, int i) {
        this.f418b = context;
        this.f419c = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter m190a() {
        if (this.f423g == null) {
            this.f423g = new a();
        }
        return this.f423g;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: c */
    public void mo173c(C0054g c0054g, boolean z) {
        InterfaceC0060m.a aVar = this.f422f;
        if (aVar != null) {
            aVar.mo82c(c0054g, z);
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: d */
    public boolean mo166d(C0054g c0054g, C0056i c0056i) {
        return false;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: e */
    public void mo167e(InterfaceC0060m.a aVar) {
        this.f422f = aVar;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: g */
    public boolean mo175g(SubMenuC0065r subMenuC0065r) {
        if (!subMenuC0065r.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0055h dialogInterfaceOnKeyListenerC0055h = new DialogInterfaceOnKeyListenerC0055h(subMenuC0065r);
        DialogInterfaceC0018d.a aVar = new DialogInterfaceC0018d.a(subMenuC0065r.f433a);
        C0052e c0052e = new C0052e(aVar.f58a.f2727a, C1088R.layout.abc_list_menu_item_layout);
        dialogInterfaceOnKeyListenerC0055h.f459d = c0052e;
        c0052e.f422f = dialogInterfaceOnKeyListenerC0055h;
        C0054g c0054g = dialogInterfaceOnKeyListenerC0055h.f457b;
        c0054g.m197b(c0052e, c0054g.f433a);
        ListAdapter listAdapterM190a = dialogInterfaceOnKeyListenerC0055h.f459d.m190a();
        AlertController.C0457b c0457b = aVar.f58a;
        c0457b.f2733g = listAdapterM190a;
        c0457b.f2734h = dialogInterfaceOnKeyListenerC0055h;
        View view = subMenuC0065r.f447o;
        if (view != null) {
            c0457b.f2731e = view;
        } else {
            c0457b.f2729c = subMenuC0065r.f446n;
            c0457b.f2730d = subMenuC0065r.f445m;
        }
        c0457b.f2732f = dialogInterfaceOnKeyListenerC0055h;
        DialogInterfaceC0018d dialogInterfaceC0018dM20a = aVar.m20a();
        dialogInterfaceOnKeyListenerC0055h.f458c = dialogInterfaceC0018dM20a;
        dialogInterfaceC0018dM20a.setOnDismissListener(dialogInterfaceOnKeyListenerC0055h);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0055h.f458c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0055h.f458c.show();
        InterfaceC0060m.a aVar2 = this.f422f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.mo83d(subMenuC0065r);
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
        a aVar = this.f423g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: j */
    public void mo191j(Context context, C0054g c0054g) {
        if (this.f418b != null) {
            this.f418b = context;
            if (this.f419c == null) {
                this.f419c = LayoutInflater.from(context);
            }
        }
        this.f420d = c0054g;
        a aVar = this.f423g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: k */
    public boolean mo168k(C0054g c0054g, C0056i c0056i) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f420d.m214s(this.f423g.getItem(i), this, 0);
    }
}
