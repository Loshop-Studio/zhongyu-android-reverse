package androidx.compose.material.icons.sharp;

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
public final class HealingKt {
    private static ImageVector _healing;

    public static final ImageVector getHealing(Icons.Sharp sharp) {
        ImageVector imageVector = _healing;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Healing", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.74f, 12.01f);
        pathBuilder.lineToRelative(4.68f, -4.68f);
        pathBuilder.lineToRelative(-5.75f, -5.75f);
        pathBuilder.lineToRelative(-4.68f, 4.68f);
        pathBuilder.lineTo(7.3f, 1.58f);
        pathBuilder.lineTo(1.55f, 7.34f);
        pathBuilder.lineToRelative(4.68f, 4.69f);
        pathBuilder.lineToRelative(-4.68f, 4.68f);
        pathBuilder.lineToRelative(5.75f, 5.75f);
        pathBuilder.lineToRelative(4.68f, -4.68f);
        pathBuilder.lineToRelative(4.69f, 4.69f);
        pathBuilder.lineToRelative(5.76f, -5.76f);
        pathBuilder.lineToRelative(-4.69f, -4.7f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 9.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.29f, 10.96f);
        pathBuilder.lineTo(3.66f, 7.34f);
        pathBuilder.lineToRelative(3.63f, -3.63f);
        pathBuilder.lineToRelative(3.62f, 3.62f);
        pathBuilder.lineToRelative(-3.62f, 3.63f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 11.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.66f, 20.34f);
        pathBuilder.lineToRelative(-3.63f, -3.62f);
        pathBuilder.lineToRelative(3.63f, -3.63f);
        pathBuilder.lineToRelative(3.62f, 3.62f);
        pathBuilder.lineToRelative(-3.62f, 3.63f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _healing = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
