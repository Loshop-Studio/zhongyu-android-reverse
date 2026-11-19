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
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class HelpCenterKt {
    private static ImageVector _helpCenter;

    public static final ImageVector getHelpCenter(Icons.Outlined outlined) {
        ImageVector imageVector = _helpCenter;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HelpCenter", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.25f, 16.74f);
        pathBuilder.curveToRelative(0.0f, 0.69f, -0.53f, 1.26f, -1.25f, 1.26f);
        pathBuilder.curveToRelative(-0.7f, 0.0f, -1.26f, -0.56f, -1.26f, -1.26f);
        pathBuilder.curveToRelative(0.0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f);
        pathBuilder.curveTo(12.71f, 15.49f, 13.25f, 16.04f, 13.25f, 16.74f);
        pathBuilder.close();
        pathBuilder.moveTo(11.99f, 6.0f);
        pathBuilder.curveToRelative(-1.77f, 0.0f, -2.98f, 1.15f, -3.43f, 2.49f);
        pathBuilder.lineToRelative(1.64f, 0.69f);
        pathBuilder.curveToRelative(0.22f, -0.67f, 0.74f, -1.48f, 1.8f, -1.48f);
        pathBuilder.curveToRelative(1.62f, 0.0f, 1.94f, 1.52f, 1.37f, 2.33f);
        pathBuilder.curveToRelative(-0.54f, 0.77f, -1.47f, 1.29f, -1.96f, 2.16f);
        pathBuilder.curveToRelative(-0.39f, 0.69f, -0.31f, 1.49f, -0.31f, 1.98f);
        pathBuilder.horizontalLineToRelative(1.82f);
        pathBuilder.curveToRelative(0.0f, -0.93f, 0.07f, -1.12f, 0.22f, -1.41f);
        pathBuilder.curveToRelative(0.39f, -0.72f, 1.11f, -1.06f, 1.87f, -2.17f);
        pathBuilder.curveToRelative(0.68f, -1.0f, 0.42f, -2.36f, -0.02f, -3.08f);
        pathBuilder.curveTo(14.48f, 6.67f, 13.47f, 6.0f, 11.99f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 5.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.lineTo(19.0f, 3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _helpCenter = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getHelpCenter$annotations(Icons.Outlined outlined) {
    }
}
