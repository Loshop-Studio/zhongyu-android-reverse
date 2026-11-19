package com.zykj.study.viewmodels;

import androidx.lifecycle.MutableLiveData;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.bean.teach.GroupMember;
import com.zykj.study.repository.TeachCourseRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8811w;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudentViewContentViewModel$initMemberProgress$1", m17801f = "StudentViewContentViewModel.kt", m17802l = {30}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudentViewContentViewModel$initMemberProgress$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14388a;

    /* renamed from: b */
    public final /* synthetic */ StudentViewContentViewModel f14389b;

    /* renamed from: c */
    public final /* synthetic */ int f14390c;

    /* renamed from: d */
    public final /* synthetic */ String f14391d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentViewContentViewModel$initMemberProgress$1(StudentViewContentViewModel studentViewContentViewModel, int i10, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14389b = studentViewContentViewModel;
        this.f14390c = i10;
        this.f14391d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentViewContentViewModel$initMemberProgress$1(this.f14389b, this.f14390c, this.f14391d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentViewContentViewModel$initMemberProgress$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14388a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            TeachCourseRepository teachCourseRepositoryM12262b = this.f14389b.m12262b();
            int i11 = this.f14390c;
            String str = this.f14391d;
            this.f14388a = 1;
            obj = teachCourseRepositoryM12262b.m10411h(i11, str, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        MutableLiveData mutableLiveDataM12261a = this.f14389b.m12261a();
        List<CatalogBean> catalogs = ((GroupMember) obj).getCatalogs();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(catalogs, 10));
        Iterator<T> it = catalogs.iterator();
        while (it.hasNext()) {
            arrayList.add(new SelectModel(false, (CatalogBean) it.next()));
        }
        mutableLiveDataM12261a.postValue(arrayList);
        return C8736p.f16368a;
    }
}
