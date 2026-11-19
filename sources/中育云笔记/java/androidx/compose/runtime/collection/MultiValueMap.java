package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p325rc.AbstractC10964p;

/* loaded from: classes2.dex */
public final class MultiValueMap<K, V> {
    private final MutableScatterMap<Object, Object> map;

    private /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m30380addimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k10, V v10) {
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(k10);
        boolean z10 = iFindInsertIndex < 0;
        Object obj = z10 ? null : mutableScatterMap.values[iFindInsertIndex];
        AbstractC9962d0.m20261l(obj);
        if (obj != null) {
            if (obj instanceof MutableObjectList) {
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<kotlin.Any>");
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                mutableObjectList.add(v10);
                v10 = mutableObjectList;
            } else {
                v10 = (V) ObjectListKt.mutableObjectListOf(obj, v10);
            }
        }
        if (!z10) {
            mutableScatterMap.values[iFindInsertIndex] = v10;
            return;
        }
        int i10 = ~iFindInsertIndex;
        mutableScatterMap.keys[i10] = k10;
        mutableScatterMap.values[i10] = v10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MultiValueMap m30381boximpl(MutableScatterMap mutableScatterMap) {
        return new MultiValueMap(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m30382clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> MutableScatterMap<Object, Object> m30383constructorimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m30384constructorimpl$default(MutableScatterMap mutableScatterMap, int i10, AbstractC9972n abstractC9972n) {
        int i11 = 1;
        if ((i10 & 1) != 0) {
            mutableScatterMap = new MutableScatterMap(0, i11, null);
        }
        return m30383constructorimpl(mutableScatterMap);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m30385containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k10) {
        return mutableScatterMap.contains(k10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30386equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof MultiValueMap) && AbstractC9979u.m20289b(mutableScatterMap, ((MultiValueMap) obj).m30398unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30387equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return AbstractC9979u.m20289b(mutableScatterMap, mutableScatterMap2);
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m30388forEachValueimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k10, InterfaceC9540l interfaceC9540l) {
        Object obj = mutableScatterMap.get(k10);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                interfaceC9540l.invoke(obj);
                return;
            }
            ObjectList objectList = (ObjectList) obj;
            Object[] objArr = objectList.content;
            int i10 = objectList._size;
            for (int i11 = 0; i11 < i10; i11++) {
                Object obj2 = objArr[i11];
                AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                interfaceC9540l.invoke(obj2);
            }
        }
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final ObjectList<V> m30389getimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k10) {
        Object obj = mutableScatterMap.get(k10);
        return obj == null ? ObjectListKt.emptyObjectList() : obj instanceof MutableObjectList ? (ObjectList) obj : ObjectListKt.objectListOf(obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30390hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m30391isEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m30392isNotEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m30393removeFirstimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k10) {
        V v10 = (V) mutableScatterMap.get(k10);
        if (v10 == 0) {
            return null;
        }
        if (!(v10 instanceof MutableObjectList)) {
            mutableScatterMap.remove(k10);
            return v10;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) v10;
        V v11 = (V) mutableObjectList.removeAt(0);
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k10);
        }
        if (mutableObjectList.getSize() == 1) {
            mutableScatterMap.set(k10, mutableObjectList.first());
        }
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m30394removeLastimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k10) {
        V v10 = (V) mutableScatterMap.get(k10);
        if (v10 == 0) {
            return null;
        }
        if (!(v10 instanceof MutableObjectList)) {
            mutableScatterMap.remove(k10);
            return v10;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) v10;
        V v11 = (V) ExtensionsKt.removeLast(mutableObjectList);
        AbstractC9979u.m20292e(v11, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k10);
        }
        if (mutableObjectList.getSize() == 1) {
            mutableScatterMap.set(k10, mutableObjectList.first());
        }
        return v11;
    }

    /* renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m30395removeValueIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k10, InterfaceC9540l interfaceC9540l) {
        Object obj = mutableScatterMap.get(k10);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                if (((Boolean) interfaceC9540l.invoke(obj)).booleanValue()) {
                    mutableScatterMap.remove(k10);
                    return;
                }
                return;
            }
            MutableObjectList mutableObjectList = (MutableObjectList) obj;
            int i10 = mutableObjectList._size;
            Object[] objArr = mutableObjectList.content;
            int i11 = 0;
            C10405j c10405jM21768u = AbstractC10410o.m21768u(0, i10);
            int iM21733b = c10405jM21768u.m21733b();
            int iM21734c = c10405jM21768u.m21734c();
            if (iM21733b <= iM21734c) {
                while (true) {
                    objArr[iM21733b - i11] = objArr[iM21733b];
                    if (((Boolean) interfaceC9540l.invoke(objArr[iM21733b])).booleanValue()) {
                        i11++;
                    }
                    if (iM21733b == iM21734c) {
                        break;
                    } else {
                        iM21733b++;
                    }
                }
            }
            AbstractC10964p.m23987B(objArr, null, i10 - i11, i10);
            mutableObjectList._size -= i11;
            if (mutableObjectList.isEmpty()) {
                mutableScatterMap.remove(k10);
            }
            if (mutableObjectList.getSize() == 0) {
                mutableScatterMap.set(k10, mutableObjectList.first());
            }
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30396toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return "MultiValueMap(map=" + mutableScatterMap + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* renamed from: values-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.collection.ObjectList<V> m30397valuesimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r14) {
        /*
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lb
            androidx.collection.ObjectList r14 = androidx.collection.ObjectListKt.emptyObjectList()
            return r14
        Lb:
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r2, r3, r1)
            java.lang.Object[] r1 = r14.values
            long[] r14 = r14.metadata
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L69
            r4 = r2
        L1d:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L64
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L37:
            if (r9 >= r7) goto L62
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L5e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof androidx.collection.MutableObjectList
            if (r11 == 0) goto L56
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>"
            kotlin.jvm.internal.AbstractC9979u.m20292e(r10, r11)
            androidx.collection.MutableObjectList r10 = (androidx.collection.MutableObjectList) r10
            r0.addAll(r10)
            goto L5e
        L56:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            kotlin.jvm.internal.AbstractC9979u.m20292e(r10, r11)
            r0.add(r10)
        L5e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L37
        L62:
            if (r7 != r8) goto L69
        L64:
            if (r4 == r3) goto L69
            int r4 = r4 + 1
            goto L1d
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.MultiValueMap.m30397valuesimpl(androidx.collection.MutableScatterMap):androidx.collection.ObjectList");
    }

    public boolean equals(Object obj) {
        return m30386equalsimpl(this.map, obj);
    }

    public int hashCode() {
        return m30390hashCodeimpl(this.map);
    }

    public String toString() {
        return m30396toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m30398unboximpl() {
        return this.map;
    }
}
