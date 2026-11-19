package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p005b.p006c.AbstractC0015a;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p012g.C0045f;
import p000a.p005b.p012g.InterfaceC0041b;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p012g.p013i.C0056i;
import p000a.p005b.p012g.p013i.InterfaceC0060m;
import p000a.p005b.p012g.p013i.SubMenuC0065r;
import p000a.p005b.p014h.C0069a1;
import p000a.p005b.p014h.C0073c;
import p000a.p005b.p014h.C0094m0;
import p000a.p005b.p014h.C0110u0;
import p000a.p005b.p014h.C0113w;
import p000a.p005b.p014h.C0114w0;
import p000a.p005b.p014h.InterfaceC0068a0;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p049j.p050a.AbstractC0287a;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public ColorStateList f2945A;

    /* renamed from: B */
    public ColorStateList f2946B;

    /* renamed from: C */
    public boolean f2947C;

    /* renamed from: D */
    public boolean f2948D;

    /* renamed from: E */
    public final ArrayList<View> f2949E;

    /* renamed from: F */
    public final ArrayList<View> f2950F;

    /* renamed from: G */
    public final int[] f2951G;

    /* renamed from: H */
    public InterfaceC0496f f2952H;

    /* renamed from: I */
    public final ActionMenuView.InterfaceC0472e f2953I;

    /* renamed from: J */
    public C0114w0 f2954J;

    /* renamed from: K */
    public C0073c f2955K;

    /* renamed from: L */
    public C0494d f2956L;

    /* renamed from: M */
    public boolean f2957M;

    /* renamed from: N */
    public final Runnable f2958N;

    /* renamed from: b */
    public ActionMenuView f2959b;

    /* renamed from: c */
    public TextView f2960c;

    /* renamed from: d */
    public TextView f2961d;

    /* renamed from: e */
    public ImageButton f2962e;

    /* renamed from: f */
    public ImageView f2963f;

    /* renamed from: g */
    public Drawable f2964g;

    /* renamed from: h */
    public CharSequence f2965h;

    /* renamed from: i */
    public ImageButton f2966i;

    /* renamed from: j */
    public View f2967j;

    /* renamed from: k */
    public Context f2968k;

    /* renamed from: l */
    public int f2969l;

    /* renamed from: m */
    public int f2970m;

    /* renamed from: n */
    public int f2971n;

    /* renamed from: o */
    public int f2972o;

    /* renamed from: p */
    public int f2973p;

    /* renamed from: q */
    public int f2974q;

    /* renamed from: r */
    public int f2975r;

    /* renamed from: s */
    public int f2976s;

    /* renamed from: t */
    public int f2977t;

    /* renamed from: u */
    public C0094m0 f2978u;

    /* renamed from: v */
    public int f2979v;

    /* renamed from: w */
    public int f2980w;

    /* renamed from: x */
    public int f2981x;

    /* renamed from: y */
    public CharSequence f2982y;

    /* renamed from: z */
    public CharSequence f2983z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0491a implements ActionMenuView.InterfaceC0472e {
        public C0491a() {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC0492b implements Runnable {
        public RunnableC0492b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m1631u();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class ViewOnClickListenerC0493c implements View.OnClickListener {
        public ViewOnClickListenerC0493c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0494d c0494d = Toolbar.this.f2956L;
            C0056i c0056i = c0494d == null ? null : c0494d.f2988c;
            if (c0056i != null) {
                c0056i.collapseActionView();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0494d implements InterfaceC0060m {

        /* renamed from: b */
        public C0054g f2987b;

        /* renamed from: c */
        public C0056i f2988c;

        public C0494d() {
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
        /* renamed from: c */
        public void mo173c(C0054g c0054g, boolean z) {
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
        /* renamed from: d */
        public boolean mo166d(C0054g c0054g, C0056i c0056i) {
            Toolbar.this.m1613c();
            ViewParent parent = Toolbar.this.f2966i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f2966i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f2966i);
            }
            Toolbar.this.f2967j = c0056i.getActionView();
            this.f2988c = c0056i;
            ViewParent parent2 = Toolbar.this.f2967j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f2967j);
                }
                C0495e c0495eGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c0495eGenerateDefaultLayoutParams.f52a = 8388611 | (toolbar4.f2972o & 112);
                c0495eGenerateDefaultLayoutParams.f2990b = 2;
                toolbar4.f2967j.setLayoutParams(c0495eGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f2967j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((C0495e) childAt.getLayoutParams()).f2990b != 2 && childAt != toolbar6.f2959b) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f2950F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            c0056i.f462C = true;
            c0056i.f477n.m212q(false);
            KeyEvent.Callback callback = Toolbar.this.f2967j;
            if (callback instanceof InterfaceC0041b) {
                ((InterfaceC0041b) callback).mo150a();
            }
            return true;
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
        /* renamed from: g */
        public boolean mo175g(SubMenuC0065r subMenuC0065r) {
            return false;
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
        /* renamed from: h */
        public boolean mo176h() {
            return false;
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
        /* renamed from: i */
        public void mo177i(boolean z) {
            if (this.f2988c != null) {
                C0054g c0054g = this.f2987b;
                boolean z2 = false;
                if (c0054g != null) {
                    int size = c0054g.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f2987b.getItem(i) == this.f2988c) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                mo168k(this.f2987b, this.f2988c);
            }
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
        /* renamed from: j */
        public void mo191j(Context context, C0054g c0054g) {
            C0056i c0056i;
            C0054g c0054g2 = this.f2987b;
            if (c0054g2 != null && (c0056i = this.f2988c) != null) {
                c0054g2.mo199d(c0056i);
            }
            this.f2987b = c0054g;
        }

        @Override // p000a.p005b.p012g.p013i.InterfaceC0060m
        /* renamed from: k */
        public boolean mo168k(C0054g c0054g, C0056i c0056i) {
            KeyEvent.Callback callback = Toolbar.this.f2967j;
            if (callback instanceof InterfaceC0041b) {
                ((InterfaceC0041b) callback).mo151e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f2967j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f2966i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f2967j = null;
            int size = toolbar3.f2950F.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.f2950F.clear();
                    this.f2988c = null;
                    Toolbar.this.requestLayout();
                    c0056i.f462C = false;
                    c0056i.f477n.m212q(false);
                    return true;
                }
                toolbar3.addView(toolbar3.f2950F.get(size));
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0495e extends AbstractC0015a.a {

        /* renamed from: b */
        public int f2990b;

        public C0495e(int i, int i2) {
            super(i, i2);
            this.f2990b = 0;
            this.f52a = 8388627;
        }

        public C0495e(AbstractC0015a.a aVar) {
            super(aVar);
            this.f2990b = 0;
        }

        public C0495e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2990b = 0;
        }

        public C0495e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2990b = 0;
        }

        public C0495e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2990b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0495e(C0495e c0495e) {
            super((AbstractC0015a.a) c0495e);
            this.f2990b = 0;
            this.f2990b = c0495e.f2990b;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface InterfaceC0496f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0497g extends AbstractC0287a {
        public static final Parcelable.Creator<C0497g> CREATOR = new a();

        /* renamed from: d */
        public int f2991d;

        /* renamed from: e */
        public boolean f2992e;

        /* renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public class a implements Parcelable.ClassLoaderCreator<C0497g> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0497g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0497g[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0497g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0497g(parcel, classLoader);
            }
        }

        public C0497g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2991d = parcel.readInt();
            this.f2992e = parcel.readInt() != 0;
        }

        public C0497g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p049j.p050a.AbstractC0287a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1718b, i);
            parcel.writeInt(this.f2991d);
            parcel.writeInt(this.f2992e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1088R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2981x = 8388627;
        this.f2949E = new ArrayList<>();
        this.f2950F = new ArrayList<>();
        this.f2951G = new int[2];
        this.f2953I = new C0491a();
        this.f2958N = new RunnableC0492b();
        Context context2 = getContext();
        int[] iArr = C0014b.f48w;
        C0110u0 c0110u0M414q = C0110u0.m414q(context2, attributeSet, iArr, i, 0);
        C0266o.m874m(this, context, iArr, attributeSet, c0110u0M414q.f810b, i, 0);
        this.f2970m = c0110u0M414q.m426l(28, 0);
        this.f2971n = c0110u0M414q.m426l(19, 0);
        this.f2981x = c0110u0M414q.f810b.getInteger(0, this.f2981x);
        this.f2972o = c0110u0M414q.f810b.getInteger(2, 48);
        int iM419e = c0110u0M414q.m419e(22, 0);
        iM419e = c0110u0M414q.m429o(27) ? c0110u0M414q.m419e(27, iM419e) : iM419e;
        this.f2977t = iM419e;
        this.f2976s = iM419e;
        this.f2975r = iM419e;
        this.f2974q = iM419e;
        int iM419e2 = c0110u0M414q.m419e(25, -1);
        if (iM419e2 >= 0) {
            this.f2974q = iM419e2;
        }
        int iM419e3 = c0110u0M414q.m419e(24, -1);
        if (iM419e3 >= 0) {
            this.f2975r = iM419e3;
        }
        int iM419e4 = c0110u0M414q.m419e(26, -1);
        if (iM419e4 >= 0) {
            this.f2976s = iM419e4;
        }
        int iM419e5 = c0110u0M414q.m419e(23, -1);
        if (iM419e5 >= 0) {
            this.f2977t = iM419e5;
        }
        this.f2973p = c0110u0M414q.m420f(13, -1);
        int iM419e6 = c0110u0M414q.m419e(9, Integer.MIN_VALUE);
        int iM419e7 = c0110u0M414q.m419e(5, Integer.MIN_VALUE);
        int iM420f = c0110u0M414q.m420f(7, 0);
        int iM420f2 = c0110u0M414q.m420f(8, 0);
        m1614d();
        C0094m0 c0094m0 = this.f2978u;
        c0094m0.f715h = false;
        if (iM420f != Integer.MIN_VALUE) {
            c0094m0.f712e = iM420f;
            c0094m0.f708a = iM420f;
        }
        if (iM420f2 != Integer.MIN_VALUE) {
            c0094m0.f713f = iM420f2;
            c0094m0.f709b = iM420f2;
        }
        if (iM419e6 != Integer.MIN_VALUE || iM419e7 != Integer.MIN_VALUE) {
            c0094m0.m365a(iM419e6, iM419e7);
        }
        this.f2979v = c0110u0M414q.m419e(10, Integer.MIN_VALUE);
        this.f2980w = c0110u0M414q.m419e(6, Integer.MIN_VALUE);
        this.f2964g = c0110u0M414q.m421g(4);
        this.f2965h = c0110u0M414q.m428n(3);
        CharSequence charSequenceM428n = c0110u0M414q.m428n(21);
        if (!TextUtils.isEmpty(charSequenceM428n)) {
            setTitle(charSequenceM428n);
        }
        CharSequence charSequenceM428n2 = c0110u0M414q.m428n(18);
        if (!TextUtils.isEmpty(charSequenceM428n2)) {
            setSubtitle(charSequenceM428n2);
        }
        this.f2968k = getContext();
        setPopupTheme(c0110u0M414q.m426l(17, 0));
        Drawable drawableM421g = c0110u0M414q.m421g(16);
        if (drawableM421g != null) {
            setNavigationIcon(drawableM421g);
        }
        CharSequence charSequenceM428n3 = c0110u0M414q.m428n(15);
        if (!TextUtils.isEmpty(charSequenceM428n3)) {
            setNavigationContentDescription(charSequenceM428n3);
        }
        Drawable drawableM421g2 = c0110u0M414q.m421g(11);
        if (drawableM421g2 != null) {
            setLogo(drawableM421g2);
        }
        CharSequence charSequenceM428n4 = c0110u0M414q.m428n(12);
        if (!TextUtils.isEmpty(charSequenceM428n4)) {
            setLogoDescription(charSequenceM428n4);
        }
        if (c0110u0M414q.m429o(29)) {
            setTitleTextColor(c0110u0M414q.m417c(29));
        }
        if (c0110u0M414q.m429o(20)) {
            setSubtitleTextColor(c0110u0M414q.m417c(20));
        }
        if (c0110u0M414q.m429o(14)) {
            getMenuInflater().inflate(c0110u0M414q.m426l(14, 0), getMenu());
        }
        c0110u0M414q.f810b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new C0045f(getContext());
    }

    /* renamed from: a */
    public final void m1611a(List<View> list, int i) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0495e c0495e = (C0495e) childAt.getLayoutParams();
                if (c0495e.f2990b == 0 && m1630t(childAt) && m1620j(c0495e.f52a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0495e c0495e2 = (C0495e) childAt2.getLayoutParams();
            if (c0495e2.f2990b == 0 && m1630t(childAt2) && m1620j(c0495e2.f52a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    public final void m1612b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0495e c0495eGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0495e) layoutParams;
        c0495eGenerateDefaultLayoutParams.f2990b = 1;
        if (!z || this.f2967j == null) {
            addView(view, c0495eGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(c0495eGenerateDefaultLayoutParams);
            this.f2950F.add(view);
        }
    }

    /* renamed from: c */
    public void m1613c() {
        if (this.f2966i == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C1088R.attr.toolbarNavigationButtonStyle);
            this.f2966i = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f2964g);
            this.f2966i.setContentDescription(this.f2965h);
            C0495e c0495eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0495eGenerateDefaultLayoutParams.f52a = 8388611 | (this.f2972o & 112);
            c0495eGenerateDefaultLayoutParams.f2990b = 2;
            this.f2966i.setLayoutParams(c0495eGenerateDefaultLayoutParams);
            this.f2966i.setOnClickListener(new ViewOnClickListenerC0493c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0495e);
    }

    /* renamed from: d */
    public final void m1614d() {
        if (this.f2978u == null) {
            this.f2978u = new C0094m0();
        }
    }

    /* renamed from: e */
    public final void m1615e() {
        m1616f();
        ActionMenuView actionMenuView = this.f2959b;
        if (actionMenuView.f2829q == null) {
            C0054g c0054g = (C0054g) actionMenuView.getMenu();
            if (this.f2956L == null) {
                this.f2956L = new C0494d();
            }
            this.f2959b.setExpandedActionViewsExclusive(true);
            c0054g.m197b(this.f2956L, this.f2968k);
        }
    }

    /* renamed from: f */
    public final void m1616f() {
        if (this.f2959b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2959b = actionMenuView;
            actionMenuView.setPopupTheme(this.f2969l);
            this.f2959b.setOnMenuItemClickListener(this.f2953I);
            ActionMenuView actionMenuView2 = this.f2959b;
            actionMenuView2.f2834v = null;
            actionMenuView2.f2835w = null;
            C0495e c0495eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0495eGenerateDefaultLayoutParams.f52a = 8388613 | (this.f2972o & 112);
            this.f2959b.setLayoutParams(c0495eGenerateDefaultLayoutParams);
            m1612b(this.f2959b, false);
        }
    }

    /* renamed from: g */
    public final void m1617g() {
        if (this.f2962e == null) {
            this.f2962e = new AppCompatImageButton(getContext(), null, C1088R.attr.toolbarNavigationButtonStyle);
            C0495e c0495eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0495eGenerateDefaultLayoutParams.f52a = 8388611 | (this.f2972o & 112);
            this.f2962e.setLayoutParams(c0495eGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0495e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f2966i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f2966i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0094m0 c0094m0 = this.f2978u;
        if (c0094m0 != null) {
            return c0094m0.f714g ? c0094m0.f708a : c0094m0.f709b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f2980w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0094m0 c0094m0 = this.f2978u;
        if (c0094m0 != null) {
            return c0094m0.f708a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0094m0 c0094m0 = this.f2978u;
        if (c0094m0 != null) {
            return c0094m0.f709b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0094m0 c0094m0 = this.f2978u;
        if (c0094m0 != null) {
            return c0094m0.f714g ? c0094m0.f709b : c0094m0.f708a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f2979v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0054g c0054g;
        ActionMenuView actionMenuView = this.f2959b;
        return actionMenuView != null && (c0054g = actionMenuView.f2829q) != null && c0054g.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f2980w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2979v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f2963f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f2963f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1615e();
        return this.f2959b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f2962e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f2962e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0073c getOuterActionMenuPresenter() {
        return this.f2955K;
    }

    public Drawable getOverflowIcon() {
        m1615e();
        return this.f2959b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2968k;
    }

    public int getPopupTheme() {
        return this.f2969l;
    }

    public CharSequence getSubtitle() {
        return this.f2983z;
    }

    public final TextView getSubtitleTextView() {
        return this.f2961d;
    }

    public CharSequence getTitle() {
        return this.f2982y;
    }

    public int getTitleMarginBottom() {
        return this.f2977t;
    }

    public int getTitleMarginEnd() {
        return this.f2975r;
    }

    public int getTitleMarginStart() {
        return this.f2974q;
    }

    public int getTitleMarginTop() {
        return this.f2976s;
    }

    public final TextView getTitleTextView() {
        return this.f2960c;
    }

    public InterfaceC0068a0 getWrapper() {
        if (this.f2954J == null) {
            this.f2954J = new C0114w0(this, true);
        }
        return this.f2954J;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0495e generateDefaultLayoutParams() {
        return new C0495e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0495e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0495e ? new C0495e((C0495e) layoutParams) : layoutParams instanceof AbstractC0015a.a ? new C0495e((AbstractC0015a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0495e((ViewGroup.MarginLayoutParams) layoutParams) : new C0495e(layoutParams);
    }

    /* renamed from: j */
    public final int m1620j(int i) {
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    /* renamed from: k */
    public final int m1621k(View view, int i) {
        C0495e c0495e = (C0495e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c0495e.f52a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f2981x & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0495e).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c0495e).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c0495e).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* renamed from: l */
    public final int m1622l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    /* renamed from: m */
    public final int m1623m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: n */
    public final boolean m1624n(View view) {
        return view.getParent() == this || this.f2950F.contains(view);
    }

    /* renamed from: o */
    public boolean m1625o() {
        ActionMenuView actionMenuView = this.f2959b;
        if (actionMenuView != null) {
            C0073c c0073c = actionMenuView.f2833u;
            if (c0073c != null && c0073c.m289m()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2958N);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2948D = false;
        }
        if (!this.f2948D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f2948D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2948D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0297 A[LOOP:0: B:109:0x0295->B:110:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b9 A[LOOP:1: B:112:0x02b7->B:113:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02de A[LOOP:2: B:115:0x02dc->B:116:0x02de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0333 A[LOOP:3: B:124:0x0331->B:125:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int iM1622l;
        int iMax;
        int iCombineMeasuredStates;
        int iM1622l2;
        int iM1623m;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.f2951G;
        boolean z = true;
        if (C0069a1.m281b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (m1630t(this.f2962e)) {
            m1629s(this.f2962e, i, 0, i2, 0, this.f2973p);
            iM1622l = m1622l(this.f2962e) + this.f2962e.getMeasuredWidth();
            iMax = Math.max(0, m1623m(this.f2962e) + this.f2962e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2962e.getMeasuredState());
        } else {
            iM1622l = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m1630t(this.f2966i)) {
            m1629s(this.f2966i, i, 0, i2, 0, this.f2973p);
            iM1622l = m1622l(this.f2966i) + this.f2966i.getMeasuredWidth();
            iMax = Math.max(iMax, m1623m(this.f2966i) + this.f2966i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2966i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM1622l) + 0;
        iArr[c3] = Math.max(0, currentContentInsetStart - iM1622l);
        if (m1630t(this.f2959b)) {
            m1629s(this.f2959b, i, iMax3, i2, 0, this.f2973p);
            iM1622l2 = m1622l(this.f2959b) + this.f2959b.getMeasuredWidth();
            iMax = Math.max(iMax, m1623m(this.f2959b) + this.f2959b.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2959b.getMeasuredState());
        } else {
            iM1622l2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = Math.max(currentContentInsetEnd, iM1622l2) + iMax3;
        iArr[c2] = Math.max(0, currentContentInsetEnd - iM1622l2);
        if (m1630t(this.f2967j)) {
            iMax4 += m1628r(this.f2967j, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m1623m(this.f2967j) + this.f2967j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2967j.getMeasuredState());
        }
        if (m1630t(this.f2963f)) {
            iMax4 += m1628r(this.f2963f, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m1623m(this.f2963f) + this.f2963f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f2963f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (((C0495e) childAt.getLayoutParams()).f2990b == 0 && m1630t(childAt)) {
                iMax4 += m1628r(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, m1623m(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i4 = this.f2976s + this.f2977t;
        int i5 = this.f2974q + this.f2975r;
        if (m1630t(this.f2960c)) {
            m1628r(this.f2960c, i, iMax4 + i5, i2, i4, iArr);
            int iM1622l3 = m1622l(this.f2960c) + this.f2960c.getMeasuredWidth();
            iM1623m = m1623m(this.f2960c) + this.f2960c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2960c.getMeasuredState());
            iMax2 = iM1622l3;
        } else {
            iM1623m = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m1630t(this.f2961d)) {
            iMax2 = Math.max(iMax2, m1628r(this.f2961d, i, iMax4 + i5, i2, iM1623m + i4, iArr));
            iM1623m = m1623m(this.f2961d) + this.f2961d.getMeasuredHeight() + iM1623m;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f2961d.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, iM1623m);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax5;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f2957M) {
            z = false;
            break;
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            if (m1630t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                z = false;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, z ? 0 : iResolveSizeAndState2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C0497g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0497g c0497g = (C0497g) parcelable;
        super.onRestoreInstanceState(c0497g.f1718b);
        ActionMenuView actionMenuView = this.f2959b;
        C0054g c0054g = actionMenuView != null ? actionMenuView.f2829q : null;
        int i = c0497g.f2991d;
        if (i != 0 && this.f2956L != null && c0054g != null && (menuItemFindItem = c0054g.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c0497g.f2992e) {
            removeCallbacks(this.f2958N);
            post(this.f2958N);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        int i2;
        super.onRtlPropertiesChanged(i);
        m1614d();
        C0094m0 c0094m0 = this.f2978u;
        boolean z = i == 1;
        if (z == c0094m0.f714g) {
            return;
        }
        c0094m0.f714g = z;
        if (c0094m0.f715h) {
            if (z) {
                int i3 = c0094m0.f711d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = c0094m0.f712e;
                }
                c0094m0.f708a = i3;
                i2 = c0094m0.f710c;
                if (i2 == Integer.MIN_VALUE) {
                }
            } else {
                int i4 = c0094m0.f710c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = c0094m0.f712e;
                }
                c0094m0.f708a = i4;
                i2 = c0094m0.f711d;
                if (i2 == Integer.MIN_VALUE) {
                }
            }
            c0094m0.f709b = i2;
        }
        c0094m0.f708a = c0094m0.f712e;
        i2 = c0094m0.f713f;
        c0094m0.f709b = i2;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0056i c0056i;
        C0497g c0497g = new C0497g(super.onSaveInstanceState());
        C0494d c0494d = this.f2956L;
        if (c0494d != null && (c0056i = c0494d.f2988c) != null) {
            c0497g.f2991d = c0056i.f464a;
        }
        c0497g.f2992e = m1625o();
        return c0497g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2947C = false;
        }
        if (!this.f2947C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f2947C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2947C = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m1626p(View view, int i, int[] iArr, int i2) {
        C0495e c0495e = (C0495e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0495e).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM1621k = m1621k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM1621k, iMax + measuredWidth, view.getMeasuredHeight() + iM1621k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0495e).rightMargin + iMax;
    }

    /* renamed from: q */
    public final int m1627q(View view, int i, int[] iArr, int i2) {
        C0495e c0495e = (C0495e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0495e).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM1621k = m1621k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM1621k, iMax, view.getMeasuredHeight() + iM1621k);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0495e).leftMargin);
    }

    /* renamed from: r */
    public final int m1628r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* renamed from: s */
    public final void m1629s(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1613c();
        }
        ImageButton imageButton = this.f2966i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0034a.m129a(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m1613c();
            this.f2966i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f2966i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f2964g);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.f2957M = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2980w) {
            this.f2980w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2979v) {
            this.f2979v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0034a.m129a(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2963f == null) {
                this.f2963f = new AppCompatImageView(getContext(), null);
            }
            if (!m1624n(this.f2963f)) {
                m1612b(this.f2963f, true);
            }
        } else {
            ImageView imageView = this.f2963f;
            if (imageView != null && m1624n(imageView)) {
                removeView(this.f2963f);
                this.f2950F.remove(this.f2963f);
            }
        }
        ImageView imageView2 = this.f2963f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2963f == null) {
            this.f2963f = new AppCompatImageView(getContext(), null);
        }
        ImageView imageView = this.f2963f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1617g();
        }
        ImageButton imageButton = this.f2962e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0034a.m129a(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1617g();
            if (!m1624n(this.f2962e)) {
                m1612b(this.f2962e, true);
            }
        } else {
            ImageButton imageButton = this.f2962e;
            if (imageButton != null && m1624n(imageButton)) {
                removeView(this.f2962e);
                this.f2950F.remove(this.f2962e);
            }
        }
        ImageButton imageButton2 = this.f2962e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1617g();
        this.f2962e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0496f interfaceC0496f) {
        this.f2952H = interfaceC0496f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1615e();
        this.f2959b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f2969l != i) {
            this.f2969l = i;
            if (i == 0) {
                this.f2968k = getContext();
            } else {
                this.f2968k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f2961d;
            if (textView != null && m1624n(textView)) {
                removeView(this.f2961d);
                this.f2950F.remove(this.f2961d);
            }
        } else {
            if (this.f2961d == null) {
                Context context = getContext();
                C0113w c0113w = new C0113w(context, null);
                this.f2961d = c0113w;
                c0113w.setSingleLine();
                this.f2961d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2971n;
                if (i != 0) {
                    this.f2961d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f2946B;
                if (colorStateList != null) {
                    this.f2961d.setTextColor(colorStateList);
                }
            }
            if (!m1624n(this.f2961d)) {
                m1612b(this.f2961d, true);
            }
        }
        TextView textView2 = this.f2961d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2983z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2946B = colorStateList;
        TextView textView = this.f2961d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f2960c;
            if (textView != null && m1624n(textView)) {
                removeView(this.f2960c);
                this.f2950F.remove(this.f2960c);
            }
        } else {
            if (this.f2960c == null) {
                Context context = getContext();
                C0113w c0113w = new C0113w(context, null);
                this.f2960c = c0113w;
                c0113w.setSingleLine();
                this.f2960c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2970m;
                if (i != 0) {
                    this.f2960c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f2945A;
                if (colorStateList != null) {
                    this.f2960c.setTextColor(colorStateList);
                }
            }
            if (!m1624n(this.f2960c)) {
                m1612b(this.f2960c, true);
            }
        }
        TextView textView2 = this.f2960c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f2982y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f2977t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f2975r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f2974q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f2976s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2945A = colorStateList;
        TextView textView = this.f2960c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: t */
    public final boolean m1630t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: u */
    public boolean m1631u() {
        ActionMenuView actionMenuView = this.f2959b;
        if (actionMenuView != null) {
            C0073c c0073c = actionMenuView.f2833u;
            if (c0073c != null && c0073c.m290n()) {
                return true;
            }
        }
        return false;
    }
}
