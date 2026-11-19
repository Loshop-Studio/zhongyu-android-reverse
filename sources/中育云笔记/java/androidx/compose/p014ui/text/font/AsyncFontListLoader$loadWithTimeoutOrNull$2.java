package androidx.compose.p014ui.text.font;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", m26211f = "FontListFontFamilyTypefaceAdapter.kt", m26212l = {315}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Font $this_loadWithTimeoutOrNull;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$loadWithTimeoutOrNull$2(AsyncFontListLoader asyncFontListLoader, Font font, InterfaceC11588c<? super AsyncFontListLoader$loadWithTimeoutOrNull$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = asyncFontListLoader;
        this.$this_loadWithTimeoutOrNull = font;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new AsyncFontListLoader$loadWithTimeoutOrNull$2(this.this$0, this.$this_loadWithTimeoutOrNull, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return obj;
        }
        AbstractC9924b.m20071b(obj);
        PlatformFontLoader platformFontLoader = this.this$0.platformFontLoader;
        Font font = this.$this_loadWithTimeoutOrNull;
        this.label = 1;
        Object objAwaitLoad = platformFontLoader.awaitLoad(font, this);
        return objAwaitLoad == objM25952f ? objM25952f : objAwaitLoad;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<Object> interfaceC11588c) {
        return ((AsyncFontListLoader$loadWithTimeoutOrNull$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
