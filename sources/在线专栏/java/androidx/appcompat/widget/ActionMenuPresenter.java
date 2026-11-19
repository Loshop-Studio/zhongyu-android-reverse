package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC0120b;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.C0127i;
import androidx.appcompat.view.menu.C0130l;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.appcompat.view.menu.InterfaceC0132n;
import androidx.appcompat.view.menu.InterfaceC0134p;
import androidx.appcompat.view.menu.SubMenuC0136r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC0337b;
import java.util.ArrayList;
import p015c.C1038a;
import p015c.C1044g;
import p088g.C2619a;
import p156u.C3403a;

/* loaded from: classes.dex */
class ActionMenuPresenter extends AbstractC0120b implements AbstractC0337b.a {

    /* renamed from: A */
    RunnableC0146c f756A;

    /* renamed from: B */
    private C0145b f757B;

    /* renamed from: C */
    final C0149f f758C;

    /* renamed from: D */
    int f759D;

    /* renamed from: k */
    C0147d f760k;

    /* renamed from: l */
    private Drawable f761l;

    /* renamed from: m */
    private boolean f762m;

    /* renamed from: n */
    private boolean f763n;

    /* renamed from: o */
    private boolean f764o;

    /* renamed from: p */
    private int f765p;

    /* renamed from: q */
    private int f766q;

    /* renamed from: r */
    private int f767r;

    /* renamed from: s */
    private boolean f768s;

    /* renamed from: t */
    private boolean f769t;

    /* renamed from: u */
    private boolean f770u;

    /* renamed from: v */
    private boolean f771v;

    /* renamed from: w */
    private int f772w;

    /* renamed from: x */
    private final SparseBooleanArray f773x;

    /* renamed from: y */
    C0148e f774y;

    /* renamed from: z */
    C0144a f775z;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0143a();

        /* renamed from: a */
        public int f776a;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        class C0143a implements Parcelable.Creator<SavedState> {
            C0143a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f776a);
        }

        SavedState(Parcel parcel) {
            this.f776a = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    private class C0144a extends C0130l {
        public C0144a(Context context, SubMenuC0136r subMenuC0136r, View view) {
            super(context, subMenuC0136r, view, false, C1038a.f5748l);
            if (!((C0127i) subMenuC0136r.getItem()).m487l()) {
                View view2 = ActionMenuPresenter.this.f760k;
                m525f(view2 == null ? (View) ((AbstractC0120b) ActionMenuPresenter.this).f551i : view2);
            }
            m529j(ActionMenuPresenter.this.f758C);
        }

        @Override // androidx.appcompat.view.menu.C0130l
        /* renamed from: e */
        protected void mo524e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f775z = null;
            actionMenuPresenter.f759D = 0;
            super.mo524e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0145b extends ActionMenuItemView.AbstractC0118b {
        C0145b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0118b
        /* renamed from: a */
        public InterfaceC0134p mo415a() {
            C0144a c0144a = ActionMenuPresenter.this.f775z;
            if (c0144a != null) {
                return c0144a.m522c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    private class RunnableC0146c implements Runnable {

        /* renamed from: a */
        private C0148e f779a;

        public RunnableC0146c(C0148e c0148e) {
            this.f779a = c0148e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0120b) ActionMenuPresenter.this).f545c != null) {
                ((AbstractC0120b) ActionMenuPresenter.this).f545c.changeMenuMode();
            }
            View view = (View) ((AbstractC0120b) ActionMenuPresenter.this).f551i;
            if (view != null && view.getWindowToken() != null && this.f779a.m531m()) {
                ActionMenuPresenter.this.f774y = this.f779a;
            }
            ActionMenuPresenter.this.f756A = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    private class C0147d extends AppCompatImageView implements ActionMenuView.InterfaceC0150a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        class a extends AbstractViewOnTouchListenerC0234t {

            /* renamed from: j */
            final /* synthetic */ ActionMenuPresenter f782j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f782j = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
            /* renamed from: b */
            public InterfaceC0134p mo413b() {
                C0148e c0148e = ActionMenuPresenter.this.f774y;
                if (c0148e == null) {
                    return null;
                }
                return c0148e.m522c();
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
            /* renamed from: c */
            public boolean mo414c() {
                ActionMenuPresenter.this.m576D();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
            /* renamed from: d */
            public boolean mo588d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f756A != null) {
                    return false;
                }
                actionMenuPresenter.m580u();
                return true;
            }
        }

        public C0147d(Context context) {
            super(context, null, C1038a.f5747k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0218i0.m886a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0150a
        /* renamed from: a */
        public boolean mo410a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0150a
        /* renamed from: b */
        public boolean mo411b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m576D();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i4, int i5, int i6, int i7) {
            boolean frame = super.setFrame(i4, i5, i6, i7);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C3403a.m10395l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    private class C0148e extends C0130l {
        public C0148e(Context context, C0125g c0125g, View view, boolean z3) {
            super(context, c0125g, view, z3, C1038a.f5748l);
            m527h(8388613);
            m529j(ActionMenuPresenter.this.f758C);
        }

        @Override // androidx.appcompat.view.menu.C0130l
        /* renamed from: e */
        protected void mo524e() {
            if (((AbstractC0120b) ActionMenuPresenter.this).f545c != null) {
                ((AbstractC0120b) ActionMenuPresenter.this).f545c.close();
            }
            ActionMenuPresenter.this.f774y = null;
            super.mo524e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0149f implements InterfaceC0131m.a {
        C0149f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        /* renamed from: a */
        public boolean mo252a(C0125g c0125g) {
            if (c0125g == ((AbstractC0120b) ActionMenuPresenter.this).f545c) {
                return false;
            }
            ActionMenuPresenter.this.f759D = ((SubMenuC0136r) c0125g).getItem().getItemId();
            InterfaceC0131m.a aVarM433f = ActionMenuPresenter.this.m433f();
            if (aVarM433f != null) {
                return aVarM433f.mo252a(c0125g);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0131m.a
        public void onCloseMenu(C0125g c0125g, boolean z3) {
            if (c0125g instanceof SubMenuC0136r) {
                c0125g.getRootMenu().close(false);
            }
            InterfaceC0131m.a aVarM433f = ActionMenuPresenter.this.m433f();
            if (aVarM433f != null) {
                aVarM433f.onCloseMenu(c0125g, z3);
            }
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C1044g.f5882c, C1044g.f5881b);
        this.f773x = new SparseBooleanArray();
        this.f758C = new C0149f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    private View m572s(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f551i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof InterfaceC0132n.a) && ((InterfaceC0132n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public void m573A(ActionMenuView actionMenuView) {
        this.f551i = actionMenuView;
        actionMenuView.initialize(this.f545c);
    }

    /* renamed from: B */
    public void m574B(Drawable drawable) {
        C0147d c0147d = this.f760k;
        if (c0147d != null) {
            c0147d.setImageDrawable(drawable);
        } else {
            this.f762m = true;
            this.f761l = drawable;
        }
    }

    /* renamed from: C */
    public void m575C(boolean z3) {
        this.f763n = z3;
        this.f764o = true;
    }

    /* renamed from: D */
    public boolean m576D() {
        C0125g c0125g;
        if (!this.f763n || m583x() || (c0125g = this.f545c) == null || this.f551i == null || this.f756A != null || c0125g.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC0146c runnableC0146c = new RunnableC0146c(new C0148e(this.f544b, this.f545c, this.f760k, true));
        this.f756A = runnableC0146c;
        ((View) this.f551i).post(runnableC0146c);
        return true;
    }

    @Override // androidx.core.view.AbstractC0337b.a
    /* renamed from: a */
    public void mo577a(boolean z3) {
        if (z3) {
            super.onSubMenuSelected(null);
            return;
        }
        C0125g c0125g = this.f545c;
        if (c0125g != null) {
            c0125g.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0120b
    /* renamed from: c */
    public void mo430c(C0127i c0127i, InterfaceC0132n.a aVar) {
        aVar.initialize(c0127i, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f551i);
        if (this.f757B == null) {
            this.f757B = new C0145b();
        }
        actionMenuItemView.setPopupCallback(this.f757B);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0120b
    /* renamed from: e */
    public boolean mo432e(ViewGroup viewGroup, int i4) {
        if (viewGroup.getChildAt(i4) == this.f760k) {
            return false;
        }
        return super.mo432e(viewGroup, i4);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public boolean flagActionItems() {
        ArrayList<C0127i> visibleItems;
        int size;
        int i4;
        int iM589n;
        int i5;
        ActionMenuPresenter actionMenuPresenter = this;
        C0125g c0125g = actionMenuPresenter.f545c;
        View view = null;
        int i6 = 0;
        if (c0125g != null) {
            visibleItems = c0125g.getVisibleItems();
            size = visibleItems.size();
        } else {
            visibleItems = null;
            size = 0;
        }
        int i7 = actionMenuPresenter.f767r;
        int i8 = actionMenuPresenter.f766q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f551i;
        boolean z3 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C0127i c0127i = visibleItems.get(i11);
            if (c0127i.m490o()) {
                i9++;
            } else if (c0127i.m489n()) {
                i10++;
            } else {
                z3 = true;
            }
            if (actionMenuPresenter.f771v && c0127i.isActionViewExpanded()) {
                i7 = 0;
            }
        }
        if (actionMenuPresenter.f763n && (z3 || i10 + i9 > i7)) {
            i7--;
        }
        int i12 = i7 - i9;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f773x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f769t) {
            int i13 = actionMenuPresenter.f772w;
            iM589n = i8 / i13;
            i4 = i13 + ((i8 % i13) / iM589n);
        } else {
            i4 = 0;
            iM589n = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            C0127i c0127i2 = visibleItems.get(i14);
            if (c0127i2.m490o()) {
                View viewMo434g = actionMenuPresenter.mo434g(c0127i2, view, viewGroup);
                if (actionMenuPresenter.f769t) {
                    iM589n -= ActionMenuView.m589n(viewMo434g, i4, iM589n, iMakeMeasureSpec, i6);
                } else {
                    viewMo434g.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewMo434g.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                int groupId = c0127i2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0127i2.m496u(true);
                i5 = size;
            } else if (c0127i2.m489n()) {
                int groupId2 = c0127i2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i12 > 0 || z4) && i8 > 0 && (!actionMenuPresenter.f769t || iM589n > 0);
                boolean z6 = z5;
                i5 = size;
                if (z5) {
                    View viewMo434g2 = actionMenuPresenter.mo434g(c0127i2, null, viewGroup);
                    if (actionMenuPresenter.f769t) {
                        int iM589n2 = ActionMenuView.m589n(viewMo434g2, i4, iM589n, iMakeMeasureSpec, 0);
                        iM589n -= iM589n2;
                        if (iM589n2 == 0) {
                            z6 = false;
                        }
                    } else {
                        viewMo434g2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z7 = z6;
                    int measuredWidth2 = viewMo434g2.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z5 = z7 & (!actionMenuPresenter.f769t ? i8 + i15 <= 0 : i8 < 0);
                }
                if (z5 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i16 = 0; i16 < i14; i16++) {
                        C0127i c0127i3 = visibleItems.get(i16);
                        if (c0127i3.getGroupId() == groupId2) {
                            if (c0127i3.m487l()) {
                                i12++;
                            }
                            c0127i3.m496u(false);
                        }
                    }
                }
                if (z5) {
                    i12--;
                }
                c0127i2.m496u(z5);
            } else {
                i5 = size;
                c0127i2.m496u(false);
                i14++;
                view = null;
                actionMenuPresenter = this;
                size = i5;
                i6 = 0;
            }
            i14++;
            view = null;
            actionMenuPresenter = this;
            size = i5;
            i6 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0120b
    /* renamed from: g */
    public View mo434g(C0127i c0127i, View view, ViewGroup viewGroup) {
        View actionView = c0127i.getActionView();
        if (actionView == null || c0127i.m485j()) {
            actionView = super.mo434g(c0127i, view, viewGroup);
        }
        actionView.setVisibility(c0127i.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0120b
    /* renamed from: h */
    public InterfaceC0132n mo435h(ViewGroup viewGroup) {
        InterfaceC0132n interfaceC0132n = this.f551i;
        InterfaceC0132n interfaceC0132nMo435h = super.mo435h(viewGroup);
        if (interfaceC0132n != interfaceC0132nMo435h) {
            ((ActionMenuView) interfaceC0132nMo435h).setPresenter(this);
        }
        return interfaceC0132nMo435h;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0120b, androidx.appcompat.view.menu.InterfaceC0131m
    public void initForMenu(Context context, C0125g c0125g) {
        super.initForMenu(context, c0125g);
        Resources resources = context.getResources();
        C2619a c2619aM8771b = C2619a.m8771b(context);
        if (!this.f764o) {
            this.f763n = c2619aM8771b.m8778h();
        }
        if (!this.f770u) {
            this.f765p = c2619aM8771b.m8773c();
        }
        if (!this.f768s) {
            this.f767r = c2619aM8771b.m8774d();
        }
        int measuredWidth = this.f765p;
        if (this.f763n) {
            if (this.f760k == null) {
                C0147d c0147d = new C0147d(this.f543a);
                this.f760k = c0147d;
                if (this.f762m) {
                    c0147d.setImageDrawable(this.f761l);
                    this.f761l = null;
                    this.f762m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f760k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f760k.getMeasuredWidth();
        } else {
            this.f760k = null;
        }
        this.f766q = measuredWidth;
        this.f772w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0120b
    /* renamed from: j */
    public boolean mo437j(int i4, C0127i c0127i) {
        return c0127i.m487l();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0120b, androidx.appcompat.view.menu.InterfaceC0131m
    public void onCloseMenu(C0125g c0125g, boolean z3) {
        m578r();
        super.onCloseMenu(c0125g, z3);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i4;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i4 = ((SavedState) parcelable).f776a) > 0 && (menuItemFindItem = this.f545c.findItem(i4)) != null) {
            onSubMenuSelected((SubMenuC0136r) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0131m
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f776a = this.f759D;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0120b, androidx.appcompat.view.menu.InterfaceC0131m
    public boolean onSubMenuSelected(SubMenuC0136r subMenuC0136r) {
        boolean z3 = false;
        if (!subMenuC0136r.hasVisibleItems()) {
            return false;
        }
        SubMenuC0136r subMenuC0136r2 = subMenuC0136r;
        while (subMenuC0136r2.getParentMenu() != this.f545c) {
            subMenuC0136r2 = (SubMenuC0136r) subMenuC0136r2.getParentMenu();
        }
        View viewM572s = m572s(subMenuC0136r2.getItem());
        if (viewM572s == null) {
            return false;
        }
        this.f759D = subMenuC0136r.getItem().getItemId();
        int size = subMenuC0136r.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = subMenuC0136r.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z3 = true;
                break;
            }
            i4++;
        }
        C0144a c0144a = new C0144a(this.f544b, subMenuC0136r, viewM572s);
        this.f775z = c0144a;
        c0144a.m526g(z3);
        this.f775z.m530k();
        super.onSubMenuSelected(subMenuC0136r);
        return true;
    }

    /* renamed from: r */
    public boolean m578r() {
        return m580u() | m581v();
    }

    /* renamed from: t */
    public Drawable m579t() {
        C0147d c0147d = this.f760k;
        if (c0147d != null) {
            return c0147d.getDrawable();
        }
        if (this.f762m) {
            return this.f761l;
        }
        return null;
    }

    /* renamed from: u */
    public boolean m580u() {
        Object obj;
        RunnableC0146c runnableC0146c = this.f756A;
        if (runnableC0146c != null && (obj = this.f551i) != null) {
            ((View) obj).removeCallbacks(runnableC0146c);
            this.f756A = null;
            return true;
        }
        C0148e c0148e = this.f774y;
        if (c0148e == null) {
            return false;
        }
        c0148e.m521b();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0120b, androidx.appcompat.view.menu.InterfaceC0131m
    public void updateMenuView(boolean z3) {
        super.updateMenuView(z3);
        ((View) this.f551i).requestLayout();
        C0125g c0125g = this.f545c;
        boolean z4 = false;
        if (c0125g != null) {
            ArrayList<C0127i> actionItems = c0125g.getActionItems();
            int size = actionItems.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractC0337b abstractC0337bMo425b = actionItems.get(i4).mo425b();
                if (abstractC0337bMo425b != null) {
                    abstractC0337bMo425b.m1849i(this);
                }
            }
        }
        C0125g c0125g2 = this.f545c;
        ArrayList<C0127i> nonActionItems = c0125g2 != null ? c0125g2.getNonActionItems() : null;
        if (this.f763n && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z4 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f760k == null) {
                this.f760k = new C0147d(this.f543a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f760k.getParent();
            if (viewGroup != this.f551i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f760k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f551i;
                actionMenuView.addView(this.f760k, actionMenuView.m595h());
            }
        } else {
            C0147d c0147d = this.f760k;
            if (c0147d != null) {
                Object parent = c0147d.getParent();
                Object obj = this.f551i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f760k);
                }
            }
        }
        ((ActionMenuView) this.f551i).setOverflowReserved(this.f763n);
    }

    /* renamed from: v */
    public boolean m581v() {
        C0144a c0144a = this.f775z;
        if (c0144a == null) {
            return false;
        }
        c0144a.m521b();
        return true;
    }

    /* renamed from: w */
    public boolean m582w() {
        return this.f756A != null || m583x();
    }

    /* renamed from: x */
    public boolean m583x() {
        C0148e c0148e = this.f774y;
        return c0148e != null && c0148e.m523d();
    }

    /* renamed from: y */
    public void m584y(Configuration configuration) {
        if (!this.f768s) {
            this.f767r = C2619a.m8771b(this.f544b).m8774d();
        }
        C0125g c0125g = this.f545c;
        if (c0125g != null) {
            c0125g.onItemsChanged(true);
        }
    }

    /* renamed from: z */
    public void m585z(boolean z3) {
        this.f771v = z3;
    }
}
