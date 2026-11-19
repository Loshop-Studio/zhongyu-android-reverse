package androidx.compose.p013ui.text.font;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;

@InterfaceC9539d(m17800c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", m17801f = "FontListFontFamilyTypefaceAdapter.kt", m17802l = {282}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements InterfaceC10570l {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, InterfaceC9324c<? super AsyncFontListLoader$load$2$typeface$1> interfaceC9324c) {
        super(1, interfaceC9324c);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(InterfaceC9324c<?> interfaceC9324c) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return obj;
        }
        AbstractC9079b.m15926b(obj);
        AsyncFontListLoader asyncFontListLoader = this.this$0;
        Font font = this.$font;
        this.label = 1;
        Object objLoadWithTimeoutOrNull$ui_text_release = asyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(font, this);
        return objLoadWithTimeoutOrNull$ui_text_release == objM17291f ? objM17291f : objLoadWithTimeoutOrNull$ui_text_release;
    }

    @Override // p300x7.InterfaceC10570l
    public final Object invoke(InterfaceC9324c<Object> interfaceC9324c) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
