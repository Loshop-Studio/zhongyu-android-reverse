package androidx.compose.p011ui.text.font;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m5110d2 = {"<anonymous>", ""}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", m5303f = "FontListFontFamilyTypefaceAdapter.kt", m5304i = {}, m5305l = {282}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements InterfaceC6471c {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, InterfaceC5631c<? super AsyncFontListLoader$load$2$typeface$1> interfaceC5631c) {
        super(1, interfaceC5631c);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(InterfaceC5631c<?> interfaceC5631c) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, interfaceC5631c);
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(InterfaceC5631c<Object> interfaceC5631c) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return obj;
        }
        AbstractC5774b.m5119b(obj);
        AsyncFontListLoader asyncFontListLoader = this.this$0;
        Font font = this.$font;
        this.label = 1;
        Object objLoadWithTimeoutOrNull$ui_text_release = asyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(font, this);
        return objLoadWithTimeoutOrNull$ui_text_release == coroutineSingletons ? coroutineSingletons : objLoadWithTimeoutOrNull$ui_text_release;
    }
}
