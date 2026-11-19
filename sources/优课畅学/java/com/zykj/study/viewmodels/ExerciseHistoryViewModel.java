package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.repository.ExerciseRepository;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.flow.InterfaceC9198a;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseHistoryViewModel extends BaseExerciseViewModel {

    /* renamed from: k */
    public final ExerciseRepository f14016k;

    /* renamed from: l */
    public final DataStore f14017l;

    /* renamed from: m */
    public final MutableLiveData f14018m;

    /* renamed from: n */
    public final InterfaceC9280q f14019n;

    public ExerciseHistoryViewModel(ExerciseRepository repository, DataStore userDataStore) {
        AbstractC9133u.m16133g(repository, "repository");
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        this.f14016k = repository;
        this.f14017l = userDataStore;
        this.f14018m = new MutableLiveData();
        final InterfaceC9266c data = userDataStore.getData();
        this.f14019n = AbstractC9268e.m17006R(new InterfaceC9266c() { // from class: com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1

            /* renamed from: com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1$2 */
            public static final class C81442 implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC9267d f14021a;

                @InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1$2", m17801f = "ExerciseHistoryViewModel.kt", m17802l = {TbsListener.ErrorCode.RENAME_EXCEPTION}, m17803m = "emit")
                /* renamed from: com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f14022a;

                    /* renamed from: b */
                    public int f14023b;

                    /* renamed from: c */
                    public Object f14024c;

                    /* renamed from: e */
                    public Object f14026e;

                    /* renamed from: f */
                    public Object f14027f;

                    /* renamed from: g */
                    public Object f14028g;

                    /* renamed from: h */
                    public int f14029h;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f14022a = obj;
                        this.f14023b |= Integer.MIN_VALUE;
                        return C81442.this.emit(null, this);
                    }
                }

                public C81442(InterfaceC9267d interfaceC9267d) {
                    this.f14021a = interfaceC9267d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, p179m7.InterfaceC9324c r8) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1.C81442.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1$2$1 r0 = (com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1.C81442.AnonymousClass1) r0
                        int r1 = r0.f14023b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f14023b = r1
                        goto L18
                    L13:
                        com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1$2$1 r0 = new com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f14022a
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.f14023b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.f14028g
                        l8.d r7 = (p169l8.InterfaceC9267d) r7
                        java.lang.Object r7 = r0.f14026e
                        com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1$2$1 r7 = (com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1.C81442.AnonymousClass1) r7
                        kotlin.AbstractC9079b.m15926b(r8)
                        goto L74
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.AbstractC9079b.m15926b(r8)
                        l8.d r8 = r6.f14021a
                        r2 = r7
                        com.zykj.lib.login.proto.UserBean r2 = (com.zykj.lib.login.proto.UserBean) r2
                        com.zykj.lib.login.proto.RoleType r2 = r2.getRole()
                        com.zykj.lib.login.proto.RoleType r4 = com.zykj.lib.login.proto.RoleType.Student
                        r5 = 0
                        if (r2 != r4) goto L4c
                        r2 = r3
                        goto L4d
                    L4c:
                        r2 = r5
                    L4d:
                        java.lang.Boolean r2 = p201o7.AbstractC9536a.m17796a(r2)
                        java.lang.Object r4 = p201o7.AbstractC9543h.m17814a(r7)
                        r0.f14024c = r4
                        java.lang.Object r4 = p201o7.AbstractC9543h.m17814a(r0)
                        r0.f14026e = r4
                        java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r7)
                        r0.f14027f = r7
                        java.lang.Object r7 = p201o7.AbstractC9543h.m17814a(r8)
                        r0.f14028g = r7
                        r0.f14029h = r5
                        r0.f14023b = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L74
                        return r1
                    L74:
                        h7.p r7 = p123h7.C8736p.f16368a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.ExerciseHistoryViewModel$special$$inlined$map$1.C81442.emit(java.lang.Object, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/ExerciseHistoryViewModel$special$$inlined$map$1$2.smali:43
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = data.collect(new C81442(interfaceC9267d), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }, ViewModelKt.getViewModelScope(this), InterfaceC9198a.a.m16691b(InterfaceC9198a.f17984a, CoroutineLiveDataKt.DEFAULT_TIMEOUT, 0L, 2, null), Boolean.FALSE);
    }

    @Override // com.zykj.study.viewmodels.BaseExerciseViewModel
    /* renamed from: p */
    public void mo12018p() {
    }

    @Override // com.zykj.study.viewmodels.BaseExerciseViewModel
    /* renamed from: q */
    public void mo12019q() {
    }

    /* renamed from: r */
    public final MutableLiveData m12099r() {
        return this.f14018m;
    }

    /* renamed from: s */
    public final ExerciseRepository m12100s() {
        return this.f14016k;
    }

    /* renamed from: t */
    public final void m12101t(int i10) {
        List list = (List) m12010h().getValue();
        QuestionBean questionBean = list != null ? (QuestionBean) list.get(i10) : null;
        if (questionBean != null) {
            m12007e().setValue(Integer.valueOf(i10));
            m12008f().setValue(questionBean);
        } else {
            m12007e().setValue(0);
            MutableLiveData mutableLiveDataM12008f = m12008f();
            List list2 = (List) m12010h().getValue();
            mutableLiveDataM12008f.setValue(list2 != null ? (QuestionBean) AbstractC8778f0.m14568n0(list2) : null);
        }
    }

    /* renamed from: u */
    public final InterfaceC9280q m12102u() {
        return this.f14019n;
    }

    /* renamed from: v */
    public final Object m12103v(int i10, int i11, int i12, InterfaceC9324c interfaceC9324c) {
        launchData(getToastLiveData(), isDialogVisible(), new ExerciseHistoryViewModel$loadDetails$2(this, i10, i11, i12, null));
        return C8736p.f16368a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12104w(int r9, java.lang.String r10, p179m7.InterfaceC9324c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.zykj.study.viewmodels.ExerciseHistoryViewModel$microList$1
            if (r0 == 0) goto L14
            r0 = r11
            com.zykj.study.viewmodels.ExerciseHistoryViewModel$microList$1 r0 = (com.zykj.study.viewmodels.ExerciseHistoryViewModel$microList$1) r0
            int r1 = r0.f14039e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14039e = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.zykj.study.viewmodels.ExerciseHistoryViewModel$microList$1 r0 = new com.zykj.study.viewmodels.ExerciseHistoryViewModel$microList$1
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.f14037c
            java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
            int r1 = r5.f14039e
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r9 = r5.f14036b
            java.lang.String r9 = (java.lang.String) r9
            kotlin.AbstractC9079b.m15926b(r11)
            goto L56
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.AbstractC9079b.m15926b(r11)
            com.zykj.study.viewmodels.ExerciseHistoryViewModel$microList$2 r4 = new com.zykj.study.viewmodels.ExerciseHistoryViewModel$microList$2
            r11 = 0
            r4.<init>(r8, r9, r10, r11)
            java.lang.Object r10 = p201o7.AbstractC9543h.m17814a(r10)
            r5.f14036b = r10
            r5.f14035a = r9
            r5.f14039e = r2
            r2 = 0
            r3 = 0
            r6 = 3
            r7 = 0
            r1 = r8
            java.lang.Object r11 = com.zykj.base.BaseViewModel.launchAsyncData$default(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L56
            return r0
        L56:
            java.util.List r11 = (java.util.List) r11
            if (r11 != 0) goto L5f
            java.util.List r9 = p134i7.AbstractC8809v.m14771n()
            return r9
        L5f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.ExerciseHistoryViewModel.m12104w(int, java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/ExerciseHistoryViewModel.smali:426
    }
}
