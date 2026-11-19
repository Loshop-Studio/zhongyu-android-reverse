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
public final class Rotate90DegreesCcwKt {
    private static ImageVector _rotate90DegreesCcw;

    public static final ImageVector getRotate90DegreesCcw(Icons.Filled filled) {
        ImageVector imageVector = _rotate90DegreesCcw;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Rotate90DegreesCcw", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.34f, 6.41f);
        pathBuilder.lineTo(0.86f, 12.9f);
        pathBuilder.lineToRelative(6.49f, 6.48f);
        pathBuilder.lineToRelative(6.49f, -6.48f);
        pathBuilder.lineToRelative(-6.5f, -6.49f);
        pathBuilder.close();
        pathBuilder.moveTo(3.69f, 12.9f);
        pathBuilder.lineToRelative(3.66f, -3.66f);
        pathBuilder.lineTo(11.0f, 12.9f);
        pathBuilder.lineToRelative(-3.66f, 3.66f);
        pathBuilder.lineToRelative(-3.65f, -3.66f);
        pathBuilder.close();
        pathBuilder.moveTo(19.36f, 6.64f);
        pathBuilder.curveTo(17.61f, 4.88f, 15.3f, 4.0f, 13.0f, 4.0f);
        pathBuilder.lineTo(13.0f, 0.76f);
        pathBuilder.lineTo(8.76f, 5.0f);
        pathBuilder.lineTo(13.0f, 9.24f);
        pathBuilder.lineTo(13.0f, 6.0f);
        pathBuilder.curveToRelative(1.79f, 0.0f, 3.58f, 0.68f, 4.95f, 2.05f);
        pathBuilder.curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0.0f, 9.9f);
        pathBuilder.curveTo(16.58f, 19.32f, 14.79f, 20.0f, 13.0f, 20.0f);
        pathBuilder.curveToRelative(-0.97f, 0.0f, -1.94f, -0.21f, -2.84f, -0.61f);
        pathBuilder.lineToRelative(-1.49f, 1.49f);
        pathBuilder.curveTo(10.02f, 21.62f, 11.51f, 22.0f, 13.0f, 22.0f);
        pathBuilder.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        pathBuilder.curveToRelative(3.52f, -3.51f, 3.52f, -9.21f, 0.0f, -12.72f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotate90DegreesCcw = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
