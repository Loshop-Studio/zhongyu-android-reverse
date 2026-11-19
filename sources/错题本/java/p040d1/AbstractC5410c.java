package p040d1;

import android.graphics.drawable.Drawable;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import com.zykj.view.board.play.C5353b;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;

/* renamed from: d1.c */
/* loaded from: classes2.dex */
public abstract class AbstractC5410c {

    /* renamed from: a */
    public static final Object f8370a = AbstractC5773a.m5116a(LazyThreadSafetyMode.NONE, new C5353b(4));

    /* renamed from: a */
    public static final long m4800a(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? Size.INSTANCE.m10518getUnspecifiedNHjbRc() : SizeKt.Size(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }
}
