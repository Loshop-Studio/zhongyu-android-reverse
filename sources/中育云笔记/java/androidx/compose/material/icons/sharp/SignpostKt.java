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
public final class SignpostKt {
    private static ImageVector _signpost;

    public static final ImageVector getSignpost(Icons.Sharp sharp) {
        ImageVector imageVector = _signpost;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Signpost", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineTo(5.5f);
        pathBuilder.curveTo(4.67f, 4.0f, 4.0f, 4.67f, 4.0f, 5.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(4.0f, 9.33f, 4.67f, 10.0f, 5.5f, 10.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(6.62f);
        pathBuilder.curveToRelative(-0.4f, 0.0f, -0.78f, 0.16f, -1.06f, 0.44f);
        pathBuilder.lineToRelative(-1.5f, 1.5f);
        pathBuilder.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilder.lineToRelative(1.5f, 1.5f);
        pathBuilder.curveTo(5.84f, 17.84f, 6.22f, 18.0f, 6.62f, 18.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(5.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(4.38f);
        pathBuilder.curveToRelative(0.4f, 0.0f, 0.78f, -0.16f, 1.06f, -0.44f);
        pathBuilder.lineToRelative(1.5f, -1.5f);
        pathBuilder.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        pathBuilder.lineToRelative(-1.5f, -1.5f);
        pathBuilder.curveTo(18.16f, 4.16f, 17.78f, 4.0f, 17.38f, 4.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveTo(13.0f, 2.45f, 12.55f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signpost = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
