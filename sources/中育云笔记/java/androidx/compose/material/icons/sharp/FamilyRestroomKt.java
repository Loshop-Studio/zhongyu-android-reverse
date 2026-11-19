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
public final class FamilyRestroomKt {
    private static ImageVector _familyRestroom;

    public static final ImageVector getFamilyRestroom(Icons.Sharp sharp) {
        ImageVector imageVector = _familyRestroom;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FamilyRestroom", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 5.11f, 16.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 22.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.lineToRelative(-3.0f, -9.0f);
        pathBuilder.lineToRelative(-3.0f, 0.0f);
        pathBuilder.lineToRelative(-1.17f, 3.5f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 11.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(11.0f, 9.17f, 11.0f, 10.0f);
        pathBuilder.reflectiveCurveTo(11.67f, 11.5f, 12.5f, 11.5f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 6.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(4.39f, 6.0f, 5.5f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 22.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.horizontalLineTo(7.5f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 22.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-5.5f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _familyRestroom = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
