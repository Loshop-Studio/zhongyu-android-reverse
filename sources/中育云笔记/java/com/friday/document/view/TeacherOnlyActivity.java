package com.friday.document.view;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.AppUtils;
import com.friday.document.R$layout;
import com.friday.document.adapter.SyncFailedAdapter;
import com.friday.document.databinding.ActivityTeacherOnlyBinding;
import com.friday.document.view.TeacherOnlyActivity;
import com.friday.document.viewmodel.AbstractC6136d;
import com.friday.document.viewmodel.TeacherOnlyViewModel;
import gb.AbstractC9286b;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Route(path = "/document/TeacherOnlyActivity")
/* loaded from: classes3.dex */
public final class TeacherOnlyActivity extends Hilt_TeacherOnlyActivity<ActivityTeacherOnlyBinding> {

    /* renamed from: g */
    public final InterfaceC10773d f7272g;

    /* renamed from: h */
    public final InterfaceC10773d f7273h = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: u2.l0
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return TeacherOnlyActivity.m5798X();
        }
    });

    @InterfaceC11829d(m26210c = "com.friday.document.view.TeacherOnlyActivity$initData$2", m26211f = "TeacherOnlyActivity.kt", m26212l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.view.TeacherOnlyActivity$initData$2 */
    public static final class C60262 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f7278c;

        @InterfaceC11829d(m26210c = "com.friday.document.view.TeacherOnlyActivity$initData$2$1", m26211f = "TeacherOnlyActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.document.view.TeacherOnlyActivity$initData$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f7280c;

            /* renamed from: d */
            public /* synthetic */ Object f7281d;

            /* renamed from: e */
            public final /* synthetic */ TeacherOnlyActivity f7282e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TeacherOnlyActivity teacherOnlyActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f7282e = teacherOnlyActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7282e, interfaceC11588c);
                anonymousClass1.f7281d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC6136d abstractC6136d, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(abstractC6136d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC6136d abstractC6136d = (AbstractC6136d) this.f7281d;
                AbstractC11725a.m25952f();
                if (this.f7280c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (AbstractC9979u.m20289b(abstractC6136d, AbstractC6136d.a.f8440a)) {
                    Group groupRetry = TeacherOnlyActivity.m5793Q(this.f7282e).f6304d;
                    AbstractC9979u.m20293f(groupRetry, "groupRetry");
                    groupRetry.setVisibility(8);
                    ImageView ivCompleted = TeacherOnlyActivity.m5793Q(this.f7282e).f6308h;
                    AbstractC9979u.m20293f(ivCompleted, "ivCompleted");
                    ivCompleted.setVisibility(0);
                    Group groupSyncing = TeacherOnlyActivity.m5793Q(this.f7282e).f6305e;
                    AbstractC9979u.m20293f(groupSyncing, "groupSyncing");
                    groupSyncing.setVisibility(8);
                    TeacherOnlyActivity.m5793Q(this.f7282e).f6311k.setEnabled(true);
                } else if (abstractC6136d instanceof AbstractC6136d.b) {
                    Group groupRetry2 = TeacherOnlyActivity.m5793Q(this.f7282e).f6304d;
                    AbstractC9979u.m20293f(groupRetry2, "groupRetry");
                    groupRetry2.setVisibility(0);
                    ImageView ivCompleted2 = TeacherOnlyActivity.m5793Q(this.f7282e).f6308h;
                    AbstractC9979u.m20293f(ivCompleted2, "ivCompleted");
                    ivCompleted2.setVisibility(8);
                    Group groupSyncing2 = TeacherOnlyActivity.m5793Q(this.f7282e).f6305e;
                    AbstractC9979u.m20293f(groupSyncing2, "groupSyncing");
                    groupSyncing2.setVisibility(8);
                    TeacherOnlyActivity.m5793Q(this.f7282e).f6311k.setEnabled(true);
                    this.f7282e.m5799T().setList(((AbstractC6136d.b) abstractC6136d).m6492a());
                } else {
                    if (!AbstractC9979u.m20289b(abstractC6136d, AbstractC6136d.c.f8442a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Group groupRetry3 = TeacherOnlyActivity.m5793Q(this.f7282e).f6304d;
                    AbstractC9979u.m20293f(groupRetry3, "groupRetry");
                    groupRetry3.setVisibility(8);
                    ImageView ivCompleted3 = TeacherOnlyActivity.m5793Q(this.f7282e).f6308h;
                    AbstractC9979u.m20293f(ivCompleted3, "ivCompleted");
                    ivCompleted3.setVisibility(8);
                    Group groupSyncing3 = TeacherOnlyActivity.m5793Q(this.f7282e).f6305e;
                    AbstractC9979u.m20293f(groupSyncing3, "groupSyncing");
                    groupSyncing3.setVisibility(0);
                    TeacherOnlyActivity.m5793Q(this.f7282e).f6311k.setEnabled(false);
                }
                return C10786q.f26013a;
            }
        }

        public C60262(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return TeacherOnlyActivity.this.new C60262(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f7278c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11607p interfaceC11607pM6475j = TeacherOnlyActivity.this.m5800U().m6475j();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(TeacherOnlyActivity.this, null);
                this.f7278c = 1;
                if (AbstractC11596e.m25559i(interfaceC11607pM6475j, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C60262) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public TeacherOnlyActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f7272g = new ViewModelLazy(AbstractC9983y.m20315b(TeacherOnlyViewModel.class), new InterfaceC9529a() { // from class: com.friday.document.view.TeacherOnlyActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.TeacherOnlyActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.document.view.TeacherOnlyActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public static final /* synthetic */ ActivityTeacherOnlyBinding m5793Q(TeacherOnlyActivity teacherOnlyActivity) {
        return (ActivityTeacherOnlyBinding) teacherOnlyActivity.getMBinding();
    }

    /* renamed from: V */
    public static final C10786q m5796V(TeacherOnlyActivity teacherOnlyActivity, View it) {
        AbstractC9979u.m20294g(it, "it");
        teacherOnlyActivity.m5800U().m6476k();
        return C10786q.f26013a;
    }

    /* renamed from: W */
    public static final void m5797W(View view) {
        AppUtils.exitApp();
    }

    /* renamed from: X */
    public static final SyncFailedAdapter m5798X() {
        return new SyncFailedAdapter();
    }

    /* renamed from: T */
    public final SyncFailedAdapter m5799T() {
        return (SyncFailedAdapter) this.f7273h.getValue();
    }

    /* renamed from: U */
    public final TeacherOnlyViewModel m5800U() {
        return (TeacherOnlyViewModel) this.f7272g.getValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.activity_teacher_only;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        ARouter.getInstance().inject(this);
        RecyclerView recyclerView = ((ActivityTeacherOnlyBinding) getMBinding()).f6310j;
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        recyclerView.setAdapter(m5799T());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((ActivityTeacherOnlyBinding) getMBinding()).f6309i, Key.ROTATION, 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.start();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C60262(null), 3, null);
        TextView tvRetry = ((ActivityTeacherOnlyBinding) getMBinding()).f6314n;
        AbstractC9979u.m20293f(tvRetry, "tvRetry");
        AbstractC9286b.m18309e(tvRetry, new InterfaceC9540l() { // from class: u2.m0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return TeacherOnlyActivity.m5796V(this.f27167c, (View) obj);
            }
        });
        ((ActivityTeacherOnlyBinding) getMBinding()).f6311k.setOnClickListener(new View.OnClickListener() { // from class: u2.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeacherOnlyActivity.m5797W(view);
            }
        });
        m5800U().m6476k();
    }
}
