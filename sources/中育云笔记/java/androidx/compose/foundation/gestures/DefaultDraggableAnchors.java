package androidx.compose.foundation.gestures;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10968r;

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
        return (T) AbstractC10947g0.m23947p0(this.keys, i10);
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
        return AbstractC9979u.m20289b(this.keys, defaultDraggableAnchors.keys) && Arrays.equals(this.anchors, defaultDraggableAnchors.anchors) && getSize() == defaultDraggableAnchors.getSize();
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
        Float fM24056O0 = AbstractC10968r.m24056O0(this.anchors);
        if (fM24056O0 != null) {
            return fM24056O0.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minPosition() {
        Float fM24059R0 = AbstractC10968r.m24059R0(this.anchors);
        if (fM24059R0 != null) {
            return fM24059R0.floatValue();
        }
        return Float.NaN;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionAt(int i10) {
        float[] fArr = this.anchors;
        return (i10 < 0 || i10 > AbstractC10968r.m24112x0(fArr)) ? ((Number) AnchoredDraggableKt.GetOrNan.invoke(Integer.valueOf(i10))).floatValue() : fArr[i10];
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T t10) {
        int iIndexOf = this.keys.indexOf(t10);
        float[] fArr = this.anchors;
        return (iIndexOf < 0 || iIndexOf > AbstractC10968r.m24112x0(fArr)) ? ((Number) AnchoredDraggableKt.GetOrNan.invoke(Integer.valueOf(iIndexOf))).floatValue() : fArr[iIndexOf];
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DraggableAnchors(anchors={");
        int size = getSize();
        for (int i10 = 0; i10 < size; i10++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(anchorAt(i10));
            sb3.append('=');
            sb3.append(positionAt(i10));
            sb2.append(sb3.toString());
            if (i10 < getSize() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("})");
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
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
