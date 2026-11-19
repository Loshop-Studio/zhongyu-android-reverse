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
public final class TagFacesKt {
    private static ImageVector _tagFaces;

    public static final ImageVector getTagFaces(Icons.Sharp sharp) {
        ImageVector imageVector = _tagFaces;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TagFaces", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.01f, 2.0f);
        pathBuilder.curveTo(6.49f, 2.0f, 2.02f, 6.48f, 2.02f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.curveToRelative(5.53f, 0.0f, 10.01f, -4.48f, 10.01f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.54f, 2.0f, 12.01f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.02f, 20.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.52f, 11.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(16.35f, 8.0f, 15.52f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(8.52f, 11.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(9.35f, 8.0f, 8.52f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.02f, 17.5f);
        pathBuilder.curveToRelative(2.33f, 0.0f, 4.31f, -1.46f, 5.11f, -3.5f);
        pathBuilder.lineTo(6.91f, 14.0f);
        pathBuilder.curveToRelative(0.8f, 2.04f, 2.78f, 3.5f, 5.11f, 3.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tagFaces = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
