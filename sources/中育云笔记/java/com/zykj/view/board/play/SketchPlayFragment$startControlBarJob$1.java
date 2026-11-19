package com.zykj.view.board.play;

import androidx.lifecycle.CoroutineLiveDataKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.play.SketchPlayFragment$startControlBarJob$1", m26211f = "SketchPlayFragment.kt", m26212l = {IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SketchPlayFragment$startControlBarJob$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20413c;

    /* renamed from: d */
    public final /* synthetic */ SketchPlayFragment f20414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$startControlBarJob$1(SketchPlayFragment sketchPlayFragment, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20414d = sketchPlayFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SketchPlayFragment$startControlBarJob$1(this.f20414d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20413c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            this.f20413c = 1;
            if (DelayKt.m20376b(CoroutineLiveDataKt.DEFAULT_TIMEOUT, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f20414d.m17205Y();
        InterfaceC9529a interfaceC9529aM21710c = this.f20414d.f20379f.m21710c();
        if (interfaceC9529aM21710c != null) {
            interfaceC9529aM21710c.invoke();
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SketchPlayFragment$startControlBarJob$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
