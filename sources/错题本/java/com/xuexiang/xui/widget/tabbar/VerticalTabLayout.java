package com.xuexiang.xui.widget.tabbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.AbstractC0037f;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.tabbar.vertical.TabView;
import com.xuexiang.xui.widget.tabbar.vertical.XTabView;
import java.util.ArrayList;
import kotlin.collections.AbstractC5806u;
import p017b1.ViewOnClickListenerC3099c;
import p054e7.C5486r;
import p073h4.AbstractC5625a;
import p136p3.C6375m;
import p136p3.C6376n;
import p136p3.C6377o;
import p136p3.C6380r;
import p136p3.RunnableC6373k;
import p136p3.RunnableC6374l;
import p143q3.C6413a;
import p143q3.C6414b;
import p143q3.C6415c;
import p143q3.InterfaceC6416d;

/* loaded from: classes3.dex */
public class VerticalTabLayout extends ScrollView {

    /* renamed from: p */
    public static final /* synthetic */ int f4959p = 0;

    /* renamed from: a */
    public final Context f4960a;

    /* renamed from: b */
    public C6380r f4961b;

    /* renamed from: c */
    public int f4962c;

    /* renamed from: d */
    public TabView f4963d;

    /* renamed from: e */
    public int f4964e;

    /* renamed from: f */
    public int f4965f;

    /* renamed from: g */
    public int f4966g;

    /* renamed from: h */
    public float f4967h;

    /* renamed from: i */
    public int f4968i;

    /* renamed from: j */
    public int f4969j;

    /* renamed from: k */
    public ViewPager f4970k;

    /* renamed from: l */
    public PagerAdapter f4971l;

    /* renamed from: m */
    public final ArrayList f4972m;

    /* renamed from: n */
    public C6376n f4973n;

    /* renamed from: o */
    public C6377o f4974o;

    public VerticalTabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static void m3600a(VerticalTabLayout verticalTabLayout, int i, boolean z8) {
        ArrayList arrayList = verticalTabLayout.f4972m;
        TabView tabView = (TabView) verticalTabLayout.f4961b.getChildAt(i);
        TabView tabView2 = verticalTabLayout.f4963d;
        boolean z9 = tabView != tabView2;
        TabView tabView3 = null;
        if (z9) {
            if (tabView2 != null) {
                tabView2.setChecked(false);
                tabView3 = verticalTabLayout.f4963d;
            }
            tabView.setChecked(true);
            if (z8) {
                verticalTabLayout.f4961b.m6029b(i);
            }
            TabView tabView4 = (TabView) verticalTabLayout.f4961b.getChildAt(i);
            int height = ((tabView4.getHeight() / 2) + tabView4.getTop()) - verticalTabLayout.getScrollY();
            int height2 = verticalTabLayout.getHeight() / 2;
            if (height > height2 || height < height2) {
                verticalTabLayout.smoothScrollBy(0, height - height2);
            }
            verticalTabLayout.f4963d = tabView;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            C6375m c6375m = (C6375m) arrayList.get(i8);
            if (c6375m != null && z9) {
                VerticalTabLayout verticalTabLayout2 = c6375m.f10421a;
                ViewPager viewPager = verticalTabLayout2.f4970k;
                if (viewPager != null && viewPager.getAdapter() != null && i >= 0 && i < verticalTabLayout2.f4970k.getAdapter().getCount()) {
                    verticalTabLayout2.f4970k.setCurrentItem(i);
                }
                if (tabView3 != null) {
                    verticalTabLayout.f4961b.indexOfChild(tabView3);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m3601b(XTabView xTabView) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        m3602c(layoutParams);
        this.f4961b.addView(xTabView, layoutParams);
        if (this.f4961b.indexOfChild(xTabView) == 0) {
            xTabView.setChecked(true);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) xTabView.getLayoutParams();
            layoutParams2.setMargins(0, 0, 0, 0);
            xTabView.setLayoutParams(layoutParams2);
            this.f4963d = xTabView;
            this.f4961b.post(new RunnableC6373k(this, 0));
        }
        xTabView.setOnClickListener(new ViewOnClickListenerC3099c(this, 6));
    }

    /* renamed from: c */
    public final void m3602c(LinearLayout.LayoutParams layoutParams) {
        int i = this.f4968i;
        if (i == 10) {
            layoutParams.height = 0;
            layoutParams.weight = 1.0f;
            layoutParams.setMargins(0, 0, 0, 0);
            setFillViewport(true);
            return;
        }
        if (i == 11) {
            layoutParams.height = this.f4969j;
            layoutParams.weight = 0.0f;
            layoutParams.setMargins(0, this.f4964e, 0, 0);
            setFillViewport(false);
        }
    }

    /* renamed from: d */
    public final void m3603d() {
        int currentItem;
        this.f4961b.removeAllViews();
        this.f4963d = null;
        PagerAdapter pagerAdapter = this.f4971l;
        if (pagerAdapter == null) {
            this.f4961b.removeAllViews();
            this.f4963d = null;
            return;
        }
        int count = pagerAdapter.getCount();
        for (int i = 0; i < count; i++) {
            CharSequence pageTitle = this.f4971l.getPageTitle(i);
            String string = pageTitle != null ? pageTitle.toString() : AbstractC0037f.m81f(i, "tab");
            XTabView xTabView = new XTabView(this.f4960a);
            C5486r c5486r = new C5486r(2);
            c5486r.f8481b = string;
            C6415c c6415c = new C6415c();
            c6415c.f10525a = c5486r;
            xTabView.f4993d = c6415c;
            xTabView.m3608c();
            m3601b(xTabView);
        }
        ViewPager viewPager = this.f4970k;
        if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        setTabSelected(currentItem);
    }

    /* renamed from: e */
    public final void m3604e(PagerAdapter pagerAdapter) {
        C6377o c6377o;
        PagerAdapter pagerAdapter2 = this.f4971l;
        if (pagerAdapter2 != null && (c6377o = this.f4974o) != null) {
            pagerAdapter2.unregisterDataSetObserver(c6377o);
        }
        this.f4971l = pagerAdapter;
        if (pagerAdapter != null) {
            if (this.f4974o == null) {
                this.f4974o = new C6377o(this);
            }
            pagerAdapter.registerDataSetObserver(this.f4974o);
        }
        m3603d();
    }

    public int getSelectedTabPosition() {
        int iIndexOfChild = this.f4961b.indexOfChild(this.f4963d);
        if (iIndexOfChild == -1) {
            return 0;
        }
        return iIndexOfChild;
    }

    public InterfaceC6416d getTabAdapter() {
        return null;
    }

    public int getTabCount() {
        return this.f4961b.getChildCount();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 0) {
            removeAllViews();
        }
        C6380r c6380r = new C6380r(this, this.f4960a);
        this.f4961b = c6380r;
        addView(c6380r, new FrameLayout.LayoutParams(-1, -1));
    }

    public void setIndicatorColor(int i) {
        this.f4962c = i;
        this.f4961b.invalidate();
    }

    public void setIndicatorCorners(int i) {
        this.f4967h = i;
        this.f4961b.invalidate();
    }

    public void setIndicatorGravity(int i) {
        if (i != 3 && i != 5 && 119 != i) {
            throw new IllegalStateException("only support Gravity.LEFT, Gravity.RIGHT, Gravity.FILL");
        }
        this.f4966g = i;
        this.f4961b.m6030c();
    }

    public void setIndicatorWidth(int i) {
        this.f4965f = i;
        this.f4961b.m6030c();
    }

    public void setTabAdapter(InterfaceC6416d interfaceC6416d) {
        this.f4961b.removeAllViews();
        this.f4963d = null;
        if (interfaceC6416d != null) {
            for (int i = 0; i < interfaceC6416d.getCount(); i++) {
                XTabView xTabView = new XTabView(this.f4960a);
                C6414b icon = interfaceC6416d.getIcon();
                if (icon != null) {
                    xTabView.f4992c = icon;
                }
                xTabView.m3607b();
                C6415c title = interfaceC6416d.getTitle();
                if (title != null) {
                    xTabView.f4993d = title;
                }
                xTabView.m3608c();
                C6413a c6413aM6072a = interfaceC6416d.m6072a();
                if (c6413aM6072a != null) {
                    xTabView.f4994e = c6413aM6072a;
                }
                xTabView.m3606a();
                xTabView.m3609d(interfaceC6416d.getBackground());
                m3601b(xTabView);
            }
        }
    }

    public void setTabHeight(int i) {
        if (i == this.f4969j) {
            return;
        }
        this.f4969j = i;
        if (this.f4968i == 10) {
            return;
        }
        for (int i8 = 0; i8 < this.f4961b.getChildCount(); i8++) {
            View childAt = this.f4961b.getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.height = this.f4969j;
            childAt.setLayoutParams(layoutParams);
        }
        this.f4961b.invalidate();
        this.f4961b.post(new RunnableC6373k(this, 3));
    }

    public void setTabMargin(int i) {
        if (i == this.f4964e) {
            return;
        }
        this.f4964e = i;
        if (this.f4968i == 10) {
            return;
        }
        int i8 = 0;
        while (i8 < this.f4961b.getChildCount()) {
            View childAt = this.f4961b.getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.setMargins(0, i8 == 0 ? 0 : this.f4964e, 0, 0);
            childAt.setLayoutParams(layoutParams);
            i8++;
        }
        this.f4961b.invalidate();
        this.f4961b.post(new RunnableC6373k(this, 2));
    }

    public void setTabMode(int i) {
        if (i != 10 && i != 11) {
            throw new IllegalStateException("only support TAB_MODE_FIXED or TAB_MODE_SCROLLABLE");
        }
        if (i == this.f4968i) {
            return;
        }
        this.f4968i = i;
        for (int i8 = 0; i8 < this.f4961b.getChildCount(); i8++) {
            View childAt = this.f4961b.getChildAt(i8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            m3602c(layoutParams);
            if (i8 == 0) {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            childAt.setLayoutParams(layoutParams);
        }
        this.f4961b.invalidate();
        this.f4961b.post(new RunnableC6373k(this, 1));
    }

    public void setTabSelected(int i) {
        post(new RunnableC6374l(this, i, true));
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        C6376n c6376n;
        ViewPager viewPager2 = this.f4970k;
        if (viewPager2 != null && (c6376n = this.f4973n) != null) {
            viewPager2.removeOnPageChangeListener(c6376n);
        }
        if (viewPager == null) {
            this.f4970k = null;
            m3604e(null);
            return;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.f4970k = viewPager;
        if (this.f4973n == null) {
            this.f4973n = new C6376n(this);
        }
        viewPager.addOnPageChangeListener(this.f4973n);
        this.f4972m.add(new C6375m(this));
        m3604e(adapter);
    }

    public VerticalTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4960a = context;
        this.f4972m = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VerticalTabLayout);
        this.f4962c = typedArrayObtainStyledAttributes.getColor(R$styleable.VerticalTabLayout_vtl_indicator_color, AbstractC5806u.m5252F(context, R$attr.colorAccent, 0));
        this.f4965f = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalTabLayout_vtl_indicator_width, AbstractC5625a.m4948h(context, 3.0f));
        this.f4967h = typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalTabLayout_vtl_indicator_corners, 0.0f);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.VerticalTabLayout_vtl_indicator_gravity, 3);
        this.f4966g = integer;
        if (integer == 3) {
            this.f4966g = 3;
        } else if (integer == 5) {
            this.f4966g = 5;
        } else if (integer == 119) {
            this.f4966g = 119;
        }
        this.f4964e = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalTabLayout_vtl_tab_margin, 0.0f);
        this.f4968i = typedArrayObtainStyledAttributes.getInteger(R$styleable.VerticalTabLayout_vtl_tab_mode, 10);
        this.f4969j = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalTabLayout_vtl_tab_height, -2.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
