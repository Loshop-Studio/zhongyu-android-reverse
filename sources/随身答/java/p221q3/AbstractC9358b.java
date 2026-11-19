package p221q3;

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
import com.xuexiang.xui.utils.AbstractC6801g;
import java.lang.reflect.Field;

/* renamed from: q3.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9358b {
    /* renamed from: a */
    public static ColorStateList m15326a(Context context, int i9) {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{AbstractC6801g.m6479l(context, R$attr.colorControlNormal), AbstractC6801g.m6479l(context, R$attr.colorControlNormal), i9});
    }

    /* renamed from: b */
    public static void m15327b(EditText editText, int i9) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i10 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable[] drawableArr = {ContextCompat.getDrawable(editText.getContext(), i10), ContextCompat.getDrawable(editText.getContext(), i10)};
            Drawable drawable = drawableArr[0];
            if (drawable != null) {
                drawable.setColorFilter(i9, PorterDuff.Mode.SRC_IN);
            }
            Drawable drawable2 = drawableArr[1];
            if (drawable2 != null) {
                drawable2.setColorFilter(i9, PorterDuff.Mode.SRC_IN);
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
    public static void m15328c(CheckBox checkBox, int i9) {
        int iM6472e = AbstractC6801g.m6472e(checkBox.getContext());
        m15329d(checkBox, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{AbstractC6801g.m6479l(checkBox.getContext(), R$attr.colorControlNormal), i9, iM6472e, iM6472e}));
    }

    /* renamed from: d */
    public static void m15329d(CheckBox checkBox, ColorStateList colorStateList) {
        checkBox.setButtonTintList(colorStateList);
    }

    /* renamed from: e */
    public static void m15330e(EditText editText, int i9) {
        ColorStateList colorStateListM15326a = m15326a(editText.getContext(), i9);
        if (editText instanceof AppCompatEditText) {
            ((AppCompatEditText) editText).setSupportBackgroundTintList(colorStateListM15326a);
        } else {
            editText.setBackgroundTintList(colorStateListM15326a);
        }
        m15327b(editText, i9);
    }

    /* renamed from: f */
    public static void m15331f(RadioButton radioButton, int i9) {
        int iM6472e = AbstractC6801g.m6472e(radioButton.getContext());
        m15332g(radioButton, new ColorStateList(new int[][]{new int[]{R.attr.state_enabled, -16842912}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{-16842910, -16842912}, new int[]{-16842910, R.attr.state_checked}}, new int[]{AbstractC6801g.m6479l(radioButton.getContext(), R$attr.colorControlNormal), i9, iM6472e, iM6472e}));
    }

    /* renamed from: g */
    public static void m15332g(RadioButton radioButton, ColorStateList colorStateList) {
        radioButton.setButtonTintList(colorStateList);
    }
}
