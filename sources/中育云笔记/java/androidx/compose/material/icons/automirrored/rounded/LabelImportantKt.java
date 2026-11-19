package androidx.compose.material.icons.automirrored.rounded;

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
public final class LabelImportantKt {
    private static ImageVector _labelImportant;

    public static final ImageVector getLabelImportant(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _labelImportant;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.LabelImportant", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.94f, 18.99f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.curveToRelative(0.65f, 0.0f, 1.26f, -0.31f, 1.63f, -0.84f);
        pathBuilder.lineToRelative(3.95f, -5.57f);
        pathBuilder.curveToRelative(0.25f, -0.35f, 0.25f, -0.81f, 0.0f, -1.16f);
        pathBuilder.lineToRelative(-3.96f, -5.58f);
        pathBuilder.curveTo(16.26f, 5.31f, 15.65f, 5.0f, 15.0f, 5.0f);
        pathBuilder.horizontalLineTo(5.94f);
        pathBuilder.curveToRelative(-0.81f, 0.0f, -1.28f, 0.93f, -0.81f, 1.59f);
        pathBuilder.lineTo(9.0f, 12.0f);
        pathBuilder.lineToRelative(-3.87f, 5.41f);
        pathBuilder.curveToRelative(-0.47f, 0.66f, 0.0f, 1.58f, 0.81f, 1.58f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _labelImportant = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
