package androidx.compose.material.icons.outlined;

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
public final class ScienceKt {
    private static ImageVector _science;

    public static final ImageVector getScience(Icons.Outlined outlined) {
        ImageVector imageVector = _science;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Science", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 11.33f);
        pathBuilder.lineTo(18.0f, 18.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.lineToRelative(5.0f, -6.67f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.moveTo(15.96f, 4.0f);
        pathBuilder.horizontalLineTo(8.04f);
        pathBuilder.curveTo(7.62f, 4.0f, 7.39f, 4.48f, 7.65f, 4.81f);
        pathBuilder.lineTo(9.0f, 6.5f);
        pathBuilder.verticalLineToRelative(4.17f);
        pathBuilder.lineTo(3.2f, 18.4f);
        pathBuilder.curveTo(2.71f, 19.06f, 3.18f, 20.0f, 4.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.82f, 0.0f, 1.29f, -0.94f, 0.8f, -1.6f);
        pathBuilder.lineTo(15.0f, 10.67f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.lineToRelative(1.35f, -1.69f);
        pathBuilder.curveTo(16.61f, 4.48f, 16.38f, 4.0f, 15.96f, 4.0f);
        pathBuilder.lineTo(15.96f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _science = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
