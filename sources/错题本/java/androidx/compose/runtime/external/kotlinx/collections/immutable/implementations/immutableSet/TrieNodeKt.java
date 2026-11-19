package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\b\u0000\u0010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u000b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r\u001aN\u0010\u0013\u001a\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00110\u0010H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, m5110d2 = {"", "index", "shift", "indexSegment", "(II)I", ExifInterface.LONGITUDE_EAST, "", "", "element", "addElementAtIndex", "([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;", "cellIndex", "removeCellAtIndex", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "newArray", "newArrayOffset", "Lkotlin/Function1;", "", "predicate", "filterTo", "([Ljava/lang/Object;[Ljava/lang/Object;ILr6/c;)I", "MAX_BRANCHING_FACTOR", "I", "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> Object[] addElementAtIndex(Object[] objArr, int i, E e) {
        Object[] objArr2 = new Object[objArr.length + 1];
        AbstractC5802q.m5182I(objArr, objArr2, 0, 0, i, 6);
        AbstractC5802q.m5178E(objArr, objArr2, i + 1, i, objArr.length);
        objArr2[i] = e;
        return objArr2;
    }

    private static final int filterTo(Object[] objArr, Object[] objArr2, int i, InterfaceC6471c interfaceC6471c) {
        int i8 = 0;
        int i9 = 0;
        while (i8 < objArr.length) {
            CommonFunctionsKt.m10222assert(i9 <= i8);
            if (((Boolean) interfaceC6471c.invoke(objArr[i8])).booleanValue()) {
                objArr2[i + i9] = objArr[i8];
                i9++;
                CommonFunctionsKt.m10222assert(i + i9 <= objArr2.length);
            }
            i8++;
        }
        return i9;
    }

    public static /* synthetic */ int filterTo$default(Object[] objArr, Object[] objArr2, int i, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i = 0;
        }
        if ((i8 & 4) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1
                @Override // p152r6.InterfaceC6471c
                public final Boolean invoke(Object obj2) {
                    return Boolean.valueOf(obj2 != TrieNode.INSTANCE.getEMPTY$runtime_release());
                }
            };
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < objArr.length) {
            CommonFunctionsKt.m10222assert(i10 <= i9);
            if (((Boolean) interfaceC6471c.invoke(objArr[i9])).booleanValue()) {
                objArr2[i + i10] = objArr[i9];
                i10++;
                CommonFunctionsKt.m10222assert(i + i10 <= objArr2.length);
            }
            i9++;
        }
        return i10;
    }

    public static final int indexSegment(int i, int i8) {
        return (i >> i8) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] removeCellAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC5802q.m5182I(objArr, objArr2, 0, 0, i, 6);
        AbstractC5802q.m5178E(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }
}
