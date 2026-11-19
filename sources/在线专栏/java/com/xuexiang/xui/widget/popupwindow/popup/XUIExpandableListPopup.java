package com.xuexiang.xui.widget.popupwindow.popup;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.XUIWrapContentExpandableListView;
import com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup;

/* loaded from: classes.dex */
public class XUIExpandableListPopup<T extends XUIExpandableListPopup> extends XUIPopup {
    protected ExpandableListAdapter mAdapter;
    protected ExpandableListView mExpandableListView;
    private boolean mHasDivider;

    public XUIExpandableListPopup(Context context) {
        super(context);
    }

    private void updateDivider(ExpandableListView expandableListView) {
        if (!this.mHasDivider) {
            expandableListView.setDivider(null);
            expandableListView.setChildDivider(null);
            return;
        }
        Context context = getContext();
        int i4 = C2042R.attr.xui_config_color_separator_light;
        expandableListView.setDivider(new ColorDrawable(ThemeUtils.resolveColor(context, i4)));
        expandableListView.setChildDivider(new ColorDrawable(ThemeUtils.resolveColor(getContext(), i4)));
        expandableListView.setDividerHeight(DensityUtils.dp2px(getContext(), XUI.isTablet() ? 1.0f : 0.5f));
    }

    public void clearExpandStatus() {
        collapseAllGroup();
    }

    public void collapseAllGroup() {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            int groupCount = expandableListView.getExpandableListAdapter().getGroupCount();
            for (int i4 = 0; i4 < groupCount; i4++) {
                if (this.mExpandableListView.isGroupExpanded(i4)) {
                    this.mExpandableListView.collapseGroup(i4);
                }
            }
        }
    }

    public T create(int i4, int i5, ExpandableListView.OnChildClickListener onChildClickListener) {
        create(i4, i5);
        this.mExpandableListView.setOnChildClickListener(onChildClickListener);
        return this;
    }

    public void expandAllGroup() {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            int groupCount = expandableListView.getExpandableListAdapter().getGroupCount();
            for (int i4 = 0; i4 < groupCount; i4++) {
                if (!this.mExpandableListView.isGroupExpanded(i4)) {
                    this.mExpandableListView.expandGroup(i4);
                }
            }
        }
    }

    public boolean expandOnlyOne(int i4) {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView == null) {
            return false;
        }
        int groupCount = expandableListView.getExpandableListAdapter().getGroupCount();
        boolean zCollapseGroup = true;
        for (int i5 = 0; i5 < groupCount; i5++) {
            if (i5 != i4 && this.mExpandableListView.isGroupExpanded(i5)) {
                zCollapseGroup &= this.mExpandableListView.collapseGroup(i5);
            }
        }
        return zCollapseGroup;
    }

    public ExpandableListAdapter getAdapter() {
        return this.mAdapter;
    }

    public ExpandableListView getExpandableListView() {
        return this.mExpandableListView;
    }

    public T setChildDivider(Drawable drawable) {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            expandableListView.setChildDivider(drawable);
        }
        return this;
    }

    public T setDividerHeight(int i4) {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            expandableListView.setDividerHeight(i4);
        }
        return this;
    }

    public T setEnableOnlyExpandOne(boolean z3) {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            if (z3) {
                expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() { // from class: com.xuexiang.xui.widget.popupwindow.popup.XUIExpandableListPopup.1
                    @Override // android.widget.ExpandableListView.OnGroupExpandListener
                    public void onGroupExpand(int i4) {
                        XUIExpandableListPopup.this.expandOnlyOne(i4);
                    }
                });
            } else {
                expandableListView.setOnGroupExpandListener(null);
            }
        }
        return this;
    }

    public T setGroupDivider(Drawable drawable) {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            expandableListView.setDivider(drawable);
        }
        return this;
    }

    public T setHasDivider(boolean z3) {
        this.mHasDivider = z3;
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            updateDivider(expandableListView);
        }
        return this;
    }

    public T setOnChildClickListener(ExpandableListView.OnChildClickListener onChildClickListener) {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            expandableListView.setOnChildClickListener(onChildClickListener);
        }
        return this;
    }

    public T setOnGroupClickListener(ExpandableListView.OnGroupClickListener onGroupClickListener) {
        ExpandableListView expandableListView = this.mExpandableListView;
        if (expandableListView != null) {
            expandableListView.setOnGroupClickListener(onGroupClickListener);
        }
        return this;
    }

    public XUIExpandableListPopup(Context context, int i4, ExpandableListAdapter expandableListAdapter) {
        super(context, i4);
        this.mAdapter = expandableListAdapter;
    }

    public T create(int i4) {
        return (T) create(i4, 0);
    }

    public XUIExpandableListPopup(Context context, ExpandableListAdapter expandableListAdapter) {
        super(context);
        this.mAdapter = expandableListAdapter;
    }

    protected T create(int i4, int i5) {
        int iDp2px = DensityUtils.dp2px(getContext(), 5.0f);
        if (i5 != 0) {
            this.mExpandableListView = new XUIWrapContentExpandableListView(getContext(), i5);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.setMargins(0, iDp2px, 0, iDp2px);
            this.mExpandableListView.setLayoutParams(layoutParams);
        } else {
            this.mExpandableListView = new XUIWrapContentExpandableListView(getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, -2);
            layoutParams2.setMargins(0, iDp2px, 0, iDp2px);
            this.mExpandableListView.setLayoutParams(layoutParams2);
        }
        this.mExpandableListView.setPadding(iDp2px, 0, iDp2px, 0);
        this.mExpandableListView.setAdapter(this.mAdapter);
        this.mExpandableListView.setGroupIndicator(null);
        this.mExpandableListView.setVerticalScrollBarEnabled(false);
        this.mExpandableListView.setOverScrollMode(2);
        updateDivider(this.mExpandableListView);
        setContentView(this.mExpandableListView);
        return this;
    }
}
