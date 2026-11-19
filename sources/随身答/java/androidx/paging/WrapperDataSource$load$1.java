package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "androidx.paging.WrapperDataSource", m13451f = "WrapperDataSource.jvm.kt", m13452i = {0}, m13453l = {68}, m13454m = "load$suspendImpl", m13455n = {"$this"}, m13456s = {"L$0"})
/* loaded from: classes3.dex */
public final class WrapperDataSource$load$1<Key, ValueFrom, ValueTo> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WrapperDataSource<Key, ValueFrom, ValueTo> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource$load$1(WrapperDataSource<Key, ValueFrom, ValueTo> wrapperDataSource, Continuation<? super WrapperDataSource$load$1> continuation) {
        super(continuation);
        this.this$0 = wrapperDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WrapperDataSource.load$suspendImpl(this.this$0, null, this);
    }
}
