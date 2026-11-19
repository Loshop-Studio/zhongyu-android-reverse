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
public final class AttachFileKt {
    private static ImageVector _attachFile;

    public static final ImageVector getAttachFile(Icons.Rounded rounded) {
        ImageVector imageVector = _attachFile;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AttachFile", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 6.75f);
        pathBuilder.verticalLineToRelative(10.58f);
        pathBuilder.curveToRelative(0.0f, 2.09f, -1.53f, 3.95f, -3.61f, 4.15f);
        pathBuilder.curveToRelative(-2.39f, 0.23f, -4.39f, -1.64f, -4.39f, -3.98f);
        pathBuilder.verticalLineTo(5.14f);
        pathBuilder.curveToRelative(0.0f, -1.31f, 0.94f, -2.5f, 2.24f, -2.63f);
        pathBuilder.curveToRelative(1.5f, -0.15f, 2.76f, 1.02f, 2.76f, 2.49f);
        pathBuilder.verticalLineToRelative(10.5f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(6.75f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(8.61f);
        pathBuilder.curveToRelative(0.0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f);
        pathBuilder.curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f);
        pathBuilder.verticalLineTo(5.17f);
        pathBuilder.curveToRelative(0.0f, -2.09f, -1.53f, -3.95f, -3.61f, -4.15f);
        pathBuilder.curveTo(9.01f, 0.79f, 7.0f, 2.66f, 7.0f, 5.0f);
        pathBuilder.verticalLineToRelative(12.27f);
        pathBuilder.curveToRelative(0.0f, 2.87f, 2.1f, 5.44f, 4.96f, 5.71f);
        pathBuilder.curveToRelative(3.29f, 0.3f, 6.04f, -2.26f, 6.04f, -5.48f);
        pathBuilder.verticalLineTo(6.75f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachFile = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
