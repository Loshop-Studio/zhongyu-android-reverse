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
public final class Rotate90DegreesCwKt {
    private static ImageVector _rotate90DegreesCw;

    public static final ImageVector getRotate90DegreesCw(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rotate90DegreesCw;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Rotate90DegreesCw", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.64f, 19.37f);
        pathBuilder.curveToRelative(3.03f, 3.03f, 7.67f, 3.44f, 11.15f, 1.25f);
        pathBuilder.lineToRelative(-1.46f, -1.46f);
        pathBuilder.curveToRelative(-2.66f, 1.43f, -6.04f, 1.03f, -8.28f, -1.21f);
        pathBuilder.curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0.0f, -9.9f);
        pathBuilder.curveTo(7.42f, 6.69f, 9.21f, 6.03f, 11.0f, 6.03f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(3.01f);
        pathBuilder.curveToRelative(-2.3f, 0.0f, -4.61f, 0.87f, -6.36f, 2.63f);
        pathBuilder.curveTo(1.12f, 10.15f, 1.12f, 15.85f, 4.64f, 19.37f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 13.0f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.lineToRelative(6.0f, -6.0f);
        pathBuilder.lineToRelative(-6.0f, -6.0f);
        pathBuilder.lineTo(11.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 16.17f);
        pathBuilder.lineTo(13.83f, 13.0f);
        pathBuilder.lineTo(17.0f, 9.83f);
        pathBuilder.lineTo(20.17f, 13.0f);
        pathBuilder.lineTo(17.0f, 16.17f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.817f, 12.995f);
        pathBuilder2.lineToRelative(3.175f, -3.175f);
        pathBuilder2.lineToRelative(3.175f, 3.175f);
        pathBuilder2.lineToRelative(-3.175f, 3.175f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCw = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
