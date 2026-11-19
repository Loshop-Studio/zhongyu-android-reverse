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
public final class SchemaKt {
    private static ImageVector _schema;

    public static final ImageVector getSchema(Icons.Rounded rounded) {
        ImageVector imageVector = _schema;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Schema", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 10.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-0.5f);
        pathBuilder.curveTo(11.0f, 9.67f, 10.33f, 9.0f, 9.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveTo(10.33f, 7.0f, 11.0f, 6.33f, 11.0f, 5.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(11.0f, 1.67f, 10.33f, 1.0f, 9.5f, 1.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveTo(4.67f, 1.0f, 4.0f, 1.67f, 4.0f, 2.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(4.0f, 6.33f, 4.67f, 7.0f, 5.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveTo(4.67f, 9.0f, 4.0f, 9.67f, 4.0f, 10.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(4.0f, 14.33f, 4.67f, 15.0f, 5.5f, 15.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.curveTo(4.67f, 17.0f, 4.0f, 17.67f, 4.0f, 18.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(4.0f, 22.33f, 4.67f, 23.0f, 5.5f, 23.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(0.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(21.0f, 9.67f, 20.33f, 9.0f, 19.5f, 9.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.curveTo(14.67f, 9.0f, 14.0f, 9.67f, 14.0f, 10.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _schema = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
