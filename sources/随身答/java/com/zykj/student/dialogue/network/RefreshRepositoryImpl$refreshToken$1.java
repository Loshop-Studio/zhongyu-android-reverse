package com.zykj.student.dialogue.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.network.RefreshRepositoryImpl", m13451f = "RefreshRepositoryImpl.kt", m13452i = {}, m13453l = {25}, m13454m = "refreshToken", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class RefreshRepositoryImpl$refreshToken$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f10558a;

    /* renamed from: b */
    public final /* synthetic */ RefreshRepositoryImpl f10559b;

    /* renamed from: c */
    public int f10560c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshRepositoryImpl$refreshToken$1(RefreshRepositoryImpl refreshRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.f10559b = refreshRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10558a = obj;
        this.f10560c |= Integer.MIN_VALUE;
        return this.f10559b.mo9976a(this);
    }
}
