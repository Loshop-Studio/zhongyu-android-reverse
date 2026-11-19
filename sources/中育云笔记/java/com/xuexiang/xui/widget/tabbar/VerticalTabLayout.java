package com.xuexiang.xui.widget.tabbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.widget.tabbar.vertical.C8292c;
import com.xuexiang.xui.widget.tabbar.vertical.TabView;
import com.xuexiang.xui.widget.tabbar.vertical.XTabView;
import java.util.ArrayList;
import java.util.List;
import p238l9.InterfaceC10162b;

/* loaded from: classes5.dex */
public class VerticalTabLayout extends ScrollView {

    /* renamed from: r */
    public static int f17158r = 10;

    /* renamed from: s */
    public static int f17159s = 11;

    /* renamed from: c */
    public Context f17160c;

    /* renamed from: d */
    public C8289k f17161d;

    /* renamed from: e */
    public int f17162e;

    /* renamed from: f */
    public TabView f17163f;

    /* renamed from: g */
    public int f17164g;

    /* renamed from: h */
    public int f17165h;

    /* renamed from: i */
    public int f17166i;

    /* renamed from: j */
    public float f17167j;

    /* renamed from: k */
    public int f17168k;

    /* renamed from: l */
    public int f17169l;

    /* renamed from: m */
    public ViewPager f17170m;

    /* renamed from: n */
    public PagerAdapter f17171n;

    /* renamed from: o */
    public List f17172o;

    /* renamed from: p */
    public C8286h f17173p;

    /* renamed from: q */
    public DataSetObserver f17174q;

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$a */
    public class RunnableC8279a implements Runnable {
        public RunnableC8279a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VerticalTabLayout.this.f17161d.m13415j(0.0f);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$b */
    public class ViewOnClickListenerC8280b implements View.OnClickListener {
        public ViewOnClickListenerC8280b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VerticalTabLayout.this.setTabSelected(VerticalTabLayout.this.f17161d.indexOfChild(view));
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$c */
    public class RunnableC8281c implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f17177c;

        /* renamed from: d */
        public final /* synthetic */ boolean f17178d;

        /* renamed from: e */
        public final /* synthetic */ boolean f17179e;

        public RunnableC8281c(int i10, boolean z10, boolean z11) {
            this.f17177c = i10;
            this.f17178d = z10;
            this.f17179e = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            VerticalTabLayout.this.m13402x(this.f17177c, this.f17178d, this.f17179e);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$d */
    public class RunnableC8282d implements Runnable {
        public RunnableC8282d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VerticalTabLayout.this.f17161d.m13418m();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$e */
    public class RunnableC8283e implements Runnable {
        public RunnableC8283e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VerticalTabLayout.this.f17161d.m13418m();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$f */
    public class RunnableC8284f implements Runnable {
        public RunnableC8284f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VerticalTabLayout.this.f17161d.m13418m();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$g */
    public class C8285g implements InterfaceC8287i {
        public C8285g() {
        }

        @Override // com.xuexiang.xui.widget.tabbar.VerticalTabLayout.InterfaceC8287i
        /* renamed from: a */
        public void mo13403a(TabView tabView, int i10) {
        }

        @Override // com.xuexiang.xui.widget.tabbar.VerticalTabLayout.InterfaceC8287i
        /* renamed from: b */
        public void mo13404b(TabView tabView, int i10) {
            if (VerticalTabLayout.this.f17170m == null || VerticalTabLayout.this.f17170m.getAdapter() == null || i10 < 0 || i10 >= VerticalTabLayout.this.f17170m.getAdapter().getCount()) {
                return;
            }
            VerticalTabLayout.this.f17170m.setCurrentItem(i10);
        }

        @Override // com.xuexiang.xui.widget.tabbar.VerticalTabLayout.InterfaceC8287i
        /* renamed from: c */
        public void mo13405c(TabView tabView, int i10) {
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$h */
    public class C8286h implements ViewPager.OnPageChangeListener {

        /* renamed from: c */
        public int f17185c;

        /* renamed from: d */
        public boolean f17186d;

        public C8286h() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            int i11 = this.f17185c;
            this.f17185c = i10;
            this.f17186d = (i10 == 2 && i11 == 0) ? false : true;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            if (this.f17186d) {
                VerticalTabLayout.this.f17161d.m13415j(f10 + i10);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            if (i10 != VerticalTabLayout.this.getSelectedTabPosition()) {
                VerticalTabLayout.this.m13401w(i10, !this.f17186d, true);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$i */
    public interface InterfaceC8287i {
        /* renamed from: a */
        void mo13403a(TabView tabView, int i10);

        /* renamed from: b */
        void mo13404b(TabView tabView, int i10);

        /* renamed from: c */
        void mo13405c(TabView tabView, int i10);
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$j */
    public class C8288j extends DataSetObserver {
        public C8288j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VerticalTabLayout.this.m13397s();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VerticalTabLayout.this.m13397s();
        }

        public /* synthetic */ C8288j(VerticalTabLayout verticalTabLayout, RunnableC8279a runnableC8279a) {
            this();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$k */
    public class C8289k extends LinearLayout {

        /* renamed from: c */
        public float f17189c;

        /* renamed from: d */
        public float f17190d;

        /* renamed from: e */
        public float f17191e;

        /* renamed from: f */
        public int f17192f;

        /* renamed from: g */
        public Paint f17193g;

        /* renamed from: h */
        public RectF f17194h;

        /* renamed from: i */
        public AnimatorSet f17195i;

        /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$k$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (VerticalTabLayout.this.f17166i == 5) {
                    C8289k.this.f17190d = r0.getWidth() - VerticalTabLayout.this.f17165h;
                } else if (VerticalTabLayout.this.f17166i == 119) {
                    C8289k c8289k = C8289k.this;
                    c8289k.f17192f = VerticalTabLayout.this.f17165h;
                    C8289k c8289k2 = C8289k.this;
                    VerticalTabLayout.this.f17165h = c8289k2.getWidth();
                }
                C8289k.this.invalidate();
            }
        }

        /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$k$b */
        public class b implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ int f17198c;

            /* renamed from: d */
            public final /* synthetic */ float f17199d;

            /* renamed from: e */
            public final /* synthetic */ float f17200e;

            /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$k$b$a */
            public class a implements ValueAnimator.AnimatorUpdateListener {
                public a() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C8289k.this.f17191e = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                    C8289k.this.invalidate();
                }
            }

            /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$k$b$b, reason: collision with other inner class name */
            public class C12120b implements ValueAnimator.AnimatorUpdateListener {
                public C12120b() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C8289k.this.f17189c = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                    C8289k.this.invalidate();
                }
            }

            /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$k$b$c */
            public class c implements ValueAnimator.AnimatorUpdateListener {
                public c() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C8289k.this.f17189c = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                    C8289k.this.invalidate();
                }
            }

            /* renamed from: com.xuexiang.xui.widget.tabbar.VerticalTabLayout$k$b$d */
            public class d implements ValueAnimator.AnimatorUpdateListener {
                public d() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C8289k.this.f17191e = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                    C8289k.this.invalidate();
                }
            }

            public b(int i10, float f10, float f11) {
                this.f17198c = i10;
                this.f17199d = f10;
                this.f17200e = f11;
            }

            @Override // java.lang.Runnable
            public void run() {
                ValueAnimator duration;
                ValueAnimator duration2;
                int i10 = this.f17198c;
                if (i10 > 0) {
                    duration = ValueAnimator.ofFloat(C8289k.this.f17191e, this.f17199d).setDuration(100L);
                    duration.addUpdateListener(new a());
                    duration2 = ValueAnimator.ofFloat(C8289k.this.f17189c, this.f17200e).setDuration(100L);
                    duration2.addUpdateListener(new C12120b());
                } else if (i10 < 0) {
                    duration = ValueAnimator.ofFloat(C8289k.this.f17189c, this.f17200e).setDuration(100L);
                    duration.addUpdateListener(new c());
                    duration2 = ValueAnimator.ofFloat(C8289k.this.f17191e, this.f17199d).setDuration(100L);
                    duration2.addUpdateListener(new d());
                } else {
                    duration = null;
                    duration2 = null;
                }
                if (duration != null) {
                    C8289k.this.f17195i = new AnimatorSet();
                    C8289k.this.f17195i.play(duration2).after(duration);
                    C8289k.this.f17195i.start();
                }
            }
        }

        public C8289k(Context context) {
            super(context);
            setWillNotDraw(false);
            setOrientation(1);
            Paint paint = new Paint();
            this.f17193g = paint;
            paint.setAntiAlias(true);
            VerticalTabLayout.this.f17166i = VerticalTabLayout.this.f17166i == 0 ? 3 : VerticalTabLayout.this.f17166i;
            this.f17194h = new RectF();
            m13417l();
        }

        /* renamed from: i */
        public final void m13414i(float f10) {
            double d10 = f10;
            int iFloor = (int) Math.floor(d10);
            View childAt = getChildAt(iFloor);
            if (Math.floor(d10) == getChildCount() - 1 || Math.ceil(d10) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                this.f17189c = childAt.getTop();
                this.f17191e = childAt.getBottom();
            } else {
                View childAt2 = getChildAt(iFloor + 1);
                float f11 = f10 - iFloor;
                this.f17189c = childAt.getTop() + ((childAt2.getTop() - childAt.getTop()) * f11);
                this.f17191e = childAt.getBottom() + ((childAt2.getBottom() - childAt.getBottom()) * f11);
            }
        }

        /* renamed from: j */
        public void m13415j(float f10) {
            m13414i(f10);
            invalidate();
        }

        /* renamed from: k */
        public void m13416k(int i10) {
            int selectedTabPosition = i10 - VerticalTabLayout.this.getSelectedTabPosition();
            View childAt = getChildAt(i10);
            float top2 = childAt.getTop();
            float bottom = childAt.getBottom();
            if (this.f17189c == top2 && this.f17191e == bottom) {
                return;
            }
            AnimatorSet animatorSet = this.f17195i;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f17195i.end();
            }
            post(new b(selectedTabPosition, bottom, top2));
        }

        /* renamed from: l */
        public void m13417l() {
            if (VerticalTabLayout.this.f17166i == 3) {
                this.f17190d = 0.0f;
                int i10 = this.f17192f;
                if (i10 != 0) {
                    VerticalTabLayout.this.f17165h = i10;
                }
                setPadding(VerticalTabLayout.this.f17165h, 0, 0, 0);
            } else if (VerticalTabLayout.this.f17166i == 5) {
                int i11 = this.f17192f;
                if (i11 != 0) {
                    VerticalTabLayout.this.f17165h = i11;
                }
                setPadding(0, 0, VerticalTabLayout.this.f17165h, 0);
            } else if (VerticalTabLayout.this.f17166i == 119) {
                this.f17190d = 0.0f;
                setPadding(0, 0, 0, 0);
            }
            post(new a());
        }

        /* renamed from: m */
        public void m13418m() {
            m13416k(VerticalTabLayout.this.getSelectedTabPosition());
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f17193g.setColor(VerticalTabLayout.this.f17162e);
            RectF rectF = this.f17194h;
            float f10 = this.f17190d;
            rectF.left = f10;
            rectF.top = this.f17189c;
            rectF.right = f10 + VerticalTabLayout.this.f17165h;
            this.f17194h.bottom = this.f17191e;
            if (VerticalTabLayout.this.f17167j != 0.0f) {
                canvas.drawRoundRect(this.f17194h, VerticalTabLayout.this.f17167j, VerticalTabLayout.this.f17167j, this.f17193g);
            } else {
                canvas.drawRect(this.f17194h, this.f17193g);
            }
        }
    }

    public VerticalTabLayout(Context context) {
        this(context, null);
    }

    public int getSelectedTabPosition() {
        return m13393o(this.f17163f);
    }

    public InterfaceC10162b getTabAdapter() {
        return null;
    }

    public int getTabCount() {
        return this.f17161d.getChildCount();
    }

    /* renamed from: l */
    public void m13390l(InterfaceC8287i interfaceC8287i) {
        if (interfaceC8287i != null) {
            this.f17172o.add(interfaceC8287i);
        }
    }

    /* renamed from: m */
    public void m13391m(TabView tabView) {
        if (tabView == null) {
            throw new IllegalStateException("tabView can't be null");
        }
        m13392n(tabView);
        tabView.setOnClickListener(new ViewOnClickListenerC8280b());
    }

    /* renamed from: n */
    public final void m13392n(TabView tabView) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        m13396r(layoutParams);
        this.f17161d.addView(tabView, layoutParams);
        if (this.f17161d.indexOfChild(tabView) == 0) {
            tabView.setChecked(true);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) tabView.getLayoutParams();
            layoutParams2.setMargins(0, 0, 0, 0);
            tabView.setLayoutParams(layoutParams2);
            this.f17163f = tabView;
            this.f17161d.post(new RunnableC8279a());
        }
    }

    /* renamed from: o */
    public int m13393o(TabView tabView) {
        int iIndexOfChild = this.f17161d.indexOfChild(tabView);
        if (iIndexOfChild == -1) {
            return 0;
        }
        return iIndexOfChild;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 0) {
            removeAllViews();
        }
        m13395q();
    }

    /* renamed from: p */
    public TabView m13394p(int i10) {
        return (TabView) this.f17161d.getChildAt(i10);
    }

    /* renamed from: q */
    public final void m13395q() {
        C8289k c8289k = new C8289k(this.f17160c);
        this.f17161d = c8289k;
        addView(c8289k, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: r */
    public final void m13396r(LinearLayout.LayoutParams layoutParams) {
        int i10 = this.f17168k;
        if (i10 == f17158r) {
            layoutParams.height = 0;
            layoutParams.weight = 1.0f;
            layoutParams.setMargins(0, 0, 0, 0);
            setFillViewport(true);
            return;
        }
        if (i10 == f17159s) {
            layoutParams.height = this.f17169l;
            layoutParams.weight = 0.0f;
            layoutParams.setMargins(0, this.f17164g, 0, 0);
            setFillViewport(false);
        }
    }

    /* renamed from: s */
    public final void m13397s() {
        int currentItem;
        m13398t();
        PagerAdapter pagerAdapter = this.f17171n;
        if (pagerAdapter == null) {
            m13398t();
            return;
        }
        int count = pagerAdapter.getCount();
        for (int i10 = 0; i10 < count; i10++) {
            CharSequence pageTitle = this.f17171n.getPageTitle(i10);
            m13391m(new XTabView(this.f17160c).m13430j(new C8292c.a().m13486f(pageTitle != null ? pageTitle.toString() : "tab" + i10).m13485e()));
        }
        ViewPager viewPager = this.f17170m;
        if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        setTabSelected(currentItem);
    }

    public void setIndicatorColor(int i10) {
        this.f17162e = i10;
        this.f17161d.invalidate();
    }

    public void setIndicatorCorners(int i10) {
        this.f17167j = i10;
        this.f17161d.invalidate();
    }

    public void setIndicatorGravity(int i10) {
        if (i10 != 3 && i10 != 5 && 119 != i10) {
            throw new IllegalStateException("only support Gravity.LEFT, Gravity.RIGHT, Gravity.FILL");
        }
        this.f17166i = i10;
        this.f17161d.m13417l();
    }

    public void setIndicatorWidth(int i10) {
        this.f17165h = i10;
        this.f17161d.m13417l();
    }

    public void setTabAdapter(InterfaceC10162b interfaceC10162b) {
        m13398t();
        if (interfaceC10162b != null) {
            for (int i10 = 0; i10 < interfaceC10162b.getCount(); i10++) {
                m13391m(new XTabView(this.f17160c).m13429i(interfaceC10162b.m21208c(i10)).m13430j(interfaceC10162b.m21207b(i10)).m13427g(interfaceC10162b.m21209d(i10)).m13426f(interfaceC10162b.m21206a(i10)));
            }
        }
    }

    public void setTabHeight(int i10) {
        if (i10 == this.f17169l) {
            return;
        }
        this.f17169l = i10;
        if (this.f17168k == f17158r) {
            return;
        }
        for (int i11 = 0; i11 < this.f17161d.getChildCount(); i11++) {
            View childAt = this.f17161d.getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.height = this.f17169l;
            childAt.setLayoutParams(layoutParams);
        }
        this.f17161d.invalidate();
        this.f17161d.post(new RunnableC8284f());
    }

    public void setTabMargin(int i10) {
        if (i10 == this.f17164g) {
            return;
        }
        this.f17164g = i10;
        if (this.f17168k == f17158r) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f17161d.getChildCount()) {
            View childAt = this.f17161d.getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.setMargins(0, i11 == 0 ? 0 : this.f17164g, 0, 0);
            childAt.setLayoutParams(layoutParams);
            i11++;
        }
        this.f17161d.invalidate();
        this.f17161d.post(new RunnableC8283e());
    }

    public void setTabMode(int i10) {
        if (i10 != f17158r && i10 != f17159s) {
            throw new IllegalStateException("only support TAB_MODE_FIXED or TAB_MODE_SCROLLABLE");
        }
        if (i10 == this.f17168k) {
            return;
        }
        this.f17168k = i10;
        for (int i11 = 0; i11 < this.f17161d.getChildCount(); i11++) {
            View childAt = this.f17161d.getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            m13396r(layoutParams);
            if (i11 == 0) {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            childAt.setLayoutParams(layoutParams);
        }
        this.f17161d.invalidate();
        this.f17161d.post(new RunnableC8282d());
    }

    public void setTabSelected(int i10) {
        m13401w(i10, true, true);
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        C8286h c8286h;
        ViewPager viewPager2 = this.f17170m;
        if (viewPager2 != null && (c8286h = this.f17173p) != null) {
            viewPager2.removeOnPageChangeListener(c8286h);
        }
        if (viewPager == null) {
            this.f17170m = null;
            m13400v(null, true);
            return;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.f17170m = viewPager;
        if (this.f17173p == null) {
            this.f17173p = new C8286h();
        }
        viewPager.addOnPageChangeListener(this.f17173p);
        m13390l(new C8285g());
        m13400v(adapter, true);
    }

    /* renamed from: t */
    public void m13398t() {
        this.f17161d.removeAllViews();
        this.f17163f = null;
    }

    /* renamed from: u */
    public final void m13399u(int i10) {
        TabView tabViewM13394p = m13394p(i10);
        int top2 = (tabViewM13394p.getTop() + (tabViewM13394p.getHeight() / 2)) - getScrollY();
        int height = getHeight() / 2;
        if (top2 > height) {
            smoothScrollBy(0, top2 - height);
        } else if (top2 < height) {
            smoothScrollBy(0, top2 - height);
        }
    }

    /* renamed from: v */
    public final void m13400v(PagerAdapter pagerAdapter, boolean z10) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.f17171n;
        if (pagerAdapter2 != null && (dataSetObserver = this.f17174q) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f17171n = pagerAdapter;
        if (z10 && pagerAdapter != null) {
            if (this.f17174q == null) {
                this.f17174q = new C8288j(this, null);
            }
            pagerAdapter.registerDataSetObserver(this.f17174q);
        }
        m13397s();
    }

    /* renamed from: w */
    public final void m13401w(int i10, boolean z10, boolean z11) {
        post(new RunnableC8281c(i10, z10, z11));
    }

    /* renamed from: x */
    public final void m13402x(int i10, boolean z10, boolean z11) {
        TabView tabViewM13394p = m13394p(i10);
        TabView tabView = this.f17163f;
        boolean z12 = tabViewM13394p != tabView;
        TabView tabView2 = null;
        if (z12) {
            if (tabView != null) {
                tabView.setChecked(false);
                tabView2 = this.f17163f;
            }
            tabViewM13394p.setChecked(true);
            if (z10) {
                this.f17161d.m13416k(i10);
            }
            m13399u(i10);
            this.f17163f = tabViewM13394p;
        }
        if (z11) {
            for (int i11 = 0; i11 < this.f17172o.size(); i11++) {
                InterfaceC8287i interfaceC8287i = (InterfaceC8287i) this.f17172o.get(i11);
                if (interfaceC8287i != null) {
                    if (z12) {
                        interfaceC8287i.mo13404b(tabViewM13394p, i10);
                        if (tabView2 != null) {
                            interfaceC8287i.mo13403a(tabView2, m13393o(tabView2));
                        }
                    } else {
                        interfaceC8287i.mo13405c(tabViewM13394p, i10);
                    }
                }
            }
        }
    }

    public VerticalTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalTabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17160c = context;
        this.f17172o = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VerticalTabLayout);
        this.f17162e = typedArrayObtainStyledAttributes.getColor(R$styleable.VerticalTabLayout_vtl_indicator_color, AbstractC8041g.m12217d(context, R$attr.colorAccent));
        this.f17165h = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalTabLayout_vtl_indicator_width, AbstractC8037c.m12188b(context, 3.0f));
        this.f17167j = typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalTabLayout_vtl_indicator_corners, 0.0f);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.VerticalTabLayout_vtl_indicator_gravity, 3);
        this.f17166i = integer;
        if (integer == 3) {
            this.f17166i = 3;
        } else if (integer == 5) {
            this.f17166i = 5;
        } else if (integer == 119) {
            this.f17166i = 119;
        }
        this.f17164g = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalTabLayout_vtl_tab_margin, 0.0f);
        this.f17168k = typedArrayObtainStyledAttributes.getInteger(R$styleable.VerticalTabLayout_vtl_tab_mode, f17158r);
        this.f17169l = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.VerticalTabLayout_vtl_tab_height, -2.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
