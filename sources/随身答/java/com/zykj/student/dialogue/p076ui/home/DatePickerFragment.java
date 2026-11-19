package com.zykj.student.dialogue.p076ui.home;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import com.blankj.utilcode.util.TimeUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.taobao.sophix.PatchStatus;
import com.xuexiang.xui.widget.picker.widget.configure.TimePickerType;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.FragmentDatePickerBinding;
import com.zykj.student.dialogue.p076ui.home.DatePickerFragment;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p003a2.InterfaceC0027n;
import p020b2.InterfaceC5105g;
import p136i4.C8133a;
import p156k4.InterfaceC8272c;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "title", "Ljava/util/Date;", "currentTime", "Lkotlin/Function1;", "callback", "H", "(Ljava/lang/String;Ljava/util/Date;Lkotlin/jvm/functions/Function1;)V", "Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;", "f", "Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;", "binding", "Ljava/text/SimpleDateFormat;", "g", "Ljava/text/SimpleDateFormat;", "timeFormat", "h", "dateFormat", "Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;", "i", "Lkotlin/Lazy;", "w", "()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;", "viewModel", "Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;", "j", "Landroidx/navigation/NavArgsLazy;", "v", "()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;", "args", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDatePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerFragment.kt\ncom/zykj/student/dialogue/ui/home/DatePickerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,233:1\n106#2,15:234\n42#3,3:249\n*S KotlinDebug\n*F\n+ 1 DatePickerFragment.kt\ncom/zykj/student/dialogue/ui/home/DatePickerFragment\n*L\n35#1:234,15\n37#1:249,3\n*E\n"})
/* loaded from: classes5.dex */
public final class DatePickerFragment extends Hilt_DatePickerFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public FragmentDatePickerBinding binding;

    /* renamed from: g, reason: from kotlin metadata */
    public final SimpleDateFormat timeFormat;

    /* renamed from: h, reason: from kotlin metadata */
    public final SimpleDateFormat dateFormat;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: j, reason: from kotlin metadata */
    public final NavArgsLazy args;

    /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragment$a */
    public static final class C7543a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11283a;

        public C7543a(Fragment fragment) {
            this.f11283a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11283a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11283a + " has null arguments");
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$1", m13451f = "DatePickerFragment.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_UNDEFINED}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$1 */
    public static final class C75441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11284a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Ljava/util/Date;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$1$1", m13451f = "DatePickerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Date, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11286a;

            /* renamed from: b */
            public /* synthetic */ Object f11287b;

            /* renamed from: c */
            public final /* synthetic */ DatePickerFragment f11288c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DatePickerFragment datePickerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11288c = datePickerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Date date, Continuation continuation) {
                return ((AnonymousClass1) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11288c, continuation);
                anonymousClass1.f11287b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                Date date = (Date) this.f11287b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11286a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FragmentDatePickerBinding fragmentDatePickerBinding = this.f11288c.binding;
                FragmentDatePickerBinding fragmentDatePickerBinding2 = null;
                if (fragmentDatePickerBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDatePickerBinding = null;
                }
                fragmentDatePickerBinding.f10520h.setEnabled(date != null);
                if (date == null) {
                    FragmentDatePickerBinding fragmentDatePickerBinding3 = this.f11288c.binding;
                    if (fragmentDatePickerBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDatePickerBinding3 = null;
                    }
                    fragmentDatePickerBinding3.f10516d.setSelectedDate((CalendarDay) null);
                    FragmentDatePickerBinding fragmentDatePickerBinding4 = this.f11288c.binding;
                    if (fragmentDatePickerBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDatePickerBinding2 = fragmentDatePickerBinding4;
                    }
                    fragmentDatePickerBinding2.f10516d.setCurrentDate(new Date());
                }
                return Unit.INSTANCE;
            }
        }

        public C75441(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return DatePickerFragment.this.new C75441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11284a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowM10569h = DatePickerFragment.this.m10549w().getStartDate();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DatePickerFragment.this, null);
                this.f11284a = 1;
                if (FlowKt.collectLatest(stateFlowM10569h, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C75441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$2", m13451f = "DatePickerFragment.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_HANDLE_DEX}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$2 */
    public static final class C75462 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11290a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Ljava/util/Date;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$2$1", m13451f = "DatePickerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Date, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11292a;

            /* renamed from: b */
            public /* synthetic */ Object f11293b;

            /* renamed from: c */
            public final /* synthetic */ DatePickerFragment f11294c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DatePickerFragment datePickerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11294c = datePickerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Date date, Continuation continuation) {
                return ((AnonymousClass1) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11294c, continuation);
                anonymousClass1.f11293b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                Date date = (Date) this.f11293b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11292a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FragmentDatePickerBinding fragmentDatePickerBinding = this.f11294c.binding;
                FragmentDatePickerBinding fragmentDatePickerBinding2 = null;
                if (fragmentDatePickerBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentDatePickerBinding = null;
                }
                fragmentDatePickerBinding.f10518f.setEnabled(date != null);
                if (date == null) {
                    FragmentDatePickerBinding fragmentDatePickerBinding3 = this.f11294c.binding;
                    if (fragmentDatePickerBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentDatePickerBinding3 = null;
                    }
                    fragmentDatePickerBinding3.f10515c.setSelectedDate((CalendarDay) null);
                    FragmentDatePickerBinding fragmentDatePickerBinding4 = this.f11294c.binding;
                    if (fragmentDatePickerBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDatePickerBinding2 = fragmentDatePickerBinding4;
                    }
                    fragmentDatePickerBinding2.f10516d.setCurrentDate(new Date());
                }
                return Unit.INSTANCE;
            }
        }

        public C75462(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return DatePickerFragment.this.new C75462(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11290a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowM10567f = DatePickerFragment.this.m10549w().getEndDate();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DatePickerFragment.this, null);
                this.f11290a = 1;
                if (FlowKt.collectLatest(stateFlowM10567f, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C75462) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$3", m13451f = "DatePickerFragment.kt", m13452i = {}, m13453l = {91}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$3 */
    public static final class C75473 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11295a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Ljava/util/Date;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$3$1", m13451f = "DatePickerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nDatePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerFragment.kt\ncom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Date, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11297a;

            /* renamed from: b */
            public /* synthetic */ Object f11298b;

            /* renamed from: c */
            public final /* synthetic */ DatePickerFragment f11299c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DatePickerFragment datePickerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11299c = datePickerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Date date, Continuation continuation) {
                return ((AnonymousClass1) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11299c, continuation);
                anonymousClass1.f11298b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Date date = (Date) this.f11298b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11297a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FragmentDatePickerBinding fragmentDatePickerBinding = null;
                if (date != null) {
                    DatePickerFragment datePickerFragment = this.f11299c;
                    FragmentDatePickerBinding fragmentDatePickerBinding2 = datePickerFragment.binding;
                    if (fragmentDatePickerBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDatePickerBinding = fragmentDatePickerBinding2;
                    }
                    fragmentDatePickerBinding.f10520h.setText(datePickerFragment.timeFormat.format(date));
                } else {
                    FragmentDatePickerBinding fragmentDatePickerBinding3 = this.f11299c.binding;
                    if (fragmentDatePickerBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDatePickerBinding = fragmentDatePickerBinding3;
                    }
                    fragmentDatePickerBinding.f10520h.setText("—— : ——");
                }
                return Unit.INSTANCE;
            }
        }

        public C75473(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return DatePickerFragment.this.new C75473(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11295a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowM10570i = DatePickerFragment.this.m10549w().getStartTime();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DatePickerFragment.this, null);
                this.f11295a = 1;
                if (FlowKt.collectLatest(stateFlowM10570i, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C75473) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$4", m13451f = "DatePickerFragment.kt", m13452i = {}, m13453l = {99}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$4 */
    public static final class C75484 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11300a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Ljava/util/Date;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$4$1", m13451f = "DatePickerFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nDatePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerFragment.kt\ncom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$4$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Date, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11302a;

            /* renamed from: b */
            public /* synthetic */ Object f11303b;

            /* renamed from: c */
            public final /* synthetic */ DatePickerFragment f11304c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DatePickerFragment datePickerFragment, Continuation continuation) {
                super(2, continuation);
                this.f11304c = datePickerFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Date date, Continuation continuation) {
                return ((AnonymousClass1) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11304c, continuation);
                anonymousClass1.f11303b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Date date = (Date) this.f11303b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11302a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FragmentDatePickerBinding fragmentDatePickerBinding = null;
                if (date != null) {
                    DatePickerFragment datePickerFragment = this.f11304c;
                    FragmentDatePickerBinding fragmentDatePickerBinding2 = datePickerFragment.binding;
                    if (fragmentDatePickerBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDatePickerBinding = fragmentDatePickerBinding2;
                    }
                    fragmentDatePickerBinding.f10518f.setText(datePickerFragment.timeFormat.format(date));
                } else {
                    FragmentDatePickerBinding fragmentDatePickerBinding3 = this.f11304c.binding;
                    if (fragmentDatePickerBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentDatePickerBinding = fragmentDatePickerBinding3;
                    }
                    fragmentDatePickerBinding.f10518f.setText("—— : ——");
                }
                return Unit.INSTANCE;
            }
        }

        public C75484(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return DatePickerFragment.this.new C75484(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11300a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowM10568g = DatePickerFragment.this.m10549w().getEndTime();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DatePickerFragment.this, null);
                this.f11300a = 1;
                if (FlowKt.collectLatest(stateFlowM10568g, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C75484) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public DatePickerFragment() {
        Locale locale = Locale.CHINA;
        this.timeFormat = new SimpleDateFormat("HH:mm", locale);
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.home.DatePickerFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.home.DatePickerFragment$special$$inlined$viewModels$default$2
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
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DatePickerViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.home.DatePickerFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.home.DatePickerFragment$special$$inlined$viewModels$default$4
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
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.home.DatePickerFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(DatePickerFragmentArgs.class), new C7543a(this));
    }

    /* renamed from: A */
    public static final void m10521A(DatePickerFragment datePickerFragment, MaterialCalendarView materialCalendarView, CalendarDay date, boolean z9) {
        Intrinsics.checkNotNullParameter(materialCalendarView, "<unused var>");
        Intrinsics.checkNotNullParameter(date, "date");
        datePickerFragment.m10549w().m10571j(date.m4625f());
    }

    /* renamed from: B */
    public static final void m10522B(DatePickerFragment datePickerFragment, View view) {
        datePickerFragment.m10549w().m10573l(null);
        datePickerFragment.m10549w().m10571j(null);
        datePickerFragment.m10549w().m10572k(null);
        datePickerFragment.m10549w().m10574m(null);
    }

    /* renamed from: C */
    public static final void m10523C(DatePickerFragment datePickerFragment, View view) {
        String str;
        Date date = (Date) datePickerFragment.m10549w().getStartDate().getValue();
        Date date2 = (Date) datePickerFragment.m10549w().getEndDate().getValue();
        Date date3 = (Date) datePickerFragment.m10549w().getStartTime().getValue();
        Date date4 = (Date) datePickerFragment.m10549w().getEndTime().getValue();
        if (date != null && date2 != null && date3 != null && date4 != null) {
            String str2 = datePickerFragment.timeFormat.format(date3);
            String str3 = datePickerFragment.timeFormat.format(date4);
            Date dateString2Date = TimeUtils.string2Date(str2, datePickerFragment.timeFormat);
            Date dateString2Date2 = TimeUtils.string2Date(str3, datePickerFragment.timeFormat);
            if (date2.before(date) || (Intrinsics.areEqual(date2, date) && dateString2Date.after(dateString2Date2))) {
                ToastUtils.showShort("开始时间不能大于结束时间", new Object[0]);
                return;
            }
        }
        String str4 = null;
        if (date == null) {
            str = null;
        } else {
            String str5 = datePickerFragment.dateFormat.format(date);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.CHINA);
            if (date3 == null) {
                date3 = new Date();
            }
            str = str5 + " " + simpleDateFormat.format(date3);
        }
        Pair pairM13420to = TuplesKt.m13420to("startDateTime", str);
        if (date2 != null) {
            String str6 = datePickerFragment.dateFormat.format(date2);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss", Locale.CHINA);
            if (date4 == null) {
                date4 = new Date();
            }
            str4 = str6 + " " + simpleDateFormat2.format(date4);
        }
        FragmentKt.setFragmentResult(datePickerFragment, "date_picker_result", BundleKt.bundleOf(pairM13420to, TuplesKt.m13420to("endDateTime", str4), TuplesKt.m13420to("isJoinedTime", Boolean.valueOf(datePickerFragment.m10548v().getIsJoinedTime())), TuplesKt.m13420to("type", Integer.valueOf(datePickerFragment.m10548v().getType()))));
        androidx.navigation.fragment.FragmentKt.findNavController(datePickerFragment).navigateUp();
    }

    /* renamed from: D */
    public static final void m10524D(final DatePickerFragment datePickerFragment, View view) {
        Date date = (Date) datePickerFragment.m10549w().getStartTime().getValue();
        if (date != null) {
            datePickerFragment.m10547H("开始时间选择", date, new Function1() { // from class: s6.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DatePickerFragment.m10525E(this.f16667a, (Date) obj);
                }
            });
        }
    }

    /* renamed from: E */
    public static final Unit m10525E(DatePickerFragment datePickerFragment, Date it) {
        Intrinsics.checkNotNullParameter(it, "it");
        datePickerFragment.m10549w().m10574m(it);
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final void m10526F(final DatePickerFragment datePickerFragment, View view) {
        Date date = (Date) datePickerFragment.m10549w().getEndTime().getValue();
        if (date != null) {
            datePickerFragment.m10547H("截止时间选择", date, new Function1() { // from class: s6.n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DatePickerFragment.m10527G(this.f16661a, (Date) obj);
                }
            });
        }
    }

    /* renamed from: G */
    public static final Unit m10527G(DatePickerFragment datePickerFragment, Date it) {
        Intrinsics.checkNotNullParameter(it, "it");
        datePickerFragment.m10549w().m10572k(it);
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final void m10528I(Function1 function1, Date date, View view) {
        Intrinsics.checkNotNull(date);
        function1.invoke(date);
    }

    /* renamed from: x */
    public static final CharSequence m10544x(SimpleDateFormat simpleDateFormat, CalendarDay calendarDay) {
        return simpleDateFormat.format(calendarDay.m4625f());
    }

    /* renamed from: y */
    public static final CharSequence m10545y(SimpleDateFormat simpleDateFormat, CalendarDay calendarDay) {
        return simpleDateFormat.format(calendarDay.m4625f());
    }

    /* renamed from: z */
    public static final void m10546z(DatePickerFragment datePickerFragment, MaterialCalendarView materialCalendarView, CalendarDay date, boolean z9) {
        Intrinsics.checkNotNullParameter(materialCalendarView, "<unused var>");
        Intrinsics.checkNotNullParameter(date, "date");
        datePickerFragment.m10549w().m10573l(date.m4625f());
    }

    /* renamed from: H */
    public final void m10547H(String title, Date currentTime, final Function1 callback) {
        Window window;
        Calendar calendar = Calendar.getInstance();
        C8133a c8133a = new C8133a(requireContext(), new InterfaceC8272c() { // from class: s6.f
            @Override // p156k4.InterfaceC8272c
            /* renamed from: a */
            public final void mo13374a(Date date, View view) {
                DatePickerFragment.m10528I(callback, date, view);
            }
        });
        TimePickerType timePickerType = TimePickerType.TIME;
        timePickerType.m6966a()[5] = false;
        C8133a c8133aM13031d = c8133a.m13032e(timePickerType).m13031d(title);
        calendar.setTime(currentTime);
        View decorView = null;
        C8133a c8133aM13030c = c8133aM13031d.m13030c(calendar, null);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        c8133aM13030c.m13029b((ViewGroup) decorView).m13028a().m12744v();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.CustomDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentDatePickerBinding fragmentDatePickerBindingM9960c = FragmentDatePickerBinding.m9960c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(fragmentDatePickerBindingM9960c, "inflate(...)");
        this.binding = fragmentDatePickerBindingM9960c;
        if (fragmentDatePickerBindingM9960c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBindingM9960c = null;
        }
        FrameLayout frameLayoutM9961b = fragmentDatePickerBindingM9960c.getRoot();
        Intrinsics.checkNotNullExpressionValue(frameLayoutM9961b, "getRoot(...)");
        return frameLayoutM9961b;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setType(1000);
            window.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(true);
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
        FragmentDatePickerBinding fragmentDatePickerBinding = null;
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new C75441(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C75462(null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C75473(null), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new C75484(null), 3, null);
        FragmentDatePickerBinding fragmentDatePickerBinding2 = this.binding;
        if (fragmentDatePickerBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding2 = null;
        }
        fragmentDatePickerBinding2.f10516d.m4656L().m4681g().m4688g();
        FragmentDatePickerBinding fragmentDatePickerBinding3 = this.binding;
        if (fragmentDatePickerBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding3 = null;
        }
        fragmentDatePickerBinding3.f10515c.m4656L().m4681g().m4688g();
        FragmentDatePickerBinding fragmentDatePickerBinding4 = this.binding;
        if (fragmentDatePickerBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding4 = null;
        }
        fragmentDatePickerBinding4.f10520h.setOnClickListener(new View.OnClickListener() { // from class: s6.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DatePickerFragment.m10524D(this.f16557a, view2);
            }
        });
        FragmentDatePickerBinding fragmentDatePickerBinding5 = this.binding;
        if (fragmentDatePickerBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding5 = null;
        }
        fragmentDatePickerBinding5.f10518f.setOnClickListener(new View.OnClickListener() { // from class: s6.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DatePickerFragment.m10526F(this.f16593a, view2);
            }
        });
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM", Locale.CHINA);
        FragmentDatePickerBinding fragmentDatePickerBinding6 = this.binding;
        if (fragmentDatePickerBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding6 = null;
        }
        fragmentDatePickerBinding6.f10516d.setTitleFormatter(new InterfaceC5105g() { // from class: s6.h
            @Override // p020b2.InterfaceC5105g
            /* renamed from: a */
            public final CharSequence mo2164a(CalendarDay calendarDay) {
                return DatePickerFragment.m10544x(simpleDateFormat, calendarDay);
            }
        });
        FragmentDatePickerBinding fragmentDatePickerBinding7 = this.binding;
        if (fragmentDatePickerBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding7 = null;
        }
        fragmentDatePickerBinding7.f10515c.setTitleFormatter(new InterfaceC5105g() { // from class: s6.i
            @Override // p020b2.InterfaceC5105g
            /* renamed from: a */
            public final CharSequence mo2164a(CalendarDay calendarDay) {
                return DatePickerFragment.m10545y(simpleDateFormat, calendarDay);
            }
        });
        FragmentDatePickerBinding fragmentDatePickerBinding8 = this.binding;
        if (fragmentDatePickerBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding8 = null;
        }
        fragmentDatePickerBinding8.f10516d.setOnDateChangedListener(new InterfaceC0027n() { // from class: s6.j
            @Override // p003a2.InterfaceC0027n
            /* renamed from: a */
            public final void mo156a(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, boolean z9) {
                DatePickerFragment.m10546z(this.f16617a, materialCalendarView, calendarDay, z9);
            }
        });
        FragmentDatePickerBinding fragmentDatePickerBinding9 = this.binding;
        if (fragmentDatePickerBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding9 = null;
        }
        fragmentDatePickerBinding9.f10515c.setOnDateChangedListener(new InterfaceC0027n() { // from class: s6.k
            @Override // p003a2.InterfaceC0027n
            /* renamed from: a */
            public final void mo156a(MaterialCalendarView materialCalendarView, CalendarDay calendarDay, boolean z9) {
                DatePickerFragment.m10521A(this.f16623a, materialCalendarView, calendarDay, z9);
            }
        });
        FragmentDatePickerBinding fragmentDatePickerBinding10 = this.binding;
        if (fragmentDatePickerBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding10 = null;
        }
        fragmentDatePickerBinding10.f10519g.setOnClickListener(new View.OnClickListener() { // from class: s6.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DatePickerFragment.m10522B(this.f16635a, view2);
            }
        });
        FragmentDatePickerBinding fragmentDatePickerBinding11 = this.binding;
        if (fragmentDatePickerBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding11 = null;
        }
        fragmentDatePickerBinding11.f10517e.setOnClickListener(new View.OnClickListener() { // from class: s6.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DatePickerFragment.m10523C(this.f16653a, view2);
            }
        });
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zykj.student.dialogue.ui.home.DatePickerFragment.onViewCreated.12
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentKt.setFragmentResult(DatePickerFragment.this, "date_picker_result", BundleKt.bundleOf(TuplesKt.m13420to("isCanceled", Boolean.TRUE), TuplesKt.m13420to("isJoinedTime", Boolean.valueOf(DatePickerFragment.this.m10548v().getIsJoinedTime()))));
            }
        });
        m10549w().m10574m(m10548v().getStartTime());
        m10549w().m10572k(m10548v().getEndTime());
        m10549w().m10573l(m10548v().getStartDate());
        m10549w().m10571j(m10548v().getEndDate());
        FragmentDatePickerBinding fragmentDatePickerBinding12 = this.binding;
        if (fragmentDatePickerBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding12 = null;
        }
        fragmentDatePickerBinding12.f10516d.setSelectedDate(m10548v().getStartDate());
        FragmentDatePickerBinding fragmentDatePickerBinding13 = this.binding;
        if (fragmentDatePickerBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding13 = null;
        }
        fragmentDatePickerBinding13.f10516d.setCurrentDate(m10548v().getStartDate());
        FragmentDatePickerBinding fragmentDatePickerBinding14 = this.binding;
        if (fragmentDatePickerBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentDatePickerBinding14 = null;
        }
        fragmentDatePickerBinding14.f10515c.setSelectedDate(m10548v().getEndDate());
        FragmentDatePickerBinding fragmentDatePickerBinding15 = this.binding;
        if (fragmentDatePickerBinding15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentDatePickerBinding = fragmentDatePickerBinding15;
        }
        fragmentDatePickerBinding.f10515c.setCurrentDate(m10548v().getEndDate());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public final DatePickerFragmentArgs m10548v() {
        return (DatePickerFragmentArgs) this.args.getValue();
    }

    /* renamed from: w */
    public final DatePickerViewModel m10549w() {
        return (DatePickerViewModel) this.viewModel.getValue();
    }
}
