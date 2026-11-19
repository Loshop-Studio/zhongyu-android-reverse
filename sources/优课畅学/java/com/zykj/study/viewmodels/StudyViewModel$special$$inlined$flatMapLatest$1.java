package com.zykj.study.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.data.CourseStudyEntity;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10575q;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel$special$$inlined$flatMapLatest$1", m17801f = "StudyViewModel.kt", m17802l = {189}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudyViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements InterfaceC10575q {

    /* renamed from: a */
    public int f14441a;

    /* renamed from: b */
    public /* synthetic */ Object f14442b;

    /* renamed from: c */
    public /* synthetic */ Object f14443c;

    /* renamed from: d */
    public final /* synthetic */ StudyViewModel f14444d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyViewModel$special$$inlined$flatMapLatest$1(InterfaceC9324c interfaceC9324c, StudyViewModel studyViewModel) {
        super(3, interfaceC9324c);
        this.f14444d = studyViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14441a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9267d interfaceC9267d = (InterfaceC9267d) this.f14442b;
            Object obj2 = this.f14443c;
            final CourseStudyEntity courseStudyEntity = (CourseStudyEntity) obj2;
            final InterfaceC9266c interfaceC9266cM12286i = this.f14444d.m12286i();
            InterfaceC9266c interfaceC9266cM16990B = interfaceC9266cM12286i != null ? new InterfaceC9266c() { // from class: com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1

                /* renamed from: com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2 */
                public static final class C81502 implements InterfaceC9267d {

                    /* renamed from: a */
                    public final /* synthetic */ InterfaceC9267d f14431a;

                    /* renamed from: b */
                    public final /* synthetic */ CourseStudyEntity f14432b;

                    @InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2", m17801f = "StudyViewModel.kt", m17802l = {TbsListener.ErrorCode.RENAME_EXCEPTION}, m17803m = "emit")
                    /* renamed from: com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* renamed from: a */
                        public /* synthetic */ Object f14433a;

                        /* renamed from: b */
                        public int f14434b;

                        /* renamed from: c */
                        public Object f14435c;

                        /* renamed from: e */
                        public Object f14437e;

                        /* renamed from: f */
                        public Object f14438f;

                        /* renamed from: g */
                        public Object f14439g;

                        /* renamed from: h */
                        public int f14440h;

                        public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                            super(interfaceC9324c);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f14433a = obj;
                            this.f14434b |= Integer.MIN_VALUE;
                            return C81502.this.emit(null, this);
                        }
                    }

                    public C81502(InterfaceC9267d interfaceC9267d, CourseStudyEntity courseStudyEntity) {
                        this.f14431a = interfaceC9267d;
                        this.f14432b = courseStudyEntity;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // p169l8.InterfaceC9267d
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r8, p179m7.InterfaceC9324c r9) throws java.lang.Throwable {
                        /*
                            r7 = this;
                            boolean r0 = r9 instanceof com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1.C81502.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r9
                            com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2$1 r0 = (com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1.C81502.AnonymousClass1) r0
                            int r1 = r0.f14434b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f14434b = r1
                            goto L18
                        L13:
                            com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2$1 r0 = new com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2$1
                            r0.<init>(r9)
                        L18:
                            java.lang.Object r9 = r0.f14433a
                            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                            int r2 = r0.f14434b
                            r3 = 1
                            if (r2 == 0) goto L39
                            if (r2 != r3) goto L31
                            java.lang.Object r8 = r0.f14439g
                            l8.d r8 = (p169l8.InterfaceC9267d) r8
                            java.lang.Object r8 = r0.f14437e
                            com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2$1 r8 = (com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1.C81502.AnonymousClass1) r8
                            kotlin.AbstractC9079b.m15926b(r9)
                            goto L71
                        L31:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r9)
                            throw r8
                        L39:
                            kotlin.AbstractC9079b.m15926b(r9)
                            l8.d r9 = r7.f14431a
                            r2 = r8
                            androidx.paging.PagingData r2 = (androidx.paging.PagingData) r2
                            com.zykj.study.viewmodels.StudyViewModel$courseStudyList$1$1$1$1 r4 = new com.zykj.study.viewmodels.StudyViewModel$courseStudyList$1$1$1$1
                            com.zykj.study.data.CourseStudyEntity r5 = r7.f14432b
                            r6 = 0
                            r4.<init>(r5, r6)
                            androidx.paging.PagingData r2 = androidx.paging.PagingDataTransforms.map(r2, r4)
                            java.lang.Object r4 = p201o7.AbstractC9543h.m17814a(r8)
                            r0.f14435c = r4
                            java.lang.Object r4 = p201o7.AbstractC9543h.m17814a(r0)
                            r0.f14437e = r4
                            java.lang.Object r8 = p201o7.AbstractC9543h.m17814a(r8)
                            r0.f14438f = r8
                            java.lang.Object r8 = p201o7.AbstractC9543h.m17814a(r9)
                            r0.f14439g = r8
                            r8 = 0
                            r0.f14440h = r8
                            r0.f14434b = r3
                            java.lang.Object r8 = r9.emit(r2, r0)
                            if (r8 != r1) goto L71
                            return r1
                        L71:
                            h7.p r8 = p123h7.C8736p.f16368a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1.C81502.emit(java.lang.Object, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/StudyViewModel$courseStudyList$lambda$2$lambda$1$$inlined$map$1$2.smali:49
                    }
                }

                @Override // p169l8.InterfaceC9266c
                public Object collect(InterfaceC9267d interfaceC9267d2, InterfaceC9324c interfaceC9324c) {
                    Object objCollect = interfaceC9266cM12286i.collect(new C81502(interfaceC9267d2, courseStudyEntity), interfaceC9324c);
                    return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
                }
            } : AbstractC9268e.m16990B(new StudyViewModel$courseStudyList$1$2(null));
            this.f14442b = AbstractC9543h.m17814a(interfaceC9267d);
            this.f14443c = AbstractC9543h.m17814a(obj2);
            this.f14441a = 1;
            if (AbstractC9268e.m17031u(interfaceC9267d, interfaceC9266cM16990B, this) == objM17291f) {
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

    @Override // p300x7.InterfaceC10575q
    public final Object invoke(InterfaceC9267d interfaceC9267d, Object obj, InterfaceC9324c interfaceC9324c) {
        StudyViewModel$special$$inlined$flatMapLatest$1 studyViewModel$special$$inlined$flatMapLatest$1 = new StudyViewModel$special$$inlined$flatMapLatest$1(interfaceC9324c, this.f14444d);
        studyViewModel$special$$inlined$flatMapLatest$1.f14442b = interfaceC9267d;
        studyViewModel$special$$inlined$flatMapLatest$1.f14443c = obj;
        return studyViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(C8736p.f16368a);
    }
}
