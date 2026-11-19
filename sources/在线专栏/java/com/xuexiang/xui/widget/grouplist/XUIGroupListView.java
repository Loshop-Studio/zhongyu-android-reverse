package com.xuexiang.xui.widget.grouplist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.utils.ViewUtils;
import com.xuexiang.xui.widget.grouplist.XUICommonListItemView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class XUIGroupListView extends LinearLayout {
    public static final int SEPARATOR_STYLE_NONE = 1;
    public static final int SEPARATOR_STYLE_NORMAL = 0;
    private SparseArray<Section> mSections;
    private int mSeparatorStyle;

    public static class Section {
        private Context mContext;
        private XUIGroupListSectionHeaderFooterView mDescriptionView;
        private XUIGroupListSectionHeaderFooterView mTitleView;
        private boolean mUseDefaultTitleIfNone;
        private boolean mUseTitleViewForSectionSpace = true;
        private int mSeparatorDrawableForSingle = 0;
        private int mSeparatorDrawableForTop = 0;
        private int mSeparatorDrawableForBottom = 0;
        private int mSeparatorDrawableForMiddle = 0;
        private int mLeftIconWidth = -2;
        private int mLeftIconHeight = -2;
        private SparseArray<XUICommonListItemView> mItemViews = new SparseArray<>();

        public Section(Context context) {
            this.mContext = context;
        }

        public Section addItemView(XUICommonListItemView xUICommonListItemView, View.OnClickListener onClickListener) {
            return addItemView(xUICommonListItemView, onClickListener, null);
        }

        public void addTo(XUIGroupListView xUIGroupListView) {
            if (this.mTitleView == null) {
                if (this.mUseDefaultTitleIfNone) {
                    setTitle("Section " + xUIGroupListView.getSectionCount());
                } else if (this.mUseTitleViewForSectionSpace) {
                    setTitle("");
                }
            }
            View view = this.mTitleView;
            if (view != null) {
                xUIGroupListView.addView(view);
            }
            if (xUIGroupListView.getSeparatorStyle() == 0) {
                if (this.mSeparatorDrawableForSingle == 0) {
                    this.mSeparatorDrawableForSingle = C2042R.drawable.xui_list_item_bg_with_border_double_selector;
                }
                if (this.mSeparatorDrawableForTop == 0) {
                    this.mSeparatorDrawableForTop = C2042R.drawable.xui_list_item_bg_with_border_double_selector;
                }
                if (this.mSeparatorDrawableForBottom == 0) {
                    this.mSeparatorDrawableForBottom = C2042R.drawable.xui_list_item_bg_with_border_bottom_selector;
                }
                if (this.mSeparatorDrawableForMiddle == 0) {
                    this.mSeparatorDrawableForMiddle = C2042R.drawable.xui_list_item_bg_with_border_bottom_selector;
                }
            }
            int size = this.mItemViews.size();
            XUICommonListItemView.LayoutParamConfig layoutParamConfig = new XUICommonListItemView.LayoutParamConfig() { // from class: com.xuexiang.xui.widget.grouplist.XUIGroupListView.Section.2
                @Override // com.xuexiang.xui.widget.grouplist.XUICommonListItemView.LayoutParamConfig
                public RelativeLayout.LayoutParams onConfig(RelativeLayout.LayoutParams layoutParams) {
                    layoutParams.width = Section.this.mLeftIconWidth;
                    layoutParams.height = Section.this.mLeftIconHeight;
                    return layoutParams;
                }
            };
            int i4 = 0;
            while (i4 < size) {
                XUICommonListItemView xUICommonListItemView = this.mItemViews.get(i4);
                int i5 = xUIGroupListView.getSeparatorStyle() == 0 ? size == 1 ? this.mSeparatorDrawableForSingle : i4 == 0 ? this.mSeparatorDrawableForTop : i4 == size + (-1) ? this.mSeparatorDrawableForBottom : this.mSeparatorDrawableForMiddle : C2042R.drawable.xui_list_item_bg_with_border_none_selector;
                xUICommonListItemView.updateImageViewLp(layoutParamConfig);
                ViewUtils.setBackgroundKeepingPadding(xUICommonListItemView, i5);
                xUIGroupListView.addView(xUICommonListItemView);
                i4++;
            }
            View view2 = this.mDescriptionView;
            if (view2 != null) {
                xUIGroupListView.addView(view2);
            }
            xUIGroupListView.addSection(this);
        }

        public XUIGroupListSectionHeaderFooterView createSectionFooter(CharSequence charSequence) {
            return new XUIGroupListSectionHeaderFooterView(this.mContext, charSequence, true);
        }

        public XUIGroupListSectionHeaderFooterView createSectionHeader(CharSequence charSequence) {
            return new XUIGroupListSectionHeaderFooterView(this.mContext, charSequence);
        }

        public void removeFrom(XUIGroupListView xUIGroupListView) {
            XUIGroupListSectionHeaderFooterView xUIGroupListSectionHeaderFooterView = this.mTitleView;
            if (xUIGroupListSectionHeaderFooterView != null && xUIGroupListSectionHeaderFooterView.getParent() == xUIGroupListView) {
                xUIGroupListView.removeView(this.mTitleView);
            }
            for (int i4 = 0; i4 < this.mItemViews.size(); i4++) {
                xUIGroupListView.removeView(this.mItemViews.get(i4));
            }
            XUIGroupListSectionHeaderFooterView xUIGroupListSectionHeaderFooterView2 = this.mDescriptionView;
            if (xUIGroupListSectionHeaderFooterView2 != null && xUIGroupListSectionHeaderFooterView2.getParent() == xUIGroupListView) {
                xUIGroupListView.removeView(this.mDescriptionView);
            }
            xUIGroupListView.removeSection(this);
        }

        public Section setDescription(CharSequence charSequence) {
            this.mDescriptionView = createSectionFooter(charSequence);
            return this;
        }

        public Section setLeftIconSize(int i4, int i5) {
            this.mLeftIconHeight = i5;
            this.mLeftIconWidth = i4;
            return this;
        }

        public Section setSeparatorDrawableRes(int i4, int i5, int i6, int i7) {
            this.mSeparatorDrawableForSingle = i4;
            this.mSeparatorDrawableForTop = i5;
            this.mSeparatorDrawableForBottom = i6;
            this.mSeparatorDrawableForMiddle = i7;
            return this;
        }

        public Section setTitle(CharSequence charSequence) {
            this.mTitleView = createSectionHeader(charSequence);
            return this;
        }

        public Section setUseDefaultTitleIfNone(boolean z3) {
            this.mUseDefaultTitleIfNone = z3;
            return this;
        }

        public Section setUseTitleViewForSectionSpace(boolean z3) {
            this.mUseTitleViewForSectionSpace = z3;
            return this;
        }

        public Section addItemView(final XUICommonListItemView xUICommonListItemView, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
            if (xUICommonListItemView.getAccessoryType() == 2) {
                xUICommonListItemView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.grouplist.XUIGroupListView.Section.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        xUICommonListItemView.getSwitch().toggle();
                    }
                });
            } else if (onClickListener != null) {
                xUICommonListItemView.setOnClickListener(onClickListener);
            }
            if (onLongClickListener != null) {
                xUICommonListItemView.setOnLongClickListener(onLongClickListener);
            }
            SparseArray<XUICommonListItemView> sparseArray = this.mItemViews;
            sparseArray.append(sparseArray.size(), xUICommonListItemView);
            return this;
        }

        public Section setSeparatorDrawableRes(int i4) {
            this.mSeparatorDrawableForMiddle = i4;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SeparatorStyle {
    }

    public XUIGroupListView(Context context) {
        this(context, null, C2042R.attr.XUIGroupListViewStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSection(Section section) {
        SparseArray<Section> sparseArray = this.mSections;
        sparseArray.append(sparseArray.size(), section);
    }

    public static Section newSection(Context context) {
        return new Section(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSection(Section section) {
        for (int i4 = 0; i4 < this.mSections.size(); i4++) {
            if (this.mSections.valueAt(i4) == section) {
                this.mSections.remove(i4);
            }
        }
    }

    public XUICommonListItemView createItemView(Drawable drawable, CharSequence charSequence, String str, int i4, int i5, int i6) {
        XUICommonListItemView xUICommonListItemView = new XUICommonListItemView(getContext());
        xUICommonListItemView.setOrientation(i4);
        xUICommonListItemView.setLayoutParams(new LinearLayout.LayoutParams(-1, i6));
        xUICommonListItemView.setImageDrawable(drawable);
        xUICommonListItemView.setText(charSequence);
        xUICommonListItemView.setDetailText(str);
        xUICommonListItemView.setAccessoryType(i5);
        return xUICommonListItemView;
    }

    public Section getSection(int i4) {
        return this.mSections.get(i4);
    }

    public int getSectionCount() {
        return this.mSections.size();
    }

    public int getSeparatorStyle() {
        return this.mSeparatorStyle;
    }

    public void setSeparatorStyle(int i4) {
        this.mSeparatorStyle = i4;
    }

    public XUIGroupListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.XUIGroupListViewStyle);
    }

    public XUIGroupListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.XUIGroupListView, i4, 0);
        this.mSeparatorStyle = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.XUIGroupListView_xui_separatorStyle, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.mSections = new SparseArray<>();
        setOrientation(1);
    }

    public XUICommonListItemView createItemView(Drawable drawable, CharSequence charSequence, String str, int i4, int i5) {
        if (i4 == 0) {
            return createItemView(drawable, charSequence, str, i4, i5, ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_list_item_height_higher));
        }
        return createItemView(drawable, charSequence, str, i4, i5, ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_list_item_height));
    }

    public XUICommonListItemView createItemView(CharSequence charSequence) {
        return createItemView(null, charSequence, null, 1, 0);
    }

    public XUICommonListItemView createItemView(int i4) {
        return createItemView(null, null, null, i4, 0);
    }
}
