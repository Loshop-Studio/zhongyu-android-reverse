package com.lljjcoder.style.citypickerview.widget.wheel;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.lljjcoder.style.citypickerview.C5752R;
import com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller;
import com.lljjcoder.style.citypickerview.widget.wheel.adapters.WheelViewAdapter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class WheelView extends View {
    private static final int DEF_VISIBLE_ITEMS = 5;
    private static final int ITEM_OFFSET_PERCENT = 0;
    private static final int PADDING = 5;
    private int[] SHADOWS_COLORS;
    private GradientDrawable bottomShadow;
    private Drawable centerDrawable;
    private List<OnWheelChangedListener> changingListeners;
    private List<OnWheelClickedListener> clickingListeners;
    private int currentItem;
    private DataSetObserver dataObserver;
    private boolean drawShadows;
    private int firstItem;
    boolean isCyclic;
    private boolean isScrollingPerformed;
    private int itemHeight;
    private LinearLayout itemsLayout;
    private String lineColorStr;
    private int lineWidth;
    private WheelRecycle recycle;
    private WheelScroller scroller;
    WheelScroller.ScrollingListener scrollingListener;
    private List<OnWheelScrollListener> scrollingListeners;
    private int scrollingOffset;
    private GradientDrawable topShadow;
    private WheelViewAdapter viewAdapter;
    private int visibleItems;
    private int wheelBackground;
    private int wheelForeground;

    public WheelView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.SHADOWS_COLORS = new int[]{-268830215, -805701127, 1073347065};
        this.currentItem = 0;
        this.visibleItems = 5;
        this.itemHeight = 0;
        this.wheelBackground = C5752R.drawable.wheel_bg;
        this.wheelForeground = C5752R.drawable.wheel_val;
        this.drawShadows = true;
        this.isCyclic = false;
        this.recycle = new WheelRecycle(this);
        this.changingListeners = new LinkedList();
        this.scrollingListeners = new LinkedList();
        this.clickingListeners = new LinkedList();
        this.lineColorStr = "#C7C7C7";
        this.lineWidth = 3;
        this.scrollingListener = new WheelScroller.ScrollingListener() { // from class: com.lljjcoder.style.citypickerview.widget.wheel.WheelView.1
            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onFinished() {
                if (WheelView.this.isScrollingPerformed) {
                    WheelView.this.notifyScrollingListenersAboutEnd();
                    WheelView.this.isScrollingPerformed = false;
                }
                WheelView.this.scrollingOffset = 0;
                WheelView.this.invalidate();
            }

            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onJustify() {
                if (Math.abs(WheelView.this.scrollingOffset) > 1) {
                    WheelView.this.scroller.scroll(WheelView.this.scrollingOffset, 0);
                }
            }

            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onScroll(int i7) {
                WheelView.this.doScroll(i7);
                int height = WheelView.this.getHeight();
                if (WheelView.this.scrollingOffset > height) {
                    WheelView.this.scrollingOffset = height;
                    WheelView.this.scroller.stopScrolling();
                    return;
                }
                int i8 = -height;
                if (WheelView.this.scrollingOffset < i8) {
                    WheelView.this.scrollingOffset = i8;
                    WheelView.this.scroller.stopScrolling();
                }
            }

            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onStarted() {
                WheelView.this.isScrollingPerformed = true;
                WheelView.this.notifyScrollingListenersAboutStart();
            }
        };
        this.dataObserver = new DataSetObserver() { // from class: com.lljjcoder.style.citypickerview.widget.wheel.WheelView.2
            @Override // android.database.DataSetObserver
            public void onChanged() {
                WheelView.this.invalidateWheel(false);
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                WheelView.this.invalidateWheel(true);
            }
        };
        initData(context);
    }

    private boolean addViewItem(int i6, boolean z6) {
        View itemView = getItemView(i6);
        if (itemView == null) {
            return false;
        }
        if (z6) {
            this.itemsLayout.addView(itemView, 0);
            return true;
        }
        this.itemsLayout.addView(itemView);
        return true;
    }

    private void buildViewForMeasuring() {
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout != null) {
            this.recycle.recycleItems(linearLayout, this.firstItem, new ItemsRange());
        } else {
            createItemsLayout();
        }
        int i6 = this.visibleItems / 2;
        for (int i7 = this.currentItem + i6; i7 >= this.currentItem - i6; i7--) {
            if (addViewItem(i7, true)) {
                this.firstItem = i7;
            }
        }
    }

    private int calculateLayoutWidth(int i6, int i7) {
        initResourcesIfNecessary();
        this.itemsLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.itemsLayout.measure(View.MeasureSpec.makeMeasureSpec(i6, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.itemsLayout.getMeasuredWidth();
        if (i7 != 1073741824) {
            int iMax = Math.max(measuredWidth + 10, getSuggestedMinimumWidth());
            if (i7 != Integer.MIN_VALUE || i6 >= iMax) {
                i6 = iMax;
            }
        }
        this.itemsLayout.measure(View.MeasureSpec.makeMeasureSpec(i6 - 10, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(0, 0));
        return i6;
    }

    private void createItemsLayout() {
        if (this.itemsLayout == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.itemsLayout = linearLayout;
            linearLayout.setOrientation(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doScroll(int i6) {
        this.scrollingOffset += i6;
        int itemHeight = getItemHeight();
        int i7 = this.scrollingOffset / itemHeight;
        int i8 = this.currentItem - i7;
        int itemsCount = this.viewAdapter.getItemsCount();
        int i9 = this.scrollingOffset % itemHeight;
        if (Math.abs(i9) <= itemHeight / 2) {
            i9 = 0;
        }
        if (this.isCyclic && itemsCount > 0) {
            if (i9 > 0) {
                i8--;
                i7++;
            } else if (i9 < 0) {
                i8++;
                i7--;
            }
            while (i8 < 0) {
                i8 += itemsCount;
            }
            i8 %= itemsCount;
        } else if (i8 < 0) {
            i7 = this.currentItem;
            i8 = 0;
        } else if (i8 >= itemsCount) {
            i7 = (this.currentItem - itemsCount) + 1;
            i8 = itemsCount - 1;
        } else if (i8 > 0 && i9 > 0) {
            i8--;
            i7++;
        } else if (i8 < itemsCount - 1 && i9 < 0) {
            i8++;
            i7--;
        }
        int i10 = this.scrollingOffset;
        if (i8 != this.currentItem) {
            setCurrentItem(i8, false);
        } else {
            invalidate();
        }
        int i11 = i10 - (i7 * itemHeight);
        this.scrollingOffset = i11;
        if (i11 > getHeight()) {
            this.scrollingOffset = (this.scrollingOffset % getHeight()) + getHeight();
        }
    }

    private void drawCenterRect(Canvas canvas) {
        int height = getHeight() / 2;
        int itemHeight = (int) ((getItemHeight() / 2) * 1.2d);
        Paint paint = new Paint();
        if (getLineColorStr().startsWith("#")) {
            paint.setColor(Color.parseColor(getLineColorStr()));
        } else {
            paint.setColor(Color.parseColor("#" + getLineColorStr()));
        }
        if (getLineWidth() > 3) {
            paint.setStrokeWidth(getLineWidth());
        } else {
            paint.setStrokeWidth(3.0f);
        }
        float f6 = height - itemHeight;
        canvas.drawLine(0.0f, f6, getWidth(), f6, paint);
        float f7 = height + itemHeight;
        canvas.drawLine(0.0f, f7, getWidth(), f7, paint);
    }

    private void drawItems(Canvas canvas) {
        canvas.save();
        canvas.translate(5.0f, (-(((this.currentItem - this.firstItem) * getItemHeight()) + ((getItemHeight() - getHeight()) / 2))) + this.scrollingOffset);
        this.itemsLayout.draw(canvas);
        canvas.restore();
    }

    private int getDesiredHeight(LinearLayout linearLayout) {
        if (linearLayout != null && linearLayout.getChildAt(0) != null) {
            this.itemHeight = linearLayout.getChildAt(0).getMeasuredHeight();
        }
        return Math.max((this.itemHeight * this.visibleItems) - (0 / 50), getSuggestedMinimumHeight());
    }

    private int getItemHeight() {
        int i6 = this.itemHeight;
        if (i6 != 0) {
            return i6;
        }
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout == null || linearLayout.getChildAt(0) == null) {
            return getHeight() / this.visibleItems;
        }
        int height = this.itemsLayout.getChildAt(0).getHeight();
        this.itemHeight = height;
        return height;
    }

    private View getItemView(int i6) {
        WheelViewAdapter wheelViewAdapter = this.viewAdapter;
        if (wheelViewAdapter == null || wheelViewAdapter.getItemsCount() == 0) {
            return null;
        }
        int itemsCount = this.viewAdapter.getItemsCount();
        if (!isValidItemIndex(i6)) {
            return this.viewAdapter.getEmptyItem(this.recycle.getEmptyItem(), this.itemsLayout);
        }
        while (i6 < 0) {
            i6 += itemsCount;
        }
        return this.viewAdapter.getItem(i6 % itemsCount, this.recycle.getItem(), this.itemsLayout);
    }

    private ItemsRange getItemsRange() {
        if (getItemHeight() == 0) {
            return null;
        }
        int i6 = this.currentItem;
        int iAsin = 1;
        while (getItemHeight() * iAsin < getHeight()) {
            i6--;
            iAsin += 2;
        }
        int i7 = this.scrollingOffset;
        if (i7 != 0) {
            if (i7 > 0) {
                i6--;
            }
            int itemHeight = i7 / getItemHeight();
            i6 -= itemHeight;
            iAsin = (int) (iAsin + 1 + Math.asin(itemHeight));
        }
        return new ItemsRange(i6, iAsin);
    }

    private void initData(Context context) {
        this.scroller = new WheelScroller(getContext(), this.scrollingListener);
    }

    private void initResourcesIfNecessary() {
        if (this.centerDrawable == null) {
            this.centerDrawable = getContext().getResources().getDrawable(this.wheelForeground);
        }
        if (this.topShadow == null) {
            this.topShadow = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, this.SHADOWS_COLORS);
        }
        if (this.bottomShadow == null) {
            this.bottomShadow = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.SHADOWS_COLORS);
        }
        setBackgroundResource(this.wheelBackground);
    }

    private boolean isValidItemIndex(int i6) {
        WheelViewAdapter wheelViewAdapter = this.viewAdapter;
        if (wheelViewAdapter == null || wheelViewAdapter.getItemsCount() <= 0) {
            return false;
        }
        if (this.isCyclic) {
            return true;
        }
        return i6 >= 0 && i6 < this.viewAdapter.getItemsCount();
    }

    private void layout(int i6, int i7) {
        this.itemsLayout.layout(0, 0, i6 - 10, i7);
    }

    private boolean rebuildItems() {
        boolean z6;
        ItemsRange itemsRange = getItemsRange();
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout != null) {
            int iRecycleItems = this.recycle.recycleItems(linearLayout, this.firstItem, itemsRange);
            z6 = this.firstItem != iRecycleItems;
            this.firstItem = iRecycleItems;
        } else {
            createItemsLayout();
            z6 = true;
        }
        if (!z6) {
            z6 = (this.firstItem == itemsRange.getFirst() && this.itemsLayout.getChildCount() == itemsRange.getCount()) ? false : true;
        }
        if (this.firstItem <= itemsRange.getFirst() || this.firstItem > itemsRange.getLast()) {
            this.firstItem = itemsRange.getFirst();
        } else {
            for (int i6 = this.firstItem - 1; i6 >= itemsRange.getFirst() && addViewItem(i6, true); i6--) {
                this.firstItem = i6;
            }
        }
        int i7 = this.firstItem;
        for (int childCount = this.itemsLayout.getChildCount(); childCount < itemsRange.getCount(); childCount++) {
            if (!addViewItem(this.firstItem + childCount, false) && this.itemsLayout.getChildCount() == 0) {
                i7++;
            }
        }
        this.firstItem = i7;
        return z6;
    }

    private void updateView() {
        if (rebuildItems()) {
            calculateLayoutWidth(getWidth(), BasicMeasure.EXACTLY);
            layout(getWidth(), getHeight());
        }
    }

    public void addChangingListener(OnWheelChangedListener onWheelChangedListener) {
        this.changingListeners.add(onWheelChangedListener);
    }

    public void addClickingListener(OnWheelClickedListener onWheelClickedListener) {
        this.clickingListeners.add(onWheelClickedListener);
    }

    public void addScrollingListener(OnWheelScrollListener onWheelScrollListener) {
        this.scrollingListeners.add(onWheelScrollListener);
    }

    public boolean drawShadows() {
        return this.drawShadows;
    }

    public int getCurrentItem() {
        return this.currentItem;
    }

    public String getLineColorStr() {
        String str = this.lineColorStr;
        return str == null ? "" : str;
    }

    public int getLineWidth() {
        return this.lineWidth;
    }

    public WheelViewAdapter getViewAdapter() {
        return this.viewAdapter;
    }

    public int getVisibleItems() {
        return this.visibleItems;
    }

    public void invalidateWheel(boolean z6) {
        if (z6) {
            this.recycle.clearAll();
            LinearLayout linearLayout = this.itemsLayout;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            this.scrollingOffset = 0;
        } else {
            LinearLayout linearLayout2 = this.itemsLayout;
            if (linearLayout2 != null) {
                this.recycle.recycleItems(linearLayout2, this.firstItem, new ItemsRange());
            }
        }
        invalidate();
    }

    public boolean isCyclic() {
        return this.isCyclic;
    }

    public void notifyChangingListeners(int i6, int i7) {
        Iterator<OnWheelChangedListener> it = this.changingListeners.iterator();
        while (it.hasNext()) {
            it.next().onChanged(this, i6, i7);
        }
    }

    public void notifyClickListenersAboutClick(int i6) {
        Iterator<OnWheelClickedListener> it = this.clickingListeners.iterator();
        while (it.hasNext()) {
            it.next().onItemClicked(this, i6);
        }
    }

    public void notifyScrollingListenersAboutEnd() {
        Iterator<OnWheelScrollListener> it = this.scrollingListeners.iterator();
        while (it.hasNext()) {
            it.next().onScrollingFinished(this);
        }
    }

    public void notifyScrollingListenersAboutStart() {
        Iterator<OnWheelScrollListener> it = this.scrollingListeners.iterator();
        while (it.hasNext()) {
            it.next().onScrollingStarted(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        WheelViewAdapter wheelViewAdapter = this.viewAdapter;
        if (wheelViewAdapter != null && wheelViewAdapter.getItemsCount() > 0) {
            updateView();
            drawItems(canvas);
            drawCenterRect(canvas);
        }
        if (this.drawShadows) {
            drawShadows(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        layout(i8 - i6, i9 - i7);
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i6);
        int size2 = View.MeasureSpec.getSize(i7);
        buildViewForMeasuring();
        int iCalculateLayoutWidth = calculateLayoutWidth(size, mode);
        if (mode2 != 1073741824) {
            int desiredHeight = getDesiredHeight(this.itemsLayout);
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(desiredHeight, size2) : desiredHeight;
        }
        setMeasuredDimension(iCalculateLayoutWidth, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || getViewAdapter() == null) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2 && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (!this.isScrollingPerformed) {
            int y6 = ((int) motionEvent.getY()) - (getHeight() / 2);
            int itemHeight = (y6 > 0 ? y6 + (getItemHeight() / 2) : y6 - (getItemHeight() / 2)) / getItemHeight();
            if (itemHeight != 0 && isValidItemIndex(this.currentItem + itemHeight)) {
                notifyClickListenersAboutClick(this.currentItem + itemHeight);
            }
        }
        return this.scroller.onTouchEvent(motionEvent);
    }

    public void removeChangingListener(OnWheelChangedListener onWheelChangedListener) {
        this.changingListeners.remove(onWheelChangedListener);
    }

    public void removeClickingListener(OnWheelClickedListener onWheelClickedListener) {
        this.clickingListeners.remove(onWheelClickedListener);
    }

    public void removeScrollingListener(OnWheelScrollListener onWheelScrollListener) {
        this.scrollingListeners.remove(onWheelScrollListener);
    }

    public void scroll(int i6, int i7) {
        this.scroller.scroll((i6 * getItemHeight()) - this.scrollingOffset, i7);
    }

    public void setCurrentItem(int i6, boolean z6) {
        int iMin;
        WheelViewAdapter wheelViewAdapter = this.viewAdapter;
        if (wheelViewAdapter == null || wheelViewAdapter.getItemsCount() == 0) {
            return;
        }
        int itemsCount = this.viewAdapter.getItemsCount();
        if (i6 < 0 || i6 >= itemsCount) {
            if (!this.isCyclic) {
                return;
            }
            while (i6 < 0) {
                i6 += itemsCount;
            }
            i6 %= itemsCount;
        }
        int i7 = this.currentItem;
        if (i6 != i7) {
            if (!z6) {
                this.scrollingOffset = 0;
                this.currentItem = i6;
                notifyChangingListeners(i7, i6);
                invalidate();
                return;
            }
            int i8 = i6 - i7;
            if (this.isCyclic && (iMin = (itemsCount + Math.min(i6, i7)) - Math.max(i6, this.currentItem)) < Math.abs(i8)) {
                i8 = i8 < 0 ? iMin : -iMin;
            }
            scroll(i8, 0);
        }
    }

    public void setCyclic(boolean z6) {
        this.isCyclic = z6;
        invalidateWheel(false);
    }

    public void setDrawShadows(boolean z6) {
        this.drawShadows = z6;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.scroller.setInterpolator(interpolator);
    }

    public void setLineColorStr(String str) {
        this.lineColorStr = str;
    }

    public void setLineWidth(int i6) {
        this.lineWidth = i6;
    }

    public void setShadowColor(int i6, int i7, int i8) {
        this.SHADOWS_COLORS = new int[]{i6, i7, i8};
    }

    public void setViewAdapter(WheelViewAdapter wheelViewAdapter) {
        WheelViewAdapter wheelViewAdapter2 = this.viewAdapter;
        if (wheelViewAdapter2 != null) {
            wheelViewAdapter2.unregisterDataSetObserver(this.dataObserver);
        }
        this.viewAdapter = wheelViewAdapter;
        if (wheelViewAdapter != null) {
            wheelViewAdapter.registerDataSetObserver(this.dataObserver);
        }
        invalidateWheel(true);
    }

    public void setVisibleItems(int i6) {
        this.visibleItems = i6;
    }

    public void setWheelBackground(int i6) {
        this.wheelBackground = i6;
        setBackgroundResource(i6);
    }

    public void setWheelForeground(int i6) {
        this.wheelForeground = i6;
        this.centerDrawable = getContext().getResources().getDrawable(this.wheelForeground);
    }

    public void stopScrolling() {
        this.scroller.stopScrolling();
    }

    private void drawShadows(Canvas canvas) {
        int visibleItems = (getVisibleItems() == 2 ? 1 : getVisibleItems() / 2) * getItemHeight();
        this.topShadow.setBounds(0, 0, getWidth(), visibleItems);
        this.topShadow.draw(canvas);
        this.bottomShadow.setBounds(0, getHeight() - visibleItems, getWidth(), getHeight());
        this.bottomShadow.draw(canvas);
    }

    public void setCurrentItem(int i6) {
        setCurrentItem(i6, false);
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.SHADOWS_COLORS = new int[]{-268830215, -805701127, 1073347065};
        this.currentItem = 0;
        this.visibleItems = 5;
        this.itemHeight = 0;
        this.wheelBackground = C5752R.drawable.wheel_bg;
        this.wheelForeground = C5752R.drawable.wheel_val;
        this.drawShadows = true;
        this.isCyclic = false;
        this.recycle = new WheelRecycle(this);
        this.changingListeners = new LinkedList();
        this.scrollingListeners = new LinkedList();
        this.clickingListeners = new LinkedList();
        this.lineColorStr = "#C7C7C7";
        this.lineWidth = 3;
        this.scrollingListener = new WheelScroller.ScrollingListener() { // from class: com.lljjcoder.style.citypickerview.widget.wheel.WheelView.1
            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onFinished() {
                if (WheelView.this.isScrollingPerformed) {
                    WheelView.this.notifyScrollingListenersAboutEnd();
                    WheelView.this.isScrollingPerformed = false;
                }
                WheelView.this.scrollingOffset = 0;
                WheelView.this.invalidate();
            }

            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onJustify() {
                if (Math.abs(WheelView.this.scrollingOffset) > 1) {
                    WheelView.this.scroller.scroll(WheelView.this.scrollingOffset, 0);
                }
            }

            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onScroll(int i7) {
                WheelView.this.doScroll(i7);
                int height = WheelView.this.getHeight();
                if (WheelView.this.scrollingOffset > height) {
                    WheelView.this.scrollingOffset = height;
                    WheelView.this.scroller.stopScrolling();
                    return;
                }
                int i8 = -height;
                if (WheelView.this.scrollingOffset < i8) {
                    WheelView.this.scrollingOffset = i8;
                    WheelView.this.scroller.stopScrolling();
                }
            }

            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onStarted() {
                WheelView.this.isScrollingPerformed = true;
                WheelView.this.notifyScrollingListenersAboutStart();
            }
        };
        this.dataObserver = new DataSetObserver() { // from class: com.lljjcoder.style.citypickerview.widget.wheel.WheelView.2
            @Override // android.database.DataSetObserver
            public void onChanged() {
                WheelView.this.invalidateWheel(false);
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                WheelView.this.invalidateWheel(true);
            }
        };
        initData(context);
    }

    public WheelView(Context context) {
        super(context);
        this.SHADOWS_COLORS = new int[]{-268830215, -805701127, 1073347065};
        this.currentItem = 0;
        this.visibleItems = 5;
        this.itemHeight = 0;
        this.wheelBackground = C5752R.drawable.wheel_bg;
        this.wheelForeground = C5752R.drawable.wheel_val;
        this.drawShadows = true;
        this.isCyclic = false;
        this.recycle = new WheelRecycle(this);
        this.changingListeners = new LinkedList();
        this.scrollingListeners = new LinkedList();
        this.clickingListeners = new LinkedList();
        this.lineColorStr = "#C7C7C7";
        this.lineWidth = 3;
        this.scrollingListener = new WheelScroller.ScrollingListener() { // from class: com.lljjcoder.style.citypickerview.widget.wheel.WheelView.1
            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onFinished() {
                if (WheelView.this.isScrollingPerformed) {
                    WheelView.this.notifyScrollingListenersAboutEnd();
                    WheelView.this.isScrollingPerformed = false;
                }
                WheelView.this.scrollingOffset = 0;
                WheelView.this.invalidate();
            }

            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onJustify() {
                if (Math.abs(WheelView.this.scrollingOffset) > 1) {
                    WheelView.this.scroller.scroll(WheelView.this.scrollingOffset, 0);
                }
            }

            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onScroll(int i7) {
                WheelView.this.doScroll(i7);
                int height = WheelView.this.getHeight();
                if (WheelView.this.scrollingOffset > height) {
                    WheelView.this.scrollingOffset = height;
                    WheelView.this.scroller.stopScrolling();
                    return;
                }
                int i8 = -height;
                if (WheelView.this.scrollingOffset < i8) {
                    WheelView.this.scrollingOffset = i8;
                    WheelView.this.scroller.stopScrolling();
                }
            }

            @Override // com.lljjcoder.style.citypickerview.widget.wheel.WheelScroller.ScrollingListener
            public void onStarted() {
                WheelView.this.isScrollingPerformed = true;
                WheelView.this.notifyScrollingListenersAboutStart();
            }
        };
        this.dataObserver = new DataSetObserver() { // from class: com.lljjcoder.style.citypickerview.widget.wheel.WheelView.2
            @Override // android.database.DataSetObserver
            public void onChanged() {
                WheelView.this.invalidateWheel(false);
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                WheelView.this.invalidateWheel(true);
            }
        };
        initData(context);
    }
}
