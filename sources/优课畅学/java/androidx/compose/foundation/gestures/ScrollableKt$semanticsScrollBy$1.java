package androidx.compose.foundation.gestures;

import com.tencent.liteav.TXLiteAVCode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.ScrollableKt", m17801f = "Scrollable.kt", m17802l = {TXLiteAVCode.EVT_CAMERA_REMOVED}, m17803m = "semanticsScrollBy-d-4ec7I")
/* loaded from: classes.dex */
public final class ScrollableKt$semanticsScrollBy$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ScrollableKt$semanticsScrollBy$1(InterfaceC9324c<? super ScrollableKt$semanticsScrollBy$1> interfaceC9324c) {
        super(interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ScrollableKt.m20626semanticsScrollByd4ec7I(null, 0L, this);
    }
}
