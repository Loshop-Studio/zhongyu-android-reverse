package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import com.zykj.base.BaseViewModel;
import com.zykj.study.repository.ExerciseRepository;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class CourseContentViewModel extends BaseViewModel {

    /* renamed from: a */
    public final DataStore f13908a;

    /* renamed from: b */
    public final ExerciseRepository f13909b;

    public CourseContentViewModel(DataStore userDataStore, ExerciseRepository exerciseRepository) {
        AbstractC9133u.m16133g(userDataStore, "userDataStore");
        AbstractC9133u.m16133g(exerciseRepository, "exerciseRepository");
        this.f13908a = userDataStore;
        this.f13909b = exerciseRepository;
    }

    /* renamed from: a */
    public final ExerciseRepository m12032a() {
        return this.f13909b;
    }

    /* renamed from: b */
    public final Object m12033b(int i10, int i11, InterfaceC9324c interfaceC9324c) {
        return launchAsyncData(getToastLiveData(), isDialogVisible(), new CourseContentViewModel$getGroupStatistic$2(this, i10, i11, null), interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12034c(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.viewmodels.CourseContentViewModel$getUserId$1
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.viewmodels.CourseContentViewModel$getUserId$1 r0 = (com.zykj.study.viewmodels.CourseContentViewModel$getUserId$1) r0
            int r1 = r0.f13916c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13916c = r1
            goto L18
        L13:
            com.zykj.study.viewmodels.CourseContentViewModel$getUserId$1 r0 = new com.zykj.study.viewmodels.CourseContentViewModel$getUserId$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f13914a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13916c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            androidx.datastore.core.DataStore r5 = r4.f13908a
            l8.c r5 = r5.getData()
            r0.f13916c = r3
            java.lang.Object r5 = p169l8.AbstractC9268e.m17034x(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.zykj.lib.login.proto.UserBean r5 = (com.zykj.lib.login.proto.UserBean) r5
            java.lang.String r5 = r5.getId()
            java.lang.String r0 = "getId(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.CourseContentViewModel.m12034c(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/CourseContentViewModel.smali:120
    }
}
