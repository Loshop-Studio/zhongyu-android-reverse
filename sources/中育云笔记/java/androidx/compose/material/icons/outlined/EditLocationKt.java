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

/* loaded from: classes.dex */
public final class EditLocationKt {
    private static ImageVector _editLocation;

    public static final ImageVector getEditLocation(Icons.Outlined outlined) {
        ImageVector imageVector = _editLocation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EditLocation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.17f, 4.91f);
        pathBuilder.lineTo(17.1f, 3.84f);
        pathBuilder.lineToRelative(-5.55f, 5.55f);
        pathBuilder.verticalLineToRelative(1.08f);
        pathBuilder.horizontalLineToRelative(1.08f);
        pathBuilder.lineToRelative(5.54f, -5.56f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 2.74f);
        pathBuilder.lineToRelative(1.29f, -1.29f);
        pathBuilder.arcToRelative(1.49f, 1.49f, 0.0f, false, true, 2.12f, 0.0f);
        pathBuilder.lineToRelative(1.15f, 1.15f);
        pathBuilder.curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f);
        pathBuilder.lineToRelative(-0.68f, 0.68f);
        pathBuilder.lineToRelative(-0.02f, 0.02f);
        pathBuilder.lineToRelative(-0.58f, 0.58f);
        pathBuilder.lineToRelative(-6.0f, 6.0f);
        pathBuilder.lineTo(10.0f, 12.0f);
        pathBuilder.lineTo(10.0f, 8.74f);
        pathBuilder.lineToRelative(6.0f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.72f, 2.19f);
        pathBuilder.lineToRelative(-0.55f, 0.55f);
        pathBuilder.lineToRelative(-1.27f, 1.27f);
        pathBuilder.curveToRelative(-3.3f, 0.05f, -5.9f, 2.6f, -5.9f, 6.2f);
        pathBuilder.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        pathBuilder.curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f);
        pathBuilder.verticalLineToRelative(-0.1f);
        pathBuilder.lineToRelative(1.8f, -1.8f);
        pathBuilder.curveToRelative(0.13f, 0.6f, 0.2f, 1.24f, 0.2f, 1.9f);
        pathBuilder.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        pathBuilder.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        pathBuilder.curveToRelative(0.0f, -4.98f, 3.8f, -8.2f, 8.0f, -8.2f);
        pathBuilder.curveToRelative(0.58f, 0.0f, 1.16f, 0.06f, 1.72f, 0.18f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
