package androidx.compose.material.icons.automirrored.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"__360", "Landroidx/compose/ui/graphics/vector/ImageVector;", "_360", "Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;", "get_360", "(Landroidx/compose/material/icons/Icons$AutoMirrored$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\n_360.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _360.kt\nandroidx/compose/material/icons/automirrored/twotone/_360Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,52:1\n223#2:53\n216#2,3:54\n219#2,4:58\n233#2,18:62\n253#2:99\n174#3:57\n705#4,2:80\n717#4,2:82\n719#4,11:88\n72#5,4:84\n*S KotlinDebug\n*F\n+ 1 _360.kt\nandroidx/compose/material/icons/automirrored/twotone/_360Kt\n*L\n29#1:53\n29#1:54,3\n29#1:58,4\n30#1:62,18\n30#1:99\n29#1:57\n30#1:80,2\n30#1:82,2\n30#1:88,11\n30#1:84,4\n*E\n"})
/* loaded from: classes.dex */
public final class _360Kt {
    private static ImageVector __360;

    public static final ImageVector get_360(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = __360;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone._360", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 16.77f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(2.73f);
        pathBuilder.curveToRelative(-3.15f, -0.56f, -5.0f, -1.9f, -5.0f, -2.73f);
        pathBuilder.curveToRelative(0.0f, -1.06f, 3.04f, -3.0f, 8.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 1.94f, 8.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.73f, -1.46f, 1.89f, -4.0f, 2.53f);
        pathBuilder.verticalLineToRelative(2.05f);
        pathBuilder.curveToRelative(3.53f, -0.77f, 6.0f, -2.53f, 6.0f, -4.58f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -4.48f, -5.0f, -10.0f, -5.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.24f, 2.94f, 4.13f, 7.0f, 4.77f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __360 = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
