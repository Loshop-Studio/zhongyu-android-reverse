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
public final class PersonalInjuryKt {
    private static ImageVector _personalInjury;

    public static final ImageVector getPersonalInjury(Icons.Filled filled) {
        ImageVector imageVector = _personalInjury;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PersonalInjury", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveTo(8.0f, 8.21f, 8.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineToRelative(0.0f, -4.78f);
        pathBuilder.curveToRelative(0.0f, -1.12f, -0.61f, -2.15f, -1.61f, -2.66f);
        pathBuilder.curveToRelative(-0.43f, -0.22f, -0.9f, -0.43f, -1.39f, -0.62f);
        pathBuilder.lineTo(17.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.34f, 17.0f);
        pathBuilder.lineTo(15.0f, 11.33f);
        pathBuilder.curveTo(14.07f, 11.12f, 13.07f, 11.0f, 12.0f, 11.0f);
        pathBuilder.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder.curveTo(4.61f, 13.07f, 4.0f, 14.1f, 4.0f, 15.22f);
        pathBuilder.lineTo(4.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(2.34f);
        pathBuilder.curveTo(6.12f, 21.55f, 6.0f, 21.04f, 6.0f, 20.5f);
        pathBuilder.curveTo(6.0f, 18.57f, 7.57f, 17.0f, 9.5f, 17.0f);
        pathBuilder.horizontalLineTo(12.34f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 22.0f);
        pathBuilder.lineToRelative(1.41f, -3.0f);
        pathBuilder.horizontalLineTo(9.5f);
        pathBuilder.curveTo(8.67f, 19.0f, 8.0f, 19.67f, 8.0f, 20.5f);
        pathBuilder.reflectiveCurveTo(8.67f, 22.0f, 9.5f, 22.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personalInjury = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
