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
public final class ChromeReaderModeKt {
    private static ImageVector _chromeReaderMode;

    public static final ImageVector getChromeReaderMode(Icons.Outlined outlined) {
        ImageVector imageVector = _chromeReaderMode;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ChromeReaderMode", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 4.0f);
        pathBuilder.lineTo(3.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(23.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 19.0f);
        pathBuilder.lineTo(3.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(13.0f);
        pathBuilder.lineTo(3.0f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.lineTo(13.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 9.5f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineTo(20.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 14.5f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineTo(20.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chromeReaderMode = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getChromeReaderMode$annotations(Icons.Outlined outlined) {
    }
}
