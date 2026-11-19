package com.xuexiang.xui.widget.tabbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.AbstractC0783a;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.xuexiang.xui.widget.tabbar.vertical.ITabView;
import com.xuexiang.xui.widget.tabbar.vertical.TabAdapter;
import com.xuexiang.xui.widget.tabbar.vertical.TabFragmentManager;
import com.xuexiang.xui.widget.tabbar.vertical.TabView;
import com.xuexiang.xui.widget.tabbar.vertical.XTabView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class VerticalTabLayout extends ScrollView {
    public static int TAB_MODE_FIXED = 10;
    public static int TAB_MODE_SCROLLABLE = 11;
    private int mColorIndicator;
    private Context mContext;
    private float mIndicatorCorners;
    private int mIndicatorGravity;
    private int mIndicatorWidth;
    private float mLastPositionOffset;
    private AbstractC0783a mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private TabView mSelectedTab;
    private TabAdapter mTabAdapter;
    private TabFragmentManager mTabFragmentManager;
    private int mTabHeight;
    private int mTabMargin;
    private int mTabMode;
    private OnTabPageChangeListener mTabPageChangeListener;
    private List<OnTabSelectedListener> mTabSelectedListeners;
    private TabStrip mTabStrip;
    private ViewPager mViewPager;

    private class OnTabPageChangeListener implements ViewPager.InterfaceC0779i {
        private int mScrollState;
        boolean mUpdateIndicator;

        public OnTabPageChangeListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
        public void onPageScrollStateChanged(int i4) {
            int i5 = this.mScrollState;
            this.mScrollState = i4;
            this.mUpdateIndicator = (i4 == 2 && i5 == 0) ? false : true;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
        public void onPageScrolled(int i4, float f4, int i5) {
            if (this.mUpdateIndicator) {
                VerticalTabLayout.this.mTabStrip.moveIndicator(f4 + i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
        public void onPageSelected(int i4) {
            if (i4 != VerticalTabLayout.this.getSelectedTabPosition()) {
                VerticalTabLayout.this.setTabSelected(i4, !this.mUpdateIndicator, true);
            }
        }
    }

    public interface OnTabSelectedListener {
        void onTabReselected(TabView tabView, int i4);

        void onTabSelected(TabView tabView, int i4);

        void onTabUnselected(TabView tabView, int i4);
    }

    private class PagerAdapterObserver extends DataSetObserver {
        private PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VerticalTabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VerticalTabLayout.this.populateFromPagerAdapter();
        }
    }

    private class TabStrip extends LinearLayout {
        private AnimatorSet mIndicatorAnimatorSet;
        private float mIndicatorBottomY;
        private Paint mIndicatorPaint;
        private RectF mIndicatorRect;
        private float mIndicatorTopY;
        private float mIndicatorX;
        private int mLastWidth;

        public TabStrip(Context context) {
            super(context);
            setWillNotDraw(false);
            setOrientation(1);
            Paint paint = new Paint();
            this.mIndicatorPaint = paint;
            paint.setAntiAlias(true);
            VerticalTabLayout.this.mIndicatorGravity = VerticalTabLayout.this.mIndicatorGravity == 0 ? 3 : VerticalTabLayout.this.mIndicatorGravity;
            this.mIndicatorRect = new RectF();
            setIndicatorGravity();
        }

        private void calcIndicatorY(float f4) {
            double d4 = f4;
            int iFloor = (int) Math.floor(d4);
            View childAt = getChildAt(iFloor);
            if (Math.floor(d4) == getChildCount() - 1 || Math.ceil(d4) == 0.0d) {
                this.mIndicatorTopY = childAt.getTop();
                this.mIndicatorBottomY = childAt.getBottom();
            } else {
                View childAt2 = getChildAt(iFloor + 1);
                float f5 = f4 - iFloor;
                this.mIndicatorTopY = childAt.getTop() + ((childAt2.getTop() - childAt.getTop()) * f5);
                this.mIndicatorBottomY = childAt.getBottom() + ((childAt2.getBottom() - childAt.getBottom()) * f5);
            }
        }

        protected void moveIndicator(float f4) {
            calcIndicatorY(f4);
            invalidate();
        }

        protected void moveIndicatorWithAnimator(int i4) {
            final int selectedTabPosition = i4 - VerticalTabLayout.this.getSelectedTabPosition();
            View childAt = getChildAt(i4);
            final float top = childAt.getTop();
            final float bottom = childAt.getBottom();
            if (this.mIndicatorTopY == top && this.mIndicatorBottomY == bottom) {
                return;
            }
            AnimatorSet animatorSet = this.mIndicatorAnimatorSet;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.mIndicatorAnimatorSet.end();
            }
            post(new Runnable() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.TabStrip.2
                @Override // java.lang.Runnable
                public void run() {
                    ValueAnimator duration;
                    int i5 = selectedTabPosition;
                    ValueAnimator duration2 = null;
                    if (i5 > 0) {
                        duration2 = ValueAnimator.ofFloat(TabStrip.this.mIndicatorBottomY, bottom).setDuration(100L);
                        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.TabStrip.2.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                TabStrip.this.mIndicatorBottomY = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                                TabStrip.this.invalidate();
                            }
                        });
                        duration = ValueAnimator.ofFloat(TabStrip.this.mIndicatorTopY, top).setDuration(100L);
                        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.TabStrip.2.2
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                TabStrip.this.mIndicatorTopY = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                                TabStrip.this.invalidate();
                            }
                        });
                    } else if (i5 < 0) {
                        duration2 = ValueAnimator.ofFloat(TabStrip.this.mIndicatorTopY, top).setDuration(100L);
                        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.TabStrip.2.3
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                TabStrip.this.mIndicatorTopY = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                                TabStrip.this.invalidate();
                            }
                        });
                        duration = ValueAnimator.ofFloat(TabStrip.this.mIndicatorBottomY, bottom).setDuration(100L);
                        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.TabStrip.2.4
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                TabStrip.this.mIndicatorBottomY = Float.parseFloat(valueAnimator.getAnimatedValue().toString());
                                TabStrip.this.invalidate();
                            }
                        });
                    } else {
                        duration = null;
                    }
                    if (duration2 != null) {
                        TabStrip.this.mIndicatorAnimatorSet = new AnimatorSet();
                        TabStrip.this.mIndicatorAnimatorSet.play(duration).after(duration2);
                        TabStrip.this.mIndicatorAnimatorSet.start();
                    }
                }
            });
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.mIndicatorPaint.setColor(VerticalTabLayout.this.mColorIndicator);
            RectF rectF = this.mIndicatorRect;
            float f4 = this.mIndicatorX;
            rectF.left = f4;
            rectF.top = this.mIndicatorTopY;
            rectF.right = f4 + VerticalTabLayout.this.mIndicatorWidth;
            this.mIndicatorRect.bottom = this.mIndicatorBottomY;
            if (VerticalTabLayout.this.mIndicatorCorners != IGoodView.DEFAULT_TO_ALPHA) {
                canvas.drawRoundRect(this.mIndicatorRect, VerticalTabLayout.this.mIndicatorCorners, VerticalTabLayout.this.mIndicatorCorners, this.mIndicatorPaint);
            } else {
                canvas.drawRect(this.mIndicatorRect, this.mIndicatorPaint);
            }
        }

        protected void setIndicatorGravity() {
            if (VerticalTabLayout.this.mIndicatorGravity == 3) {
                this.mIndicatorX = IGoodView.DEFAULT_TO_ALPHA;
                int i4 = this.mLastWidth;
                if (i4 != 0) {
                    VerticalTabLayout.this.mIndicatorWidth = i4;
                }
                setPadding(VerticalTabLayout.this.mIndicatorWidth, 0, 0, 0);
            } else if (VerticalTabLayout.this.mIndicatorGravity == 5) {
                int i5 = this.mLastWidth;
                if (i5 != 0) {
                    VerticalTabLayout.this.mIndicatorWidth = i5;
                }
                setPadding(0, 0, VerticalTabLayout.this.mIndicatorWidth, 0);
            } else if (VerticalTabLayout.this.mIndicatorGravity == 119) {
                this.mIndicatorX = IGoodView.DEFAULT_TO_ALPHA;
                setPadding(0, 0, 0, 0);
            }
            post(new Runnable() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.TabStrip.1
                @Override // java.lang.Runnable
                public void run() {
                    if (VerticalTabLayout.this.mIndicatorGravity == 5) {
                        TabStrip.this.mIndicatorX = r0.getWidth() - VerticalTabLayout.this.mIndicatorWidth;
                    } else if (VerticalTabLayout.this.mIndicatorGravity == 119) {
                        TabStrip tabStrip = TabStrip.this;
                        tabStrip.mLastWidth = VerticalTabLayout.this.mIndicatorWidth;
                        TabStrip tabStrip2 = TabStrip.this;
                        VerticalTabLayout.this.mIndicatorWidth = tabStrip2.getWidth();
                    }
                    TabStrip.this.invalidate();
                }
            });
        }

        protected void updateIndicator() {
            moveIndicatorWithAnimator(VerticalTabLayout.this.getSelectedTabPosition());
        }
    }

    public VerticalTabLayout(Context context) {
        this(context, null);
    }

    private void addTabWithMode(TabView tabView) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        initTabWithMode(layoutParams);
        this.mTabStrip.addView(tabView, layoutParams);
        if (this.mTabStrip.indexOfChild(tabView) == 0) {
            tabView.setChecked(true);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) tabView.getLayoutParams();
            layoutParams2.setMargins(0, 0, 0, 0);
            tabView.setLayoutParams(layoutParams2);
            this.mSelectedTab = tabView;
            this.mTabStrip.post(new Runnable() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.1
                @Override // java.lang.Runnable
                public void run() {
                    VerticalTabLayout.this.mTabStrip.moveIndicator(IGoodView.DEFAULT_TO_ALPHA);
                }
            });
        }
    }

    private void initTabStrip() {
        TabStrip tabStrip = new TabStrip(this.mContext);
        this.mTabStrip = tabStrip;
        addView(tabStrip, new FrameLayout.LayoutParams(-1, -1));
    }

    private void initTabWithMode(LinearLayout.LayoutParams layoutParams) {
        int i4 = this.mTabMode;
        if (i4 == TAB_MODE_FIXED) {
            layoutParams.height = 0;
            layoutParams.weight = 1.0f;
            layoutParams.setMargins(0, 0, 0, 0);
            setFillViewport(true);
            return;
        }
        if (i4 == TAB_MODE_SCROLLABLE) {
            layoutParams.height = this.mTabHeight;
            layoutParams.weight = IGoodView.DEFAULT_TO_ALPHA;
            layoutParams.setMargins(0, this.mTabMargin, 0, 0);
            setFillViewport(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        AbstractC0783a abstractC0783a = this.mPagerAdapter;
        if (abstractC0783a == null) {
            removeAllTabs();
            return;
        }
        int count = abstractC0783a.getCount();
        Object obj = this.mPagerAdapter;
        if (obj instanceof TabAdapter) {
            setTabAdapter((TabAdapter) obj);
        } else {
            for (int i4 = 0; i4 < count; i4++) {
                CharSequence pageTitle = this.mPagerAdapter.getPageTitle(i4);
                addTab(new XTabView(this.mContext).setTitle(new ITabView.TabTitle.Builder().setContent(pageTitle != null ? pageTitle.toString() : "tab" + i4).build()));
            }
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        setTabSelected(currentItem);
    }

    private void scrollByTab(int i4, float f4) {
        TabView tabAt = getTabAt(i4);
        int top = (tabAt.getTop() + (tabAt.getHeight() / 2)) - getScrollY();
        int height = getHeight() / 2;
        int height2 = tabAt.getHeight() + this.mTabMargin;
        if (f4 > IGoodView.DEFAULT_TO_ALPHA) {
            float f5 = f4 - this.mLastPositionOffset;
            if (top > height) {
                smoothScrollBy(0, (int) (height2 * f5));
            }
        }
        this.mLastPositionOffset = f4;
    }

    private void scrollToTab(int i4) {
        TabView tabAt = getTabAt(i4);
        int top = (tabAt.getTop() + (tabAt.getHeight() / 2)) - getScrollY();
        int height = getHeight() / 2;
        if (top > height) {
            smoothScrollBy(0, top - height);
        } else if (top < height) {
            smoothScrollBy(0, top - height);
        }
    }

    private void setPagerAdapter(AbstractC0783a abstractC0783a, boolean z3) {
        DataSetObserver dataSetObserver;
        AbstractC0783a abstractC0783a2 = this.mPagerAdapter;
        if (abstractC0783a2 != null && (dataSetObserver = this.mPagerAdapterObserver) != null) {
            abstractC0783a2.unregisterDataSetObserver(dataSetObserver);
        }
        this.mPagerAdapter = abstractC0783a;
        if (z3 && abstractC0783a != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new PagerAdapterObserver();
            }
            abstractC0783a.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTabSelectedImpl(int i4, boolean z3, boolean z4) {
        TabView tabAt = getTabAt(i4);
        TabView tabView = this.mSelectedTab;
        boolean z5 = tabAt != tabView;
        TabView tabView2 = null;
        if (z5) {
            if (tabView != null) {
                tabView.setChecked(false);
                tabView2 = this.mSelectedTab;
            }
            tabAt.setChecked(true);
            if (z3) {
                this.mTabStrip.moveIndicatorWithAnimator(i4);
            }
            scrollToTab(i4);
            this.mSelectedTab = tabAt;
        }
        if (z4) {
            for (int i5 = 0; i5 < this.mTabSelectedListeners.size(); i5++) {
                OnTabSelectedListener onTabSelectedListener = this.mTabSelectedListeners.get(i5);
                if (onTabSelectedListener != null) {
                    if (z5) {
                        onTabSelectedListener.onTabSelected(tabAt, i4);
                        if (tabView2 != null) {
                            onTabSelectedListener.onTabUnselected(tabView2, getPositionByTabView(tabView2));
                        }
                    } else {
                        onTabSelectedListener.onTabReselected(tabAt, i4);
                    }
                }
            }
        }
    }

    public void addOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        if (onTabSelectedListener != null) {
            this.mTabSelectedListeners.add(onTabSelectedListener);
        }
    }

    public void addTab(TabView tabView) {
        if (tabView == null) {
            throw new IllegalStateException("tabView can't be null");
        }
        addTabWithMode(tabView);
        tabView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VerticalTabLayout.this.setTabSelected(VerticalTabLayout.this.mTabStrip.indexOfChild(view));
            }
        });
    }

    public int getPositionByTabView(TabView tabView) {
        int iIndexOfChild = this.mTabStrip.indexOfChild(tabView);
        if (iIndexOfChild == -1) {
            return 0;
        }
        return iIndexOfChild;
    }

    public int getSelectedTabPosition() {
        return getPositionByTabView(this.mSelectedTab);
    }

    public TabAdapter getTabAdapter() {
        return this.mTabAdapter;
    }

    public TabView getTabAt(int i4) {
        return (TabView) this.mTabStrip.getChildAt(i4);
    }

    public int getTabCount() {
        return this.mTabStrip.getChildCount();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 0) {
            removeAllViews();
        }
        initTabStrip();
    }

    public void removeAllTabs() {
        this.mTabStrip.removeAllViews();
        this.mSelectedTab = null;
    }

    public void removeOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        if (onTabSelectedListener != null) {
            this.mTabSelectedListeners.remove(onTabSelectedListener);
        }
    }

    public void setIndicatorColor(int i4) {
        this.mColorIndicator = i4;
        this.mTabStrip.invalidate();
    }

    public void setIndicatorCorners(int i4) {
        this.mIndicatorCorners = i4;
        this.mTabStrip.invalidate();
    }

    public void setIndicatorGravity(int i4) {
        if (i4 != 3 && i4 != 5 && 119 != i4) {
            throw new IllegalStateException("only support Gravity.LEFT, Gravity.RIGHT, Gravity.FILL");
        }
        this.mIndicatorGravity = i4;
        this.mTabStrip.setIndicatorGravity();
    }

    public void setIndicatorWidth(int i4) {
        this.mIndicatorWidth = i4;
        this.mTabStrip.setIndicatorGravity();
    }

    public void setTabAdapter(TabAdapter tabAdapter) {
        removeAllTabs();
        if (tabAdapter != null) {
            this.mTabAdapter = tabAdapter;
            for (int i4 = 0; i4 < tabAdapter.getCount(); i4++) {
                addTab(new XTabView(this.mContext).setIcon(tabAdapter.getIcon(i4)).setTitle(tabAdapter.getTitle(i4)).setBadge(tabAdapter.getBadge(i4)).setBackground(tabAdapter.getBackground(i4)));
            }
        }
    }

    public void setTabBadge(int i4, int i5) {
        getTabAt(i4).getBadgeView().setBadgeNumber(i5);
    }

    public void setTabHeight(int i4) {
        if (i4 == this.mTabHeight) {
            return;
        }
        this.mTabHeight = i4;
        if (this.mTabMode == TAB_MODE_FIXED) {
            return;
        }
        for (int i5 = 0; i5 < this.mTabStrip.getChildCount(); i5++) {
            View childAt = this.mTabStrip.getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.height = this.mTabHeight;
            childAt.setLayoutParams(layoutParams);
        }
        this.mTabStrip.invalidate();
        this.mTabStrip.post(new Runnable() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.6
            @Override // java.lang.Runnable
            public void run() {
                VerticalTabLayout.this.mTabStrip.updateIndicator();
            }
        });
    }

    public void setTabMargin(int i4) {
        if (i4 == this.mTabMargin) {
            return;
        }
        this.mTabMargin = i4;
        if (this.mTabMode == TAB_MODE_FIXED) {
            return;
        }
        int i5 = 0;
        while (i5 < this.mTabStrip.getChildCount()) {
            View childAt = this.mTabStrip.getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.setMargins(0, i5 == 0 ? 0 : this.mTabMargin, 0, 0);
            childAt.setLayoutParams(layoutParams);
            i5++;
        }
        this.mTabStrip.invalidate();
        this.mTabStrip.post(new Runnable() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.5
            @Override // java.lang.Runnable
            public void run() {
                VerticalTabLayout.this.mTabStrip.updateIndicator();
            }
        });
    }

    public void setTabMode(int i4) {
        if (i4 != TAB_MODE_FIXED && i4 != TAB_MODE_SCROLLABLE) {
            throw new IllegalStateException("only support TAB_MODE_FIXED or TAB_MODE_SCROLLABLE");
        }
        if (i4 == this.mTabMode) {
            return;
        }
        this.mTabMode = i4;
        for (int i5 = 0; i5 < this.mTabStrip.getChildCount(); i5++) {
            View childAt = this.mTabStrip.getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            initTabWithMode(layoutParams);
            if (i5 == 0) {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            childAt.setLayoutParams(layoutParams);
        }
        this.mTabStrip.invalidate();
        this.mTabStrip.post(new Runnable() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.4
            @Override // java.lang.Runnable
            public void run() {
                VerticalTabLayout.this.mTabStrip.updateIndicator();
            }
        });
    }

    public void setTabSelected(int i4) {
        setTabSelected(i4, true, true);
    }

    public void setupWithFragment(FragmentManager fragmentManager, List<Fragment> list) {
        setupWithFragment(fragmentManager, 0, list);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        OnTabPageChangeListener onTabPageChangeListener;
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null && (onTabPageChangeListener = this.mTabPageChangeListener) != null) {
            viewPager2.removeOnPageChangeListener(onTabPageChangeListener);
        }
        if (viewPager == null) {
            this.mViewPager = null;
            setPagerAdapter(null, true);
            return;
        }
        AbstractC0783a adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.mViewPager = viewPager;
        if (this.mTabPageChangeListener == null) {
            this.mTabPageChangeListener = new OnTabPageChangeListener();
        }
        viewPager.addOnPageChangeListener(this.mTabPageChangeListener);
        addOnTabSelectedListener(new OnTabSelectedListener() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.7
            @Override // com.xuexiang.xui.widget.tabbar.VerticalTabLayout.OnTabSelectedListener
            public void onTabReselected(TabView tabView, int i4) {
            }

            @Override // com.xuexiang.xui.widget.tabbar.VerticalTabLayout.OnTabSelectedListener
            public void onTabSelected(TabView tabView, int i4) throws Resources.NotFoundException {
                if (VerticalTabLayout.this.mViewPager == null || VerticalTabLayout.this.mViewPager.getAdapter() == null || i4 < 0 || i4 >= VerticalTabLayout.this.mViewPager.getAdapter().getCount()) {
                    return;
                }
                VerticalTabLayout.this.mViewPager.setCurrentItem(i4);
            }

            @Override // com.xuexiang.xui.widget.tabbar.VerticalTabLayout.OnTabSelectedListener
            public void onTabUnselected(TabView tabView, int i4) {
            }
        });
        setPagerAdapter(adapter, true);
    }

    public VerticalTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTabSelected(final int i4, final boolean z3, final boolean z4) {
        post(new Runnable() { // from class: com.xuexiang.xui.widget.tabbar.VerticalTabLayout.3
            @Override // java.lang.Runnable
            public void run() {
                VerticalTabLayout.this.setTabSelectedImpl(i4, z3, z4);
            }
        });
    }

    public void setTabBadge(int i4, String str) {
        getTabAt(i4).getBadgeView().setBadgeText(str);
    }

    public void setupWithFragment(FragmentManager fragmentManager, List<Fragment> list, TabAdapter tabAdapter) {
        setupWithFragment(fragmentManager, 0, list, tabAdapter);
    }

    public VerticalTabLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mContext = context;
        this.mTabSelectedListeners = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.VerticalTabLayout);
        this.mColorIndicator = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.VerticalTabLayout_vtl_indicator_color, ThemeUtils.getMainThemeColor(context));
        this.mIndicatorWidth = (int) typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.VerticalTabLayout_vtl_indicator_width, DensityUtils.dp2px(context, 3.0f));
        this.mIndicatorCorners = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.VerticalTabLayout_vtl_indicator_corners, IGoodView.DEFAULT_TO_ALPHA);
        int integer = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.VerticalTabLayout_vtl_indicator_gravity, 3);
        this.mIndicatorGravity = integer;
        if (integer == 3) {
            this.mIndicatorGravity = 3;
        } else if (integer == 5) {
            this.mIndicatorGravity = 5;
        } else if (integer == 119) {
            this.mIndicatorGravity = 119;
        }
        this.mTabMargin = (int) typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.VerticalTabLayout_vtl_tab_margin, IGoodView.DEFAULT_TO_ALPHA);
        this.mTabMode = typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.VerticalTabLayout_vtl_tab_mode, TAB_MODE_FIXED);
        this.mTabHeight = (int) typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.VerticalTabLayout_vtl_tab_height, -2.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setupWithFragment(FragmentManager fragmentManager, int i4, List<Fragment> list) {
        TabFragmentManager tabFragmentManager = this.mTabFragmentManager;
        if (tabFragmentManager != null) {
            tabFragmentManager.detach();
        }
        if (i4 != 0) {
            this.mTabFragmentManager = new TabFragmentManager(fragmentManager, i4, list, this);
        } else {
            this.mTabFragmentManager = new TabFragmentManager(fragmentManager, list, this);
        }
    }

    public void setupWithFragment(FragmentManager fragmentManager, int i4, List<Fragment> list, TabAdapter tabAdapter) {
        setTabAdapter(tabAdapter);
        setupWithFragment(fragmentManager, i4, list);
    }
}
