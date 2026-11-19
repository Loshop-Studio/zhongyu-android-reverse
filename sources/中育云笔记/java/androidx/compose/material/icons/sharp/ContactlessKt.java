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
public final class ContactlessKt {
    private static ImageVector _contactless;

    public static final ImageVector getContactless(Icons.Sharp sharp) {
        ImageVector imageVector = _contactless;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Contactless", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.46f, 14.45f);
        pathBuilder.lineTo(7.1f, 13.83f);
        pathBuilder.curveToRelative(0.28f, -0.61f, 0.41f, -1.24f, 0.4f, -1.86f);
        pathBuilder.curveToRelative(-0.01f, -0.63f, -0.14f, -1.24f, -0.4f, -1.8f);
        pathBuilder.lineToRelative(1.36f, -0.63f);
        pathBuilder.curveToRelative(0.35f, 0.75f, 0.53f, 1.56f, 0.54f, 2.4f);
        pathBuilder.curveTo(9.01f, 12.8f, 8.83f, 13.64f, 8.46f, 14.45f);
        pathBuilder.close();
        pathBuilder.moveTo(11.53f, 16.01f);
        pathBuilder.lineToRelative(-1.3f, -0.74f);
        pathBuilder.curveToRelative(0.52f, -0.92f, 0.78f, -1.98f, 0.78f, -3.15f);
        pathBuilder.curveToRelative(0.0f, -1.19f, -0.27f, -2.33f, -0.8f, -3.4f);
        pathBuilder.lineToRelative(1.34f, -0.67f);
        pathBuilder.curveToRelative(0.64f, 1.28f, 0.96f, 2.65f, 0.96f, 4.07f);
        pathBuilder.curveTo(12.51f, 13.55f, 12.18f, 14.86f, 11.53f, 16.01f);
        pathBuilder.close();
        pathBuilder.moveTo(14.67f, 17.33f);
        pathBuilder.lineToRelative(-1.35f, -0.66f);
        pathBuilder.curveToRelative(0.78f, -1.6f, 1.18f, -3.18f, 1.18f, -4.69f);
        pathBuilder.curveToRelative(0.0f, -1.51f, -0.4f, -3.07f, -1.18f, -4.64f);
        pathBuilder.lineToRelative(1.34f, -0.67f);
        pathBuilder.curveTo(15.56f, 8.45f, 16.0f, 10.23f, 16.0f, 11.98f);
        pathBuilder.curveTo(16.0f, 13.72f, 15.56f, 15.52f, 14.67f, 17.33f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactless = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
