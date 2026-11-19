package com.zykj.huiwei.launcher.p035ui.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.ToastUtils;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.download.OssUtils;
import com.zykj.download.work.DownloadFileCommonWork;
import com.zykj.download.work.DownloadFileWorkProxy;
import com.zykj.huiwei.launcher.p035ui.activity.FileActivity;
import com.zykj.huiwei.launcher.p035ui.fragment.NotificationDetailFragment;
import com.zykj.lib.error.code.ErrorCodeHandler;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$downloadAndOpen$1", m7918f = "NotificationDetailFragment.kt", m7919i = {0, 0}, m7920l = {185}, m7921m = "invokeSuspend", m7922n = {"$this$launch", "file"}, m7923s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nNotificationDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,254:1\n105#2:255\n*S KotlinDebug\n*F\n+ 1 NotificationDetailFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1\n*L\n190#1:255\n*E\n"})
/* loaded from: classes4.dex */
public final class NotificationDetailFragment$downloadAndOpen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f6762a;

    /* renamed from: b */
    public int f6763b;

    /* renamed from: c */
    public /* synthetic */ Object f6764c;

    /* renamed from: d */
    public final /* synthetic */ NotificationDetailFragment f6765d;

    /* renamed from: e */
    public final /* synthetic */ String f6766e;

    /* renamed from: f */
    public final /* synthetic */ DownloadFileWorkProxy f6767f;

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$downloadAndOpen$1$1", m7918f = "NotificationDetailFragment.kt", m7919i = {}, m7920l = {186}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$downloadAndOpen$1$1 */
    public static final class C61521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* renamed from: a */
        public int f6768a;

        /* renamed from: b */
        public final /* synthetic */ DownloadFileWorkProxy f6769b;

        /* renamed from: c */
        public final /* synthetic */ String f6770c;

        /* renamed from: d */
        public final /* synthetic */ File f6771d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C61521(DownloadFileWorkProxy downloadFileWorkProxy, String str, File file, Continuation continuation) {
            super(2, continuation);
            this.f6769b = downloadFileWorkProxy;
            this.f6770c = str;
            this.f6771d = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C61521(this.f6769b, this.f6770c, this.f6771d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = this.f6768a;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            DownloadFileWorkProxy downloadFileWorkProxy = this.f6769b;
            String str = this.f6770c;
            File file = this.f6771d;
            this.f6768a = 1;
            Object objCheckDownloadSuccess = downloadFileWorkProxy.checkDownloadSuccess(str, file, this);
            return objCheckDownloadSuccess == coroutine_suspended ? coroutine_suspended : objCheckDownloadSuccess;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C61521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$downloadAndOpen$1$a */
    public static final /* synthetic */ class C6153a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6772a;

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
            f6772a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationDetailFragment$downloadAndOpen$1(NotificationDetailFragment notificationDetailFragment, String str, DownloadFileWorkProxy downloadFileWorkProxy, Continuation continuation) {
        super(2, continuation);
        this.f6765d = notificationDetailFragment;
        this.f6766e = str;
        this.f6767f = downloadFileWorkProxy;
    }

    /* renamed from: d */
    public static final void m5961d(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, DialogInterface dialogInterface) {
        workManager.cancelWorkById(oneTimeWorkRequest.getId());
    }

    /* renamed from: e */
    public static final void m5962e(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, final NotificationDetailFragment notificationDetailFragment, final String str, final DialogInterface dialogInterface) {
        workManager.getWorkInfoByIdLiveData(oneTimeWorkRequest.getId()).observe(notificationDetailFragment.getViewLifecycleOwner(), new NotificationDetailFragment.C6150b(new Function1() { // from class: com.zykj.huiwei.launcher.ui.fragment.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NotificationDetailFragment$downloadAndOpen$1.m5963f(dialogInterface, notificationDetailFragment, str, (WorkInfo) obj);
            }
        }));
    }

    /* renamed from: f */
    public static final Unit m5963f(DialogInterface dialogInterface, NotificationDetailFragment notificationDetailFragment, String str, WorkInfo workInfo) {
        WorkInfo.State state = workInfo != null ? workInfo.getState() : null;
        int i6 = state == null ? -1 : C6153a.f6772a[state.ordinal()];
        if (i6 == 1) {
            dialogInterface.dismiss();
            String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
            if (string != null) {
                FileActivity.Companion c6097a = FileActivity.INSTANCE;
                Context contextRequireContext = notificationDetailFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                c6097a.m5574a(contextRequireContext, string, str);
            }
        } else if (i6 == 2) {
            dialogInterface.dismiss();
            String message = ErrorCodeHandler.INSTANCE.getErrorCode(workInfo.getOutputData().getInt(OssUtils.ERROR_KEY, 0)).getErrorCodeInfo().getMessage();
            if (message != null) {
                Log.i("DownLoad", message);
            }
            ToastUtils.m2096r("文件下载失败，请重新尝试", new Object[0]);
        } else {
            if (workInfo == null) {
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(dialogInterface, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog");
            ((MaterialDialog) dialogInterface).m4602t(workInfo.getProgress().getInt("progress", 0));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NotificationDetailFragment$downloadAndOpen$1 notificationDetailFragment$downloadAndOpen$1 = new NotificationDetailFragment$downloadAndOpen$1(this.f6765d, this.f6766e, this.f6767f, continuation);
        notificationDetailFragment$downloadAndOpen$1.f6764c = obj;
        return notificationDetailFragment$downloadAndOpen$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        File file;
        CoroutineScope coroutineScope = (CoroutineScope) this.f6764c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.f6763b;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            File file2 = new File(this.f6765d.requireContext().getCacheDir().getAbsolutePath() + File.separator + "notification", StringsKt.substringAfterLast$default(this.f6766e, "/", (String) null, 2, (Object) null));
            CoroutineDispatcher io2 = Dispatchers.getIO();
            C61521 c61521 = new C61521(this.f6767f, this.f6766e, file2, null);
            this.f6764c = coroutineScope;
            this.f6762a = file2;
            this.f6763b = 1;
            Object objWithContext = BuildersKt.withContext(io2, c61521, this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            file = file2;
            obj = objWithContext;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) this.f6762a;
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str != null) {
            NotificationDetailFragment notificationDetailFragment = this.f6765d;
            String str2 = this.f6766e;
            FileActivity.Companion c6097a = FileActivity.INSTANCE;
            Context contextRequireContext = notificationDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            c6097a.m5574a(contextRequireContext, str, str2);
        } else {
            final String str3 = this.f6766e;
            final NotificationDetailFragment notificationDetailFragment2 = this.f6765d;
            OneTimeWorkRequest.Builder builder = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) DownloadFileCommonWork.class);
            DownloadFileCommonWork.Companion companion = DownloadFileCommonWork.INSTANCE;
            String parent = file.getParent();
            Intrinsics.checkNotNull(parent);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            final OneTimeWorkRequest oneTimeWorkRequestBuild = builder.setInputData(companion.m5009a(str3, parent, name)).build();
            WorkManager.Companion companion2 = WorkManager.INSTANCE;
            Context contextRequireContext2 = notificationDetailFragment2.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            final WorkManager companion3 = companion2.getInstance(contextRequireContext2);
            companion3.enqueue(oneTimeWorkRequestBuild);
            new MaterialDialog.C5891g(notificationDetailFragment2.requireContext()).m4610d("下载中").m4611e(GravityEnum.CENTER).m4616j(false, 100, true).m4608b(new DialogInterface.OnCancelListener() { // from class: com.zykj.huiwei.launcher.ui.fragment.b
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    NotificationDetailFragment$downloadAndOpen$1.m5961d(companion3, oneTimeWorkRequestBuild, dialogInterface);
                }
            }).m4614h("取消").m4619m(new DialogInterface.OnShowListener() { // from class: com.zykj.huiwei.launcher.ui.fragment.c
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    NotificationDetailFragment$downloadAndOpen$1.m5962e(companion3, oneTimeWorkRequestBuild, notificationDetailFragment2, str3, dialogInterface);
                }
            }).m4618l();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NotificationDetailFragment$downloadAndOpen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
