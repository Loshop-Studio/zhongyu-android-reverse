package com.friday.paint.view.six;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.fastjson.asm.Opcodes;
import com.blankj.utilcode.util.CacheMemoryUtils;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.PathUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.friday.common.classtest.MqttRequestEntity;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.entity.AnswerCache;
import com.friday.common.entity.MqttEntity;
import com.friday.common.entity.MqttType;
import com.friday.common.entity.PayloadKey;
import com.friday.common.helper.C5962b;
import com.friday.paint.databinding.ResFragmentNewPaintBinding;
import com.friday.paint.dialog.HomeworkSubmitConfirmDialog;
import com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog;
import com.friday.paint.dialog.ReceiveClassTestDialog;
import com.friday.paint.model.NoteListEntity;
import com.friday.paint.view.six.NewStudentPaintFragment;
import com.friday.paint.viewmodel.DoHomeworkViewModel;
import com.friday.paint.viewmodel.NewNoteViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.taobao.sophix.PatchStatus;
import com.zykj.view.board.board.BoardFragment;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC10045g;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p141f2.C9166c;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9796n;
import p215k2.C9799q;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes4.dex */
public final class NewStudentPaintFragment extends Hilt_NewStudentPaintFragment {
    public static final int $stable = 8;
    private long exitTime;
    private int qstType;
    private boolean screensPermission;
    private InterfaceC10045g submitStatusJob;
    private final InterfaceC10773d viewModel$delegate;
    private final InterfaceC10773d viewModel2$delegate;

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$handleHomework$1", m26211f = "NewStudentPaintFragment.kt", m26212l = {TypedValues.AttributesType.TYPE_PATH_ROTATE, 346}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewStudentPaintFragment$handleHomework$1 */
    public static final class C63001 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f10231c;

        /* renamed from: d */
        public Object f10232d;

        /* renamed from: e */
        public int f10233e;

        /* renamed from: g */
        public final /* synthetic */ MqttResponse f10235g;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$handleHomework$1$4", m26211f = "NewStudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.six.NewStudentPaintFragment$handleHomework$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f10236c;

            /* renamed from: d */
            public final /* synthetic */ MqttResponse f10237d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(MqttResponse mqttResponse, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f10237d = mqttResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                return new AnonymousClass4(this.f10237d, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.f10236c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                String strM19799a = C9799q.f22994a.m19799a(this.f10237d.getData().getImagePath());
                if (strM19799a != null) {
                    return ImageUtils.getBitmap(strM19799a, ScreenUtils.getScreenWidth(), ScreenUtils.getScreenHeight());
                }
                return null;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass4) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63001(MqttResponse mqttResponse, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f10235g = mqttResponse;
        }

        /* renamed from: m */
        public static final C10786q m7614m(MqttResponse mqttResponse, NewStudentPaintFragment newStudentPaintFragment, Ref$ObjectRef ref$ObjectRef) {
            if (mqttResponse.getData().getQstType() != 0) {
                MqttResponse.QuestionInfo questionInfo = mqttResponse.getData().getQuestionInfo();
                if ((questionInfo != null ? Integer.valueOf(questionInfo.getQstCount()) : null) != null) {
                    MqttResponse.QuestionInfo questionInfo2 = mqttResponse.getData().getQuestionInfo();
                    if ((questionInfo2 != null ? Integer.valueOf(questionInfo2.getOptions()) : null) != null) {
                        DoHomeworkViewModel viewModel = newStudentPaintFragment.getViewModel();
                        MqttResponse.QuestionInfo questionInfo3 = mqttResponse.getData().getQuestionInfo();
                        Integer numValueOf = questionInfo3 != null ? Integer.valueOf(questionInfo3.getOptions()) : null;
                        AbstractC9979u.m20291d(numValueOf);
                        viewModel.m7641x(numValueOf.intValue());
                        DoHomeworkViewModel viewModel2 = newStudentPaintFragment.getViewModel();
                        MqttResponse.QuestionInfo questionInfo4 = mqttResponse.getData().getQuestionInfo();
                        Integer numValueOf2 = questionInfo4 != null ? Integer.valueOf(questionInfo4.getQstCount()) : null;
                        AbstractC9979u.m20291d(numValueOf2);
                        viewModel2.m7642y(numValueOf2.intValue());
                        newStudentPaintFragment.getViewModel().m7643z(mqttResponse.getData().getQstType() == 1);
                        newStudentPaintFragment.getViewModel().m7639v(false);
                        newStudentPaintFragment.getViewModel().m7627j().setValue(Boolean.valueOf(!mqttResponse.getData().getCanSubmit()));
                        newStudentPaintFragment.getViewModel().m7638u(true);
                        newStudentPaintFragment.getViewModel().m7637t(false);
                        try {
                            Fragment fragmentFindFragmentByTag = newStudentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName());
                            AbstractC9979u.m20292e(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog");
                            ((ObjectiveHomeworkSubmitDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
                        } catch (Exception unused) {
                        }
                        ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog = new ObjectiveHomeworkSubmitDialog();
                        FragmentManager childFragmentManager = newStudentPaintFragment.getChildFragmentManager();
                        AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
                        objectiveHomeworkSubmitDialog.show(childFragmentManager, ObjectiveHomeworkSubmitDialog.class.getSimpleName());
                        NewStudentPaintFragment.access$getMBinding(newStudentPaintFragment).f9841f.setVisibility(0);
                        NewStudentPaintFragment.access$getMBinding(newStudentPaintFragment).f9851p.setVisibility(8);
                    }
                }
            } else {
                NewStudentPaintFragment.access$getMBinding(newStudentPaintFragment).f9851p.setVisibility(0);
                NewStudentPaintFragment.access$getMBinding(newStudentPaintFragment).f9851p.setEnabled(true);
                NewStudentPaintFragment.access$getMBinding(newStudentPaintFragment).f9841f.setVisibility(8);
            }
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newStudentPaintFragment), null, null, new NewStudentPaintFragment$handleHomework$1$5$2(ref$ObjectRef, newStudentPaintFragment, null), 3, null);
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewStudentPaintFragment.this.new C63001(this.f10235g, interfaceC11588c);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(1:(1:(5:6|54|55|82|83)(2:7|8))(1:9))(3:10|(1:(2:12|(1:93)(1:94))(2:92|15))|(2:17|18)(3:19|(0)|52))|22|(1:26)|27|(2:29|(3:31|(2:32|(2:34|(1:91)(1:37))(2:90|38))|(1:40)(1:41)))|42|86|43|44|(5:46|(3:50|(2:53|54)|52)|55|82|83)(4:56|(3:58|(1:60)(1:61)|(3:63|(1:65)(1:66)|(10:68|(1:70)(1:71)|72|(1:74)|75|(1:77)(1:78)|79|88|80|81)))|82|83)) */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 689
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.friday.paint.view.six.NewStudentPaintFragment.C63001.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes4/com/friday/paint/view/six/NewStudentPaintFragment$handleHomework$1.smali:769
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C63001) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$initData$4", m26211f = "NewStudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewStudentPaintFragment$initData$4 */
    public static final class C63014 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10244c;

        public C63014(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewStudentPaintFragment.this.new C63014(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f10244c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            AnswerCache answerCache = (AnswerCache) CacheMemoryUtils.getInstance().get("answer_cache");
            if (answerCache != null) {
                NewStudentPaintFragment newStudentPaintFragment = NewStudentPaintFragment.this;
                if (!answerCache.isSubjective()) {
                    newStudentPaintFragment.getViewModel().m7627j().setValue(answerCache.getHasStopped());
                    newStudentPaintFragment.getViewModel().m7642y(answerCache.getQstCount());
                    newStudentPaintFragment.getViewModel().m7636s(answerCache.getDataList());
                    newStudentPaintFragment.getViewModel().m7638u(answerCache.getFromServer());
                    newStudentPaintFragment.getViewModel().m7639v(answerCache.getHasSubmit());
                    newStudentPaintFragment.getViewModel().m7643z(answerCache.isSingle());
                    newStudentPaintFragment.getViewModel().m7641x(answerCache.getOptions());
                    if (newStudentPaintFragment.getViewModel().m7628k()) {
                        NewStudentPaintFragment.access$getMBinding(newStudentPaintFragment).f9841f.setVisibility(0);
                        newStudentPaintFragment.getRightNoteListAdapter().notifyDataSetChanged();
                    }
                }
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C63014) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$initData$8", m26211f = "NewStudentPaintFragment.kt", m26212l = {Opcodes.INVOKESTATIC}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewStudentPaintFragment$initData$8 */
    public static final class C63028 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10246c;

        @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$initData$8$1", m26211f = "NewStudentPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.paint.view.six.NewStudentPaintFragment$initData$8$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f10248c;

            /* renamed from: d */
            public /* synthetic */ Object f10249d;

            /* renamed from: e */
            public final /* synthetic */ NewStudentPaintFragment f10250e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NewStudentPaintFragment newStudentPaintFragment, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f10250e = newStudentPaintFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10250e, interfaceC11588c);
                anonymousClass1.f10249d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(MqttResponse mqttResponse, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(mqttResponse, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                MqttResponse mqttResponse = (MqttResponse) this.f10249d;
                AbstractC11725a.m25952f();
                if (this.f10248c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (mqttResponse != null) {
                    this.f10250e.handleHomework(mqttResponse);
                }
                return C10786q.f26013a;
            }
        }

        public C63028(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewStudentPaintFragment.this.new C63028(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10246c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11612u interfaceC11612uM7630m = NewStudentPaintFragment.this.getViewModel().m7630m();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NewStudentPaintFragment.this, null);
                this.f10246c = 1;
                if (AbstractC11596e.m25559i(interfaceC11612uM7630m, anonymousClass1, this) == objM25952f) {
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
            return ((C63028) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$onResume$1", m26211f = "NewStudentPaintFragment.kt", m26212l = {536}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewStudentPaintFragment$onResume$1 */
    public static final class C63031 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f10251c;

        /* renamed from: d */
        public int f10252d;

        public C63031(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewStudentPaintFragment.this.new C63031(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            NewStudentPaintFragment newStudentPaintFragment;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10252d;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                NewStudentPaintFragment newStudentPaintFragment2 = NewStudentPaintFragment.this;
                NewNoteViewModel viewModel2 = newStudentPaintFragment2.getViewModel2();
                this.f10251c = newStudentPaintFragment2;
                this.f10252d = 1;
                Object objM7672N = viewModel2.m7672N(this);
                if (objM7672N == objM25952f) {
                    return objM25952f;
                }
                newStudentPaintFragment = newStudentPaintFragment2;
                obj = objM7672N;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                newStudentPaintFragment = (NewStudentPaintFragment) this.f10251c;
                AbstractC9924b.m20071b(obj);
            }
            newStudentPaintFragment.screensPermission = ((Boolean) obj).booleanValue();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C63031) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewStudentPaintFragment$startBtEnableStatusJob$1", m26211f = "NewStudentPaintFragment.kt", m26212l = {PatchStatus.CODE_LOAD_AES_DECRYPT}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.paint.view.six.NewStudentPaintFragment$startBtEnableStatusJob$1 */
    public static final class C63041 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10254c;

        public C63041(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return NewStudentPaintFragment.this.new C63041(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f10254c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                NewStudentPaintFragment.access$getMBinding(NewStudentPaintFragment.this).f9851p.setEnabled(false);
                this.f10254c = 1;
                if (DelayKt.m20376b(CoroutineLiveDataKt.DEFAULT_TIMEOUT, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            NewStudentPaintFragment.access$getMBinding(NewStudentPaintFragment.this).f9851p.setEnabled(true);
            ToastUtils.showShort("随堂测数据连接异常，暂时无法提交", new Object[0]);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C63041) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public NewStudentPaintFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.viewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(DoHomeworkViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewStudentPaintFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewStudentPaintFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewStudentPaintFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.viewModel2$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(NewNoteViewModel.class), new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewStudentPaintFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewStudentPaintFragment$special$$inlined$activityViewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.paint.view.six.NewStudentPaintFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ResFragmentNewPaintBinding access$getMBinding(NewStudentPaintFragment newStudentPaintFragment) {
        return (ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding();
    }

    private final Bitmap base64ToBitmap(String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            AbstractC9979u.m20293f(bArrDecode, "decode(...)");
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DoHomeworkViewModel getViewModel() {
        return (DoHomeworkViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NewNoteViewModel getViewModel2() {
        return (NewNoteViewModel) this.viewModel2$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleHomework(MqttResponse mqttResponse) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C63001(mqttResponse, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$1(final NewStudentPaintFragment newStudentPaintFragment, View view) {
        final HomeworkSubmitConfirmDialog homeworkSubmitConfirmDialog = new HomeworkSubmitConfirmDialog();
        homeworkSubmitConfirmDialog.m7313s(new InterfaceC9529a() { // from class: d4.a1
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return NewStudentPaintFragment.initData$lambda$1$lambda$0(this.f20894c, homeworkSubmitConfirmDialog);
            }
        });
        homeworkSubmitConfirmDialog.show(newStudentPaintFragment.getChildFragmentManager(), HomeworkSubmitConfirmDialog.class.getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q initData$lambda$1$lambda$0(NewStudentPaintFragment newStudentPaintFragment, HomeworkSubmitConfirmDialog homeworkSubmitConfirmDialog) {
        newStudentPaintFragment.submitSubjectiveHomework();
        homeworkSubmitConfirmDialog.dismissAllowingStateLoss();
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$10(final NewStudentPaintFragment newStudentPaintFragment, Object obj) {
        FragmentActivity activity = newStudentPaintFragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: d4.z0
                @Override // java.lang.Runnable
                public final void run() {
                    NewStudentPaintFragment.initData$lambda$10$lambda$9(this.f20954c);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$10$lambda$9(NewStudentPaintFragment newStudentPaintFragment) {
        int i10 = 0;
        for (Object obj : newStudentPaintFragment.getRightNoteListAdapter().getData()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            NoteListEntity noteListEntity = (NoteListEntity) obj;
            if (noteListEntity.getInClass()) {
                noteListEntity.setInClass(false);
                newStudentPaintFragment.getRightNoteListAdapter().notifyItemChanged(i10, PayloadKey.IN_CLASS);
            }
            i10 = i11;
        }
        newStudentPaintFragment.isShowLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initData$lambda$11(NewStudentPaintFragment newStudentPaintFragment, String str) {
        if (AbstractC9979u.m20289b(str, "TIME_UP")) {
            ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9851p.setVisibility(8);
            newStudentPaintFragment.getViewModel().m7627j().setValue(Boolean.TRUE);
        } else if (AbstractC9979u.m20289b(str, "END_CLASS")) {
            CacheMemoryUtils.getInstance().remove("answer_cache");
            ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9851p.setVisibility(8);
            ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9841f.setVisibility(8);
            newStudentPaintFragment.getViewModel().m7637t(true);
            try {
                Fragment fragmentFindFragmentByTag = newStudentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName());
                AbstractC9979u.m20292e(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog");
                ((ObjectiveHomeworkSubmitDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initData$lambda$12(NewStudentPaintFragment newStudentPaintFragment, String str) {
        InterfaceC10045g interfaceC10045g = newStudentPaintFragment.submitStatusJob;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1986416409:
                    if (str.equals("NORMAL")) {
                        newStudentPaintFragment.getViewModel().m7639v(true);
                        AbstractC11958b.m26588i("提交答案成功");
                        ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9851p.setEnabled(true);
                        ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9851p.setVisibility(8);
                        break;
                    }
                    break;
                case -595913395:
                    if (str.equals("TIME_UP")) {
                        ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9851p.setVisibility(8);
                        newStudentPaintFragment.getViewModel().m7627j().setValue(Boolean.TRUE);
                        AbstractC11958b.m26588i("答题已截止");
                        break;
                    }
                    break;
                case 1344628948:
                    if (str.equals("END_CLASS")) {
                        CacheMemoryUtils.getInstance().remove("answer_cache");
                        ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9851p.setVisibility(8);
                        ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9841f.setVisibility(8);
                        newStudentPaintFragment.getViewModel().m7637t(true);
                        try {
                            Fragment fragmentFindFragmentByTag = newStudentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName());
                            AbstractC9979u.m20292e(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog");
                            ((ObjectiveHomeworkSubmitDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
                        } catch (Exception unused) {
                        }
                        AbstractC11958b.m26588i("随堂测已结束");
                        break;
                    }
                    break;
                case 1382860228:
                    if (str.equals("ID_ERROR")) {
                        ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9851p.setVisibility(8);
                        AbstractC11958b.m26588i("题目不一致，请重新接收随堂测答题");
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initData$lambda$14(NewStudentPaintFragment newStudentPaintFragment, String str) {
        newStudentPaintFragment.getViewModel().m7625h().add(str);
        CacheMemoryUtils.getInstance().remove("answer_cache");
        AbstractC11958b.m26588i("随堂测已结束");
        newStudentPaintFragment.getViewModel().m7640w(null);
        newStudentPaintFragment.getViewModel().m7637t(true);
        ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9851p.setVisibility(8);
        ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9841f.setVisibility(8);
        try {
            Fragment fragmentFindFragmentByTag = newStudentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName());
            AbstractC9979u.m20292e(fragmentFindFragmentByTag, "null cannot be cast to non-null type com.friday.paint.dialog.ObjectiveHomeworkSubmitDialog");
            ((ObjectiveHomeworkSubmitDialog) fragmentFindFragmentByTag).dismissAllowingStateLoss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            Fragment fragmentFindFragmentByTag2 = newStudentPaintFragment.getChildFragmentManager().findFragmentByTag(ReceiveClassTestDialog.class.getSimpleName());
            AbstractC9979u.m20292e(fragmentFindFragmentByTag2, "null cannot be cast to non-null type com.friday.paint.dialog.ReceiveClassTestDialog");
            ((ReceiveClassTestDialog) fragmentFindFragmentByTag2).dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
        int i10 = 0;
        for (Object obj : newStudentPaintFragment.getRightNoteListAdapter().getData()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC10978w.m24145w();
            }
            ((NoteListEntity) obj).setInClass(false);
            newStudentPaintFragment.getRightNoteListAdapter().notifyItemChanged(i10, PayloadKey.IN_CLASS);
            i10 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initData$lambda$15(NewStudentPaintFragment newStudentPaintFragment, Object obj) {
        ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9851p.setVisibility(8);
        newStudentPaintFragment.getViewModel().m7627j().setValue(Boolean.TRUE);
        AbstractC11958b.m26588i("答题已截止");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$2(NewStudentPaintFragment newStudentPaintFragment, View view) {
        if (newStudentPaintFragment.getChildFragmentManager().findFragmentByTag(ObjectiveHomeworkSubmitDialog.class.getSimpleName()) != null) {
            return;
        }
        ObjectiveHomeworkSubmitDialog objectiveHomeworkSubmitDialog = new ObjectiveHomeworkSubmitDialog();
        FragmentManager childFragmentManager = newStudentPaintFragment.getChildFragmentManager();
        AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
        objectiveHomeworkSubmitDialog.show(childFragmentManager, ObjectiveHomeworkSubmitDialog.class.getSimpleName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$4(NewStudentPaintFragment newStudentPaintFragment, View view) {
        BoardFragment currentNoteFragment;
        if (newStudentPaintFragment.getCurrentNoteFragment() != null && ((currentNoteFragment = newStudentPaintFragment.getCurrentNoteFragment()) == null || currentNoteFragment.m16776D1())) {
            AbstractC11958b.m26588i("图片数量已达上限，不可继续插入");
            return;
        }
        newStudentPaintFragment.getCurrentNoteFragment();
        if (!C9166c.f21406a.m18061e()) {
            AbstractC11958b.m26588i("网络未连接");
            return;
        }
        if (!newStudentPaintFragment.screensPermission) {
            AbstractC11958b.m26588i("您的截图权限已关闭，请联系学校工作人员进行开启");
            return;
        }
        if (System.currentTimeMillis() - newStudentPaintFragment.exitTime < 3000) {
            AbstractC11958b.m26588i("截图过于频繁");
            return;
        }
        newStudentPaintFragment.exitTime = System.currentTimeMillis();
        AbstractC11958b.m26588i("正在截图");
        Observable observable = LiveEventBus.get(MqttEntity.class);
        MqttType mqttType = MqttType.NONE;
        String json = GsonUtils.toJson(new MqttRequestEntity(IMediaPlayer.MEDIA_INFO_OPEN_INPUT, null, 2, null));
        AbstractC9979u.m20293f(json, "toJson(...)");
        observable.post(new MqttEntity(mqttType, json, "board"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$5(NewStudentPaintFragment newStudentPaintFragment, String str) {
        AbstractC9979u.m20291d(str);
        newStudentPaintFragment.saveScreenShoot(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initData$lambda$6(NewStudentPaintFragment newStudentPaintFragment, Boolean bool) {
        ImageView ivScreenShoot = ((ResFragmentNewPaintBinding) newStudentPaintFragment.getMBinding()).f9850o;
        AbstractC9979u.m20293f(ivScreenShoot, "ivScreenShoot");
        AbstractC9979u.m20291d(bool);
        ivScreenShoot.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$7(NewStudentPaintFragment newStudentPaintFragment, String str) {
        AnswerCache answerCache = (AnswerCache) CacheMemoryUtils.getInstance().get("answer_cache");
        MqttResponse mqttResponse = (MqttResponse) GsonUtils.fromJson(str, MqttResponse.class);
        if (answerCache == null || !AbstractC9979u.m20289b(mqttResponse.getGuid(), answerCache.getGuid())) {
            newStudentPaintFragment.getViewModel().m7622A(mqttResponse);
        }
    }

    private final void initObserver() {
    }

    private final void saveScreenShoot(String str, boolean z10) {
        String str2;
        if (z10) {
            String str3 = PathUtils.getExternalAppCachePath() + MqttTopic.TOPIC_LEVEL_SEPARATOR + System.currentTimeMillis() + ".webp";
            ImageUtils.save(base64ToBitmap(str), str3, Bitmap.CompressFormat.WEBP, 70);
            str2 = str3;
        } else {
            str2 = str;
        }
        AbstractC9796n.a.m19788b(AbstractC9796n.f22990a, str2, null, 0, 6, null);
    }

    public static /* synthetic */ void saveScreenShoot$default(NewStudentPaintFragment newStudentPaintFragment, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        newStudentPaintFragment.saveScreenShoot(str, z10);
    }

    private final void startBtEnableStatusJob() {
        InterfaceC10045g interfaceC10045g = this.submitStatusJob;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.submitStatusJob = AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C63041(null), 3, null);
    }

    private final void submitSubjectiveHomework() {
        if (!NetworkUtils.isWifiConnected()) {
            AbstractC11958b.m26588i("网络异常，提交失败，请重试。");
            return;
        }
        isShowLoading(true);
        BoardFragment currentNoteFragment = getCurrentNoteFragment();
        if (currentNoteFragment != null) {
            NewPaintFragment.save$default(this, currentNoteFragment, false, null, new InterfaceC9540l() { // from class: d4.u0
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return NewStudentPaintFragment.submitSubjectiveHomework$lambda$16(this.f20945c, (String) obj);
                }
            }, 4, null);
        } else {
            AbstractC11958b.m26588i("获取当前页面失败");
            isShowLoading(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q submitSubjectiveHomework$lambda$16(NewStudentPaintFragment newStudentPaintFragment, String str) {
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(newStudentPaintFragment), null, null, new NewStudentPaintFragment$submitSubjectiveHomework$1$1(str, newStudentPaintFragment, null), 3, null);
        newStudentPaintFragment.startBtEnableStatusJob();
        return C10786q.f26013a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.paint.view.six.NewPaintFragment, com.friday.common.base.InterfaceC5929c
    public void initData() {
        super.initData();
        initObserver();
        ((ResFragmentNewPaintBinding) getMBinding()).f9853r.setVisibility(0);
        ClickUtils.applyGlobalDebouncing(((ResFragmentNewPaintBinding) getMBinding()).f9851p, new View.OnClickListener() { // from class: d4.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewStudentPaintFragment.initData$lambda$1(this.f20897c, view);
            }
        });
        ImageView ivScreenShoot = ((ResFragmentNewPaintBinding) getMBinding()).f9850o;
        AbstractC9979u.m20293f(ivScreenShoot, "ivScreenShoot");
        ivScreenShoot.setVisibility(getIClassManager().mo99g() ? 0 : 8);
        ClickUtils.applyGlobalDebouncing(((ResFragmentNewPaintBinding) getMBinding()).f9841f, new View.OnClickListener() { // from class: d4.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewStudentPaintFragment.initData$lambda$2(this.f20903c, view);
            }
        });
        ClickUtils.applyGlobalDebouncing(((ResFragmentNewPaintBinding) getMBinding()).f9850o, new View.OnClickListener() { // from class: d4.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewStudentPaintFragment.initData$lambda$4(this.f20905c, view);
            }
        });
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C63014(null), 3, null);
        LiveEventBus.get("LiveSnapshot", String.class).observe(this, new Observer() { // from class: d4.f1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewStudentPaintFragment.initData$lambda$5(this.f20908c, (String) obj);
            }
        });
        LiveEventBus.get("mqttServiceStatus", Boolean.TYPE).observe(getViewLifecycleOwner(), new Observer() { // from class: d4.g1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewStudentPaintFragment.initData$lambda$6(this.f20911c, (Boolean) obj);
            }
        });
        LiveEventBus.get("receiveHomework", String.class).observe(this, new Observer() { // from class: d4.h1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewStudentPaintFragment.initData$lambda$7(this.f20914c, (String) obj);
            }
        });
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new C63028(null));
        LiveEventBus.get("submitHomeworkOver").observe(this, new Observer() { // from class: d4.v0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewStudentPaintFragment.initData$lambda$10(this.f20947c, obj);
            }
        });
        LiveEventBus.get("requestHomeworkStatusReply", String.class).observe(this, new Observer() { // from class: d4.w0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewStudentPaintFragment.initData$lambda$11(this.f20949c, (String) obj);
            }
        });
        LiveEventBus.get("submitHomeworkReply", String.class).observe(this, new Observer() { // from class: d4.x0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewStudentPaintFragment.initData$lambda$12(this.f20950c, (String) obj);
            }
        });
        LiveEventBus.get("homeworkEndClass", String.class).observe(this, new Observer() { // from class: d4.y0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewStudentPaintFragment.initData$lambda$14(this.f20952c, (String) obj);
            }
        });
        LiveEventBus.get("homeworkTimeUp").observe(this, new Observer() { // from class: d4.c1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                NewStudentPaintFragment.initData$lambda$15(this.f20900c, obj);
            }
        });
        LiveEventBus.get(MqttEntity.class).post(new MqttEntity(MqttType.REQUEST_HOMEWORK_STATUS, String.valueOf(C5962b.f6082a.m5299a().m5292t()), null, 4, null));
    }

    @Override // com.friday.paint.view.six.NewPaintFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C63031(null), 3, null);
    }
}
