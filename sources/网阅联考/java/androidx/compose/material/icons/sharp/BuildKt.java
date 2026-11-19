package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.SolidColor;
import androidx.compose.p006ui.graphics.StrokeCap;
import androidx.compose.p006ui.graphics.StrokeJoin;
import androidx.compose.p006ui.graphics.vector.ImageVector;
import androidx.compose.p006ui.graphics.vector.PathBuilder;
import androidx.compose.p006ui.graphics.vector.VectorKt;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5175d2 = {"_build", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Build", "Landroidx/compose/material/icons/Icons$Sharp;", "getBuild", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/sharp/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,49:1\n122#2:50\n116#2,3:51\n119#2,3:55\n132#2,18:58\n152#2:95\n175#3:54\n694#4,2:76\n706#4,2:78\n708#4,11:84\n53#5,4:80\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/sharp/BuildKt\n*L\n29#1:50\n29#1:51,3\n29#1:55,3\n30#1:58,18\n30#1:95\n29#1:54\n30#1:76,2\n30#1:78,2\n30#1:84,11\n30#1:80,4\n*E\n"})
/* loaded from: classes.dex */
public final class BuildKt {
    private static ImageVector _build;

    public static final ImageVector getBuild(Icons.Sharp sharp) {
        Intrinsics.checkNotNullParameter(sharp, "<this>");
        ImageVector imageVector = _build;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Build", C1700Dp.m11525constructorimpl(24.0f), C1700Dp.m11525constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m9204getBlack0d7_KjU(), null);
        int iM9501getButtKaPHkGw = StrokeCap.INSTANCE.m9501getButtKaPHkGw();
        int iM9511getBevelLxFBmk8 = StrokeJoin.INSTANCE.m9511getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.09f, 2.91f);
        pathBuilder.curveTo(10.08f, 0.9f, 7.07f, 0.49f, 4.65f, 1.67f);
        pathBuilder.lineToRelative(4.34f, 4.34f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.lineToRelative(-4.34f, -4.34f);
        pathBuilder.curveTo(0.48f, 7.1f, 0.89f, 10.09f, 2.9f, 12.1f);
        pathBuilder.curveToRelative(1.86f, 1.86f, 4.58f, 2.35f, 6.89f, 1.48f);
        pathBuilder.lineToRelative(9.82f, 9.82f);
        pathBuilder.lineToRelative(3.71f, -3.71f);
        pathBuilder.lineToRelative(-9.78f, -9.79f);
        pathBuilder.curveToRelative(0.92f, -2.34f, 0.44f, -5.1f, -1.45f, -6.99f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m9719addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM9501getButtKaPHkGw, iM9511getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _build = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
