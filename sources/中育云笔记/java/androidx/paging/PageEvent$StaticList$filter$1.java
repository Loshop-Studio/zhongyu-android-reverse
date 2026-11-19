package androidx.paging;

import androidx.paging.PageEvent;
import com.taobao.sophix.PatchStatus;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PageEvent$StaticList", m26211f = "PageEvent.kt", m26212l = {PatchStatus.CODE_LOAD_AES_DECRYPT}, m26213m = "filter", m26214v = 1)
/* loaded from: classes3.dex */
public final class PageEvent$StaticList$filter$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PageEvent.StaticList<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$filter$1(PageEvent.StaticList<T> staticList, InterfaceC11588c<? super PageEvent$StaticList$filter$1> interfaceC11588c) {
        super(interfaceC11588c);
        this.this$0 = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.filter(null, this);
    }
}
