package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.graphics.vector.PathBuilder;
import androidx.compose.p011ui.graphics.vector.VectorKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p061g.AbstractC5535a;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"_person", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Person", "Landroidx/compose/material/icons/Icons$Outlined;", "getPerson", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPerson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Person.kt\nandroidx/compose/material/icons/outlined/PersonKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 Person.kt\nandroidx/compose/material/icons/outlined/PersonKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"})
/* loaded from: classes.dex */
public final class PersonKt {

    @Nullable
    private static ImageVector _person;

    @NotNull
    public static final ImageVector getPerson(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _person;
        if (imageVector != null) {
            AbstractC5830k.m5327d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Person", C2331Dp.m13305constructorimpl(24.0f), C2331Dp.m13305constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m10708getBlack0d7_KjU(), null);
        int iM11035getButtKaPHkGw = StrokeCap.INSTANCE.m11035getButtKaPHkGw();
        int iM11045getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11045getBevelLxFBmk8();
        PathBuilder pathBuilderM4894a = AbstractC5535a.m4894a(12.0f, 6.0f);
        pathBuilderM4894a.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilderM4894a.moveToRelative(0.0f, 10.0f);
        pathBuilderM4894a.curveToRelative(2.7f, 0.0f, 5.8f, 1.29f, 6.0f, 2.0f);
        pathBuilderM4894a.lineTo(6.0f, 18.0f);
        pathBuilderM4894a.curveToRelative(0.23f, -0.72f, 3.31f, -2.0f, 6.0f, -2.0f);
        pathBuilderM4894a.moveToRelative(0.0f, -12.0f);
        pathBuilderM4894a.curveTo(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(12.0f, 14.0f);
        pathBuilderM4894a.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilderM4894a.verticalLineToRelative(2.0f);
        pathBuilderM4894a.horizontalLineToRelative(16.0f);
        pathBuilderM4894a.verticalLineToRelative(-2.0f);
        pathBuilderM4894a.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilderM4894a.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11367addPathoIyEayM$default(builder, pathBuilderM4894a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11035getButtKaPHkGw, iM11045getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _person = imageVectorBuild;
        AbstractC5830k.m5327d(imageVectorBuild);
        return imageVectorBuild;
    }
}
