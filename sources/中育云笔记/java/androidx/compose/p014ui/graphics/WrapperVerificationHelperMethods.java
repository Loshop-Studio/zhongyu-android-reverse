package androidx.compose.p014ui.graphics;

import android.graphics.Paint;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes2.dex */
public final class WrapperVerificationHelperMethods {
    public static final WrapperVerificationHelperMethods INSTANCE = new WrapperVerificationHelperMethods();

    private WrapperVerificationHelperMethods() {
    }

    /* renamed from: setBlendMode-GB0RdKg, reason: not valid java name */
    public final void m31281setBlendModeGB0RdKg(Paint paint, int i10) {
        paint.setBlendMode(AndroidBlendMode_androidKt.m30729toAndroidBlendModes9anfk8(i10));
    }
}
