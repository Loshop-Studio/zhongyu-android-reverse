package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.view.menu.InterfaceC0132n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0120b implements InterfaceC0131m {

    /* renamed from: a */
    protected Context f543a;

    /* renamed from: b */
    protected Context f544b;

    /* renamed from: c */
    protected C0125g f545c;

    /* renamed from: d */
    protected LayoutInflater f546d;

    /* renamed from: e */
    protected LayoutInflater f547e;

    /* renamed from: f */
    private InterfaceC0131m.a f548f;

    /* renamed from: g */
    private int f549g;

    /* renamed from: h */
    private int f550h;

    /* renamed from: i */
    protected InterfaceC0132n f551i;

    /* renamed from: j */
    private int f552j;

    public AbstractC0120b(Context context, int i4, int i5) {
        this.f543a = context;
        this.f546d = LayoutInflater.from(context);
        this.f549g = i4;
        this.f550h = i5;
    }

    /* renamed from: b */
    protected void m429b(View view, int i4) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f551i).addView(view, i4);
    }

    /* renamed from: c */
    public abstract void mo430c(C0127i c0127i, InterfaceC0132n.a aVar);

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean collapseItemActionView(C0125g c0125g, C0127i c0127i) {
        return false;
    }

    /* renamed from: d */
    public InterfaceC0132n.a m431d(ViewGroup viewGroup) {
        return (InterfaceC0132n.a) this.f546d.inflate(this.f550h, viewGroup, false);
    }

    /* renamed from: e */
    protected boolean mo432e(ViewGroup viewGroup, int i4) {
        viewGroup.removeViewAt(i4);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean expandItemActionView(C0125g c0125g, C0127i c0127i) {
        return false;
    }

    /* renamed from: f */
    public InterfaceC0131m.a m433f() {
        return this.f548f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public View mo434g(C0127i c0127i, View view, ViewGroup viewGroup) {
        InterfaceC0132n.a aVarM431d = view instanceof InterfaceC0132n.a ? (InterfaceC0132n.a) view : m431d(viewGroup);
        mo430c(c0127i, aVarM431d);
        return (View) aVarM431d;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public int getId() {
        return this.f552j;
    }

    /* renamed from: h */
    public InterfaceC0132n mo435h(ViewGroup viewGroup) {
        if (this.f551i == null) {
            InterfaceC0132n interfaceC0132n = (InterfaceC0132n) this.f546d.inflate(this.f549g, viewGroup, false);
            this.f551i = interfaceC0132n;
            interfaceC0132n.initialize(this.f545c);
            updateMenuView(true);
        }
        return this.f551i;
    }

    /* renamed from: i */
    public void m436i(int i4) {
        this.f552j = i4;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void initForMenu(Context context, C0125g c0125g) {
        this.f544b = context;
        this.f547e = LayoutInflater.from(context);
        this.f545c = c0125g;
    }

    /* renamed from: j */
    public abstract boolean mo437j(int i4, C0127i c0127i);

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void onCloseMenu(C0125g c0125g, boolean z3) {
        InterfaceC0131m.a aVar = this.f548f;
        if (aVar != null) {
            aVar.onCloseMenu(c0125g, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean onSubMenuSelected(SubMenuC0136r subMenuC0136r) {
        InterfaceC0131m.a aVar = this.f548f;
        SubMenuC0136r subMenuC0136r2 = subMenuC0136r;
        if (aVar == null) {
            return false;
        }
        if (subMenuC0136r == null) {
            subMenuC0136r2 = this.f545c;
        }
        return aVar.mo252a(subMenuC0136r2);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void setCallback(InterfaceC0131m.a aVar) {
        this.f548f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void updateMenuView(boolean z3) {
        ViewGroup viewGroup = (ViewGroup) this.f551i;
        if (viewGroup == null) {
            return;
        }
        C0125g c0125g = this.f545c;
        int i4 = 0;
        if (c0125g != null) {
            c0125g.flagActionItems();
            ArrayList<C0127i> visibleItems = this.f545c.getVisibleItems();
            int size = visibleItems.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                C0127i c0127i = visibleItems.get(i6);
                if (mo437j(i5, c0127i)) {
                    View childAt = viewGroup.getChildAt(i5);
                    C0127i itemData = childAt instanceof InterfaceC0132n.a ? ((InterfaceC0132n.a) childAt).getItemData() : null;
                    View viewMo434g = mo434g(c0127i, childAt, viewGroup);
                    if (c0127i != itemData) {
                        viewMo434g.setPressed(false);
                        viewMo434g.jumpDrawablesToCurrentState();
                    }
                    if (viewMo434g != childAt) {
                        m429b(viewMo434g, i5);
                    }
                    i5++;
                }
            }
            i4 = i5;
        }
        while (i4 < viewGroup.getChildCount()) {
            if (!mo432e(viewGroup, i4)) {
                i4++;
            }
        }
    }
}
