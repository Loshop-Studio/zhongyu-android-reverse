package com.xuexiang.xui.adapter.simple;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class XUISimpleExpandableListAdapter extends BaseExpandableListAdapter {
    private List<ExpandableItem> mData;
    private int mPaddingStartPx;
    private int mArrowUpResId = C2042R.drawable.xui_ic_expand_arrow_up;
    private int mArrowDownResId = C2042R.drawable.xui_ic_expand_arrow_down;

    private static class ChildViewHolder {
        AppCompatImageView ivIcon;
        LinearLayout llContentView;
        TextView tvTitle;

        private ChildViewHolder() {
        }
    }

    private static class GroupViewHolder {
        AppCompatImageView ivIcon;
        AppCompatImageView ivIndicator;
        TextView tvTitle;

        private GroupViewHolder() {
        }
    }

    public XUISimpleExpandableListAdapter(List<ExpandableItem> list) {
        this.mData = list;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getChildId(int i4, int i5) {
        return i5;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getChildView(int i4, int i5, boolean z3, View view, ViewGroup viewGroup) {
        ChildViewHolder childViewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C2042R.layout.xui_layout_expand_child_item, viewGroup, false);
            childViewHolder = new ChildViewHolder();
            childViewHolder.llContentView = (LinearLayout) view.findViewById(C2042R.id.ll_content);
            childViewHolder.ivIcon = (AppCompatImageView) view.findViewById(C2042R.id.iv_icon);
            childViewHolder.tvTitle = (TextView) view.findViewById(C2042R.id.tv_child_name);
            if (this.mPaddingStartPx != 0) {
                int iResolveDimension = ThemeUtils.resolveDimension(viewGroup.getContext(), C2042R.attr.xui_config_content_spacing_vertical);
                childViewHolder.llContentView.setPaddingRelative(this.mPaddingStartPx, iResolveDimension, iResolveDimension, iResolveDimension);
                childViewHolder.llContentView.setGravity(16);
            } else {
                childViewHolder.llContentView.setGravity(17);
            }
            view.setTag(childViewHolder);
        } else {
            childViewHolder = (ChildViewHolder) view.getTag();
        }
        AdapterItem child = getChild(i4, i5);
        if (child != null) {
            childViewHolder.tvTitle.setText(child.getTitle());
            if (child.getIcon() != null) {
                childViewHolder.ivIcon.setVisibility(0);
                childViewHolder.ivIcon.setImageDrawable(child.getIcon());
            } else {
                childViewHolder.ivIcon.setVisibility(8);
            }
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getChildrenCount(int i4) {
        List<ExpandableItem> list = this.mData;
        if (list != null) {
            return list.get(i4).getChildSize();
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public int getGroupCount() {
        List<ExpandableItem> list = this.mData;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.ExpandableListAdapter
    public long getGroupId(int i4) {
        return i4;
    }

    @Override // android.widget.ExpandableListAdapter
    public View getGroupView(int i4, boolean z3, View view, ViewGroup viewGroup) {
        GroupViewHolder groupViewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C2042R.layout.xui_layout_expand_group_item, viewGroup, false);
            groupViewHolder = new GroupViewHolder();
            groupViewHolder.ivIcon = (AppCompatImageView) view.findViewById(C2042R.id.iv_icon);
            groupViewHolder.tvTitle = (TextView) view.findViewById(C2042R.id.tv_group_name);
            groupViewHolder.ivIndicator = (AppCompatImageView) view.findViewById(C2042R.id.iv_indicator);
            view.setTag(groupViewHolder);
        } else {
            groupViewHolder = (GroupViewHolder) view.getTag();
        }
        AdapterItem group = getGroup(i4).getGroup();
        if (group != null) {
            groupViewHolder.tvTitle.setText(group.getTitle());
            groupViewHolder.ivIndicator.setImageResource(z3 ? this.mArrowUpResId : this.mArrowDownResId);
            if (group.getIcon() != null) {
                groupViewHolder.ivIcon.setVisibility(0);
                groupViewHolder.ivIcon.setImageDrawable(group.getIcon());
            } else {
                groupViewHolder.ivIcon.setVisibility(8);
            }
        }
        return view;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ExpandableListAdapter
    public boolean isChildSelectable(int i4, int i5) {
        return true;
    }

    public XUISimpleExpandableListAdapter setArrowStyle(int i4, int i5) {
        this.mArrowDownResId = i4;
        this.mArrowUpResId = i5;
        return this;
    }

    @Deprecated
    public XUISimpleExpandableListAdapter setPaddingLeftDp(int i4) {
        this.mPaddingStartPx = DensityUtils.dp2px(i4);
        return this;
    }

    @Deprecated
    public XUISimpleExpandableListAdapter setPaddingLeftPx(int i4) {
        this.mPaddingStartPx = i4;
        return this;
    }

    public XUISimpleExpandableListAdapter setPaddingStartDp(int i4) {
        this.mPaddingStartPx = DensityUtils.dp2px(i4);
        return this;
    }

    public XUISimpleExpandableListAdapter setPaddingStartPx(int i4) {
        this.mPaddingStartPx = i4;
        return this;
    }

    @Override // android.widget.ExpandableListAdapter
    public AdapterItem getChild(int i4, int i5) {
        List<ExpandableItem> list = this.mData;
        if (list != null) {
            return list.get(i4).getChildItem(i5);
        }
        return null;
    }

    @Override // android.widget.ExpandableListAdapter
    public ExpandableItem getGroup(int i4) {
        List<ExpandableItem> list = this.mData;
        if (list != null) {
            return list.get(i4);
        }
        return null;
    }

    public XUISimpleExpandableListAdapter(ExpandableItem... expandableItemArr) {
        this.mData = new ArrayList(Arrays.asList(expandableItemArr));
    }
}
