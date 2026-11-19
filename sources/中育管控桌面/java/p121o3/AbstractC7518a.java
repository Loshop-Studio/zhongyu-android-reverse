package p121o3;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.p009ui.unit.TextUnitKt;
import kotlin.ranges.RangesKt;

/* renamed from: o3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7518a {
    /* renamed from: a */
    public static final long m8673a(int i6) {
        float f6 = i6 / 1280;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return TextUnitKt.getSp(f6 * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
    }
}
