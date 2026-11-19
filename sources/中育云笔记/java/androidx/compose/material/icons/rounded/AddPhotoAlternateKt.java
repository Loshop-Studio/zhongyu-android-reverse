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
public final class AddPhotoAlternateKt {
    private static ImageVector _addPhotoAlternate;

    public static final ImageVector getAddPhotoAlternate(Icons.Rounded rounded) {
        ImageVector imageVector = _addPhotoAlternate;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddPhotoAlternate", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.02f, 5.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(2.98f);
        pathBuilder.curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f);
        pathBuilder.horizontalLineToRelative(-0.03f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.98f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(-2.01f);
        pathBuilder.curveToRelative(-0.54f, 0.0f, -0.98f, 0.44f, -0.99f, 0.98f);
        pathBuilder.verticalLineToRelative(0.03f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineToRelative(2.01f);
        pathBuilder.curveToRelative(0.0f, 0.54f, 0.44f, 0.99f, 0.99f, 0.98f);
        pathBuilder.horizontalLineToRelative(0.03f);
        pathBuilder.curveToRelative(0.54f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveToRelative(0.54f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f);
        pathBuilder.verticalLineToRelative(-0.04f);
        pathBuilder.curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 9.01f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-1.01f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.03f, -0.21f, -1.41f, -0.58f);
        pathBuilder.curveToRelative(-0.37f, -0.38f, -0.58f, -0.88f, -0.58f, -1.44f);
        pathBuilder.curveToRelative(0.0f, -0.36f, 0.1f, -0.69f, 0.27f, -0.98f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-8.28f);
        pathBuilder.curveToRelative(-0.3f, 0.17f, -0.64f, 0.28f, -1.02f, 0.28f);
        pathBuilder.curveToRelative(-1.09f, -0.01f, -1.98f, -0.9f, -1.98f, -1.99f);
        pathBuilder.close();
        pathBuilder.moveTo(15.96f, 19.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.65f, -0.47f, -0.4f, -0.8f);
        pathBuilder.lineToRelative(1.98f, -2.63f);
        pathBuilder.curveToRelative(0.21f, -0.28f, 0.62f, -0.26f, 0.82f, 0.02f);
        pathBuilder.lineTo(10.0f, 18.0f);
        pathBuilder.lineToRelative(2.61f, -3.48f);
        pathBuilder.curveToRelative(0.2f, -0.26f, 0.59f, -0.27f, 0.79f, -0.01f);
        pathBuilder.lineToRelative(2.95f, 3.68f);
        pathBuilder.curveToRelative(0.26f, 0.33f, 0.03f, 0.81f, -0.39f, 0.81f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addPhotoAlternate = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
