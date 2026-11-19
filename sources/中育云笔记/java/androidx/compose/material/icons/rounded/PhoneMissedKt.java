package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.Rounded rounded) {
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhoneMissed", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.09f, 16.2f);
        pathBuilder.curveToRelative(-6.33f, -5.59f, -15.86f, -5.59f, -22.18f, 0.0f);
        pathBuilder.curveToRelative(-0.84f, 0.74f, -0.84f, 2.05f, -0.05f, 2.84f);
        pathBuilder.lineToRelative(1.2f, 1.2f);
        pathBuilder.curveToRelative(0.71f, 0.71f, 1.84f, 0.77f, 2.62f, 0.15f);
        pathBuilder.lineToRelative(1.97f, -1.57f);
        pathBuilder.curveToRelative(0.47f, -0.37f, 0.75f, -0.94f, 0.75f, -1.55f);
        pathBuilder.verticalLineTo(14.7f);
        pathBuilder.curveToRelative(2.98f, -0.97f, 6.21f, -0.98f, 9.2f, 0.0f);
        pathBuilder.verticalLineToRelative(2.58f);
        pathBuilder.curveToRelative(0.0f, 0.6f, 0.28f, 1.17f, 0.75f, 1.55f);
        pathBuilder.lineToRelative(1.96f, 1.56f);
        pathBuilder.curveToRelative(0.79f, 0.62f, 1.91f, 0.56f, 2.62f, -0.15f);
        pathBuilder.lineToRelative(1.2f, -1.2f);
        pathBuilder.curveToRelative(0.8f, -0.79f, 0.79f, -2.1f, -0.04f, -2.84f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 9.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(6.43f);
        pathBuilder.lineToRelative(4.24f, 4.24f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(5.66f, -5.66f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-4.95f, 4.95f);
        pathBuilder.lineTo(8.4f, 5.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getPhoneMissed$annotations(Icons.Rounded rounded) {
    }
}
