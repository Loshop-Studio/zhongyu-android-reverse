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
public final class RepartitionKt {
    private static ImageVector _repartition;

    public static final ImageVector getRepartition(Icons.Sharp sharp) {
        ImageVector imageVector = _repartition;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Repartition", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.33f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(3.33f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(10.33f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-3.33f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(3.33f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.0f, 10.0f);
        pathBuilder2.lineToRelative(1.42f, -1.42f);
        pathBuilder2.lineTo(5.83f, 7.0f);
        pathBuilder2.horizontalLineTo(17.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.horizontalLineTo(3.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder2.horizontalLineTo(5.83f);
        pathBuilder2.lineToRelative(1.59f, -1.59f);
        pathBuilder2.lineTo(6.0f, 2.0f);
        pathBuilder2.lineTo(2.0f, 6.0f);
        pathBuilder2.lineTo(6.0f, 10.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _repartition = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
