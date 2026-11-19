package com.zykj.view.board.board;

import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"", "it", "Ld6/s;", "<anonymous>", "(Ljava/lang/String;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$4$1$2", m5303f = "BoardFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes3.dex */
public final class BoardFragment$initExtraClickListener$3$4$1$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6471c $function;
    final /* synthetic */ ViewItemSketchRecordAudioBinding $this_run;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$4$1$2(InterfaceC6471c interfaceC6471c, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, InterfaceC5631c<? super BoardFragment$initExtraClickListener$3$4$1$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$function = interfaceC6471c;
        this.$this_run = viewItemSketchRecordAudioBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        BoardFragment$initExtraClickListener$3$4$1$2 boardFragment$initExtraClickListener$3$4$1$2 = new BoardFragment$initExtraClickListener$3$4$1$2(this.$function, this.$this_run, interfaceC5631c);
        boardFragment$initExtraClickListener$3$4$1$2.L$0 = obj;
        return boardFragment$initExtraClickListener$3$4$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        this.$function.invoke(str);
        this.$this_run.llPreview.setEnabled(true);
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(String str, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((BoardFragment$initExtraClickListener$3$4$1$2) create(str, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
