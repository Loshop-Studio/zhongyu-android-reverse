package androidx.compose.material.icons.outlined;

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

    public static final ImageVector getOfflineBolt(Icons.Outlined outlined) {
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.OfflineBolt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        pathBuilder.moveTo(12.0f, 19.98f);
        pathBuilder.curveToRelative(-4.4f, 0.0f, -7.98f, -3.58f, -7.98f, -7.98f);
        pathBuilder.reflectiveCurveTo(7.6f, 4.02f, 12.0f, 4.02f);
        pathBuilder.reflectiveCurveTo(19.98f, 7.6f, 19.98f, 12.0f);
        pathBuilder.reflectiveCurveTo(16.4f, 19.98f, 12.0f, 19.98f);
        pathBuilder.close();
        pathBuilder.moveTo(12.75f, 5.0f);
        pathBuilder.lineToRelative(-4.5f, 8.5f);
        pathBuilder.horizontalLineToRelative(3.14f);
        pathBuilder.lineTo(11.39f, 19.0f);
        pathBuilder.lineToRelative(4.36f, -8.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineBolt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
