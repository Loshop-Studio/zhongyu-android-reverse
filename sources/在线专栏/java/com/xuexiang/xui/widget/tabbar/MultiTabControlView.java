package com.xuexiang.xui.widget.tabbar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class MultiTabControlView extends LinearLayout implements HasTypeface {
    private CompoundButton.OnCheckedChangeListener mCheckBoxListener;
    private Context mContext;
    private int[] mDefaultSelectionList;
    private boolean mEqualWidth;
    private LinkedHashMap<String, String> mItemMap;
    private int mItemPadding;
    private int mItemPaddingHorizontal;
    private int mItemPaddingVertical;
    private OnMultiTabSelectionChangedListener mListener;
    private List<CheckBox> mOptions;
    private int mSelectedColor;
    private int mSelectedTextColor;
    private boolean mStretch;
    private int mStrokeWidth;
    private ColorStateList mTextColorStateList;
    private int mTextSize;
    private int mUnselectedColor;
    private int mUnselectedTextColor;

    public interface OnMultiTabSelectionChangedListener {
        void newSelection(String str, String str2, boolean z3);
    }

    public MultiTabControlView(Context context) {
        super(context, null);
        this.mStretch = false;
        this.mEqualWidth = false;
        this.mItemMap = new LinkedHashMap<>();
        this.mCheckBoxListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.xuexiang.xui.widget.tabbar.MultiTabControlView.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                if (MultiTabControlView.this.mListener != null) {
                    String string = compoundButton.getText().toString();
                    MultiTabControlView.this.mListener.newSelection(string, (String) MultiTabControlView.this.mItemMap.get(string), compoundButton.isChecked());
                }
            }
        };
        init(context);
        update();
    }

    private void addOnCheckedChangeListener(CheckBox checkBox) {
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(this.mCheckBoxListener);
        }
    }

    private String getTitleByValue(String str) {
        if (!this.mItemMap.containsValue(str)) {
            return "";
        }
        for (String str2 : this.mItemMap.keySet()) {
            String str3 = this.mItemMap.get(str2);
            if (str3 != null && str3.equalsIgnoreCase(str)) {
                return str2;
            }
        }
        return "";
    }

    private void init(Context context) {
        this.mContext = context;
        setPadding(10, 10, 10, 10);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) throws Exception {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2042R.styleable.TabControlView, 0, 0);
        try {
            this.mTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TabControlView_tcv_textSize, ResUtils.getDimensionPixelSize(C2042R.dimen.default_tcv_text_size));
            this.mSelectedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TabControlView_tcv_selectedColor, ThemeUtils.getMainThemeColor(context));
            this.mUnselectedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TabControlView_tcv_unselectedColor, 0);
            this.mSelectedTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TabControlView_tcv_selectedTextColor, -1);
            this.mUnselectedTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.TabControlView_tcv_unselectedTextColor, ThemeUtils.getMainThemeColor(context));
            this.mStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TabControlView_tcv_strokeWidth, ResUtils.getDimensionPixelSize(C2042R.dimen.default_tcv_stroke_width));
            this.mItemPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TabControlView_tcv_item_padding, -1);
            this.mItemPaddingHorizontal = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TabControlView_tcv_item_padding_horizontal, -1);
            this.mItemPaddingVertical = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.TabControlView_tcv_item_padding_vertical, -1);
            this.mTextColorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{this.mUnselectedTextColor, this.mSelectedTextColor});
            int i4 = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.TabControlView_tcv_defaultSelection, -1);
            if (i4 > -1) {
                this.mDefaultSelectionList = new int[]{i4};
            }
            this.mEqualWidth = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.TabControlView_tcv_equalWidth, this.mEqualWidth);
            this.mStretch = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.TabControlView_tcv_stretch, this.mStretch);
            setItems(typedArrayObtainStyledAttributes.getTextArray(C2042R.styleable.TabControlView_tcv_items), typedArrayObtainStyledAttributes.getTextArray(C2042R.styleable.TabControlView_tcv_values));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private boolean isRtl() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    private void setCheckBoxBackground(CheckBox checkBox, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, gradientDrawable2);
        checkBox.setBackground(stateListDrawable);
    }

    private void update() {
        int i4;
        removeAllViews();
        setOrientation(0);
        this.mOptions = new ArrayList();
        float fMax = IGoodView.DEFAULT_TO_ALPHA;
        int i5 = 0;
        for (Map.Entry<String, String> entry : this.mItemMap.entrySet()) {
            CheckBox checkBox = new CheckBox(this.mContext);
            checkBox.setTextColor(this.mTextColorStateList);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.mStretch) {
                layoutParams.weight = 1.0f;
            }
            if (i5 > 0) {
                layoutParams.setMarginStart(-this.mStrokeWidth);
            }
            checkBox.setLayoutParams(layoutParams);
            checkBox.setButtonDrawable(new StateListDrawable());
            if (i5 == 0) {
                if (isRtl()) {
                    updateCheckBox(checkBox, C2042R.drawable.tcv_right_option, C2042R.drawable.tcv_right_option_selected);
                } else {
                    updateCheckBox(checkBox, C2042R.drawable.tcv_left_option, C2042R.drawable.tcv_left_option_selected);
                }
            } else if (i5 != this.mItemMap.size() - 1) {
                updateCheckBox(checkBox, C2042R.drawable.tcv_middle_option, C2042R.drawable.tcv_middle_option_selected);
            } else if (isRtl()) {
                updateCheckBox(checkBox, C2042R.drawable.tcv_left_option, C2042R.drawable.tcv_left_option_selected);
            } else {
                updateCheckBox(checkBox, C2042R.drawable.tcv_right_option, C2042R.drawable.tcv_right_option_selected);
            }
            checkBox.setLayoutParams(layoutParams);
            int i6 = this.mItemPadding;
            if (i6 != -1) {
                checkBox.setPadding(i6, i6, i6, i6);
            }
            int i7 = this.mItemPaddingHorizontal;
            if (i7 != -1 && (i4 = this.mItemPaddingVertical) != -1) {
                checkBox.setPadding(i7, i4, i7, i4);
            }
            checkBox.setMinWidth(this.mStrokeWidth * 10);
            checkBox.setGravity(17);
            checkBox.setTextSize(0, this.mTextSize);
            checkBox.setTypeface(XUI.getDefaultTypeface());
            checkBox.setText(entry.getKey());
            addOnCheckedChangeListener(checkBox);
            fMax = Math.max(checkBox.getPaint().measureText(entry.getKey()), fMax);
            this.mOptions.add(checkBox);
            i5++;
        }
        for (CheckBox checkBox2 : this.mOptions) {
            if (this.mEqualWidth) {
                checkBox2.setWidth((int) ((this.mStrokeWidth * 20) + fMax));
            }
            addView(checkBox2);
        }
        int[] iArr = this.mDefaultSelectionList;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        for (int i8 : iArr) {
            setIsChecked(i8, true);
        }
    }

    private void updateCheckBox(CheckBox checkBox, int i4, int i5) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.mContext.getResources().getDrawable(i4).mutate();
        gradientDrawable.setStroke(this.mStrokeWidth, this.mSelectedColor);
        gradientDrawable.setDither(true);
        gradientDrawable.setColor(this.mUnselectedColor);
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.mContext.getResources().getDrawable(i5).mutate();
        gradientDrawable2.setColor(this.mSelectedColor);
        gradientDrawable2.setStroke(this.mStrokeWidth, this.mSelectedColor);
        setCheckBoxBackground(checkBox, gradientDrawable, gradientDrawable2);
    }

    public boolean isChecked(int i4) {
        return ((CheckBox) getChildAt(i4)).isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        update();
    }

    public MultiTabControlView setColors(int i4, int i5) {
        this.mSelectedColor = i4;
        this.mSelectedTextColor = i5;
        this.mUnselectedColor = i5;
        this.mUnselectedTextColor = i4;
        this.mTextColorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{this.mUnselectedTextColor, this.mSelectedTextColor});
        update();
        return this;
    }

    public MultiTabControlView setDefaultSelection(int... iArr) throws Exception {
        if (iArr == null) {
            throw new Exception("defaultSelectionList cannot be null");
        }
        if (iArr.length > this.mItemMap.size()) {
            throw new Exception("the length of Default selectionList cannot be greater than the length of items");
        }
        for (int i4 : iArr) {
            if (i4 > this.mItemMap.size() - 1) {
                throw new Exception("Default selection cannot be greater than the number of items");
            }
        }
        this.mDefaultSelectionList = iArr;
        update();
        return this;
    }

    public MultiTabControlView setEqualWidth(boolean z3) {
        this.mEqualWidth = z3;
        update();
        return this;
    }

    public void setIsChecked(int i4, boolean z3) {
        CheckBox checkBox = (CheckBox) getChildAt(i4);
        if (checkBox != null) {
            checkBox.setChecked(z3);
        }
    }

    public MultiTabControlView setItems(String[] strArr, String[] strArr2) throws Exception {
        this.mItemMap.clear();
        if (strArr != null && strArr2 != null && strArr.length != strArr2.length) {
            throw new Exception("Item labels and value arrays must be the same size");
        }
        if (strArr != null) {
            int i4 = 0;
            if (strArr2 != null) {
                while (i4 < strArr.length) {
                    this.mItemMap.put(strArr[i4], strArr2[i4]);
                    i4++;
                }
            } else {
                int length = strArr.length;
                while (i4 < length) {
                    String str = strArr[i4];
                    this.mItemMap.put(str.toString(), str.toString());
                    i4++;
                }
            }
        }
        update();
        return this;
    }

    public MultiTabControlView setOnMultiTabSelectionChangedListener(OnMultiTabSelectionChangedListener onMultiTabSelectionChangedListener) {
        this.mListener = onMultiTabSelectionChangedListener;
        return this;
    }

    public MultiTabControlView setSelection(String... strArr) {
        for (String str : strArr) {
            setSelection(str);
        }
        return this;
    }

    public MultiTabControlView setSelectionStatus(String str, boolean z3) {
        setSelectionStatusByTitle(getTitleByValue(str), z3);
        return this;
    }

    public MultiTabControlView setSelectionStatusByTitle(String str, boolean z3) {
        setSelectionStatusByTitle(str, z3, true);
        return this;
    }

    public MultiTabControlView setStretch(boolean z3) {
        this.mStretch = z3;
        update();
        return this;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        if (this.mOptions != null) {
            for (int i4 = 0; i4 < this.mOptions.size(); i4++) {
                this.mOptions.get(i4).setTypeface(typeface);
            }
        }
    }

    public MultiTabControlView setSelectionStatusByTitle(String str, boolean z3, boolean z4) {
        for (CheckBox checkBox : this.mOptions) {
            if (checkBox.getText().toString().equalsIgnoreCase(str)) {
                if (z4) {
                    checkBox.setOnCheckedChangeListener(null);
                    checkBox.setChecked(z3);
                    addOnCheckedChangeListener(checkBox);
                } else {
                    checkBox.setChecked(z3);
                }
            }
        }
        return this;
    }

    public MultiTabControlView setSelection(String str) {
        setSelectionStatus(str, true);
        return this;
    }

    public MultiTabControlView setColors(int i4, int i5, int i6, int i7) {
        this.mSelectedColor = i4;
        this.mSelectedTextColor = i5;
        this.mUnselectedColor = i6;
        this.mUnselectedTextColor = i7;
        this.mTextColorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{i7, i5});
        update();
        return this;
    }

    public MultiTabControlView(Context context, AttributeSet attributeSet) throws Exception {
        super(context, attributeSet);
        this.mStretch = false;
        this.mEqualWidth = false;
        this.mItemMap = new LinkedHashMap<>();
        this.mCheckBoxListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.xuexiang.xui.widget.tabbar.MultiTabControlView.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                if (MultiTabControlView.this.mListener != null) {
                    String string = compoundButton.getText().toString();
                    MultiTabControlView.this.mListener.newSelection(string, (String) MultiTabControlView.this.mItemMap.get(string), compoundButton.isChecked());
                }
            }
        };
        init(context);
        initAttrs(context, attributeSet);
        update();
    }

    private void setItems(CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) throws Exception {
        if (charSequenceArr != null && charSequenceArr2 != null && charSequenceArr.length != charSequenceArr2.length) {
            throw new Exception("Item labels and value arrays must be the same size");
        }
        if (charSequenceArr != null) {
            int i4 = 0;
            if (charSequenceArr2 != null) {
                while (i4 < charSequenceArr.length) {
                    this.mItemMap.put(charSequenceArr[i4].toString(), charSequenceArr2[i4].toString());
                    i4++;
                }
            } else {
                int length = charSequenceArr.length;
                while (i4 < length) {
                    CharSequence charSequence = charSequenceArr[i4];
                    this.mItemMap.put(charSequence.toString(), charSequence.toString());
                    i4++;
                }
            }
        }
    }

    public MultiTabControlView setDefaultSelection(List<Integer> list) throws Exception {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = list.get(i4).intValue();
        }
        setDefaultSelection(iArr);
        return this;
    }

    public MultiTabControlView setItems(String[] strArr, String[] strArr2, int... iArr) throws Exception {
        if (iArr != null) {
            if (iArr.length <= strArr.length) {
                for (int i4 : iArr) {
                    if (i4 > this.mItemMap.size() - 1) {
                        throw new Exception("Default selection cannot be greater than the number of items");
                    }
                }
                this.mDefaultSelectionList = iArr;
                setItems(strArr, strArr2);
                return this;
            }
            throw new Exception("the length of Default selectionList cannot be greater than the length of items");
        }
        throw new Exception("defaultSelectionList cannot be null");
    }
}
