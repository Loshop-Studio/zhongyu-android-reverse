package com.zykj.student.dialogue.p076ui.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.PathUtils;
import com.liulishuo.okdownload.C6593a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.xuexiang.xui.widget.imageview.photoview.PhotoView;
import com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6849c;
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBinding;
import com.zykj.student.dialogue.p076ui.detail.AnswerPagerFragment;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7539b;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7540c;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AnswerViewModel;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel;
import com.zykj.view.board.play.SketchPlayFragment;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p161io.FilesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import p097e7.C7853a;
import p138i6.AbstractC8136b;
import p209p1.C9317f;
import p214p6.C9336k;
import p229r1.C9417a;
import p229r1.C9419c;
import p299y1.AbstractC9944b;
import p309z1.C9988b;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J%\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J+\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010CR\u001b\u0010H\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "", ExifInterface.LATITUDE_SOUTH, "()Z", "Lp6/k;", "viewState", "C", "(Lp6/k;)Z", "", "L", "", "H", "()I", "", "I", "()D", "U", "", "Lcom/liulishuo/okdownload/a;", "downloadTasks", "showLoading", ExifInterface.LONGITUDE_EAST, "(Ljava/util/List;Z)V", "succeed", ExifInterface.GPS_DIRECTION_TRUE, "(Z)V", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "path", "M", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;", "f", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerPagerBinding;", "binding", "Lcom/zykj/view/board/play/SketchPlayFragment;", "g", "Lcom/zykj/view/board/play/SketchPlayFragment;", "sketchPlayFragment", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "h", "Lkotlin/Lazy;", "K", "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "viewModel", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;", "i", "G", "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;", "newAnswerViewModel", "j", "J", "()Ljava/lang/String;", "tempPreviewImagePath", "Lkotlinx/coroutines/Job;", "k", "Lkotlinx/coroutines/Job;", "job", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnswerPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,579:1\n49#2,8:580\n106#3,15:588\n278#4,2:603\n257#4,2:607\n257#4,2:609\n257#4,2:611\n257#4,2:613\n255#4:615\n278#4,2:616\n255#4:618\n278#4,2:619\n255#4:621\n278#4,2:622\n1869#5,2:605\n*S KotlinDebug\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment\n*L\n60#1:580,8\n62#1:588,15\n101#1:603,2\n450#1:607,2\n201#1:609,2\n202#1:611,2\n203#1:613,2\n213#1:615\n212#1:616,2\n214#1:618\n214#1:619,2\n216#1:621\n216#1:622,2\n342#1:605,2\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerPagerFragment extends Hilt_AnswerPagerFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public DialogueFragmentAnswerPagerBinding binding;

    /* renamed from: g, reason: from kotlin metadata */
    public SketchPlayFragment sketchPlayFragment;

    /* renamed from: h, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy newAnswerViewModel;

    /* renamed from: j, reason: from kotlin metadata */
    public final Lazy tempPreviewImagePath;

    /* renamed from: k, reason: from kotlin metadata */
    public Job job;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$1", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {110}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$1 */
    public static final class C75031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10930a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$1$1", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nAnswerPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,579:1\n278#2,2:580\n*S KotlinDebug\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$1$1\n*L\n111#1:580,2\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<QuestionResp, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10932a;

            /* renamed from: b */
            public final /* synthetic */ AnswerPagerFragment f10933b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnswerPagerFragment answerPagerFragment, Continuation continuation) {
                super(2, continuation);
                this.f10933b = answerPagerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(QuestionResp questionResp, Continuation continuation) {
                return ((AnonymousClass1) create(questionResp, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f10933b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10932a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding = this.f10933b.binding;
                if (dialogueFragmentAnswerPagerBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    dialogueFragmentAnswerPagerBinding = null;
                }
                ImageView ivAnswer = dialogueFragmentAnswerPagerBinding.f10426c;
                Intrinsics.checkNotNullExpressionValue(ivAnswer, "ivAnswer");
                ivAnswer.setVisibility(this.f10933b.m10259S() ? 4 : 0);
                return Unit.INSTANCE;
            }
        }

        public C75031(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AnswerPagerFragment.this.new C75031(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10930a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow questionBean = AnswerPagerFragment.this.m10225K().getQuestionBean();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AnswerPagerFragment.this, null);
                this.f10930a = 1;
                if (FlowKt.collectLatest(questionBean, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C75031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$2", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {116}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$2 */
    public static final class C75042 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10934a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lp6/k;", "it", "", "<anonymous>", "(Lp6/k;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$2$2", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nAnswerPagerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,579:1\n257#2,2:580\n257#2,2:582\n257#2,2:584\n257#2,2:586\n257#2,2:588\n257#2,2:590\n*S KotlinDebug\n*F\n+ 1 AnswerPagerFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$onViewCreated$2$2\n*L\n126#1:580,2\n127#1:582,2\n129#1:584,2\n132#1:586,2\n133#1:588,2\n134#1:590,2\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$2$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<C9336k, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10936a;

            /* renamed from: b */
            public /* synthetic */ Object f10937b;

            /* renamed from: c */
            public final /* synthetic */ AnswerPagerFragment f10938c;

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$2$2$1", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$2$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10939a;

                /* renamed from: b */
                public final /* synthetic */ AnswerPagerFragment f10940b;

                /* renamed from: c */
                public final /* synthetic */ C9336k f10941c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(AnswerPagerFragment answerPagerFragment, C9336k c9336k, Continuation continuation) {
                    super(2, continuation);
                    this.f10940b = answerPagerFragment;
                    this.f10941c = c9336k;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.f10940b, this.f10941c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return invoke2(coroutineScope, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10939a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    SketchPlayFragment sketchPlayFragment = this.f10940b.sketchPlayFragment;
                    if (sketchPlayFragment != null) {
                        sketchPlayFragment.m11743o0(this.f10941c.m15244s());
                    }
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AnswerPagerFragment answerPagerFragment, Continuation continuation) {
                super(2, continuation);
                this.f10938c = answerPagerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C9336k c9336k, Continuation continuation) {
                return ((AnonymousClass2) create(c9336k, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f10938c, continuation);
                anonymousClass2.f10937b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                LifecycleCoroutineScope lifecycleScope;
                SketchPlayFragment sketchPlayFragment;
                SketchPlayFragment sketchPlayFragment2;
                C9336k c9336k = (C9336k) this.f10937b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10936a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (c9336k.m15244s()) {
                    this.f10938c.m10257L();
                    DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding = this.f10938c.binding;
                    if (dialogueFragmentAnswerPagerBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerPagerBinding = null;
                    }
                    ImageView ivStart = dialogueFragmentAnswerPagerBinding.f10428e;
                    Intrinsics.checkNotNullExpressionValue(ivStart, "ivStart");
                    ivStart.setVisibility(this.f10938c.m10253C(c9336k) ? 0 : 8);
                    DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding2 = this.f10938c.binding;
                    if (dialogueFragmentAnswerPagerBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerPagerBinding2 = null;
                    }
                    PhotoView photoView = dialogueFragmentAnswerPagerBinding2.f10430g;
                    Intrinsics.checkNotNullExpressionValue(photoView, "photoView");
                    SketchPlayFragment sketchPlayFragment3 = this.f10938c.sketchPlayFragment;
                    photoView.setVisibility(sketchPlayFragment3 != null && sketchPlayFragment3.m11735c0() && (sketchPlayFragment2 = this.f10938c.sketchPlayFragment) != null && sketchPlayFragment2.getProgress() == 0 ? 0 : 8);
                    DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding3 = this.f10938c.binding;
                    if (dialogueFragmentAnswerPagerBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerPagerBinding3 = null;
                    }
                    ImageView ivFullscreen = dialogueFragmentAnswerPagerBinding3.f10427d;
                    Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
                    SketchPlayFragment sketchPlayFragment4 = this.f10938c.sketchPlayFragment;
                    ivFullscreen.setVisibility(sketchPlayFragment4 != null && sketchPlayFragment4.m11735c0() && (sketchPlayFragment = this.f10938c.sketchPlayFragment) != null && sketchPlayFragment.getProgress() == 0 ? 0 : 8);
                } else {
                    DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding4 = this.f10938c.binding;
                    if (dialogueFragmentAnswerPagerBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerPagerBinding4 = null;
                    }
                    PhotoView photoView2 = dialogueFragmentAnswerPagerBinding4.f10430g;
                    Intrinsics.checkNotNullExpressionValue(photoView2, "photoView");
                    photoView2.setVisibility(8);
                    DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding5 = this.f10938c.binding;
                    if (dialogueFragmentAnswerPagerBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerPagerBinding5 = null;
                    }
                    ImageView ivStart2 = dialogueFragmentAnswerPagerBinding5.f10428e;
                    Intrinsics.checkNotNullExpressionValue(ivStart2, "ivStart");
                    ivStart2.setVisibility(8);
                    DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding6 = this.f10938c.binding;
                    if (dialogueFragmentAnswerPagerBinding6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerPagerBinding6 = null;
                    }
                    ImageView ivFullscreen2 = dialogueFragmentAnswerPagerBinding6.f10427d;
                    Intrinsics.checkNotNullExpressionValue(ivFullscreen2, "ivFullscreen");
                    ivFullscreen2.setVisibility(8);
                }
                SketchPlayFragment sketchPlayFragment5 = this.f10938c.sketchPlayFragment;
                if (sketchPlayFragment5 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(sketchPlayFragment5)) != null) {
                    lifecycleScope.launchWhenCreated(new AnonymousClass1(this.f10938c, c9336k, null));
                }
                return Unit.INSTANCE;
            }
        }

        public C75042(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m10288c(C9336k c9336k) {
            return c9336k.m15244s();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AnswerPagerFragment.this.new C75042(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10934a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(AnswerPagerFragment.this.m10225K().getViewState(), new Function1() { // from class: com.zykj.student.dialogue.ui.detail.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(AnswerPagerFragment.C75042.m10288c((C9336k) obj2));
                    }
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(AnswerPagerFragment.this, null);
                this.f10934a = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C75042) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$3", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {144}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$3 */
    public static final class C75053 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10942a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$3$1", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC7539b, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10944a;

            /* renamed from: b */
            public /* synthetic */ Object f10945b;

            /* renamed from: c */
            public final /* synthetic */ AnswerPagerFragment f10946c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnswerPagerFragment answerPagerFragment, Continuation continuation) {
                super(2, continuation);
                this.f10946c = answerPagerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7539b abstractC7539b, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC7539b, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10946c, continuation);
                anonymousClass1.f10945b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AbstractC7539b abstractC7539b = (AbstractC7539b) this.f10945b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10944a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (abstractC7539b instanceof AbstractC7539b.c) {
                    this.f10946c.m10225K().m10478V(this.f10946c.m10223H());
                    this.f10946c.m10225K().m10477U(this.f10946c.m10224I());
                }
                return Unit.INSTANCE;
            }
        }

        public C75053(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AnswerPagerFragment.this.new C75053(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10942a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow event = AnswerPagerFragment.this.m10225K().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AnswerPagerFragment.this, null);
                this.f10942a = 1;
                if (FlowKt.collectLatest(event, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C75053) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$4", m13451f = "AnswerPagerFragment.kt", m13452i = {}, m13453l = {153}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$4 */
    public static final class C75064 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10947a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$4$1", m13451f = "AnswerPagerFragment.kt", m13452i = {0}, m13453l = {158}, m13454m = "invokeSuspend", m13455n = {"it"}, m13456s = {"L$0"})
        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onViewCreated$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC7540c, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10949a;

            /* renamed from: b */
            public /* synthetic */ Object f10950b;

            /* renamed from: c */
            public final /* synthetic */ AnswerPagerFragment f10951c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnswerPagerFragment answerPagerFragment, Continuation continuation) {
                super(2, continuation);
                this.f10951c = answerPagerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7540c abstractC7540c, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC7540c, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10951c, continuation);
                anonymousClass1.f10950b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AbstractC7540c abstractC7540c = (AbstractC7540c) this.f10950b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f10949a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (abstractC7540c instanceof AbstractC7540c.a) {
                        if (((AbstractC7540c.a) abstractC7540c).m10507a()) {
                            this.f10951c.m10225K().m10471O();
                            AnswerViewModel answerViewModelM10225K = this.f10951c.m10225K();
                            this.f10950b = SpillingKt.nullOutSpilledVariable(abstractC7540c);
                            this.f10949a = 1;
                            if (answerViewModelM10225K.m10462D(true, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            XToastUtils.INSTANCE.error("导入失败");
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public C75064(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AnswerPagerFragment.this.new C75064(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10947a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow sharedFlowM10491q = AnswerPagerFragment.this.m10255G().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AnswerPagerFragment.this, null);
                this.f10947a = 1;
                if (FlowKt.collectLatest(sharedFlowM10491q, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C75064) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AnswerPagerFragment() {
        final int i9 = R.id.dialogue_detail_main;
        final Lazy lazy = LazyKt.lazy(new Function0<NavBackStackEntry>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i9);
            }
        });
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AnswerViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelCreationExtras();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$special$$inlined$hiltNavGraphViewModels$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelProviderFactory());
            }
        });
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy2 = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.newAnswerViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(NewAnswerViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy2).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.tempPreviewImagePath = LazyKt.lazy(new Function0() { // from class: o6.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerPagerFragment.m10232X();
            }
        });
    }

    /* renamed from: D */
    public static final boolean m10221D(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.isFile()) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.endsWith$default(name, ".amr", false, 2, (Object) null)) {
                return true;
            }
            String name2 = file.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            if (StringsKt.endsWith$default(name2, ".wav", false, 2, (Object) null)) {
                return true;
            }
            String name3 = file.getName();
            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
            if (StringsKt.endsWith$default(name3, ".mp3", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public static final void m10222F(C6593a c6593a, DialogInterface dialogInterface) {
        if (c6593a != null) {
            c6593a.m4593i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public final int m10223H() {
        SketchPlayFragment sketchPlayFragment = this.sketchPlayFragment;
        if (sketchPlayFragment != null) {
            return sketchPlayFragment.getProgress();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final double m10224I() {
        SketchPlayFragment sketchPlayFragment = this.sketchPlayFragment;
        if (sketchPlayFragment != null) {
            return sketchPlayFragment.m11729L();
        }
        return 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final AnswerViewModel m10225K() {
        return (AnswerViewModel) this.viewModel.getValue();
    }

    /* renamed from: N */
    public static final Unit m10226N(AnswerPagerFragment answerPagerFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        answerPagerFragment.m10257L();
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final Unit m10227O(AnswerPagerFragment answerPagerFragment, View it) {
        Bitmap bitmapM11728K;
        Intrinsics.checkNotNullParameter(it, "it");
        SketchPlayFragment sketchPlayFragment = answerPagerFragment.sketchPlayFragment;
        if (sketchPlayFragment != null) {
            sketchPlayFragment.m11720F();
        }
        answerPagerFragment.m10225K().m10469M(AbstractC7539b.c.f11259a);
        if (((C9336k) answerPagerFragment.m10225K().getViewState().getValue()).m15245t()) {
            if (FileUtils.isFileExists(answerPagerFragment.m10256J())) {
                FileUtils.delete(answerPagerFragment.m10256J());
            }
            SketchPlayFragment sketchPlayFragment2 = answerPagerFragment.sketchPlayFragment;
            if (sketchPlayFragment2 != null && (bitmapM11728K = sketchPlayFragment2.m11728K()) != null) {
                ImageUtils.save(bitmapM11728K, answerPagerFragment.m10256J(), Bitmap.CompressFormat.PNG);
            }
            FragmentKt.findNavController(answerPagerFragment).navigate(R.id.dialogue_nav_new_answer, new NewAnswerFragmentArgs(answerPagerFragment.m10256J(), null, answerPagerFragment.m10225K().m10465I(), null, null, null, 58, null).m10438g());
        } else {
            FragmentKt.findNavController(answerPagerFragment).navigate(R.id.dialogue_nav_new_answer, new NewAnswerFragmentArgs(((C9336k) answerPagerFragment.m10225K().getViewState().getValue()).m15231f(), null, answerPagerFragment.m10225K().m10465I(), null, null, null, 58, null).m10438g());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: P */
    public static final Unit m10228P(AnswerPagerFragment answerPagerFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding = answerPagerFragment.binding;
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding2 = null;
        if (dialogueFragmentAnswerPagerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding = null;
        }
        PhotoView photoView = dialogueFragmentAnswerPagerBinding.f10430g;
        Intrinsics.checkNotNullExpressionValue(photoView, "photoView");
        photoView.setVisibility(8);
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding3 = answerPagerFragment.binding;
        if (dialogueFragmentAnswerPagerBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding3 = null;
        }
        ImageView ivStart = dialogueFragmentAnswerPagerBinding3.f10428e;
        Intrinsics.checkNotNullExpressionValue(ivStart, "ivStart");
        ivStart.setVisibility(8);
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding4 = answerPagerFragment.binding;
        if (dialogueFragmentAnswerPagerBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dialogueFragmentAnswerPagerBinding2 = dialogueFragmentAnswerPagerBinding4;
        }
        ImageView ivFullscreen = dialogueFragmentAnswerPagerBinding2.f10427d;
        Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
        ivFullscreen.setVisibility(8);
        SketchPlayFragment sketchPlayFragment = answerPagerFragment.sketchPlayFragment;
        if (sketchPlayFragment != null) {
            sketchPlayFragment.m11737e0();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Q */
    public static final Unit m10229Q(AnswerPagerFragment answerPagerFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        answerPagerFragment.m10262V();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10230R(com.zykj.student.dialogue.p076ui.detail.AnswerPagerFragment r5, android.view.View r6, float r7, float r8) {
        /*
            com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBinding r6 = r5.binding
            r7 = 0
            java.lang.String r8 = "binding"
            if (r6 != 0) goto Lb
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r6 = r7
        Lb:
            android.widget.ImageView r6 = r6.f10426c
            java.lang.String r0 = "ivAnswer"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            boolean r1 = r5.m10259S()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
        L1a:
            r0 = r2
            goto L31
        L1c:
            com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBinding r1 = r5.binding
            if (r1 != 0) goto L24
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r1 = r7
        L24:
            android.widget.ImageView r1 = r1.f10426c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L30
            goto L1a
        L30:
            r0 = r3
        L31:
            r1 = 4
            if (r0 == 0) goto L36
            r0 = r1
            goto L37
        L36:
            r0 = r3
        L37:
            r6.setVisibility(r0)
            com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBinding r6 = r5.binding
            if (r6 != 0) goto L42
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r6 = r7
        L42:
            android.widget.ImageView r6 = r6.f10427d
            java.lang.String r0 = "ivFullscreen"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBinding r4 = r5.binding
            if (r4 != 0) goto L51
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r4 = r7
        L51:
            android.widget.ImageView r4 = r4.f10427d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L5e
            r0 = r2
            goto L5f
        L5e:
            r0 = r3
        L5f:
            if (r0 == 0) goto L63
            r0 = r1
            goto L64
        L63:
            r0 = r3
        L64:
            r6.setVisibility(r0)
            com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel r6 = r5.m10225K()
            kotlinx.coroutines.flow.StateFlow r6 = r6.getViewState()
            java.lang.Object r6 = r6.getValue()
            p6.k r6 = (p214p6.C9336k) r6
            boolean r6 = r5.m10253C(r6)
            if (r6 == 0) goto La6
            com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBinding r6 = r5.binding
            if (r6 != 0) goto L83
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            r6 = r7
        L83:
            android.widget.ImageView r6 = r6.f10428e
            java.lang.String r0 = "ivStart"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            com.zykj.student.dialogue.databinding.DialogueFragmentAnswerPagerBinding r5 = r5.binding
            if (r5 != 0) goto L92
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r8)
            goto L93
        L92:
            r7 = r5
        L93:
            android.widget.ImageView r5 = r7.f10428e
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L9f
            goto La0
        L9f:
            r2 = r3
        La0:
            if (r2 == 0) goto La3
            r3 = r1
        La3:
            r6.setVisibility(r3)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.detail.AnswerPagerFragment.m10230R(com.zykj.student.dialogue.ui.detail.AnswerPagerFragment, android.view.View, float, float):void"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/AnswerPagerFragment.smali:1136
    }

    /* renamed from: W */
    public static final void m10231W(SketchPlayFragment sketchPlayFragment, AnswerPagerFragment answerPagerFragment, boolean z9) {
        boolean zM11736d0 = sketchPlayFragment.m11736d0();
        SketchPlayFragment sketchPlayFragment2 = answerPagerFragment.sketchPlayFragment;
        if (sketchPlayFragment2 != null) {
            sketchPlayFragment2.m11724H0();
        }
        answerPagerFragment.m10225K().m10469M(new AbstractC7539b.a(!z9, sketchPlayFragment.getProgress(), zM11736d0, sketchPlayFragment.m11729L()));
    }

    /* renamed from: X */
    public static final String m10232X() {
        return PathUtils.getExternalAppCachePath() + File.separator + "temp_add.png";
    }

    /* renamed from: C */
    public final boolean m10253C(C9336k viewState) {
        SketchPlayFragment sketchPlayFragment = this.sketchPlayFragment;
        if (sketchPlayFragment == null || sketchPlayFragment.getProgress() != 0) {
            return false;
        }
        String strM15234i = viewState.m15234i();
        if (strM15234i == null) {
            strM15234i = "";
        }
        return SequencesKt.count(SequencesKt.filter(FilesKt.walk$default(new File(strM15234i), null, 1, null), new Function1() { // from class: o6.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(AnswerPagerFragment.m10221D((File) obj));
            }
        })) > 0;
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [T, com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog] */
    /* renamed from: E */
    public final void m10254E(List downloadTasks, boolean showLoading) {
        final C6593a c6593a = showLoading ? (C6593a) CollectionsKt.firstOrNull(downloadTasks) : null;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (showLoading) {
            objectRef.element = new MaterialDialog.C6831g(requireContext()).m6696f("正在下载请稍后").m6697g(GravityEnum.CENTER).m6703m(false, 100, true).m6694d(false).m6692b(new DialogInterface.OnCancelListener() { // from class: o6.n
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    AnswerPagerFragment.m10222F(c6593a, dialogInterface);
                }
            }).m6699i(getString(R.string.cancel)).m6704n();
        }
        Iterator it = downloadTasks.iterator();
        while (it.hasNext()) {
            ((C6593a) it.next()).m4595k(new AbstractC9944b() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$download$2$1
                @Override // p309z1.C9988b.a
                /* renamed from: a */
                public void mo10263a(C6593a task, C9419c info, boolean z9, C9988b.b model) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(info, "info");
                    Intrinsics.checkNotNullParameter(model, "model");
                }

                @Override // p309z1.C9988b.a
                /* renamed from: b */
                public void mo10264b(C6593a task, EndCause cause, Exception exc, C9317f taskSpeed) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(cause, "cause");
                    Intrinsics.checkNotNullParameter(taskSpeed, "taskSpeed");
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f10901b), null, null, new AnswerPagerFragment$download$2$1$taskEnd$1(cause, task, objectRef, c6593a, this.f10901b, null), 3, null);
                }

                @Override // p209p1.InterfaceC9312a
                /* renamed from: g */
                public void mo10265g(C6593a task) {
                    Intrinsics.checkNotNullParameter(task, "task");
                }

                @Override // p309z1.C9988b.a
                /* renamed from: h */
                public void mo10266h(C6593a task, int i9, C9417a c9417a, C9317f blockSpeed) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(blockSpeed, "blockSpeed");
                }

                @Override // p309z1.C9988b.a
                /* renamed from: j */
                public void mo10267j(C6593a task, int i9, long j9, C9317f blockSpeed) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(blockSpeed, "blockSpeed");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p309z1.C9988b.a
                /* renamed from: l */
                public void mo10268l(C6593a task, long j9, C9317f taskSpeed) {
                    C9419c c9419cM4600p;
                    MaterialDialog materialDialog;
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(taskSpeed, "taskSpeed");
                    C6593a c6593a2 = c6593a;
                    if (!Intrinsics.areEqual(c6593a2 != null ? c6593a2.mo4588b() : null, task.mo4588b()) || (c9419cM4600p = task.m4600p()) == null || (materialDialog = (MaterialDialog) objectRef.element) == null) {
                        return;
                    }
                    materialDialog.m6686t((int) (((j9 * 1.0f) / c9419cM4600p.m15529j()) * 100));
                }

                @Override // p209p1.InterfaceC9312a
                /* renamed from: o */
                public void mo10269o(C6593a task, int i9, int i10, Map responseHeaderFields) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(responseHeaderFields, "responseHeaderFields");
                }

                @Override // p209p1.InterfaceC9312a
                /* renamed from: u */
                public void mo10270u(C6593a task, int i9, Map requestHeaderFields) {
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(requestHeaderFields, "requestHeaderFields");
                }
            });
        }
    }

    /* renamed from: G */
    public final NewAnswerViewModel m10255G() {
        return (NewAnswerViewModel) this.newAnswerViewModel.getValue();
    }

    /* renamed from: J */
    public final String m10256J() {
        return (String) this.tempPreviewImagePath.getValue();
    }

    /* renamed from: L */
    public final void m10257L() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new AnswerPagerFragment$loadData$1(this, null));
    }

    /* renamed from: M */
    public final void m10258M(String path) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new AnswerPagerFragment$loadMicroLesson$1(this, path, null));
    }

    /* renamed from: S */
    public final boolean m10259S() {
        QuestionResp questionResp;
        return m10225K().getFromCollectHistory() || ((questionResp = (QuestionResp) m10225K().getQuestionBean().getValue()) != null && questionResp.getClosed());
    }

    /* renamed from: T */
    public final void m10260T(boolean succeed) {
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding = this.binding;
        if (dialogueFragmentAnswerPagerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding = null;
        }
        LinearLayout llLoadError = dialogueFragmentAnswerPagerBinding.f10429f;
        Intrinsics.checkNotNullExpressionValue(llLoadError, "llLoadError");
        llLoadError.setVisibility(!succeed ? 0 : 8);
    }

    /* renamed from: U */
    public final void m10261U() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.job = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new AnswerPagerFragment$startAutoHideJob$1(this, null));
    }

    /* renamed from: V */
    public final void m10262V() {
        SketchPlayFragment sketchPlayFragment = this.sketchPlayFragment;
        if (sketchPlayFragment != null) {
            long jM15233h = ((C9336k) m10225K().getViewState().getValue()).m15233h();
            boolean zM15244s = ((C9336k) m10225K().getViewState().getValue()).m15244s();
            if (zM15244s) {
                if (System.currentTimeMillis() - jM15233h > 1000) {
                    m10231W(sketchPlayFragment, this, zM15244s);
                    return;
                } else {
                    XToastUtils.INSTANCE.warning("不要频繁操作");
                    return;
                }
            }
            if (System.currentTimeMillis() - jM15233h > 3000) {
                m10231W(sketchPlayFragment, this, zM15244s);
            } else {
                XToastUtils.INSTANCE.warning("不要频繁操作");
            }
        }
    }

    @Override // com.zykj.student.dialogue.p076ui.detail.Hilt_AnswerPagerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zykj.student.dialogue.ui.detail.AnswerPagerFragment$onAttach$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                if (((C9336k) this.f10929a.m10225K().getViewState().getValue()).m15244s()) {
                    this.f10929a.m10262V();
                } else {
                    FragmentKt.findNavController(this.f10929a).navigateUp();
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBindingM9940a = DialogueFragmentAnswerPagerBinding.m9940a(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dialogueFragmentAnswerPagerBindingM9940a, "inflate(...)");
        this.binding = dialogueFragmentAnswerPagerBindingM9940a;
        if (dialogueFragmentAnswerPagerBindingM9940a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBindingM9940a = null;
        }
        View root = dialogueFragmentAnswerPagerBindingM9940a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding = this.binding;
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding2 = null;
        if (dialogueFragmentAnswerPagerBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding = null;
        }
        ImageView ivAnswer = dialogueFragmentAnswerPagerBinding.f10426c;
        Intrinsics.checkNotNullExpressionValue(ivAnswer, "ivAnswer");
        ivAnswer.setVisibility(m10259S() ? 4 : 0);
        this.sketchPlayFragment = new SketchPlayFragment();
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i9 = R.id.fl_container;
        SketchPlayFragment sketchPlayFragment = this.sketchPlayFragment;
        Intrinsics.checkNotNull(sketchPlayFragment);
        fragmentTransactionBeginTransaction.replace(i9, sketchPlayFragment).commitNowAllowingStateLoss();
        SketchPlayFragment sketchPlayFragment2 = this.sketchPlayFragment;
        if (sketchPlayFragment2 != null) {
            sketchPlayFragment2.m11746r0(new C7853a(false, null, null, false, null, null, null, null, false, false, 767, null));
        }
        m10257L();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C75031(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new C75042(null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C75053(null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C75064(null), 3, null);
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding3 = this.binding;
        if (dialogueFragmentAnswerPagerBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding3 = null;
        }
        LinearLayout llLoadError = dialogueFragmentAnswerPagerBinding3.f10429f;
        Intrinsics.checkNotNullExpressionValue(llLoadError, "llLoadError");
        AbstractC8136b.m13040h(llLoadError, new Function1() { // from class: o6.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerPagerFragment.m10226N(this.f15599a, (View) obj);
            }
        });
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding4 = this.binding;
        if (dialogueFragmentAnswerPagerBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding4 = null;
        }
        ImageView ivAnswer2 = dialogueFragmentAnswerPagerBinding4.f10426c;
        Intrinsics.checkNotNullExpressionValue(ivAnswer2, "ivAnswer");
        AbstractC8136b.m13040h(ivAnswer2, new Function1() { // from class: o6.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerPagerFragment.m10227O(this.f15601a, (View) obj);
            }
        });
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding5 = this.binding;
        if (dialogueFragmentAnswerPagerBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding5 = null;
        }
        ImageView ivStart = dialogueFragmentAnswerPagerBinding5.f10428e;
        Intrinsics.checkNotNullExpressionValue(ivStart, "ivStart");
        AbstractC8136b.m13040h(ivStart, new Function1() { // from class: o6.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerPagerFragment.m10228P(this.f15603a, (View) obj);
            }
        });
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding6 = this.binding;
        if (dialogueFragmentAnswerPagerBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerPagerBinding6 = null;
        }
        ImageView ivFullscreen = dialogueFragmentAnswerPagerBinding6.f10427d;
        Intrinsics.checkNotNullExpressionValue(ivFullscreen, "ivFullscreen");
        AbstractC8136b.m13040h(ivFullscreen, new Function1() { // from class: o6.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerPagerFragment.m10229Q(this.f15605a, (View) obj);
            }
        });
        DialogueFragmentAnswerPagerBinding dialogueFragmentAnswerPagerBinding7 = this.binding;
        if (dialogueFragmentAnswerPagerBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dialogueFragmentAnswerPagerBinding2 = dialogueFragmentAnswerPagerBinding7;
        }
        dialogueFragmentAnswerPagerBinding2.f10430g.setOnViewTapListener(new ViewOnTouchListenerC6849c.i() { // from class: o6.k
            @Override // com.xuexiang.xui.widget.imageview.photoview.ViewOnTouchListenerC6849c.i
            /* renamed from: a */
            public final void mo6867a(View view2, float f10, float f11) {
                AnswerPagerFragment.m10230R(this.f15607a, view2, f10, f11);
            }
        });
    }
}
