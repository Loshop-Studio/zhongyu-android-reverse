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
public final class InsertLinkKt {
    private static ImageVector _insertLink;

    public static final ImageVector getInsertLink(Icons.Rounded rounded) {
        ImageVector imageVector = _insertLink;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.InsertLink", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.96f, 11.38f);
        pathBuilder.curveTo(4.24f, 9.91f, 5.62f, 8.9f, 7.12f, 8.9f);
        pathBuilder.horizontalLineToRelative(2.93f);
        pathBuilder.curveToRelative(0.52f, 0.0f, 0.95f, -0.43f, 0.95f, -0.95f);
        pathBuilder.reflectiveCurveTo(10.57f, 7.0f, 10.05f, 7.0f);
        pathBuilder.lineTo(7.22f, 7.0f);
        pathBuilder.curveToRelative(-2.61f, 0.0f, -4.94f, 1.91f, -5.19f, 4.51f);
        pathBuilder.curveTo(1.74f, 14.49f, 4.08f, 17.0f, 7.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(3.05f);
        pathBuilder.curveToRelative(0.52f, 0.0f, 0.95f, -0.43f, 0.95f, -0.95f);
        pathBuilder.reflectiveCurveToRelative(-0.43f, -0.95f, -0.95f, -0.95f);
        pathBuilder.lineTo(7.0f, 15.1f);
        pathBuilder.curveToRelative(-1.91f, 0.0f, -3.42f, -1.74f, -3.04f, -3.72f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.lineTo(9.0f, 11.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.78f, 7.0f);
        pathBuilder.horizontalLineToRelative(-2.83f);
        pathBuilder.curveToRelative(-0.52f, 0.0f, -0.95f, 0.43f, -0.95f, 0.95f);
        pathBuilder.reflectiveCurveToRelative(0.43f, 0.95f, 0.95f, 0.95f);
        pathBuilder.horizontalLineToRelative(2.93f);
        pathBuilder.curveToRelative(1.5f, 0.0f, 2.88f, 1.01f, 3.16f, 2.48f);
        pathBuilder.curveToRelative(0.38f, 1.98f, -1.13f, 3.72f, -3.04f, 3.72f);
        pathBuilder.horizontalLineToRelative(-3.05f);
        pathBuilder.curveToRelative(-0.52f, 0.0f, -0.95f, 0.43f, -0.95f, 0.95f);
        pathBuilder.reflectiveCurveToRelative(0.43f, 0.95f, 0.95f, 0.95f);
        pathBuilder.lineTo(17.0f, 17.0f);
        pathBuilder.curveToRelative(2.92f, 0.0f, 5.26f, -2.51f, 4.98f, -5.49f);
        pathBuilder.curveToRelative(-0.25f, -2.6f, -2.59f, -4.51f, -5.2f, -4.51f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _insertLink = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
