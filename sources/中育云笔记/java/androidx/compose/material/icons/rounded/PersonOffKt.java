package androidx.compose.material.icons.rounded;

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
public final class PersonOffKt {
    private static ImageVector _personOff;

    public static final ImageVector getPersonOff(Icons.Rounded rounded) {
        ImageVector imageVector = _personOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PersonOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.65f, 5.82f);
        pathBuilder.curveTo(9.36f, 4.72f, 10.6f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 1.4f, -0.72f, 2.64f, -1.82f, 3.35f);
        pathBuilder.lineTo(8.65f, 5.82f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 17.17f);
        pathBuilder.curveToRelative(-0.02f, -1.1f, -0.63f, -2.11f, -1.61f, -2.62f);
        pathBuilder.curveToRelative(-0.54f, -0.28f, -1.13f, -0.54f, -1.77f, -0.76f);
        pathBuilder.lineTo(20.0f, 17.17f);
        pathBuilder.close();
        pathBuilder.moveTo(20.49f, 20.49f);
        pathBuilder.lineTo(3.51f, 3.51f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(8.18f, 8.18f);
        pathBuilder.curveToRelative(-1.82f, 0.23f, -3.41f, 0.8f, -4.7f, 1.46f);
        pathBuilder.curveTo(4.6f, 15.08f, 4.0f, 16.11f, 4.0f, 17.22f);
        pathBuilder.lineTo(4.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(13.17f);
        pathBuilder.lineToRelative(1.9f, 1.9f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
