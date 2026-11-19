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
public final class SickKt {
    private static ImageVector _sick;

    public static final ImageVector getSick(Icons.Filled filled) {
        ImageVector imageVector = _sick;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Sick", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 9.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 2.0f, -4.0f, 2.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder.curveTo(23.0f, 8.1f, 22.1f, 9.0f, 21.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -0.73f, 0.41f, -1.71f, 0.92f, -2.66f);
        pathBuilder.curveTo(16.68f, 2.88f, 14.44f, 2.0f, 11.99f, 2.0f);
        pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.06f, -1.09f, -0.14f, -1.62f);
        pathBuilder.curveTo(21.58f, 10.45f, 21.3f, 10.5f, 21.0f, 10.5f);
        pathBuilder.curveTo(19.07f, 10.5f, 17.5f, 8.93f, 17.5f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.62f, 7.38f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineTo(15.62f, 9.5f);
        pathBuilder.lineToRelative(1.06f, 1.06f);
        pathBuilder.lineToRelative(-1.06f, 1.06f);
        pathBuilder.lineTo(13.5f, 9.5f);
        pathBuilder.lineTo(15.62f, 7.38f);
        pathBuilder.close();
        pathBuilder.moveTo(7.32f, 8.44f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(10.5f, 9.5f);
        pathBuilder.lineToRelative(-2.12f, 2.12f);
        pathBuilder.lineToRelative(-1.06f, -1.06f);
        pathBuilder.lineTo(8.38f, 9.5f);
        pathBuilder.lineTo(7.32f, 8.44f);
        pathBuilder.close();
        pathBuilder.moveTo(15.44f, 17.0f);
        pathBuilder.curveToRelative(-0.69f, -1.19f, -1.97f, -2.0f, -3.44f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.75f, 0.81f, -3.44f, 2.0f);
        pathBuilder.horizontalLineTo(6.88f);
        pathBuilder.curveToRelative(0.3f, -0.76f, 0.76f, -1.43f, 1.34f, -1.99f);
        pathBuilder.lineTo(5.24f, 13.3f);
        pathBuilder.curveToRelative(-0.45f, 0.26f, -1.01f, 0.28f, -1.49f, 0.0f);
        pathBuilder.curveToRelative(-0.72f, -0.41f, -0.96f, -1.33f, -0.55f, -2.05f);
        pathBuilder.curveToRelative(0.41f, -0.72f, 1.33f, -0.96f, 2.05f, -0.55f);
        pathBuilder.curveToRelative(0.48f, 0.28f, 0.74f, 0.78f, 0.74f, 1.29f);
        pathBuilder.lineToRelative(3.58f, 2.07f);
        pathBuilder.curveToRelative(0.73f, -0.36f, 1.55f, -0.56f, 2.43f, -0.56f);
        pathBuilder.curveToRelative(2.33f, 0.0f, 4.32f, 1.45f, 5.12f, 3.5f);
        pathBuilder.horizontalLineTo(15.44f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sick = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
