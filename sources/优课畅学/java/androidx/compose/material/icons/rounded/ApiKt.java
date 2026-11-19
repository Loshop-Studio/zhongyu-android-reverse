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

/* loaded from: classes.dex */
public final class ApiKt {
    private static ImageVector _api;

    public static final ImageVector getApi(Icons.Rounded rounded) {
        ImageVector imageVector = _api;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Api", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 13.0f);
        pathBuilder.lineTo(13.0f, 13.0f);
        pathBuilder.curveToRelative(-0.56f, 0.56f, -1.45f, 0.56f, -2.0f, 0.01f);
        pathBuilder.lineTo(11.0f, 13.0f);
        pathBuilder.curveToRelative(-0.55f, -0.55f, -0.55f, -1.44f, 0.0f, -1.99f);
        pathBuilder.lineTo(11.0f, 11.0f);
        pathBuilder.curveToRelative(0.55f, -0.55f, 1.44f, -0.55f, 1.99f, 0.0f);
        pathBuilder.lineTo(13.0f, 11.0f);
        pathBuilder.curveTo(13.55f, 11.55f, 13.55f, 12.45f, 13.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(2.5f, -2.5f);
        pathBuilder.lineToRelative(-3.2f, -3.2f);
        pathBuilder.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        pathBuilder.lineToRelative(-3.2f, 3.2f);
        pathBuilder.lineToRelative(2.5f, 2.5f);
        pathBuilder.lineTo(12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 12.0f);
        pathBuilder.lineToRelative(2.12f, -2.12f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.lineToRelative(-3.2f, 3.2f);
        pathBuilder.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        pathBuilder.lineToRelative(3.2f, 3.2f);
        pathBuilder.lineToRelative(2.5f, -2.5f);
        pathBuilder.lineTo(6.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 12.0f);
        pathBuilder.lineToRelative(-2.12f, 2.12f);
        pathBuilder.lineToRelative(2.5f, 2.5f);
        pathBuilder.lineToRelative(3.2f, -3.2f);
        pathBuilder.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        pathBuilder.lineToRelative(-3.2f, -3.2f);
        pathBuilder.lineToRelative(-2.5f, 2.5f);
        pathBuilder.lineTo(18.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.lineToRelative(-2.12f, -2.12f);
        pathBuilder.lineToRelative(-2.5f, 2.5f);
        pathBuilder.lineToRelative(3.2f, 3.2f);
        pathBuilder.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        pathBuilder.lineToRelative(3.2f, -3.2f);
        pathBuilder.lineToRelative(-2.5f, -2.5f);
        pathBuilder.lineTo(12.0f, 18.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _api = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
