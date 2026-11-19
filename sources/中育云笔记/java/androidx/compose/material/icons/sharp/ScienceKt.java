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
public final class ScienceKt {
    private static ImageVector _science;

    public static final ImageVector getScience(Icons.Sharp sharp) {
        ImageVector imageVector = _science;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Science", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.8f, 18.4f);
        pathBuilder.lineTo(14.0f, 10.67f);
        pathBuilder.verticalLineTo(6.5f);
        pathBuilder.lineToRelative(1.35f, -1.69f);
        pathBuilder.curveTo(15.61f, 4.48f, 15.38f, 4.0f, 14.96f, 4.0f);
        pathBuilder.horizontalLineTo(9.04f);
        pathBuilder.curveTo(8.62f, 4.0f, 8.39f, 4.48f, 8.65f, 4.81f);
        pathBuilder.lineTo(10.0f, 6.5f);
        pathBuilder.verticalLineToRelative(4.17f);
        pathBuilder.lineTo(4.2f, 18.4f);
        pathBuilder.curveTo(3.71f, 19.06f, 4.18f, 20.0f, 5.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveTo(19.82f, 20.0f, 20.29f, 19.06f, 19.8f, 18.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _science = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
