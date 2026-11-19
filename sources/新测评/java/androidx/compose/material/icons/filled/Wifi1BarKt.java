package androidx.compose.material.icons.filled;

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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_wifi1Bar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Wifi1Bar", "Landroidx/compose/material/icons/Icons$Filled;", "getWifi1Bar", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nWifi1Bar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wifi1Bar.kt\nandroidx/compose/material/icons/filled/Wifi1BarKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,43:1\n212#2,12:44\n233#2,18:57\n253#2:94\n174#3:56\n705#4,2:75\n717#4,2:77\n719#4,11:83\n72#5,4:79\n*S KotlinDebug\n*F\n+ 1 Wifi1Bar.kt\nandroidx/compose/material/icons/filled/Wifi1BarKt\n*L\n29#1:44,12\n30#1:57,18\n30#1:94\n29#1:56\n30#1:75,2\n30#1:77,2\n30#1:83,11\n30#1:79,4\n*E\n"})
/* loaded from: classes.dex */
public final class Wifi1BarKt {
    private static ImageVector _wifi1Bar;

    public static final ImageVector getWifi1Bar(Icons.Filled filled) {
        ImageVector imageVector = _wifi1Bar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Wifi1Bar", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.53f, 17.46f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.lineToRelative(-3.53f, -3.54f);
        pathBuilder.curveTo(9.37f, 16.56f, 10.62f, 16.0f, 12.0f, 16.0f);
        pathBuilder.reflectiveCurveTo(14.63f, 16.56f, 15.53f, 17.46f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifi1Bar = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
