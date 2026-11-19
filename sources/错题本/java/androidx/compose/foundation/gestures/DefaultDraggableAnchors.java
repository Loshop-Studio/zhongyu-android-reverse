package androidx.compose.foundation.gestures;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u001f\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0015\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\tH\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\tH\u0016J\u0015\u0010 \u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, m5110d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableAnchors;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/gestures/DraggableAnchors;", "keys", "", "anchors", "", "(Ljava/util/List;[F)V", "size", "", "getSize", "()I", "anchorAt", "index", "(I)Ljava/lang/Object;", "closestAnchor", RequestParameters.POSITION, "", "(F)Ljava/lang/Object;", "searchUpwards", "", "(FZ)Ljava/lang/Object;", "equals", "other", "", "hasPositionFor", "anchor", "(Ljava/lang/Object;)Z", "hashCode", "maxPosition", "minPosition", "positionAt", "positionOf", "(Ljava/lang/Object;)F", "toString", "", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/DefaultDraggableAnchors\n+ 2 AnchoredDraggable.jvm.kt\nandroidx/compose/foundation/gestures/AnchoredDraggable_jvmKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1753:1\n31#2,2:1754\n13424#3,3:1756\n13424#3,3:1759\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/DefaultDraggableAnchors\n*L\n1572#1:1754,2\n1588#1:1756,3\n1601#1:1759,3\n*E\n"})
/* loaded from: classes.dex */
final class DefaultDraggableAnchors<T> implements DraggableAnchors<T> {

    @NotNull
    private final float[] anchors;

    @NotNull
    private final List<T> keys;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableAnchors(@NotNull List<? extends T> list, @NotNull float[] fArr) {
        this.keys = list;
        this.anchors = fArr;
        list.size();
        int length = fArr.length;
        this.size = fArr.length;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    @Nullable
    public T anchorAt(int index) {
        return (T) AbstractC5805t.m5230j0(index, this.keys);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    @Nullable
    public T closestAnchor(float position) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i = -1;
        float f = Float.POSITIVE_INFINITY;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = i9 + 1;
            float fAbs = Math.abs(position - fArr[i8]);
            if (fAbs <= f) {
                i = i9;
                f = fAbs;
            }
            i8++;
            i9 = i10;
        }
        return this.keys.get(i);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultDraggableAnchors)) {
            return false;
        }
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) other;
        return AbstractC5830k.m5325b(this.keys, defaultDraggableAnchors.keys) && Arrays.equals(this.anchors, defaultDraggableAnchors.anchors) && getSize() == defaultDraggableAnchors.getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean hasPositionFor(T anchor) {
        return this.keys.indexOf(anchor) != -1;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.anchors) + (this.keys.hashCode() * 31)) * 31) + getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float maxPosition() {
        Float fValueOf;
        float[] fArr = this.anchors;
        AbstractC5830k.m5330g(fArr, "<this>");
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float fMax = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    fMax = Math.max(fMax, fArr[i]);
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            fValueOf = Float.valueOf(fMax);
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minPosition() {
        Float fValueOf;
        float[] fArr = this.anchors;
        AbstractC5830k.m5330g(fArr, "<this>");
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float fMin = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (1 <= length) {
                while (true) {
                    fMin = Math.min(fMin, fArr[i]);
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            fValueOf = Float.valueOf(fMin);
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionAt(int index) {
        float[] fArr = this.anchors;
        InterfaceC6471c interfaceC6471c = AnchoredDraggableKt.GetOrNan;
        if (index >= 0) {
            AbstractC5830k.m5330g(fArr, "<this>");
            if (index <= fArr.length - 1) {
                return fArr[index];
            }
        }
        return ((Number) interfaceC6471c.invoke(Integer.valueOf(index))).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T anchor) {
        int iIndexOf = this.keys.indexOf(anchor);
        float[] fArr = this.anchors;
        InterfaceC6471c interfaceC6471c = AnchoredDraggableKt.GetOrNan;
        if (iIndexOf >= 0) {
            AbstractC5830k.m5330g(fArr, "<this>");
            if (iIndexOf <= fArr.length - 1) {
                return fArr[iIndexOf];
            }
        }
        return ((Number) interfaceC6471c.invoke(Integer.valueOf(iIndexOf))).floatValue();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i = 0; i < size; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(anchorAt(i));
            sb2.append('=');
            sb2.append(positionAt(i));
            sb.append(sb2.toString());
            if (i < getSize() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    @Nullable
    public T closestAnchor(float position, boolean searchUpwards) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i = -1;
        int i8 = 0;
        float f = Float.POSITIVE_INFINITY;
        int i9 = 0;
        while (i8 < length) {
            float f7 = fArr[i8];
            int i10 = i9 + 1;
            float f8 = searchUpwards ? f7 - position : position - f7;
            if (f8 < 0.0f) {
                f8 = Float.POSITIVE_INFINITY;
            }
            if (f8 <= f) {
                i = i9;
                f = f8;
            }
            i8++;
            i9 = i10;
        }
        return this.keys.get(i);
    }
}
