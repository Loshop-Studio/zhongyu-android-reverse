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
public final class EditAttributesKt {
    private static ImageVector _editAttributes;

    public static final ImageVector getEditAttributes(Icons.TwoTone twoTone) {
        ImageVector imageVector = _editAttributes;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EditAttributes", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.63f, 9.0f);
        pathBuilder.horizontalLineTo(6.37f);
        pathBuilder.curveTo(5.09f, 9.0f, 4.0f, 10.37f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.09f, 3.0f, 2.37f, 3.0f);
        pathBuilder.horizontalLineToRelative(11.26f);
        pathBuilder.curveToRelative(1.28f, 0.0f, 2.37f, -1.37f, 2.37f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.09f, -3.0f, -2.37f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.24f, 14.46f);
        pathBuilder.lineToRelative(-2.57f, -2.57f);
        pathBuilder.lineToRelative(0.7f, -0.7f);
        pathBuilder.lineToRelative(1.87f, 1.87f);
        pathBuilder.lineToRelative(3.52f, -3.52f);
        pathBuilder.lineToRelative(0.7f, 0.7f);
        pathBuilder.lineToRelative(-4.22f, 4.22f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.63f, 7.0f);
        pathBuilder2.lineTo(6.37f, 7.0f);
        pathBuilder2.curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f);
        pathBuilder2.horizontalLineToRelative(11.26f);
        pathBuilder2.curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.63f, 15.0f);
        pathBuilder2.lineTo(6.37f, 15.0f);
        pathBuilder2.curveTo(5.09f, 15.0f, 4.0f, 13.63f, 4.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(1.09f, -3.0f, 2.37f, -3.0f);
        pathBuilder2.horizontalLineToRelative(11.26f);
        pathBuilder2.curveTo(18.91f, 9.0f, 20.0f, 10.37f, 20.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.09f, 3.0f, -2.37f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.24f, 13.06f);
        pathBuilder2.lineToRelative(-1.87f, -1.87f);
        pathBuilder2.lineToRelative(-0.7f, 0.7f);
        pathBuilder2.lineToRelative(2.57f, 2.57f);
        pathBuilder2.lineToRelative(4.22f, -4.22f);
        pathBuilder2.lineToRelative(-0.7f, -0.7f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editAttributes = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
