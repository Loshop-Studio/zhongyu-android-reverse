package com.zykj.study.viewmodels;

import com.zykj.study.bean.UiState;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p253t4.C10092a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$doSearch$1", m17801f = "AuthorizedLessonViewModel.kt", m17802l = {54}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AuthorizedLessonViewModel$doSearch$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13870a;

    /* renamed from: b */
    public final /* synthetic */ AuthorizedLessonViewModel f13871b;

    /* renamed from: c */
    public final /* synthetic */ String f13872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedLessonViewModel$doSearch$1(AuthorizedLessonViewModel authorizedLessonViewModel, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13871b = authorizedLessonViewModel;
        this.f13872c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new AuthorizedLessonViewModel$doSearch$1(this.f13871b, this.f13872c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((AuthorizedLessonViewModel$doSearch$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        InterfaceC9271h interfaceC9271hM11996q;
        Object value3;
        Object value4;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13870a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9271h interfaceC9271hM11996q2 = this.f13871b.m11996q();
            do {
                value = interfaceC9271hM11996q2.getValue();
                ((Boolean) value).getClass();
            } while (!interfaceC9271hM11996q2.mo16686e(value, AbstractC9536a.m17796a(true)));
            if (AbstractC8661c0.m13993h0(this.f13872c)) {
                InterfaceC9271h interfaceC9271h = this.f13871b.f13850h;
                do {
                    value2 = interfaceC9271h.getValue();
                } while (!interfaceC9271h.mo16686e(value2, new UiState.Success(AbstractC8809v.m14771n())));
                interfaceC9271hM11996q = this.f13871b.m11996q();
                do {
                    value3 = interfaceC9271hM11996q.getValue();
                    ((Boolean) value3).getClass();
                } while (!interfaceC9271hM11996q.mo16686e(value3, AbstractC9536a.m17796a(false)));
                return C8736p.f16368a;
            }
            C10092a c10092a = this.f13871b.f13843a;
            String str = this.f13872c;
            int iM11991l = this.f13871b.m11991l();
            this.f13870a = 1;
            obj = c10092a.m18848c(str, iM11991l, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        List list = (List) obj;
        InterfaceC9271h interfaceC9271h2 = this.f13871b.f13850h;
        do {
            value4 = interfaceC9271h2.getValue();
        } while (!interfaceC9271h2.mo16686e(value4, new UiState.Success(list)));
        interfaceC9271hM11996q = this.f13871b.m11996q();
        do {
            value3 = interfaceC9271hM11996q.getValue();
            ((Boolean) value3).getClass();
        } while (!interfaceC9271hM11996q.mo16686e(value3, AbstractC9536a.m17796a(false)));
        return C8736p.f16368a;
    }
}
