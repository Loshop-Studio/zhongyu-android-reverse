package androidx.compose.foundation.gestures;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m17801f = "DragGestureDetector.kt", m17802l = {TbsListener.ErrorCode.NETWORK_NOT_WIFI_ERROR}, m17803m = "drag-jO51t88")
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$drag$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$drag$1(InterfaceC9324c<? super DragGestureDetectorKt$drag$1> interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m20554dragjO51t88(null, 0L, null, this);
    }
}
