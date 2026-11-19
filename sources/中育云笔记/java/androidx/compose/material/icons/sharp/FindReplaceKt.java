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
public final class FindReplaceKt {
    private static ImageVector _findReplace;

    public static final ImageVector getFindReplace(Icons.Sharp sharp) {
        ImageVector imageVector = _findReplace;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FindReplace", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 6.0f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.63f, 0.56f, 3.54f, 1.46f);
        pathBuilder.lineTo(12.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineTo(18.0f, 4.0f);
        pathBuilder.lineToRelative(-2.05f, 2.05f);
        pathBuilder.curveTo(14.68f, 4.78f, 12.93f, 4.0f, 11.0f, 4.0f);
        pathBuilder.curveToRelative(-3.53f, 0.0f, -6.43f, 2.61f, -6.92f, 6.0f);
        pathBuilder.lineTo(6.1f, 10.0f);
        pathBuilder.curveToRelative(0.46f, -2.28f, 2.48f, -4.0f, 4.9f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.64f, 15.14f);
        pathBuilder.curveToRelative(0.66f, -0.9f, 1.12f, -1.97f, 1.28f, -3.14f);
        pathBuilder.lineTo(15.9f, 12.0f);
        pathBuilder.curveToRelative(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.63f, -0.56f, -3.54f, -1.46f);
        pathBuilder.lineTo(10.0f, 12.0f);
        pathBuilder.lineTo(4.0f, 12.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineToRelative(2.05f, -2.05f);
        pathBuilder.curveTo(7.32f, 17.22f, 9.07f, 18.0f, 11.0f, 18.0f);
        pathBuilder.curveToRelative(1.55f, 0.0f, 2.98f, -0.51f, 4.14f, -1.36f);
        pathBuilder.lineTo(20.0f, 21.49f);
        pathBuilder.lineTo(21.49f, 20.0f);
        pathBuilder.lineToRelative(-4.85f, -4.86f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _findReplace = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
