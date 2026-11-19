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
public final class PeopleOutlineKt {
    private static ImageVector _peopleOutline;

    public static final ImageVector getPeopleOutline(Icons.Filled filled) {
        ImageVector imageVector = _peopleOutline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PeopleOutline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 13.0f);
        pathBuilder.curveToRelative(-1.2f, 0.0f, -3.07f, 0.34f, -4.5f, 1.0f);
        pathBuilder.curveToRelative(-1.43f, -0.67f, -3.3f, -1.0f, -4.5f, -1.0f);
        pathBuilder.curveTo(5.33f, 13.0f, 1.0f, 14.08f, 1.0f, 16.25f);
        pathBuilder.lineTo(1.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(22.0f);
        pathBuilder.verticalLineToRelative(-2.75f);
        pathBuilder.curveToRelative(0.0f, -2.17f, -4.33f, -3.25f, -6.5f, -3.25f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 17.5f);
        pathBuilder.horizontalLineToRelative(-10.0f);
        pathBuilder.verticalLineToRelative(-1.25f);
        pathBuilder.curveToRelative(0.0f, -0.54f, 2.56f, -1.75f, 5.0f, -1.75f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 1.21f, 5.0f, 1.75f);
        pathBuilder.verticalLineToRelative(1.25f);
        pathBuilder.close();
        pathBuilder.moveTo(21.5f, 17.5f);
        pathBuilder.lineTo(14.0f, 17.5f);
        pathBuilder.verticalLineToRelative(-1.25f);
        pathBuilder.curveToRelative(0.0f, -0.46f, -0.2f, -0.86f, -0.52f, -1.22f);
        pathBuilder.curveToRelative(0.88f, -0.3f, 1.96f, -0.53f, 3.02f, -0.53f);
        pathBuilder.curveToRelative(2.44f, 0.0f, 5.0f, 1.21f, 5.0f, 1.75f);
        pathBuilder.verticalLineToRelative(1.25f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 12.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(9.43f, 5.0f, 7.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(4.0f, 6.57f, 4.0f, 8.5f);
        pathBuilder.reflectiveCurveTo(5.57f, 12.0f, 7.5f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 6.5f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 12.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(18.43f, 5.0f, 16.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(13.0f, 6.57f, 13.0f, 8.5f);
        pathBuilder.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 6.5f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _peopleOutline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
