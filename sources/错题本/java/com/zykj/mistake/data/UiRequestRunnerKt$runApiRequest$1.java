package com.zykj.mistake.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.network.ApiResp;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;

@Metadata(m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.data.UiRequestRunnerKt", m5303f = "UiRequestRunner.kt", m5304i = {0}, m5305l = {15}, m5306m = "runApiRequest", m5307n = {"request"}, m5308s = {"L$0"})
/* loaded from: classes3.dex */
final class UiRequestRunnerKt$runApiRequest$1<T extends ApiResp> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public UiRequestRunnerKt$runApiRequest$1(InterfaceC5631c<? super UiRequestRunnerKt$runApiRequest$1> interfaceC5631c) {
        super(interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3978a = AbstractC4496e.m3978a(null, this);
        return objM3978a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3978a : Result.m13955boximpl(objM3978a);
    }
}
