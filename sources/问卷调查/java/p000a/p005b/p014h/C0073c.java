package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.Objects;
import p000a.p005b.C0013a;
import p000a.p005b.p012g.p013i.AbstractC0049b;
import p000a.p005b.p012g.p013i.AbstractC0058k;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p012g.p013i.C0056i;
import p000a.p005b.p012g.p013i.C0059l;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p005b.p012g.p013i.InterfaceC0061n;
import p000a.p005b.p012g.p013i.InterfaceC0063p;
import p000a.p005b.p012g.p013i.SubMenuC0065r;
import p000a.p031h.p043j.AbstractC0248b;

/* renamed from: a.b.h.c */
/* loaded from: classes.dex */
public class C0073c extends AbstractC0049b {

    /* renamed from: j */
    public d f556j;

    /* renamed from: k */
    public Drawable f557k;

    /* renamed from: l */
    public boolean f558l;

    /* renamed from: m */
    public boolean f559m;

    /* renamed from: n */
    public boolean f560n;

    /* renamed from: o */
    public int f561o;

    /* renamed from: p */
    public int f562p;

    /* renamed from: q */
    public int f563q;

    /* renamed from: r */
    public boolean f564r;

    /* renamed from: s */
    public int f565s;

    /* renamed from: t */
    public final SparseBooleanArray f566t;

    /* renamed from: u */
    public e f567u;

    /* renamed from: v */
    public a f568v;

    /* renamed from: w */
    public c f569w;

    /* renamed from: x */
    public b f570x;

    /* renamed from: y */
    public final f f571y;

    /* renamed from: a.b.h.c$a */
    public class a extends C0059l {
        public a(Context context, SubMenuC0065r subMenuC0065r, View view) {
            super(context, subMenuC0065r, view, false, C1088R.attr.actionOverflowMenuStyle, 0);
            if (!subMenuC0065r.f538A.m227g()) {
                View view2 = C0073c.this.f556j;
                this.f507f = view2 == null ? (View) C0073c.this.f378i : view2;
            }
            m247d(C0073c.this.f571y);
        }

        @Override // p000a.p005b.p012g.p013i.C0059l
        /* renamed from: c */
        public void mo246c() {
            C0073c c0073c = C0073c.this;
            c0073c.f568v = null;
            Objects.requireNonNull(c0073c);
            super.mo246c();
        }
    }

    /* renamed from: a.b.h.c$b */
    public class b extends ActionMenuItemView.AbstractC0461b {
        public b() {
        }
    }

    /* renamed from: a.b.h.c$c */
    public class c implements Runnable {

        /* renamed from: b */
        public e f574b;

        public c(e eVar) {
            this.f574b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0054g.a aVar;
            C0054g c0054g = C0073c.this.f373d;
            if (c0054g != null && (aVar = c0054g.f437e) != null) {
                aVar.mo79a(c0054g);
            }
            View view = (View) C0073c.this.f378i;
            if (view != null && view.getWindowToken() != null && this.f574b.m249f()) {
                C0073c.this.f567u = this.f574b;
            }
            C0073c.this.f569w = null;
        }
    }

    /* renamed from: a.b.h.c$d */
    public class d extends AppCompatImageView implements ActionMenuView.InterfaceC0468a {

        /* renamed from: a.b.h.c$d$a */
        public class a extends AbstractViewOnTouchListenerC0078e0 {
            public a(View view, C0073c c0073c) {
                super(view);
            }

            @Override // p000a.p005b.p014h.AbstractViewOnTouchListenerC0078e0
            /* renamed from: b */
            public InterfaceC0063p mo293b() {
                e eVar = C0073c.this.f567u;
                if (eVar == null) {
                    return null;
                }
                return eVar.m244a();
            }

            @Override // p000a.p005b.p014h.AbstractViewOnTouchListenerC0078e0
            /* renamed from: c */
            public boolean mo294c() {
                C0073c.this.m290n();
                return true;
            }

            @Override // p000a.p005b.p014h.AbstractViewOnTouchListenerC0078e0
            /* renamed from: d */
            public boolean mo295d() {
                C0073c c0073c = C0073c.this;
                if (c0073c.f569w != null) {
                    return false;
                }
                c0073c.m287f();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C1088R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0013a.m13d(this, getContentDescription());
            setOnTouchListener(new a(this, C0073c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0468a
        /* renamed from: a */
        public boolean mo291a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0468a
        /* renamed from: b */
        public boolean mo292b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0073c.this.m290n();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* renamed from: a.b.h.c$e */
    public class e extends C0059l {
        public e(Context context, C0054g c0054g, View view, boolean z) {
            super(context, c0054g, view, z, C1088R.attr.actionOverflowMenuStyle, 0);
            this.f508g = 8388613;
            m247d(C0073c.this.f571y);
        }

        @Override // p000a.p005b.p012g.p013i.C0059l
        /* renamed from: c */
        public void mo246c() {
            C0054g c0054g = C0073c.this.f373d;
            if (c0054g != null) {
                c0054g.m198c(true);
            }
            C0073c.this.f567u = null;
            super.mo246c();
        }
    }

    /* renamed from: a.b.h.c$f */
    public class f implements InterfaceC0060m.a {
        public f() {
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
        /* renamed from: c */
        public void mo82c(C0054g c0054g, boolean z) {
            if (c0054g instanceof SubMenuC0065r) {
                c0054g.mo206k().m198c(false);
            }
            InterfaceC0060m.a aVar = C0073c.this.f375f;
            if (aVar != null) {
                aVar.mo82c(c0054g, z);
            }
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m.a
        /* renamed from: d */
        public boolean mo83d(C0054g c0054g) {
            C0073c c0073c = C0073c.this;
            if (c0054g == c0073c.f373d) {
                return false;
            }
            int i = ((SubMenuC0065r) c0054g).f538A.f464a;
            InterfaceC0060m.a aVar = c0073c.f375f;
            if (aVar != null) {
                return aVar.mo83d(c0054g);
            }
            return false;
        }
    }

    public C0073c(Context context) {
        super(context, C1088R.layout.abc_action_menu_layout, C1088R.layout.abc_action_menu_item_layout);
        this.f566t = new SparseBooleanArray();
        this.f571y = new f();
    }

    /* renamed from: a */
    public boolean m285a() {
        return m287f() | m288l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.b.g.i.n$a] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* renamed from: b */
    public View m286b(C0056i c0056i, View view, ViewGroup viewGroup) {
        View actionView = c0056i.getActionView();
        if (actionView == null || c0056i.m226f()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0061n.a ? (InterfaceC0061n.a) view : (InterfaceC0061n.a) this.f374e.inflate(this.f377h, viewGroup, false);
            actionMenuItemView.mo251d(c0056i, 0);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.f378i);
            if (this.f570x == null) {
                this.f570x = new b();
            }
            actionMenuItemView2.setPopupCallback(this.f570x);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c0056i.f462C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: c */
    public void mo173c(C0054g c0054g, boolean z) {
        m285a();
        InterfaceC0060m.a aVar = this.f375f;
        if (aVar != null) {
            aVar.mo82c(c0054g, z);
        }
    }

    /* renamed from: f */
    public boolean m287f() {
        Object obj;
        c cVar = this.f569w;
        if (cVar != null && (obj = this.f378i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f569w = null;
            return true;
        }
        e eVar = this.f567u;
        if (eVar == null) {
            return false;
        }
        if (eVar.m245b()) {
            eVar.f511j.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: g */
    public boolean mo175g(SubMenuC0065r subMenuC0065r) {
        boolean z = false;
        if (!subMenuC0065r.hasVisibleItems()) {
            return false;
        }
        SubMenuC0065r subMenuC0065r2 = subMenuC0065r;
        while (true) {
            C0054g c0054g = subMenuC0065r2.f539z;
            if (c0054g == this.f373d) {
                break;
            }
            subMenuC0065r2 = (SubMenuC0065r) c0054g;
        }
        C0056i c0056i = subMenuC0065r2.f538A;
        ViewGroup viewGroup = (ViewGroup) this.f378i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC0061n.a) && ((InterfaceC0061n.a) childAt).getItemData() == c0056i) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        int i2 = subMenuC0065r.f538A.f464a;
        int size = subMenuC0065r.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = subMenuC0065r.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i3++;
        }
        a aVar = new a(this.f372c, subMenuC0065r, view);
        this.f568v = aVar;
        aVar.f509h = z;
        AbstractC0058k abstractC0058k = aVar.f511j;
        if (abstractC0058k != null) {
            abstractC0058k.mo181p(z);
        }
        if (!this.f568v.m249f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        InterfaceC0060m.a aVar2 = this.f375f;
        if (aVar2 != null) {
            aVar2.mo83d(subMenuC0065r);
        }
        return true;
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: h */
    public boolean mo176h() {
        int size;
        ArrayList<C0056i> arrayListM207l;
        int i;
        boolean z;
        C0054g c0054g = this.f373d;
        if (c0054g != null) {
            arrayListM207l = c0054g.m207l();
            size = arrayListM207l.size();
        } else {
            size = 0;
            arrayListM207l = null;
        }
        int i2 = this.f563q;
        int i3 = this.f562p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f378i;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C0056i c0056i = arrayListM207l.get(i4);
            int i7 = c0056i.f488y;
            if ((i7 & 2) == 2) {
                i6++;
            } else if ((i7 & 1) == 1) {
                i5++;
            } else {
                z2 = true;
            }
            if (this.f564r && c0056i.f462C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f559m && (z2 || i5 + i6 > i2)) {
            i2--;
        }
        int i8 = i2 - i6;
        SparseBooleanArray sparseBooleanArray = this.f566t;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C0056i c0056i2 = arrayListM207l.get(i9);
            int i11 = c0056i2.f488y;
            if ((i11 & 2) == i ? z : false) {
                View viewM286b = m286b(c0056i2, null, viewGroup);
                viewM286b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM286b.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i12 = c0056i2.f465b;
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c0056i2.m231k(z);
            } else if ((i11 & 1) == z ? z : false) {
                int i13 = c0056i2.f465b;
                boolean z3 = sparseBooleanArray.get(i13);
                boolean z4 = ((i8 > 0 || z3) && i3 > 0) ? z : false;
                if (z4) {
                    View viewM286b2 = m286b(c0056i2, null, viewGroup);
                    viewM286b2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM286b2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z4 &= i3 + i10 > 0;
                }
                if (z4 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z3) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i9; i14++) {
                        C0056i c0056i3 = arrayListM207l.get(i14);
                        if (c0056i3.f465b == i13) {
                            if (c0056i3.m227g()) {
                                i8++;
                            }
                            c0056i3.m231k(false);
                        }
                    }
                }
                if (z4) {
                    i8--;
                }
                c0056i2.m231k(z4);
            } else {
                c0056i2.m231k(false);
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: i */
    public void mo177i(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f378i;
        ArrayList<C0056i> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            C0054g c0054g = this.f373d;
            if (c0054g != null) {
                c0054g.m204i();
                ArrayList<C0056i> arrayListM207l = this.f373d.m207l();
                int size = arrayListM207l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C0056i c0056i = arrayListM207l.get(i2);
                    if (c0056i.m227g()) {
                        View childAt = viewGroup.getChildAt(i);
                        C0056i itemData = childAt instanceof InterfaceC0061n.a ? ((InterfaceC0061n.a) childAt).getItemData() : null;
                        View viewM286b = m286b(c0056i, childAt, viewGroup);
                        if (c0056i != itemData) {
                            viewM286b.setPressed(false);
                            viewM286b.jumpDrawablesToCurrentState();
                        }
                        if (viewM286b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewM286b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewM286b);
                            }
                            ((ViewGroup) this.f378i).addView(viewM286b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.f556j) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.f378i).requestLayout();
        C0054g c0054g2 = this.f373d;
        if (c0054g2 != null) {
            c0054g2.m204i();
            ArrayList<C0056i> arrayList2 = c0054g2.f441i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AbstractC0248b abstractC0248b = arrayList2.get(i3).f460A;
            }
        }
        C0054g c0054g3 = this.f373d;
        if (c0054g3 != null) {
            c0054g3.m204i();
            arrayList = c0054g3.f442j;
        }
        if (this.f559m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).f462C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        d dVar = this.f556j;
        if (z3) {
            if (dVar == null) {
                this.f556j = new d(this.f371b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f556j.getParent();
            if (viewGroup3 != this.f378i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f556j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f378i;
                d dVar2 = this.f556j;
                ActionMenuView.C0470c c0470cGenerateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                c0470cGenerateDefaultLayoutParams.f2839a = true;
                actionMenuView.addView(dVar2, c0470cGenerateDefaultLayoutParams);
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f378i;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f556j);
            }
        }
        ((ActionMenuView) this.f378i).setOverflowReserved(this.f559m);
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
    /* renamed from: j */
    public void mo191j(Context context, C0054g c0054g) {
        this.f372c = context;
        LayoutInflater.from(context);
        this.f373d = c0054g;
        Resources resources = context.getResources();
        if (!this.f560n) {
            this.f559m = true;
        }
        int i = 2;
        this.f561o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.f563q = i;
        int measuredWidth = this.f561o;
        if (this.f559m) {
            if (this.f556j == null) {
                d dVar = new d(this.f371b);
                this.f556j = dVar;
                if (this.f558l) {
                    dVar.setImageDrawable(this.f557k);
                    this.f557k = null;
                    this.f558l = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f556j.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f556j.getMeasuredWidth();
        } else {
            this.f556j = null;
        }
        this.f562p = measuredWidth;
        this.f565s = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: l */
    public boolean m288l() {
        a aVar = this.f568v;
        if (aVar == null) {
            return false;
        }
        if (!aVar.m245b()) {
            return true;
        }
        aVar.f511j.dismiss();
        return true;
    }

    /* renamed from: m */
    public boolean m289m() {
        e eVar = this.f567u;
        return eVar != null && eVar.m245b();
    }

    /* renamed from: n */
    public boolean m290n() {
        C0054g c0054g;
        if (!this.f559m || m289m() || (c0054g = this.f373d) == null || this.f378i == null || this.f569w != null) {
            return false;
        }
        c0054g.m204i();
        if (c0054g.f442j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f372c, this.f373d, this.f556j, true));
        this.f569w = cVar;
        ((View) this.f378i).post(cVar);
        return true;
    }
}
