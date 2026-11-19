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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_fitnessCenter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "FitnessCenter", "Landroidx/compose/material/icons/Icons$Filled;", "getFitnessCenter", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFitnessCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessCenter.kt\nandroidx/compose/material/icons/filled/FitnessCenterKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,66:1\n212#2,12:67\n233#2,18:80\n253#2:117\n174#3:79\n705#4,2:98\n717#4,2:100\n719#4,11:106\n72#5,4:102\n*S KotlinDebug\n*F\n+ 1 FitnessCenter.kt\nandroidx/compose/material/icons/filled/FitnessCenterKt\n*L\n29#1:67,12\n30#1:80,18\n30#1:117\n29#1:79\n30#1:98,2\n30#1:100,2\n30#1:106,11\n30#1:102,4\n*E\n"})
/* loaded from: classes.dex */
public final class FitnessCenterKt {
    private static ImageVector _fitnessCenter;

    public static final ImageVector getFitnessCenter(Icons.Filled filled) {
        ImageVector imageVector = _fitnessCenter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FitnessCenter", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.57f, 14.86f);
        pathBuilder.lineTo(22.0f, 13.43f);
        pathBuilder.lineTo(20.57f, 12.0f);
        pathBuilder.lineTo(17.0f, 15.57f);
        pathBuilder.lineTo(8.43f, 7.0f);
        pathBuilder.lineTo(12.0f, 3.43f);
        pathBuilder.lineTo(10.57f, 2.0f);
        pathBuilder.lineTo(9.14f, 3.43f);
        pathBuilder.lineTo(7.71f, 2.0f);
        pathBuilder.lineTo(5.57f, 4.14f);
        pathBuilder.lineTo(4.14f, 2.71f);
        pathBuilder.lineTo(2.71f, 4.14f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.lineTo(2.0f, 7.71f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.lineTo(2.0f, 10.57f);
        pathBuilder.lineTo(3.43f, 12.0f);
        pathBuilder.lineTo(7.0f, 8.43f);
        pathBuilder.lineTo(15.57f, 17.0f);
        pathBuilder.lineTo(12.0f, 20.57f);
        pathBuilder.lineTo(13.43f, 22.0f);
        pathBuilder.lineToRelative(1.43f, -1.43f);
        pathBuilder.lineTo(16.29f, 22.0f);
        pathBuilder.lineToRelative(2.14f, -2.14f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.lineToRelative(1.43f, -1.43f);
        pathBuilder.lineToRelative(-1.43f, -1.43f);
        pathBuilder.lineTo(22.0f, 16.29f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fitnessCenter = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
