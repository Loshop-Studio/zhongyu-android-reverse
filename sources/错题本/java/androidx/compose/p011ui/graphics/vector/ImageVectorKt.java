package androidx.compose.p011ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0098\u0001\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u008d\u0001\u0010$\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0086\b¢\u0006\u0004\b$\u0010%\u001a1\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u00028\u00000'j\b\u0012\u0004\u0012\u00028\u0000`(2\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0004\b+\u0010,\u001a)\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u00028\u00000'j\b\u0012\u0004\u0012\u00028\u0000`(H\u0002¢\u0006\u0004\b-\u0010.\u001a)\u0010/\u001a\u00028\u0000\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u00028\u00000'j\b\u0012\u0004\u0012\u00028\u0000`(H\u0002¢\u0006\u0004\b/\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, m5110d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", HintConstants.AUTOFILL_HINT_NAME, "Landroidx/compose/ui/graphics/Brush;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "pathBuilder", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILr6/c;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "path", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "block", "group", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;FFFFFFFLjava/util/List;Lr6/c;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "", "push", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "pop", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "peek", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,705:1\n73#2,4:706\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n654#1:706,4\n*E\n"})
/* loaded from: classes.dex */
public final class ImageVectorKt {
    @NotNull
    public static final ImageVector.Builder group(@NotNull ImageVector.Builder builder, @NotNull String str, float f, float f7, float f8, float f9, float f10, float f11, float f12, @NotNull List<? extends PathNode> list, @NotNull InterfaceC6471c interfaceC6471c) {
        builder.addGroup(str, f, f7, f8, f9, f10, f11, f12, list);
        interfaceC6471c.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f, float f7, float f8, float f9, float f10, float f11, float f12, List list, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        builder.addGroup(str2, f, (i & 4) != 0 ? 0.0f : f7, (i & 8) != 0 ? 0.0f : f8, (i & 16) != 0 ? 1.0f : f9, (i & 32) != 0 ? 1.0f : f10, (i & 64) != 0 ? 0.0f : f11, (i & 128) != 0 ? 0.0f : f12, (i & 256) != 0 ? VectorKt.getEmptyPath() : list);
        interfaceC6471c.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @NotNull
    /* renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m11369pathR_LF3I(@NotNull ImageVector.Builder builder, @NotNull String str, @Nullable Brush brush, float f, @Nullable Brush brush2, float f7, float f8, int i, int i8, float f9, int i9, @NotNull InterfaceC6471c interfaceC6471c) {
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC6471c.invoke(pathBuilder);
        return ImageVector.Builder.m11367addPathoIyEayM$default(builder, pathBuilder.getNodes(), i9, str, brush, f, brush2, f7, f8, i, i8, f9, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m11370pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f, Brush brush2, float f7, float f8, int i, int i8, float f9, int i9, InterfaceC6471c interfaceC6471c, int i10, Object obj) {
        String str2 = (i10 & 1) != 0 ? "" : str;
        Brush brush3 = (i10 & 2) != 0 ? null : brush;
        float f10 = (i10 & 4) != 0 ? 1.0f : f;
        Brush brush4 = (i10 & 8) != 0 ? null : brush2;
        float f11 = (i10 & 16) != 0 ? 1.0f : f7;
        float f12 = (i10 & 32) != 0 ? 0.0f : f8;
        int defaultStrokeLineCap = (i10 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i;
        int defaultStrokeLineJoin = (i10 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i8;
        float f13 = (i10 & 256) != 0 ? 4.0f : f9;
        int defaultFillType = (i10 & 512) != 0 ? VectorKt.getDefaultFillType() : i9;
        PathBuilder pathBuilder = new PathBuilder();
        interfaceC6471c.invoke(pathBuilder);
        return ImageVector.Builder.m11367addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, str2, brush3, f10, brush4, f11, f12, defaultStrokeLineCap, defaultStrokeLineJoin, f13, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t8) {
        return arrayList.add(t8);
    }
}
