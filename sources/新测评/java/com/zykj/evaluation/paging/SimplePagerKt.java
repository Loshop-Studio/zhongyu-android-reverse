package com.zykj.evaluation.paging;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import com.zykj.evaluation.paging.SimplePagerKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public abstract class SimplePagerKt {
    /* renamed from: b */
    public static final Flow m8776b(PagingConfig config, final Function3 call, final Function2 convert) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(convert, "convert");
        return new Pager(config, 0, new Function0() { // from class: q5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SimplePagerKt.m8778d(call, convert);
            }
        }).getFlow();
    }

    /* renamed from: c */
    public static /* synthetic */ Flow m8777c(PagingConfig pagingConfig, Function3 function3, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pagingConfig = new PagingConfig(30, 0, false, 90, 0, 0, 54, null);
        }
        return m8776b(pagingConfig, function3, function2);
    }

    /* renamed from: d */
    public static final PagingSource m8778d(Function3 function3, Function2 function2) {
        return new SimplePagerKt$simplePager$1$1(function3, function2);
    }
}
