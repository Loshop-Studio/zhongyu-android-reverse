package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class ScopeMap<Key, Scope> {
    private final MutableScatterMap<Object, Object> map;

    private /* synthetic */ ScopeMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.collection.MutableScatterSet] */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m23797addimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Scope scope) {
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(key);
        int i10 = 0;
        int i11 = 1;
        boolean z10 = iFindInsertIndex < 0;
        AbstractC9126n abstractC9126n = null;
        Scope scope2 = z10 ? null : mutableScatterMap.values[iFindInsertIndex];
        if (scope2 != null) {
            if (scope2 instanceof MutableScatterSet) {
                AbstractC9133u.m16131e(scope2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                ((MutableScatterSet) scope2).add(scope);
            } else if (scope2 != scope) {
                ?? mutableScatterSet = new MutableScatterSet(i10, i11, abstractC9126n);
                AbstractC9133u.m16131e(scope2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                mutableScatterSet.add(scope2);
                mutableScatterSet.add(scope);
                scope = mutableScatterSet;
            }
            scope = scope2;
        }
        if (!z10) {
            mutableScatterMap.values[iFindInsertIndex] = scope;
            return;
        }
        int i12 = ~iFindInsertIndex;
        mutableScatterMap.keys[i12] = key;
        mutableScatterMap.values[i12] = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* renamed from: anyScopeOf-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m23798anyScopeOfimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r13, Key r14, p300x7.InterfaceC10570l r15) {
        /*
            java.lang.Object r13 = r13.get(r14)
            r14 = 0
            if (r13 == 0) goto L67
            boolean r0 = r13 instanceof androidx.collection.MutableScatterSet
            r1 = 1
            if (r0 == 0) goto L5a
            androidx.collection.MutableScatterSet r13 = (androidx.collection.MutableScatterSet) r13
            java.lang.Object[] r0 = r13.elements
            long[] r13 = r13.metadata
            int r2 = r13.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L67
            r3 = r14
        L18:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L55
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r14
        L32:
            if (r8 >= r6) goto L53
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4f
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            java.lang.Object r9 = r15.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4f
            return r1
        L4f:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L32
        L53:
            if (r6 != r7) goto L67
        L55:
            if (r3 == r2) goto L67
            int r3 = r3 + 1
            goto L18
        L5a:
            java.lang.Object r13 = r15.invoke(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L67
            return r1
        L67:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.m23798anyScopeOfimpl(androidx.collection.MutableScatterMap, java.lang.Object, x7.l):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* renamed from: asMap-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<Key, java.util.Set<Scope>> m23799asMapimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object[] r1 = r15.keys
            java.lang.Object[] r2 = r15.values
            long[] r15 = r15.metadata
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6e
            r4 = 0
            r5 = r4
        L12:
            r6 = r15[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L69
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2c:
            if (r10 >= r8) goto L67
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L63
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            java.lang.String r13 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r12, r13)
            boolean r13 = r11 instanceof androidx.collection.MutableScatterSet
            if (r13 == 0) goto L53
            java.lang.String r13 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r11, r13)
            androidx.collection.MutableScatterSet r11 = (androidx.collection.MutableScatterSet) r11
            java.util.Set r11 = r11.asSet()
            goto L60
        L53:
            java.lang.String r13 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.AbstractC9133u.m16131e(r11, r13)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.Set r11 = p134i7.AbstractC8812w0.m14789g(r11)
        L60:
            r0.put(r12, r11)
        L63:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2c
        L67:
            if (r8 != r9) goto L6e
        L69:
            if (r5 == r3) goto L6e
            int r5 = r5 + 1
            goto L12
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.m23799asMapimpl(androidx.collection.MutableScatterMap):java.util.Map");
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScopeMap m23800boximpl(MutableScatterMap mutableScatterMap) {
        return new ScopeMap(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m23801clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <Key, Scope> MutableScatterMap<Object, Object> m23802constructorimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m23803constructorimpl$default(MutableScatterMap mutableScatterMap, int i10, AbstractC9126n abstractC9126n) {
        if ((i10 & 1) != 0) {
            mutableScatterMap = ScatterMapKt.mutableScatterMapOf();
        }
        return m23802constructorimpl(mutableScatterMap);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m23804containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key) {
        return mutableScatterMap.containsKey(key);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23805equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof ScopeMap) && AbstractC9133u.m16128b(mutableScatterMap, ((ScopeMap) obj).m23815unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23806equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return AbstractC9133u.m16128b(mutableScatterMap, mutableScatterMap2);
    }

    /* renamed from: forEachScopeOf-impl, reason: not valid java name */
    public static final void m23807forEachScopeOfimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, InterfaceC10570l interfaceC10570l) {
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MutableScatterSet)) {
            interfaceC10570l.invoke(obj);
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        interfaceC10570l.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m23808getSizeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.getSize();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23809hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final boolean m23810removeimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Scope scope) {
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MutableScatterSet)) {
            if (!AbstractC9133u.m16128b(obj, scope)) {
                return false;
            }
            mutableScatterMap.remove(key);
            return true;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        boolean zRemove = mutableScatterSet.remove(scope);
        if (zRemove && mutableScatterSet.isEmpty()) {
            mutableScatterMap.remove(key);
        }
        return zRemove;
    }

    /* renamed from: removeScope-impl, reason: not valid java name */
    public static final void m23811removeScopeimpl(MutableScatterMap<Object, Object> mutableScatterMap, Scope scope) {
        boolean zIsEmpty;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = mutableScatterMap.keys[i13];
                        Object obj2 = mutableScatterMap.values[i13];
                        if (obj2 instanceof MutableScatterSet) {
                            AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            mutableScatterSet.remove(scope);
                            zIsEmpty = mutableScatterSet.isEmpty();
                        } else {
                            zIsEmpty = obj2 == scope;
                        }
                        if (zIsEmpty) {
                            mutableScatterMap.removeValueAt(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: removeScopeIf-impl, reason: not valid java name */
    public static final void m23812removeScopeIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, InterfaceC10570l interfaceC10570l) {
        long[] jArr;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        boolean zBooleanValue;
        MutableScatterSet mutableScatterSet;
        long[] jArr3;
        int i11;
        MutableScatterSet mutableScatterSet2;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j12 = jArr4[i12];
            char c11 = 7;
            long j13 = -9187201950435737472L;
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j12 & 255) < 128) {
                        int i16 = (i12 << 3) + i15;
                        c10 = c11;
                        Object obj = mutableScatterMap.keys[i16];
                        Object obj2 = mutableScatterMap.values[i16];
                        j11 = j13;
                        if (obj2 instanceof MutableScatterSet) {
                            AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet3.elements;
                            long[] jArr5 = mutableScatterSet3.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i17 = i13;
                                MutableScatterSet mutableScatterSet4 = mutableScatterSet3;
                                int i18 = 0;
                                while (true) {
                                    long j14 = jArr5[i18];
                                    j10 = j12;
                                    if ((((~j14) << c10) & j14 & j11) != j11) {
                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            if ((j14 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i21 = (i18 << 3) + i20;
                                                i11 = i20;
                                                if (((Boolean) interfaceC10570l.invoke(objArr[i21])).booleanValue()) {
                                                    mutableScatterSet2 = mutableScatterSet4;
                                                    mutableScatterSet2.removeElementAt(i21);
                                                }
                                                j14 >>= i17;
                                                mutableScatterSet4 = mutableScatterSet2;
                                                i20 = i11 + 1;
                                                jArr4 = jArr3;
                                            } else {
                                                jArr3 = jArr4;
                                                i11 = i20;
                                            }
                                            mutableScatterSet2 = mutableScatterSet4;
                                            j14 >>= i17;
                                            mutableScatterSet4 = mutableScatterSet2;
                                            i20 = i11 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        mutableScatterSet = mutableScatterSet4;
                                        if (i19 != i17) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        mutableScatterSet = mutableScatterSet4;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    mutableScatterSet4 = mutableScatterSet;
                                    j12 = j10;
                                    jArr4 = jArr2;
                                    i17 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j10 = j12;
                                mutableScatterSet = mutableScatterSet3;
                            }
                            zBooleanValue = mutableScatterSet.isEmpty();
                        } else {
                            jArr2 = jArr4;
                            j10 = j12;
                            AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            zBooleanValue = ((Boolean) interfaceC10570l.invoke(obj2)).booleanValue();
                        }
                        if (zBooleanValue) {
                            mutableScatterMap.removeValueAt(i16);
                        }
                        i10 = 8;
                    } else {
                        jArr2 = jArr4;
                        j10 = j12;
                        c10 = c11;
                        j11 = j13;
                        i10 = i13;
                    }
                    j12 = j10 >> i10;
                    i15++;
                    i13 = i10;
                    c11 = c10;
                    j13 = j11;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i14 != i13) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i12 == length) {
                return;
            }
            i12++;
            jArr4 = jArr;
        }
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m23813setimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Scope scope) {
        mutableScatterMap.set(key, scope);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23814toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return "ScopeMap(map=" + mutableScatterMap + ')';
    }

    public boolean equals(Object obj) {
        return m23805equalsimpl(this.map, obj);
    }

    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public int hashCode() {
        return m23809hashCodeimpl(this.map);
    }

    public String toString() {
        return m23814toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m23815unboximpl() {
        return this.map;
    }
}
