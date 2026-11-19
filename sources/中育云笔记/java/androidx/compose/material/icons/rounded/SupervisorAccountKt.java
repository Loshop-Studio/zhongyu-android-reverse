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

/* loaded from: classes.dex */
public final class SupervisorAccountKt {
    private static ImageVector _supervisorAccount;

    public static final ImageVector getSupervisorAccount(Icons.Rounded rounded) {
        ImageVector imageVector = _supervisorAccount;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SupervisorAccount", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 12.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.49f, -1.12f, 2.49f, -2.5f);
        pathBuilder.reflectiveCurveTo(17.88f, 7.0f, 16.5f, 7.0f);
        pathBuilder.reflectiveCurveTo(14.0f, 8.12f, 14.0f, 9.5f);
        pathBuilder.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 11.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        pathBuilder.reflectiveCurveTo(10.66f, 5.0f, 9.0f, 5.0f);
        pathBuilder.reflectiveCurveTo(6.0f, 6.34f, 6.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 14.0f);
        pathBuilder.curveToRelative(-1.83f, 0.0f, -5.5f, 0.92f, -5.5f, 2.75f);
        pathBuilder.lineTo(11.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.25f);
        pathBuilder.curveToRelative(0.0f, -1.83f, -3.67f, -2.75f, -5.5f, -2.75f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 13.0f);
        pathBuilder.curveToRelative(-2.33f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        pathBuilder.lineTo(2.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.25f);
        pathBuilder.curveToRelative(0.0f, -0.85f, 0.33f, -2.34f, 2.37f, -3.47f);
        pathBuilder.curveTo(10.5f, 13.1f, 9.66f, 13.0f, 9.0f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _supervisorAccount = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
