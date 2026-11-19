package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.C0332a;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;
import java.lang.reflect.Field;

@SuppressLint({"PrivateResource"})
/* loaded from: classes.dex */
public class MDTintHelper {
    private static ColorStateList createEditTextColorStateList(Context context, int i4) {
        int i5 = C2042R.attr.colorControlNormal;
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{ThemeUtils.resolveColor(context, i5), ThemeUtils.resolveColor(context, i5), i4});
    }

    private static void setCursorTint(EditText editText, int i4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i5 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {C0332a.m1806d(editText.getContext(), i5), C0332a.m1806d(editText.getContext(), i5)};
            if (drawableArr[0] != null) {
                drawableArr[0].setColorFilter(i4, PorterDuff.Mode.SRC_IN);
            }
            if (drawableArr[1] != null) {
                drawableArr[1].setColorFilter(i4, PorterDuff.Mode.SRC_IN);
            }
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e4) {
            Log.d("MDTintHelper", "Device issue with cursor tinting: " + e4.getMessage());
            e4.printStackTrace();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void setTint(RadioButton radioButton, ColorStateList colorStateList) {
        radioButton.setButtonTintList(colorStateList);
    }

    public static void setTint(RadioButton radioButton, int i4) {
        int disabledColor = ThemeUtils.getDisabledColor(radioButton.getContext());
        setTint(radioButton, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{ThemeUtils.resolveColor(radioButton.getContext(), C2042R.attr.colorControlNormal), i4, disabledColor, disabledColor}));
    }

    public static void setTint(CheckBox checkBox, ColorStateList colorStateList) {
        checkBox.setButtonTintList(colorStateList);
    }

    public static void setTint(CheckBox checkBox, int i4) {
        int disabledColor = ThemeUtils.getDisabledColor(checkBox.getContext());
        setTint(checkBox, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{ThemeUtils.resolveColor(checkBox.getContext(), C2042R.attr.colorControlNormal), i4, disabledColor, disabledColor}));
    }

    public static void setTint(SeekBar seekBar, int i4) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i4);
        seekBar.setThumbTintList(colorStateListValueOf);
        seekBar.setProgressTintList(colorStateListValueOf);
    }

    public static void setTint(ProgressBar progressBar, int i4) {
        setTint(progressBar, i4, false);
    }

    private static void setTint(ProgressBar progressBar, int i4, boolean z3) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i4);
        progressBar.setProgressTintList(colorStateListValueOf);
        progressBar.setSecondaryProgressTintList(colorStateListValueOf);
        if (z3) {
            return;
        }
        progressBar.setIndeterminateTintList(colorStateListValueOf);
    }

    @SuppressLint({"RestrictedApi"})
    public static void setTint(EditText editText, int i4) {
        ColorStateList colorStateListCreateEditTextColorStateList = createEditTextColorStateList(editText.getContext(), i4);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(colorStateListCreateEditTextColorStateList);
        } else {
            editText.setBackgroundTintList(colorStateListCreateEditTextColorStateList);
        }
        setCursorTint(editText, i4);
    }
}
