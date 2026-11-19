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
public final class HdrOnKt {
    private static ImageVector _hdrOn;

    public static final ImageVector getHdrOn(Icons.Outlined outlined) {
        ImageVector imageVector = _hdrOn;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HdrOn", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 11.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        pathBuilder.lineTo(16.0f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.lineToRelative(0.9f, 2.0f);
        pathBuilder.lineTo(21.0f, 15.0f);
        pathBuilder.lineToRelative(-0.9f, -2.1f);
        pathBuilder.curveToRelative(0.5f, -0.3f, 0.9f, -0.8f, 0.9f, -1.4f);
        pathBuilder.close();
        pathBuilder.moveTo(19.5f, 11.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.5f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(4.5f, 9.0f);
        pathBuilder.lineTo(3.0f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(6.5f, 15.0f);
        pathBuilder.lineTo(8.0f, 15.0f);
        pathBuilder.lineTo(8.0f, 9.0f);
        pathBuilder.lineTo(6.5f, 9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.0f);
        pathBuilder.lineTo(9.5f, 9.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineTo(13.0f, 15.0f);
        pathBuilder.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 13.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOn = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
