package com.xuexiang.xui.widget.tabbar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0332a;
import androidx.viewpager.widget.AbstractC0783a;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.ColorUtils;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.utils.Utils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.android.agoo.message.MessageService;

/* loaded from: classes.dex */
public class TabSegment extends HorizontalScrollView {
    public static final int ICON_POSITION_BOTTOM = 3;
    public static final int ICON_POSITION_LEFT = 0;
    public static final int ICON_POSITION_RIGHT = 2;
    public static final int ICON_POSITION_TOP = 1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int NO_POSITION = -1;
    private static final String TAG = "TabSegment";
    private AdapterChangeListener mAdapterChangeListener;
    private Container mContentLayout;
    private int mCurrentSelectedIndex;
    private int mDefaultTabIconPosition;
    private boolean mHasIndicator;
    private Drawable mIndicatorDrawable;
    private int mIndicatorHeight;
    private Paint mIndicatorPaint;
    private Rect mIndicatorRect;
    private boolean mIndicatorTop;
    private boolean mIsInSelectTab;
    private boolean mIsIndicatorWidthFollowContent;
    private int mItemSpaceInScrollMode;
    private int mMode;
    private int mNormalColor;
    private ViewPager.InterfaceC0779i mOnPageChangeListener;
    private OnTabClickListener mOnTabClickListener;
    private AbstractC0783a mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private int mPendingSelectedIndex;
    private Animator mSelectAnimator;
    private int mSelectedColor;
    private final ArrayList<OnTabSelectedListener> mSelectedListeners;
    protected View.OnClickListener mTabOnClickListener;
    private int mTabTextSize;
    private TypefaceProvider mTypefaceProvider;
    private ViewPager mViewPager;
    private int mViewPagerScrollState;
    private OnTabSelectedListener mViewPagerSelectedListener;

    private class AdapterChangeListener implements ViewPager.InterfaceC0778h {
        private boolean mAutoRefresh;
        private final boolean mUseAdapterTitle;

        AdapterChangeListener(boolean z3) {
            this.mUseAdapterTitle = z3;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0778h
        public void onAdapterChanged(ViewPager viewPager, AbstractC0783a abstractC0783a, AbstractC0783a abstractC0783a2) {
            if (TabSegment.this.mViewPager == viewPager) {
                TabSegment.this.setPagerAdapter(abstractC0783a2, this.mUseAdapterTitle, this.mAutoRefresh);
            }
        }

        void setAutoRefresh(boolean z3) {
            this.mAutoRefresh = z3;
        }
    }

    private final class Container extends ViewGroup {
        private TabAdapter mTabAdapter;

        public Container(Context context) {
            super(context);
            this.mTabAdapter = TabSegment.this.new TabAdapter(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (!TabSegment.this.mHasIndicator || TabSegment.this.mIndicatorRect == null) {
                return;
            }
            if (TabSegment.this.mIndicatorTop) {
                TabSegment.this.mIndicatorRect.top = getPaddingTop();
                TabSegment.this.mIndicatorRect.bottom = TabSegment.this.mIndicatorRect.top + TabSegment.this.mIndicatorHeight;
            } else {
                TabSegment.this.mIndicatorRect.bottom = getHeight() - getPaddingBottom();
                TabSegment.this.mIndicatorRect.top = TabSegment.this.mIndicatorRect.bottom - TabSegment.this.mIndicatorHeight;
            }
            if (TabSegment.this.mIndicatorDrawable == null) {
                canvas.drawRect(TabSegment.this.mIndicatorRect, TabSegment.this.mIndicatorPaint);
            } else {
                TabSegment.this.mIndicatorDrawable.setBounds(TabSegment.this.mIndicatorRect);
                TabSegment.this.mIndicatorDrawable.draw(canvas);
            }
        }

        public TabAdapter getTabAdapter() {
            return this.mTabAdapter;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
            List<TabItemView> views = this.mTabAdapter.getViews();
            int size = views.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                if (views.get(i9).getVisibility() == 0) {
                    i8++;
                }
            }
            if (size == 0 || i8 == 0) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            for (int i10 = 0; i10 < size; i10++) {
                TabItemView tabItemView = views.get(i10);
                if (tabItemView.getVisibility() == 0) {
                    int measuredWidth = tabItemView.getMeasuredWidth();
                    int i11 = paddingLeft + measuredWidth;
                    tabItemView.layout(paddingLeft, getPaddingTop(), i11, (i7 - i5) - getPaddingBottom());
                    Tab item = this.mTabAdapter.getItem(i10);
                    int contentLeft = item.getContentLeft();
                    int contentWidth = item.getContentWidth();
                    if (TabSegment.this.mMode == 1 && TabSegment.this.mIsIndicatorWidthFollowContent) {
                        TextView textView = tabItemView.getTextView();
                        paddingLeft += textView.getLeft();
                        measuredWidth = textView.getWidth();
                    }
                    if (contentLeft != paddingLeft || contentWidth != measuredWidth) {
                        item.setContentLeft(paddingLeft);
                        item.setContentWidth(measuredWidth);
                    }
                    paddingLeft = i11 + (TabSegment.this.mMode == 0 ? TabSegment.this.mItemSpaceInScrollMode : 0);
                }
            }
            if (TabSegment.this.mCurrentSelectedIndex != -1 && TabSegment.this.mSelectAnimator == null && TabSegment.this.mViewPagerScrollState == 0) {
                TabSegment tabSegment = TabSegment.this;
                tabSegment.layoutIndicator(this.mTabAdapter.getItem(tabSegment.mCurrentSelectedIndex), false);
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i4, int i5) {
            int size = View.MeasureSpec.getSize(i4);
            int size2 = View.MeasureSpec.getSize(i5);
            List<TabItemView> views = this.mTabAdapter.getViews();
            int size3 = views.size();
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < size3; i8++) {
                if (views.get(i8).getVisibility() == 0) {
                    i7++;
                }
            }
            if (size3 == 0 || i7 == 0) {
                setMeasuredDimension(size, size2);
                return;
            }
            int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            if (TabSegment.this.mMode == 1) {
                int i9 = size / i7;
                while (i6 < size3) {
                    TabItemView tabItemView = views.get(i6);
                    if (tabItemView.getVisibility() == 0) {
                        tabItemView.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                    }
                    i6++;
                }
            } else {
                int measuredWidth = 0;
                while (i6 < size3) {
                    TabItemView tabItemView2 = views.get(i6);
                    if (tabItemView2.getVisibility() == 0) {
                        tabItemView2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
                        measuredWidth += tabItemView2.getMeasuredWidth() + TabSegment.this.mItemSpaceInScrollMode;
                    }
                    i6++;
                }
                size = measuredWidth - TabSegment.this.mItemSpaceInScrollMode;
            }
            setMeasuredDimension(size, size2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconPosition {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public interface OnTabClickListener {
        void onTabClick(int i4);
    }

    public interface OnTabSelectedListener {
        void onDoubleTap(int i4);

        void onTabReselected(int i4);

        void onTabSelected(int i4);

        void onTabUnselected(int i4);
    }

    private class PagerAdapterObserver extends DataSetObserver {
        private final boolean mUseAdapterTitle;

        PagerAdapterObserver(boolean z3) {
            this.mUseAdapterTitle = z3;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabSegment.this.populateFromPagerAdapter(this.mUseAdapterTitle);
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabSegment.this.populateFromPagerAdapter(this.mUseAdapterTitle);
        }
    }

    public class TabAdapter extends XUIItemViewsAdapter<Tab, TabItemView> {
        public TabAdapter(ViewGroup viewGroup) {
            super(viewGroup);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xuexiang.xui.widget.tabbar.XUIItemViewsAdapter
        public void bind(Tab tab, TabItemView tabItemView, int i4) {
            TextView textView = tabItemView.getTextView();
            TabSegment.this.setTextViewTypeface(textView, false);
            List<View> customViews = tab.getCustomViews();
            if (customViews != null && customViews.size() > 0) {
                tabItemView.setTag(C2042R.id.xui_view_can_not_cache_tag, Boolean.TRUE);
                for (View view : customViews) {
                    if (view.getParent() == null) {
                        tabItemView.addView(view);
                    }
                }
            }
            if (TabSegment.this.mMode == 1) {
                int gravity = tab.getGravity();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.addRule(9, (gravity & 3) == 3 ? -1 : 0);
                layoutParams.addRule(14, (gravity & 17) == 17 ? -1 : 0);
                layoutParams.addRule(11, (gravity & 5) != 5 ? 0 : -1);
                textView.setLayoutParams(layoutParams);
            }
            textView.setText(tab.getText());
            textView.setTextSize(0, TabSegment.this.getTabTextSize(tab));
            tabItemView.updateDecoration(tab, TabSegment.this.mCurrentSelectedIndex == i4);
            tabItemView.setTag(Integer.valueOf(i4));
            tabItemView.setOnClickListener(TabSegment.this.mTabOnClickListener);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.xuexiang.xui.widget.tabbar.XUIItemViewsAdapter
        public TabItemView createView(ViewGroup viewGroup) {
            TabSegment tabSegment = TabSegment.this;
            return tabSegment.new TabItemView(tabSegment.getContext());
        }
    }

    public class TabItemView extends RelativeLayout {
        private GestureDetector mGestureDetector;
        private AppCompatTextView mTextView;

        public TabItemView(Context context) {
            super(context);
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.mTextView = appCompatTextView;
            appCompatTextView.setSingleLine(true);
            this.mTextView.setGravity(17);
            this.mTextView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.mTextView.setTypeface(XUI.getDefaultTypeface());
            this.mTextView.setId(C2042R.id.xui_tab_segment_item_id);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(15, -1);
            addView(this.mTextView, layoutParams);
            this.mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.xuexiang.xui.widget.tabbar.TabSegment.TabItemView.1
                @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
                public boolean onDoubleTap(MotionEvent motionEvent) {
                    if (TabSegment.this.mSelectedListeners.isEmpty()) {
                        return false;
                    }
                    int iIntValue = ((Integer) TabItemView.this.getTag()).intValue();
                    if (TabSegment.this.getAdapter().getItem(iIntValue) == null) {
                        return false;
                    }
                    TabSegment.this.dispatchTabDoubleTap(iIntValue);
                    return true;
                }
            });
        }

        public TextView getTextView() {
            return this.mTextView;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.mGestureDetector.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
        }

        public void setColorInTransition(Tab tab, int i4) {
            Drawable drawable;
            this.mTextView.setTextColor(i4);
            if (!tab.isDynamicChangeIconColor() || (drawable = this.mTextView.getCompoundDrawables()[TabSegment.this.getTabIconPosition(tab)]) == null) {
                return;
            }
            Utils.setDrawableTintColor(drawable, i4);
            TabSegment tabSegment = TabSegment.this;
            tabSegment.setDrawable(this.mTextView, drawable, tabSegment.getTabIconPosition(tab));
        }

        public void updateDecoration(Tab tab, boolean z3) {
            TabSegment tabSegment = TabSegment.this;
            int tabSelectedColor = z3 ? tabSegment.getTabSelectedColor(tab) : tabSegment.getTabNormalColor(tab);
            this.mTextView.setTextColor(tabSelectedColor);
            Drawable normalIcon = tab.getNormalIcon();
            if (z3) {
                if (tab.isDynamicChangeIconColor()) {
                    if (normalIcon != null) {
                        normalIcon = normalIcon.mutate();
                        Utils.setDrawableTintColor(normalIcon, tabSelectedColor);
                    }
                } else if (tab.getSelectedIcon() != null) {
                    normalIcon = tab.getSelectedIcon();
                }
            }
            if (normalIcon == null) {
                this.mTextView.setCompoundDrawablePadding(0);
                this.mTextView.setCompoundDrawables(null, null, null, null);
            } else {
                this.mTextView.setCompoundDrawablePadding(DensityUtils.dp2px(getContext(), 4.0f));
                TabSegment tabSegment2 = TabSegment.this;
                tabSegment2.setDrawable(this.mTextView, normalIcon, tabSegment2.getTabIconPosition(tab));
            }
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.InterfaceC0779i {
        private final WeakReference<TabSegment> mTabSegmentRef;

        public TabLayoutOnPageChangeListener(TabSegment tabSegment) {
            this.mTabSegmentRef = new WeakReference<>(tabSegment);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
        public void onPageScrollStateChanged(int i4) {
            TabSegment tabSegment = this.mTabSegmentRef.get();
            if (tabSegment != null) {
                tabSegment.setViewPagerScrollState(i4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
        public void onPageScrolled(int i4, float f4, int i5) {
            TabSegment tabSegment = this.mTabSegmentRef.get();
            if (tabSegment != null) {
                tabSegment.updateIndicatorPosition(i4, f4);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
        public void onPageSelected(int i4) {
            TabSegment tabSegment = this.mTabSegmentRef.get();
            if (tabSegment == null || tabSegment.getSelectedIndex() == i4 || i4 >= tabSegment.getTabCount()) {
                return;
            }
            tabSegment.selectTab(i4, true, false);
        }
    }

    public interface TypefaceProvider {
        Typeface getTypeface();

        boolean isNormalTabBold();

        boolean isSelectedTabBold();
    }

    private static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager mViewPager;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.mViewPager = viewPager;
        }

        @Override // com.xuexiang.xui.widget.tabbar.TabSegment.OnTabSelectedListener
        public void onDoubleTap(int i4) {
        }

        @Override // com.xuexiang.xui.widget.tabbar.TabSegment.OnTabSelectedListener
        public void onTabReselected(int i4) {
        }

        @Override // com.xuexiang.xui.widget.tabbar.TabSegment.OnTabSelectedListener
        public void onTabSelected(int i4) throws Resources.NotFoundException {
            this.mViewPager.setCurrentItem(i4, false);
        }

        @Override // com.xuexiang.xui.widget.tabbar.TabSegment.OnTabSelectedListener
        public void onTabUnselected(int i4) {
        }
    }

    public TabSegment(Context context) {
        this(context, (AttributeSet) null);
    }

    private void createTypefaceProvider(Context context, String str) throws NoSuchMethodException, SecurityException {
        if (Utils.isNullOrEmpty(str)) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return;
        }
        String fullClassName = getFullClassName(context, strTrim);
        try {
            try {
                Constructor constructor = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(fullClassName).asSubclass(TypefaceProvider.class).getConstructor(new Class[0]);
                constructor.setAccessible(true);
                this.mTypefaceProvider = (TypefaceProvider) constructor.newInstance(new Object[0]);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException("Error creating TypefaceProvider " + fullClassName, e4);
            }
        } catch (ClassCastException e5) {
            throw new IllegalStateException("Class is not a TypefaceProvider " + fullClassName, e5);
        } catch (ClassNotFoundException e6) {
            throw new IllegalStateException("Unable to find TypefaceProvider " + fullClassName, e6);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Cannot access non-public constructor " + fullClassName, e7);
        } catch (InstantiationException e8) {
            throw new IllegalStateException("Could not instantiate the TypefaceProvider: " + fullClassName, e8);
        } catch (InvocationTargetException e9) {
            throw new IllegalStateException("Could not instantiate the TypefaceProvider: " + fullClassName, e9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchTabDoubleTap(int i4) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).onDoubleTap(i4);
        }
    }

    private void dispatchTabReselected(int i4) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).onTabReselected(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchTabSelected(int i4) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).onTabSelected(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchTabUnselected(int i4) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            this.mSelectedListeners.get(size).onTabUnselected(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TabAdapter getAdapter() {
        return this.mContentLayout.getTabAdapter();
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) != '.') {
            return str;
        }
        return context.getPackageName() + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabCount() {
        return getAdapter().getSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabIconPosition(Tab tab) {
        int iconPosition = tab.getIconPosition();
        return iconPosition == Integer.MIN_VALUE ? this.mDefaultTabIconPosition : iconPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabNormalColor(Tab tab) {
        int normalColor = tab.getNormalColor();
        return normalColor == Integer.MIN_VALUE ? this.mNormalColor : normalColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabSelectedColor(Tab tab) {
        int selectedColor = tab.getSelectedColor();
        return selectedColor == Integer.MIN_VALUE ? this.mSelectedColor : selectedColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabTextSize(Tab tab) {
        int textSize = tab.getTextSize();
        return textSize == Integer.MIN_VALUE ? this.mTabTextSize : textSize;
    }

    private void init(Context context, AttributeSet attributeSet, int i4) throws NoSuchMethodException, SecurityException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.TabSegment, i4, 0);
        this.mSelectedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TabSegment_ts_selected_color, ThemeUtils.getMainThemeColor(context));
        this.mNormalColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TabSegment_ts_normal_color, C0332a.m1804b(context, C2042R.color.xui_config_color_gray_5));
        this.mHasIndicator = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.TabSegment_ts_has_indicator, true);
        this.mIndicatorHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TabSegment_ts_indicator_height, getResources().getDimensionPixelSize(C2042R.dimen.xui_tab_segment_indicator_height));
        this.mTabTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TabSegment_android_textSize, getResources().getDimensionPixelSize(C2042R.dimen.xui_tab_segment_text_size));
        this.mIndicatorTop = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.TabSegment_ts_indicator_top, false);
        this.mDefaultTabIconPosition = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.TabSegment_ts_icon_position, 0);
        this.mMode = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.TabSegment_ts_mode, 1);
        this.mItemSpaceInScrollMode = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TabSegment_ts_space, DensityUtils.dp2px(context, 10.0f));
        String string = typedArrayObtainStyledAttributes.getString(C2042R.styleable.TabSegment_ts_typeface_provider);
        typedArrayObtainStyledAttributes.recycle();
        Container container = new Container(context);
        this.mContentLayout = container;
        addView(container, new FrameLayout.LayoutParams(-2, -1));
        createTypefaceProvider(context, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void layoutIndicator(Tab tab, boolean z3) {
        if (tab == null) {
            return;
        }
        Rect rect = this.mIndicatorRect;
        if (rect == null) {
            this.mIndicatorRect = new Rect(tab.contentLeft, 0, tab.contentLeft + tab.contentWidth, 0);
        } else {
            rect.left = tab.contentLeft;
            this.mIndicatorRect.right = tab.contentLeft + tab.contentWidth;
        }
        if (this.mIndicatorPaint == null) {
            Paint paint = new Paint();
            this.mIndicatorPaint = paint;
            paint.setStyle(Paint.Style.FILL);
        }
        this.mIndicatorPaint.setColor(getTabSelectedColor(tab));
        if (z3) {
            this.mContentLayout.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void layoutIndicatorInTransition(Tab tab, Tab tab2, float f4) {
        int contentLeft = tab2.getContentLeft() - tab.getContentLeft();
        int contentLeft2 = (int) (tab.getContentLeft() + (contentLeft * f4));
        int contentWidth = (int) (tab.getContentWidth() + ((tab2.getContentWidth() - tab.getContentWidth()) * f4));
        Rect rect = this.mIndicatorRect;
        if (rect == null) {
            this.mIndicatorRect = new Rect(contentLeft2, 0, contentWidth + contentLeft2, 0);
        } else {
            rect.left = contentLeft2;
            rect.right = contentLeft2 + contentWidth;
        }
        if (this.mIndicatorPaint == null) {
            Paint paint = new Paint();
            this.mIndicatorPaint = paint;
            paint.setStyle(Paint.Style.FILL);
        }
        this.mIndicatorPaint.setColor(ColorUtils.computeColor(getTabSelectedColor(tab), getTabSelectedColor(tab2), f4));
        this.mContentLayout.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDrawable(TextView textView, Drawable drawable, int i4) {
        Drawable drawable2 = i4 == 0 ? drawable : null;
        Drawable drawable3 = i4 == 1 ? drawable : null;
        Drawable drawable4 = i4 == 2 ? drawable : null;
        if (i4 != 3) {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, drawable3, drawable4, drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setTextViewTypeface(TextView textView, boolean z3) {
        TypefaceProvider typefaceProvider = this.mTypefaceProvider;
        if (typefaceProvider == null || textView == null) {
            return;
        }
        textView.setTypeface(this.mTypefaceProvider.getTypeface(), z3 ? typefaceProvider.isSelectedTabBold() : typefaceProvider.isNormalTabBold());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewPagerScrollState(int i4) {
        int i5;
        this.mViewPagerScrollState = i4;
        if (i4 == 0 && (i5 = this.mPendingSelectedIndex) != -1 && this.mSelectAnimator == null) {
            selectTab(i5, true, false);
            this.mPendingSelectedIndex = -1;
        }
    }

    public void addOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        if (this.mSelectedListeners.contains(onTabSelectedListener)) {
            return;
        }
        this.mSelectedListeners.add(onTabSelectedListener);
    }

    public TabSegment addTab(Tab tab) {
        this.mContentLayout.getTabAdapter().addItem(tab);
        return this;
    }

    public void clearOnTabSelectedListeners() {
        this.mSelectedListeners.clear();
    }

    public int getMode() {
        return this.mMode;
    }

    public int getSelectedIndex() {
        return this.mCurrentSelectedIndex;
    }

    public int getSignCount(int i4) {
        return getAdapter().getItem(i4).getSignCount();
    }

    public Tab getTab(int i4) {
        return getAdapter().getItem(i4);
    }

    public void hideSignCountView(int i4) {
        getAdapter().getItem(i4).hideSignCountView();
    }

    public void notifyDataChanged() {
        getAdapter().setup();
        populateFromPagerAdapter(false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (this.mCurrentSelectedIndex == -1 || this.mMode != 0) {
            return;
        }
        TabItemView tabItemView = getAdapter().getViews().get(this.mCurrentSelectedIndex);
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
    protected void onMeasure(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            childAt.measure(View.MeasureSpec.makeMeasureSpec(size - paddingLeft, 1073741824), i5);
            if (mode == Integer.MIN_VALUE) {
                setMeasuredDimension(Math.min(size, childAt.getMeasuredWidth() + paddingLeft), i5);
                return;
            }
        }
        setMeasuredDimension(i4, i5);
    }

    void populateFromPagerAdapter(boolean z3) {
        AbstractC0783a abstractC0783a = this.mPagerAdapter;
        if (abstractC0783a == null) {
            if (z3) {
                reset();
                return;
            }
            return;
        }
        int count = abstractC0783a.getCount();
        if (z3) {
            reset();
            for (int i4 = 0; i4 < count; i4++) {
                addTab(new Tab(this.mPagerAdapter.getPageTitle(i4)));
            }
            notifyDataChanged();
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || count <= 0) {
            return;
        }
        selectTab(viewPager.getCurrentItem(), true, false);
    }

    public void removeOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        this.mSelectedListeners.remove(onTabSelectedListener);
    }

    public void replaceTab(int i4, Tab tab) {
        try {
            getAdapter().replaceItem(i4, tab);
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        }
    }

    public void reset() {
        this.mContentLayout.getTabAdapter().clear();
        this.mCurrentSelectedIndex = -1;
        Animator animator = this.mSelectAnimator;
        if (animator != null) {
            animator.cancel();
            this.mSelectAnimator = null;
        }
    }

    public void selectTab(int i4) {
        selectTab(i4, false, false);
    }

    public void setDefaultNormalColor(int i4) {
        this.mNormalColor = i4;
    }

    public void setDefaultSelectedColor(int i4) {
        this.mSelectedColor = i4;
    }

    public void setDefaultTabIconPosition(int i4) {
        this.mDefaultTabIconPosition = i4;
    }

    public void setHasIndicator(boolean z3) {
        if (this.mHasIndicator != z3) {
            this.mHasIndicator = z3;
            invalidate();
        }
    }

    public void setIndicatorDrawable(Drawable drawable) {
        this.mIndicatorDrawable = drawable;
        if (drawable != null) {
            this.mIndicatorHeight = drawable.getIntrinsicHeight();
        }
        this.mContentLayout.invalidate();
    }

    public void setIndicatorPosition(boolean z3) {
        if (this.mIndicatorTop != z3) {
            this.mIndicatorTop = z3;
            this.mContentLayout.invalidate();
        }
    }

    public void setIndicatorWidthAdjustContent(boolean z3) {
        if (this.mIsIndicatorWidthFollowContent != z3) {
            this.mIsIndicatorWidthFollowContent = z3;
            this.mContentLayout.requestLayout();
        }
    }

    public void setItemSpaceInScrollMode(int i4) {
        this.mItemSpaceInScrollMode = i4;
    }

    public void setMode(int i4) {
        if (this.mMode != i4) {
            this.mMode = i4;
            this.mContentLayout.invalidate();
        }
    }

    public void setOnTabClickListener(OnTabClickListener onTabClickListener) {
        this.mOnTabClickListener = onTabClickListener;
    }

    void setPagerAdapter(AbstractC0783a abstractC0783a, boolean z3, boolean z4) {
        DataSetObserver dataSetObserver;
        AbstractC0783a abstractC0783a2 = this.mPagerAdapter;
        if (abstractC0783a2 != null && (dataSetObserver = this.mPagerAdapterObserver) != null) {
            abstractC0783a2.unregisterDataSetObserver(dataSetObserver);
        }
        this.mPagerAdapter = abstractC0783a;
        if (z4 && abstractC0783a != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new PagerAdapterObserver(z3);
            }
            abstractC0783a.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter(z3);
    }

    public void setTabTextSize(int i4) {
        this.mTabTextSize = i4;
    }

    public void setTypefaceProvider(TypefaceProvider typefaceProvider) {
        this.mTypefaceProvider = typefaceProvider;
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void showSignCountView(Context context, int i4, int i5) {
        getAdapter().getItem(i4).showSignCountView(context, i5);
        notifyDataChanged();
    }

    public void updateIndicatorPosition(int i4, float f4) {
        int i5;
        if (this.mSelectAnimator != null || this.mIsInSelectTab || f4 == IGoodView.DEFAULT_TO_ALPHA) {
            return;
        }
        if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
            i5 = i4 - 1;
            f4 = -f4;
        } else {
            i5 = i4 + 1;
        }
        TabAdapter adapter = getAdapter();
        List<TabItemView> views = adapter.getViews();
        if (views.size() <= i4 || views.size() <= i5) {
            return;
        }
        Tab item = adapter.getItem(i4);
        Tab item2 = adapter.getItem(i5);
        TabItemView tabItemView = views.get(i4);
        TabItemView tabItemView2 = views.get(i5);
        int iComputeColor = ColorUtils.computeColor(getTabSelectedColor(item), getTabNormalColor(item), f4);
        int iComputeColor2 = ColorUtils.computeColor(getTabNormalColor(item2), getTabSelectedColor(item2), f4);
        tabItemView.setColorInTransition(item, iComputeColor);
        tabItemView2.setColorInTransition(item2, iComputeColor2);
        layoutIndicatorInTransition(item, item2, f4);
    }

    public void updateTabText(int i4, String str) {
        Tab item = getAdapter().getItem(i4);
        if (item == null) {
            return;
        }
        item.setText(str);
        notifyDataChanged();
    }

    public TabSegment(Context context, boolean z3) {
        this(context, (AttributeSet) null);
        this.mHasIndicator = z3;
    }

    public void selectTab(final int i4, boolean z3, boolean z4) {
        if (this.mIsInSelectTab) {
            return;
        }
        this.mIsInSelectTab = true;
        TabAdapter adapter = getAdapter();
        List<TabItemView> views = adapter.getViews();
        if (views.size() != adapter.getSize()) {
            adapter.setup();
            views = adapter.getViews();
        }
        if (views.size() == 0 || views.size() <= i4) {
            this.mIsInSelectTab = false;
            return;
        }
        if (this.mSelectAnimator != null || this.mViewPagerScrollState != 0) {
            this.mPendingSelectedIndex = i4;
            this.mIsInSelectTab = false;
            return;
        }
        int i5 = this.mCurrentSelectedIndex;
        if (i5 == i4) {
            if (z4) {
                dispatchTabReselected(i4);
            }
            this.mIsInSelectTab = false;
            this.mContentLayout.invalidate();
            return;
        }
        if (i5 > views.size()) {
            Log.i(TAG, "selectTab: current selected index is bigger than views size.");
            this.mCurrentSelectedIndex = -1;
        }
        final int i6 = this.mCurrentSelectedIndex;
        if (i6 == -1) {
            Tab item = adapter.getItem(i4);
            layoutIndicator(item, true);
            setTextViewTypeface(views.get(i4).getTextView(), true);
            views.get(i4).updateDecoration(item, true);
            dispatchTabSelected(i4);
            this.mCurrentSelectedIndex = i4;
            this.mIsInSelectTab = false;
            return;
        }
        final Tab item2 = adapter.getItem(i6);
        final TabItemView tabItemView = views.get(i6);
        final Tab item3 = adapter.getItem(i4);
        final TabItemView tabItemView2 = views.get(i4);
        if (!z3) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(IGoodView.DEFAULT_TO_ALPHA, 1.0f);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.tabbar.TabSegment.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    int iComputeColor = ColorUtils.computeColor(TabSegment.this.getTabSelectedColor(item2), TabSegment.this.getTabNormalColor(item2), fFloatValue);
                    int iComputeColor2 = ColorUtils.computeColor(TabSegment.this.getTabNormalColor(item3), TabSegment.this.getTabSelectedColor(item3), fFloatValue);
                    tabItemView.setColorInTransition(item2, iComputeColor);
                    tabItemView2.setColorInTransition(item3, iComputeColor2);
                    TabSegment.this.layoutIndicatorInTransition(item2, item3, fFloatValue);
                }
            });
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.xuexiang.xui.widget.tabbar.TabSegment.3
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    TabSegment.this.mSelectAnimator = null;
                    tabItemView.updateDecoration(item2, true);
                    tabItemView2.updateDecoration(item3, false);
                    TabSegment.this.layoutIndicator(item2, true);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    TabSegment.this.mSelectAnimator = null;
                    tabItemView.updateDecoration(item2, false);
                    tabItemView2.updateDecoration(item3, true);
                    TabSegment.this.dispatchTabSelected(i4);
                    TabSegment.this.dispatchTabUnselected(i6);
                    TabSegment.this.setTextViewTypeface(tabItemView.getTextView(), false);
                    TabSegment.this.setTextViewTypeface(tabItemView2.getTextView(), true);
                    TabSegment.this.mCurrentSelectedIndex = i4;
                    if (TabSegment.this.mPendingSelectedIndex == -1 || TabSegment.this.mViewPagerScrollState != 0) {
                        return;
                    }
                    TabSegment tabSegment = TabSegment.this;
                    tabSegment.selectTab(tabSegment.mPendingSelectedIndex, true, false);
                    TabSegment.this.mPendingSelectedIndex = -1;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    TabSegment.this.mSelectAnimator = animator;
                }
            });
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.start();
            this.mIsInSelectTab = false;
            return;
        }
        dispatchTabUnselected(i6);
        dispatchTabSelected(i4);
        setTextViewTypeface(tabItemView.getTextView(), false);
        setTextViewTypeface(tabItemView2.getTextView(), true);
        tabItemView.updateDecoration(item2, false);
        tabItemView2.updateDecoration(item3, true);
        if (getScrollX() > tabItemView2.getLeft()) {
            smoothScrollTo(tabItemView2.getLeft(), 0);
        } else {
            int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
            if (getScrollX() + width < tabItemView2.getRight()) {
                smoothScrollBy((tabItemView2.getRight() - width) - getScrollX(), 0);
            }
        }
        this.mCurrentSelectedIndex = i4;
        this.mIsInSelectTab = false;
        layoutIndicator(item3, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z3) {
        setupWithViewPager(viewPager, z3, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z3, boolean z4) {
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null) {
            ViewPager.InterfaceC0779i interfaceC0779i = this.mOnPageChangeListener;
            if (interfaceC0779i != null) {
                viewPager2.removeOnPageChangeListener(interfaceC0779i);
            }
            AdapterChangeListener adapterChangeListener = this.mAdapterChangeListener;
            if (adapterChangeListener != null) {
                this.mViewPager.removeOnAdapterChangeListener(adapterChangeListener);
            }
        }
        OnTabSelectedListener onTabSelectedListener = this.mViewPagerSelectedListener;
        if (onTabSelectedListener != null) {
            removeOnTabSelectedListener(onTabSelectedListener);
            this.mViewPagerSelectedListener = null;
        }
        if (viewPager != null) {
            this.mViewPager = viewPager;
            if (this.mOnPageChangeListener == null) {
                this.mOnPageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            viewPager.addOnPageChangeListener(this.mOnPageChangeListener);
            ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener = new ViewPagerOnTabSelectedListener(viewPager);
            this.mViewPagerSelectedListener = viewPagerOnTabSelectedListener;
            addOnTabSelectedListener(viewPagerOnTabSelectedListener);
            AbstractC0783a adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z3, z4);
            }
            if (this.mAdapterChangeListener == null) {
                this.mAdapterChangeListener = new AdapterChangeListener(z3);
            }
            this.mAdapterChangeListener.setAutoRefresh(z4);
            viewPager.addOnAdapterChangeListener(this.mAdapterChangeListener);
            return;
        }
        this.mViewPager = null;
        setPagerAdapter(null, false, false);
    }

    public TabSegment(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.TabSegmentStyle);
    }

    public TabSegment(Context context, AttributeSet attributeSet, int i4) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i4);
        this.mSelectedListeners = new ArrayList<>();
        this.mCurrentSelectedIndex = -1;
        this.mPendingSelectedIndex = -1;
        this.mHasIndicator = true;
        this.mIndicatorTop = false;
        this.mIsIndicatorWidthFollowContent = true;
        this.mIndicatorRect = null;
        this.mIndicatorPaint = null;
        this.mMode = 1;
        this.mViewPagerScrollState = 0;
        this.mTabOnClickListener = new View.OnClickListener() { // from class: com.xuexiang.xui.widget.tabbar.TabSegment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TabSegment.this.mSelectAnimator == null && TabSegment.this.mViewPagerScrollState == 0) {
                    int iIntValue = ((Integer) view.getTag()).intValue();
                    Tab item = TabSegment.this.getAdapter().getItem(iIntValue);
                    if (item != null) {
                        TabSegment tabSegment = TabSegment.this;
                        tabSegment.selectTab(iIntValue, (tabSegment.mHasIndicator || item.isDynamicChangeIconColor()) ? false : true, true);
                    }
                    if (TabSegment.this.mOnTabClickListener != null) {
                        TabSegment.this.mOnTabClickListener.onTabClick(iIntValue);
                    }
                }
            }
        };
        this.mIsInSelectTab = false;
        init(context, attributeSet, i4);
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
    }

    public static class Tab {
        public static final int USE_TAB_SEGMENT = Integer.MIN_VALUE;
        private int contentLeft;
        private int contentWidth;
        private boolean dynamicChangeIconColor;
        private int gravity;
        private int iconPosition;
        private List<View> mCustomViews;
        private int mSignCountDigits;
        private int mSignCountMarginLeft;
        private int mSignCountMarginTop;
        private TextView mSignCountTextView;
        private int normalColor;
        private Drawable normalIcon;
        private int selectedColor;
        private Drawable selectedIcon;
        private CharSequence text;
        private int textSize;

        public Tab(CharSequence charSequence) {
            this.textSize = Integer.MIN_VALUE;
            this.normalColor = Integer.MIN_VALUE;
            this.selectedColor = Integer.MIN_VALUE;
            this.normalIcon = null;
            this.selectedIcon = null;
            this.contentWidth = 0;
            this.contentLeft = 0;
            this.iconPosition = Integer.MIN_VALUE;
            this.gravity = 17;
            this.mSignCountDigits = 2;
            this.mSignCountMarginLeft = 0;
            this.mSignCountMarginTop = 0;
            this.dynamicChangeIconColor = true;
            this.text = charSequence;
        }

        private TextView ensureSignCountView(Context context) {
            if (this.mSignCountTextView == null) {
                this.mSignCountTextView = new TextView(context, null, C2042R.attr.xui_tab_sign_count_view);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, ThemeUtils.resolveDimension(context, C2042R.attr.xui_tab_sign_count_view_minSize));
                int i4 = C2042R.id.xui_tab_segment_item_id;
                layoutParams.addRule(6, i4);
                layoutParams.addRule(1, i4);
                this.mSignCountTextView.setLayoutParams(layoutParams);
                addCustomView(this.mSignCountTextView);
            }
            setSignCountMargin(this.mSignCountMarginLeft, this.mSignCountMarginTop);
            return this.mSignCountTextView;
        }

        private RelativeLayout.LayoutParams getDefaultCustomLayoutParam() {
            return new RelativeLayout.LayoutParams(-2, -2);
        }

        private String getNumberDigitsFormattingValue(int i4) {
            if (Utils.getNumberDigits(i4) <= this.mSignCountDigits) {
                return String.valueOf(i4);
            }
            StringBuilder sb = new StringBuilder();
            for (int i5 = 1; i5 <= this.mSignCountDigits; i5++) {
                sb.append(MessageService.MSG_ACCS_NOTIFY_DISMISS);
            }
            sb.append("+");
            return sb.toString();
        }

        public void addCustomView(View view) {
            if (this.mCustomViews == null) {
                this.mCustomViews = new ArrayList();
            }
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(getDefaultCustomLayoutParam());
            }
            this.mCustomViews.add(view);
        }

        public int getContentLeft() {
            return this.contentLeft;
        }

        public int getContentWidth() {
            return this.contentWidth;
        }

        public List<View> getCustomViews() {
            return this.mCustomViews;
        }

        public int getGravity() {
            return this.gravity;
        }

        public int getIconPosition() {
            return this.iconPosition;
        }

        public int getNormalColor() {
            return this.normalColor;
        }

        public Drawable getNormalIcon() {
            return this.normalIcon;
        }

        public int getSelectedColor() {
            return this.selectedColor;
        }

        public Drawable getSelectedIcon() {
            return this.selectedIcon;
        }

        public int getSignCount() {
            TextView textView = this.mSignCountTextView;
            if (textView == null || textView.getVisibility() != 0 || Utils.isNullOrEmpty(this.mSignCountTextView.getText())) {
                return 0;
            }
            return Integer.parseInt(this.mSignCountTextView.getText().toString());
        }

        public CharSequence getText() {
            return this.text;
        }

        public int getTextSize() {
            return this.textSize;
        }

        public void hideSignCountView() {
            TextView textView = this.mSignCountTextView;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }

        public boolean isDynamicChangeIconColor() {
            return this.dynamicChangeIconColor;
        }

        public void setContentLeft(int i4) {
            this.contentLeft = i4;
        }

        public void setContentWidth(int i4) {
            this.contentWidth = i4;
        }

        public void setGravity(int i4) {
            this.gravity = i4;
        }

        public void setIconPosition(int i4) {
            this.iconPosition = i4;
        }

        public void setSignCountMargin(int i4, int i5) {
            this.mSignCountMarginLeft = i4;
            this.mSignCountMarginTop = i5;
            TextView textView = this.mSignCountTextView;
            if (textView == null || textView.getLayoutParams() == null) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) this.mSignCountTextView.getLayoutParams()).leftMargin = i4;
            ((ViewGroup.MarginLayoutParams) this.mSignCountTextView.getLayoutParams()).topMargin = i5;
        }

        public void setText(CharSequence charSequence) {
            this.text = charSequence;
        }

        public void setTextColor(int i4, int i5) {
            this.normalColor = i4;
            this.selectedColor = i5;
        }

        public void setTextSize(int i4) {
            this.textSize = i4;
        }

        public void setmSignCountDigits(int i4) {
            this.mSignCountDigits = i4;
        }

        public void showSignCountView(Context context, int i4) {
            ensureSignCountView(context);
            this.mSignCountTextView.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mSignCountTextView.getLayoutParams();
            if (i4 != 0) {
                Context context2 = this.mSignCountTextView.getContext();
                int i5 = C2042R.attr.xui_tab_sign_count_view_minSize_with_text;
                layoutParams.height = ThemeUtils.resolveDimension(context2, i5);
                this.mSignCountTextView.setLayoutParams(layoutParams);
                TextView textView = this.mSignCountTextView;
                textView.setMinHeight(ThemeUtils.resolveDimension(textView.getContext(), i5));
                TextView textView2 = this.mSignCountTextView;
                textView2.setMinWidth(ThemeUtils.resolveDimension(textView2.getContext(), i5));
                this.mSignCountTextView.setText(getNumberDigitsFormattingValue(i4));
                return;
            }
            Context context3 = this.mSignCountTextView.getContext();
            int i6 = C2042R.attr.xui_tab_sign_count_view_minSize;
            layoutParams.height = ThemeUtils.resolveDimension(context3, i6);
            this.mSignCountTextView.setLayoutParams(layoutParams);
            TextView textView3 = this.mSignCountTextView;
            textView3.setMinHeight(ThemeUtils.resolveDimension(textView3.getContext(), i6));
            TextView textView4 = this.mSignCountTextView;
            textView4.setMinWidth(ThemeUtils.resolveDimension(textView4.getContext(), i6));
            this.mSignCountTextView.setText((CharSequence) null);
        }

        public Tab(Drawable drawable, Drawable drawable2, CharSequence charSequence, boolean z3) {
            this(drawable, drawable2, charSequence, z3, true);
        }

        public Tab(Drawable drawable, Drawable drawable2, CharSequence charSequence, boolean z3, boolean z4) {
            this.textSize = Integer.MIN_VALUE;
            this.normalColor = Integer.MIN_VALUE;
            this.selectedColor = Integer.MIN_VALUE;
            this.selectedIcon = null;
            this.contentWidth = 0;
            this.contentLeft = 0;
            this.iconPosition = Integer.MIN_VALUE;
            this.gravity = 17;
            this.mSignCountDigits = 2;
            this.mSignCountMarginLeft = 0;
            this.mSignCountMarginTop = 0;
            this.dynamicChangeIconColor = true;
            this.normalIcon = drawable;
            if (drawable != null && z4) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            this.selectedIcon = drawable2;
            if (drawable2 != null && z4) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            }
            this.text = charSequence;
            this.dynamicChangeIconColor = z3;
        }
    }
}
