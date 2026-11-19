package com.xuexiang.xui.widget.spinner.materialspinner;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.utils.Utils;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class MaterialSpinner extends AppCompatTextView {
    private MaterialSpinnerBaseAdapter mAdapter;
    private int mArrowColor;
    private int mArrowColorDisabled;
    private Drawable mArrowDrawable;
    private int mBackgroundColor;
    private int mDropDownOffset;
    private boolean mHideArrow;
    private boolean mIsInDialog;
    private ListView mListView;
    private boolean mNothingSelected;
    private OnItemSelectedListener mOnItemSelectedListener;
    private OnNoMoreChoiceListener mOnNoMoreChoiceListener;
    private OnNothingSelectedListener mOnNothingSelectedListener;
    private PopupWindow mPopupWindow;
    private int mPopupWindowHeight;
    private int mPopupWindowMaxHeight;
    private int mSelectedIndex;
    private int mTextColor;

    public interface OnItemSelectedListener<T> {
        void onItemSelected(MaterialSpinner materialSpinner, int i4, long j4, T t3);
    }

    public interface OnNoMoreChoiceListener {
        void OnNoMoreChoice(MaterialSpinner materialSpinner);
    }

    public interface OnNothingSelectedListener {
        void onNothingSelected(MaterialSpinner materialSpinner);
    }

    public MaterialSpinner(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void animateArrow(boolean z3) {
        ObjectAnimator.ofInt(this.mArrowDrawable, "level", z3 ? 0 : 10000, z3 ? 10000 : 0).start();
    }

    private int[] calculatePopWindowPos(View view) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int screenHeight = Utils.getScreenHeight(getContext());
        int listViewHeightBasedOnChildren = Utils.getListViewHeightBasedOnChildren(this.mListView);
        int i4 = this.mPopupWindowMaxHeight;
        if (i4 > 0 && listViewHeightBasedOnChildren > i4) {
            listViewHeightBasedOnChildren = i4;
        }
        if ((screenHeight - iArr2[1]) - height < listViewHeightBasedOnChildren) {
            iArr[0] = iArr2[0];
            iArr[1] = (iArr2[1] - listViewHeightBasedOnChildren) - this.mDropDownOffset;
        } else {
            iArr[0] = iArr2[0];
            iArr[1] = iArr2[1] + height;
        }
        return iArr;
    }

    private int calculatePopWindowYOffset(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        int screenHeight = Utils.getScreenHeight(getContext());
        int listViewHeightBasedOnChildren = Utils.getListViewHeightBasedOnChildren(this.mListView);
        int i4 = this.mPopupWindowMaxHeight;
        if (i4 > 0 && listViewHeightBasedOnChildren > i4) {
            listViewHeightBasedOnChildren = i4;
        }
        if (screenHeight - iArr[1] < listViewHeightBasedOnChildren + height) {
            return -(listViewHeightBasedOnChildren + this.mDropDownOffset + height);
        }
        return 0;
    }

    private int calculatePopupWindowHeight() {
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.mAdapter;
        if (materialSpinnerBaseAdapter == null) {
            return -2;
        }
        float count = materialSpinnerBaseAdapter.getCount() * ThemeUtils.resolveDimension(getContext(), C2042R.attr.ms_item_height_size);
        int i4 = this.mPopupWindowMaxHeight;
        if (i4 > 0 && count > i4) {
            return i4;
        }
        int i5 = this.mPopupWindowHeight;
        if (i5 == -1 || i5 == -2 || i5 > count) {
            return -2;
        }
        return i5;
    }

    private boolean hasMoreChoice() {
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.mAdapter;
        return materialSpinnerBaseAdapter != null && materialSpinnerBaseAdapter.getCount() > 0;
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) throws NoSuchMethodException, SecurityException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.MaterialSpinner, i4, 0);
        int defaultColor = getTextColors().getDefaultColor();
        try {
            this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.MaterialSpinner_ms_background_color, -1);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MaterialSpinner_ms_background_selector, 0);
            this.mTextColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.MaterialSpinner_ms_text_color, defaultColor);
            this.mArrowDrawable = ResUtils.getDrawableAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.MaterialSpinner_ms_arrow_image);
            this.mArrowColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.MaterialSpinner_ms_arrow_tint, this.mTextColor);
            this.mHideArrow = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.MaterialSpinner_ms_hide_arrow, false);
            this.mPopupWindowMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.MaterialSpinner_ms_dropdown_max_height, 0);
            this.mPopupWindowHeight = typedArrayObtainStyledAttributes.getLayoutDimension(C2042R.styleable.MaterialSpinner_ms_dropdown_height, -2);
            this.mArrowColorDisabled = ResUtils.lighter(this.mArrowColor, 0.8f);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MaterialSpinner_ms_entries, 0);
            Drawable drawableAttrRes = ResUtils.getDrawableAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.MaterialSpinner_ms_dropdown_bg);
            this.mIsInDialog = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.MaterialSpinner_ms_in_dialog, false);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.MaterialSpinner_ms_pop_anim_style, -1);
            typedArrayObtainStyledAttributes.recycle();
            int iResolveDimension = ThemeUtils.resolveDimension(getContext(), C2042R.attr.ms_padding_top_size);
            int iResolveDimension2 = ThemeUtils.resolveDimension(getContext(), C2042R.attr.ms_padding_left_size);
            Context context2 = getContext();
            int i5 = C2042R.attr.ms_dropdown_offset;
            this.mDropDownOffset = ThemeUtils.resolveDimension(context2, i5);
            setGravity(8388627);
            setClickable(true);
            setPaddingRelative(iResolveDimension2, iResolveDimension, iResolveDimension, iResolveDimension);
            setBackgroundResource(C2042R.drawable.ms_background_selector);
            if (!this.mHideArrow) {
                if (this.mArrowDrawable == null) {
                    this.mArrowDrawable = ResUtils.getVectorDrawable(getContext(), C2042R.drawable.ms_ic_arrow_up).mutate();
                }
                this.mArrowDrawable.setColorFilter(this.mArrowColor, PorterDuff.Mode.SRC_IN);
                int iResolveDimension3 = ThemeUtils.resolveDimension(getContext(), C2042R.attr.ms_arrow_size);
                this.mArrowDrawable.setBounds(0, 0, iResolveDimension3, iResolveDimension3);
                setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.mArrowDrawable, (Drawable) null);
            }
            ListView listView = new ListView(context);
            this.mListView = listView;
            listView.setId(getId());
            this.mListView.setDivider(null);
            this.mListView.setItemsCanFocus(true);
            int iResolveDimension4 = ThemeUtils.resolveDimension(getContext(), i5);
            this.mListView.setPadding(iResolveDimension4, iResolveDimension4, iResolveDimension4, iResolveDimension4);
            this.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i6, long j4) {
                    if (i6 >= MaterialSpinner.this.mSelectedIndex && i6 < MaterialSpinner.this.mAdapter.getCount()) {
                        i6++;
                    }
                    int i7 = i6;
                    MaterialSpinner.this.mSelectedIndex = i7;
                    MaterialSpinner.this.mNothingSelected = false;
                    Object obj = MaterialSpinner.this.mAdapter.get(i7);
                    MaterialSpinner.this.mAdapter.notifyItemSelected(i7);
                    MaterialSpinner.this.setText(obj.toString());
                    MaterialSpinner.this.collapse();
                    if (MaterialSpinner.this.mOnItemSelectedListener != null) {
                        MaterialSpinner.this.mOnItemSelectedListener.onItemSelected(MaterialSpinner.this, i7, j4, obj);
                    }
                }
            });
            if (resourceId2 != 0) {
                setItems(ResUtils.getStringArray(resourceId2));
            }
            PopupWindow popupWindow = new PopupWindow(context);
            this.mPopupWindow = popupWindow;
            popupWindow.setContentView(this.mListView);
            this.mPopupWindow.setOutsideTouchable(true);
            if (resourceId3 != -1) {
                this.mPopupWindow.setAnimationStyle(resourceId3);
            }
            this.mPopupWindow.setFocusable(true);
            this.mPopupWindow.setInputMethodMode(2);
            this.mPopupWindow.setSoftInputMode(48);
            this.mPopupWindow.setElevation(16.0f);
            if (drawableAttrRes != null) {
                this.mPopupWindow.setBackgroundDrawable(drawableAttrRes);
            } else {
                this.mPopupWindow.setBackgroundDrawable(ResUtils.getDrawable(getContext(), C2042R.drawable.ms_drop_down_bg));
            }
            int i6 = this.mBackgroundColor;
            if (i6 != -1) {
                setBackgroundColor(i6);
            } else if (resourceId != 0) {
                setBackgroundResource(resourceId);
            }
            int i7 = this.mTextColor;
            if (i7 != defaultColor) {
                setTextColor(i7);
            }
            this.mPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner.2
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    if (MaterialSpinner.this.mNothingSelected && MaterialSpinner.this.mOnNothingSelectedListener != null) {
                        MaterialSpinner.this.mOnNothingSelectedListener.onNothingSelected(MaterialSpinner.this);
                    }
                    if (MaterialSpinner.this.mHideArrow) {
                        return;
                    }
                    MaterialSpinner.this.animateArrow(false);
                }
            });
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setAdapterInternal(MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter) {
        this.mListView.setAdapter((ListAdapter) materialSpinnerBaseAdapter);
        if (this.mSelectedIndex >= materialSpinnerBaseAdapter.getCount()) {
            this.mSelectedIndex = 0;
        }
        if (materialSpinnerBaseAdapter.getCount() >= 0) {
            setText(materialSpinnerBaseAdapter.get(this.mSelectedIndex).toString());
        } else {
            setText("");
        }
    }

    private void showPopupWindow() {
        if (this.mIsInDialog) {
            this.mPopupWindow.showAsDropDown(this);
        } else {
            this.mPopupWindow.showAsDropDown(this, 0, calculatePopWindowYOffset(this));
        }
    }

    public void collapse() {
        if (!this.mHideArrow) {
            animateArrow(false);
        }
        this.mPopupWindow.dismiss();
    }

    public void expand() {
        if (hasMoreChoice()) {
            if (!this.mHideArrow) {
                animateArrow(true);
            }
            this.mNothingSelected = true;
            showPopupWindow();
            return;
        }
        OnNoMoreChoiceListener onNoMoreChoiceListener = this.mOnNoMoreChoiceListener;
        if (onNoMoreChoiceListener != null) {
            onNoMoreChoiceListener.OnNoMoreChoice(this);
        }
    }

    public MaterialSpinnerBaseAdapter getAdapter() {
        return this.mAdapter;
    }

    public <T> List<T> getItems() {
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.mAdapter;
        if (materialSpinnerBaseAdapter == null) {
            return null;
        }
        return materialSpinnerBaseAdapter.getItems();
    }

    public ListView getListView() {
        return this.mListView;
    }

    public PopupWindow getPopupWindow() {
        return this.mPopupWindow;
    }

    public int getSelectedIndex() {
        return this.mSelectedIndex;
    }

    public <T> T getSelectedItem() {
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.mAdapter;
        if (materialSpinnerBaseAdapter != null) {
            return (T) materialSpinnerBaseAdapter.get(this.mSelectedIndex);
        }
        return null;
    }

    public <T> int getSpinnerPosition(T t3, List<T> list) {
        if (t3 != null && list != null && list.size() > 0) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                if (t3.equals(list.get(i4))) {
                    return i4;
                }
            }
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        this.mPopupWindow.setHeight(calculatePopupWindowHeight());
        if (this.mAdapter != null) {
            CharSequence text = getText();
            String string = text.toString();
            for (int i6 = 0; i6 < this.mAdapter.getCount(); i6++) {
                String itemText = this.mAdapter.getItemText(i6);
                if (itemText.length() > string.length()) {
                    string = itemText;
                }
            }
            setText(string);
            super.onMeasure(i4, i5);
            setText(text);
        } else {
            super.onMeasure(i4, i5);
        }
        this.mPopupWindow.setWidth(getMeasuredWidth());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            int i4 = bundle.getInt("selected_index");
            this.mSelectedIndex = i4;
            MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.mAdapter;
            if (materialSpinnerBaseAdapter != null) {
                setText(materialSpinnerBaseAdapter.get(i4).toString());
                this.mAdapter.notifyItemSelected(this.mSelectedIndex);
            }
            if (bundle.getBoolean("is_popup_showing") && this.mPopupWindow != null) {
                post(new Runnable() { // from class: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner.3
                    @Override // java.lang.Runnable
                    public void run() {
                        MaterialSpinner.this.expand();
                    }
                });
            }
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.mSelectedIndex);
        PopupWindow popupWindow = this.mPopupWindow;
        if (popupWindow != null) {
            bundle.putBoolean("is_popup_showing", popupWindow.isShowing());
            collapse();
        } else {
            bundle.putBoolean("is_popup_showing", false);
        }
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && isEnabled() && isClickable()) {
            if (this.mPopupWindow.isShowing()) {
                collapse();
            } else {
                expand();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public MaterialSpinner setAdapter(ListAdapter listAdapter) {
        MaterialSpinnerBaseAdapter textSize = new MaterialSpinnerAdapterWrapper(getContext(), listAdapter).setTextColor(this.mTextColor).setTextSize(getTextSize());
        this.mAdapter = textSize;
        setAdapterInternal(textSize);
        return this;
    }

    public void setArrowColor(int i4) {
        this.mArrowColor = i4;
        this.mArrowColorDisabled = ResUtils.lighter(i4, 0.8f);
        Drawable drawable = this.mArrowDrawable;
        if (drawable != null) {
            drawable.setColorFilter(this.mArrowColor, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) throws NoSuchMethodException, SecurityException {
        this.mBackgroundColor = i4;
        Drawable background = getBackground();
        if (background instanceof StateListDrawable) {
            try {
                Method declaredMethod = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                int[] iArr = {ResUtils.darker(i4, 0.85f), i4};
                for (int i5 = 0; i5 < 2; i5++) {
                    ((ColorDrawable) declaredMethod.invoke(background, Integer.valueOf(i5))).setColor(iArr[i5]);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                UILog.m7964e(e4);
            }
        } else if (background != null) {
            background.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
        }
        this.mPopupWindow.getBackground().setColorFilter(i4, PorterDuff.Mode.SRC_IN);
    }

    public MaterialSpinner setDropDownBackgroundSelector(int i4) {
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.mAdapter;
        if (materialSpinnerBaseAdapter != null) {
            materialSpinnerBaseAdapter.setBackgroundSelector(i4);
        }
        return this;
    }

    public void setDropdownHeight(int i4) {
        this.mPopupWindowHeight = i4;
        this.mPopupWindow.setHeight(calculatePopupWindowHeight());
    }

    public void setDropdownMaxHeight(int i4) {
        this.mPopupWindowMaxHeight = i4;
        this.mPopupWindow.setHeight(calculatePopupWindowHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        Drawable drawable = this.mArrowDrawable;
        if (drawable != null) {
            drawable.setColorFilter(z3 ? this.mArrowColor : this.mArrowColorDisabled, PorterDuff.Mode.SRC_IN);
        }
    }

    @SafeVarargs
    public final <T> MaterialSpinner setItems(T... tArr) {
        setItems(Arrays.asList(tArr));
        return this;
    }

    public MaterialSpinner setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.mOnItemSelectedListener = onItemSelectedListener;
        return this;
    }

    public MaterialSpinner setOnNoMoreChoiceListener(OnNoMoreChoiceListener onNoMoreChoiceListener) {
        this.mOnNoMoreChoiceListener = onNoMoreChoiceListener;
        return this;
    }

    public MaterialSpinner setOnNothingSelectedListener(OnNothingSelectedListener onNothingSelectedListener) {
        this.mOnNothingSelectedListener = onNothingSelectedListener;
        return this;
    }

    public MaterialSpinner setSelectedIndex(int i4) {
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.mAdapter;
        if (materialSpinnerBaseAdapter != null) {
            if (i4 < 0 || i4 > materialSpinnerBaseAdapter.getCount()) {
                throw new IllegalArgumentException("Position must be lower than adapter count!");
            }
            this.mAdapter.notifyItemSelected(i4);
            this.mSelectedIndex = i4;
            setText(this.mAdapter.get(i4).toString());
        }
        return this;
    }

    public <T> MaterialSpinner setSelectedItem(T t3) {
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.mAdapter;
        if (materialSpinnerBaseAdapter != null && t3 != null) {
            setSelectedIndex(getSpinnerPosition(t3, materialSpinnerBaseAdapter.getItems()));
        }
        return this;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i4) {
        this.mTextColor = i4;
        super.setTextColor(i4);
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.MaterialSpinnerStyle);
    }

    public <T> MaterialSpinner setItems(List<T> list) {
        MaterialSpinnerBaseAdapter<T> textSize = new MaterialSpinnerAdapter(getContext(), list).setTextColor(this.mTextColor).setTextSize(getTextSize());
        this.mAdapter = textSize;
        setAdapterInternal(textSize);
        return this;
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet, int i4) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i4);
        initAttrs(context, attributeSet, i4);
    }

    public <T> MaterialSpinner setAdapter(MaterialSpinnerAdapter<T> materialSpinnerAdapter) {
        this.mAdapter = materialSpinnerAdapter;
        materialSpinnerAdapter.setTextColor(this.mTextColor);
        this.mAdapter.setTextSize(getTextSize());
        setAdapterInternal(materialSpinnerAdapter);
        return this;
    }
}
