package com.xuexiang.xui.widget.picker.widget.builder;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import com.xuexiang.xui.widget.picker.widget.OptionsPickerView;
import com.xuexiang.xui.widget.picker.widget.configure.PickerOptions;
import com.xuexiang.xui.widget.picker.widget.listener.CustomListener;
import com.xuexiang.xui.widget.picker.widget.listener.OnOptionsSelectChangeListener;
import com.xuexiang.xui.widget.picker.widget.listener.OnOptionsSelectListener;

/* loaded from: classes.dex */
public class OptionsPickerBuilder {
    private PickerOptions mPickerOptions;

    public OptionsPickerBuilder(Context context, OnOptionsSelectListener onOptionsSelectListener) {
        PickerOptions pickerOptions = new PickerOptions(1);
        this.mPickerOptions = pickerOptions;
        pickerOptions.context = context;
        pickerOptions.optionsSelectListener = onOptionsSelectListener;
        pickerOptions.textColorConfirm = ThemeUtils.getMainThemeColor(context);
        this.mPickerOptions.textColorCancel = ThemeUtils.getMainThemeColor(context);
    }

    public <T> OptionsPickerView<T> build() {
        return new OptionsPickerView<>(this.mPickerOptions);
    }

    public OptionsPickerBuilder isCenterLabel(boolean z3) {
        this.mPickerOptions.isCenterLabel = z3;
        return this;
    }

    public OptionsPickerBuilder isDialog(boolean z3) {
        this.mPickerOptions.isDialog = z3;
        return this;
    }

    public OptionsPickerBuilder isRestoreItem(boolean z3) {
        this.mPickerOptions.isRestoreItem = z3;
        return this;
    }

    public OptionsPickerBuilder setBackgroundId(int i4) {
        this.mPickerOptions.backgroundId = i4;
        return this;
    }

    public OptionsPickerBuilder setBgColor(int i4) {
        this.mPickerOptions.bgColorWheel = i4;
        return this;
    }

    public OptionsPickerBuilder setCancelColor(int i4) {
        this.mPickerOptions.textColorCancel = i4;
        return this;
    }

    public OptionsPickerBuilder setCancelText(String str) {
        this.mPickerOptions.textContentCancel = str;
        return this;
    }

    public OptionsPickerBuilder setContentTextSize(int i4) {
        this.mPickerOptions.textSizeContent = i4;
        return this;
    }

    public OptionsPickerBuilder setCyclic(boolean z3, boolean z4, boolean z5) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.cyclic1 = z3;
        pickerOptions.cyclic2 = z4;
        pickerOptions.cyclic3 = z5;
        return this;
    }

    public OptionsPickerBuilder setDecorView(ViewGroup viewGroup) {
        this.mPickerOptions.decorView = viewGroup;
        return this;
    }

    public OptionsPickerBuilder setDividerColor(int i4) {
        this.mPickerOptions.dividerColor = i4;
        return this;
    }

    public OptionsPickerBuilder setDividerType(WheelView.DividerType dividerType) {
        this.mPickerOptions.dividerType = dividerType;
        return this;
    }

    public OptionsPickerBuilder setLabels(String str, String str2, String str3) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.label1 = str;
        pickerOptions.label2 = str2;
        pickerOptions.label3 = str3;
        return this;
    }

    public OptionsPickerBuilder setLayoutRes(int i4, CustomListener customListener) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.layoutRes = i4;
        pickerOptions.customListener = customListener;
        return this;
    }

    public OptionsPickerBuilder setLineSpacingMultiplier(float f4) {
        this.mPickerOptions.lineSpacingMultiplier = f4;
        return this;
    }

    public OptionsPickerBuilder setOptionsSelectChangeListener(OnOptionsSelectChangeListener onOptionsSelectChangeListener) {
        this.mPickerOptions.optionsSelectChangeListener = onOptionsSelectChangeListener;
        return this;
    }

    public OptionsPickerBuilder setOutSideCancelable(boolean z3) {
        this.mPickerOptions.cancelable = z3;
        return this;
    }

    public OptionsPickerBuilder setSelectOptions(int i4) {
        this.mPickerOptions.option1 = i4;
        return this;
    }

    public OptionsPickerBuilder setSubCalSize(int i4) {
        this.mPickerOptions.textSizeSubmitCancel = i4;
        return this;
    }

    public OptionsPickerBuilder setSubmitColor(int i4) {
        this.mPickerOptions.textColorConfirm = i4;
        return this;
    }

    public OptionsPickerBuilder setSubmitText(String str) {
        this.mPickerOptions.textContentConfirm = str;
        return this;
    }

    public OptionsPickerBuilder setTextColorCenter(int i4) {
        this.mPickerOptions.textColorCenter = i4;
        return this;
    }

    public OptionsPickerBuilder setTextColorOut(int i4) {
        this.mPickerOptions.textColorOut = i4;
        return this;
    }

    public OptionsPickerBuilder setTextXOffset(int i4, int i5, int i6) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.xOffsetOne = i4;
        pickerOptions.xOffsetTwo = i5;
        pickerOptions.xOffsetThree = i6;
        return this;
    }

    public OptionsPickerBuilder setTitleBgColor(int i4) {
        this.mPickerOptions.bgColorTitle = i4;
        return this;
    }

    public OptionsPickerBuilder setTitleColor(int i4) {
        this.mPickerOptions.textColorTitle = i4;
        return this;
    }

    public OptionsPickerBuilder setTitleSize(int i4) {
        this.mPickerOptions.textSizeTitle = i4;
        return this;
    }

    public OptionsPickerBuilder setTitleText(String str) {
        this.mPickerOptions.textContentTitle = str;
        return this;
    }

    public OptionsPickerBuilder setTypeface(Typeface typeface) {
        this.mPickerOptions.font = typeface;
        return this;
    }

    public OptionsPickerBuilder setSelectOptions(int i4, int i5) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.option1 = i4;
        pickerOptions.option2 = i5;
        return this;
    }

    public OptionsPickerBuilder setSelectOptions(int i4, int i5, int i6) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.option1 = i4;
        pickerOptions.option2 = i5;
        pickerOptions.option3 = i6;
        return this;
    }
}
