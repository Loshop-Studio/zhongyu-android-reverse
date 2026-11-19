package androidx.compose.foundation.gestures;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8801r;

/* loaded from: classes.dex */
final class DefaultDraggableAnchors<T> implements DraggableAnchors<T> {
    private final float[] anchors;
    private final List<T> keys;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableAnchors(List<? extends T> list, float[] fArr) {
        this.keys = list;
        this.anchors = fArr;
        list.size();
        int length = fArr.length;
        this.size = fArr.length;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T anchorAt(int i10) {
        return (T) AbstractC8778f0.m14569o0(this.keys, i10);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float f10) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i10 = -1;
        float f11 = Float.POSITIVE_INFINITY;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i12 + 1;
            float fAbs = Math.abs(f10 - fArr[i11]);
            if (fAbs <= f11) {
                i10 = i12;
                f11 = fAbs;
            }
            i11++;
            i12 = i13;
        }
        return this.keys.get(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultDraggableAnchors)) {
            return false;
        }
        DefaultDraggableAnchors defaultDraggableAnchors = (DefaultDraggableAnchors) obj;
        return AbstractC9133u.m16128b(this.keys, defaultDraggableAnchors.keys) && Arrays.equals(this.anchors, defaultDraggableAnchors.anchors) && getSize() == defaultDraggableAnchors.getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean hasPositionFor(T t10) {
        return this.keys.indexOf(t10) != -1;
    }

    public int hashCode() {
        return (((this.keys.hashCode() * 31) + Arrays.hashCode(this.anchors)) * 31) + getSize();
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float maxPosition() {
        Float fM14690S0 = AbstractC8801r.m14690S0(this.anchors);
        if (fM14690S0 != null) {
            return fM14690S0.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minPosition() {
        Float fM14693V0 = AbstractC8801r.m14693V0(this.anchors);
        if (fM14693V0 != null) {
            return fM14693V0.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionAt(int i10) {
        float[] fArr = this.anchors;
        return (i10 < 0 || i10 > AbstractC8801r.m14743y0(fArr)) ? ((Number) AnchoredDraggableKt.GetOrNan.invoke(Integer.valueOf(i10))).floatValue() : fArr[i10];
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T t10) {
        int iIndexOf = this.keys.indexOf(t10);
        float[] fArr = this.anchors;
        return (iIndexOf < 0 || iIndexOf > AbstractC8801r.m14743y0(fArr)) ? ((Number) AnchoredDraggableKt.GetOrNan.invoke(Integer.valueOf(iIndexOf))).floatValue() : fArr[iIndexOf];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(anchorAt(i10));
            sb2.append('=');
            sb2.append(positionAt(i10));
            sb.append(sb2.toString());
            if (i10 < getSize() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        return string;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public T closestAnchor(float f10, boolean z10) {
        float[] fArr = this.anchors;
        int length = fArr.length;
        int i10 = -1;
        int i11 = 0;
        float f11 = Float.POSITIVE_INFINITY;
        int i12 = 0;
        while (i11 < length) {
            float f12 = fArr[i11];
            int i13 = i12 + 1;
            float f13 = z10 ? f12 - f10 : f10 - f12;
            if (f13 < 0.0f) {
                f13 = Float.POSITIVE_INFINITY;
            }
            if (f13 <= f11) {
                i10 = i12;
                f11 = f13;
            }
            i11++;
            i12 = i13;
        }
        return this.keys.get(i10);
    }
}
