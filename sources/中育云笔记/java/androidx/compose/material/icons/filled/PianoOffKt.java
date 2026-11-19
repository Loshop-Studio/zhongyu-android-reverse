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
public final class PianoOffKt {
    private static ImageVector _pianoOff;

    public static final ImageVector getPianoOff(Icons.Filled filled) {
        ImageVector imageVector = _pianoOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PianoOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(3.0f, 5.83f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(13.17f);
        pathBuilder.lineToRelative(1.61f, 1.61f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        pathBuilder.moveTo(8.25f, 19.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(7.83f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(3.67f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.25f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.75f, 19.0f);
        pathBuilder.verticalLineToRelative(-4.5f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.curveToRelative(0.46f, 0.0f, 0.82f, -0.31f, 0.94f, -0.73f);
        pathBuilder.lineToRelative(3.31f, 3.31f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(9.75f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 8.17f);
        pathBuilder.lineTo(5.83f, 3.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(13.17f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(8.5f);
        pathBuilder.curveToRelative(0.0f, 0.19f, -0.07f, 0.36f, -0.16f, 0.51f);
        pathBuilder.lineTo(13.0f, 10.17f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(8.17f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pianoOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
