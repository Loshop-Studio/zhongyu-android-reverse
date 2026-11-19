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
public final class UpcomingKt {
    private static ImageVector _upcoming;

    public static final ImageVector getUpcoming(Icons.Sharp sharp) {
        ImageVector imageVector = _upcoming;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Upcoming", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.16f, 7.26f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineTo(16.19f, 9.4f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.curveTo(17.6f, 10.81f, 21.05f, 7.29f, 21.16f, 7.26f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(11.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(5.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(6.4f, 10.81f);
        pathBuilder3.lineTo(7.81f, 9.4f);
        pathBuilder3.lineTo(4.26f, 5.84f);
        pathBuilder3.lineTo(2.84f, 7.26f);
        pathBuilder3.curveTo(2.95f, 7.29f, 6.4f, 10.81f, 6.4f, 10.81f);
        pathBuilder3.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw4 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk84 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(22.0f, 12.0f);
        pathBuilder4.horizontalLineToRelative(-7.0f);
        pathBuilder4.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        pathBuilder4.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder4.horizontalLineTo(2.0f);
        pathBuilder4.verticalLineToRelative(9.0f);
        pathBuilder4.horizontalLineToRelative(20.0f);
        pathBuilder4.verticalLineTo(12.0f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw4, iM31241getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _upcoming = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
