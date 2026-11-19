package com.xuexiang.xui.widget.banner.recycler;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0332a;
import androidx.recyclerview.widget.C0597k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC0562g;
import androidx.recyclerview.widget.RecyclerView.AbstractC0570o;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.banner.recycler.BannerLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class RecyclerViewBannerBase<L extends RecyclerView.AbstractC0570o, A extends RecyclerView.AbstractC0562g> extends FrameLayout {
    private static final int WHAT_AUTO_PLAY = 1000;
    protected A mAdapter;
    protected int mAutoPlayDuration;
    protected int mBannerSize;
    protected int mCurrentIndex;
    protected Handler mHandler;
    protected boolean mHasInit;
    protected RecyclerViewBannerBase<L, A>.IndicatorAdapter mIndicatorAdapter;
    protected RecyclerView mIndicatorContainer;
    protected int mIndicatorMargin;
    protected boolean mIsAutoPlaying;
    protected boolean mIsPlaying;
    protected L mLayoutManager;
    private BannerLayout.OnIndicatorIndexChangedListener mOnIndicatorIndexChangedListener;
    protected RecyclerView mRecyclerView;
    protected Drawable mSelectedDrawable;
    protected boolean mShowIndicator;
    protected List<String> mTempUrlList;
    protected Drawable mUnselectedDrawable;

    protected class IndicatorAdapter extends RecyclerView.AbstractC0562g {
        int currentPosition = 0;

        protected IndicatorAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public int getItemCount() {
            return RecyclerViewBannerBase.this.mBannerSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public void onBindViewHolder(RecyclerView.AbstractC0557b0 abstractC0557b0, int i4) {
            ((ImageView) abstractC0557b0.itemView).setImageDrawable(this.currentPosition == i4 ? RecyclerViewBannerBase.this.mSelectedDrawable : RecyclerViewBannerBase.this.mUnselectedDrawable);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public RecyclerView.AbstractC0557b0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
            ImageView imageView = new ImageView(RecyclerViewBannerBase.this.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
            int i5 = RecyclerViewBannerBase.this.mIndicatorMargin;
            layoutParams.setMargins(i5, i5, i5, i5);
            imageView.setLayoutParams(layoutParams);
            return new RecyclerView.AbstractC0557b0(imageView) { // from class: com.xuexiang.xui.widget.banner.recycler.RecyclerViewBannerBase.IndicatorAdapter.1
            };
        }

        public void setPosition(int i4) {
            this.currentPosition = i4;
        }
    }

    public interface OnBannerItemClickListener {
        void onItemClick(int i4);
    }

    public interface OnIndicatorIndexChangedListener {
        void onIndexChanged(int i4);
    }

    public RecyclerViewBannerBase(Context context) {
        this(context, null);
    }

    protected boolean compareListDifferent(List<String> list, List<String> list2) {
        if (list2 == null || list2.isEmpty() || list.size() != list2.size()) {
            return true;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (TextUtils.isEmpty(list.get(i4)) || !list.get(i4).equals(list2.get(i4))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setPlaying(false);
        } else if (action == 1 || action == 3) {
            setPlaying(true);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    protected abstract A getAdapter(Context context, List<String> list, OnBannerItemClickListener onBannerItemClickListener);

    protected int getColor(int i4) {
        return C0332a.m1804b(getContext(), i4);
    }

    protected abstract L getLayoutManager(Context context, int i4);

    public void initBannerImageView(List<String> list, OnBannerItemClickListener onBannerItemClickListener) {
        if (compareListDifferent(list, this.mTempUrlList)) {
            this.mHasInit = false;
            setVisibility(0);
            setPlaying(false);
            A a4 = (A) getAdapter(getContext(), list, onBannerItemClickListener);
            this.mAdapter = a4;
            this.mRecyclerView.setAdapter(a4);
            this.mTempUrlList = list;
            int size = list.size();
            this.mBannerSize = size;
            if (size > 1) {
                this.mIndicatorContainer.setVisibility(0);
                int i4 = this.mBannerSize * 10000;
                this.mCurrentIndex = i4;
                this.mRecyclerView.scrollToPosition(i4);
                this.mIndicatorAdapter.notifyDataSetChanged();
                setPlaying(true);
            } else {
                this.mIndicatorContainer.setVisibility(8);
                this.mCurrentIndex = 0;
            }
            this.mHasInit = true;
        }
        if (this.mShowIndicator) {
            return;
        }
        this.mIndicatorContainer.setVisibility(8);
    }

    protected void initView(Context context, AttributeSet attributeSet) throws IllegalStateException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.RecyclerViewBannerBase);
        this.mShowIndicator = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RecyclerViewBannerBase_rvbb_showIndicator, true);
        this.mAutoPlayDuration = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RecyclerViewBannerBase_rvbb_interval, 4000);
        this.mIsAutoPlaying = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RecyclerViewBannerBase_rvbb_autoPlaying, true);
        this.mSelectedDrawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorSelectedSrc);
        this.mUnselectedDrawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorUnselectedSrc);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorSize, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorSize));
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorSelectedColor, -65536);
        int color2 = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorUnselectedColor, -7829368);
        if (this.mSelectedDrawable == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(color);
            gradientDrawable.setSize(dimensionPixelSize, dimensionPixelSize);
            gradientDrawable.setCornerRadius(dimensionPixelSize >> 1);
            this.mSelectedDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        }
        if (this.mUnselectedDrawable == null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(color2);
            gradientDrawable2.setSize(dimensionPixelSize, dimensionPixelSize);
            gradientDrawable2.setCornerRadius(dimensionPixelSize >> 1);
            this.mUnselectedDrawable = new LayerDrawable(new Drawable[]{gradientDrawable2});
        }
        this.mIndicatorMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorSpace, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorSpace));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorMarginLeft, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorMarginLeft));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorMarginRight, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorMarginRight));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorMarginBottom, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorMarginBottom));
        int i4 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RecyclerViewBannerBase_rvbb_indicatorGravity, 0);
        int i5 = i4 == 0 ? 8388611 : i4 == 2 ? 8388613 : 17;
        int i6 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.RecyclerViewBannerBase_rvbb_orientation, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.mRecyclerView = new RecyclerView(context);
        new C0597k().attachToRecyclerView(this.mRecyclerView);
        L l3 = (L) getLayoutManager(context, i6);
        this.mLayoutManager = l3;
        this.mRecyclerView.setLayoutManager(l3);
        this.mRecyclerView.addOnScrollListener(new RecyclerView.AbstractC0574s() { // from class: com.xuexiang.xui.widget.banner.recycler.RecyclerViewBannerBase.2
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
            public void onScrollStateChanged(RecyclerView recyclerView, int i7) {
                RecyclerViewBannerBase.this.onBannerScrollStateChanged(recyclerView, i7);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
            public void onScrolled(RecyclerView recyclerView, int i7, int i8) {
                RecyclerViewBannerBase.this.onBannerScrolled(recyclerView, i7, i8);
            }
        });
        addView(this.mRecyclerView, new FrameLayout.LayoutParams(-1, -1));
        this.mIndicatorContainer = new RecyclerView(context);
        this.mIndicatorContainer.setLayoutManager(new LinearLayoutManager(context, i6, false));
        RecyclerViewBannerBase<L, A>.IndicatorAdapter indicatorAdapter = new IndicatorAdapter();
        this.mIndicatorAdapter = indicatorAdapter;
        this.mIndicatorContainer.setAdapter(indicatorAdapter);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i5 | 80;
        layoutParams.setMargins(dimensionPixelSize2, 0, dimensionPixelSize3, dimensionPixelSize4);
        addView(this.mIndicatorContainer, layoutParams);
        if (this.mShowIndicator) {
            return;
        }
        this.mIndicatorContainer.setVisibility(8);
    }

    public boolean isPlaying() {
        return this.mIsPlaying;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPlaying(true);
    }

    protected void onBannerScrollStateChanged(RecyclerView recyclerView, int i4) {
    }

    protected void onBannerScrolled(RecyclerView recyclerView, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setPlaying(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        if (i4 == 0) {
            setPlaying(true);
        } else {
            setPlaying(false);
        }
    }

    protected synchronized void refreshIndicator() {
        int i4 = this.mBannerSize;
        if (i4 > 1) {
            int i5 = this.mCurrentIndex % i4;
            if (this.mShowIndicator) {
                this.mIndicatorAdapter.setPosition(i5);
                this.mIndicatorAdapter.notifyDataSetChanged();
            }
            BannerLayout.OnIndicatorIndexChangedListener onIndicatorIndexChangedListener = this.mOnIndicatorIndexChangedListener;
            if (onIndicatorIndexChangedListener != null) {
                onIndicatorIndexChangedListener.onIndexChanged(i5);
            }
        }
    }

    public void setAutoPlaying(boolean z3) {
        this.mIsAutoPlaying = z3;
        setPlaying(z3);
    }

    public void setIndicatorInterval(int i4) {
        this.mAutoPlayDuration = i4;
    }

    public RecyclerViewBannerBase setOnIndicatorIndexChangedListener(BannerLayout.OnIndicatorIndexChangedListener onIndicatorIndexChangedListener) {
        this.mOnIndicatorIndexChangedListener = onIndicatorIndexChangedListener;
        return this;
    }

    protected synchronized void setPlaying(boolean z3) {
        if (this.mIsAutoPlaying && this.mHasInit) {
            boolean z4 = this.mIsPlaying;
            if (!z4 && z3) {
                this.mHandler.sendEmptyMessageDelayed(1000, this.mAutoPlayDuration);
                this.mIsPlaying = true;
            } else if (z4 && !z3) {
                this.mHandler.removeMessages(1000);
                this.mIsPlaying = false;
            }
        }
    }

    public void setShowIndicator(boolean z3) {
        this.mShowIndicator = z3;
        this.mIndicatorContainer.setVisibility(z3 ? 0 : 8);
    }

    public RecyclerViewBannerBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerViewBannerBase(Context context, AttributeSet attributeSet, int i4) throws IllegalStateException {
        super(context, attributeSet, i4);
        this.mAutoPlayDuration = 4000;
        this.mBannerSize = 1;
        this.mTempUrlList = new ArrayList();
        this.mHandler = new Handler(new Handler.Callback() { // from class: com.xuexiang.xui.widget.banner.recycler.RecyclerViewBannerBase.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1000) {
                    return false;
                }
                RecyclerViewBannerBase recyclerViewBannerBase = RecyclerViewBannerBase.this;
                RecyclerView recyclerView = recyclerViewBannerBase.mRecyclerView;
                int i5 = recyclerViewBannerBase.mCurrentIndex + 1;
                recyclerViewBannerBase.mCurrentIndex = i5;
                recyclerView.smoothScrollToPosition(i5);
                RecyclerViewBannerBase.this.refreshIndicator();
                RecyclerViewBannerBase.this.mHandler.sendEmptyMessageDelayed(1000, r5.mAutoPlayDuration);
                return false;
            }
        });
        initView(context, attributeSet);
    }

    public void initBannerImageView(List<String> list) {
        initBannerImageView(list, null);
    }
}
