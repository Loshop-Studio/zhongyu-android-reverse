package com.xuexiang.xui.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FlowTagLayout extends ViewGroup {
    public static final int FLOW_TAG_CHECKED_MULTI = 2;
    public static final int FLOW_TAG_CHECKED_NONE = 0;
    public static final int FLOW_TAG_CHECKED_SINGLE = 1;
    public static final int FLOW_TAG_DISPLAY = 3;
    BaseTagAdapter mAdapter;
    private SparseBooleanArray mCheckedTagArray;
    AdapterDataSetObserver mDataSetObserver;
    OnTagClickListener mOnTagClickListener;
    OnTagSelectListener mOnTagSelectListener;
    private boolean mSingleCancelable;
    private int mTagCheckMode;
    private int mWidth;

    class AdapterDataSetObserver extends DataSetObserver {
        AdapterDataSetObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            FlowTagLayout.this.reloadData();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
        }
    }

    public interface OnInitSelectedPosition {
        boolean isSelectedPosition(int i4);
    }

    public interface OnTagClickListener {
        void onItemClick(FlowTagLayout flowTagLayout, View view, int i4);
    }

    public interface OnTagSelectListener {
        void onItemSelect(FlowTagLayout flowTagLayout, int i4, List<Integer> list);
    }

    public FlowTagLayout(Context context) {
        super(context);
        this.mTagCheckMode = 0;
        this.mCheckedTagArray = new SparseBooleanArray();
    }

    private <T> List<Integer> getSelectedPositions(List<T> list, List<T> list2) {
        ArrayList arrayList = new ArrayList();
        if (!isListEmpty(list) && !isListEmpty(list2)) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                int i5 = 0;
                while (true) {
                    if (i5 >= list2.size()) {
                        break;
                    }
                    if (list2.get(i5).equals(list.get(i4))) {
                        arrayList.add(Integer.valueOf(i5));
                        break;
                    }
                    i5++;
                }
            }
        }
        return arrayList;
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.FlowTagLayout);
        this.mTagCheckMode = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.FlowTagLayout_ftl_check_mode, 0);
        this.mSingleCancelable = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.FlowTagLayout_ftl_single_cancelable, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.FlowTagLayout_ftl_entries, 0);
        if (resourceId != 0) {
            BaseTagAdapter items = setItems(ResUtils.getStringArray(resourceId));
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.FlowTagLayout_ftl_selecteds, 0);
            if (resourceId2 != 0) {
                items.setSelectedPositions(ResUtils.getIntArray(resourceId2));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private <T> boolean isListEmpty(List<T> list) {
        return list == null || list.isEmpty();
    }

    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadData() {
        removeAllViews();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int i4 = this.mWidth;
        if (i4 != 0) {
            marginLayoutParams.width = i4;
        }
        boolean z3 = false;
        for (int i5 = 0; i5 < this.mAdapter.getCount(); i5++) {
            this.mCheckedTagArray.put(i5, false);
            View view = this.mAdapter.getView(i5, null, this);
            addView(view, marginLayoutParams);
            BaseTagAdapter baseTagAdapter = this.mAdapter;
            if (baseTagAdapter instanceof OnInitSelectedPosition) {
                boolean zIsSelectedPosition = baseTagAdapter.isSelectedPosition(i5);
                int i6 = this.mTagCheckMode;
                if (i6 == 1) {
                    if (zIsSelectedPosition && !z3) {
                        this.mCheckedTagArray.put(i5, true);
                        view.setSelected(true);
                        z3 = true;
                    }
                } else if (i6 == 2) {
                    if (zIsSelectedPosition) {
                        this.mCheckedTagArray.put(i5, true);
                        view.setSelected(true);
                    }
                } else if (i6 == 3) {
                    this.mCheckedTagArray.put(i5, true);
                    view.setSelected(true);
                    view.setEnabled(false);
                }
            }
            setSelectedIndexs(null);
            setChildViewClickListener(i5, view);
        }
    }

    private void setChildViewClickListener(final int i4, final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.flowlayout.FlowTagLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (FlowTagLayout.this.mTagCheckMode == 0) {
                    FlowTagLayout flowTagLayout = FlowTagLayout.this;
                    OnTagClickListener onTagClickListener = flowTagLayout.mOnTagClickListener;
                    if (onTagClickListener != null) {
                        onTagClickListener.onItemClick(flowTagLayout, view, i4);
                        return;
                    }
                    return;
                }
                if (FlowTagLayout.this.mTagCheckMode != 1) {
                    if (FlowTagLayout.this.mTagCheckMode == 2) {
                        if (FlowTagLayout.this.mCheckedTagArray.get(i4)) {
                            FlowTagLayout.this.mCheckedTagArray.put(i4, false);
                            view.setSelected(false);
                        } else {
                            FlowTagLayout.this.mCheckedTagArray.put(i4, true);
                            view.setSelected(true);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i5 = 0; i5 < FlowTagLayout.this.mAdapter.getCount(); i5++) {
                            if (FlowTagLayout.this.mCheckedTagArray.get(i5)) {
                                arrayList.add(Integer.valueOf(i5));
                            }
                        }
                        FlowTagLayout.this.setSelectedIndexs(arrayList);
                        FlowTagLayout flowTagLayout2 = FlowTagLayout.this;
                        OnTagSelectListener onTagSelectListener = flowTagLayout2.mOnTagSelectListener;
                        if (onTagSelectListener != null) {
                            onTagSelectListener.onItemSelect(flowTagLayout2, i4, arrayList);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (FlowTagLayout.this.mCheckedTagArray.get(i4)) {
                    if (FlowTagLayout.this.mSingleCancelable) {
                        FlowTagLayout.this.mCheckedTagArray.put(i4, false);
                        view.setSelected(false);
                        FlowTagLayout.this.setSelectedIndexs(new ArrayList());
                        FlowTagLayout flowTagLayout3 = FlowTagLayout.this;
                        OnTagSelectListener onTagSelectListener2 = flowTagLayout3.mOnTagSelectListener;
                        if (onTagSelectListener2 != null) {
                            onTagSelectListener2.onItemSelect(flowTagLayout3, i4, new ArrayList());
                            return;
                        }
                        return;
                    }
                    return;
                }
                for (int i6 = 0; i6 < FlowTagLayout.this.mAdapter.getCount(); i6++) {
                    FlowTagLayout.this.mCheckedTagArray.put(i6, false);
                    FlowTagLayout.this.getChildAt(i6).setSelected(false);
                }
                FlowTagLayout.this.mCheckedTagArray.put(i4, true);
                view.setSelected(true);
                FlowTagLayout.this.setSelectedIndexs(Collections.singletonList(Integer.valueOf(i4)));
                FlowTagLayout flowTagLayout4 = FlowTagLayout.this;
                OnTagSelectListener onTagSelectListener3 = flowTagLayout4.mOnTagSelectListener;
                if (onTagSelectListener3 != null) {
                    int i7 = i4;
                    onTagSelectListener3.onItemSelect(flowTagLayout4, i7, Collections.singletonList(Integer.valueOf(i7)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FlowTagLayout setSelectedIndexs(List<Integer> list) {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.setSelectedIndexs(list);
        }
        return this;
    }

    public <T> FlowTagLayout addTag(T t3) {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.addTag(t3);
        }
        return this;
    }

    public <T> FlowTagLayout addTags(List<T> list) {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.addTags(list);
        }
        return this;
    }

    public <T> FlowTagLayout clearAndAddTags(List<T> list) {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.clearAndAddTags(list);
        }
        return this;
    }

    public FlowTagLayout clearSelection() {
        BaseTagAdapter baseTagAdapter;
        if (this.mTagCheckMode != 0 && (baseTagAdapter = this.mAdapter) != null) {
            baseTagAdapter.clearSelection();
        }
        return this;
    }

    public FlowTagLayout clearTags() {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.clearData();
        }
        return this;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public BaseTagAdapter getAdapter() {
        return this.mAdapter;
    }

    @Deprecated
    public int getSelectedIndex() {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            return baseTagAdapter.getSelectedIndex();
        }
        return -1;
    }

    @Deprecated
    public List<Integer> getSelectedIndexs() {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            return baseTagAdapter.getSelectedIndexs();
        }
        return null;
    }

    @Deprecated
    public <T> T getSelectedItem() {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            return (T) baseTagAdapter.getSelectedItem();
        }
        return null;
    }

    public int getTagCheckMode() {
        return this.mTagCheckMode;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int width = getWidth();
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int i9 = marginLayoutParams.leftMargin + measuredWidth + marginLayoutParams.rightMargin;
                int i10 = marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
                if (paddingStart + i9 > (width - getPaddingLeft()) - getPaddingRight()) {
                    paddingTop += i10;
                    paddingStart = getPaddingStart();
                }
                if (isRtl()) {
                    int marginStart = width - (marginLayoutParams.getMarginStart() + paddingStart);
                    int i11 = marginLayoutParams.topMargin + paddingTop;
                    childAt.layout(marginStart - measuredWidth, i11, marginStart, measuredHeight + i11);
                } else {
                    int marginStart2 = marginLayoutParams.getMarginStart() + paddingStart;
                    int i12 = marginLayoutParams.topMargin + paddingTop;
                    childAt.layout(marginStart2, i12, measuredWidth + marginStart2, measuredHeight + i12);
                }
                paddingStart += i9;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i8 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            measureChild(childAt, i4, i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i9 = size2;
            int i10 = measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i11 = measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i12 = i7 + i10;
            if (i12 > (size - getPaddingLeft()) - getPaddingRight()) {
                iMax = Math.max(i7, i10);
                i8 += i11;
                i7 = i10;
                iMax2 = i11;
            } else {
                iMax2 = Math.max(iMax2, i11);
                i7 = i12;
            }
            if (i6 == childCount - 1) {
                i8 += iMax2;
                iMax = Math.max(i7, iMax);
            }
            i6++;
            size2 = i9;
        }
        int i13 = size2;
        if (mode != 1073741824) {
            size = iMax;
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i13 : i8);
    }

    public FlowTagLayout setAdapter(BaseTagAdapter baseTagAdapter) {
        AdapterDataSetObserver adapterDataSetObserver;
        BaseTagAdapter baseTagAdapter2 = this.mAdapter;
        if (baseTagAdapter2 != null && (adapterDataSetObserver = this.mDataSetObserver) != null) {
            baseTagAdapter2.unregisterDataSetObserver(adapterDataSetObserver);
        }
        removeAllViews();
        this.mAdapter = baseTagAdapter;
        if (baseTagAdapter != null) {
            AdapterDataSetObserver adapterDataSetObserver2 = new AdapterDataSetObserver();
            this.mDataSetObserver = adapterDataSetObserver2;
            this.mAdapter.registerDataSetObserver(adapterDataSetObserver2);
        }
        return this;
    }

    public FlowTagLayout setChildWidth(int i4) {
        this.mWidth = i4;
        return this;
    }

    @SafeVarargs
    public final <T> BaseTagAdapter setItems(T... tArr) {
        return setItems(Arrays.asList(tArr));
    }

    public FlowTagLayout setOnTagClickListener(OnTagClickListener onTagClickListener) {
        this.mOnTagClickListener = onTagClickListener;
        return this;
    }

    public FlowTagLayout setOnTagSelectListener(OnTagSelectListener onTagSelectListener) {
        this.mOnTagSelectListener = onTagSelectListener;
        return this;
    }

    @SafeVarargs
    public final <T> FlowTagLayout setSelectedItems(T... tArr) {
        setSelectedItems(Arrays.asList(tArr));
        return this;
    }

    public FlowTagLayout setSelectedPositions(Integer... numArr) {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.setSelectedPositions(numArr);
        }
        return this;
    }

    public FlowTagLayout setSingleCancelable(boolean z3) {
        this.mSingleCancelable = z3;
        return this;
    }

    public FlowTagLayout setTagCheckedMode(int i4) {
        this.mTagCheckMode = i4;
        return this;
    }

    public <T> BaseTagAdapter setItems(List<T> list) {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.clearAndAddTags(list);
        } else {
            DefaultFlowTagAdapter defaultFlowTagAdapter = new DefaultFlowTagAdapter(getContext());
            setAdapter(defaultFlowTagAdapter);
            defaultFlowTagAdapter.addTags(list);
        }
        return this.mAdapter;
    }

    public <T> FlowTagLayout setSelectedItems(List<T> list) {
        BaseTagAdapter baseTagAdapter;
        if (this.mTagCheckMode != 0 && (baseTagAdapter = this.mAdapter) != null) {
            baseTagAdapter.setSelectedPositions(getSelectedPositions(list, baseTagAdapter.getItems()));
        }
        return this;
    }

    public <T> FlowTagLayout addTags(T[] tArr) {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.addTags(tArr);
        }
        return this;
    }

    public FlowTagLayout setSelectedPositions(List<Integer> list) {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.setSelectedPositions(list);
        }
        return this;
    }

    public FlowTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTagCheckMode = 0;
        this.mCheckedTagArray = new SparseBooleanArray();
        initAttrs(context, attributeSet);
    }

    public FlowTagLayout setSelectedPositions(int[] iArr) {
        BaseTagAdapter baseTagAdapter = this.mAdapter;
        if (baseTagAdapter != null) {
            baseTagAdapter.setSelectedPositions(iArr);
        }
        return this;
    }

    public FlowTagLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mTagCheckMode = 0;
        this.mCheckedTagArray = new SparseBooleanArray();
        initAttrs(context, attributeSet);
    }
}
