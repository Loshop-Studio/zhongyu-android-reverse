package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

/* loaded from: classes.dex */
public final class AlignHorizontalLeftKt {
    private static ImageVector _alignHorizontalLeft;

    public static final ImageVector getAlignHorizontalLeft(Icons.Rounded rounded) {
        ImageVector imageVector = _alignHorizontalLeft;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlignHorizontalLeft", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 22.0f);
        pathBuilder.lineTo(3.0f, 22.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.curveTo(4.0f, 21.55f, 3.55f, 22.0f, 3.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(-13.0f);
        pathBuilder.curveTo(6.67f, 7.0f, 6.0f, 7.67f, 6.0f, 8.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(6.0f, 9.33f, 6.67f, 10.0f, 7.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(22.0f, 7.67f, 21.33f, 7.0f, 20.5f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.curveTo(6.67f, 14.0f, 6.0f, 14.67f, 6.0f, 15.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(6.0f, 16.33f, 6.67f, 17.0f, 7.5f, 17.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(16.0f, 14.67f, 15.33f, 14.0f, 14.5f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alignHorizontalLeft = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC8721a
    public static /* synthetic */ void getAlignHorizontalLeft$annotations(Icons.Rounded rounded) {
    }
}
