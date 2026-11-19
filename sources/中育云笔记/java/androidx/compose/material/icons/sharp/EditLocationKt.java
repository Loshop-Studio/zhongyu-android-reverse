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
public final class EditLocationKt {
    private static ImageVector _editLocation;

    public static final ImageVector getEditLocation(Icons.Sharp sharp) {
        ImageVector imageVector = _editLocation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EditLocation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.11f, 1.77f);
        pathBuilder.lineTo(19.78f, 0.1f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(-1.67f, 1.67f);
        pathBuilder.lineToRelative(-2.12f, -2.12f);
        pathBuilder.close();
        pathBuilder.moveTo(17.11f, 2.77f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineTo(13.12f, 11.0f);
        pathBuilder.lineTo(11.0f, 11.0f);
        pathBuilder.lineTo(11.0f, 8.89f);
        pathBuilder.lineToRelative(6.11f, -6.12f);
        pathBuilder.close();
        pathBuilder.moveTo(15.13f, 2.64f);
        pathBuilder.lineTo(9.5f, 8.27f);
        pathBuilder.verticalLineToRelative(4.24f);
        pathBuilder.horizontalLineToRelative(4.24f);
        pathBuilder.lineToRelative(5.62f, -5.62f);
        pathBuilder.curveToRelative(0.41f, 0.99f, 0.64f, 2.1f, 0.64f, 3.32f);
        pathBuilder.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        pathBuilder.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        pathBuilder.curveToRelative(0.0f, -4.98f, 3.8f, -8.2f, 8.0f, -8.2f);
        pathBuilder.curveToRelative(1.09f, 0.0f, 2.16f, 0.22f, 3.13f, 0.63f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
