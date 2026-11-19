package com.friday.main.view;

import com.friday.common.entity.FromPage;
import com.friday.common.helper.C5963c;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9666f;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$createNewNote$createDialog$1$1", m26211f = "HomeActivity.kt", m26212l = {667}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeActivity$createNewNote$createDialog$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9384c;

    /* renamed from: d */
    public Object f9385d;

    /* renamed from: e */
    public int f9386e;

    /* renamed from: f */
    public final /* synthetic */ HomeActivity f9387f;

    /* renamed from: g */
    public final /* synthetic */ String f9388g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$createNewNote$createDialog$1$1(HomeActivity homeActivity, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9387f = homeActivity;
        this.f9388g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeActivity$createNewNote$createDialog$1$1(this.f9387f, this.f9388g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C5963c c5963c;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9386e;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            if (this.f9387f.m7134n0() == 0) {
                C5963c.f6084a.m5311g("", "0", this.f9388g, FromPage.FROM_NEWEST);
            } else if (this.f9387f.m7134n0() == 1) {
                C5963c c5963c2 = C5963c.f6084a;
                InterfaceC9666f interfaceC9666fM7137r0 = this.f9387f.m7137r0();
                this.f9384c = c5963c2;
                this.f9385d = "";
                this.f9386e = 1;
                Object objMo5868a = interfaceC9666fM7137r0.mo5868a(this);
                if (objMo5868a == objM25952f) {
                    return objM25952f;
                }
                str = "";
                c5963c = c5963c2;
                obj = objMo5868a;
            }
            return C10786q.f26013a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) this.f9385d;
        c5963c = (C5963c) this.f9384c;
        AbstractC9924b.m20071b(obj);
        c5963c.m5311g(str, (String) obj, this.f9388g, FromPage.FROM_FOLDER);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeActivity$createNewNote$createDialog$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
