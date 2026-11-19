package com.xuexiang.xui.widget.banner.widget.banner.base;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.AbstractC0783a;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner;
import com.xuexiang.xui.widget.banner.widget.loopviewpager.FixedSpeedScroller;
import com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class BaseBanner<E, T extends BaseBanner<E, T>> extends RelativeLayout implements HasTypeface {
    private float mContainerScale;
    protected Context mContext;
    protected int mCurrentPosition;
    protected List<E> mDatas;
    private long mDelay;
    protected DisplayMetrics mDisplayMetrics;
    private ScheduledExecutorService mExecutorService;
    private Handler mHandler;
    private ViewPager.InterfaceC0779i mInternalPageListener;
    private boolean mIsAutoScrollEnable;
    private boolean mIsAutoScrolling;
    private boolean mIsBarShowWhenLast;
    private boolean mIsDataChanged;
    private boolean mIsOnePageLoop;
    private int mItemHeight;
    private int mItemWidth;
    protected int mLastPosition;
    private LinearLayout mLlBottomBar;
    private LinearLayout mLlIndicatorContainer;
    private OnItemClickListener<E> mOnItemClickListener;
    private ViewPager.InterfaceC0779i mOnPageChangeListener;
    private long mPeriod;
    private int mScrollSpeed;
    private Class<? extends ViewPager.InterfaceC0780j> mTransformerClass;
    private TextView mTvTitle;
    protected ViewPager mViewPager;

    private class InnerBannerAdapter extends AbstractC0783a {
        private InnerBannerAdapter() {
        }

        @Override // androidx.viewpager.widget.AbstractC0783a
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.AbstractC0783a
        public int getCount() {
            List<E> list = BaseBanner.this.mDatas;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.AbstractC0783a
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.AbstractC0783a
        public Object instantiateItem(ViewGroup viewGroup, final int i4) {
            View viewOnCreateItemView = BaseBanner.this.onCreateItemView(i4);
            viewOnCreateItemView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner.InnerBannerAdapter.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (BaseBanner.this.mOnItemClickListener != null) {
                        BaseBanner.this.mOnItemClickListener.onItemClick(view, BaseBanner.this.getItem(i4), i4);
                    }
                }
            });
            viewGroup.addView(viewOnCreateItemView);
            return viewOnCreateItemView;
        }

        @Override // androidx.viewpager.widget.AbstractC0783a
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public interface OnItemClickListener<E> {
        void onItemClick(View view, E e4, int i4);
    }

    public BaseBanner(Context context) {
        super(context);
        this.mDatas = new ArrayList();
        this.mScrollSpeed = 450;
        this.mIsDataChanged = false;
        this.mIsOnePageLoop = true;
        this.mHandler = new Handler(new Handler.Callback() { // from class: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) throws Resources.NotFoundException {
                BaseBanner baseBanner = BaseBanner.this;
                baseBanner.scrollToNextItem(baseBanner.mCurrentPosition);
                return true;
            }
        });
        this.mInternalPageListener = new ViewPager.InterfaceC0779i() { // from class: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner.2
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrollStateChanged(int i4) {
                if (BaseBanner.this.mOnPageChangeListener != null) {
                    BaseBanner.this.mOnPageChangeListener.onPageScrollStateChanged(i4);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrolled(int i4, float f4, int i5) {
                if (BaseBanner.this.mOnPageChangeListener != null) {
                    BaseBanner.this.mOnPageChangeListener.onPageScrolled(i4, f4, i5);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageSelected(int i4) {
                BaseBanner baseBanner = BaseBanner.this;
                baseBanner.mCurrentPosition = i4 % baseBanner.mDatas.size();
                BaseBanner baseBanner2 = BaseBanner.this;
                baseBanner2.setCurrentIndicator(baseBanner2.mCurrentPosition);
                BaseBanner baseBanner3 = BaseBanner.this;
                baseBanner3.onTitleSelect(baseBanner3.mTvTitle, BaseBanner.this.mCurrentPosition);
                LinearLayout linearLayout = BaseBanner.this.mLlBottomBar;
                BaseBanner baseBanner4 = BaseBanner.this;
                linearLayout.setVisibility((baseBanner4.mCurrentPosition != baseBanner4.mDatas.size() + (-1) || BaseBanner.this.mIsBarShowWhenLast) ? 0 : 8);
                BaseBanner baseBanner5 = BaseBanner.this;
                baseBanner5.mLastPosition = baseBanner5.mCurrentPosition;
                if (baseBanner5.mOnPageChangeListener != null) {
                    BaseBanner.this.mOnPageChangeListener.onPageSelected(i4);
                }
            }
        };
        initAttrs(context, null);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        this.mContext = context;
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.BaseBanner);
        this.mContainerScale = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.BaseBanner_bb_scale, -1.0f);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.BaseBanner_bb_isLoopEnable, true);
        this.mDelay = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.BaseBanner_bb_delay, 5);
        this.mPeriod = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.BaseBanner_bb_period, 5);
        this.mIsAutoScrollEnable = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.BaseBanner_bb_isAutoScrollEnable, true);
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.BaseBanner_bb_barColor, 0);
        this.mIsBarShowWhenLast = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.BaseBanner_bb_isBarShowWhenLast, true);
        int i4 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.BaseBanner_bb_indicatorGravity, 17);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.BaseBanner_bb_barPaddingLeft, dp2px(10.0f));
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.BaseBanner_bb_barPaddingTop, dp2px(i4 == 17 ? 6.0f : 2.0f));
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.BaseBanner_bb_barPaddingRight, dp2px(10.0f));
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.BaseBanner_bb_barPaddingBottom, dp2px(i4 == 17 ? 6.0f : 2.0f));
        int color2 = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.BaseBanner_bb_textColor, Color.parseColor("#ffffff"));
        float dimension5 = typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.BaseBanner_bb_textSize, sp2px(12.5f));
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.BaseBanner_bb_isTitleShow, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.BaseBanner_bb_isIndicatorShow, true);
        typedArrayObtainStyledAttributes.recycle();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        ViewPager loopViewPager = z3 ? new LoopViewPager(context) : new ViewPager(context);
        this.mViewPager = loopViewPager;
        loopViewPager.setOverScrollMode(2);
        int i5 = this.mDisplayMetrics.widthPixels;
        this.mItemWidth = i5;
        float f4 = this.mContainerScale;
        if (f4 >= IGoodView.DEFAULT_TO_ALPHA) {
            if (f4 > 1.0f) {
                this.mContainerScale = 1.0f;
            }
            this.mItemHeight = (int) (i5 * this.mContainerScale);
        } else if (attributeValue.equals("-1")) {
            this.mItemHeight = -1;
        } else if (attributeValue.equals("-2")) {
            this.mItemHeight = -2;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_height});
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -2);
            typedArrayObtainStyledAttributes2.recycle();
            this.mItemHeight = dimensionPixelSize;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.mItemWidth, this.mItemHeight);
        addView(this.mViewPager, layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        addView(relativeLayout, layoutParams);
        this.mLlBottomBar = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.mItemWidth, -2);
        layoutParams2.addRule(12, -1);
        relativeLayout.addView(this.mLlBottomBar, layoutParams2);
        this.mLlBottomBar.setBackgroundColor(color);
        this.mLlBottomBar.setPadding((int) dimension, (int) dimension2, (int) dimension3, (int) dimension4);
        this.mLlBottomBar.setClipChildren(false);
        this.mLlBottomBar.setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.mLlIndicatorContainer = linearLayout;
        linearLayout.setGravity(17);
        this.mLlIndicatorContainer.setVisibility(z5 ? 0 : 4);
        this.mLlIndicatorContainer.setClipChildren(false);
        this.mLlIndicatorContainer.setClipToPadding(false);
        TextView textView = new TextView(context);
        this.mTvTitle = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.mTvTitle.setSingleLine(true);
        this.mTvTitle.setTextColor(color2);
        this.mTvTitle.setTextSize(0, dimension5);
        this.mTvTitle.setVisibility(z4 ? 0 : 4);
        if (i4 == 17) {
            this.mLlBottomBar.setGravity(17);
            this.mLlBottomBar.addView(this.mLlIndicatorContainer);
            return;
        }
        if (i4 == 5) {
            this.mLlBottomBar.setGravity(16);
            this.mLlBottomBar.addView(this.mTvTitle);
            this.mLlBottomBar.addView(this.mLlIndicatorContainer);
            this.mTvTitle.setPadding(0, 0, dp2px(7.0f), 0);
            this.mTvTitle.setEllipsize(TextUtils.TruncateAt.END);
            this.mTvTitle.setGravity(3);
            return;
        }
        if (i4 == 3) {
            this.mLlBottomBar.setGravity(16);
            this.mLlBottomBar.addView(this.mLlIndicatorContainer);
            this.mLlBottomBar.addView(this.mTvTitle);
            this.mTvTitle.setPadding(dp2px(7.0f), 0, 0, 0);
            this.mTvTitle.setEllipsize(TextUtils.TruncateAt.END);
            this.mTvTitle.setGravity(5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToNextItem(int i4) throws Resources.NotFoundException {
        if (isValid()) {
            if (this.mIsDataChanged) {
                updateViewPager();
            }
            this.mViewPager.setCurrentItem(i4 + 1);
        }
    }

    private void setScrollSpeed() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.mViewPager, new FixedSpeedScroller(this.mContext, new AccelerateDecelerateInterpolator(), this.mScrollSpeed));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private void setViewPager() throws Resources.NotFoundException {
        this.mViewPager.setAdapter(new InnerBannerAdapter());
        this.mViewPager.setOffscreenPageLimit(this.mDatas.size() - 1);
        try {
            Class<? extends ViewPager.InterfaceC0780j> cls = this.mTransformerClass;
            if (cls != null) {
                this.mViewPager.setPageTransformer(true, cls.newInstance());
                if (isLoopViewPager()) {
                    this.mScrollSpeed = 550;
                    setScrollSpeed();
                }
            } else if (isLoopViewPager()) {
                this.mScrollSpeed = 450;
                setScrollSpeed();
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        ViewPager.InterfaceC0779i interfaceC0779i = this.mInternalPageListener;
        if (interfaceC0779i != null) {
            this.mViewPager.removeOnPageChangeListener(interfaceC0779i);
        }
        this.mViewPager.addOnPageChangeListener(this.mInternalPageListener);
    }

    private float sp2px(float f4) {
        return f4 * this.mContext.getResources().getDisplayMetrics().scaledDensity;
    }

    private void stopScroll() {
        ScheduledExecutorService scheduledExecutorService = this.mExecutorService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.mExecutorService = null;
        }
    }

    private void updateViewPager() {
        if (isLoopViewPager()) {
            ((LoopViewPager) this.mViewPager).getPageAdapterWrapper().notifyDataSetChanged();
        } else if (this.mViewPager.getAdapter() != null) {
            this.mViewPager.getAdapter().notifyDataSetChanged();
        }
    }

    public BaseBanner addOnPageChangeListener(ViewPager.InterfaceC0779i interfaceC0779i) {
        this.mOnPageChangeListener = interfaceC0779i;
        return this;
    }

    public T barPadding(float f4, float f5, float f6, float f7) {
        this.mLlBottomBar.setPadding(dp2px(f4), dp2px(f5), dp2px(f6), dp2px(f7));
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            pauseScroll();
        } else if (action == 1 || action == 3) {
            goOnScroll();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected int dp2px(float f4) {
        return (int) ((f4 * this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public float getContainerScale() {
        return this.mContainerScale;
    }

    public E getItem(int i4) {
        if (size() > 0) {
            return this.mDatas.get(i4);
        }
        return null;
    }

    public int getItemHeight() {
        return this.mItemHeight;
    }

    public int getItemWidth() {
        return this.mItemWidth;
    }

    public ViewPager getViewPager() {
        return this.mViewPager;
    }

    public void goOnScroll() {
        if (isValid() && !this.mIsAutoScrolling) {
            if (!isLoopViewPager() || !this.mIsAutoScrollEnable) {
                this.mIsAutoScrolling = false;
                return;
            }
            pauseScroll();
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            this.mExecutorService = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner.3
                @Override // java.lang.Runnable
                public void run() {
                    BaseBanner.this.mHandler.obtainMessage().sendToTarget();
                }
            }, this.mDelay, this.mPeriod, TimeUnit.SECONDS);
            this.mIsAutoScrolling = true;
            UILog.m7961d(getClass().getSimpleName() + "--->goOnScroll()");
        }
    }

    protected boolean isLoopViewPager() {
        return this.mViewPager instanceof LoopViewPager;
    }

    protected boolean isValid() {
        if (this.mViewPager == null) {
            UILog.m7962e("ViewPager is not exist!");
            return false;
        }
        List<E> list = this.mDatas;
        if (list != null && list.size() > 0) {
            return this.mIsOnePageLoop || this.mDatas.size() != 1;
        }
        UILog.m7962e("DataList must be not empty!");
        return false;
    }

    public abstract View onCreateIndicator();

    public abstract View onCreateItemView(int i4);

    public void onTitleSelect(TextView textView, int i4) {
    }

    public void pauseScroll() {
        stopScroll();
        UILog.m7961d(getClass().getSimpleName() + "--->pauseScroll()");
        this.mIsAutoScrolling = false;
    }

    public void recycle() {
        pauseScroll();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public T setAutoScrollEnable(boolean z3) {
        this.mIsAutoScrollEnable = z3;
        return this;
    }

    public T setBarColor(int i4) {
        this.mLlBottomBar.setBackgroundColor(i4);
        return this;
    }

    public T setBarShowWhenLast(boolean z3) {
        this.mIsBarShowWhenLast = z3;
        return this;
    }

    public abstract void setCurrentIndicator(int i4);

    public T setDelay(long j4) {
        this.mDelay = j4;
        return this;
    }

    public T setIndicatorShow(boolean z3) {
        this.mLlIndicatorContainer.setVisibility(z3 ? 0 : 4);
        return this;
    }

    public BaseBanner setIsOnePageLoop(boolean z3) {
        this.mIsOnePageLoop = z3;
        return this;
    }

    public BaseBanner setOnItemClickListener(OnItemClickListener<E> onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
        return this;
    }

    public T setPeriod(long j4) {
        this.mPeriod = j4;
        return this;
    }

    public T setSource(List<E> list) {
        this.mDatas = list;
        this.mIsDataChanged = true;
        return this;
    }

    public T setTextColor(int i4) {
        this.mTvTitle.setTextColor(i4);
        return this;
    }

    public T setTextSize(float f4) {
        this.mTvTitle.setTextSize(2, f4);
        return this;
    }

    public T setTitleShow(boolean z3) {
        this.mTvTitle.setVisibility(z3 ? 0 : 4);
        return this;
    }

    public T setTransformerClass(Class<? extends ViewPager.InterfaceC0780j> cls) {
        this.mTransformerClass = cls;
        return this;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.mTvTitle;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public int size() {
        List<E> list = this.mDatas;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void startScroll() throws Resources.NotFoundException {
        List<E> list = this.mDatas;
        if (list == null) {
            throw new IllegalStateException("Data source is empty,you must setSource() before startScroll()");
        }
        if (list.size() > 0 && this.mCurrentPosition > this.mDatas.size() - 1) {
            this.mCurrentPosition = 0;
        }
        onTitleSelect(this.mTvTitle, this.mCurrentPosition);
        setViewPager();
        View viewOnCreateIndicator = onCreateIndicator();
        if (viewOnCreateIndicator != null) {
            this.mLlIndicatorContainer.removeAllViews();
            this.mLlIndicatorContainer.addView(viewOnCreateIndicator);
        }
        goOnScroll();
    }

    public BaseBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDatas = new ArrayList();
        this.mScrollSpeed = 450;
        this.mIsDataChanged = false;
        this.mIsOnePageLoop = true;
        this.mHandler = new Handler(new Handler.Callback() { // from class: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) throws Resources.NotFoundException {
                BaseBanner baseBanner = BaseBanner.this;
                baseBanner.scrollToNextItem(baseBanner.mCurrentPosition);
                return true;
            }
        });
        this.mInternalPageListener = new ViewPager.InterfaceC0779i() { // from class: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner.2
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrollStateChanged(int i4) {
                if (BaseBanner.this.mOnPageChangeListener != null) {
                    BaseBanner.this.mOnPageChangeListener.onPageScrollStateChanged(i4);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrolled(int i4, float f4, int i5) {
                if (BaseBanner.this.mOnPageChangeListener != null) {
                    BaseBanner.this.mOnPageChangeListener.onPageScrolled(i4, f4, i5);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageSelected(int i4) {
                BaseBanner baseBanner = BaseBanner.this;
                baseBanner.mCurrentPosition = i4 % baseBanner.mDatas.size();
                BaseBanner baseBanner2 = BaseBanner.this;
                baseBanner2.setCurrentIndicator(baseBanner2.mCurrentPosition);
                BaseBanner baseBanner3 = BaseBanner.this;
                baseBanner3.onTitleSelect(baseBanner3.mTvTitle, BaseBanner.this.mCurrentPosition);
                LinearLayout linearLayout = BaseBanner.this.mLlBottomBar;
                BaseBanner baseBanner4 = BaseBanner.this;
                linearLayout.setVisibility((baseBanner4.mCurrentPosition != baseBanner4.mDatas.size() + (-1) || BaseBanner.this.mIsBarShowWhenLast) ? 0 : 8);
                BaseBanner baseBanner5 = BaseBanner.this;
                baseBanner5.mLastPosition = baseBanner5.mCurrentPosition;
                if (baseBanner5.mOnPageChangeListener != null) {
                    BaseBanner.this.mOnPageChangeListener.onPageSelected(i4);
                }
            }
        };
        initAttrs(context, attributeSet);
    }

    public BaseBanner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mDatas = new ArrayList();
        this.mScrollSpeed = 450;
        this.mIsDataChanged = false;
        this.mIsOnePageLoop = true;
        this.mHandler = new Handler(new Handler.Callback() { // from class: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) throws Resources.NotFoundException {
                BaseBanner baseBanner = BaseBanner.this;
                baseBanner.scrollToNextItem(baseBanner.mCurrentPosition);
                return true;
            }
        });
        this.mInternalPageListener = new ViewPager.InterfaceC0779i() { // from class: com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner.2
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrollStateChanged(int i42) {
                if (BaseBanner.this.mOnPageChangeListener != null) {
                    BaseBanner.this.mOnPageChangeListener.onPageScrollStateChanged(i42);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrolled(int i42, float f4, int i5) {
                if (BaseBanner.this.mOnPageChangeListener != null) {
                    BaseBanner.this.mOnPageChangeListener.onPageScrolled(i42, f4, i5);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageSelected(int i42) {
                BaseBanner baseBanner = BaseBanner.this;
                baseBanner.mCurrentPosition = i42 % baseBanner.mDatas.size();
                BaseBanner baseBanner2 = BaseBanner.this;
                baseBanner2.setCurrentIndicator(baseBanner2.mCurrentPosition);
                BaseBanner baseBanner3 = BaseBanner.this;
                baseBanner3.onTitleSelect(baseBanner3.mTvTitle, BaseBanner.this.mCurrentPosition);
                LinearLayout linearLayout = BaseBanner.this.mLlBottomBar;
                BaseBanner baseBanner4 = BaseBanner.this;
                linearLayout.setVisibility((baseBanner4.mCurrentPosition != baseBanner4.mDatas.size() + (-1) || BaseBanner.this.mIsBarShowWhenLast) ? 0 : 8);
                BaseBanner baseBanner5 = BaseBanner.this;
                baseBanner5.mLastPosition = baseBanner5.mCurrentPosition;
                if (baseBanner5.mOnPageChangeListener != null) {
                    BaseBanner.this.mOnPageChangeListener.onPageSelected(i42);
                }
            }
        };
        initAttrs(context, attributeSet);
    }
}
