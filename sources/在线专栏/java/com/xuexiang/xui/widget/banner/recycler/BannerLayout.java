package com.xuexiang.xui.widget.banner.recycler;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;
import com.xuexiang.xui.widget.banner.recycler.layout.CenterSnapHelper;

/* loaded from: classes.dex */
public class BannerLayout extends FrameLayout {
    private static final int WHAT_AUTO_PLAY = 1000;
    private int mAutoPlayDuration;
    private int mBannerSize;
    private float mCenterScale;
    private int mCurrentIndex;
    protected Handler mHandler;
    private boolean mHasInit;
    private IndicatorAdapter mIndicatorAdapter;
    private RecyclerView mIndicatorContainer;
    private int mIndicatorMargin;
    private boolean mIsAutoPlaying;
    private boolean mIsPlaying;
    private int mItemSpace;
    private BannerLayoutManager mLayoutManager;
    private float mMoveSpeed;
    private OnIndicatorIndexChangedListener mOnIndicatorIndexChangedListener;
    private RecyclerView mRecyclerView;
    private Drawable mSelectedDrawable;
    private boolean mShowIndicator;
    private Drawable mUnselectedDrawable;

    protected class IndicatorAdapter extends RecyclerView.AbstractC0562g {
        int currentPosition = 0;

        protected IndicatorAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public int getItemCount() {
            return BannerLayout.this.mBannerSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public void onBindViewHolder(RecyclerView.AbstractC0557b0 abstractC0557b0, int i4) {
            ((ImageView) abstractC0557b0.itemView).setImageDrawable(this.currentPosition == i4 ? BannerLayout.this.mSelectedDrawable : BannerLayout.this.mUnselectedDrawable);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0562g
        public RecyclerView.AbstractC0557b0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
            ImageView imageView = new ImageView(BannerLayout.this.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
            layoutParams.setMargins(BannerLayout.this.mIndicatorMargin, BannerLayout.this.mIndicatorMargin, BannerLayout.this.mIndicatorMargin, BannerLayout.this.mIndicatorMargin);
            imageView.setLayoutParams(layoutParams);
            return new RecyclerView.AbstractC0557b0(imageView) { // from class: com.xuexiang.xui.widget.banner.recycler.BannerLayout.IndicatorAdapter.1
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

    public BannerLayout(Context context) {
        this(context, null);
    }

    static /* synthetic */ int access$004(BannerLayout bannerLayout) {
        int i4 = bannerLayout.mCurrentIndex + 1;
        bannerLayout.mCurrentIndex = i4;
        return i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setPlaying(false);
        } else if (action == 1 || action == 3) {
            setPlaying(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected void initView(Context context, AttributeSet attributeSet, int i4) throws IllegalStateException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.BannerLayout, i4, 0);
        this.mShowIndicator = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.BannerLayout_bl_showIndicator, true);
        this.mAutoPlayDuration = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.BannerLayout_bl_interval, 4000);
        this.mIsAutoPlaying = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.BannerLayout_bl_autoPlaying, true);
        this.mItemSpace = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BannerLayout_bl_itemSpace, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_itemSpace));
        this.mCenterScale = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.BannerLayout_bl_centerScale, 1.2f);
        this.mMoveSpeed = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.BannerLayout_bl_moveSpeed, 1.0f);
        this.mSelectedDrawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.BannerLayout_bl_indicatorSelectedSrc);
        this.mUnselectedDrawable = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.BannerLayout_bl_indicatorUnselectedSrc);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BannerLayout_bl_indicatorSize, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorSize));
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.BannerLayout_bl_indicatorSelectedColor, ResUtils.getColor(C2042R.color.xui_config_color_red));
        int color2 = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.BannerLayout_bl_indicatorUnselectedColor, ResUtils.getColor(C2042R.color.xui_config_color_gray_2));
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
        this.mIndicatorMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BannerLayout_bl_indicatorSpace, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorSpace));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BannerLayout_bl_indicatorMarginLeft, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorMarginLeft));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BannerLayout_bl_indicatorMarginRight, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorMarginRight));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BannerLayout_bl_indicatorMarginBottom, ResUtils.getDimensionPixelSize(C2042R.dimen.default_recycler_banner_indicatorMarginBottom));
        int i5 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.BannerLayout_bl_indicatorGravity, 0);
        int i6 = i5 == 0 ? 8388611 : i5 == 2 ? 8388613 : 17;
        int i7 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.BannerLayout_bl_orientation, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.mRecyclerView = new RecyclerView(context);
        addView(this.mRecyclerView, new FrameLayout.LayoutParams(-1, -1));
        BannerLayoutManager bannerLayoutManager = new BannerLayoutManager(getContext(), i7);
        this.mLayoutManager = bannerLayoutManager;
        bannerLayoutManager.setItemSpace(this.mItemSpace);
        this.mLayoutManager.setCenterScale(this.mCenterScale);
        this.mLayoutManager.setMoveSpeed(this.mMoveSpeed);
        this.mRecyclerView.setLayoutManager(this.mLayoutManager);
        new CenterSnapHelper().attachToRecyclerView(this.mRecyclerView);
        this.mIndicatorContainer = new RecyclerView(context);
        this.mIndicatorContainer.setLayoutManager(new LinearLayoutManager(context, i7, false));
        IndicatorAdapter indicatorAdapter = new IndicatorAdapter();
        this.mIndicatorAdapter = indicatorAdapter;
        this.mIndicatorContainer.setAdapter(indicatorAdapter);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = i6 | 80;
        layoutParams.setMargins(dimensionPixelSize2, 0, dimensionPixelSize3, dimensionPixelSize4);
        layoutParams.setMarginStart(dimensionPixelSize2);
        layoutParams.setMarginEnd(dimensionPixelSize3);
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

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setPlaying(false);
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
            OnIndicatorIndexChangedListener onIndicatorIndexChangedListener = this.mOnIndicatorIndexChangedListener;
            if (onIndicatorIndexChangedListener != null) {
                onIndicatorIndexChangedListener.onIndexChanged(i5);
            }
        }
    }

    public void setAdapter(RecyclerView.AbstractC0562g abstractC0562g) {
        this.mHasInit = false;
        this.mRecyclerView.setAdapter(abstractC0562g);
        int itemCount = abstractC0562g.getItemCount();
        this.mBannerSize = itemCount;
        this.mLayoutManager.setInfinite(itemCount >= 3);
        setPlaying(true);
        this.mRecyclerView.addOnScrollListener(new RecyclerView.AbstractC0574s() { // from class: com.xuexiang.xui.widget.banner.recycler.BannerLayout.2
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
            public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                int currentPosition = BannerLayout.this.mLayoutManager.getCurrentPosition();
                if (BannerLayout.this.mCurrentIndex != currentPosition) {
                    BannerLayout.this.mCurrentIndex = currentPosition;
                }
                if (i4 == 0) {
                    BannerLayout.this.setPlaying(true);
                }
                BannerLayout.this.refreshIndicator();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574s
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                if (i4 != 0) {
                    BannerLayout.this.setPlaying(false);
                }
            }
        });
        this.mHasInit = true;
    }

    public BannerLayout setAutoPlayDuration(int i4) {
        this.mAutoPlayDuration = i4;
        return this;
    }

    public BannerLayout setAutoPlaying(boolean z3) {
        this.mIsAutoPlaying = z3;
        setPlaying(z3);
        return this;
    }

    public BannerLayout setCenterScale(float f4) {
        this.mCenterScale = f4;
        this.mLayoutManager.setCenterScale(f4);
        return this;
    }

    public BannerLayout setItemSpace(int i4) {
        this.mItemSpace = i4;
        this.mLayoutManager.setItemSpace(i4);
        return this;
    }

    public BannerLayout setMoveSpeed(float f4) {
        this.mMoveSpeed = f4;
        this.mLayoutManager.setMoveSpeed(f4);
        return this;
    }

    public BannerLayout setOnIndicatorIndexChangedListener(OnIndicatorIndexChangedListener onIndicatorIndexChangedListener) {
        this.mOnIndicatorIndexChangedListener = onIndicatorIndexChangedListener;
        return this;
    }

    public BannerLayout setOrientation(int i4) {
        this.mLayoutManager.setOrientation(i4);
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

    public BannerLayout setShowIndicator(boolean z3) {
        this.mShowIndicator = z3;
        this.mIndicatorContainer.setVisibility(z3 ? 0 : 8);
        return this;
    }

    public BannerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.BannerLayoutStyle);
    }

    public BannerLayout(Context context, AttributeSet attributeSet, int i4) throws IllegalStateException {
        super(context, attributeSet, i4);
        this.mBannerSize = 1;
        this.mIsPlaying = false;
        this.mIsAutoPlaying = true;
        this.mHandler = new Handler(new Handler.Callback() { // from class: com.xuexiang.xui.widget.banner.recycler.BannerLayout.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1000 || BannerLayout.this.mCurrentIndex != BannerLayout.this.mLayoutManager.getCurrentPosition()) {
                    return false;
                }
                BannerLayout.access$004(BannerLayout.this);
                BannerLayout.this.mRecyclerView.smoothScrollToPosition(BannerLayout.this.mCurrentIndex);
                BannerLayout.this.mHandler.sendEmptyMessageDelayed(1000, r5.mAutoPlayDuration);
                BannerLayout.this.refreshIndicator();
                return false;
            }
        });
        initView(context, attributeSet, i4);
    }
}
