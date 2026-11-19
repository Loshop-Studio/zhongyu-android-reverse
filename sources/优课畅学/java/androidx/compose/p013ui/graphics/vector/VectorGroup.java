package androidx.compose.p013ui.graphics.vector;

import androidx.compose.runtime.Immutable;
import com.tencent.liteav.TXLiteAVCode;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p311y7.InterfaceC10668a;

@Immutable
/* loaded from: classes2.dex */
public final class VectorGroup extends VectorNode implements Iterable<VectorNode>, InterfaceC10668a {
    public static final int $stable = 0;
    private final List<VectorNode> children;
    private final List<PathNode> clipPathData;
    private final String name;
    private final float pivotX;
    private final float pivotY;
    private final float rotation;
    private final float scaleX;
    private final float scaleY;
    private final float translationX;
    private final float translationY;

    /* renamed from: androidx.compose.ui.graphics.vector.VectorGroup$iterator$1 */
    public static final class C28301 implements Iterator<VectorNode>, InterfaceC10668a {

        /* renamed from: it */
        private final Iterator<VectorNode> f1287it;

        public C28301(VectorGroup vectorGroup) {
            this.f1287it = vectorGroup.children.iterator();
        }

        public final Iterator<VectorNode> getIt() {
            return this.f1287it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1287it.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public VectorNode next() {
            return this.f1287it.next();
        }
    }

    public VectorGroup() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, TXLiteAVCode.EVT_CAMERA_REMOVED, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof VectorGroup)) {
            VectorGroup vectorGroup = (VectorGroup) obj;
            return AbstractC9133u.m16128b(this.name, vectorGroup.name) && this.rotation == vectorGroup.rotation && this.pivotX == vectorGroup.pivotX && this.pivotY == vectorGroup.pivotY && this.scaleX == vectorGroup.scaleX && this.scaleY == vectorGroup.scaleY && this.translationX == vectorGroup.translationX && this.translationY == vectorGroup.translationY && AbstractC9133u.m16128b(this.clipPathData, vectorGroup.clipPathData) && AbstractC9133u.m16128b(this.children, vectorGroup.children);
        }
        return false;
    }

    public final VectorNode get(int i10) {
        return this.children.get(i10);
    }

    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    public final String getName() {
        return this.name;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSize() {
        return this.children.size();
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<VectorNode> iterator() {
        return new C28301(this);
    }

    public /* synthetic */ VectorGroup(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) != 0 ? 1.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) != 0 ? VectorKt.getEmptyPath() : list, (i10 & 512) != 0 ? AbstractC8809v.m14771n() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorGroup(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends PathNode> list, List<? extends VectorNode> list2) {
        super(null);
        this.name = str;
        this.rotation = f10;
        this.pivotX = f11;
        this.pivotY = f12;
        this.scaleX = f13;
        this.scaleY = f14;
        this.translationX = f15;
        this.translationY = f16;
        this.clipPathData = list;
        this.children = list2;
    }
}
