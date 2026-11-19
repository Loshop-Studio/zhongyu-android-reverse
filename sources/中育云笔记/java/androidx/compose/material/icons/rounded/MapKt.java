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
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.Rounded rounded) {
        ImageVector imageVector = _map;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Map", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.65f, 4.98f);
        pathBuilder.lineToRelative(-5.0f, -1.75f);
        pathBuilder.curveToRelative(-0.42f, -0.15f, -0.88f, -0.15f, -1.3f, -0.01f);
        pathBuilder.lineTo(4.36f, 4.56f);
        pathBuilder.curveTo(3.55f, 4.84f, 3.0f, 5.6f, 3.0f, 6.46f);
        pathBuilder.verticalLineToRelative(11.85f);
        pathBuilder.curveToRelative(0.0f, 1.41f, 1.41f, 2.37f, 2.72f, 1.86f);
        pathBuilder.lineToRelative(2.93f, -1.14f);
        pathBuilder.curveToRelative(0.22f, -0.09f, 0.47f, -0.09f, 0.69f, -0.01f);
        pathBuilder.lineToRelative(5.0f, 1.75f);
        pathBuilder.curveToRelative(0.42f, 0.15f, 0.88f, 0.15f, 1.3f, 0.01f);
        pathBuilder.lineToRelative(3.99f, -1.34f);
        pathBuilder.curveToRelative(0.81f, -0.27f, 1.36f, -1.04f, 1.36f, -1.9f);
        pathBuilder.verticalLineTo(5.69f);
        pathBuilder.curveToRelative(0.0f, -1.41f, -1.41f, -2.37f, -2.72f, -1.86f);
        pathBuilder.lineToRelative(-2.93f, 1.14f);
        pathBuilder.curveToRelative(-0.22f, 0.08f, -0.46f, 0.09f, -0.69f, 0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 18.89f);
        pathBuilder.lineToRelative(-6.0f, -2.11f);
        pathBuilder.verticalLineTo(5.11f);
        pathBuilder.lineToRelative(6.0f, 2.11f);
        pathBuilder.verticalLineToRelative(11.67f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
