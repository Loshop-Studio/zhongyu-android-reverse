package com.xuexiang.xui.widget.picker.widget.builder;

import android.content.Context;
import android.view.ViewGroup;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import com.xuexiang.xui.widget.picker.widget.TimePickerView;
import com.xuexiang.xui.widget.picker.widget.configure.PickerOptions;
import com.xuexiang.xui.widget.picker.widget.configure.TimePickerType;
import com.xuexiang.xui.widget.picker.widget.listener.CustomListener;
import com.xuexiang.xui.widget.picker.widget.listener.OnTimeSelectChangeListener;
import com.xuexiang.xui.widget.picker.widget.listener.OnTimeSelectListener;
import java.util.Calendar;

/* loaded from: classes.dex */
public class TimePickerBuilder {
    private PickerOptions mPickerOptions;

    public TimePickerBuilder(Context context, OnTimeSelectListener onTimeSelectListener) {
        PickerOptions pickerOptions = new PickerOptions(2);
        this.mPickerOptions = pickerOptions;
        pickerOptions.context = context;
        pickerOptions.timeSelectListener = onTimeSelectListener;
        pickerOptions.textColorConfirm = ThemeUtils.getMainThemeColor(context);
        this.mPickerOptions.textColorCancel = ThemeUtils.getMainThemeColor(context);
    }

    public TimePickerView build() {
        return new TimePickerView(this.mPickerOptions);
    }

    public TimePickerBuilder isCenterLabel(boolean z3) {
        this.mPickerOptions.isCenterLabel = z3;
        return this;
    }

    public TimePickerBuilder isCyclic(boolean z3) {
        this.mPickerOptions.cyclic = z3;
        return this;
    }

    public TimePickerBuilder isDialog(boolean z3) {
        this.mPickerOptions.isDialog = z3;
        return this;
    }

    public TimePickerBuilder setBackgroundId(int i4) {
        this.mPickerOptions.backgroundId = i4;
        return this;
    }

    public TimePickerBuilder setBgColor(int i4) {
        this.mPickerOptions.bgColorWheel = i4;
        return this;
    }

    public TimePickerBuilder setCancelColor(int i4) {
        this.mPickerOptions.textColorCancel = i4;
        return this;
    }

    public TimePickerBuilder setCancelText(String str) {
        this.mPickerOptions.textContentCancel = str;
        return this;
    }

    public TimePickerBuilder setContentTextSize(int i4) {
        this.mPickerOptions.textSizeContent = i4;
        return this;
    }

    public TimePickerBuilder setDate(Calendar calendar) {
        this.mPickerOptions.date = calendar;
        return this;
    }

    public TimePickerBuilder setDecorView(ViewGroup viewGroup) {
        this.mPickerOptions.decorView = viewGroup;
        return this;
    }

    public TimePickerBuilder setDividerColor(int i4) {
        this.mPickerOptions.dividerColor = i4;
        return this;
    }

    public TimePickerBuilder setDividerType(WheelView.DividerType dividerType) {
        this.mPickerOptions.dividerType = dividerType;
        return this;
    }

    public TimePickerBuilder setGravity(int i4) {
        this.mPickerOptions.textGravity = i4;
        return this;
    }

    public TimePickerBuilder setLabel(String str, String str2, String str3, String str4, String str5, String str6) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.labelYear = str;
        pickerOptions.labelMonth = str2;
        pickerOptions.labelDay = str3;
        pickerOptions.labelHours = str4;
        pickerOptions.labelMinutes = str5;
        pickerOptions.labelSeconds = str6;
        return this;
    }

    public TimePickerBuilder setLayoutRes(int i4, CustomListener customListener) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.layoutRes = i4;
        pickerOptions.customListener = customListener;
        return this;
    }

    public TimePickerBuilder setLineSpacingMultiplier(float f4) {
        this.mPickerOptions.lineSpacingMultiplier = f4;
        return this;
    }

    public TimePickerBuilder setLunarCalendar(boolean z3) {
        this.mPickerOptions.isLunarCalendar = z3;
        return this;
    }

    public TimePickerBuilder setOutSideCancelable(boolean z3) {
        this.mPickerOptions.cancelable = z3;
        return this;
    }

    public TimePickerBuilder setRangDate(Calendar calendar, Calendar calendar2) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.startDate = calendar;
        pickerOptions.endDate = calendar2;
        return this;
    }

    public TimePickerBuilder setSubCalSize(int i4) {
        this.mPickerOptions.textSizeSubmitCancel = i4;
        return this;
    }

    public TimePickerBuilder setSubmitColor(int i4) {
        this.mPickerOptions.textColorConfirm = i4;
        return this;
    }

    public TimePickerBuilder setSubmitText(String str) {
        this.mPickerOptions.textContentConfirm = str;
        return this;
    }

    public TimePickerBuilder setTextColorCenter(int i4) {
        this.mPickerOptions.textColorCenter = i4;
        return this;
    }

    public TimePickerBuilder setTextColorOut(int i4) {
        this.mPickerOptions.textColorOut = i4;
        return this;
    }

    public TimePickerBuilder setTextXOffset(int i4, int i5, int i6, int i7, int i8, int i9) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.xOffsetYear = i4;
        pickerOptions.xOffsetMonth = i5;
        pickerOptions.xOffsetDay = i6;
        pickerOptions.xOffsetHours = i7;
        pickerOptions.xOffsetMinutes = i8;
        pickerOptions.xOffsetSeconds = i9;
        return this;
    }

    public TimePickerBuilder setTimeSelectChangeListener(OnTimeSelectChangeListener onTimeSelectChangeListener) {
        this.mPickerOptions.timeSelectChangeListener = onTimeSelectChangeListener;
        return this;
    }

    public TimePickerBuilder setTitleBgColor(int i4) {
        this.mPickerOptions.bgColorTitle = i4;
        return this;
    }

    public TimePickerBuilder setTitleColor(int i4) {
        this.mPickerOptions.textColorTitle = i4;
        return this;
    }

    public TimePickerBuilder setTitleSize(int i4) {
        this.mPickerOptions.textSizeTitle = i4;
        return this;
    }

    public TimePickerBuilder setTitleText(String str) {
        this.mPickerOptions.textContentTitle = str;
        return this;
    }

    public TimePickerBuilder setType(boolean... zArr) {
        if (zArr.length != 6) {
            throw new IllegalArgumentException("控制“年”“月”“日”“时”“分”“秒”的显示或隐藏, 长度必须为6！");
        }
        this.mPickerOptions.type = zArr;
        return this;
    }

    public TimePickerBuilder setType(TimePickerType timePickerType) {
        this.mPickerOptions.type = timePickerType.getType();
        return this;
    }
}
