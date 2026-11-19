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
public final class LabelKt {
    private static ImageVector _label;

    public static final ImageVector getLabel(Icons.Outlined outlined) {
        ImageVector imageVector = _label;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Label", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.63f, 5.84f);
        pathBuilder.curveTo(17.27f, 5.33f, 16.67f, 5.0f, 16.0f, 5.0f);
        pathBuilder.lineTo(5.0f, 5.01f);
        pathBuilder.curveTo(3.9f, 5.01f, 3.0f, 5.9f, 3.0f, 7.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 1.99f, 2.0f, 1.99f);
        pathBuilder.lineTo(16.0f, 19.0f);
        pathBuilder.curveToRelative(0.67f, 0.0f, 1.27f, -0.33f, 1.63f, -0.84f);
        pathBuilder.lineTo(22.0f, 12.0f);
        pathBuilder.lineToRelative(-4.37f, -6.16f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 17.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(11.0f);
        pathBuilder.lineToRelative(3.55f, 5.0f);
        pathBuilder.lineTo(16.0f, 17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _label = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getLabel$annotations(Icons.Outlined outlined) {
    }
}
