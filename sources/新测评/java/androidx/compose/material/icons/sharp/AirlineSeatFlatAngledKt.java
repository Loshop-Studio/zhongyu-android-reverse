package androidx.compose.material.icons.sharp;

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

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_airlineSeatFlatAngled", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AirlineSeatFlatAngled", "Landroidx/compose/material/icons/Icons$Sharp;", "getAirlineSeatFlatAngled", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAirlineSeatFlatAngled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirlineSeatFlatAngled.kt\nandroidx/compose/material/icons/sharp/AirlineSeatFlatAngledKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 AirlineSeatFlatAngled.kt\nandroidx/compose/material/icons/sharp/AirlineSeatFlatAngledKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
/* loaded from: classes.dex */
public final class AirlineSeatFlatAngledKt {
    private static ImageVector _airlineSeatFlatAngled;

    public static final ImageVector getAirlineSeatFlatAngled(Icons.Sharp sharp) {
        ImageVector imageVector = _airlineSeatFlatAngled;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AirlineSeatFlatAngled", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.56f, 16.18f);
        pathBuilder.lineTo(9.2f, 11.71f);
        pathBuilder.lineToRelative(2.08f, -5.66f);
        pathBuilder.lineToRelative(12.35f, 4.47f);
        pathBuilder.lineToRelative(-2.07f, 5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(1.5f, 12.14f);
        pathBuilder.lineTo(8.0f, 14.48f);
        pathBuilder.lineTo(8.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-1.63f);
        pathBuilder.lineTo(20.52f, 19.0f);
        pathBuilder.lineToRelative(0.69f, -1.89f);
        pathBuilder.lineToRelative(-19.02f, -6.86f);
        pathBuilder.lineToRelative(-0.69f, 1.89f);
        pathBuilder.close();
        pathBuilder.moveTo(7.3f, 10.2f);
        pathBuilder.curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f);
        pathBuilder.curveTo(7.99f, 4.71f, 6.2f, 4.08f, 4.7f, 4.8f);
        pathBuilder.curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f);
        pathBuilder.curveToRelative(0.71f, 1.49f, 2.5f, 2.12f, 4.0f, 1.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatFlatAngled = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
