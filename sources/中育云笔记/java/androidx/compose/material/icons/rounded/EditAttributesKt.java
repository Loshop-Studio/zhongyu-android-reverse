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
public final class EditAttributesKt {
    private static ImageVector _editAttributes;

    public static final ImageVector getEditAttributes(Icons.Rounded rounded) {
        ImageVector imageVector = _editAttributes;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EditAttributes", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.63f, 7.0f);
        pathBuilder.lineTo(6.37f, 7.0f);
        pathBuilder.curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f);
        pathBuilder.horizontalLineToRelative(11.26f);
        pathBuilder.curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.11f, 10.6f);
        pathBuilder.lineTo(7.6f, 14.11f);
        pathBuilder.curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f);
        pathBuilder.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        pathBuilder.lineToRelative(-1.86f, -1.86f);
        pathBuilder.curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(1.51f, 1.51f);
        pathBuilder.lineToRelative(3.16f, -3.16f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.17f, 0.51f, -0.02f, 0.71f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editAttributes = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
