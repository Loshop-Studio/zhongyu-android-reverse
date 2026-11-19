package com.xuexiang.xui.widget.picker.widget.configure;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.picker.wheelview.WheelView;
import com.xuexiang.xui.widget.picker.widget.listener.CustomListener;
import com.xuexiang.xui.widget.picker.widget.listener.OnOptionsSelectChangeListener;
import com.xuexiang.xui.widget.picker.widget.listener.OnOptionsSelectListener;
import com.xuexiang.xui.widget.picker.widget.listener.OnTimeSelectChangeListener;
import com.xuexiang.xui.widget.picker.widget.listener.OnTimeSelectListener;
import java.util.Calendar;

/* loaded from: classes.dex */
public class PickerOptions {
    private static final int PICKER_VIEW_BG_COLOR_DEFAULT = -1;
    private static final int PICKER_VIEW_BG_COLOR_TITLE = -657931;
    private static final int PICKER_VIEW_BTN_COLOR_NORMAL = -16417281;
    private static final int PICKER_VIEW_COLOR_TITLE = -16777216;
    public static final int TYPE_PICKER_OPTIONS = 1;
    public static final int TYPE_PICKER_TIME = 2;
    public Context context;
    public CustomListener customListener;
    public Calendar date;
    public ViewGroup decorView;
    public Calendar endDate;
    public int endYear;
    public boolean isDialog;
    public String label1;
    public String label2;
    public String label3;
    public String labelDay;
    public String labelHours;
    public String labelMinutes;
    public String labelMonth;
    public String labelSeconds;
    public String labelYear;
    public int layoutRes;
    public int option1;
    public int option2;
    public int option3;
    public OnOptionsSelectChangeListener optionsSelectChangeListener;
    public OnOptionsSelectListener optionsSelectListener;
    public Calendar startDate;
    public int startYear;
    public String textContentCancel;
    public String textContentConfirm;
    public String textContentTitle;
    public OnTimeSelectChangeListener timeSelectChangeListener;
    public OnTimeSelectListener timeSelectListener;
    public int xOffsetDay;
    public int xOffsetHours;
    public int xOffsetMinutes;
    public int xOffsetMonth;
    public int xOffsetOne;
    public int xOffsetSeconds;
    public int xOffsetThree;
    public int xOffsetTwo;
    public int xOffsetYear;
    public boolean cyclic1 = false;
    public boolean cyclic2 = false;
    public boolean cyclic3 = false;
    public boolean isRestoreItem = false;
    public boolean[] type = {true, true, true, false, false, false};
    public boolean cyclic = false;
    public boolean isLunarCalendar = false;
    public int textGravity = 17;
    public int textColorConfirm = PICKER_VIEW_BTN_COLOR_NORMAL;
    public int textColorCancel = PICKER_VIEW_BTN_COLOR_NORMAL;
    public int textColorTitle = -16777216;
    public int bgColorWheel = -1;
    public int bgColorTitle = PICKER_VIEW_BG_COLOR_TITLE;
    public int textSizeSubmitCancel = 17;
    public int textSizeTitle = 18;
    public int textSizeContent = 18;
    public int textColorOut = -5723992;
    public int textColorCenter = -14013910;
    public int dividerColor = -2763307;
    public int backgroundId = -1;
    public float lineSpacingMultiplier = 1.6f;
    public boolean cancelable = true;
    public boolean isCenterLabel = false;
    public Typeface font = Typeface.MONOSPACE;
    public WheelView.DividerType dividerType = WheelView.DividerType.FILL;

    public PickerOptions(int i4) {
        if (i4 == 1) {
            this.layoutRes = C2042R.layout.xui_layout_picker_view_options;
        } else {
            this.layoutRes = C2042R.layout.xui_layout_picker_view_time;
        }
    }
}
