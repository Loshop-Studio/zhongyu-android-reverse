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
public final class DoDisturbOffKt {
    private static ImageVector _doDisturbOff;

    public static final ImageVector getDoDisturbOff(Icons.Outlined outlined) {
        ImageVector imageVector = _doDisturbOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DoDisturbOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.41f, -0.37f, 2.73f, -1.01f, 3.88f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder.curveTo(21.43f, 15.79f, 22.0f, 13.96f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.curveToRelative(-1.96f, 0.0f, -3.79f, 0.57f, -5.33f, 1.55f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder.curveTo(9.27f, 4.37f, 10.59f, 4.0f, 12.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.88f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(17.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.41f, 2.13f);
        pathBuilder.lineTo(1.0f, 3.54f);
        pathBuilder.lineToRelative(2.78f, 2.78f);
        pathBuilder.curveTo(2.66f, 7.93f, 2.0f, 9.89f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.curveToRelative(2.11f, 0.0f, 4.07f, -0.66f, 5.68f, -1.78f);
        pathBuilder.lineTo(20.46f, 23.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.41f, 2.13f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.curveToRelative(0.0f, -1.56f, 0.45f, -3.0f, 1.23f, -4.23f);
        pathBuilder.lineTo(8.46f, 11.0f);
        pathBuilder.lineTo(7.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.46f);
        pathBuilder.lineToRelative(5.77f, 5.77f);
        pathBuilder.curveTo(15.0f, 19.55f, 13.56f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doDisturbOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
