package com.zykj.study.viewmodels;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.bean.UiState;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9271h;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p253t4.C10092a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.AuthorizedLessonViewModel$fetchAuthorizedList$1", m17801f = "AuthorizedLessonViewModel.kt", m17802l = {72, 76}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AuthorizedLessonViewModel$fetchAuthorizedList$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public long f13876a;

    /* renamed from: b */
    public long f13877b;

    /* renamed from: c */
    public Object f13878c;

    /* renamed from: d */
    public int f13879d;

    /* renamed from: e */
    public final /* synthetic */ AuthorizedLessonViewModel f13880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizedLessonViewModel$fetchAuthorizedList$1(AuthorizedLessonViewModel authorizedLessonViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13880e = authorizedLessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new AuthorizedLessonViewModel$fetchAuthorizedList$1(this.f13880e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((AuthorizedLessonViewModel$fetchAuthorizedList$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        long j10;
        List list;
        List list2;
        InterfaceC9271h interfaceC9271h;
        Object value2;
        InterfaceC9271h interfaceC9271hM11995p;
        Object value3;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13879d;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC9271h interfaceC9271hM11995p2 = this.f13880e.m11995p();
            do {
                value = interfaceC9271hM11995p2.getValue();
                ((Boolean) value).getClass();
            } while (!interfaceC9271hM11995p2.mo16686e(value, AbstractC9536a.m17796a(true)));
            C10092a c10092a = this.f13880e.f13843a;
            int iM11991l = this.f13880e.m11991l();
            this.f13876a = jCurrentTimeMillis;
            this.f13879d = 1;
            obj = c10092a.m18849d(iM11991l, this);
            if (obj != objM17291f) {
                j10 = jCurrentTimeMillis;
            }
            return objM17291f;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) this.f13878c;
            AbstractC9079b.m15926b(obj);
            list = list2;
            interfaceC9271h = this.f13880e.f13848f;
            do {
                value2 = interfaceC9271h.getValue();
            } while (!interfaceC9271h.mo16686e(value2, new UiState.Success(list)));
            interfaceC9271hM11995p = this.f13880e.m11995p();
            do {
                value3 = interfaceC9271hM11995p.getValue();
                ((Boolean) value3).getClass();
            } while (!interfaceC9271hM11995p.mo16686e(value3, AbstractC9536a.m17796a(false)));
            return C8736p.f16368a;
        }
        j10 = this.f13876a;
        AbstractC9079b.m15926b(obj);
        List list3 = (List) obj;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis2 - j10;
        if (j11 > 500) {
            list = list3;
            interfaceC9271h = this.f13880e.f13848f;
            do {
                value2 = interfaceC9271h.getValue();
            } while (!interfaceC9271h.mo16686e(value2, new UiState.Success(list)));
            interfaceC9271hM11995p = this.f13880e.m11995p();
            do {
                value3 = interfaceC9271hM11995p.getValue();
                ((Boolean) value3).getClass();
            } while (!interfaceC9271hM11995p.mo16686e(value3, AbstractC9536a.m17796a(false)));
            return C8736p.f16368a;
        }
        long j12 = TbsListener.ErrorCode.INFO_CODE_MINIQB - j11;
        this.f13878c = list3;
        this.f13876a = j10;
        this.f13877b = jCurrentTimeMillis2;
        this.f13879d = 2;
        if (DelayKt.m16227b(j12, this) != objM17291f) {
            list2 = list3;
            list = list2;
            interfaceC9271h = this.f13880e.f13848f;
            do {
                value2 = interfaceC9271h.getValue();
            } while (!interfaceC9271h.mo16686e(value2, new UiState.Success(list)));
            interfaceC9271hM11995p = this.f13880e.m11995p();
            do {
                value3 = interfaceC9271hM11995p.getValue();
                ((Boolean) value3).getClass();
            } while (!interfaceC9271hM11995p.mo16686e(value3, AbstractC9536a.m17796a(false)));
            return C8736p.f16368a;
        }
        return objM17291f;
    }
}
