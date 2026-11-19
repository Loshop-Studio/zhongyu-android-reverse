package androidx.compose.material.icons.filled;

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

@Metadata(m5174d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5175d2 = {"_check", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Check", "Landroidx/compose/material/icons/Icons$Filled;", "getCheck", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCheck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Check.kt\nandroidx/compose/material/icons/filled/CheckKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,44:1\n122#2:45\n116#2,3:46\n119#2,3:50\n132#2,18:53\n152#2:90\n175#3:49\n694#4,2:71\n706#4,2:73\n708#4,11:79\n53#5,4:75\n*S KotlinDebug\n*F\n+ 1 Check.kt\nandroidx/compose/material/icons/filled/CheckKt\n*L\n29#1:45\n29#1:46,3\n29#1:50,3\n30#1:53,18\n30#1:90\n29#1:49\n30#1:71,2\n30#1:73,2\n30#1:79,11\n30#1:75,4\n*E\n"})
/* loaded from: classes.dex */
public final class CheckKt {
    private static ImageVector _check;

    public static final ImageVector getCheck(Icons.Filled filled) {
        Intrinsics.checkNotNullParameter(filled, "<this>");
        ImageVector imageVector = _check;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Check", C1700Dp.m11525constructorimpl(24.0f), C1700Dp.m11525constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m9204getBlack0d7_KjU(), null);
        int iM9501getButtKaPHkGw = StrokeCap.INSTANCE.m9501getButtKaPHkGw();
        int iM9511getBevelLxFBmk8 = StrokeJoin.INSTANCE.m9511getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 16.17f);
        pathBuilder.lineTo(4.83f, 12.0f);
        pathBuilder.lineToRelative(-1.42f, 1.41f);
        pathBuilder.lineTo(9.0f, 19.0f);
        pathBuilder.lineTo(21.0f, 7.0f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m9719addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM9501getButtKaPHkGw, iM9511getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _check = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
