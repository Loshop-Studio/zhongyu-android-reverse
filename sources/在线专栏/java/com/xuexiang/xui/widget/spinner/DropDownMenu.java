package com.xuexiang.xui.widget.spinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class DropDownMenu extends LinearLayout {
    private FrameLayout mContainerView;
    private int mContentLayoutId;
    private View mContentView;
    private int mCurrentTabPosition;
    private int mDividerColor;
    private int mDividerMargin;
    private int mDividerWidth;
    private int mMaskColor;
    private View mMaskView;
    private float mMenuHeightPercent;
    private Drawable mMenuSelectedIcon;
    private int mMenuTextPaddingHorizontal;
    private int mMenuTextPaddingVertical;
    private int mMenuTextSelectedColor;
    private int mMenuTextSize;
    private int mMenuTextUnselectedColor;
    private Drawable mMenuUnselectedIcon;
    private FrameLayout mPopupMenuViews;
    private LinearLayout mTabMenuView;

    public DropDownMenu(Context context) {
        super(context, null);
        this.mCurrentTabPosition = -1;
        this.mMenuHeightPercent = 0.5f;
    }

    private void addTab(List<String> list, int i4) {
        final TextView textView = new TextView(getContext());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setTextSize(0, this.mMenuTextSize);
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        textView.setTextColor(this.mMenuTextUnselectedColor);
        setArrowIconEnd(textView, this.mMenuUnselectedIcon);
        textView.setText(list.get(i4));
        int i5 = this.mMenuTextPaddingHorizontal;
        int i6 = this.mMenuTextPaddingVertical;
        textView.setPadding(i5, i6, i5, i6);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.spinner.DropDownMenu.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DropDownMenu.this.switchMenu(textView);
            }
        });
        this.mTabMenuView.addView(textView);
        if (i4 < list.size() - 1) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.mDividerWidth, -1);
            int i7 = this.mDividerMargin;
            layoutParams.topMargin = i7;
            layoutParams.bottomMargin = i7;
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(this.mDividerColor);
            this.mTabMenuView.addView(view);
        }
    }

    private void setArrowIconEnd(TextView textView, Drawable drawable) {
        if (textView == null) {
            return;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchMenu(View view) {
        for (int i4 = 0; i4 < this.mTabMenuView.getChildCount(); i4 += 2) {
            if (view == this.mTabMenuView.getChildAt(i4)) {
                int i5 = this.mCurrentTabPosition;
                if (i5 == i4) {
                    closeMenu();
                } else {
                    if (i5 == -1) {
                        this.mPopupMenuViews.setVisibility(0);
                        this.mPopupMenuViews.setAnimation(AnimationUtils.loadAnimation(getContext(), C2042R.anim.ddm_menu_in));
                        this.mMaskView.setVisibility(0);
                        this.mMaskView.setAnimation(AnimationUtils.loadAnimation(getContext(), C2042R.anim.ddm_mask_in));
                        this.mPopupMenuViews.getChildAt(i4 / 2).setVisibility(0);
                    } else {
                        this.mPopupMenuViews.getChildAt(i4 / 2).setVisibility(0);
                    }
                    this.mCurrentTabPosition = i4;
                    ((TextView) this.mTabMenuView.getChildAt(i4)).setTextColor(this.mMenuTextSelectedColor);
                    setArrowIconEnd((TextView) this.mTabMenuView.getChildAt(i4), this.mMenuSelectedIcon);
                }
            } else {
                ((TextView) this.mTabMenuView.getChildAt(i4)).setTextColor(this.mMenuTextUnselectedColor);
                setArrowIconEnd((TextView) this.mTabMenuView.getChildAt(i4), this.mMenuUnselectedIcon);
                this.mPopupMenuViews.getChildAt(i4 / 2).setVisibility(8);
            }
        }
    }

    public void closeMenu() {
        int i4 = this.mCurrentTabPosition;
        if (i4 != -1) {
            ((TextView) this.mTabMenuView.getChildAt(i4)).setTextColor(this.mMenuTextUnselectedColor);
            setArrowIconEnd((TextView) this.mTabMenuView.getChildAt(this.mCurrentTabPosition), this.mMenuUnselectedIcon);
            this.mPopupMenuViews.setVisibility(8);
            this.mPopupMenuViews.setAnimation(AnimationUtils.loadAnimation(getContext(), C2042R.anim.ddm_menu_out));
            this.mMaskView.setVisibility(8);
            this.mMaskView.setAnimation(AnimationUtils.loadAnimation(getContext(), C2042R.anim.ddm_mask_out));
            this.mCurrentTabPosition = -1;
        }
    }

    public View getContentView() {
        return this.mContentView;
    }

    public boolean isShowing() {
        return this.mCurrentTabPosition != -1;
    }

    public void setDropDownMenu(String[] strArr, List<View> list) {
        setDropDownMenu(Arrays.asList(strArr), list);
    }

    public void setTabMenuClickable(boolean z3) {
        for (int i4 = 0; i4 < this.mTabMenuView.getChildCount(); i4 += 2) {
            this.mTabMenuView.getChildAt(i4).setClickable(z3);
        }
    }

    public void setTabMenuText(String str) {
        int i4 = this.mCurrentTabPosition;
        if (i4 != -1) {
            ((TextView) this.mTabMenuView.getChildAt(i4)).setText(str);
        }
    }

    public void setDropDownMenu(List<String> list, List<View> list2) {
        if (this.mContentLayoutId == -1) {
            throw new IllegalArgumentException("mContentLayoutId == -1, You need to set properties app:ddm_contentLayoutId");
        }
        setDropDownMenu(list, list2, View.inflate(getContext(), this.mContentLayoutId, null));
    }

    public DropDownMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.DropDownMenuStyle);
    }

    public DropDownMenu(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mCurrentTabPosition = -1;
        this.mMenuHeightPercent = 0.5f;
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.DropDownMenu);
        this.mContentLayoutId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.DropDownMenu_ddm_contentLayoutId, -1);
        this.mDividerColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.DropDownMenu_ddm_dividerColor, ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_separator_dark));
        this.mDividerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.DropDownMenu_ddm_dividerWidth, ResUtils.getDimensionPixelSize(C2042R.dimen.default_ddm_divider_width));
        this.mDividerMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.DropDownMenu_ddm_dividerMargin, ResUtils.getDimensionPixelSize(C2042R.dimen.default_ddm_divider_margin));
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.DropDownMenu_ddm_underlineColor, ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_separator_light));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.DropDownMenu_ddm_underlineHeight, ResUtils.getDimensionPixelSize(C2042R.dimen.default_ddm_underline_height));
        int color2 = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.DropDownMenu_ddm_menuBackgroundColor, -1);
        this.mMaskColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.DropDownMenu_ddm_maskColor, ResUtils.getColor(C2042R.color.default_ddm_mask_color));
        this.mMenuTextSelectedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.DropDownMenu_ddm_menuTextSelectedColor, ThemeUtils.getMainThemeColor(getContext()));
        this.mMenuTextUnselectedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.DropDownMenu_ddm_menuTextUnselectedColor, ThemeUtils.resolveColor(getContext(), C2042R.attr.xui_config_color_content_text));
        this.mMenuTextPaddingHorizontal = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.DropDownMenu_ddm_menuTextPaddingHorizontal, ResUtils.getDimensionPixelSize(C2042R.dimen.default_ddm_menu_text_padding_horizontal));
        this.mMenuTextPaddingVertical = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.DropDownMenu_ddm_menuTextPaddingVertical, ResUtils.getDimensionPixelSize(C2042R.dimen.default_ddm_menu_text_padding_vertical));
        this.mMenuTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.DropDownMenu_ddm_menuTextSize, ResUtils.getDimensionPixelSize(C2042R.dimen.default_ddm_menu_text_size));
        Drawable drawableAttrRes = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.DropDownMenu_ddm_menuUnselectedIcon);
        this.mMenuUnselectedIcon = drawableAttrRes;
        if (drawableAttrRes == null) {
            this.mMenuUnselectedIcon = ResUtils.getVectorDrawable(getContext(), C2042R.drawable.ddm_ic_arrow_down);
        }
        Drawable drawableAttrRes2 = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.DropDownMenu_ddm_menuSelectedIcon);
        this.mMenuSelectedIcon = drawableAttrRes2;
        if (drawableAttrRes2 == null) {
            this.mMenuSelectedIcon = ResUtils.getVectorDrawable(getContext(), C2042R.drawable.ddm_ic_arrow_up);
        }
        this.mMenuHeightPercent = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.DropDownMenu_ddm_menuHeightPercent, this.mMenuHeightPercent);
        typedArrayObtainStyledAttributes.recycle();
        this.mTabMenuView = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mTabMenuView.setOrientation(0);
        this.mTabMenuView.setBackgroundColor(color2);
        this.mTabMenuView.setLayoutParams(layoutParams);
        addView(this.mTabMenuView, 0);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, dimensionPixelSize));
        view.setBackgroundColor(color);
        addView(view, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.mContainerView = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.mContainerView, 2);
    }

    public void setDropDownMenu(String[] strArr, List<View> list, View view) {
        setDropDownMenu(Arrays.asList(strArr), list, view);
    }

    public void setDropDownMenu(List<String> list, List<View> list2, View view) {
        if (list.size() == list2.size()) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                addTab(list, i4);
            }
            this.mContentView = view;
            this.mContainerView.addView(view, 0);
            View view2 = new View(getContext());
            this.mMaskView = view2;
            view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.mMaskView.setBackgroundColor(this.mMaskColor);
            this.mMaskView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.spinner.DropDownMenu.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    DropDownMenu.this.closeMenu();
                }
            });
            this.mContainerView.addView(this.mMaskView, 1);
            this.mMaskView.setVisibility(8);
            if (this.mContainerView.getChildAt(2) != null) {
                this.mContainerView.removeViewAt(2);
            }
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.mPopupMenuViews = frameLayout;
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) (DensityUtils.getDisplayHeight(getContext(), true) * this.mMenuHeightPercent)));
            this.mPopupMenuViews.setVisibility(8);
            this.mContainerView.addView(this.mPopupMenuViews, 2);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                list2.get(i5).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                this.mPopupMenuViews.addView(list2.get(i5), i5);
            }
            return;
        }
        throw new IllegalArgumentException("params not match, tabTexts.size() should be equal popupViews.size()");
    }
}
