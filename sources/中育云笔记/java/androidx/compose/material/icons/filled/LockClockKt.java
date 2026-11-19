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
public final class LockClockKt {
    private static ImageVector _lockClock;

    public static final ImageVector getLockClock(Icons.Filled filled) {
        ImageVector imageVector = _lockClock;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LockClock", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.5f, 14.2f);
        pathBuilder.lineToRelative(2.9f, 1.7f);
        pathBuilder.lineToRelative(-0.8f, 1.3f);
        pathBuilder.lineTo(13.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(4.2f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.curveToRelative(-2.02f, 0.0f, -3.86f, -0.76f, -5.27f, -2.0f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.curveToRelative(-1.15f, 0.0f, -2.0f, -0.85f, -2.0f, -2.0f);
        pathBuilder.lineTo(2.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -1.12f, 0.89f, -1.96f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.curveTo(4.0f, 4.01f, 6.01f, 2.0f, 8.5f, 2.0f);
        pathBuilder.curveToRelative(2.34f, 0.0f, 4.24f, 1.79f, 4.46f, 4.08f);
        pathBuilder.curveToRelative(0.34f, -0.05f, 0.69f, -0.08f, 1.04f, -0.08f);
        pathBuilder.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(-0.74f);
        pathBuilder.curveTo(10.88f, 4.99f, 9.8f, 4.0f, 8.5f, 4.0f);
        pathBuilder.curveTo(7.12f, 4.0f, 6.0f, 5.12f, 6.0f, 6.5f);
        pathBuilder.lineTo(6.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lockClock = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
