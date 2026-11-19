package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.graphics.vector.PathBuilder;
import androidx.compose.p011ui.graphics.vector.VectorKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p061g.AbstractC5535a;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"_send", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Send", "Landroidx/compose/material/icons/Icons$Outlined;", "getSend$annotations", "(Landroidx/compose/material/icons/Icons$Outlined;)V", "getSend", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/outlined/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/outlined/SendKt\n*L\n35#1:60,12\n36#1:73,18\n36#1:110\n35#1:72\n36#1:91,2\n36#1:93,2\n36#1:99,11\n36#1:95,4\n*E\n"})
/* loaded from: classes.dex */
public final class SendKt {

    @Nullable
    private static ImageVector _send;

    @NotNull
    public static final ImageVector getSend(@NotNull Icons.Outlined outlined) {
        ImageVector imageVector = _send;
        if (imageVector != null) {
            AbstractC5830k.m5327d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Send", C2331Dp.m13305constructorimpl(24.0f), C2331Dp.m13305constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m10708getBlack0d7_KjU(), null);
        int iM11035getButtKaPHkGw = StrokeCap.INSTANCE.m11035getButtKaPHkGw();
        int iM11045getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11045getBevelLxFBmk8();
        PathBuilder pathBuilderM1043g = AbstractC1923c.m1043g(4.01f, 6.03f, 7.51f, 3.22f);
        pathBuilderM1043g.lineToRelative(-7.52f, -1.0f);
        pathBuilderM1043g.lineToRelative(0.01f, -2.22f);
        pathBuilderM1043g.moveToRelative(7.5f, 8.72f);
        pathBuilderM1043g.lineTo(4.0f, 17.97f);
        pathBuilderM1043g.verticalLineToRelative(-2.22f);
        pathBuilderM1043g.lineToRelative(7.51f, -1.0f);
        pathBuilderM1043g.moveTo(2.01f, 3.0f);
        pathBuilderM1043g.lineTo(2.0f, 10.0f);
        pathBuilderM1043g.lineToRelative(15.0f, 2.0f);
        pathBuilderM1043g.lineToRelative(-15.0f, 2.0f);
        pathBuilderM1043g.lineToRelative(0.01f, 7.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m11367addPathoIyEayM$default(builder, AbstractC5535a.m4896c(pathBuilderM1043g, 23.0f, 12.0f, 2.01f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11035getButtKaPHkGw, iM11045getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = imageVectorBuild;
        AbstractC5830k.m5327d(imageVectorBuild);
        return imageVectorBuild;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Outlined.Send", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Outlined.Send", imports = {"androidx.compose.material.icons.automirrored.outlined.Send"}))
    public static /* synthetic */ void getSend$annotations(Icons.Outlined outlined) {
    }
}
