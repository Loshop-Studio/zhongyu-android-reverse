package androidx.compose.material.icons.filled;

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

/* loaded from: classes.dex */
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.Filled filled) {
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.OfflineBolt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.02f);
        pathBuilder.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        pathBuilder.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        pathBuilder.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        pathBuilder.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        pathBuilder.close();
        pathBuilder.moveTo(11.48f, 20.0f);
        pathBuilder.verticalLineToRelative(-6.26f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.lineTo(13.0f, 4.0f);
        pathBuilder.verticalLineToRelative(6.26f);
        pathBuilder.horizontalLineToRelative(3.35f);
        pathBuilder.lineTo(11.48f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineBolt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
