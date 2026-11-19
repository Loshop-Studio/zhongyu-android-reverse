package com.friday.common.camera;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.PausingDispatcherKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.friday.common.R$id;
import com.friday.common.R$layout;
import com.friday.common.databinding.ActivityImageBinding;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9662b;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11607p;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class CameraActivity extends Hilt_CameraActivity<ActivityImageBinding> {

    /* renamed from: i */
    public static final C5930a f5628i = new C5930a(null);

    /* renamed from: j */
    public static final int f5629j = 8;

    /* renamed from: g */
    public InterfaceC9662b f5630g;

    /* renamed from: h */
    public final InterfaceC10773d f5631h;

    /* renamed from: com.friday.common.camera.CameraActivity$a */
    public static final class C5930a {
        public /* synthetic */ C5930a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final Intent m4811a(Context context, CameraBean cameraBean) {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(cameraBean, "cameraBean");
            Intent intent = new Intent(context, (Class<?>) CameraActivity.class);
            intent.putExtra("CAMERA_BEAN", cameraBean);
            return intent;
        }

        public C5930a() {
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.common.camera.CameraActivity$initData$3", m26211f = "CameraActivity.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.common.camera.CameraActivity$initData$3 */
    public static final class C59313 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f5636c;

        @InterfaceC11829d(m26210c = "com.friday.common.camera.CameraActivity$initData$3$1", m26211f = "CameraActivity.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_METHOD}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.common.camera.CameraActivity$initData$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f5638c;

            /* renamed from: d */
            public final /* synthetic */ CameraActivity f5639d;

            @InterfaceC11829d(m26210c = "com.friday.common.camera.CameraActivity$initData$3$1$1", m26211f = "CameraActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
            /* renamed from: com.friday.common.camera.CameraActivity$initData$3$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C121011 extends SuspendLambda implements InterfaceC9544p {

                /* renamed from: c */
                public int f5640c;

                /* renamed from: d */
                public /* synthetic */ boolean f5641d;

                /* renamed from: e */
                public final /* synthetic */ CameraActivity f5642e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C121011(CameraActivity cameraActivity, InterfaceC11588c interfaceC11588c) {
                    super(2, interfaceC11588c);
                    this.f5642e = cameraActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                    C121011 c121011 = new C121011(this.f5642e, interfaceC11588c);
                    c121011.f5641d = ((Boolean) obj).booleanValue();
                    return c121011;
                }

                @Override // p181hd.InterfaceC9544p
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    CameraBean cameraBean;
                    boolean z10 = this.f5641d;
                    AbstractC11725a.m25952f();
                    if (this.f5640c != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                    Intent intent = this.f5642e.getIntent();
                    if (intent != null && (cameraBean = (CameraBean) intent.getParcelableExtra("CAMERA_BEAN")) != null) {
                        CameraActivity cameraActivity = this.f5642e;
                        if (z10) {
                            if (cameraBean.m4816h() == 0) {
                                AbstractC11826a.m26208c(cameraActivity.getSupportFragmentManager().beginTransaction().replace(R$id.fragment_container, ImagePickFragment.f5700x.m4887a(cameraBean)).commitAllowingStateLoss());
                            } else {
                                cameraActivity.finish();
                            }
                        }
                    }
                    return C10786q.f26013a;
                }

                public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
                    return ((C121011) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CameraActivity cameraActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f5639d = cameraActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass1(this.f5639d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.f5638c;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11607p interfaceC11607pM4826d = this.f5639d.m4809P().m4826d();
                    C121011 c121011 = new C121011(this.f5639d, null);
                    this.f5638c = 1;
                    if (AbstractC11596e.m25559i(interfaceC11607pM4826d, c121011, this) == objM25952f) {
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
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        public C59313(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return CameraActivity.this.new C59313(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f5636c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Lifecycle lifecycle = CameraActivity.this.getLifecycle();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CameraActivity.this, null);
                this.f5636c = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle, anonymousClass1, this) == objM25952f) {
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
            return ((C59313) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public CameraActivity() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f5631h = new ViewModelLazy(AbstractC9983y.m20315b(CameraViewModel.class), new InterfaceC9529a() { // from class: com.friday.common.camera.CameraActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.common.camera.CameraActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new InterfaceC9529a() { // from class: com.friday.common.camera.CameraActivity$special$$inlined$viewModels$default$3
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

    /* renamed from: O */
    public final InterfaceC9662b m4808O() {
        InterfaceC9662b interfaceC9662b = this.f5630g;
        if (interfaceC9662b != null) {
            return interfaceC9662b;
        }
        AbstractC9979u.m20312y("iClassManager");
        return null;
    }

    /* renamed from: P */
    public final CameraViewModel m4809P() {
        return (CameraViewModel) this.f5631h.getValue();
    }

    /* renamed from: Q */
    public final void m4810Q(Intent intent) {
        CameraBean cameraBean;
        if (intent == null || (cameraBean = (CameraBean) intent.getParcelableExtra("CAMERA_BEAN")) == null) {
            throw new IllegalArgumentException("参数不对");
        }
        getSupportFragmentManager().beginTransaction().replace(R$id.fragment_container, cameraBean.m4816h() == 0 ? ImagePickFragment.f5700x.m4887a(cameraBean) : ImageCropFragment.f5678m.m4854a(cameraBean)).commitAllowingStateLoss();
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.activity_image;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        if (m4808O().mo99g()) {
            m4808O().mo93a(false);
        }
        m4810Q(getIntent());
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C59313(null), 3, null);
    }

    @Override // com.friday.common.camera.Hilt_CameraActivity, com.friday.common.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (m4808O().mo99g()) {
            m4808O().mo93a(true);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC9979u.m20294g(intent, "intent");
        super.onNewIntent(intent);
        m4810Q(intent);
    }
}
