package com.xuexiang.xui.widget.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.alpha.XUIAlphaImageView;
import com.xuexiang.xui.widget.alpha.XUIAlphaLinearLayout;
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import com.xuexiang.xui.widget.textview.AutoMoveTextView;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class TitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {
    public static final int CENTER_CENTER = 0;
    public static final int CENTER_LEFT = 1;
    public static final int CENTER_RIGHT = 2;
    private static final String STATUS_BAR_HEIGHT_RES_NAME = "status_bar_height";
    private int mActionPadding;
    private int mActionTextColor;
    private int mActionTextSize;
    private int mBarHeight;
    private int mCenterGravity;
    private XUIAlphaLinearLayout mCenterLayout;
    private TextView mCenterText;
    private View mCustomCenterView;
    private int mDivideHeight;
    private int mDividerColor;
    private View mDividerView;
    private boolean mImmersive;
    private boolean mIsUseThemeColor;
    private Drawable mLeftImageResource;
    private XUIAlphaTextView mLeftText;
    private String mLeftTextString;
    private LinearLayout mRightLayout;
    private int mScreenWidth;
    private int mSideTextColor;
    private int mSideTextPadding;
    private int mSideTextSize;
    private int mStatusBarHeight;
    private String mSubTextString;
    private TextView mSubTitleText;
    private int mSubTitleTextColor;
    private int mSubTitleTextSize;
    private int mTitleTextColor;
    private int mTitleTextSize;
    private String mTitleTextString;

    public interface Action {
        int getDrawable();

        String getText();

        int leftPadding();

        void performAction(View view);

        int rightPadding();
    }

    public static class ActionList extends LinkedList<Action> {
    }

    public static abstract class ImageAction implements Action {
        private int mDrawableId;

        public ImageAction(int i4) {
            this.mDrawableId = i4;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.Action
        public int getDrawable() {
            return this.mDrawableId;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.Action
        public String getText() {
            return null;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.Action
        public int leftPadding() {
            return -1;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.Action
        public int rightPadding() {
            return 0;
        }
    }

    public TitleBar(Context context) {
        this(context, null);
    }

    private static int getInternalDimensionSize(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int getStatusBarHeight() {
        return getInternalDimensionSize(Resources.getSystem(), STATUS_BAR_HEIGHT_RES_NAME);
    }

    private void init(Context context) {
        this.mScreenWidth = getResources().getDisplayMetrics().widthPixels;
        if (this.mImmersive) {
            this.mStatusBarHeight = getStatusBarHeight();
        }
        initView(context);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.TitleBar, i4, 0);
        this.mBarHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TitleBar_tb_barHeight, ThemeUtils.resolveDimension(context, C2042R.attr.xui_actionbar_height));
        this.mImmersive = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.TitleBar_tb_immersive, ThemeUtils.resolveBoolean(context, C2042R.attr.xui_actionbar_immersive));
        this.mActionPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TitleBar_tb_actionPadding, ThemeUtils.resolveDimension(context, C2042R.attr.xui_actionbar_action_padding));
        this.mSideTextPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TitleBar_tb_sideTextPadding, ThemeUtils.resolveDimension(context, C2042R.attr.xui_actionbar_side_text_padding));
        this.mCenterGravity = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.TitleBar_tb_centerGravity, 0);
        int i5 = C2042R.styleable.TitleBar_tb_sideTextSize;
        int i6 = C2042R.attr.xui_actionbar_action_text_size;
        this.mSideTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, ThemeUtils.resolveDimension(context, i6));
        this.mTitleTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TitleBar_tb_titleTextSize, ThemeUtils.resolveDimension(context, C2042R.attr.xui_actionbar_title_text_size));
        this.mSubTitleTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TitleBar_tb_subTitleTextSize, ThemeUtils.resolveDimension(context, C2042R.attr.xui_actionbar_sub_text_size));
        this.mActionTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TitleBar_tb_actionTextSize, ThemeUtils.resolveDimension(context, i6));
        int i7 = C2042R.styleable.TitleBar_tb_sideTextColor;
        Context context2 = getContext();
        int i8 = C2042R.attr.xui_actionbar_text_color;
        this.mSideTextColor = typedArrayObtainStyledAttributes.getColor(i7, ThemeUtils.resolveColor(context2, i8, -1));
        this.mTitleTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TitleBar_tb_titleTextColor, ThemeUtils.resolveColor(getContext(), i8, -1));
        this.mSubTitleTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TitleBar_tb_subTitleTextColor, ThemeUtils.resolveColor(getContext(), i8, -1));
        this.mActionTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TitleBar_tb_actionTextColor, ThemeUtils.resolveColor(getContext(), i8, -1));
        this.mLeftImageResource = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.TitleBar_tb_leftImageResource);
        this.mLeftTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.TitleBar_tb_leftText);
        this.mTitleTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.TitleBar_tb_titleText);
        this.mSubTextString = typedArrayObtainStyledAttributes.getString(C2042R.styleable.TitleBar_tb_subTitleText);
        this.mDividerColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TitleBar_tb_dividerColor, 0);
        this.mDivideHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TitleBar_tb_dividerHeight, DensityUtils.dp2px(1.0f));
        this.mIsUseThemeColor = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.TitleBar_tb_useThemeColor, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initView(Context context) {
        this.mLeftText = new XUIAlphaTextView(context);
        this.mCenterLayout = new XUIAlphaLinearLayout(context);
        this.mRightLayout = new LinearLayout(context);
        this.mDividerView = new View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.mLeftText.setTextSize(0, this.mSideTextSize);
        this.mLeftText.setTextColor(this.mSideTextColor);
        this.mLeftText.setText(this.mLeftTextString);
        Drawable drawable = this.mLeftImageResource;
        if (drawable != null) {
            this.mLeftText.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.mLeftText.setSingleLine();
        this.mLeftText.setGravity(16);
        XUIAlphaTextView xUIAlphaTextView = this.mLeftText;
        int i4 = this.mSideTextPadding;
        xUIAlphaTextView.setPadding(i4, 0, i4, 0);
        this.mLeftText.setTypeface(XUI.getDefaultTypeface());
        this.mCenterText = new AutoMoveTextView(context);
        this.mSubTitleText = new TextView(context);
        if (!TextUtils.isEmpty(this.mSubTextString)) {
            this.mCenterLayout.setOrientation(1);
        }
        this.mCenterText.setTextSize(0, this.mTitleTextSize);
        this.mCenterText.setTextColor(this.mTitleTextColor);
        this.mCenterText.setText(this.mTitleTextString);
        this.mCenterText.setSingleLine();
        this.mCenterText.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.mCenterText.setTypeface(XUI.getDefaultTypeface());
        this.mSubTitleText.setTextSize(0, this.mSubTitleTextSize);
        this.mSubTitleText.setTextColor(this.mSubTitleTextColor);
        this.mSubTitleText.setText(this.mSubTextString);
        this.mSubTitleText.setSingleLine();
        this.mSubTitleText.setPadding(0, DensityUtils.dp2px(getContext(), 2.0f), 0, 0);
        this.mSubTitleText.setEllipsize(TextUtils.TruncateAt.END);
        this.mSubTitleText.setTypeface(XUI.getDefaultTypeface());
        int i5 = this.mCenterGravity;
        if (i5 == 1) {
            setCenterGravity(8388627);
        } else if (i5 == 2) {
            setCenterGravity(8388629);
        } else {
            setCenterGravity(17);
        }
        this.mCenterLayout.addView(this.mCenterText);
        this.mCenterLayout.addView(this.mSubTitleText);
        LinearLayout linearLayout = this.mRightLayout;
        int i6 = this.mSideTextPadding;
        linearLayout.setPadding(i6, 0, i6, 0);
        this.mDividerView.setBackgroundColor(this.mDividerColor);
        addView(this.mLeftText, layoutParams);
        addView(this.mCenterLayout);
        addView(this.mRightLayout, layoutParams);
        addView(this.mDividerView, new ViewGroup.LayoutParams(-1, this.mDivideHeight));
        if (this.mIsUseThemeColor) {
            Drawable drawableResolveDrawable = ThemeUtils.resolveDrawable(getContext(), C2042R.attr.xui_actionbar_background);
            if (drawableResolveDrawable != null) {
                setBackground(drawableResolveDrawable);
            } else {
                setBackgroundColor(ThemeUtils.resolveColor(context, C2042R.attr.xui_actionbar_color));
            }
        }
    }

    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    private void layoutChildView(View view, View view2, View view3) {
        view.layout(0, this.mStatusBarHeight, view.getMeasuredWidth(), view.getMeasuredHeight() + this.mStatusBarHeight);
        view3.layout(this.mScreenWidth - view3.getMeasuredWidth(), this.mStatusBarHeight, this.mScreenWidth, view3.getMeasuredHeight() + this.mStatusBarHeight);
        int i4 = this.mCenterGravity;
        if (i4 == 1) {
            view2.layout(view.getMeasuredWidth(), this.mStatusBarHeight, this.mScreenWidth - view.getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (i4 == 2) {
            view2.layout(view3.getMeasuredWidth(), this.mStatusBarHeight, this.mScreenWidth - view3.getMeasuredWidth(), getMeasuredHeight());
        } else if (view.getMeasuredWidth() > view3.getMeasuredWidth()) {
            view2.layout(view.getMeasuredWidth(), this.mStatusBarHeight, this.mScreenWidth - view.getMeasuredWidth(), getMeasuredHeight());
        } else {
            view2.layout(view3.getMeasuredWidth(), this.mStatusBarHeight, this.mScreenWidth - view3.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public View addAction(Action action) {
        return addAction(action, this.mRightLayout.getChildCount());
    }

    public TitleBar addActions(ActionList actionList) {
        int size = actionList.size();
        for (int i4 = 0; i4 < size; i4++) {
            addAction(actionList.get(i4));
        }
        return this;
    }

    public TitleBar disableLeftView() {
        setBackImageResource(0);
        setLeftTextPadding(this.mActionPadding, 0);
        setLeftVisible(false);
        return this;
    }

    public int getActionCount() {
        return this.mRightLayout.getChildCount();
    }

    public TextView getCenterText() {
        return this.mCenterText;
    }

    public View getDividerView() {
        return this.mDividerView;
    }

    public XUIAlphaTextView getLeftText() {
        return this.mLeftText;
    }

    public TextView getSubTitleText() {
        return this.mSubTitleText;
    }

    public View getViewByAction(Action action) {
        return findViewWithTag(action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.ImageView, com.xuexiang.xui.widget.alpha.XUIAlphaImageView] */
    protected View inflateAction(Action action) {
        XUIAlphaTextView xUIAlphaTextView;
        if (TextUtils.isEmpty(action.getText())) {
            ?? xUIAlphaImageView = new XUIAlphaImageView(getContext());
            xUIAlphaImageView.setImageResource(action.getDrawable());
            xUIAlphaTextView = xUIAlphaImageView;
        } else {
            XUIAlphaTextView xUIAlphaTextView2 = new XUIAlphaTextView(getContext());
            xUIAlphaTextView2.setGravity(17);
            xUIAlphaTextView2.setText(action.getText());
            xUIAlphaTextView2.setTextSize(0, this.mActionTextSize);
            if (DensityUtils.px2sp(getContext(), this.mActionTextSize) >= 16) {
                xUIAlphaTextView2.getPaint().setFakeBoldText(true);
            }
            xUIAlphaTextView2.setTypeface(XUI.getDefaultTypeface());
            int i4 = this.mActionTextColor;
            xUIAlphaTextView = xUIAlphaTextView2;
            if (i4 != 0) {
                xUIAlphaTextView2.setTextColor(i4);
                xUIAlphaTextView = xUIAlphaTextView2;
            }
        }
        xUIAlphaTextView.setPaddingRelative(action.leftPadding() != -1 ? action.leftPadding() : this.mActionPadding, 0, action.rightPadding() != -1 ? action.rightPadding() : this.mActionPadding, 0);
        xUIAlphaTextView.setTag(action);
        xUIAlphaTextView.setOnClickListener(this);
        return xUIAlphaTextView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof Action) {
            ((Action) tag).performAction(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        if (isRtl()) {
            layoutChildView(this.mRightLayout, this.mCenterLayout, this.mLeftText);
        } else {
            layoutChildView(this.mLeftText, this.mCenterLayout, this.mRightLayout);
        }
        this.mDividerView.layout(0, getMeasuredHeight() - this.mDividerView.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int size;
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            int i6 = this.mBarHeight;
            size = this.mStatusBarHeight + i6;
            i5 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            size = View.MeasureSpec.getSize(i5) + this.mStatusBarHeight;
        }
        measureChild(this.mLeftText, i4, i5);
        measureChild(this.mRightLayout, i4, i5);
        if (this.mLeftText.getMeasuredWidth() > this.mRightLayout.getMeasuredWidth()) {
            this.mCenterLayout.measure(View.MeasureSpec.makeMeasureSpec(this.mScreenWidth - (this.mLeftText.getMeasuredWidth() * 2), 1073741824), i5);
        } else {
            this.mCenterLayout.measure(View.MeasureSpec.makeMeasureSpec(this.mScreenWidth - (this.mRightLayout.getMeasuredWidth() * 2), 1073741824), i5);
        }
        measureChild(this.mDividerView, i4, i5);
        setMeasuredDimension(View.MeasureSpec.getSize(i4), size);
    }

    public void removeAction(Action action) {
        int childCount = this.mRightLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = this.mRightLayout.getChildAt(i4);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof Action) && tag.equals(action)) {
                    this.mRightLayout.removeView(childAt);
                }
            }
        }
    }

    public void removeActionAt(int i4) {
        this.mRightLayout.removeViewAt(i4);
    }

    public void removeAllActions() {
        this.mRightLayout.removeAllViews();
    }

    public TitleBar setActionTextColor(int i4) {
        this.mActionTextColor = i4;
        return this;
    }

    @Deprecated
    public TitleBar setBackImageResource(int i4) {
        if (i4 != 0) {
            Drawable drawable = ResUtils.getDrawable(getContext(), i4);
            this.mLeftImageResource = drawable;
            drawable.setBounds(0, 0, DensityUtils.dp2px(getContext(), 12.0f), DensityUtils.dp2px(getContext(), 22.0f));
            this.mLeftText.setCompoundDrawables(this.mLeftImageResource, null, null, null);
        } else {
            this.mLeftImageResource = null;
            this.mLeftText.setCompoundDrawables(null, null, null, null);
        }
        return this;
    }

    public TitleBar setCenterClickListener(View.OnClickListener onClickListener) {
        this.mCenterLayout.setOnClickListener(onClickListener);
        return this;
    }

    public TitleBar setCenterGravity(int i4) {
        this.mCenterLayout.setGravity(i4);
        this.mCenterText.setGravity(i4);
        this.mSubTitleText.setGravity(i4);
        return this;
    }

    public TitleBar setCenterTextBold(boolean z3) {
        TextView textView = this.mCenterText;
        if (textView != null) {
            textView.getPaint().setFakeBoldText(z3);
        }
        return this;
    }

    public TitleBar setCustomTitle(View view) {
        if (view == null) {
            this.mCenterText.setVisibility(0);
            View view2 = this.mCustomCenterView;
            if (view2 != null) {
                this.mCenterLayout.removeView(view2);
            }
        } else {
            View view3 = this.mCustomCenterView;
            if (view3 != null) {
                this.mCenterLayout.removeView(view3);
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            this.mCustomCenterView = view;
            this.mCenterLayout.addView(view, layoutParams);
            this.mCenterText.setVisibility(8);
        }
        return this;
    }

    public TitleBar setDivider(Drawable drawable) {
        this.mDividerView.setBackgroundDrawable(drawable);
        return this;
    }

    public TitleBar setDividerColor(int i4) {
        this.mDividerView.setBackgroundColor(i4);
        return this;
    }

    public TitleBar setDividerHeight(int i4) {
        this.mDividerView.getLayoutParams().height = i4;
        return this;
    }

    public TitleBar setHeight(int i4) {
        this.mBarHeight = i4;
        setMeasuredDimension(getMeasuredWidth(), this.mBarHeight);
        return this;
    }

    public TitleBar setImmersive(boolean z3) {
        this.mImmersive = z3;
        if (z3) {
            this.mStatusBarHeight = getStatusBarHeight();
        } else {
            this.mStatusBarHeight = 0;
        }
        return this;
    }

    public TitleBar setLeftClickListener(View.OnClickListener onClickListener) {
        this.mLeftText.setOnClickListener(onClickListener);
        return this;
    }

    public TitleBar setLeftImageDrawable(Drawable drawable) {
        this.mLeftImageResource = drawable;
        XUIAlphaTextView xUIAlphaTextView = this.mLeftText;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        return this;
    }

    public TitleBar setLeftImageResource(int i4) {
        XUIAlphaTextView xUIAlphaTextView = this.mLeftText;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, 0, 0, 0);
        }
        return this;
    }

    public TitleBar setLeftText(CharSequence charSequence) {
        this.mLeftText.setText(charSequence);
        return this;
    }

    public TitleBar setLeftTextBold(boolean z3) {
        XUIAlphaTextView xUIAlphaTextView = this.mLeftText;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.getPaint().setFakeBoldText(z3);
        }
        return this;
    }

    public TitleBar setLeftTextColor(int i4) {
        this.mLeftText.setTextColor(i4);
        return this;
    }

    public TitleBar setLeftTextEllipsize(TextUtils.TruncateAt truncateAt) {
        this.mLeftText.setEllipsize(truncateAt);
        return this;
    }

    public TitleBar setLeftTextMaxEms(int i4) {
        this.mLeftText.setMaxEms(i4);
        return this;
    }

    public TitleBar setLeftTextMaxWidth(int i4) {
        this.mLeftText.setMaxWidth(i4);
        return this;
    }

    public TitleBar setLeftTextPadding(int i4, int i5) {
        this.mLeftText.setPaddingRelative(i4, 0, i5, 0);
        return this;
    }

    public TitleBar setLeftTextSize(float f4) {
        this.mLeftText.setTextSize(0, f4);
        return this;
    }

    public TitleBar setLeftVisible(boolean z3) {
        this.mLeftText.setVisibility(z3 ? 0 : 8);
        return this;
    }

    public TitleBar setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.mCenterText.setOnClickListener(onClickListener);
        return this;
    }

    public TitleBar setSubTitle(CharSequence charSequence, int i4) {
        this.mCenterLayout.setOrientation(i4);
        this.mSubTitleText.setText(charSequence);
        this.mSubTitleText.setVisibility(0);
        return this;
    }

    public TitleBar setSubTitleColor(int i4) {
        this.mSubTitleText.setTextColor(i4);
        return this;
    }

    public TitleBar setSubTitleSize(float f4) {
        this.mSubTitleText.setTextSize(0, f4);
        return this;
    }

    public TitleBar setTitle(CharSequence charSequence) {
        int iIndexOf = charSequence.toString().indexOf("\n");
        if (iIndexOf > 0) {
            setTitle(charSequence.subSequence(0, iIndexOf), charSequence.subSequence(iIndexOf + 1, charSequence.length()), 1);
        } else {
            int iIndexOf2 = charSequence.toString().indexOf("\t");
            if (iIndexOf2 > 0) {
                setTitle(charSequence.subSequence(0, iIndexOf2), "  " + ((Object) charSequence.subSequence(iIndexOf2 + 1, charSequence.length())), 0);
            } else {
                this.mCenterText.setText(charSequence);
                this.mSubTitleText.setVisibility(8);
            }
        }
        return this;
    }

    public TitleBar setTitleBackground(int i4) {
        this.mCenterText.setBackgroundResource(i4);
        return this;
    }

    public TitleBar setTitleColor(int i4) {
        this.mCenterText.setTextColor(i4);
        return this;
    }

    public TitleBar setTitleSize(float f4) {
        this.mCenterText.setTextSize(0, f4);
        return this;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        XUIAlphaTextView xUIAlphaTextView = this.mLeftText;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setTypeface(typeface);
        }
        TextView textView = this.mCenterText;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.mSubTitleText;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
    }

    public static abstract class TextAction implements Action {
        private final String mText;

        public TextAction(String str) {
            this.mText = str;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.Action
        public int getDrawable() {
            return 0;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.Action
        public String getText() {
            return this.mText;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.Action
        public int leftPadding() {
            return -1;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.Action
        public int rightPadding() {
            return 0;
        }

        public TextAction(int i4) {
            this.mText = ResUtils.getString(i4);
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.TitleBarStyle);
    }

    public TitleBar setLeftText(int i4) {
        this.mLeftText.setText(i4);
        return this;
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initAttrs(context, attributeSet, i4);
        init(context);
    }

    public View addAction(Action action, int i4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        View viewInflateAction = inflateAction(action);
        this.mRightLayout.addView(viewInflateAction, i4, layoutParams);
        return viewInflateAction;
    }

    public TitleBar setSubTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mCenterLayout.setOrientation(1);
        }
        this.mSubTitleText.setText(charSequence);
        this.mSubTitleText.setVisibility(0);
        return this;
    }

    public TitleBar setTitle(CharSequence charSequence, CharSequence charSequence2, int i4) {
        this.mCenterLayout.setOrientation(i4);
        this.mCenterText.setText(charSequence);
        this.mSubTitleText.setText(charSequence2);
        this.mSubTitleText.setVisibility(0);
        return this;
    }

    public TitleBar setTitle(int i4) {
        setTitle(getResources().getString(i4));
        return this;
    }
}
