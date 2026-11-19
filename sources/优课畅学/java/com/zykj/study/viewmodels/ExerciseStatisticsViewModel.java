package com.zykj.study.viewmodels;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.base.BaseViewModel;
import com.zykj.study.bean.teach.ChoiceChartData;
import com.zykj.study.bean.teach.GetQuizDetailBean;
import com.zykj.study.bean.teach.Member;
import com.zykj.study.bean.teach.StuQuizBean;
import com.zykj.study.repository.TeachCourseRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.flow.InterfaceC9198a;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ExerciseStatisticsViewModel extends BaseViewModel {

    /* renamed from: a */
    public final TeachCourseRepository f14044a;

    /* renamed from: b */
    public final MutableLiveData f14045b;

    /* renamed from: c */
    public final MutableLiveData f14046c;

    /* renamed from: d */
    public final MutableLiveData f14047d;

    /* renamed from: e */
    public final List f14048e;

    /* renamed from: f */
    public final MutableLiveData f14049f;

    /* renamed from: g */
    public int f14050g;

    /* renamed from: h */
    public int f14051h;

    /* renamed from: i */
    public int f14052i;

    /* renamed from: j */
    public Member f14053j;

    /* renamed from: k */
    public final InterfaceC9271h f14054k;

    /* renamed from: l */
    public final InterfaceC9280q f14055l;

    /* renamed from: m */
    public final InterfaceC9271h f14056m;

    /* renamed from: n */
    public final InterfaceC9280q f14057n;

    /* renamed from: o */
    public final InterfaceC9271h f14058o;

    /* renamed from: p */
    public final InterfaceC9280q f14059p;

    /* renamed from: q */
    public final InterfaceC9280q f14060q;

    /* renamed from: r */
    public final InterfaceC9280q f14061r;

    /* renamed from: s */
    public final InterfaceC9271h f14062s;

    /* renamed from: t */
    public final InterfaceC9280q f14063t;

    /* renamed from: u */
    public final InterfaceC9280q f14064u;

    public ExerciseStatisticsViewModel(TeachCourseRepository repository) {
        AbstractC9133u.m16133g(repository, "repository");
        this.f14044a = repository;
        this.f14045b = new MutableLiveData(Boolean.FALSE);
        this.f14046c = new MutableLiveData();
        this.f14047d = new MutableLiveData();
        this.f14048e = new ArrayList();
        this.f14049f = new MutableLiveData();
        this.f14053j = new Member("0", "0", 0);
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(AbstractC8809v.m14771n());
        this.f14054k = interfaceC9271hM17054a;
        final InterfaceC9280q interfaceC9280qM17012b = AbstractC9268e.m17012b(interfaceC9271hM17054a);
        this.f14055l = interfaceC9280qM17012b;
        InterfaceC9271h interfaceC9271hM17054a2 = AbstractC9281r.m17054a(0);
        this.f14056m = interfaceC9271hM17054a2;
        InterfaceC9280q interfaceC9280qM17012b2 = AbstractC9268e.m17012b(interfaceC9271hM17054a2);
        this.f14057n = interfaceC9280qM17012b2;
        InterfaceC9271h interfaceC9271hM17054a3 = AbstractC9281r.m17054a(0);
        this.f14058o = interfaceC9271hM17054a3;
        this.f14059p = AbstractC9268e.m17012b(interfaceC9271hM17054a3);
        InterfaceC9266c interfaceC9266c = new InterfaceC9266c() { // from class: com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1

            /* renamed from: com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1$2 */
            public static final class C81452 implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC9267d f14066a;

                @InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1$2", m17801f = "ExerciseStatisticsViewModel.kt", m17802l = {TbsListener.ErrorCode.RENAME_EXCEPTION}, m17803m = "emit")
                /* renamed from: com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f14067a;

                    /* renamed from: b */
                    public int f14068b;

                    /* renamed from: c */
                    public Object f14069c;

                    /* renamed from: e */
                    public Object f14071e;

                    /* renamed from: f */
                    public Object f14072f;

                    /* renamed from: g */
                    public Object f14073g;

                    /* renamed from: h */
                    public int f14074h;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f14067a = obj;
                        this.f14068b |= Integer.MIN_VALUE;
                        return C81452.this.emit(null, this);
                    }
                }

                public C81452(InterfaceC9267d interfaceC9267d) {
                    this.f14066a = interfaceC9267d;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, p179m7.InterfaceC9324c r11) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1.C81452.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1$2$1 r0 = (com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1.C81452.AnonymousClass1) r0
                        int r1 = r0.f14068b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f14068b = r1
                        goto L18
                    L13:
                        com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1$2$1 r0 = new com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.f14067a
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.f14068b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r10 = r0.f14073g
                        l8.d r10 = (p169l8.InterfaceC9267d) r10
                        java.lang.Object r10 = r0.f14071e
                        com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1$2$1 r10 = (com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1.C81452.AnonymousClass1) r10
                        kotlin.AbstractC9079b.m15926b(r11)
                        goto L88
                    L31:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L39:
                        kotlin.AbstractC9079b.m15926b(r11)
                        l8.d r11 = r9.f14066a
                        r2 = r10
                        java.util.List r2 = (java.util.List) r2
                        java.util.Iterator r2 = r2.iterator()
                    L45:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L63
                        java.lang.Object r4 = r2.next()
                        r5 = r4
                        com.zykj.study.bean.teach.GetQuizDetailBean r5 = (com.zykj.study.bean.teach.GetQuizDetailBean) r5
                        boolean r6 = r5.isSelected()
                        if (r6 == 0) goto L45
                        long r5 = r5.getId()
                        r7 = 0
                        int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                        if (r5 == 0) goto L45
                        goto L64
                    L63:
                        r4 = 0
                    L64:
                        java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r10)
                        r0.f14069c = r2
                        java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r0)
                        r0.f14071e = r2
                        java.lang.Object r10 = p201o7.AbstractC9543h.m17814a(r10)
                        r0.f14072f = r10
                        java.lang.Object r10 = p201o7.AbstractC9543h.m17814a(r11)
                        r0.f14073g = r10
                        r10 = 0
                        r0.f14074h = r10
                        r0.f14068b = r3
                        java.lang.Object r10 = r11.emit(r4, r0)
                        if (r10 != r1) goto L88
                        return r1
                    L88:
                        h7.p r10 = p123h7.C8736p.f16368a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.viewmodels.ExerciseStatisticsViewModel$special$$inlined$map$1.C81452.emit(java.lang.Object, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/viewmodels/ExerciseStatisticsViewModel$special$$inlined$map$1$2.smali:43
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = interfaceC9280qM17012b.collect(new C81452(interfaceC9267d), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        };
        InterfaceC8822b0 viewModelScope = ViewModelKt.getViewModelScope(this);
        InterfaceC9198a.a aVar = InterfaceC9198a.f17984a;
        InterfaceC9280q interfaceC9280qM17006R = AbstractC9268e.m17006R(interfaceC9266c, viewModelScope, aVar.m16693c(), null);
        this.f14060q = interfaceC9280qM17006R;
        InterfaceC9280q interfaceC9280qM17006R2 = AbstractC9268e.m17006R(AbstractC9268e.m17021k(interfaceC9280qM17006R, interfaceC9280qM17012b2, new ExerciseStatisticsViewModel$singleDetailFlow$1(null)), ViewModelKt.getViewModelScope(this), aVar.m16693c(), null);
        this.f14061r = interfaceC9280qM17006R2;
        InterfaceC9271h interfaceC9271hM17054a4 = AbstractC9281r.m17054a(null);
        this.f14062s = interfaceC9271hM17054a4;
        this.f14063t = AbstractC9268e.m17012b(interfaceC9271hM17054a4);
        this.f14064u = AbstractC9268e.m17006R(AbstractC9268e.m17020j(interfaceC9280qM17006R, interfaceC9280qM17006R2, interfaceC9271hM17054a4, new ExerciseStatisticsViewModel$chartDataFlow$1(null)), ViewModelKt.getViewModelScope(this), aVar.m16693c(), AbstractC8809v.m14771n());
    }

    /* renamed from: f */
    private final void m12106f(ChoiceChartData choiceChartData) {
        this.f14062s.setValue(choiceChartData);
    }

    /* renamed from: A */
    public final void m12107A(int i10) {
        this.f14050g = i10;
    }

    /* renamed from: B */
    public final void m12108B(Member member) {
        AbstractC9133u.m16133g(member, "<set-?>");
        this.f14053j = member;
    }

    /* renamed from: C */
    public final void m12109C(int i10) {
        this.f14051h = i10;
    }

    /* renamed from: D */
    public final void m12110D(int i10) {
        this.f14052i = i10;
    }

    /* renamed from: b */
    public final void m12111b(ChoiceChartData clickedItem) {
        AbstractC9133u.m16133g(clickedItem, "clickedItem");
        ChoiceChartData choiceChartData = (ChoiceChartData) this.f14062s.getValue();
        if (AbstractC9133u.m16128b(choiceChartData != null ? choiceChartData.getName() : null, clickedItem.getName())) {
            m12106f(null);
        } else {
            m12106f(clickedItem);
        }
    }

    /* renamed from: c */
    public final void m12112c(int i10) {
        this.f14056m.setValue(Integer.valueOf(i10));
        m12106f(null);
    }

    /* renamed from: d */
    public final void m12113d(int i10) {
        this.f14058o.setValue(Integer.valueOf(i10));
    }

    /* renamed from: e */
    public final void m12114e(int i10, GetQuizDetailBean entity) {
        AbstractC9133u.m16133g(entity, "entity");
        m12113d(i10);
        m12106f(null);
        List<GetQuizDetailBean> listM14547X0 = AbstractC8778f0.m14547X0((Collection) this.f14054k.getValue());
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM14547X0, 10));
        for (GetQuizDetailBean getQuizDetailBean : listM14547X0) {
            arrayList.add(getQuizDetailBean.getId() == entity.getId() ? GetQuizDetailBean.copy$default(getQuizDetailBean, 0L, 0L, 0, true, null, null, null, 119, null) : GetQuizDetailBean.copy$default(getQuizDetailBean, 0L, 0L, 0, false, null, null, null, 119, null));
        }
        this.f14054k.setValue(arrayList);
    }

    /* renamed from: g */
    public final int m12115g() {
        return this.f14050g;
    }

    /* renamed from: h */
    public final InterfaceC9280q m12116h() {
        return this.f14064u;
    }

    /* renamed from: i */
    public final InterfaceC9280q m12117i() {
        return this.f14059p;
    }

    /* renamed from: j */
    public final MutableLiveData m12118j() {
        return this.f14049f;
    }

    /* renamed from: k */
    public final Member m12119k() {
        return this.f14053j;
    }

    /* renamed from: l */
    public final MutableLiveData m12120l() {
        return this.f14046c;
    }

    /* renamed from: m */
    public final InterfaceC9280q m12121m() {
        return this.f14055l;
    }

    /* renamed from: n */
    public final List m12122n(boolean z10) {
        StuQuizBean stuQuizBean = (StuQuizBean) this.f14061r.getValue();
        if (stuQuizBean != null) {
            List<String> completeList = z10 ? stuQuizBean.getCompleteList() : stuQuizBean.getUnCompleteList();
            if (completeList != null) {
                return completeList;
            }
        }
        return AbstractC8809v.m14771n();
    }

    /* renamed from: o */
    public final int m12123o() {
        return this.f14051h;
    }

    /* renamed from: p */
    public final MutableLiveData m12124p() {
        return this.f14047d;
    }

    /* renamed from: q */
    public final TeachCourseRepository m12125q() {
        return this.f14044a;
    }

    /* renamed from: r */
    public final InterfaceC9280q m12126r() {
        return this.f14063t;
    }

    /* renamed from: s */
    public final InterfaceC9280q m12127s() {
        return this.f14061r;
    }

    /* renamed from: t */
    public final List m12128t() {
        return this.f14048e;
    }

    /* renamed from: u */
    public final int m12129u() {
        return this.f14052i;
    }

    /* renamed from: v */
    public final void m12130v(int i10, int i11) {
        launch(getToastLiveData(), isDialogVisible(), new ExerciseStatisticsViewModel$getTitleList$1(this, i10, i11, null));
    }

    /* renamed from: w */
    public final void m12131w(Member member) {
        AbstractC9133u.m16133g(member, "member");
        launchData(getToastLiveData(), isDialogVisible(), new ExerciseStatisticsViewModel$getUserQuizStatistic$1(this, member, null));
    }

    /* renamed from: x */
    public final MutableLiveData m12132x() {
        return this.f14045b;
    }

    /* renamed from: y */
    public final void m12133y(int i10, int i11) {
        launchData(getToastLiveData(), isDialogVisible(), new ExerciseStatisticsViewModel$loadDetails$1(this, i10, i11, null));
    }

    /* renamed from: z */
    public final void m12134z() {
        if (((Number) this.f14058o.getValue()).intValue() != 0) {
            this.f14058o.setValue(0);
        }
    }
}
