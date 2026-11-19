package com.xuexiang.xui.widget.picker.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.picker.widget.configure.PickerOptions;
import com.xuexiang.xui.widget.picker.widget.listener.CustomListener;
import com.xuexiang.xui.widget.picker.widget.listener.ISelectTimeCallback;
import java.text.ParseException;
import java.util.Calendar;

/* loaded from: classes.dex */
public class TimePickerView extends BasePickerView implements View.OnClickListener {
    private static final String TAG_CANCEL = "cancel";
    private static final String TAG_SUBMIT = "submit";
    private WheelTime wheelTime;

    public TimePickerView(PickerOptions pickerOptions) {
        super(pickerOptions.context);
        this.mPickerOptions = pickerOptions;
        initView(pickerOptions.context);
    }

    private void initDefaultSelectedDate() {
        PickerOptions pickerOptions = this.mPickerOptions;
        Calendar calendar = pickerOptions.startDate;
        if (calendar == null || pickerOptions.endDate == null) {
            if (calendar != null) {
                pickerOptions.date = calendar;
                return;
            }
            Calendar calendar2 = pickerOptions.endDate;
            if (calendar2 != null) {
                pickerOptions.date = calendar2;
                return;
            }
            return;
        }
        Calendar calendar3 = pickerOptions.date;
        if (calendar3 == null || calendar3.getTimeInMillis() < this.mPickerOptions.startDate.getTimeInMillis() || this.mPickerOptions.date.getTimeInMillis() > this.mPickerOptions.endDate.getTimeInMillis()) {
            PickerOptions pickerOptions2 = this.mPickerOptions;
            pickerOptions2.date = pickerOptions2.startDate;
        }
    }

    private void initView(Context context) {
        setDialogOutSideCancelable();
        initViews();
        initAnim();
        CustomListener customListener = this.mPickerOptions.customListener;
        if (customListener == null) {
            if (isDialog()) {
                LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_picker_view_time_dialog, this.contentContainer);
            } else {
                LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_picker_view_time, this.contentContainer);
            }
            TextView textView = (TextView) findViewById(C2042R.id.tvTitle);
            LinearLayout linearLayout = (LinearLayout) findViewById(C2042R.id.ll_content);
            Button button = (Button) findViewById(C2042R.id.btnSubmit);
            Button button2 = (Button) findViewById(C2042R.id.btnCancel);
            button.setTag(TAG_SUBMIT);
            button2.setTag(TAG_CANCEL);
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            button.setText(TextUtils.isEmpty(this.mPickerOptions.textContentConfirm) ? context.getResources().getString(C2042R.string.xui_picker_view_submit) : this.mPickerOptions.textContentConfirm);
            button2.setText(TextUtils.isEmpty(this.mPickerOptions.textContentCancel) ? context.getResources().getString(C2042R.string.xui_picker_view_cancel) : this.mPickerOptions.textContentCancel);
            textView.setText(TextUtils.isEmpty(this.mPickerOptions.textContentTitle) ? "" : this.mPickerOptions.textContentTitle);
            button.setTextColor(this.mPickerOptions.textColorConfirm);
            button2.setTextColor(this.mPickerOptions.textColorCancel);
            textView.setTextColor(this.mPickerOptions.textColorTitle);
            if (isDialog() && TextUtils.isEmpty(textView.getText().toString())) {
                textView.setVisibility(8);
            }
            linearLayout.setBackgroundColor(this.mPickerOptions.bgColorTitle);
            button.setTextSize(this.mPickerOptions.textSizeSubmitCancel);
            button2.setTextSize(this.mPickerOptions.textSizeSubmitCancel);
            textView.setTextSize(this.mPickerOptions.textSizeTitle);
        } else {
            customListener.customLayout(LayoutInflater.from(context).inflate(this.mPickerOptions.layoutRes, this.contentContainer));
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C2042R.id.time_picker);
        linearLayout2.setBackgroundColor(this.mPickerOptions.bgColorWheel);
        initWheelTime(linearLayout2);
    }

    private void initWheelTime(LinearLayout linearLayout) {
        int i4;
        PickerOptions pickerOptions = this.mPickerOptions;
        WheelTime wheelTime = new WheelTime(linearLayout, pickerOptions.type, pickerOptions.textGravity, pickerOptions.textSizeContent);
        this.wheelTime = wheelTime;
        if (this.mPickerOptions.timeSelectChangeListener != null) {
            wheelTime.setSelectChangeCallback(new ISelectTimeCallback() { // from class: com.xuexiang.xui.widget.picker.widget.TimePickerView.1
                @Override // com.xuexiang.xui.widget.picker.widget.listener.ISelectTimeCallback
                public void onTimeSelectChanged() throws ParseException {
                    try {
                        TimePickerView.this.mPickerOptions.timeSelectChangeListener.onTimeSelectChanged(WheelTime.dateFormat.parse(TimePickerView.this.wheelTime.getTime()));
                    } catch (ParseException e4) {
                        e4.printStackTrace();
                    }
                }
            });
        }
        this.wheelTime.setLunarMode(this.mPickerOptions.isLunarCalendar);
        PickerOptions pickerOptions2 = this.mPickerOptions;
        int i5 = pickerOptions2.startYear;
        if (i5 != 0 && (i4 = pickerOptions2.endYear) != 0 && i5 <= i4) {
            setRange();
        }
        PickerOptions pickerOptions3 = this.mPickerOptions;
        Calendar calendar = pickerOptions3.startDate;
        if (calendar == null || pickerOptions3.endDate == null) {
            if (calendar == null) {
                Calendar calendar2 = pickerOptions3.endDate;
                if (calendar2 != null && calendar2.get(1) > 2100) {
                    throw new IllegalArgumentException("The endDate should not be later than 2100");
                }
                setRangDate();
            } else {
                if (calendar.get(1) < 1900) {
                    throw new IllegalArgumentException("The startDate can not as early as 1900");
                }
                setRangDate();
            }
        } else {
            if (calendar.getTimeInMillis() > this.mPickerOptions.endDate.getTimeInMillis()) {
                throw new IllegalArgumentException("startDate can't be later than endDate");
            }
            setRangDate();
        }
        setTime();
        WheelTime wheelTime2 = this.wheelTime;
        PickerOptions pickerOptions4 = this.mPickerOptions;
        wheelTime2.setLabels(pickerOptions4.labelYear, pickerOptions4.labelMonth, pickerOptions4.labelDay, pickerOptions4.labelHours, pickerOptions4.labelMinutes, pickerOptions4.labelSeconds);
        WheelTime wheelTime3 = this.wheelTime;
        PickerOptions pickerOptions5 = this.mPickerOptions;
        wheelTime3.setTextXOffset(pickerOptions5.xOffsetYear, pickerOptions5.xOffsetMonth, pickerOptions5.xOffsetDay, pickerOptions5.xOffsetHours, pickerOptions5.xOffsetMinutes, pickerOptions5.xOffsetSeconds);
        setOutSideCancelable(this.mPickerOptions.cancelable);
        this.wheelTime.setCyclic(this.mPickerOptions.cyclic);
        this.wheelTime.setDividerColor(this.mPickerOptions.dividerColor);
        this.wheelTime.setDividerType(this.mPickerOptions.dividerType);
        this.wheelTime.setLineSpacingMultiplier(this.mPickerOptions.lineSpacingMultiplier);
        this.wheelTime.setTextColorOut(this.mPickerOptions.textColorOut);
        this.wheelTime.setTextColorCenter(this.mPickerOptions.textColorCenter);
        this.wheelTime.isCenterLabel(this.mPickerOptions.isCenterLabel);
    }

    private void setRangDate() {
        WheelTime wheelTime = this.wheelTime;
        PickerOptions pickerOptions = this.mPickerOptions;
        wheelTime.setRangDate(pickerOptions.startDate, pickerOptions.endDate);
        initDefaultSelectedDate();
    }

    private void setRange() {
        this.wheelTime.setStartYear(this.mPickerOptions.startYear);
        this.wheelTime.setEndYear(this.mPickerOptions.endYear);
    }

    private void setTime() {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = this.mPickerOptions.date;
        if (calendar2 == null) {
            calendar.setTimeInMillis(System.currentTimeMillis());
            i4 = calendar.get(1);
            i5 = calendar.get(2);
            i6 = calendar.get(5);
            i7 = calendar.get(11);
            i8 = calendar.get(12);
            i9 = calendar.get(13);
        } else {
            i4 = calendar2.get(1);
            i5 = this.mPickerOptions.date.get(2);
            i6 = this.mPickerOptions.date.get(5);
            i7 = this.mPickerOptions.date.get(11);
            i8 = this.mPickerOptions.date.get(12);
            i9 = this.mPickerOptions.date.get(13);
        }
        int i10 = i7;
        int i11 = i6;
        int i12 = i5;
        WheelTime wheelTime = this.wheelTime;
        wheelTime.setPicker(i4, i12, i11, i10, i8, i9);
    }

    public WheelTime getWheelTime() {
        return this.wheelTime;
    }

    @Override // com.xuexiang.xui.widget.picker.widget.BasePickerView
    public boolean isDialog() {
        return this.mPickerOptions.isDialog;
    }

    public boolean isLunarCalendar() {
        return this.wheelTime.isLunarMode();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws ParseException {
        if (((String) view.getTag()).equals(TAG_SUBMIT)) {
            returnData();
        }
        dismiss();
    }

    public void returnData() throws ParseException {
        if (this.mPickerOptions.timeSelectListener != null) {
            try {
                this.mPickerOptions.timeSelectListener.onTimeSelected(WheelTime.dateFormat.parse(this.wheelTime.getTime()), this.clickView);
            } catch (ParseException e4) {
                e4.printStackTrace();
            }
        }
    }

    public void setDate(Calendar calendar) {
        this.mPickerOptions.date = calendar;
        setTime();
    }

    public void setLunarCalendar(boolean z3) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(WheelTime.dateFormat.parse(this.wheelTime.getTime()));
            int i4 = calendar.get(1);
            int i5 = calendar.get(2);
            int i6 = calendar.get(5);
            int i7 = calendar.get(11);
            int i8 = calendar.get(12);
            int i9 = calendar.get(13);
            this.wheelTime.setLunarMode(z3);
            WheelTime wheelTime = this.wheelTime;
            PickerOptions pickerOptions = this.mPickerOptions;
            wheelTime.setLabels(pickerOptions.labelYear, pickerOptions.labelMonth, pickerOptions.labelDay, pickerOptions.labelHours, pickerOptions.labelMinutes, pickerOptions.labelSeconds);
            this.wheelTime.setPicker(i4, i5, i6, i7, i8, i9);
        } catch (ParseException e4) {
            e4.printStackTrace();
        }
    }

    public void setTitleText(String str) {
        TextView textView = (TextView) findViewById(C2042R.id.tvTitle);
        if (textView != null) {
            textView.setText(str);
        }
    }
}
