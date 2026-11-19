package com.lljjcoder.style.citypickerview.widget.wheel;

import android.view.View;
import android.widget.LinearLayout;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class WheelRecycle {
    private List<View> emptyItems;
    private List<View> items;
    private WheelView wheel;

    public WheelRecycle(WheelView wheelView) {
        this.wheel = wheelView;
    }

    private List<View> addView(View view, List<View> list) {
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(view);
        return list;
    }

    private View getCachedView(List<View> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        View view = list.get(0);
        list.remove(0);
        return view;
    }

    private void recycleView(View view, int i6) {
        int itemsCount = this.wheel.getViewAdapter().getItemsCount();
        if ((i6 < 0 || i6 >= itemsCount) && !this.wheel.isCyclic()) {
            this.emptyItems = addView(view, this.emptyItems);
            return;
        }
        while (i6 < 0) {
            i6 += itemsCount;
        }
        int i7 = i6 % itemsCount;
        this.items = addView(view, this.items);
    }

    public void clearAll() {
        List<View> list = this.items;
        if (list != null) {
            list.clear();
        }
        List<View> list2 = this.emptyItems;
        if (list2 != null) {
            list2.clear();
        }
    }

    public View getEmptyItem() {
        return getCachedView(this.emptyItems);
    }

    public View getItem() {
        return getCachedView(this.items);
    }

    public int recycleItems(LinearLayout linearLayout, int i6, ItemsRange itemsRange) {
        int i7 = 0;
        int i8 = i6;
        while (i7 < linearLayout.getChildCount()) {
            if (itemsRange.contains(i8)) {
                i7++;
            } else {
                recycleView(linearLayout.getChildAt(i7), i8);
                linearLayout.removeViewAt(i7);
                if (i7 == 0) {
                    i6++;
                }
            }
            i8++;
        }
        return i6;
    }
}
