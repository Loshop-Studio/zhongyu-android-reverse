package p316z1;

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
import com.xuexiang.xui.utils.AbstractC6877g;
import java.lang.reflect.Field;

/* renamed from: z1.b */
/* loaded from: classes4.dex */
public abstract class AbstractC10702b {
    /* renamed from: a */
    public static ColorStateList m20009a(Context context, int i10) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{AbstractC6877g.m6479m(context, R$attr.colorControlNormal), AbstractC6877g.m6479m(context, R$attr.colorControlNormal), i10});
    }

    /* renamed from: b */
    public static void m20010b(EditText editText, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i11 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {ContextCompat.getDrawable(editText.getContext(), i11), ContextCompat.getDrawable(editText.getContext(), i11)};
            Drawable drawable = drawableArr[0];
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                drawable2.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            }
            declaredField3.set(obj, drawableArr);
        } catch (NoSuchFieldException e10) {
            e10.getMessage();
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m20011c(CheckBox checkBox, int i10) {
        int iM6471e = AbstractC6877g.m6471e(checkBox.getContext());
        m20012d(checkBox, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{AbstractC6877g.m6479m(checkBox.getContext(), R$attr.colorControlNormal), i10, iM6471e, iM6471e}));
    }

    /* renamed from: d */
    public static void m20012d(CheckBox checkBox, ColorStateList colorStateList) {
        checkBox.setButtonTintList(colorStateList);
    }

    /* renamed from: e */
    public static void m20013e(EditText editText, int i10) {
        ColorStateList colorStateListM20009a = m20009a(editText.getContext(), i10);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(colorStateListM20009a);
        } else {
            editText.setBackgroundTintList(colorStateListM20009a);
        }
        m20010b(editText, i10);
    }

    /* renamed from: f */
    public static void m20014f(RadioButton radioButton, int i10) {
        int iM6471e = AbstractC6877g.m6471e(radioButton.getContext());
        m20015g(radioButton, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{AbstractC6877g.m6479m(radioButton.getContext(), R$attr.colorControlNormal), i10, iM6471e, iM6471e}));
    }

    /* renamed from: g */
    public static void m20015g(RadioButton radioButton, ColorStateList colorStateList) {
        radioButton.setButtonTintList(colorStateList);
    }
}
