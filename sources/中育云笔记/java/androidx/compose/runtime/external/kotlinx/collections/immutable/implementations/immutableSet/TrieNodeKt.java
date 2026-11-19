package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10964p;

/* loaded from: classes2.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i10, E e10) {
        Object[] objArr2 = new Object[objArr.length + 1];
        AbstractC10964p.m24029v(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC10964p.m24023p(objArr, objArr2, i10 + 1, i10, objArr.length);
        objArr2[i10] = e10;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i10, InterfaceC9540l interfaceC9540l) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length) {
            CommonFunctionsKt.m30418assert(i12 <= i11);
            if (((Boolean) interfaceC9540l.invoke(objArr[i11])).booleanValue()) {
                objArr2[i10 + i12] = objArr[i11];
                i12++;
                CommonFunctionsKt.m30418assert(i10 + i12 <= objArr2.length);
            }
            i11++;
        }
        return i12;
    }

    public static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i10, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(Object obj2) {
                    return Boolean.valueOf(obj2 != TrieNode.Companion.getEMPTY$runtime_release());
                }
            };
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < objArr.length) {
            CommonFunctionsKt.m30418assert(i13 <= i12);
            if (((Boolean) interfaceC9540l.invoke(objArr[i12])).booleanValue()) {
                objArr2[i10 + i13] = objArr[i12];
                i13++;
                CommonFunctionsKt.m30418assert(i10 + i13 <= objArr2.length);
            }
            i12++;
        }
        return i13;
    }

    public static final int indexSegment(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeCellAtIndex(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC10964p.m24029v(objArr, objArr2, 0, 0, i10, 6, null);
        AbstractC10964p.m24023p(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }
}
