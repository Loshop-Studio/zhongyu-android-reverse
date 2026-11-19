package com.friday.paint.view;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.ActivityUtils;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.paint.R$id;
import com.friday.paint.R$layout;
import com.friday.paint.databinding.NoteActivityBinding;
import com.friday.paint.view.NoteActivity;
import com.friday.paint.viewmodel.NoteViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.io.File;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9795m;
import p215k2.AbstractC9803u;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Route(path = "/paint/NoteActivity")
/* loaded from: classes4.dex */
public final class NoteActivity extends Hilt_NoteActivity<NoteActivityBinding> {

    /* renamed from: m */
    public static final C6243a f9902m = new C6243a(null);

    /* renamed from: n */
    public static final int f9903n = 8;

    /* renamed from: g */
    public final InterfaceC10773d f9904g;

    /* renamed from: h */
    public final InterfaceC10773d f9905h = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: c4.a
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return NoteActivity.m7341Q(this.f3372c);
        }
    });

    /* renamed from: i */
    public String f9906i = "";

    /* renamed from: j */
    public String f9907j = "";

    /* renamed from: k */
    public String f9908k = "";

    /* renamed from: l */
    public String f9909l = "";

    /* renamed from: com.friday.paint.view.NoteActivity$a */
    public static final class C6243a {
        public /* synthetic */ C6243a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C6243a() {
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.NoteActivity$onCreate$1", m26211f = "NoteActivity.kt", m26212l = {77}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.NoteActivity$onCreate$1 */
    public static final class C62441 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9914c;

        public C62441(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NoteActivity.this.new C62441(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9914c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                NoteActivity noteActivity = NoteActivity.this;
                String strM19814a = noteActivity.f9908k;
                if (strM19814a.length() == 0) {
                    strM19814a = AbstractC9803u.m19814a();
                    AbstractC9979u.m20293f(strM19814a, "get32UUID(...)");
                }
                noteActivity.f9908k = strM19814a;
                NoteActivity.this.m7343S().m7727R(NoteActivity.this.f9908k);
                NoteActivity.this.m7343S().m7729T(NoteActivity.this.f9909l);
                NoteActivity.this.m7343S().m7726Q(C5962b.f6082a.m5299a().m5284l() + NoteActivity.this.m7343S().m7712B() + File.separator);
                NoteActivity.this.m7343S().m7728S(NoteActivity.this.f9907j);
                NoteActivity.this.m7343S().m7730U(NoteActivity.this.f9906i);
                NoteActivity.this.isShowLoading(true);
                NoteViewModel noteViewModelM7343S = NoteActivity.this.m7343S();
                String str = NoteActivity.this.f9908k;
                this.f9914c = 1;
                obj = noteViewModelM7343S.m7718H(str, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            NoteActivity.this.m7343S().m7713C().addAll((List) obj);
            NoteActivity.this.isShowLoading(false);
            if (!NoteActivity.this.m7342R().isAdded()) {
                NoteActivity.this.getSupportFragmentManager().beginTransaction().add(R$id.paint_common_fragment, NoteActivity.this.m7342R(), "the_paint_fragment").commitAllowingStateLoss();
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62441) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public NoteActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f9904g = new ViewModelLazy(AbstractC9983y.m20315b(NoteViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.NoteActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.NoteActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.NoteActivity$special$$inlined$viewModels$default$3
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

    /* renamed from: Q */
    public static final Fragment m7341Q(NoteActivity noteActivity) {
        Fragment fragmentFindFragmentByTag = noteActivity.getSupportFragmentManager().findFragmentByTag("the_paint_fragment");
        return fragmentFindFragmentByTag == null ? new StudentPaintFragment() : fragmentFindFragmentByTag;
    }

    /* renamed from: R */
    public final Fragment m7342R() {
        return (Fragment) this.f9905h.getValue();
    }

    /* renamed from: S */
    public final NoteViewModel m7343S() {
        return (NoteViewModel) this.f9904g.getValue();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.note_activity;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (AbstractC9795m.f22988a.m19787a()) {
            return;
        }
        isShowLoading(true);
        m7343S().m7711A().setValue(Boolean.TRUE);
    }

    @Override // com.friday.paint.view.Hilt_NoteActivity, com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            C5963c.f6084a.m5308c();
            ActivityUtils.finishAllActivities();
        } else {
            ARouter.getInstance().inject(this);
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C62441(null), 3, null);
        }
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LiveEventBus.get("CanvasEnable", Boolean.TYPE).post(Boolean.TRUE);
    }

    @Override // com.friday.common.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LiveEventBus.get("CanvasEnable", Boolean.TYPE).post(Boolean.FALSE);
    }
}
