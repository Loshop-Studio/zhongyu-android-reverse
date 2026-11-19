package androidx.compose.foundation.text;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", m26211f = "TextLinkScope.kt", m26212l = {247}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TextLinkScope$LinksComposables$1$3$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ LinkStateInteractionSourceObserver $linkStateObserver;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$3$1(LinkStateInteractionSourceObserver linkStateInteractionSourceObserver, InterfaceC11588c<? super TextLinkScope$LinksComposables$1$3$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$linkStateObserver = linkStateInteractionSourceObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new TextLinkScope$LinksComposables$1$3$1(this.$linkStateObserver, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this.$linkStateObserver;
            this.label = 1;
            if (linkStateInteractionSourceObserver.collectInteractionsForLinks(this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TextLinkScope$LinksComposables$1$3$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
