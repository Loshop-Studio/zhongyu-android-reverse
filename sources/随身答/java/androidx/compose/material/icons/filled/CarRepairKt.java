package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.SolidColor;
import androidx.compose.p012ui.graphics.StrokeCap;
import androidx.compose.p012ui.graphics.StrokeJoin;
import androidx.compose.p012ui.graphics.vector.ImageVector;
import androidx.compose.p012ui.graphics.vector.PathBuilder;
import androidx.compose.p012ui.graphics.vector.VectorKt;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_carRepair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CarRepair", "Landroidx/compose/material/icons/Icons$Filled;", "getCarRepair", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCarRepair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarRepair.kt\nandroidx/compose/material/icons/filled/CarRepairKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n212#2,12:88\n233#2,18:101\n253#2:138\n174#3:100\n705#4,2:119\n717#4,2:121\n719#4,11:127\n72#5,4:123\n*S KotlinDebug\n*F\n+ 1 CarRepair.kt\nandroidx/compose/material/icons/filled/CarRepairKt\n*L\n29#1:88,12\n30#1:101,18\n30#1:138\n29#1:100\n30#1:119,2\n30#1:121,2\n30#1:127,11\n30#1:123,4\n*E\n"})
/* loaded from: classes.dex */
public final class CarRepairKt {
    private static ImageVector _carRepair;

    public static final ImageVector getCarRepair(Icons.Filled filled) {
        ImageVector imageVector = _carRepair;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CarRepair", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.22f, 12.0f);
        pathBuilder.curveToRelative(0.68f, 0.0f, 1.22f, -0.54f, 1.22f, -1.22f);
        pathBuilder.curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f);
        pathBuilder.reflectiveCurveTo(15.0f, 10.11f, 15.0f, 10.78f);
        pathBuilder.curveTo(15.0f, 11.46f, 15.55f, 12.0f, 16.22f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.56f, 10.78f);
        pathBuilder.curveToRelative(0.0f, 0.67f, 0.54f, 1.22f, 1.22f, 1.22f);
        pathBuilder.reflectiveCurveTo(9.0f, 11.46f, 9.0f, 10.78f);
        pathBuilder.curveToRelative(0.0f, -0.67f, -0.54f, -1.22f, -1.22f, -1.22f);
        pathBuilder.reflectiveCurveTo(6.56f, 10.11f, 6.56f, 10.78f);
        pathBuilder.close();
        pathBuilder.moveTo(7.61f, 4.0f);
        pathBuilder.lineTo(6.28f, 8.0f);
        pathBuilder.horizontalLineToRelative(11.43f);
        pathBuilder.lineToRelative(-1.33f, -4.0f);
        pathBuilder.horizontalLineTo(7.61f);
        pathBuilder.close();
        pathBuilder.moveTo(16.28f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.54f, 0.01f, 0.92f, 0.54f);
        pathBuilder.curveToRelative(0.02f, 0.02f, 0.03f, 0.04f, 0.05f, 0.07f);
        pathBuilder.curveToRelative(0.07f, 0.11f, 0.14f, 0.24f, 0.19f, 0.4f);
        pathBuilder.curveTo(17.66f, 4.66f, 19.0f, 8.69f, 19.0f, 8.69f);
        pathBuilder.verticalLineToRelative(6.5f);
        pathBuilder.curveToRelative(0.0f, 0.45f, -0.35f, 0.81f, -0.78f, 0.81f);
        pathBuilder.horizontalLineToRelative(-0.44f);
        pathBuilder.curveTo(17.35f, 16.0f, 17.0f, 15.64f, 17.0f, 15.19f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(1.19f);
        pathBuilder.curveTo(7.0f, 15.64f, 6.65f, 16.0f, 6.22f, 16.0f);
        pathBuilder.horizontalLineTo(5.78f);
        pathBuilder.curveTo(5.35f, 16.0f, 5.0f, 15.64f, 5.0f, 15.19f);
        pathBuilder.verticalLineToRelative(-6.5f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 1.34f, -4.02f, 1.55f, -4.69f);
        pathBuilder.curveToRelative(0.05f, -0.16f, 0.12f, -0.28f, 0.19f, -0.4f);
        pathBuilder.curveTo(6.77f, 3.58f, 6.78f, 3.56f, 6.8f, 3.54f);
        pathBuilder.curveTo(7.18f, 3.01f, 7.72f, 3.0f, 7.72f, 3.0f);
        pathBuilder.horizontalLineTo(16.28f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 17.01f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(17.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carRepair = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
