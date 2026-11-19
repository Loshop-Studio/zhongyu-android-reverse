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
public final class LeakRemoveKt {
    private static ImageVector _leakRemove;

    public static final ImageVector getLeakRemove(Icons.Filled filled) {
        ImageVector imageVector = _leakRemove;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LeakRemove", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 3.0f);
        pathBuilder.lineTo(8.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.37f, -0.04f, 0.72f, -0.12f, 1.06f);
        pathBuilder.lineToRelative(1.59f, 1.59f);
        pathBuilder.curveTo(9.81f, 4.84f, 10.0f, 3.94f, 10.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 4.27f);
        pathBuilder.lineToRelative(2.84f, 2.84f);
        pathBuilder.curveTo(5.03f, 7.67f, 4.06f, 8.0f, 3.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.61f, 0.0f, 3.09f, -0.55f, 4.27f, -1.46f);
        pathBuilder.lineTo(8.7f, 9.97f);
        pathBuilder.curveTo(7.14f, 11.24f, 5.16f, 12.0f, 3.0f, 12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(2.71f, 0.0f, 5.19f, -0.99f, 7.11f, -2.62f);
        pathBuilder.lineToRelative(2.5f, 2.5f);
        pathBuilder.curveTo(10.99f, 15.81f, 10.0f, 18.29f, 10.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.69f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.curveTo(14.55f, 17.91f, 14.0f, 19.39f, 14.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f);
        pathBuilder.lineTo(19.73f, 21.0f);
        pathBuilder.lineTo(21.0f, 19.73f);
        pathBuilder.lineTo(4.27f, 3.0f);
        pathBuilder.lineTo(3.0f, 4.27f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, 1.5f, -0.37f, 2.91f, -1.02f, 4.16f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder.curveTo(13.42f, 6.98f, 14.0f, 5.06f, 14.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.94f, 16.12f);
        pathBuilder.curveToRelative(0.34f, -0.08f, 0.69f, -0.12f, 1.06f, -0.12f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.94f, 0.0f, -1.84f, 0.19f, -2.66f, 0.52f);
        pathBuilder.lineToRelative(1.6f, 1.6f);
        pathBuilder.close();
        pathBuilder.moveTo(15.38f, 11.56f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder.curveTo(18.09f, 12.37f, 19.5f, 12.0f, 21.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-2.06f, 0.0f, -3.98f, 0.58f, -5.62f, 1.56f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leakRemove = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
