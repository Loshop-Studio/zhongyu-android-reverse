package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class MilitaryTechKt {
    private static ImageVector _militaryTech;

    public static final ImageVector getMilitaryTech(Icons.TwoTone twoTone) {
        ImageVector imageVector = _militaryTech;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MilitaryTech", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 11.07f);
        pathBuilder.lineToRelative(2.0f, -1.2f);
        pathBuilder.lineToRelative(0.0f, -5.87f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 4.0f);
        pathBuilder2.lineToRelative(0.0f, 5.87f);
        pathBuilder2.lineToRelative(2.0f, 1.2f);
        pathBuilder2.lineToRelative(0.0f, -7.07f);
        pathBuilder2.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw3 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk83 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(17.0f, 10.43f);
        pathBuilder3.verticalLineTo(2.0f);
        pathBuilder3.horizontalLineTo(7.0f);
        pathBuilder3.verticalLineToRelative(8.43f);
        pathBuilder3.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        pathBuilder3.lineToRelative(4.18f, 2.51f);
        pathBuilder3.lineToRelative(-0.99f, 2.34f);
        pathBuilder3.lineToRelative(-3.41f, 0.29f);
        pathBuilder3.lineToRelative(2.59f, 2.24f);
        pathBuilder3.lineTo(9.07f, 22.0f);
        pathBuilder3.lineTo(12.0f, 20.23f);
        pathBuilder3.lineTo(14.93f, 22.0f);
        pathBuilder3.lineToRelative(-0.78f, -3.33f);
        pathBuilder3.lineToRelative(2.59f, -2.24f);
        pathBuilder3.lineToRelative(-3.41f, -0.29f);
        pathBuilder3.lineToRelative(-0.99f, -2.34f);
        pathBuilder3.lineToRelative(4.18f, -2.51f);
        pathBuilder3.curveTo(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f);
        pathBuilder3.close();
        pathBuilder3.moveTo(11.0f, 11.07f);
        pathBuilder3.lineToRelative(-2.0f, -1.2f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(11.07f);
        pathBuilder3.close();
        pathBuilder3.moveTo(15.0f, 9.87f);
        pathBuilder3.lineToRelative(-2.0f, 1.2f);
        pathBuilder3.verticalLineTo(4.0f);
        pathBuilder3.horizontalLineToRelative(2.0f);
        pathBuilder3.verticalLineTo(9.87f);
        pathBuilder3.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw3, iM24639getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _militaryTech = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
