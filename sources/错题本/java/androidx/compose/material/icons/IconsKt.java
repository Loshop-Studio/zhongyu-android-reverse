package androidx.compose.material.icons;

import androidx.autofill.HintConstants;
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
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a1\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\u000b\u001aN\u0010\u0016\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0002¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001a\u0010\u0017\u001a\u00020\f8\u0000X\u0081T¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m5110d2 = {"", HintConstants.AUTOFILL_HINT_NAME, "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/ui/graphics/vector/ImageVector;", "materialIcon", "(Ljava/lang/String;Lr6/c;)Landroidx/compose/ui/graphics/vector/ImageVector;", "", "autoMirror", "(Ljava/lang/String;ZLr6/c;)Landroidx/compose/ui/graphics/vector/ImageVector;", "", "fillAlpha", "strokeAlpha", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "Ld6/s;", "pathBuilder", "materialPath-YwgOQQI", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;FFILr6/c;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "materialPath", "MaterialIconDimension", "F", "getMaterialIconDimension$annotations", "()V", "material-icons-core_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 4 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,258:1\n223#1:259\n216#1,3:260\n219#1,4:264\n174#2:263\n174#2:268\n174#2:269\n174#2:270\n174#2:271\n705#3,2:272\n717#3,2:274\n719#3,11:280\n717#3,13:291\n72#4,4:276\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n*L\n201#1:259\n201#1:260,3\n201#1:264,4\n201#1:263\n218#1:268\n219#1:269\n218#1:270\n219#1:271\n242#1:272,2\n242#1:274,2\n242#1:280,11\n242#1:291,13\n242#1:276,4\n*E\n"})
/* loaded from: classes.dex */
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    @PublishedApi
    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }

    @NotNull
    public static final ImageVector materialIcon(@NotNull String str, boolean z8, @NotNull InterfaceC6471c interfaceC6471c) {
        return ((ImageVector.Builder) interfaceC6471c.invoke(new ImageVector.Builder(str, C2331Dp.m13305constructorimpl(24.0f), C2331Dp.m13305constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z8, 96, null))).build();
    }

    public static /* synthetic */ ImageVector materialIcon$default(String str, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        return ((ImageVector.Builder) interfaceC6471c.invoke(new ImageVector.Builder(str, C2331Dp.m13305constructorimpl(24.0f), C2331Dp.m13305constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z8, 96, null))).build();
    }

    @NotNull
    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m8114materialPathYwgOQQI(@NotNull ImageVector.Builder builder, float f, float f7, int i, @NotNull InterfaceC6471c interfaceC6471c) {
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m10708getBlack0d7_KjU(), null);
        int iM11035getButtKaPHkGw = StrokeCap.INSTANCE.m11035getButtKaPHkGw();
        int iM11045getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11045getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC6471c.invoke(pathBuilder);
        return ImageVector.Builder.m11367addPathoIyEayM$default(builder, pathBuilder.getNodes(), i, "", solidColor, f, null, f7, 1.0f, iM11035getButtKaPHkGw, iM11045getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m8115materialPathYwgOQQI$default(ImageVector.Builder builder, float f, float f7, int i, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        float f8 = (i8 & 1) != 0 ? 1.0f : f;
        float f9 = (i8 & 2) != 0 ? 1.0f : f7;
        int defaultFillType = (i8 & 4) != 0 ? VectorKt.getDefaultFillType() : i;
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m10708getBlack0d7_KjU(), null);
        int iM11035getButtKaPHkGw = StrokeCap.INSTANCE.m11035getButtKaPHkGw();
        int iM11045getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11045getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC6471c.invoke(pathBuilder);
        return ImageVector.Builder.m11367addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, f8, null, f9, 1.0f, iM11035getButtKaPHkGw, iM11045getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
