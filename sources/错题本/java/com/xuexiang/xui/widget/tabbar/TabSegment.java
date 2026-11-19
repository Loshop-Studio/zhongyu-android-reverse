package com.xuexiang.xui.widget.tabbar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.media.AbstractC0037f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import coil3.network.AbstractC3315g;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import kotlin.collections.AbstractC5806u;
import p017b1.ViewOnClickListenerC3099c;
import p061g.AbstractC5535a;
import p073h4.AbstractC5625a;
import p136p3.C6367e;
import p136p3.C6369g;
import p136p3.C6370h;
import p136p3.C6372j;
import p136p3.InterfaceC6368f;
import p136p3.InterfaceC6371i;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class TabSegment extends HorizontalScrollView {

    /* renamed from: B */
    public static final /* synthetic */ int f4927B = 0;

    /* renamed from: A */
    public boolean f4928A;

    /* renamed from: a */
    public final ArrayList f4929a;

    /* renamed from: b */
    public final C4225c f4930b;

    /* renamed from: c */
    public int f4931c;

    /* renamed from: d */
    public int f4932d;

    /* renamed from: e */
    public int f4933e;

    /* renamed from: f */
    public boolean f4934f;

    /* renamed from: g */
    public int f4935g;

    /* renamed from: h */
    public boolean f4936h;

    /* renamed from: i */
    public Drawable f4937i;

    /* renamed from: j */
    public boolean f4938j;

    /* renamed from: k */
    public Rect f4939k;

    /* renamed from: l */
    public Paint f4940l;

    /* renamed from: m */
    public int f4941m;

    /* renamed from: n */
    public int f4942n;

    /* renamed from: o */
    public int f4943o;

    /* renamed from: p */
    public int f4944p;

    /* renamed from: q */
    public int f4945q;

    /* renamed from: r */
    public int f4946r;

    /* renamed from: s */
    public Animator f4947s;

    /* renamed from: t */
    public final ViewOnClickListenerC3099c f4948t;

    /* renamed from: u */
    public ViewPager f4949u;

    /* renamed from: v */
    public PagerAdapter f4950v;

    /* renamed from: w */
    public C6369g f4951w;

    /* renamed from: x */
    public TabLayoutOnPageChangeListener f4952x;

    /* renamed from: y */
    public C6372j f4953y;

    /* renamed from: z */
    public C6367e f4954z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class TabItemView extends RelativeLayout {

        /* renamed from: a */
        public final AppCompatTextView f4955a;

        /* renamed from: b */
        public final GestureDetector f4956b;

        public TabItemView(Context context) {
            super(context);
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f4955a = appCompatTextView;
            appCompatTextView.setSingleLine(true);
            appCompatTextView.setGravity(17);
            appCompatTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            AbstractC6582a.m6218b();
            appCompatTextView.setTypeface(null);
            appCompatTextView.setId(R$id.xui_tab_segment_item_id);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15, -1);
            addView(appCompatTextView, layoutParams);
            this.f4956b = new GestureDetector(getContext(), new C4227e(this));
        }

        /* renamed from: a */
        public final void m3598a(C6370h c6370h, int i) {
            AppCompatTextView appCompatTextView = this.f4955a;
            appCompatTextView.setTextColor(i);
            c6370h.getClass();
            Drawable[] compoundDrawables = appCompatTextView.getCompoundDrawables();
            int i8 = TabSegment.f4927B;
            TabSegment tabSegment = TabSegment.this;
            Drawable drawable = compoundDrawables[tabSegment.f4943o];
            if (drawable != null) {
                drawable.setColorFilter(new LightingColorFilter(Color.argb(255, 0, 0, 0), i));
                int i9 = tabSegment.f4943o;
                Drawable drawable2 = i9 == 0 ? drawable : null;
                Drawable drawable3 = i9 == 1 ? drawable : null;
                Drawable drawable4 = i9 == 2 ? drawable : null;
                if (i9 != 3) {
                    drawable = null;
                }
                appCompatTextView.setCompoundDrawables(drawable2, drawable3, drawable4, drawable);
            }
        }

        /* renamed from: b */
        public final void m3599b(C6370h c6370h, boolean z8) {
            int i;
            TabSegment tabSegment = TabSegment.this;
            if (z8) {
                int i8 = TabSegment.f4927B;
                c6370h.getClass();
                i = tabSegment.f4942n;
            } else {
                int i9 = TabSegment.f4927B;
                c6370h.getClass();
                i = tabSegment.f4941m;
            }
            AppCompatTextView appCompatTextView = this.f4955a;
            appCompatTextView.setTextColor(i);
            c6370h.getClass();
            appCompatTextView.setCompoundDrawablePadding(0);
            appCompatTextView.setCompoundDrawables(null, null, null, null);
        }

        public TextView getTextView() {
            return this.f4955a;
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return this.f4956b.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        public final WeakReference f4958a;

        public TabLayoutOnPageChangeListener(TabSegment tabSegment) {
            this.f4958a = new WeakReference(tabSegment);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i) {
            TabSegment tabSegment = (TabSegment) this.f4958a.get();
            if (tabSegment != null) {
                tabSegment.setViewPagerScrollState(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i, float f, int i8) {
            TabSegment tabSegment = (TabSegment) this.f4958a.get();
            if (tabSegment != null) {
                tabSegment.m3597k(f, i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i) {
            TabSegment tabSegment = (TabSegment) this.f4958a.get();
            if (tabSegment == null || tabSegment.getSelectedIndex() == i || i >= tabSegment.getTabCount()) {
                return;
            }
            tabSegment.m3595i(i, true, false);
        }
    }

    public TabSegment(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4226d getAdapter() {
        return this.f4930b.f4986a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabCount() {
        ArrayList arrayList = getAdapter().f10441b;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewPagerScrollState(int i) {
        int i8;
        this.f4946r = i;
        if (i == 0 && (i8 = this.f4932d) != -1 && this.f4947s == null) {
            m3595i(i8, true, false);
            this.f4932d = -1;
        }
    }

    /* renamed from: d */
    public final void m3590d(int i) {
        ArrayList arrayList = this.f4929a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C6372j) arrayList.get(size)).f10415a.setCurrentItem(i, false);
        }
    }

    /* renamed from: e */
    public final void m3591e(C6370h c6370h, boolean z8) {
        if (c6370h == null) {
            return;
        }
        Rect rect = this.f4939k;
        if (rect == null) {
            int i = c6370h.f10413b;
            this.f4939k = new Rect(i, 0, c6370h.f10412a + i, 0);
        } else {
            int i8 = c6370h.f10413b;
            rect.left = i8;
            rect.right = i8 + c6370h.f10412a;
        }
        if (this.f4940l == null) {
            Paint paint = new Paint();
            this.f4940l = paint;
            paint.setStyle(Paint.Style.FILL);
        }
        this.f4940l.setColor(this.f4942n);
        if (z8) {
            this.f4930b.invalidate();
        }
    }

    /* renamed from: f */
    public final void m3592f(C6370h c6370h, C6370h c6370h2, float f) {
        int i = c6370h2.f10413b;
        int i8 = c6370h.f10413b;
        int i9 = c6370h2.f10412a;
        int i10 = (int) (((i - i8) * f) + i8);
        int i11 = (int) (((i9 - r3) * f) + c6370h.f10412a);
        Rect rect = this.f4939k;
        if (rect == null) {
            this.f4939k = new Rect(i10, 0, i11 + i10, 0);
        } else {
            rect.left = i10;
            rect.right = i10 + i11;
        }
        if (this.f4940l == null) {
            Paint paint = new Paint();
            this.f4940l = paint;
            paint.setStyle(Paint.Style.FILL);
        }
        int i12 = this.f4942n;
        this.f4940l.setColor(AbstractC3315g.m2238f(f, i12, i12));
        this.f4930b.invalidate();
    }

    /* renamed from: g */
    public final void m3593g(boolean z8) {
        PagerAdapter pagerAdapter = this.f4950v;
        if (pagerAdapter == null) {
            if (z8) {
                m3594h();
                return;
            }
            return;
        }
        int count = pagerAdapter.getCount();
        if (z8) {
            m3594h();
            for (int i = 0; i < count; i++) {
                CharSequence pageTitle = this.f4950v.getPageTitle(i);
                C6370h c6370h = new C6370h();
                c6370h.f10412a = 0;
                c6370h.f10413b = 0;
                c6370h.f10414c = pageTitle;
                this.f4930b.f4986a.f10441b.add(c6370h);
            }
            getAdapter().m6033c();
            m3593g(false);
        }
        ViewPager viewPager = this.f4949u;
        if (viewPager == null || count <= 0) {
            return;
        }
        m3595i(viewPager.getCurrentItem(), true, false);
    }

    public int getMode() {
        return this.f4944p;
    }

    public int getSelectedIndex() {
        return this.f4931c;
    }

    /* renamed from: h */
    public final void m3594h() {
        C4226d c4226d = this.f4930b.f4986a;
        c4226d.f10441b.clear();
        c4226d.m6031a(c4226d.f10442c.size());
        this.f4931c = -1;
        Animator animator = this.f4947s;
        if (animator != null) {
            animator.cancel();
            this.f4947s = null;
        }
    }

    /* renamed from: i */
    public final void m3595i(int i, boolean z8, boolean z9) {
        if (this.f4928A) {
            return;
        }
        this.f4928A = true;
        C4226d adapter = getAdapter();
        ArrayList arrayList = adapter.f10442c;
        int size = arrayList.size();
        ArrayList arrayList2 = adapter.f10441b;
        if (size != (arrayList2 == null ? 0 : arrayList2.size())) {
            adapter.m6033c();
            arrayList = adapter.f10442c;
        }
        if (arrayList.size() == 0 || arrayList.size() <= i) {
            this.f4928A = false;
            return;
        }
        if (this.f4947s != null || this.f4946r != 0) {
            this.f4932d = i;
            this.f4928A = false;
            return;
        }
        int i8 = this.f4931c;
        ArrayList arrayList3 = this.f4929a;
        if (i8 == i) {
            if (z9) {
                for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                    ((C6372j) arrayList3.get(size2)).getClass();
                }
            }
            this.f4928A = false;
            this.f4930b.invalidate();
            return;
        }
        if (i8 > arrayList.size()) {
            Log.i("TabSegment", "selectTab: current selected index is bigger than views size.");
            this.f4931c = -1;
        }
        int i9 = this.f4931c;
        if (i9 == -1) {
            C6370h c6370h = (C6370h) adapter.m6032b(i);
            m3591e(c6370h, true);
            ((TabItemView) arrayList.get(i)).getTextView();
            ((TabItemView) arrayList.get(i)).m3599b(c6370h, true);
            m3590d(i);
            this.f4931c = i;
            this.f4928A = false;
            return;
        }
        C6370h c6370h2 = (C6370h) adapter.m6032b(i9);
        TabItemView tabItemView = (TabItemView) arrayList.get(i9);
        C6370h c6370h3 = (C6370h) adapter.m6032b(i);
        TabItemView tabItemView2 = (TabItemView) arrayList.get(i);
        if (!z8) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new C4223a(this, c6370h2, c6370h3, tabItemView, tabItemView2));
            valueAnimatorOfFloat.addListener(new C4224b(this, tabItemView, c6370h2, tabItemView2, c6370h3, i, i9));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.start();
            this.f4928A = false;
            return;
        }
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            ((C6372j) arrayList3.get(size3)).getClass();
        }
        m3590d(i);
        tabItemView.getTextView();
        tabItemView2.getTextView();
        tabItemView.m3599b(c6370h2, false);
        tabItemView2.m3599b(c6370h3, true);
        if (getScrollX() > tabItemView2.getLeft()) {
            smoothScrollTo(tabItemView2.getLeft(), 0);
        } else {
            int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
            if (getScrollX() + width < tabItemView2.getRight()) {
                smoothScrollBy((tabItemView2.getRight() - width) - getScrollX(), 0);
            }
        }
        this.f4931c = i;
        this.f4928A = false;
        m3591e(c6370h3, true);
    }

    /* renamed from: j */
    public final void m3596j(PagerAdapter pagerAdapter, boolean z8, boolean z9) {
        C6369g c6369g;
        PagerAdapter pagerAdapter2 = this.f4950v;
        if (pagerAdapter2 != null && (c6369g = this.f4951w) != null) {
            pagerAdapter2.unregisterDataSetObserver(c6369g);
        }
        this.f4950v = pagerAdapter;
        if (z9 && pagerAdapter != null) {
            if (this.f4951w == null) {
                this.f4951w = new C6369g(this, z8);
            }
            pagerAdapter.registerDataSetObserver(this.f4951w);
        }
        m3593g(z8);
    }

    /* renamed from: k */
    public final void m3597k(float f, int i) {
        int i8;
        if (this.f4947s != null || this.f4928A || f == 0.0f) {
            return;
        }
        if (f < 0.0f) {
            i8 = i - 1;
            f = -f;
        } else {
            i8 = i + 1;
        }
        C4226d adapter = getAdapter();
        ArrayList arrayList = adapter.f10442c;
        if (arrayList.size() <= i || arrayList.size() <= i8) {
            return;
        }
        C6370h c6370h = (C6370h) adapter.m6032b(i);
        C6370h c6370h2 = (C6370h) adapter.m6032b(i8);
        TabItemView tabItemView = (TabItemView) arrayList.get(i);
        TabItemView tabItemView2 = (TabItemView) arrayList.get(i8);
        c6370h.getClass();
        int iM2238f = AbstractC3315g.m2238f(f, this.f4942n, this.f4941m);
        c6370h2.getClass();
        int iM2238f2 = AbstractC3315g.m2238f(f, this.f4941m, this.f4942n);
        tabItemView.m3598a(c6370h, iM2238f);
        tabItemView2.m3598a(c6370h2, iM2238f2);
        m3592f(c6370h, c6370h2, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        super.onLayout(z8, i, i8, i9, i10);
        if (this.f4931c == -1 || this.f4944p != 0) {
            return;
        }
        TabItemView tabItemView = (TabItemView) getAdapter().f10442c.get(this.f4931c);
        if (getScrollX() > tabItemView.getLeft()) {
            scrollTo(tabItemView.getLeft(), 0);
            return;
        }
        int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        if (getScrollX() + width < tabItemView.getRight()) {
            scrollBy((tabItemView.getRight() - width) - getScrollX(), 0);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i8) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            childAt.measure(View.MeasureSpec.makeMeasureSpec(size - paddingRight, BasicMeasure.EXACTLY), i8);
            if (mode == Integer.MIN_VALUE) {
                setMeasuredDimension(Math.min(size, childAt.getMeasuredWidth() + paddingRight), i8);
                return;
            }
        }
        setMeasuredDimension(i, i8);
    }

    public void setDefaultNormalColor(@ColorInt int i) {
        this.f4941m = i;
    }

    public void setDefaultSelectedColor(@ColorInt int i) {
        this.f4942n = i;
    }

    public void setDefaultTabIconPosition(int i) {
        this.f4943o = i;
    }

    public void setHasIndicator(boolean z8) {
        if (this.f4934f != z8) {
            this.f4934f = z8;
            invalidate();
        }
    }

    public void setIndicatorDrawable(Drawable drawable) {
        this.f4937i = drawable;
        if (drawable != null) {
            this.f4935g = drawable.getIntrinsicHeight();
        }
        this.f4930b.invalidate();
    }

    public void setIndicatorPosition(boolean z8) {
        if (this.f4936h != z8) {
            this.f4936h = z8;
            this.f4930b.invalidate();
        }
    }

    public void setIndicatorWidthAdjustContent(boolean z8) {
        if (this.f4938j != z8) {
            this.f4938j = z8;
            this.f4930b.requestLayout();
        }
    }

    public void setItemSpaceInScrollMode(int i) {
        this.f4945q = i;
    }

    public void setMode(int i) {
        if (this.f4944p != i) {
            this.f4944p = i;
            this.f4930b.invalidate();
        }
    }

    public void setTabTextSize(int i) {
        this.f4933e = i;
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        ViewPager viewPager2 = this.f4949u;
        if (viewPager2 != null) {
            TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener = this.f4952x;
            if (tabLayoutOnPageChangeListener != null) {
                viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
            }
            C6367e c6367e = this.f4954z;
            if (c6367e != null) {
                this.f4949u.removeOnAdapterChangeListener(c6367e);
            }
        }
        C6372j c6372j = this.f4953y;
        ArrayList arrayList = this.f4929a;
        if (c6372j != null) {
            arrayList.remove(c6372j);
            this.f4953y = null;
        }
        if (viewPager == null) {
            this.f4949u = null;
            m3596j(null, false, false);
            return;
        }
        this.f4949u = viewPager;
        if (this.f4952x == null) {
            this.f4952x = new TabLayoutOnPageChangeListener(this);
        }
        viewPager.addOnPageChangeListener(this.f4952x);
        C6372j c6372j2 = new C6372j(viewPager);
        this.f4953y = c6372j2;
        if (!arrayList.contains(c6372j2)) {
            arrayList.add(c6372j2);
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter != null) {
            m3596j(adapter, true, true);
        }
        if (this.f4954z == null) {
            this.f4954z = new C6367e(this);
        }
        C6367e c6367e2 = this.f4954z;
        c6367e2.f10408a = true;
        viewPager.addOnAdapterChangeListener(c6367e2);
    }

    public TabSegment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.TabSegmentStyle);
    }

    public TabSegment(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        super(context, attributeSet, i);
        this.f4929a = new ArrayList();
        this.f4931c = -1;
        this.f4932d = -1;
        this.f4934f = true;
        this.f4936h = false;
        this.f4938j = true;
        this.f4939k = null;
        this.f4940l = null;
        this.f4944p = 1;
        this.f4946r = 0;
        this.f4948t = new ViewOnClickListenerC3099c(this, 5);
        this.f4928A = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabSegment, i, 0);
        this.f4942n = typedArrayObtainStyledAttributes.getColor(R$styleable.TabSegment_ts_selected_color, AbstractC5806u.m5252F(context, R$attr.colorAccent, 0));
        this.f4941m = typedArrayObtainStyledAttributes.getColor(R$styleable.TabSegment_ts_normal_color, ContextCompat.getColor(context, R$color.xui_config_color_gray_5));
        this.f4934f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabSegment_ts_has_indicator, true);
        this.f4935g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabSegment_ts_indicator_height, getResources().getDimensionPixelSize(R$dimen.xui_tab_segment_indicator_height));
        this.f4933e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabSegment_android_textSize, getResources().getDimensionPixelSize(R$dimen.xui_tab_segment_text_size));
        this.f4936h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TabSegment_ts_indicator_top, false);
        this.f4943o = typedArrayObtainStyledAttributes.getInt(R$styleable.TabSegment_ts_icon_position, 0);
        this.f4944p = typedArrayObtainStyledAttributes.getInt(R$styleable.TabSegment_ts_mode, 1);
        this.f4945q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabSegment_ts_space, AbstractC5625a.m4948h(context, 10.0f));
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.TabSegment_ts_typeface_provider);
        typedArrayObtainStyledAttributes.recycle();
        C4225c c4225c = new C4225c(this, context);
        this.f4930b = c4225c;
        addView(c4225c, new FrameLayout.LayoutParams(-2, -1));
        if (string != null && string.length() != 0) {
            String strTrim = string.trim();
            if (strTrim.length() != 0) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    try {
                        Constructor constructor = classLoader.loadClass(strTrim).asSubclass(InterfaceC6371i.class).getConstructor(null);
                        constructor.setAccessible(true);
                        AbstractC5535a.m4899f(constructor.newInstance(null));
                    } catch (NoSuchMethodException e) {
                        throw new IllegalStateException("Error creating TypefaceProvider " + strTrim, e);
                    }
                } catch (ClassCastException e4) {
                    throw new IllegalStateException(AbstractC0037f.m85j("Class is not a TypefaceProvider ", strTrim), e4);
                } catch (ClassNotFoundException e8) {
                    throw new IllegalStateException(AbstractC0037f.m85j("Unable to find TypefaceProvider ", strTrim), e8);
                } catch (IllegalAccessException e9) {
                    throw new IllegalStateException(AbstractC0037f.m85j("Cannot access non-public constructor ", strTrim), e9);
                } catch (InstantiationException e10) {
                    throw new IllegalStateException(AbstractC0037f.m85j("Could not instantiate the TypefaceProvider: ", strTrim), e10);
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(AbstractC0037f.m85j("Could not instantiate the TypefaceProvider: ", strTrim), e11);
                }
            }
        }
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
    }

    public void setOnTabClickListener(InterfaceC6368f interfaceC6368f) {
    }

    public void setTypefaceProvider(InterfaceC6371i interfaceC6371i) {
    }
}
