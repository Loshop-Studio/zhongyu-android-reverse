package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class RollerShadesKt {
    private static ImageVector _rollerShades;

    public static final ImageVector getRollerShades(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rollerShades;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RollerShades", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(-12.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 19.0f);
        pathBuilder2.verticalLineTo(3.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.horizontalLineTo(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(20.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineTo(20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 19.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.verticalLineToRelative(1.82f);
        pathBuilder2.curveToRelative(-0.45f, 0.32f, -0.75f, 0.84f, -0.75f, 1.43f);
        pathBuilder2.curveToRelative(0.0f, 0.97f, 0.78f, 1.75f, 1.75f, 1.75f);
        pathBuilder2.reflectiveCurveToRelative(1.75f, -0.78f, 1.75f, -1.75f);
        pathBuilder2.curveToRelative(0.0f, -0.59f, -0.3f, -1.12f, -0.75f, -1.43f);
        pathBuilder2.verticalLineTo(13.0f);
        pathBuilder2.horizontalLineToRelative(5.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 11.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rollerShades = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
