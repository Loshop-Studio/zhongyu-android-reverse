package androidx.compose.foundation.shape;

import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016JB\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m13558d2 = {"Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "topLeft", "Landroidx/compose/foundation/shape/CornerSize;", "topRight", "bottomRight", "bottomLeft", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "copy", "topStart", "topEnd", "bottomEnd", "bottomStart", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAbsoluteCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShape\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,202:1\n57#2:203\n57#2:206\n57#2:209\n61#2:212\n57#2:214\n61#2:217\n61#2:219\n61#2:222\n60#3:204\n60#3:207\n60#3:210\n70#3:213\n60#3:215\n70#3:218\n70#3:220\n70#3:223\n22#4:205\n22#4:208\n22#4:211\n22#4:216\n22#4:221\n22#4:224\n*S KotlinDebug\n*F\n+ 1 AbsoluteCutCornerShape.kt\nandroidx/compose/foundation/shape/AbsoluteCutCornerShape\n*L\n70#1:203\n71#1:206\n73#1:209\n73#1:212\n74#1:214\n74#1:217\n76#1:219\n77#1:222\n70#1:204\n71#1:207\n73#1:210\n73#1:213\n74#1:215\n74#1:218\n76#1:220\n77#1:223\n70#1:205\n71#1:208\n73#1:211\n74#1:216\n76#1:221\n77#1:224\n*E\n"})
/* loaded from: classes.dex */
public final class AbsoluteCutCornerShape extends CornerBasedShape {
    public static final int $stable = 0;

    public AbsoluteCutCornerShape(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0, reason: not valid java name */
    public Outline mo17957createOutlineLjSzlW0(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, LayoutDirection layoutDirection) {
        if (topStart + topEnd + bottomStart + bottomEnd == 0.0f) {
            return new Outline.Rectangle(SizeKt.m20825toRectuvyYCjk(size));
        }
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, topStart);
        Path.lineTo(topStart, 0.0f);
        int i10 = (int) (size >> 32);
        Path.lineTo(Float.intBitsToFloat(i10) - topEnd, 0.0f);
        Path.lineTo(Float.intBitsToFloat(i10), topEnd);
        int i11 = (int) (size & 4294967295L);
        Path.lineTo(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11) - bottomEnd);
        Path.lineTo(Float.intBitsToFloat(i10) - bottomEnd, Float.intBitsToFloat(i11));
        Path.lineTo(bottomStart, Float.intBitsToFloat(i11));
        Path.lineTo(0.0f, Float.intBitsToFloat(i11) - bottomStart);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbsoluteCutCornerShape)) {
            return false;
        }
        AbsoluteCutCornerShape absoluteCutCornerShape = (AbsoluteCutCornerShape) other;
        return Intrinsics.areEqual(getTopStart(), absoluteCutCornerShape.getTopStart()) && Intrinsics.areEqual(getTopEnd(), absoluteCutCornerShape.getTopEnd()) && Intrinsics.areEqual(getBottomEnd(), absoluteCutCornerShape.getBottomEnd()) && Intrinsics.areEqual(getBottomStart(), absoluteCutCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    public String toString() {
        return "AbsoluteCutCornerShape(topLeft = " + getTopStart() + ", topRight = " + getTopEnd() + ", bottomRight = " + getBottomEnd() + ", bottomLeft = " + getBottomStart() + ')';
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public AbsoluteCutCornerShape copy(CornerSize topStart, CornerSize topEnd, CornerSize bottomEnd, CornerSize bottomStart) {
        return new AbsoluteCutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }
}
