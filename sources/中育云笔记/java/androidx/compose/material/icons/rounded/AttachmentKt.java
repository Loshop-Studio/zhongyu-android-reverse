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
public final class AttachmentKt {
    private static ImageVector _attachment;

    public static final ImageVector getAttachment(Icons.Rounded rounded) {
        ImageVector imageVector = _attachment;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Attachment", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.75f, 16.0f);
        pathBuilder.horizontalLineTo(7.17f);
        pathBuilder.curveToRelative(-2.09f, 0.0f, -3.95f, -1.53f, -4.15f, -3.61f);
        pathBuilder.curveTo(2.79f, 10.01f, 4.66f, 8.0f, 7.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(12.36f);
        pathBuilder.curveToRelative(1.31f, 0.0f, 2.5f, 0.94f, 2.63f, 2.24f);
        pathBuilder.curveToRelative(0.15f, 1.5f, -1.02f, 2.76f, -2.49f, 2.76f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(8.75f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.horizontalLineTo(9.14f);
        pathBuilder.curveToRelative(-1.31f, 0.0f, -2.5f, 0.94f, -2.63f, 2.24f);
        pathBuilder.curveToRelative(-0.15f, 1.5f, 1.02f, 2.76f, 2.49f, 2.76f);
        pathBuilder.horizontalLineToRelative(10.33f);
        pathBuilder.curveToRelative(2.09f, 0.0f, 3.95f, -1.53f, 4.15f, -3.61f);
        pathBuilder.curveToRelative(0.23f, -2.39f, -1.64f, -4.39f, -3.98f, -4.39f);
        pathBuilder.horizontalLineTo(7.23f);
        pathBuilder.curveToRelative(-2.87f, 0.0f, -5.44f, 2.1f, -5.71f, 4.96f);
        pathBuilder.curveToRelative(-0.3f, 3.29f, 2.26f, 6.04f, 5.48f, 6.04f);
        pathBuilder.horizontalLineToRelative(10.75f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        pathBuilder.reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachment = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
