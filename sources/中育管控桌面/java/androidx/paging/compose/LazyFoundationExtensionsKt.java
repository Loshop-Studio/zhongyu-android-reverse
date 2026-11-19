package androidx.paging.compose;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m7879d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u0000\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00070\b2,\b\u0002\u0010\t\u001a&\u0012\u0018\u0012\u0016H\u0007¢\u0006\u0002\b\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0001\u001aa\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00070\b2*\b\u0002\u0010\r\u001a$\u0012\u0018\u0012\u0016H\u0007¢\u0006\u0002\b\n¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0001¨\u0006\u000e"}, m7880d2 = {"itemContentType", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/paging/compose/LazyPagingItems;", "contentType", "Lkotlin/jvm/JvmSuppressWildcards;", "item", "itemKey", "key", "paging-compose_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class LazyFoundationExtensionsKt {
    public static final <T> Function1<Integer, Object> itemContentType(final LazyPagingItems<T> lazyPagingItems, final Function1<T, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "<this>");
        return new Function1<Integer, Object>() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt.itemContentType.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i6) {
                if (function1 == null) {
                    return null;
                }
                Object objPeek = lazyPagingItems.peek(i6);
                return objPeek == null ? PagingPlaceholderContentType.INSTANCE : function1.invoke(objPeek);
            }
        };
    }

    public static /* synthetic */ Function1 itemContentType$default(LazyPagingItems lazyPagingItems, Function1 function1, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            function1 = null;
        }
        return itemContentType(lazyPagingItems, function1);
    }

    public static final <T> Function1<Integer, Object> itemKey(final LazyPagingItems<T> lazyPagingItems, final Function1<T, ? extends Object> function1) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "<this>");
        return new Function1<Integer, Object>() { // from class: androidx.paging.compose.LazyFoundationExtensionsKt.itemKey.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i6) {
                if (function1 == null) {
                    return PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(i6);
                }
                Object objPeek = lazyPagingItems.peek(i6);
                return objPeek == null ? PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(i6) : function1.invoke(objPeek);
            }
        };
    }

    public static /* synthetic */ Function1 itemKey$default(LazyPagingItems lazyPagingItems, Function1 function1, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            function1 = null;
        }
        return itemKey(lazyPagingItems, function1);
    }
}
