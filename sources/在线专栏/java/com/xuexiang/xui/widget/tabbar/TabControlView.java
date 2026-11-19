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
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
public class TabControlView extends RadioGroup implements HasTypeface {
    private Context mContext;
    private int mDefaultSelection;
    private boolean mEqualWidth;
    private LinkedHashMap<String, String> mItemMap;
    private int mItemPadding;
    private int mItemPaddingHorizontal;
    private int mItemPaddingVertical;
    private OnTabSelectionChangedListener mListener;
    private List<RadioButton> mOptions;
    private int mSelectedColor;
    private int mSelectedTextColor;
    private RadioGroup.OnCheckedChangeListener mSelectionChangedListener;
    private boolean mStretch;
    private int mStrokeWidth;
    private ColorStateList mTextColorStateList;
    private int mTextSize;
    private int mUnselectedColor;
    private int mUnselectedTextColor;

    public interface OnTabSelectionChangedListener {
        void newSelection(String str, String str2);
    }

    public TabControlView(Context context) {
        super(context, null);
        this.mDefaultSelection = -1;
        this.mStretch = false;
        this.mEqualWidth = false;
        this.mItemMap = new LinkedHashMap<>();
        this.mSelectionChangedListener = new RadioGroup.OnCheckedChangeListener() { // from class: com.xuexiang.xui.widget.tabbar.TabControlView.1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup, int i4) {
                if (TabControlView.this.mListener != null) {
                    String string = ((RadioButton) radioGroup.findViewById(i4)).getText().toString();
                    TabControlView.this.mListener.newSelection(string, (String) TabControlView.this.mItemMap.get(string));
                }
            }
        };
        init(context);
        update();
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
            this.mDefaultSelection = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.TabControlView_tcv_defaultSelection, this.mDefaultSelection);
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

    private void setRadioButtonBackground(RadioButton radioButton, GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
        stateListDrawable.addState(new int[]{R.attr.state_checked}, gradientDrawable2);
        radioButton.setBackground(stateListDrawable);
    }

    private void update() {
        RadioButton radioButton;
        int i4;
        removeAllViews();
        setOrientation(0);
        this.mOptions = new ArrayList();
        float fMax = IGoodView.DEFAULT_TO_ALPHA;
        int i5 = 0;
        for (Map.Entry<String, String> entry : this.mItemMap.entrySet()) {
            RadioButton radioButton2 = new RadioButton(this.mContext);
            radioButton2.setTextColor(this.mTextColorStateList);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -1);
            if (this.mStretch) {
                layoutParams.weight = 1.0f;
            }
            if (i5 > 0) {
                layoutParams.setMarginStart(-this.mStrokeWidth);
            }
            radioButton2.setLayoutParams(layoutParams);
            radioButton2.setButtonDrawable(new StateListDrawable());
            if (i5 == 0) {
                if (isRtl()) {
                    updateRadioButton(radioButton2, C2042R.drawable.tcv_right_option, C2042R.drawable.tcv_right_option_selected);
                } else {
                    updateRadioButton(radioButton2, C2042R.drawable.tcv_left_option, C2042R.drawable.tcv_left_option_selected);
                }
            } else if (i5 != this.mItemMap.size() - 1) {
                updateRadioButton(radioButton2, C2042R.drawable.tcv_middle_option, C2042R.drawable.tcv_middle_option_selected);
            } else if (isRtl()) {
                updateRadioButton(radioButton2, C2042R.drawable.tcv_left_option, C2042R.drawable.tcv_left_option_selected);
            } else {
                updateRadioButton(radioButton2, C2042R.drawable.tcv_right_option, C2042R.drawable.tcv_right_option_selected);
            }
            radioButton2.setLayoutParams(layoutParams);
            int i6 = this.mItemPadding;
            if (i6 != -1) {
                radioButton2.setPadding(i6, i6, i6, i6);
            }
            int i7 = this.mItemPaddingHorizontal;
            if (i7 != -1 && (i4 = this.mItemPaddingVertical) != -1) {
                radioButton2.setPadding(i7, i4, i7, i4);
            }
            radioButton2.setMinWidth(this.mStrokeWidth * 10);
            radioButton2.setGravity(17);
            radioButton2.setTextSize(0, this.mTextSize);
            radioButton2.setTypeface(XUI.getDefaultTypeface());
            radioButton2.setText(entry.getKey());
            fMax = Math.max(radioButton2.getPaint().measureText(entry.getKey()), fMax);
            this.mOptions.add(radioButton2);
            i5++;
        }
        for (RadioButton radioButton3 : this.mOptions) {
            if (this.mEqualWidth) {
                radioButton3.setWidth((int) ((this.mStrokeWidth * 20) + fMax));
            }
            addView(radioButton3);
        }
        setOnCheckedChangeListener(this.mSelectionChangedListener);
        int i8 = this.mDefaultSelection;
        if (i8 <= -1 || (radioButton = (RadioButton) getChildAt(i8)) == null) {
            return;
        }
        check(radioButton.getId());
    }

    private void updateRadioButton(RadioButton radioButton, int i4, int i5) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.mContext.getResources().getDrawable(i4).mutate();
        gradientDrawable.setStroke(this.mStrokeWidth, this.mSelectedColor);
        gradientDrawable.setDither(true);
        gradientDrawable.setColor(this.mUnselectedColor);
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.mContext.getResources().getDrawable(i5).mutate();
        gradientDrawable2.setColor(this.mSelectedColor);
        gradientDrawable2.setStroke(this.mStrokeWidth, this.mSelectedColor);
        setRadioButtonBackground(radioButton, gradientDrawable, gradientDrawable2);
    }

    public String getChecked() {
        return this.mItemMap.get(((RadioButton) findViewById(getCheckedRadioButtonId())).getText().toString());
    }

    public String[] getCheckedWithIdentifier() {
        String string = ((RadioButton) findViewById(getCheckedRadioButtonId())).getText().toString();
        return new String[]{string, this.mItemMap.get(string)};
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        update();
    }

    public TabControlView setColors(int i4, int i5) {
        this.mSelectedColor = i4;
        this.mSelectedTextColor = i5;
        this.mUnselectedColor = i5;
        this.mUnselectedTextColor = i4;
        this.mTextColorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{this.mUnselectedTextColor, this.mSelectedTextColor});
        update();
        return this;
    }

    public TabControlView setDefaultSelection(int i4) throws Exception {
        if (i4 > this.mItemMap.size() - 1) {
            throw new Exception("Default selection cannot be greater than the number of items");
        }
        this.mDefaultSelection = i4;
        update();
        return this;
    }

    public TabControlView setEqualWidth(boolean z3) {
        this.mEqualWidth = z3;
        update();
        return this;
    }

    public TabControlView setItems(String[] strArr, String[] strArr2) throws Exception {
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

    public TabControlView setOnTabSelectionChangedListener(OnTabSelectionChangedListener onTabSelectionChangedListener) {
        this.mListener = onTabSelectionChangedListener;
        return this;
    }

    public TabControlView setSelection(String str) {
        setSelection(str, true);
        return this;
    }

    public TabControlView setSelectionTitle(String str) {
        setSelectionTitle(str, true);
        return this;
    }

    public TabControlView setStretch(boolean z3) {
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

    public TabControlView setSelection(String str, boolean z3) {
        setSelectionTitle(getTitleByValue(str), z3);
        return this;
    }

    public TabControlView setSelectionTitle(String str, boolean z3) {
        for (RadioButton radioButton : this.mOptions) {
            if (radioButton.getText().toString().equalsIgnoreCase(str)) {
                if (z3) {
                    setOnCheckedChangeListener(null);
                    check(radioButton.getId());
                    setOnCheckedChangeListener(this.mSelectionChangedListener);
                } else {
                    check(radioButton.getId());
                }
            }
        }
        return this;
    }

    public TabControlView setColors(int i4, int i5, int i6, int i7) {
        this.mSelectedColor = i4;
        this.mSelectedTextColor = i5;
        this.mUnselectedColor = i6;
        this.mUnselectedTextColor = i7;
        this.mTextColorStateList = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{i7, i5});
        update();
        return this;
    }

    public TabControlView(Context context, AttributeSet attributeSet) throws Exception {
        super(context, attributeSet);
        this.mDefaultSelection = -1;
        this.mStretch = false;
        this.mEqualWidth = false;
        this.mItemMap = new LinkedHashMap<>();
        this.mSelectionChangedListener = new RadioGroup.OnCheckedChangeListener() { // from class: com.xuexiang.xui.widget.tabbar.TabControlView.1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public void onCheckedChanged(RadioGroup radioGroup, int i4) {
                if (TabControlView.this.mListener != null) {
                    String string = ((RadioButton) radioGroup.findViewById(i4)).getText().toString();
                    TabControlView.this.mListener.newSelection(string, (String) TabControlView.this.mItemMap.get(string));
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

    public TabControlView setItems(String[] strArr, String[] strArr2, int i4) throws Exception {
        if (i4 <= strArr.length - 1) {
            this.mDefaultSelection = i4;
            setItems(strArr, strArr2);
            return this;
        }
        throw new Exception("Default selection cannot be greater than the number of items");
    }
}
