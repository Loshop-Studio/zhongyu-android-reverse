package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.paging.PagingData;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel$courseStudyList$1$2", m17801f = "StudyViewModel.kt", m17802l = {82}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudyViewModel$courseStudyList$1$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14453a;

    /* renamed from: b */
    public /* synthetic */ Object f14454b;

    public StudyViewModel$courseStudyList$1$2(InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        StudyViewModel$courseStudyList$1$2 studyViewModel$courseStudyList$1$2 = new StudyViewModel$courseStudyList$1$2(interfaceC9324c);
        studyViewModel$courseStudyList$1$2.f14454b = obj;
        return studyViewModel$courseStudyList$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.f14454b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14453a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            PagingData pagingDataEmpty = PagingData.Companion.empty();
            this.f14454b = AbstractC9543h.m17814a(interfaceC9267d);
            this.f14453a = 1;
            if (interfaceC9267d.emit(pagingDataEmpty, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
        return ((StudyViewModel$courseStudyList$1$2) create(interfaceC9267d, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
