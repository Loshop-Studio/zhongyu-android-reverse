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
public final class DetailsKt {
    private static ImageVector _details;

    public static final ImageVector getDetails(Icons.Rounded rounded) {
        ImageVector imageVector = _details;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Details", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.13f, 4.57f);
        pathBuilder.lineToRelative(-8.3f, 14.94f);
        pathBuilder.curveTo(2.46f, 20.18f, 2.94f, 21.0f, 3.7f, 21.0f);
        pathBuilder.horizontalLineToRelative(16.6f);
        pathBuilder.curveToRelative(0.76f, 0.0f, 1.24f, -0.82f, 0.87f, -1.49f);
        pathBuilder.lineToRelative(-8.3f, -14.94f);
        pathBuilder.curveTo(12.49f, 3.89f, 11.51f, 3.89f, 11.13f, 4.57f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 8.92f);
        pathBuilder.lineTo(18.6f, 19.0f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineTo(8.92f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 8.92f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(5.4f);
        pathBuilder.lineTo(11.0f, 8.92f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _details = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
