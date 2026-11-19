package com.zykj.student.dialogue.p076ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.taobao.sophix.PatchStatus;
import com.zykj.student.dialogue.upload.OssTaskManger;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p314z6.AbstractC10005c;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.MainViewModel$uploadLog$1", m13451f = "MainViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/zykj/student/dialogue/ui/MainViewModel$uploadLog$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1#2:90\n295#3,2:91\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/zykj/student/dialogue/ui/MainViewModel$uploadLog$1\n*L\n56#1:91,2\n*E\n"})
/* loaded from: classes5.dex */
public final class MainViewModel$uploadLog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10592a;

    /* renamed from: b */
    public /* synthetic */ Object f10593b;

    /* renamed from: c */
    public final /* synthetic */ MainViewModel f10594c;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.MainViewModel$uploadLog$1$1", m13451f = "MainViewModel.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_AES_DECRYPT}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.MainViewModel$uploadLog$1$1 */
    public static final class C74551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10595a;

        /* renamed from: b */
        public final /* synthetic */ MainViewModel f10596b;

        /* renamed from: c */
        public final /* synthetic */ OneTimeWorkRequest f10597c;

        /* renamed from: d */
        public final /* synthetic */ File f10598d;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Landroidx/work/WorkInfo;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.MainViewModel$uploadLog$1$1$1", m13451f = "MainViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.MainViewModel$uploadLog$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WorkInfo, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10599a;

            /* renamed from: b */
            public /* synthetic */ Object f10600b;

            /* renamed from: c */
            public final /* synthetic */ File f10601c;

            /* renamed from: com.zykj.student.dialogue.ui.MainViewModel$uploadLog$1$1$1$a */
            public static final /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f10602a;

                static {
                    int[] iArr = new int[WorkInfo.State.values().length];
                    try {
                        iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[WorkInfo.State.FAILED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[WorkInfo.State.CANCELLED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f10602a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(File file, Continuation continuation) {
                super(2, continuation);
                this.f10601c = file;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(WorkInfo workInfo, Continuation continuation) {
                return ((AnonymousClass1) create(workInfo, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10601c, continuation);
                anonymousClass1.f10600b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                WorkInfo workInfo = (WorkInfo) this.f10600b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10599a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WorkInfo.State state = workInfo != null ? workInfo.getState() : null;
                int i9 = state == null ? -1 : a.f10602a[state.ordinal()];
                if (i9 == 1) {
                    LogUtils.m2956i("上传日志 -> 成功");
                    Boxing.boxBoolean(this.f10601c.delete());
                } else if (i9 == 2) {
                    LogUtils.m2956i("上传日志 -> 失败");
                } else if (i9 == 3) {
                    LogUtils.m2956i("上传日志 -> 被取消了");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C74551(MainViewModel mainViewModel, OneTimeWorkRequest oneTimeWorkRequest, File file, Continuation continuation) {
            super(2, continuation);
            this.f10596b = mainViewModel;
            this.f10597c = oneTimeWorkRequest;
            this.f10598d = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C74551(this.f10596b, this.f10597c, this.f10598d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10595a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowAsFlow = FlowLiveDataConversions.asFlow(this.f10596b.ossTaskManger.m11056d().getWorkInfoByIdLiveData(this.f10597c.getId()));
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10598d, null);
                this.f10595a = 1;
                if (FlowKt.collectLatest(flowAsFlow, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C74551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$uploadLog$1(MainViewModel mainViewModel, Continuation continuation) {
        super(2, continuation);
        this.f10594c = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainViewModel$uploadLog$1 mainViewModel$uploadLog$1 = new MainViewModel$uploadLog$1(this.f10594c, continuation);
        mainViewModel$uploadLog$1.f10593b = obj;
        return mainViewModel$uploadLog$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        CoroutineScope coroutineScope = (CoroutineScope) this.f10593b;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10592a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String nowString = TimeUtils.getNowString(TimeUtils.getSafeDateFormat("yyyy_MM_dd"));
        List<File> logFiles = LogUtils.getLogFiles();
        Intrinsics.checkNotNull(logFiles);
        CollectionsKt.sortedDescending(logFiles);
        Intrinsics.checkNotNull(logFiles);
        Iterator<T> it = logFiles.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String name = ((File) next).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            Intrinsics.checkNotNull(nowString);
            if (!StringsKt.contains$default((CharSequence) name, (CharSequence) nowString, false, 2, (Object) null)) {
                break;
            }
        }
        File file = (File) next;
        if (file == null) {
            return Unit.INSTANCE;
        }
        LogUtils.m2956i("上传日志");
        String name2 = file.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        String strSubstring = AbstractC10005c.m17366c(name2).substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strReplace$default = StringsKt.replace$default(strSubstring, "_", "", false, 4, (Object) null);
        String name3 = file.getName();
        OssTaskManger ossTaskManger = this.f10594c.ossTaskManger;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        String absolutePath2 = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C74551(this.f10594c, OssTaskManger.m11052f(ossTaskManger, absolutePath, absolutePath2, 2, new String[]{strReplace$default, name3}, null, 16, null), file, null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainViewModel$uploadLog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
