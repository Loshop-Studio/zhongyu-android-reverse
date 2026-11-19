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
public final class AndroidKt {
    private static ImageVector _android;

    public static final ImageVector getAndroid(Icons.TwoTone twoTone) {
        ImageVector imageVector = _android;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Android", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.6f, 9.48f);
        pathBuilder.lineToRelative(1.84f, -3.18f);
        pathBuilder.curveToRelative(0.16f, -0.31f, 0.04f, -0.69f, -0.26f, -0.85f);
        pathBuilder.curveToRelative(-0.29f, -0.15f, -0.65f, -0.06f, -0.83f, 0.22f);
        pathBuilder.lineToRelative(-1.88f, 3.24f);
        pathBuilder.curveToRelative(-2.86f, -1.21f, -6.08f, -1.21f, -8.94f, 0.0f);
        pathBuilder.lineTo(5.65f, 5.67f);
        pathBuilder.curveToRelative(-0.19f, -0.29f, -0.58f, -0.38f, -0.87f, -0.2f);
        pathBuilder.curveTo(4.5f, 5.65f, 4.41f, 6.01f, 4.56f, 6.3f);
        pathBuilder.lineTo(6.4f, 9.48f);
        pathBuilder.curveTo(3.3f, 11.25f, 1.28f, 14.44f, 1.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(22.0f);
        pathBuilder.curveTo(22.72f, 14.44f, 20.7f, 11.25f, 17.6f, 9.48f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 15.25f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        pathBuilder.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveTo(8.25f, 13.31f, 8.25f, 14.0f);
        pathBuilder.curveTo(8.25f, 14.69f, 7.69f, 15.25f, 7.0f, 15.25f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 15.25f);
        pathBuilder.curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f);
        pathBuilder.curveToRelative(0.0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        pathBuilder.reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f);
        pathBuilder.curveTo(18.25f, 14.69f, 17.69f, 15.25f, 17.0f, 15.25f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _android = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
