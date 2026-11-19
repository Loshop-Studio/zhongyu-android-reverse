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
public final class RotateLeftKt {
    private static ImageVector _rotateLeft;

    public static final ImageVector getRotateLeft(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rotateLeft;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RotateLeft", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 17.91f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveToRelative(3.95f, -0.49f, 7.0f, -3.85f, 7.0f, -7.93f);
        pathBuilder.reflectiveCurveToRelative(-3.05f, -7.44f, -7.0f, -7.93f);
        pathBuilder.lineTo(13.0f, 1.0f);
        pathBuilder.lineTo(8.45f, 5.55f);
        pathBuilder.lineTo(13.0f, 10.0f);
        pathBuilder.lineTo(13.0f, 6.09f);
        pathBuilder.curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f);
        pathBuilder.reflectiveCurveToRelative(-2.16f, 5.43f, -5.0f, 5.91f);
        pathBuilder.close();
        pathBuilder.moveTo(5.69f, 16.89f);
        pathBuilder.lineToRelative(1.41f, -1.42f);
        pathBuilder.curveToRelative(-0.52f, -0.75f, -0.87f, -1.59f, -1.01f, -2.47f);
        pathBuilder.lineTo(4.07f, 13.0f);
        pathBuilder.curveToRelative(0.17f, 1.39f, 0.72f, 2.73f, 1.62f, 3.89f);
        pathBuilder.close();
        pathBuilder.moveTo(7.11f, 8.53f);
        pathBuilder.lineTo(5.7f, 7.11f);
        pathBuilder.curveTo(4.8f, 8.27f, 4.24f, 9.61f, 4.07f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveToRelative(0.14f, -0.87f, 0.49f, -1.72f, 1.02f, -2.47f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 17.9f);
        pathBuilder.curveToRelative(-0.87f, -0.15f, -1.71f, -0.49f, -2.46f, -1.03f);
        pathBuilder.lineTo(7.1f, 18.32f);
        pathBuilder.curveToRelative(1.16f, 0.9f, 2.51f, 1.44f, 3.9f, 1.61f);
        pathBuilder.lineTo(11.0f, 17.9f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rotateLeft = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getRotateLeft$annotations(Icons.TwoTone twoTone) {
    }
}
