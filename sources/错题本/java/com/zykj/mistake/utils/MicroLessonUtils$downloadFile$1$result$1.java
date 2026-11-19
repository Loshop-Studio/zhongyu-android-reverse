package com.zykj.mistake.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p045d6.C5443s;
import p075h6.C5637i;
import p075h6.InterfaceC5631c;
import p129o2.C6268a;
import p152r6.InterfaceC6474f;
import p185v7.AbstractC6683l;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m5110d2 = {"<anonymous>", "", "url", "path"}, m5111k = 3, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m5302c = "com.zykj.mistake.utils.MicroLessonUtils$downloadFile$1$result$1", m5303f = "MicroLessonUtils.kt", m5304i = {0, 0}, m5305l = {131}, m5306m = "invokeSuspend", m5307n = {"url", "path"}, m5308s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class MicroLessonUtils$downloadFile$1$result$1 extends SuspendLambda implements InterfaceC6474f {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public MicroLessonUtils$downloadFile$1$result$1(InterfaceC5631c<? super MicroLessonUtils$downloadFile$1$result$1> interfaceC5631c) {
        super(3, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.L$0;
        String str2 = (String) this.L$1;
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
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        C5637i c5637i = new C5637i(AbstractC6683l.m6374n(this), CoroutineSingletons.UNDECIDED);
        AbstractC6683l.m6368h(str, str2, new C6268a(c5637i, 23));
        Object objM4961a = c5637i.m4961a();
        return objM4961a == coroutineSingletons ? coroutineSingletons : objM4961a;
    }

    @Override // p152r6.InterfaceC6474f
    public final Object invoke(String str, String str2, InterfaceC5631c<? super String> interfaceC5631c) {
        MicroLessonUtils$downloadFile$1$result$1 microLessonUtils$downloadFile$1$result$1 = new MicroLessonUtils$downloadFile$1$result$1(interfaceC5631c);
        microLessonUtils$downloadFile$1$result$1.L$0 = str;
        microLessonUtils$downloadFile$1$result$1.L$1 = str2;
        return microLessonUtils$downloadFile$1$result$1.invokeSuspend(C5443s.f8405a);
    }
}
