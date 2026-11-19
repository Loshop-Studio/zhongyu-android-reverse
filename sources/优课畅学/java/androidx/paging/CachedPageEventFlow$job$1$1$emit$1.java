package androidx.paging;

import androidx.paging.CachedPageEventFlow$job$1;
import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p123h7.C8736p;
import p134i7.C8786j0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.paging.CachedPageEventFlow$job$1$1", m17801f = "CachedPageEventFlow.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN, 78}, m17803m = "emit")
/* loaded from: classes3.dex */
public final class CachedPageEventFlow$job$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachedPageEventFlow$job$1.C42871<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CachedPageEventFlow$job$1$1$emit$1(CachedPageEventFlow$job$1.C42871<? super T> c42871, InterfaceC9324c<? super CachedPageEventFlow$job$1$1$emit$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = c42871;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((C8786j0) null, (InterfaceC9324c<? super C8736p>) this);
    }
}
