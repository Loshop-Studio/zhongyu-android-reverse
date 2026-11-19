package androidx.compose.material.icons.outlined;

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
public final class Rotate90DegreesCwKt {
    private static ImageVector _rotate90DegreesCw;

    public static final ImageVector getRotate90DegreesCw(Icons.Outlined outlined) {
        ImageVector imageVector = _rotate90DegreesCw;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Rotate90DegreesCw", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 13.0f);
        pathBuilder.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder.curveToRelative(1.76f, 0.0f, 3.4f, -0.51f, 4.79f, -1.38f);
        pathBuilder.lineToRelative(-1.46f, -1.46f);
        pathBuilder.curveTo(13.34f, 19.69f, 12.2f, 20.0f, 11.0f, 20.0f);
        pathBuilder.curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f);
        pathBuilder.horizontalLineToRelative(0.17f);
        pathBuilder.lineTo(9.59f, 7.59f);
        pathBuilder.lineTo(11.0f, 9.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineTo(9.58f, 2.41f);
        pathBuilder.lineTo(11.17f, 4.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.curveTo(6.03f, 4.0f, 2.0f, 8.03f, 2.0f, 13.0f);
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
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCw = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
