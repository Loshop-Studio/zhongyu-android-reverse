package androidx.compose.p013ui.text.font;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m13558d2 = {"<anonymous>", ""}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", m13596f = "FontListFontFamilyTypefaceAdapter.kt", m13597i = {}, m13598l = {282}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, Continuation<? super AsyncFontListLoader$load$2$typeface$1> continuation) {
        super(1, continuation);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
        return invoke2((Continuation<Object>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        AsyncFontListLoader asyncFontListLoader = this.this$0;
        Font font = this.$font;
        this.label = 1;
        Object objLoadWithTimeoutOrNull$ui_text_release = asyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(font, this);
        return objLoadWithTimeoutOrNull$ui_text_release == coroutine_suspended ? coroutine_suspended : objLoadWithTimeoutOrNull$ui_text_release;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<Object> continuation) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
