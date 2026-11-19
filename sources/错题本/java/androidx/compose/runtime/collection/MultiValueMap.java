package androidx.compose.runtime.collection;

import androidx.autofill.HintConstants;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015¢\u0006\u0004\b#\u0010$J;\u0010,\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002!\u0010)\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0&H\u0086\b¢\u0006\u0004\b*\u0010+J8\u0010/\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002!\u0010-\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00110&¢\u0006\u0004\b.\u0010+J\u0010\u00103\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00107\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u0010:\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006<"}, m5110d2 = {"Landroidx/compose/runtime/collection/MultiValueMap;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/MutableScatterMap;", "map", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "key", "value", "Ld6/s;", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", "add", "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "clear", "", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "contains", "Landroidx/collection/ObjectList;", "get-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "get", "isEmpty-impl", "(Landroidx/collection/MutableScatterMap;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "removeLast-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Ljava/lang/Object;", "removeLast", "removeFirst-impl", "removeFirst", "values-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/ObjectList;", "values", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "block", "forEachValue-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lr6/c;)V", "forEachValue", "condition", "removeValueIf-impl", "removeValueIf", "", "toString-impl", "(Landroidx/collection/MutableScatterMap;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroidx/collection/MutableScatterMap;)I", "hashCode", "other", "equals-impl", "equals", "Landroidx/collection/MutableScatterMap;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nMultiValueMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n+ 8 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,141:1\n694#2,5:142\n701#2,8:151\n4658#3,4:147\n1516#4:159\n372#5,3:160\n329#5,6:163\n339#5,3:170\n342#5,9:174\n375#5:183\n1399#6:169\n1270#6:173\n287#7,6:184\n84#7:194\n943#8,4:190\n947#8,8:195\n*S KotlinDebug\n*F\n+ 1 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n*L\n44#1:142,5\n44#1:151,8\n45#1:147,4\n107#1:159\n108#1:160,3\n108#1:163,6\n108#1:170,3\n108#1:174,9\n108#1:183\n108#1:169\n108#1:173\n121#1:184,6\n132#1:194\n132#1:190,4\n132#1:195,8\n*E\n"})
/* loaded from: classes.dex */
public final class MultiValueMap<K, V> {

    @NotNull
    private final MutableScatterMap<Object, Object> map;

    private /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m10184addimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull K k8, @NotNull V v2) {
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(k8);
        boolean z8 = iFindInsertIndex < 0;
        Object obj = z8 ? null : mutableScatterMap.values[iFindInsertIndex];
        if (obj != null) {
            if (obj instanceof MutableObjectList) {
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                mutableObjectList.add(v2);
                v2 = mutableObjectList;
            } else {
                v2 = (V) ObjectListKt.mutableObjectListOf(obj, v2);
            }
        }
        if (!z8) {
            mutableScatterMap.values[iFindInsertIndex] = v2;
            return;
        }
        int i = ~iFindInsertIndex;
        mutableScatterMap.keys[i] = k8;
        mutableScatterMap.values[i] = v2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MultiValueMap m10185boximpl(MutableScatterMap mutableScatterMap) {
        return new MultiValueMap(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m10186clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> MutableScatterMap<Object, Object> m10187constructorimpl(@NotNull MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m10188constructorimpl$default(MutableScatterMap mutableScatterMap, int i, AbstractC5824e abstractC5824e) {
        int i8 = 1;
        if ((i & 1) != 0) {
            mutableScatterMap = new MutableScatterMap(0, i8, null);
        }
        return m10187constructorimpl(mutableScatterMap);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m10189containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull K k8) {
        return mutableScatterMap.contains(k8);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10190equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof MultiValueMap) && AbstractC5830k.m5325b(mutableScatterMap, ((MultiValueMap) obj).getMap());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10191equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return AbstractC5830k.m5325b(mutableScatterMap, mutableScatterMap2);
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m10192forEachValueimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull K k8, @NotNull InterfaceC6471c interfaceC6471c) {
        Object obj = mutableScatterMap.get(k8);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                interfaceC6471c.invoke(obj);
                return;
            }
            ObjectList objectList = (ObjectList) obj;
            Object[] objArr = objectList.content;
            int i = objectList._size;
            for (int i8 = 0; i8 < i; i8++) {
                Object obj2 = objArr[i8];
                AbstractC5830k.m5328e(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                interfaceC6471c.invoke(obj2);
            }
        }
    }

    @NotNull
    /* renamed from: get-impl, reason: not valid java name */
    public static final ObjectList<V> m10193getimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull K k8) {
        Object obj = mutableScatterMap.get(k8);
        return obj == null ? ObjectListKt.emptyObjectList() : obj instanceof MutableObjectList ? (ObjectList) obj : ObjectListKt.objectListOf(obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10194hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m10195isEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m10196isNotEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m10197removeFirstimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull K k8) {
        V v2 = (V) mutableScatterMap.get(k8);
        if (v2 == 0) {
            return null;
        }
        if (!(v2 instanceof MutableObjectList)) {
            mutableScatterMap.remove(k8);
            return v2;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) v2;
        V v4 = (V) mutableObjectList.removeAt(0);
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k8);
        }
        if (mutableObjectList.getSize() == 1) {
            mutableScatterMap.set(k8, mutableObjectList.first());
        }
        return v4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m10198removeLastimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull K k8) {
        V v2 = (V) mutableScatterMap.get(k8);
        if (v2 == 0) {
            return null;
        }
        if (!(v2 instanceof MutableObjectList)) {
            mutableScatterMap.remove(k8);
            return v2;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) v2;
        V v4 = (V) ExtensionsKt.removeLast(mutableObjectList);
        AbstractC5830k.m5328e(v4, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k8);
        }
        if (mutableObjectList.getSize() == 1) {
            mutableScatterMap.set(k8, mutableObjectList.first());
        }
        return v4;
    }

    /* renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m10199removeValueIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, @NotNull K k8, @NotNull InterfaceC6471c interfaceC6471c) {
        Object obj = mutableScatterMap.get(k8);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                if (((Boolean) interfaceC6471c.invoke(obj)).booleanValue()) {
                    mutableScatterMap.remove(k8);
                    return;
                }
                return;
            }
            MutableObjectList mutableObjectList = (MutableObjectList) obj;
            int i = mutableObjectList._size;
            Object[] objArr = mutableObjectList.content;
            int i8 = 0;
            C6756f c6756fM5260N = AbstractC5806u.m5260N(0, i);
            int i9 = c6756fM5260N.f11420a;
            int i10 = c6756fM5260N.f11421b;
            if (i9 <= i10) {
                while (true) {
                    objArr[i9 - i8] = objArr[i9];
                    if (((Boolean) interfaceC6471c.invoke(objArr[i9])).booleanValue()) {
                        i8++;
                    }
                    if (i9 == i10) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            AbstractC5802q.m5186M(null, objArr, i - i8, i);
            mutableObjectList._size -= i8;
            if (mutableObjectList.isEmpty()) {
                mutableScatterMap.remove(k8);
            }
            if (mutableObjectList.getSize() == 0) {
                mutableScatterMap.set(k8, mutableObjectList.first());
            }
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10200toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return "MultiValueMap(map=" + mutableScatterMap + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: values-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.collection.ObjectList<V> m10201valuesimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r14) {
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
            kotlin.jvm.internal.AbstractC5830k.m5328e(r10, r11)
            androidx.collection.MutableObjectList r10 = (androidx.collection.MutableObjectList) r10
            r0.addAll(r10)
            goto L5e
        L56:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            kotlin.jvm.internal.AbstractC5830k.m5328e(r10, r11)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.MultiValueMap.m10201valuesimpl(androidx.collection.MutableScatterMap):androidx.collection.ObjectList");
    }

    public boolean equals(Object obj) {
        return m10190equalsimpl(this.map, obj);
    }

    public int hashCode() {
        return m10194hashCodeimpl(this.map);
    }

    public String toString() {
        return m10200toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableScatterMap getMap() {
        return this.map;
    }
}
