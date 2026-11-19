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
public final class InterestsKt {
    private static ImageVector _interests;

    public static final ImageVector getInterests(Icons.Sharp sharp) {
        ImageVector imageVector = _interests;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Interests", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.02f, 13.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveTo(9.23f, 13.0f, 7.02f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 13.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 2.0f);
        pathBuilder.lineToRelative(-5.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.lineTo(7.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.25f, 2.5f);
        pathBuilder.curveToRelative(-1.06f, 0.0f, -1.81f, 0.56f, -2.25f, 1.17f);
        pathBuilder.curveToRelative(-0.44f, -0.61f, -1.19f, -1.17f, -2.25f, -1.17f);
        pathBuilder.curveTo(13.19f, 2.5f, 12.0f, 3.78f, 12.0f, 5.25f);
        pathBuilder.curveToRelative(0.0f, 2.0f, 2.42f, 3.42f, 5.0f, 5.75f);
        pathBuilder.curveToRelative(2.58f, -2.33f, 5.0f, -3.75f, 5.0f, -5.75f);
        pathBuilder.curveTo(22.0f, 3.78f, 20.81f, 2.5f, 19.25f, 2.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _interests = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
