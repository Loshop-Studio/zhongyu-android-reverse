package com.zykj.insight.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5191c = "com.zykj.insight.network.RefreshRepositoryImpl", m5192f = "RefreshRepositoryImpl.kt", m5193i = {0, 1}, m5194l = {27, 33}, m5195m = "refreshToken", m5196n = {"this", "this"}, m5197s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
public final class RefreshRepositoryImpl$refreshToken$1 extends ContinuationImpl {

    /* renamed from: a */
    public Object f4164a;

    /* renamed from: b */
    public /* synthetic */ Object f4165b;

    /* renamed from: c */
    public final /* synthetic */ RefreshRepositoryImpl f4166c;

    /* renamed from: d */
    public int f4167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRepositoryImpl$refreshToken$1(RefreshRepositoryImpl refreshRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.f4166c = refreshRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4165b = obj;
        this.f4167d |= Integer.MIN_VALUE;
        return this.f4166c.mo4605a(this);
    }
}
