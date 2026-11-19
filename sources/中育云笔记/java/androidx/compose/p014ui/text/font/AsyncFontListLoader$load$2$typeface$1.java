package androidx.compose.p014ui.text.font;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", m26211f = "FontListFontFamilyTypefaceAdapter.kt", m26212l = {282}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements InterfaceC9540l {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, InterfaceC11588c<? super AsyncFontListLoader$load$2$typeface$1> interfaceC11588c) {
        super(1, interfaceC11588c);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(InterfaceC11588c<?> interfaceC11588c) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, interfaceC11588c);
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
        AsyncFontListLoader asyncFontListLoader = this.this$0;
        Font font = this.$font;
        this.label = 1;
        Object objLoadWithTimeoutOrNull$ui_text_release = asyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(font, this);
        return objLoadWithTimeoutOrNull$ui_text_release == objM25952f ? objM25952f : objLoadWithTimeoutOrNull$ui_text_release;
    }

    @Override // p181hd.InterfaceC9540l
    public final Object invoke(InterfaceC11588c<Object> interfaceC11588c) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
