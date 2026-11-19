package com.zykj.study.p065ui.home.study;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadStates;
import androidx.paging.PagingData;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.smtt.sdk.TbsListener;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.CourseStudyAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.CourseStudyEntity;
import com.zykj.study.databinding.FragmentStudyListBinding;
import com.zykj.study.p065ui.home.study.StudyListFragment;
import com.zykj.study.utils.BaseFragmentExtKt;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.NotifyDataChangedViewModel;
import com.zykj.study.viewmodels.StudyViewModel;
import java.util.Iterator;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class StudyListFragment extends Hilt_StudyListFragment<FragmentStudyListBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13621f;

    /* renamed from: g */
    public final InterfaceC8724d f13622g;

    /* renamed from: h */
    public final InterfaceC8724d f13623h;

    /* renamed from: i */
    public CourseStudyAdapter f13624i;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyListFragment$initData$3", m17801f = "StudyListFragment.kt", m17802l = {49}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initData$3 */
    public static final class C81153 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13649a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyListFragment$initData$3$1", m17801f = "StudyListFragment.kt", m17802l = {50}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initData$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13651a;

            /* renamed from: b */
            public /* synthetic */ Object f13652b;

            /* renamed from: c */
            public final /* synthetic */ StudyListFragment f13653c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StudyListFragment studyListFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13653c = studyListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f13653c, interfaceC9324c);
                anonymousClass1.f13652b = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(PagingData pagingData, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(pagingData, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f13652b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f13651a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    CourseStudyAdapter courseStudyAdapter = this.f13653c.f13624i;
                    if (courseStudyAdapter == null) {
                        AbstractC9133u.m16151y("courseStudyAdapter");
                        courseStudyAdapter = null;
                    }
                    this.f13652b = AbstractC9543h.m17814a(pagingData);
                    this.f13651a = 1;
                    if (courseStudyAdapter.submitData(pagingData, this) == objM17291f) {
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

        public C81153(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return StudyListFragment.this.new C81153(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81153) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13649a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM12284g = StudyListFragment.this.m11824q().m12284g();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(StudyListFragment.this, null);
                this.f13649a = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cM12284g, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyListFragment$initData$4", m17801f = "StudyListFragment.kt", m17802l = {55}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initData$4 */
    public static final class C81164 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13654a;

        public C81164(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: k */
        public static final MultipleStatusView m11830k(StudyListFragment studyListFragment) {
            return ((FragmentStudyListBinding) studyListFragment.getMBindView()).multipleStatusView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        public static final SwipeRefreshLayout m11831l(StudyListFragment studyListFragment) {
            return ((FragmentStudyListBinding) studyListFragment.getMBindView()).swipe;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return StudyListFragment.this.new C81164(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81164) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13654a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                StudyListFragment studyListFragment = StudyListFragment.this;
                CourseStudyAdapter courseStudyAdapter = studyListFragment.f13624i;
                if (courseStudyAdapter == null) {
                    AbstractC9133u.m16151y("courseStudyAdapter");
                    courseStudyAdapter = null;
                }
                final StudyListFragment studyListFragment2 = StudyListFragment.this;
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.a
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return StudyListFragment.C81164.m11830k(studyListFragment2);
                    }
                };
                final StudyListFragment studyListFragment3 = StudyListFragment.this;
                InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.b
                    @Override // p300x7.InterfaceC10559a
                    public final Object invoke() {
                        return StudyListFragment.C81164.m11831l(studyListFragment3);
                    }
                };
                this.f13654a = 1;
                if (BaseFragmentExtKt.m11866d(studyListFragment, courseStudyAdapter, interfaceC10559a, interfaceC10559a2, null, false, this, 24, null) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyListFragment$initData$5", m17801f = "StudyListFragment.kt", m17802l = {66}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initData$5 */
    public static final class C81175 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13656a;

        /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initData$5$a */
        public static final class a implements InterfaceC9267d {

            /* renamed from: a */
            public final /* synthetic */ StudyListFragment f13658a;

            public a(StudyListFragment studyListFragment) {
                this.f13658a = studyListFragment;
            }

            @Override // p169l8.InterfaceC9267d
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(CombinedLoadStates combinedLoadStates, InterfaceC9324c interfaceC9324c) {
                CourseStudyAdapter courseStudyAdapter = this.f13658a.f13624i;
                if (courseStudyAdapter == null) {
                    AbstractC9133u.m16151y("courseStudyAdapter");
                    courseStudyAdapter = null;
                }
                if (courseStudyAdapter.getItemCount() > 0) {
                    CourseStudyAdapter courseStudyAdapter2 = this.f13658a.f13624i;
                    if (courseStudyAdapter2 == null) {
                        AbstractC9133u.m16151y("courseStudyAdapter");
                        courseStudyAdapter2 = null;
                    }
                    Iterator<T> it = courseStudyAdapter2.snapshot().getItems().iterator();
                    while (it.hasNext()) {
                        if (((SelectModel) it.next()).isSelectModel()) {
                            return C8736p.f16368a;
                        }
                    }
                }
                if (this.f13658a.m11824q().m12289l().getValue() != 0) {
                    this.f13658a.m11824q().m12289l().postValue(null);
                }
                this.f13658a.m11824q().m12283f().postValue(null);
                return C8736p.f16368a;
            }
        }

        public C81175(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        /* renamed from: d */
        public static final LoadStates m11833d(CombinedLoadStates combinedLoadStates) {
            return combinedLoadStates.getSource();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return StudyListFragment.this.new C81175(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81175) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13656a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                CourseStudyAdapter courseStudyAdapter = StudyListFragment.this.f13624i;
                if (courseStudyAdapter == null) {
                    AbstractC9133u.m16151y("courseStudyAdapter");
                    courseStudyAdapter = null;
                }
                final InterfaceC9266c interfaceC9266cM17027q = AbstractC9268e.m17027q(courseStudyAdapter.getLoadStateFlow(), new InterfaceC10570l() { // from class: com.zykj.study.ui.home.study.c
                    @Override // p300x7.InterfaceC10570l
                    public final Object invoke(Object obj2) {
                        return StudyListFragment.C81175.m11833d((CombinedLoadStates) obj2);
                    }
                });
                InterfaceC9266c interfaceC9266c = new InterfaceC9266c() { // from class: com.zykj.study.ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1

                    /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C81142 implements InterfaceC9267d {

                        /* renamed from: a */
                        public final /* synthetic */ InterfaceC9267d f13626a;

                        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1$2", m17801f = "StudyListFragment.kt", m17802l = {TbsListener.ErrorCode.RENAME_EXCEPTION}, m17803m = "emit")
                        /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* renamed from: a */
                            public /* synthetic */ Object f13627a;

                            /* renamed from: b */
                            public int f13628b;

                            /* renamed from: c */
                            public Object f13629c;

                            /* renamed from: d */
                            public Object f13630d;

                            /* renamed from: f */
                            public Object f13632f;

                            /* renamed from: g */
                            public Object f13633g;

                            /* renamed from: h */
                            public int f13634h;

                            public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                                super(interfaceC9324c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.f13627a = obj;
                                this.f13628b |= Integer.MIN_VALUE;
                                return C81142.this.emit(null, this);
                            }
                        }

                        public C81142(InterfaceC9267d interfaceC9267d) {
                            this.f13626a = interfaceC9267d;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // p169l8.InterfaceC9267d
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, p179m7.InterfaceC9324c r6) throws java.lang.Throwable {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.zykj.study.p065ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1.C81142.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.zykj.study.ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.zykj.study.p065ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1.C81142.AnonymousClass1) r0
                                int r1 = r0.f13628b
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f13628b = r1
                                goto L18
                            L13:
                                com.zykj.study.ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.zykj.study.ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f13627a
                                java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                                int r2 = r0.f13628b
                                r3 = 1
                                if (r2 == 0) goto L39
                                if (r2 != r3) goto L31
                                java.lang.Object r5 = r0.f13633g
                                l8.d r5 = (p169l8.InterfaceC9267d) r5
                                java.lang.Object r5 = r0.f13630d
                                com.zykj.study.ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1$2$1 r5 = (com.zykj.study.p065ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1.C81142.AnonymousClass1) r5
                                kotlin.AbstractC9079b.m15926b(r6)
                                goto L71
                            L31:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L39:
                                kotlin.AbstractC9079b.m15926b(r6)
                                l8.d r6 = r4.f13626a
                                r2 = r5
                                androidx.paging.CombinedLoadStates r2 = (androidx.paging.CombinedLoadStates) r2
                                androidx.paging.LoadStates r2 = r2.getSource()
                                androidx.paging.LoadState r2 = r2.getRefresh()
                                boolean r2 = r2 instanceof androidx.paging.LoadState.NotLoading
                                if (r2 == 0) goto L71
                                java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r5)
                                r0.f13629c = r2
                                java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r0)
                                r0.f13630d = r2
                                java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r5)
                                r0.f13632f = r2
                                java.lang.Object r2 = p201o7.AbstractC9543h.m17814a(r6)
                                r0.f13633g = r2
                                r2 = 0
                                r0.f13634h = r2
                                r0.f13628b = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L71
                                return r1
                            L71:
                                h7.p r5 = p123h7.C8736p.f16368a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.study.StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1.C81142.emit(java.lang.Object, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/study/StudyListFragment$initData$5$invokeSuspend$$inlined$filter$1$2.smali:43
                        }
                    }

                    @Override // p169l8.InterfaceC9266c
                    public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                        Object objCollect = interfaceC9266cM17027q.collect(new C81142(interfaceC9267d), interfaceC9324c);
                        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
                    }
                };
                a aVar = new a(StudyListFragment.this);
                this.f13656a = 1;
                if (interfaceC9266c.collect(aVar, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyListFragment$initView$2", m17801f = "StudyListFragment.kt", m17802l = {84}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initView$2 */
    public static final class C81182 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13659a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyListFragment$initView$2$1", m17801f = "StudyListFragment.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13661a;

            /* renamed from: b */
            public /* synthetic */ boolean f13662b;

            /* renamed from: c */
            public final /* synthetic */ StudyListFragment f13663c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StudyListFragment studyListFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13663c = studyListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f13663c, interfaceC9324c);
                anonymousClass1.f13662b = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f13662b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f13661a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    if (z10) {
                        CourseStudyAdapter courseStudyAdapter = this.f13663c.f13624i;
                        if (courseStudyAdapter == null) {
                            AbstractC9133u.m16151y("courseStudyAdapter");
                            courseStudyAdapter = null;
                        }
                        courseStudyAdapter.refresh();
                        this.f13662b = z10;
                        this.f13661a = 1;
                        if (DelayKt.m16227b(500L, this) == objM17291f) {
                            return objM17291f;
                        }
                    }
                    return C8736p.f16368a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                this.f13663c.m11823p().m12236c(false);
                return C8736p.f16368a;
            }

            public final Object invoke(boolean z10, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        public C81182(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return StudyListFragment.this.new C81182(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81182) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13659a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9280q interfaceC9280qM12235b = StudyListFragment.this.m11823p().m12235b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(StudyListFragment.this, null);
                this.f13659a = 1;
                if (AbstractC9268e.m17019i(interfaceC9280qM12235b, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyListFragment$initView$3", m17801f = "StudyListFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.study.StudyListFragment$initView$3 */
    public static final class C81193 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13664a;

        public C81193(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return StudyListFragment.this.new C81193(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81193) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f13664a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            RecyclerView recyclerView = ((FragmentStudyListBinding) StudyListFragment.this.getMBindView()).recyclerStudy;
            StudyListFragment studyListFragment = StudyListFragment.this;
            AbstractC9133u.m16130d(recyclerView);
            studyListFragment.m11821n(recyclerView);
            CourseStudyAdapter courseStudyAdapter = studyListFragment.f13624i;
            if (courseStudyAdapter == null) {
                AbstractC9133u.m16151y("courseStudyAdapter");
                courseStudyAdapter = null;
            }
            recyclerView.setAdapter(courseStudyAdapter);
            return C8736p.f16368a;
        }
    }

    public StudyListFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f13621f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                return (interfaceC10559a2 == null || (creationExtras = (CreationExtras) interfaceC10559a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: d5.d
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return StudyListFragment.m11827t(this.f15702a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f13622g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(StudyViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.f13623h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(NotifyDataChangedViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$activityViewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a;
                return (interfaceC10559a3 == null || (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.study.StudyListFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m11821n(RecyclerView recyclerView) {
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R$drawable.divider, null);
        if (drawable != null) {
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext(), 1);
            dividerItemDecoration.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration);
        }
    }

    /* renamed from: o */
    private final DictViewModel m11822o() {
        return (DictViewModel) this.f13621f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final NotifyDataChangedViewModel m11823p() {
        return (NotifyDataChangedViewModel) this.f13623h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final StudyViewModel m11824q() {
        return (StudyViewModel) this.f13622g.getValue();
    }

    /* renamed from: r */
    public static final C8736p m11825r(StudyListFragment studyListFragment, CourseStudyEntity it) {
        AbstractC9133u.m16133g(it, "it");
        studyListFragment.m11824q().m12289l().setValue(it);
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final void m11826s(StudyListFragment studyListFragment) {
        CourseStudyAdapter courseStudyAdapter = studyListFragment.f13624i;
        if (courseStudyAdapter == null) {
            AbstractC9133u.m16151y("courseStudyAdapter");
            courseStudyAdapter = null;
        }
        courseStudyAdapter.refresh();
    }

    /* renamed from: t */
    public static final ViewModelStoreOwner m11827t(StudyListFragment studyListFragment) {
        Fragment fragmentRequireParentFragment = studyListFragment.requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(InterfaceC9324c interfaceC9324c) {
        this.f13624i = new CourseStudyAdapter(m11822o(), new InterfaceC10570l() { // from class: d5.c
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return StudyListFragment.m11825r(this.f15701a, (CourseStudyEntity) obj);
            }
        });
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C81153(null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C81164(null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C81175(null));
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C81182(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenResumed(new C81193(null));
        ((FragmentStudyListBinding) getMBindView()).swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: d5.b
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                StudyListFragment.m11826s(this.f15700a);
            }
        });
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_study_list;
    }
}
