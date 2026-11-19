package p008a7;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import java.util.regex.Pattern;

/* renamed from: a7.o */
/* loaded from: classes5.dex */
public abstract class AbstractC0082o {
    /* renamed from: a */
    public static boolean m226a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* renamed from: b */
    public static boolean m227b(int i10) {
        return i10 > 0;
    }

    /* renamed from: c */
    public static boolean m228c(int i10) {
        return i10 != 0;
    }

    /* renamed from: d */
    public static boolean m229d(String str) {
        return Pattern.compile("\\([^)]*\\)").matcher(str).find();
    }

    /* renamed from: e */
    public static boolean m230e(String str) {
        int i10 = 0;
        while (Pattern.compile("%[^%]*\\d").matcher(str).find()) {
            i10++;
        }
        return i10 >= 2;
    }

    /* renamed from: f */
    public static boolean m231f(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: g */
    public static ColorFilter m232g(Context context, int i10) {
        return BlendModeColorFilterCompat.createBlendModeColorFilterCompat(ContextCompat.getColor(context, i10), BlendModeCompat.SRC_ATOP);
    }
}
