package androidx.compose.material.icons.filled;

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
public final class BoltKt {
    private static ImageVector _bolt;

    public static final ImageVector getBolt(Icons.Filled filled) {
        ImageVector imageVector = _bolt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Bolt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineToRelative(1.0f, -7.0f);
        pathBuilder.horizontalLineTo(7.5f);
        pathBuilder.curveToRelative(-0.58f, 0.0f, -0.57f, -0.32f, -0.38f, -0.66f);
        pathBuilder.curveToRelative(0.19f, -0.34f, 0.05f, -0.08f, 0.07f, -0.12f);
        pathBuilder.curveTo(8.48f, 10.94f, 10.42f, 7.54f, 13.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(-1.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.49f, 0.0f, 0.56f, 0.33f, 0.47f, 0.51f);
        pathBuilder.lineToRelative(-0.07f, 0.15f);
        pathBuilder.curveTo(12.96f, 17.55f, 11.0f, 21.0f, 11.0f, 21.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bolt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
