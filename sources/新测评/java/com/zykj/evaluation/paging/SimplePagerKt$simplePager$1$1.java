package com.zykj.evaluation.paging;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0007J#\u0010\b\u001a\u0004\u0018\u00010\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m13558d2 = {"com/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1", "Landroidx/paging/PagingSource;", "", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSimplePager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimplePager.kt\ncom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1563#2:55\n1634#2,3:56\n*S KotlinDebug\n*F\n+ 1 SimplePager.kt\ncom/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1\n*L\n34#1:55\n34#1:56,3\n*E\n"})
/* loaded from: classes4.dex */
public final class SimplePagerKt$simplePager$1$1 extends PagingSource<Integer, Object> {

    /* renamed from: a */
    public final /* synthetic */ Function3 f8809a;

    /* renamed from: b */
    public final /* synthetic */ Function2 f8810b;

    public SimplePagerKt$simplePager$1$1(Function3 function3, Function2 function2) {
        this.f8809a = function3;
        this.f8810b = function2;
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: getRefreshKey, reason: merged with bridge method [inline-methods] */
    public Integer getRefreshKey2(PagingState<Integer, Object> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x013d -> B:58:0x0142). Please report as a decompilation issue!!! */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> r19, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, java.lang.Object>> r20) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.paging.SimplePagerKt$simplePager$1$1.load(androidx.paging.PagingSource$LoadParams, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/paging/SimplePagerKt$simplePager$1$1.smali:113
    }
}
