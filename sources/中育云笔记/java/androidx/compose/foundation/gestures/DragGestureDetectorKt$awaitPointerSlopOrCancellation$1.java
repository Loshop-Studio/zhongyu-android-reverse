package androidx.compose.foundation.gestures;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m26211f = "DragGestureDetector.kt", m26212l = {IMediaPlayer.MEDIA_INFO_METADATA_UPDATE, 825}, m26213m = "awaitPointerSlopOrCancellation-6ksA65w")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitPointerSlopOrCancellation$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(InterfaceC11588c<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> interfaceC11588c) {
        super(interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m27147awaitPointerSlopOrCancellation6ksA65w(null, 0L, 0, null, 0L, null, this);
    }
}
