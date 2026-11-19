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
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class HelpCenterKt {
    private static ImageVector _helpCenter;

    public static final ImageVector getHelpCenter(Icons.TwoTone twoTone) {
        ImageVector imageVector = _helpCenter;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.HelpCenter", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.01f, 18.0f);
        pathBuilder.curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f);
        pathBuilder.curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 1.25f, 0.54f, 1.25f, 1.25f);
        pathBuilder.curveTo(13.25f, 17.43f, 12.72f, 18.0f, 12.01f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.02f, 10.6f);
        pathBuilder.curveToRelative(-0.76f, 1.11f, -1.48f, 1.46f, -1.87f, 2.17f);
        pathBuilder.curveToRelative(-0.16f, 0.29f, -0.22f, 0.48f, -0.22f, 1.41f);
        pathBuilder.horizontalLineToRelative(-1.82f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.08f, -1.29f, 0.31f, -1.98f);
        pathBuilder.curveToRelative(0.49f, -0.87f, 1.42f, -1.39f, 1.96f, -2.16f);
        pathBuilder.curveToRelative(0.57f, -0.81f, 0.25f, -2.33f, -1.37f, -2.33f);
        pathBuilder.curveToRelative(-1.06f, 0.0f, -1.58f, 0.8f, -1.8f, 1.48f);
        pathBuilder.lineTo(8.56f, 8.49f);
        pathBuilder.curveTo(9.01f, 7.15f, 10.22f, 6.0f, 11.99f, 6.0f);
        pathBuilder.curveToRelative(1.48f, 0.0f, 2.49f, 0.67f, 3.01f, 1.52f);
        pathBuilder.curveTo(15.44f, 8.24f, 15.7f, 9.59f, 15.02f, 10.6f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.25f, 16.74f);
        pathBuilder2.curveToRelative(0.0f, 0.69f, -0.53f, 1.26f, -1.25f, 1.26f);
        pathBuilder2.curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f);
        pathBuilder2.curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f);
        pathBuilder2.curveTo(12.71f, 15.49f, 13.25f, 16.04f, 13.25f, 16.74f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.99f, 6.0f);
        pathBuilder2.curveToRelative(-1.77f, 0.0f, -2.98f, 1.15f, -3.43f, 2.49f);
        pathBuilder2.lineToRelative(1.64f, 0.69f);
        pathBuilder2.curveToRelative(0.22f, -0.67f, 0.74f, -1.48f, 1.8f, -1.48f);
        pathBuilder2.curveToRelative(1.62f, 0.0f, 1.94f, 1.52f, 1.37f, 2.33f);
        pathBuilder2.curveToRelative(-0.54f, 0.77f, -1.47f, 1.29f, -1.96f, 2.16f);
        pathBuilder2.curveToRelative(-0.39f, 0.69f, -0.31f, 1.49f, -0.31f, 1.98f);
        pathBuilder2.horizontalLineToRelative(1.82f);
        pathBuilder2.curveToRelative(0.0f, -0.93f, 0.07f, -1.12f, 0.22f, -1.41f);
        pathBuilder2.curveToRelative(0.39f, -0.72f, 1.11f, -1.06f, 1.87f, -2.17f);
        pathBuilder2.curveToRelative(0.68f, -1.0f, 0.42f, -2.36f, -0.02f, -3.08f);
        pathBuilder2.curveTo(14.48f, 6.67f, 13.47f, 6.0f, 11.99f, 6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 5.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.moveTo(19.0f, 3.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.verticalLineTo(5.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.lineTo(19.0f, 3.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _helpCenter = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getHelpCenter$annotations(Icons.TwoTone twoTone) {
    }
}
