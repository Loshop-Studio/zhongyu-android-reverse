package p017b2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC5859g;
import java.lang.reflect.Field;

/* renamed from: b2.b */
/* loaded from: classes3.dex */
public abstract class AbstractC4411b {
    /* renamed from: a */
    public static ColorStateList m1464a(Context context, int i6) {
        int i7 = R$attr.colorControlNormal;
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{AbstractC5859g.m4387m(context, i7), AbstractC5859g.m4387m(context, i7), i6});
    }

    /* renamed from: b */
    public static void m1465b(EditText editText, int i6) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i7 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {ContextCompat.getDrawable(editText.getContext(), i7), ContextCompat.getDrawable(editText.getContext(), i7)};
            Drawable drawable = drawableArr[0];
            if (drawable != null) {
                drawable.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                drawable2.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
            }
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e6) {
            e6.getMessage();
            e6.printStackTrace();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m1466c(CheckBox checkBox, int i6) {
        int iM4379e = AbstractC5859g.m4379e(checkBox.getContext());
        m1467d(checkBox, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{AbstractC5859g.m4387m(checkBox.getContext(), R$attr.colorControlNormal), i6, iM4379e, iM4379e}));
    }

    /* renamed from: d */
    public static void m1467d(CheckBox checkBox, ColorStateList colorStateList) {
        checkBox.setButtonTintList(colorStateList);
    }

    /* renamed from: e */
    public static void m1468e(EditText editText, int i6) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        ColorStateList colorStateListM1464a = m1464a(editText.getContext(), i6);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(colorStateListM1464a);
        } else {
            editText.setBackgroundTintList(colorStateListM1464a);
        }
        m1465b(editText, i6);
    }

    /* renamed from: f */
    public static void m1469f(RadioButton radioButton, int i6) {
        int iM4379e = AbstractC5859g.m4379e(radioButton.getContext());
        m1470g(radioButton, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{AbstractC5859g.m4387m(radioButton.getContext(), R$attr.colorControlNormal), i6, iM4379e, iM4379e}));
    }

    /* renamed from: g */
    public static void m1470g(RadioButton radioButton, ColorStateList colorStateList) {
        radioButton.setButtonTintList(colorStateList);
    }
}
