package androidx.compose.p013ui.input.nestedscroll;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode", m17801f = "NestedScrollNode.kt", m17802l = {TbsListener.ErrorCode.READ_RESPONSE_ERROR, TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH}, m17803m = "onPostFling-RZ2iAVY")
/* loaded from: classes2.dex */
public final class NestedScrollNode$onPostFling$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollNode$onPostFling$1(NestedScrollNode nestedScrollNode, InterfaceC9324c<? super NestedScrollNode$onPostFling$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = nestedScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo20627onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
