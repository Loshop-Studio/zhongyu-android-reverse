package androidx.compose.p011ui.graphics.layer;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.p011ui.graphics.InlineClassHelperKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0086\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m5110d2 = {"Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Ld6/s;", "onDependencyRemoved", "Lkotlin/Function0;", "block", "withTracking", "(Lr6/c;Lr6/a;)V", "graphicsLayer", "", "onDependencyAdded", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)Z", "removeDependencies", "(Lr6/c;)V", "dependency", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "oldDependency", "Landroidx/collection/MutableScatterSet;", "dependenciesSet", "Landroidx/collection/MutableScatterSet;", "oldDependenciesSet", "trackingInProgress", "Z", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nChildLayerDependenciesTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/graphics/InlineClassHelperKt\n*L\n1#1,114:1\n1#2:115\n231#3,3:116\n200#3,7:119\n211#3,3:127\n214#3,9:131\n234#3:140\n231#3,3:146\n200#3,7:149\n211#3,3:157\n214#3,9:161\n234#3:170\n1399#4:126\n1270#4:130\n1399#4:156\n1270#4:160\n33#5,5:141\n*S KotlinDebug\n*F\n+ 1 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n*L\n63#1:116,3\n63#1:119,7\n63#1:127,3\n63#1:131,9\n63#1:140\n109#1:146,3\n109#1:149,7\n109#1:157,3\n109#1:161,9\n109#1:170\n63#1:126\n63#1:130\n109#1:156\n109#1:160\n71#1:141,5\n*E\n"})
/* loaded from: classes.dex */
public final class ChildLayerDependenciesTracker {

    @Nullable
    private MutableScatterSet<GraphicsLayer> dependenciesSet;

    @Nullable
    private GraphicsLayer dependency;

    @Nullable
    private MutableScatterSet<GraphicsLayer> oldDependenciesSet;

    @Nullable
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    public final boolean onDependencyAdded(@NotNull GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet = this.dependenciesSet;
        if (mutableScatterSet != null) {
            AbstractC5830k.m5327d(mutableScatterSet);
            mutableScatterSet.add(graphicsLayer);
        } else if (this.dependency != null) {
            MutableScatterSet<GraphicsLayer> mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            GraphicsLayer graphicsLayer2 = this.dependency;
            AbstractC5830k.m5327d(graphicsLayer2);
            mutableScatterSetMutableScatterSetOf.add(graphicsLayer2);
            mutableScatterSetMutableScatterSetOf.add(graphicsLayer);
            this.dependenciesSet = mutableScatterSetMutableScatterSetOf;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet2 = this.oldDependenciesSet;
        if (mutableScatterSet2 != null) {
            AbstractC5830k.m5327d(mutableScatterSet2);
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
    public final void removeDependencies(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r18) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.removeDependencies(r6.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void withTracking(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r18, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6469a r19) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.graphics.layer.ChildLayerDependenciesTracker.withTracking(r6.c, r6.a):void");
    }
}
