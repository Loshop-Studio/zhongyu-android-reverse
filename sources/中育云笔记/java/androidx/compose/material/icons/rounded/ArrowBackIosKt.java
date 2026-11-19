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
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class ArrowBackIosKt {
    private static ImageVector _arrowBackIos;

    public static final ImageVector getArrowBackIos(Icons.Rounded rounded) {
        ImageVector imageVector = _arrowBackIos;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ArrowBackIos", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.62f, 2.99f);
        pathBuilder.curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0.0f);
        pathBuilder.lineTo(6.54f, 11.3f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(8.31f, 8.31f);
        pathBuilder.curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.49f, -1.28f, 0.0f, -1.77f);
        pathBuilder.lineTo(9.38f, 12.0f);
        pathBuilder.lineToRelative(7.25f, -7.25f);
        pathBuilder.curveToRelative(0.48f, -0.48f, 0.48f, -1.28f, -0.01f, -1.76f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _arrowBackIos = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getArrowBackIos$annotations(Icons.Rounded rounded) {
    }
}
