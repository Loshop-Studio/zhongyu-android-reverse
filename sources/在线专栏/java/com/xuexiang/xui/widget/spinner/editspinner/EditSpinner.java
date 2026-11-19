package com.xuexiang.xui.widget.spinner.editspinner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import android.widget.PopupWindow;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class EditSpinner extends FrameLayout implements View.OnClickListener, AdapterView.OnItemClickListener, TextWatcher {
    private static final int DEFAULT_MAX_LINE = 1;
    private static final int TOGGLE_POPUP_WINDOW_INTERVAL = 200;
    private BaseEditSpinnerAdapter mAdapter;
    private Animation mAnimation;
    private Drawable mDropDownBg;
    private EditText mEditText;
    private boolean mIsFilterKey;
    private boolean mIsShowFilterData;
    private ImageView mIvArrow;
    private int mMaxLine;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private int mPopAnimStyle;
    private WeakReference<ListPopupWindow> mPopupWindow;
    private long mPopupWindowHideTime;
    private Animation mResetAnimation;

    public EditSpinner(Context context) {
        this(context, null);
    }

    private ListPopupWindow buildPopupWindow() {
        ListPopupWindow listPopupWindow = new ListPopupWindow(getContext()) { // from class: com.xuexiang.xui.widget.spinner.editspinner.EditSpinner.1
            @Override // android.widget.ListPopupWindow
            public void show() {
                if (!isShowing()) {
                    EditSpinner.this.mIvArrow.startAnimation(EditSpinner.this.mAnimation);
                }
                super.show();
            }
        };
        int i4 = this.mPopAnimStyle;
        if (i4 != -1) {
            listPopupWindow.setAnimationStyle(i4);
        }
        listPopupWindow.setOnItemClickListener(this);
        listPopupWindow.setInputMethodMode(1);
        listPopupWindow.setSoftInputMode(48);
        listPopupWindow.setPromptPosition(1);
        listPopupWindow.setWidth(-2);
        listPopupWindow.setHeight(-2);
        listPopupWindow.setAnchorView(this.mEditText);
        listPopupWindow.setVerticalOffset(ThemeUtils.resolveDimension(getContext(), C2042R.attr.ms_dropdown_offset));
        listPopupWindow.setListSelector(ResUtils.getDrawable(getContext(), C2042R.drawable.xui_config_list_item_selector));
        listPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.xuexiang.xui.widget.spinner.editspinner.EditSpinner.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                EditSpinner.this.mPopupWindowHideTime = System.currentTimeMillis();
                EditSpinner.this.mIvArrow.startAnimation(EditSpinner.this.mResetAnimation);
            }
        });
        Drawable drawable = this.mDropDownBg;
        if (drawable != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        } else {
            listPopupWindow.setBackgroundDrawable(ResUtils.getDrawable(getContext(), C2042R.drawable.ms_drop_down_bg_radius));
        }
        return listPopupWindow;
    }

    private void dismissDropDown() {
        ListPopupWindow popupWindow = getPopupWindow();
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    private ListPopupWindow getPopupWindow() {
        WeakReference<ListPopupWindow> weakReference = this.mPopupWindow;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void initAnimation() {
        RotateAnimation rotateAnimation = new RotateAnimation(IGoodView.DEFAULT_TO_ALPHA, -180.0f, 1, 0.5f, 1, 0.5f);
        this.mAnimation = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.mAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = new RotateAnimation(-180.0f, IGoodView.DEFAULT_TO_ALPHA, 1, 0.5f, 1, 0.5f);
        this.mResetAnimation = rotateAnimation2;
        rotateAnimation2.setDuration(300L);
        this.mResetAnimation.setFillAfter(true);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.EditSpinner, i4, 0);
        this.mIsShowFilterData = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.EditSpinner_es_isShowFilterData, true);
        this.mIsFilterKey = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.EditSpinner_es_isFilterKey, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.EditSpinner_es_arrowImage, 0);
        if (resourceId != 0) {
            this.mIvArrow.setImageResource(resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.EditSpinner_es_arrowMargin, -1);
        if (dimensionPixelSize != -1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mIvArrow.getLayoutParams();
            layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            this.mIvArrow.setLayoutParams(layoutParams);
        }
        this.mEditText.setHint(typedArrayObtainStyledAttributes.getString(C2042R.styleable.EditSpinner_es_hint));
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.EditSpinner_es_background, 0);
        if (resourceId2 != 0) {
            this.mEditText.setBackgroundResource(resourceId2);
        }
        int i5 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.EditSpinner_es_maxLine, 1);
        this.mMaxLine = i5;
        this.mEditText.setMaxLines(i5);
        this.mEditText.setLayoutParams(new FrameLayout.LayoutParams(-1, typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.EditSpinner_es_height, ThemeUtils.resolveDimension(getContext(), C2042R.attr.ms_item_height_size))));
        setTextColors(ResUtils.getColorStateListAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.EditSpinner_es_textColor));
        setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.EditSpinner_es_textSize, ThemeUtils.resolveDimension(getContext(), C2042R.attr.xui_config_size_spinner_text)));
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.EditSpinner_es_entries, 0);
        if (resourceId3 != 0) {
            setItems(ResUtils.getStringArray(resourceId3));
        }
        this.mDropDownBg = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.EditSpinner_es_dropdown_bg);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.EditSpinner_es_enable, true));
        setMaxLength(typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.EditSpinner_es_maxLength, -1));
        setMaxEms(typedArrayObtainStyledAttributes.getInteger(C2042R.styleable.EditSpinner_es_maxEms, -1));
        this.mPopAnimStyle = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.EditSpinner_es_popAnimStyle, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_edit_spinner, this);
        this.mEditText = (EditText) findViewById(C2042R.id.edit_spinner_edit);
        ImageView imageView = (ImageView) findViewById(C2042R.id.edit_spinner_arrow);
        this.mIvArrow = imageView;
        imageView.setOnClickListener(this);
        this.mEditText.addTextChangedListener(this);
    }

    private void recycle() {
        ImageView imageView = this.mIvArrow;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        Animation animation = this.mAnimation;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.mResetAnimation;
        if (animation2 != null) {
            animation2.cancel();
        }
        setAdapter(null);
        dismissDropDown();
    }

    private void setBaseAdapter(BaseAdapter baseAdapter) {
        if (this.mPopupWindow == null) {
            this.mPopupWindow = new WeakReference<>(buildPopupWindow());
        }
        ListPopupWindow popupWindow = getPopupWindow();
        if (popupWindow != null) {
            popupWindow.setAdapter(baseAdapter);
        }
    }

    private void showDropDown() {
        ListPopupWindow popupWindow = getPopupWindow();
        if (popupWindow != null) {
            popupWindow.show();
        }
    }

    private void showFilterData(String str) {
        BaseEditSpinnerAdapter baseEditSpinnerAdapter;
        if (this.mPopupWindow == null || (baseEditSpinnerAdapter = this.mAdapter) == null || baseEditSpinnerAdapter.getEditSpinnerFilter() == null) {
            dismissDropDown();
        } else if (this.mAdapter.getEditSpinnerFilter().onFilter(str)) {
            showDropDown();
        } else {
            dismissDropDown();
        }
    }

    private void togglePopupWindow() {
        if (System.currentTimeMillis() - this.mPopupWindowHideTime <= 200 || this.mAdapter == null || this.mPopupWindow == null) {
            return;
        }
        showFilterData("");
    }

    public EditSpinner addTextChangedListener(TextWatcher textWatcher) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.addTextChangedListener(textWatcher);
        }
        return this;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        this.mEditText.setSelection(string.length());
        if (TextUtils.isEmpty(string)) {
            dismissDropDown();
        } else if (this.mIsShowFilterData) {
            showFilterData(string);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    public EditText getEditText() {
        return this.mEditText;
    }

    public String getText() {
        EditText editText = this.mEditText;
        return editText != null ? editText.getText().toString() : "";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        togglePopupWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        recycle();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        setText(((BaseEditSpinnerAdapter) adapterView.getAdapter()).getItemString(i4));
        dismissDropDown();
        AdapterView.OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i4, j4);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
    }

    public EditSpinner setAdapter(BaseEditSpinnerAdapter baseEditSpinnerAdapter) {
        this.mAdapter = baseEditSpinnerAdapter;
        setBaseAdapter(baseEditSpinnerAdapter);
        return this;
    }

    public EditSpinner setArrowImageDrawable(Drawable drawable) {
        ImageView imageView = this.mIvArrow;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        return this;
    }

    public EditSpinner setArrowImageResource(int i4) {
        ImageView imageView = this.mIvArrow;
        if (imageView != null) {
            imageView.setImageResource(i4);
        }
        return this;
    }

    public EditSpinner setBackgroundSelector(int i4) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setBackgroundResource(i4);
        }
        return this;
    }

    public EditSpinner setEditTextHeight(int i4) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setLayoutParams(new FrameLayout.LayoutParams(-1, DensityUtils.dp2px(getContext(), i4)));
        }
        return this;
    }

    public EditSpinner setEditTextWidth(int i4) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = DensityUtils.dp2px(getContext(), i4);
        setLayoutParams(layoutParams);
        return this;
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setFocusable(z3);
            this.mEditText.setFocusableInTouchMode(z3);
            this.mEditText.setEnabled(z3);
            this.mIvArrow.setEnabled(z3);
        }
    }

    public EditSpinner setFilterColor(String str) {
        BaseEditSpinnerAdapter baseEditSpinnerAdapter;
        if (this.mEditText != null && (baseEditSpinnerAdapter = this.mAdapter) != null && (baseEditSpinnerAdapter instanceof EditSpinnerAdapter)) {
            ((EditSpinnerAdapter) baseEditSpinnerAdapter).setFilterColor(str);
        }
        return this;
    }

    public EditSpinner setHint(String str) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setHint(str);
        }
        return this;
    }

    public EditSpinner setInputType(int i4) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setInputType(i4);
        }
        return this;
    }

    public EditSpinner setIsFilterKey(boolean z3) {
        BaseEditSpinnerAdapter baseEditSpinnerAdapter;
        if (this.mEditText != null && (baseEditSpinnerAdapter = this.mAdapter) != null && (baseEditSpinnerAdapter instanceof EditSpinnerAdapter)) {
            ((EditSpinnerAdapter) baseEditSpinnerAdapter).setIsFilterKey(z3);
        }
        return this;
    }

    public EditSpinner setItems(String[] strArr) {
        EditSpinnerAdapter isFilterKey = new EditSpinnerAdapter(strArr).setTextColor(this.mEditText.getTextColors().getDefaultColor()).setTextSize(this.mEditText.getTextSize()).setIsFilterKey(this.mIsFilterKey);
        this.mAdapter = isFilterKey;
        setAdapter(isFilterKey);
        return this;
    }

    public EditSpinner setMaxEms(int i4) {
        EditText editText = this.mEditText;
        if (editText != null && i4 > 0) {
            editText.setMaxEms(i4);
        }
        return this;
    }

    public EditSpinner setMaxLength(int i4) {
        if (this.mEditText != null && i4 > 0) {
            this.mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i4)});
        }
        return this;
    }

    public EditSpinner setMaxLine(int i4) {
        EditText editText = this.mEditText;
        if (editText != null) {
            this.mMaxLine = i4;
            editText.setMaxLines(i4);
        }
        return this;
    }

    public EditSpinner setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
        return this;
    }

    public EditSpinner setText(String str) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.removeTextChangedListener(this);
            this.mEditText.setText(str);
            this.mEditText.setSelection(str.length());
            this.mEditText.addTextChangedListener(this);
        }
        return this;
    }

    public EditSpinner setTextColor(int i4) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setTextColor(i4);
            BaseEditSpinnerAdapter baseEditSpinnerAdapter = this.mAdapter;
            if (baseEditSpinnerAdapter != null && (baseEditSpinnerAdapter instanceof EditSpinnerAdapter)) {
                ((EditSpinnerAdapter) baseEditSpinnerAdapter).setTextColor(i4);
            }
        }
        return this;
    }

    public EditSpinner setTextColors(ColorStateList colorStateList) {
        EditText editText = this.mEditText;
        if (editText != null && colorStateList != null) {
            editText.setTextColor(colorStateList);
            BaseEditSpinnerAdapter baseEditSpinnerAdapter = this.mAdapter;
            if (baseEditSpinnerAdapter != null && (baseEditSpinnerAdapter instanceof EditSpinnerAdapter)) {
                ((EditSpinnerAdapter) baseEditSpinnerAdapter).setTextColor(colorStateList.getDefaultColor());
            }
        }
        return this;
    }

    public EditSpinner setTextSize(float f4) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setTextSize(0, f4);
            BaseEditSpinnerAdapter baseEditSpinnerAdapter = this.mAdapter;
            if (baseEditSpinnerAdapter != null && (baseEditSpinnerAdapter instanceof EditSpinnerAdapter)) {
                ((EditSpinnerAdapter) baseEditSpinnerAdapter).setTextSize(f4);
            }
        }
        return this;
    }

    public EditSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.EditSpinnerStyle);
    }

    public EditSpinner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mMaxLine = 1;
        this.mIsShowFilterData = true;
        this.mIsFilterKey = false;
        initView(context);
        initAttrs(context, attributeSet, i4);
        initAnimation();
    }

    public EditSpinner setItems(List<String> list) {
        EditSpinnerAdapter isFilterKey = new EditSpinnerAdapter(list).setTextColor(this.mEditText.getTextColors().getDefaultColor()).setTextSize(this.mEditText.getTextSize()).setIsFilterKey(this.mIsFilterKey);
        this.mAdapter = isFilterKey;
        setAdapter(isFilterKey);
        return this;
    }
}
