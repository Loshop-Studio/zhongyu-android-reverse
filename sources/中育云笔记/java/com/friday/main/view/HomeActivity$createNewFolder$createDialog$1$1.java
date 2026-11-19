package com.friday.main.view;

import com.friday.main.viewmodel.HomeViewModel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9666f;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$createNewFolder$createDialog$1$1", m26211f = "HomeActivity.kt", m26212l = {642}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeActivity$createNewFolder$createDialog$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public Object f9379c;

    /* renamed from: d */
    public Object f9380d;

    /* renamed from: e */
    public int f9381e;

    /* renamed from: f */
    public final /* synthetic */ HomeActivity f9382f;

    /* renamed from: g */
    public final /* synthetic */ String f9383g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$createNewFolder$createDialog$1$1(HomeActivity homeActivity, String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9382f = homeActivity;
        this.f9383g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeActivity$createNewFolder$createDialog$1$1(this.f9382f, this.f9383g, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        HomeViewModel homeViewModelM7142w0;
        String str;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9381e;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            homeViewModelM7142w0 = this.f9382f.m7142w0();
            String str2 = this.f9383g;
            InterfaceC9666f interfaceC9666fM7137r0 = this.f9382f.m7137r0();
            this.f9379c = homeViewModelM7142w0;
            this.f9380d = str2;
            this.f9381e = 1;
            Object objMo5868a = interfaceC9666fM7137r0.mo5868a(this);
            if (objMo5868a == objM25952f) {
                return objM25952f;
            }
            str = str2;
            obj = objMo5868a;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f9380d;
            homeViewModelM7142w0 = (HomeViewModel) this.f9379c;
            AbstractC9924b.m20071b(obj);
        }
        homeViewModelM7142w0.m7257o(str, (String) obj, this.f9382f.f9361i);
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeActivity$createNewFolder$createDialog$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
