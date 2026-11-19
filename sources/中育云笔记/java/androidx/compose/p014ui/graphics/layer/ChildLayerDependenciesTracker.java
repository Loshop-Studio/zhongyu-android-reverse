package androidx.compose.p014ui.graphics.layer;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.p014ui.graphics.InlineClassHelperKt;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class ChildLayerDependenciesTracker {
    private MutableScatterSet<GraphicsLayer> dependenciesSet;
    private GraphicsLayer dependency;
    private MutableScatterSet<GraphicsLayer> oldDependenciesSet;
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    public final boolean onDependencyAdded(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet = this.dependenciesSet;
        if (mutableScatterSet != null) {
            AbstractC9979u.m20291d(mutableScatterSet);
            mutableScatterSet.add(graphicsLayer);
        } else if (this.dependency != null) {
            MutableScatterSet<GraphicsLayer> mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            GraphicsLayer graphicsLayer2 = this.dependency;
            AbstractC9979u.m20291d(graphicsLayer2);
            mutableScatterSetMutableScatterSetOf.add(graphicsLayer2);
            mutableScatterSetMutableScatterSetOf.add(graphicsLayer);
            this.dependenciesSet = mutableScatterSetMutableScatterSetOf;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet2 = this.oldDependenciesSet;
        if (mutableScatterSet2 != null) {
            AbstractC9979u.m20291d(mutableScatterSet2);
            return !mutableScatterSet2.remove(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeDependencies(p181hd.InterfaceC9540l r18) {
        /*
            r17 = this;
            r0 = r18
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = access$getDependency$p(r17)
            if (r1 == 0) goto L12
            r0.invoke(r1)
            r1 = 0
            r2 = r17
            access$setDependency$p(r2, r1)
            goto L14
        L12:
            r2 = r17
        L14:
            androidx.collection.MutableScatterSet r1 = access$getDependenciesSet$p(r2)
            if (r1 == 0) goto L60
            java.lang.Object[] r3 = r1.elements
            long[] r4 = r1.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5d
            r6 = 0
            r7 = r6
        L25:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L3f:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            r0.invoke(r13)
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r5) goto L5d
            int r7 = r7 + 1
            goto L25
        L5d:
            r1.clear()
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.layer.ChildLayerDependenciesTracker.removeDependencies(hd.l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void withTracking(p181hd.InterfaceC9540l r18, p181hd.InterfaceC9529a r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.compose.ui.graphics.layer.GraphicsLayer r2 = access$getDependency$p(r0)
            access$setOldDependency$p(r0, r2)
            androidx.collection.MutableScatterSet r2 = access$getDependenciesSet$p(r0)
            if (r2 == 0) goto L2a
            boolean r3 = r2.isNotEmpty()
            if (r3 == 0) goto L2a
            androidx.collection.MutableScatterSet r3 = access$getOldDependenciesSet$p(r0)
            if (r3 != 0) goto L24
            androidx.collection.MutableScatterSet r3 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            access$setOldDependenciesSet$p(r0, r3)
        L24:
            r3.addAll(r2)
            r2.clear()
        L2a:
            r2 = 1
            access$setTrackingInProgress$p(r0, r2)
            r19.invoke()
            r2 = 0
            access$setTrackingInProgress$p(r0, r2)
            androidx.compose.ui.graphics.layer.GraphicsLayer r3 = access$getOldDependency$p(r0)
            if (r3 == 0) goto L3e
            r1.invoke(r3)
        L3e:
            androidx.collection.MutableScatterSet r3 = access$getOldDependenciesSet$p(r0)
            if (r3 == 0) goto L8f
            boolean r4 = r3.isNotEmpty()
            if (r4 == 0) goto L8f
            java.lang.Object[] r4 = r3.elements
            long[] r5 = r3.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L8c
            r7 = r2
        L54:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L87
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r2
        L6e:
            if (r12 >= r10) goto L85
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L81
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            r1.invoke(r13)
        L81:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L6e
        L85:
            if (r10 != r11) goto L8c
        L87:
            if (r7 == r6) goto L8c
            int r7 = r7 + 1
            goto L54
        L8c:
            r3.clear()
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.graphics.layer.ChildLayerDependenciesTracker.withTracking(hd.l, hd.a):void");
    }
}
