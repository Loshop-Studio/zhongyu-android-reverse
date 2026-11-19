package androidx.compose.foundation.gestures;

import com.tencent.ijk.media.player.IMediaPlayer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m17801f = "DragGestureDetector.kt", m17802l = {IMediaPlayer.MEDIA_INFO_METADATA_UPDATE, 825}, m17803m = "awaitPointerSlopOrCancellation-6ksA65w")
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

    public DragGestureDetectorKt$awaitPointerSlopOrCancellation$1(InterfaceC9324c<? super DragGestureDetectorKt$awaitPointerSlopOrCancellation$1> interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m20545awaitPointerSlopOrCancellation6ksA65w(null, 0L, 0, null, 0L, null, this);
    }
}
