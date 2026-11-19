package androidx.paging.compose;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class LazyFoundationExtensionsKt {
    public static final <T> InterfaceC10570l itemContentType(final LazyPagingItems<T> lazyPagingItems, final InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(lazyPagingItems, "<this>");
        return new InterfaceC10570l() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt.itemContentType.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                if (interfaceC10570l == null) {
                    return null;
                }
                Object objPeek = lazyPagingItems.peek(i10);
                return objPeek == null ? PagingPlaceholderContentType.INSTANCE : interfaceC10570l.invoke(objPeek);
            }
        };
    }

    public static /* synthetic */ InterfaceC10570l itemContentType$default(LazyPagingItems lazyPagingItems, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = null;
        }
        return itemContentType(lazyPagingItems, interfaceC10570l);
    }

    public static final <T> InterfaceC10570l itemKey(final LazyPagingItems<T> lazyPagingItems, final InterfaceC10570l interfaceC10570l) {
        AbstractC9133u.m16133g(lazyPagingItems, "<this>");
        return new InterfaceC10570l() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt.itemKey.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i10) {
                if (interfaceC10570l == null) {
                    return PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(i10);
                }
                Object objPeek = lazyPagingItems.peek(i10);
                return objPeek == null ? PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(i10) : interfaceC10570l.invoke(objPeek);
            }
        };
    }

    public static /* synthetic */ InterfaceC10570l itemKey$default(LazyPagingItems lazyPagingItems, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = null;
        }
        return itemKey(lazyPagingItems, interfaceC10570l);
    }
}
