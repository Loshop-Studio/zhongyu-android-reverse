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
public final class AttachmentKt {
    private static ImageVector _attachment;

    public static final ImageVector getAttachment(Icons.Sharp sharp) {
        ImageVector imageVector = _attachment;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Attachment", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 16.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(12.5f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.reflectiveCurveTo(20.88f, 13.0f, 19.5f, 13.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(9.5f);
        pathBuilder.verticalLineTo(9.5f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        pathBuilder.reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f);
        pathBuilder.horizontalLineToRelative(10.5f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-3.04f, 0.0f, -5.5f, 2.46f, -5.5f, 5.5f);
        pathBuilder.reflectiveCurveToRelative(2.46f, 5.5f, 5.5f, 5.5f);
        pathBuilder.horizontalLineToRelative(11.5f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachment = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
