package androidx.compose.runtime.collection;

import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001c\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0016H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001bJ;\u0010\u001f\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u00002!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00120\u0016H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b#\u0010$J5\u0010)\u001a\u00020\n2#\b\u0004\u0010&\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00120\u0016H\u0086\b¢\u0006\u0004\b'\u0010(J\u0015\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b*\u0010+J\u001f\u00101\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010.0-¢\u0006\u0004\b/\u00100J\u0010\u00105\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00109\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u00020\u00122\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010?R\u0011\u0010A\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b@\u00108\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006B"}, m5110d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "", "Key", "Scope", "Landroidx/collection/MutableScatterMap;", "map", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "key", "scope", "Ld6/s;", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", "add", "value", "set-impl", "set", "element", "", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "contains", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "block", "forEachScopeOf-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lr6/c;)V", "forEachScopeOf", "anyScopeOf-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lr6/c;)Z", "anyScopeOf", "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "clear", "remove-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "predicate", "removeScopeIf-impl", "(Landroidx/collection/MutableScatterMap;Lr6/c;)V", "removeScopeIf", "removeScope-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V", "removeScope", "", "", "asMap-impl", "(Landroidx/collection/MutableScatterMap;)Ljava/util/Map;", "asMap", "", "toString-impl", "(Landroidx/collection/MutableScatterMap;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/collection/MutableScatterMap;)I", "hashCode", "other", "equals-impl", "equals", "Landroidx/collection/MutableScatterMap;", "getMap", "()Landroidx/collection/MutableScatterMap;", "getSize-impl", "size", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,176:1\n67#1,6:217\n75#1,4:248\n694#2,15:177\n842#2:252\n844#2:266\n845#2,3:294\n848#2:303\n842#2:304\n844#2,4:318\n848#2:328\n231#3,3:192\n200#3,7:195\n211#3,3:203\n214#3,9:207\n234#3:216\n231#3,3:223\n200#3,7:226\n211#3,3:234\n214#3,9:238\n234#3:247\n200#3,7:269\n211#3,3:277\n214#3,2:281\n217#3,6:287\n1399#4:202\n1270#4:206\n1399#4:233\n1270#4:237\n1399#4:259\n1270#4:263\n1399#4:276\n1270#4:280\n1399#4:311\n1270#4:315\n1399#4:339\n1270#4:343\n329#5,6:253\n339#5,3:260\n342#5,2:264\n345#5,6:297\n329#5,6:305\n339#5,3:312\n342#5,2:316\n345#5,6:322\n357#5,4:329\n329#5,6:333\n339#5,3:340\n342#5,9:344\n361#5:353\n809#6,2:267\n812#6,4:283\n816#6:293\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n81#1:217,6\n81#1:248,4\n36#1:177,15\n123#1:252\n123#1:266\n123#1:294,3\n123#1:303\n142#1:304\n142#1:318,4\n142#1:328\n72#1:192,3\n72#1:195,7\n72#1:203,3\n72#1:207,9\n72#1:216\n81#1:223,3\n81#1:226,7\n81#1:234,3\n81#1:238,9\n81#1:247\n127#1:269,7\n127#1:277,3\n127#1:281,2\n127#1:287,6\n72#1:202\n72#1:206\n81#1:233\n81#1:237\n123#1:259\n123#1:263\n127#1:276\n127#1:280\n142#1:311\n142#1:315\n162#1:339\n162#1:343\n123#1:253,6\n123#1:260,3\n123#1:264,2\n123#1:297,6\n142#1:305,6\n142#1:312,3\n142#1:316,2\n142#1:322,6\n162#1:329,4\n162#1:333,6\n162#1:340,3\n162#1:344,9\n162#1:353\n127#1:267,2\n127#1:283,4\n127#1:293\n*E\n"})
/* loaded from: classes.dex */
public final class ScopeMap<Key, Scope> {

    @NotNull
    private final MutableScatterMap<Object, Object> map;

    private /* synthetic */ ScopeMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.collection.MutableScatterSet] */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m10203addimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull Key key, @NotNull Scope scope) {
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(key);
        int i = 0;
        int i8 = 1;
        boolean z8 = iFindInsertIndex < 0;
        AbstractC5824e abstractC5824e = null;
        Scope scope2 = z8 ? null : mutableScatterMap.values[iFindInsertIndex];
        if (scope2 != null) {
            if (scope2 instanceof MutableScatterSet) {
                ((MutableScatterSet) scope2).add(scope);
            } else if (scope2 != scope) {
                ?? mutableScatterSet = new MutableScatterSet(i, i8, abstractC5824e);
                mutableScatterSet.add(scope2);
                mutableScatterSet.add(scope);
                scope = mutableScatterSet;
            }
            scope = scope2;
        }
        if (!z8) {
            mutableScatterMap.values[iFindInsertIndex] = scope;
            return;
        }
        int i9 = ~iFindInsertIndex;
        mutableScatterMap.keys[i9] = key;
        mutableScatterMap.values[i9] = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* renamed from: anyScopeOf-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean m10204anyScopeOfimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r13, @org.jetbrains.annotations.NotNull Key r14, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6471c r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.m10204anyScopeOfimpl(androidx.collection.MutableScatterMap, java.lang.Object, r6.c):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: asMap-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<Key, java.util.Set<Scope>> m10205asMapimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object[] r1 = r15.keys
            java.lang.Object[] r2 = r15.values
            long[] r15 = r15.metadata
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L78
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
            if (r8 == 0) goto L73
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2c:
            if (r10 >= r8) goto L71
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L6d
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            java.lang.String r13 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r12, r13)
            boolean r13 = r11 instanceof androidx.collection.MutableScatterSet
            if (r13 == 0) goto L53
            java.lang.String r13 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r11, r13)
            androidx.collection.MutableScatterSet r11 = (androidx.collection.MutableScatterSet) r11
            java.util.Set r11 = r11.asSet()
            goto L6a
        L53:
            java.lang.String r13 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r11, r13)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.util.LinkedHashSet r13 = new java.util.LinkedHashSet
            r14 = 1
            int r14 = kotlin.collections.AbstractC5785e0.m5149C(r14)
            r13.<init>(r14)
            kotlin.collections.AbstractC5802q.m5200a0(r11, r13)
            r11 = r13
        L6a:
            r0.put(r12, r11)
        L6d:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2c
        L71:
            if (r8 != r9) goto L78
        L73:
            if (r5 == r3) goto L78
            int r5 = r5 + 1
            goto L12
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.m10205asMapimpl(androidx.collection.MutableScatterMap):java.util.Map");
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScopeMap m10206boximpl(MutableScatterMap mutableScatterMap) {
        return new ScopeMap(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m10207clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <Key, Scope> MutableScatterMap<Object, Object> m10208constructorimpl(@NotNull MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m10209constructorimpl$default(MutableScatterMap mutableScatterMap, int i, AbstractC5824e abstractC5824e) {
        if ((i & 1) != 0) {
            mutableScatterMap = ScatterMapKt.mutableScatterMapOf();
        }
        return m10208constructorimpl(mutableScatterMap);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m10210containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull Key key) {
        return mutableScatterMap.containsKey(key);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10211equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof ScopeMap) && AbstractC5830k.m5325b(mutableScatterMap, ((ScopeMap) obj).getMap());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10212equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return AbstractC5830k.m5325b(mutableScatterMap, mutableScatterMap2);
    }

    /* renamed from: forEachScopeOf-impl, reason: not valid java name */
    public static final void m10213forEachScopeOfimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull Key key, @NotNull InterfaceC6471c interfaceC6471c) {
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MutableScatterSet)) {
            interfaceC6471c.invoke(obj);
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
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

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m10214getSizeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.get_size();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10215hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final boolean m10216removeimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull Key key, @NotNull Scope scope) {
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MutableScatterSet)) {
            if (!obj.equals(scope)) {
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
    public static final void m10217removeScopeimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull Scope scope) {
        boolean zIsEmpty;
        long[] jArr = mutableScatterMap.metadata;
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
                        int i10 = (i << 3) + i9;
                        Object obj = mutableScatterMap.keys[i10];
                        Object obj2 = mutableScatterMap.values[i10];
                        if (obj2 instanceof MutableScatterSet) {
                            AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            mutableScatterSet.remove(scope);
                            zIsEmpty = mutableScatterSet.isEmpty();
                        } else {
                            zIsEmpty = obj2 == scope;
                        }
                        if (zIsEmpty) {
                            mutableScatterMap.removeValueAt(i10);
                        }
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

    /* renamed from: removeScopeIf-impl, reason: not valid java name */
    public static final void m10218removeScopeIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull InterfaceC6471c interfaceC6471c) {
        long[] jArr;
        long[] jArr2;
        long j7;
        char c;
        long j8;
        int i;
        boolean zBooleanValue;
        MutableScatterSet mutableScatterSet;
        long[] jArr3;
        int i8;
        MutableScatterSet mutableScatterSet2;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i9 = 0;
        while (true) {
            long j9 = jArr4[i9];
            char c9 = 7;
            long j10 = -9187201950435737472L;
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8;
                int i11 = 8 - ((~(i9 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((j9 & 255) < 128) {
                        int i13 = (i9 << 3) + i12;
                        c = c9;
                        Object obj = mutableScatterMap.keys[i13];
                        Object obj2 = mutableScatterMap.values[i13];
                        j8 = j10;
                        if (obj2 instanceof MutableScatterSet) {
                            AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet3.elements;
                            long[] jArr5 = mutableScatterSet3.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i14 = i10;
                                MutableScatterSet mutableScatterSet4 = mutableScatterSet3;
                                int i15 = 0;
                                while (true) {
                                    long j11 = jArr5[i15];
                                    j7 = j9;
                                    if ((((~j11) << c) & j11 & j8) != j8) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j11 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i18 = (i15 << 3) + i17;
                                                i8 = i17;
                                                if (((Boolean) interfaceC6471c.invoke(objArr[i18])).booleanValue()) {
                                                    mutableScatterSet2 = mutableScatterSet4;
                                                    mutableScatterSet2.removeElementAt(i18);
                                                }
                                                j11 >>= i14;
                                                mutableScatterSet4 = mutableScatterSet2;
                                                i17 = i8 + 1;
                                                jArr4 = jArr3;
                                            } else {
                                                jArr3 = jArr4;
                                                i8 = i17;
                                            }
                                            mutableScatterSet2 = mutableScatterSet4;
                                            j11 >>= i14;
                                            mutableScatterSet4 = mutableScatterSet2;
                                            i17 = i8 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        mutableScatterSet = mutableScatterSet4;
                                        if (i16 != i14) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        mutableScatterSet = mutableScatterSet4;
                                    }
                                    if (i15 == length2) {
                                        break;
                                    }
                                    i15++;
                                    mutableScatterSet4 = mutableScatterSet;
                                    j9 = j7;
                                    jArr4 = jArr2;
                                    i14 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j7 = j9;
                                mutableScatterSet = mutableScatterSet3;
                            }
                            zBooleanValue = mutableScatterSet.isEmpty();
                        } else {
                            jArr2 = jArr4;
                            j7 = j9;
                            AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            zBooleanValue = ((Boolean) interfaceC6471c.invoke(obj2)).booleanValue();
                        }
                        if (zBooleanValue) {
                            mutableScatterMap.removeValueAt(i13);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr4;
                        j7 = j9;
                        c = c9;
                        j8 = j10;
                        i = i10;
                    }
                    j9 = j7 >> i;
                    i12++;
                    i10 = i;
                    c9 = c;
                    j10 = j8;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i11 != i10) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i9 == length) {
                return;
            }
            i9++;
            jArr4 = jArr;
        }
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m10219setimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull Key key, @NotNull Scope scope) {
        mutableScatterMap.set(key, scope);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10220toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return "ScopeMap(map=" + mutableScatterMap + ')';
    }

    public boolean equals(Object obj) {
        return m10211equalsimpl(this.map, obj);
    }

    @NotNull
    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public int hashCode() {
        return m10215hashCodeimpl(this.map);
    }

    public String toString() {
        return m10220toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableScatterMap getMap() {
        return this.map;
    }
}
