package com.zykj.study.repository;

import androidx.room.RoomDatabaseKt;
import com.zykj.study.bean.dict.DictBean;
import com.zykj.study.bean.dict.PeriodBean;
import com.zykj.study.data.AppDatabase;
import com.zykj.study.data.GradeEntity;
import com.zykj.study.data.GradeEntityDao;
import com.zykj.study.data.PeriodEntity;
import com.zykj.study.data.PeriodEntityDao;
import com.zykj.study.data.SubjectEntity;
import com.zykj.study.data.SubjectEntityDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p134i7.AbstractC8811w;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p198o4.InterfaceC9520c;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.repository.DictRepository$initDict$2", m17801f = "DictRepository.kt", m17802l = {31}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DictRepository$initDict$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11391a;

    /* renamed from: b */
    public /* synthetic */ Object f11392b;

    /* renamed from: c */
    public final /* synthetic */ DictRepository f11393c;

    @InterfaceC9539d(m17800c = "com.zykj.study.repository.DictRepository$initDict$2$1", m17801f = "DictRepository.kt", m17802l = {33}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.repository.DictRepository$initDict$2$1 */
    public static final class C77441 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11394a;

        /* renamed from: b */
        public final /* synthetic */ DictRepository f11395b;

        /* renamed from: c */
        public final /* synthetic */ DictBean f11396c;

        @InterfaceC9539d(m17800c = "com.zykj.study.repository.DictRepository$initDict$2$1$1", m17801f = "DictRepository.kt", m17802l = {37}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.repository.DictRepository$initDict$2$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10570l {

            /* renamed from: a */
            public Object f11397a;

            /* renamed from: b */
            public int f11398b;

            /* renamed from: c */
            public int f11399c;

            /* renamed from: d */
            public final /* synthetic */ DictBean f11400d;

            /* renamed from: e */
            public final /* synthetic */ DictRepository f11401e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DictBean dictBean, DictRepository dictRepository, InterfaceC9324c interfaceC9324c) {
                super(1, interfaceC9324c);
                this.f11400d = dictBean;
                this.f11401e = dictRepository;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f11400d, this.f11401e, interfaceC9324c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f11399c;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    List<PeriodBean> periodList = this.f11400d.getPeriodList();
                    ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(periodList, 10));
                    for (PeriodBean periodBean : periodList) {
                        arrayList.add(new PeriodEntity(periodBean.getId(), periodBean.getName()));
                    }
                    PeriodEntityDao periodEntityDao = this.f11401e.f11387b;
                    this.f11397a = AbstractC9543h.m17814a(arrayList);
                    this.f11398b = 0;
                    this.f11399c = 1;
                    if (periodEntityDao.insert(arrayList, this) == objM17291f) {
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

            @Override // p300x7.InterfaceC10570l
            public final Object invoke(InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77441(DictRepository dictRepository, DictBean dictBean, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11395b = dictRepository;
            this.f11396c = dictBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77441(this.f11395b, this.f11396c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77441) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11394a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                AppDatabase appDatabase = this.f11395b.f11386a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11396c, this.f11395b, null);
                this.f11394a = 1;
                if (RoomDatabaseKt.withTransaction(appDatabase, anonymousClass1, this) == objM17291f) {
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
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.repository.DictRepository$initDict$2$2", m17801f = "DictRepository.kt", m17802l = {42}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.repository.DictRepository$initDict$2$2 */
    public static final class C77452 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11402a;

        /* renamed from: b */
        public final /* synthetic */ DictRepository f11403b;

        /* renamed from: c */
        public final /* synthetic */ DictBean f11404c;

        @InterfaceC9539d(m17800c = "com.zykj.study.repository.DictRepository$initDict$2$2$1", m17801f = "DictRepository.kt", m17802l = {44}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.repository.DictRepository$initDict$2$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10570l {

            /* renamed from: a */
            public Object f11405a;

            /* renamed from: b */
            public Object f11406b;

            /* renamed from: c */
            public Object f11407c;

            /* renamed from: d */
            public Object f11408d;

            /* renamed from: e */
            public Object f11409e;

            /* renamed from: f */
            public int f11410f;

            /* renamed from: g */
            public int f11411g;

            /* renamed from: h */
            public int f11412h;

            /* renamed from: i */
            public final /* synthetic */ DictBean f11413i;

            /* renamed from: j */
            public final /* synthetic */ DictRepository f11414j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DictBean dictBean, DictRepository dictRepository, InterfaceC9324c interfaceC9324c) {
                super(1, interfaceC9324c);
                this.f11413i = dictBean;
                this.f11414j = dictRepository;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f11413i, this.f11414j, interfaceC9324c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Iterator it;
                Iterable iterable;
                DictRepository dictRepository;
                int i10;
                Object objM17291f = AbstractC9434a.m17291f();
                int i11 = this.f11412h;
                if (i11 == 0) {
                    AbstractC9079b.m15926b(obj);
                    List<PeriodBean> periodList = this.f11413i.getPeriodList();
                    DictRepository dictRepository2 = this.f11414j;
                    it = periodList.iterator();
                    iterable = periodList;
                    dictRepository = dictRepository2;
                    i10 = 0;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f11410f;
                    it = (Iterator) this.f11407c;
                    dictRepository = (DictRepository) this.f11406b;
                    iterable = (Iterable) this.f11405a;
                    AbstractC9079b.m15926b(obj);
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    PeriodBean periodBean = (PeriodBean) next;
                    GradeEntityDao gradeEntityDao = dictRepository.f11388c;
                    List<GradeEntity> children = periodBean.getChildren();
                    this.f11405a = AbstractC9543h.m17814a(iterable);
                    this.f11406b = dictRepository;
                    this.f11407c = it;
                    this.f11408d = AbstractC9543h.m17814a(next);
                    this.f11409e = AbstractC9543h.m17814a(periodBean);
                    this.f11410f = i10;
                    this.f11411g = 0;
                    this.f11412h = 1;
                    if (gradeEntityDao.insert(children, this) == objM17291f) {
                        return objM17291f;
                    }
                }
                return C8736p.f16368a;
            }

            @Override // p300x7.InterfaceC10570l
            public final Object invoke(InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77452(DictRepository dictRepository, DictBean dictBean, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11403b = dictRepository;
            this.f11404c = dictBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77452(this.f11403b, this.f11404c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77452) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11402a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                AppDatabase appDatabase = this.f11403b.f11386a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11404c, this.f11403b, null);
                this.f11402a = 1;
                if (RoomDatabaseKt.withTransaction(appDatabase, anonymousClass1, this) == objM17291f) {
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
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.repository.DictRepository$initDict$2$3", m17801f = "DictRepository.kt", m17802l = {49}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.repository.DictRepository$initDict$2$3 */
    public static final class C77463 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11415a;

        /* renamed from: b */
        public final /* synthetic */ DictRepository f11416b;

        /* renamed from: c */
        public final /* synthetic */ DictBean f11417c;

        @InterfaceC9539d(m17800c = "com.zykj.study.repository.DictRepository$initDict$2$3$1", m17801f = "DictRepository.kt", m17802l = {50}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.repository.DictRepository$initDict$2$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10570l {

            /* renamed from: a */
            public int f11418a;

            /* renamed from: b */
            public final /* synthetic */ DictRepository f11419b;

            /* renamed from: c */
            public final /* synthetic */ DictBean f11420c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DictRepository dictRepository, DictBean dictBean, InterfaceC9324c interfaceC9324c) {
                super(1, interfaceC9324c);
                this.f11419b = dictRepository;
                this.f11420c = dictBean;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f11419b, this.f11420c, interfaceC9324c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f11418a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    SubjectEntityDao subjectEntityDao = this.f11419b.f11389d;
                    List<SubjectEntity> subjectList = this.f11420c.getSubjectList();
                    this.f11418a = 1;
                    if (subjectEntityDao.insert(subjectList, this) == objM17291f) {
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

            @Override // p300x7.InterfaceC10570l
            public final Object invoke(InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77463(DictRepository dictRepository, DictBean dictBean, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11416b = dictRepository;
            this.f11417c = dictBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77463(this.f11416b, this.f11417c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77463) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11415a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                AppDatabase appDatabase = this.f11416b.f11386a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11416b, this.f11417c, null);
                this.f11415a = 1;
                if (RoomDatabaseKt.withTransaction(appDatabase, anonymousClass1, this) == objM17291f) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictRepository$initDict$2(DictRepository dictRepository, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11393c = dictRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        DictRepository$initDict$2 dictRepository$initDict$2 = new DictRepository$initDict$2(this.f11393c, interfaceC9324c);
        dictRepository$initDict$2.f11392b = obj;
        return dictRepository$initDict$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((DictRepository$initDict$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f11392b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11391a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9520c interfaceC9520c = this.f11393c.f11390e;
            this.f11392b = interfaceC8822b0;
            this.f11391a = 1;
            obj = interfaceC9520c.m17711a(this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        DictBean dictBean = (DictBean) obj;
        AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C77441(this.f11393c, dictBean, null), 3, null);
        AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C77452(this.f11393c, dictBean, null), 3, null);
        return AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C77463(this.f11393c, dictBean, null), 3, null);
    }
}
