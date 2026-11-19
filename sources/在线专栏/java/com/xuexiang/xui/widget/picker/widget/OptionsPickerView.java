package com.xuexiang.xui.widget.picker.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.widget.picker.widget.configure.PickerOptions;
import com.xuexiang.xui.widget.picker.widget.listener.CustomListener;
import com.xuexiang.xui.widget.picker.widget.listener.OnOptionsSelectChangeListener;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class OptionsPickerView<T> extends BasePickerView implements View.OnClickListener, HasTypeface {
    private static final String TAG_CANCEL = "cancel";
    private static final String TAG_SUBMIT = "submit";
    private WheelOptions<T> wheelOptions;

    public OptionsPickerView(PickerOptions pickerOptions) {
        super(pickerOptions.context);
        this.mPickerOptions = pickerOptions;
        initView(pickerOptions.context);
    }

    private void initView(Context context) {
        setDialogOutSideCancelable();
        initViews();
        initAnim();
        initEvents();
        CustomListener customListener = this.mPickerOptions.customListener;
        if (customListener == null) {
            if (isDialog()) {
                LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_picker_view_options_dialog, this.contentContainer);
            } else {
                LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_picker_view_options, this.contentContainer);
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
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C2042R.id.options_picker);
        linearLayout2.setBackgroundColor(this.mPickerOptions.bgColorWheel);
        WheelOptions<T> wheelOptions = new WheelOptions<>(linearLayout2, this.mPickerOptions.isRestoreItem);
        this.wheelOptions = wheelOptions;
        OnOptionsSelectChangeListener onOptionsSelectChangeListener = this.mPickerOptions.optionsSelectChangeListener;
        if (onOptionsSelectChangeListener != null) {
            wheelOptions.setOptionsSelectChangeListener(onOptionsSelectChangeListener);
        }
        this.wheelOptions.setTextContentSize(this.mPickerOptions.textSizeContent);
        WheelOptions<T> wheelOptions2 = this.wheelOptions;
        PickerOptions pickerOptions = this.mPickerOptions;
        wheelOptions2.setLabels(pickerOptions.label1, pickerOptions.label2, pickerOptions.label3);
        WheelOptions<T> wheelOptions3 = this.wheelOptions;
        PickerOptions pickerOptions2 = this.mPickerOptions;
        wheelOptions3.setTextXOffset(pickerOptions2.xOffsetOne, pickerOptions2.xOffsetTwo, pickerOptions2.xOffsetThree);
        WheelOptions<T> wheelOptions4 = this.wheelOptions;
        PickerOptions pickerOptions3 = this.mPickerOptions;
        wheelOptions4.setCyclic(pickerOptions3.cyclic1, pickerOptions3.cyclic2, pickerOptions3.cyclic3);
        if (XUI.getDefaultTypeface() == null) {
            this.wheelOptions.setTypeface(this.mPickerOptions.font);
        }
        setOutSideCancelable(this.mPickerOptions.cancelable);
        this.wheelOptions.setDividerColor(this.mPickerOptions.dividerColor);
        this.wheelOptions.setDividerType(this.mPickerOptions.dividerType);
        this.wheelOptions.setLineSpacingMultiplier(this.mPickerOptions.lineSpacingMultiplier);
        this.wheelOptions.setTextColorOut(this.mPickerOptions.textColorOut);
        this.wheelOptions.setTextColorCenter(this.mPickerOptions.textColorCenter);
        this.wheelOptions.isCenterLabel(this.mPickerOptions.isCenterLabel);
    }

    private void reSetCurrentItems() {
        WheelOptions<T> wheelOptions = this.wheelOptions;
        if (wheelOptions != null) {
            PickerOptions pickerOptions = this.mPickerOptions;
            wheelOptions.setCurrentItems(pickerOptions.option1, pickerOptions.option2, pickerOptions.option3);
        }
    }

    @Override // com.xuexiang.xui.widget.picker.widget.BasePickerView
    public boolean isDialog() {
        return this.mPickerOptions.isDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!((String) view.getTag()).equals(TAG_SUBMIT)) {
            dismiss();
        } else {
            if (returnData()) {
                return;
            }
            dismiss();
        }
    }

    public boolean returnData() {
        if (this.mPickerOptions.optionsSelectListener == null) {
            return false;
        }
        int[] currentItems = this.wheelOptions.getCurrentItems();
        return this.mPickerOptions.optionsSelectListener.onOptionsSelect(this.clickView, currentItems[0], currentItems[1], currentItems[2]);
    }

    public void setNPicker(T[] tArr, T[] tArr2) {
        setNPicker(Arrays.asList(tArr), Arrays.asList(tArr2));
    }

    public void setPicker(List<T> list) {
        setPicker(list, (List) null, (List) null);
    }

    public void setSelectOptions(int i4) {
        this.mPickerOptions.option1 = i4;
        reSetCurrentItems();
    }

    public void setTitleText(String str) {
        TextView textView = (TextView) findViewById(C2042R.id.tvTitle);
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        WheelOptions<T> wheelOptions = this.wheelOptions;
        if (wheelOptions != null) {
            wheelOptions.setTypeface(typeface);
        }
    }

    public void setNPicker(List<T> list, List<T> list2) {
        this.wheelOptions.setLinkage(false);
        this.wheelOptions.setNPicker(list, list2, null);
        reSetCurrentItems();
    }

    public void setPicker(T[] tArr) {
        setPicker(Arrays.asList(tArr), (List) null, (List) null);
    }

    public void setPicker(List<T> list, List<List<T>> list2) {
        setPicker(list, list2, (List) null);
    }

    public void setSelectOptions(int i4, int i5) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.option1 = i4;
        pickerOptions.option2 = i5;
        reSetCurrentItems();
    }

    public void setPicker(T[] tArr, T[][] tArr2) {
        ArrayList arrayList = new ArrayList(tArr2[0].length);
        for (T[] tArr3 : tArr2) {
            arrayList.add(Arrays.asList(tArr3));
        }
        this.wheelOptions.setPicker(Arrays.asList(tArr), arrayList, null);
        reSetCurrentItems();
    }

    public void setNPicker(T[] tArr, T[] tArr2, T[] tArr3) {
        setNPicker(Arrays.asList(tArr), Arrays.asList(tArr2), Arrays.asList(tArr3));
    }

    public void setNPicker(List<T> list, List<T> list2, List<T> list3) {
        this.wheelOptions.setLinkage(false);
        this.wheelOptions.setNPicker(list, list2, list3);
        reSetCurrentItems();
    }

    public void setSelectOptions(int i4, int i5, int i6) {
        PickerOptions pickerOptions = this.mPickerOptions;
        pickerOptions.option1 = i4;
        pickerOptions.option2 = i5;
        pickerOptions.option3 = i6;
        reSetCurrentItems();
    }

    public void setPicker(List<T> list, List<List<T>> list2, List<List<List<T>>> list3) {
        this.wheelOptions.setPicker(list, list2, list3);
        reSetCurrentItems();
    }

    public void setPicker(T[] tArr, T[][] tArr2, T[][][] tArr3) {
        ArrayList arrayList = new ArrayList(tArr2[0].length);
        for (T[] tArr4 : tArr2) {
            arrayList.add(Arrays.asList(tArr4));
        }
        ArrayList arrayList2 = new ArrayList(tArr3[0][0].length);
        for (T[][] tArr5 : tArr3) {
            ArrayList arrayList3 = new ArrayList(tArr3[0].length);
            for (T[] tArr6 : tArr5) {
                arrayList3.add(Arrays.asList(tArr6));
            }
            arrayList2.add(arrayList3);
        }
        this.wheelOptions.setPicker(Arrays.asList(tArr), arrayList, arrayList2);
        reSetCurrentItems();
    }
}
