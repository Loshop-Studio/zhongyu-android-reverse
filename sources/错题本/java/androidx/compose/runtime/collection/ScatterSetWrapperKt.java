package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a8\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a.\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0006H\u0080\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/collection/ScatterSet;", "", "wrapIntoSet", "(Landroidx/collection/ScatterSet;)Ljava/util/Set;", "", "Lkotlin/Function1;", "Ld6/s;", "block", "fastForEach", "(Ljava/util/Set;Lr6/c;)V", "", "fastAny", "(Ljava/util/Set;Lr6/c;)Z", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n231#2,3:57\n200#2,7:60\n211#2,3:68\n214#2,9:72\n234#2:81\n256#2,2:84\n231#2,3:86\n200#2,7:89\n211#2,3:97\n214#2,9:101\n234#2:110\n258#2:111\n1399#3:67\n1270#3:71\n1399#3:96\n1270#3:100\n1855#4,2:82\n1747#4,3:112\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n*L\n43#1:57,3\n43#1:60,7\n43#1:68,3\n43#1:72,9\n43#1:81\n52#1:84,2\n52#1:86,3\n52#1:89,7\n52#1:97,3\n52#1:101,9\n52#1:110\n52#1:111\n43#1:67\n43#1:71\n52#1:96\n52#1:100\n46#1:82,2\n54#1:112,3\n*E\n"})
/* loaded from: classes.dex */
public final class ScatterSetWrapperKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean fastAny(@org.jetbrains.annotations.NotNull java.util.Set<? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r15) {
        /*
            boolean r0 = r14 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L59
            androidx.compose.runtime.collection.ScatterSetWrapper r14 = (androidx.compose.runtime.collection.ScatterSetWrapper) r14
            androidx.collection.ScatterSet r14 = r14.getSet$runtime_release()
            java.lang.Object[] r0 = r14.elements
            long[] r14 = r14.metadata
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L58
            r4 = r2
        L16:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L53
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L30:
            if (r9 >= r7) goto L51
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            return r1
        L4d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L51:
            if (r7 != r8) goto L58
        L53:
            if (r4 == r3) goto L58
            int r4 = r4 + 1
            goto L16
        L58:
            return r2
        L59:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            boolean r0 = r14 instanceof java.util.Collection
            if (r0 == 0) goto L69
            r0 = r14
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L69
            return r2
        L69:
            java.util.Iterator r14 = r14.iterator()
        L6d:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r0 = r14.next()
            java.lang.Object r0 = r15.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6d
            return r1
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScatterSetWrapperKt.fastAny(java.util.Set, r6.c):boolean");
    }

    public static final <T> void fastForEach(@NotNull Set<? extends T> set, @NotNull InterfaceC6471c interfaceC6471c) {
        if (!(set instanceof ScatterSetWrapper)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                interfaceC6471c.invoke(it.next());
            }
            return;
        }
        ScatterSet<T> set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
        Object[] objArr = set$runtime_release.elements;
        long[] jArr = set$runtime_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j7 = jArr[i];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        interfaceC6471c.invoke(objArr[(i << 3) + i9]);
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @NotNull
    public static final <T> Set<T> wrapIntoSet(@NotNull ScatterSet<T> scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}
