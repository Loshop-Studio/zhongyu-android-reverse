package com.zykj.study.p065ui.home.exercise.train;

import android.content.Context;
import android.content.DialogInterface;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.blankj.utilcode.util.AbstractC5371k;
import com.tencent.smtt.sdk.TbsListener;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.download.OssUtils;
import com.zykj.download.work.UploadFileOssWork;
import com.zykj.lib.error.code.ErrorCodeHandler;
import com.zykj.study.R$string;
import com.zykj.study.bean.OssData;
import com.zykj.study.bean.OssFileResource;
import com.zykj.study.bean.OssFileType;
import com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment;
import com.zykj.study.viewmodels.OssTokenViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$uploadMicroThumbnail$1", m17801f = "AnswerResultFragment.kt", m17802l = {TbsListener.ErrorCode.UNZIP_DIR_ERROR}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AnswerResultFragment$uploadMicroThumbnail$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f12238a;

    /* renamed from: b */
    public int f12239b;

    /* renamed from: c */
    public /* synthetic */ Object f12240c;

    /* renamed from: d */
    public final /* synthetic */ String f12241d;

    /* renamed from: e */
    public final /* synthetic */ AnswerResultFragment f12242e;

    /* renamed from: f */
    public final /* synthetic */ boolean f12243f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC10559a f12244g;

    /* renamed from: com.zykj.study.ui.home.exercise.train.AnswerResultFragment$uploadMicroThumbnail$1$a */
    public static final /* synthetic */ class C7863a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12245a;

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
            f12245a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerResultFragment$uploadMicroThumbnail$1(String str, AnswerResultFragment answerResultFragment, boolean z10, InterfaceC10559a interfaceC10559a, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12241d = str;
        this.f12242e = answerResultFragment;
        this.f12243f = z10;
        this.f12244g = interfaceC10559a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m10858l(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, DialogInterface dialogInterface) {
        workManager.cancelWorkById(oneTimeWorkRequest.getId());
    }

    /* renamed from: m */
    public static final void m10859m(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, final AnswerResultFragment answerResultFragment, final boolean z10, final InterfaceC10559a interfaceC10559a, final DialogInterface dialogInterface) {
        workManager.getWorkInfoByIdLiveData(oneTimeWorkRequest.getId()).observe(answerResultFragment.getViewLifecycleOwner(), new AnswerResultFragment.C7860b(new InterfaceC10570l() { // from class: com.zykj.study.ui.home.exercise.train.g
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return AnswerResultFragment$uploadMicroThumbnail$1.m10860n(answerResultFragment, z10, interfaceC10559a, dialogInterface, (WorkInfo) obj);
            }
        }));
    }

    /* renamed from: n */
    public static final C8736p m10860n(AnswerResultFragment answerResultFragment, boolean z10, InterfaceC10559a interfaceC10559a, DialogInterface dialogInterface, WorkInfo workInfo) {
        WorkInfo.State state = workInfo != null ? workInfo.getState() : null;
        int i10 = state == null ? -1 : C7863a.f12245a[state.ordinal()];
        if (i10 == 1) {
            String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
            if (string == null) {
                string = "";
            }
            answerResultFragment.m10849x(string, z10, interfaceC10559a);
            dialogInterface.dismiss();
        } else if (i10 == 2) {
            Integer messageResId = ErrorCodeHandler.INSTANCE.getErrorCode(workInfo.getOutputData().getInt(OssUtils.ERROR_KEY, 0)).getErrorCodeInfo().getMessageResId();
            if (messageResId != null) {
                AbstractC8366o.m13651c(XToastUtils.INSTANCE, messageResId.intValue());
            }
        } else {
            if (workInfo == null) {
                return C8736p.f16368a;
            }
            AbstractC9133u.m16131e(dialogInterface, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog");
            ((MaterialDialog) dialogInterface).m6725t(workInfo.getProgress().getInt("progress", 0));
        }
        return C8736p.f16368a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        AnswerResultFragment$uploadMicroThumbnail$1 answerResultFragment$uploadMicroThumbnail$1 = new AnswerResultFragment$uploadMicroThumbnail$1(this.f12241d, this.f12242e, this.f12243f, this.f12244g, interfaceC9324c);
        answerResultFragment$uploadMicroThumbnail$1.f12240c = obj;
        return answerResultFragment$uploadMicroThumbnail$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((AnswerResultFragment$uploadMicroThumbnail$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM12237b;
        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f12240c;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f12239b;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            String str = this.f12241d;
            if (str == null) {
                XToastUtils xToastUtils = XToastUtils.INSTANCE;
                String string = this.f12242e.getString(R$string.not_find_micro_thumbnail);
                AbstractC9133u.m16132f(string, "getString(...)");
                AbstractC8366o.m13652d(xToastUtils, string);
                return C8736p.f16368a;
            }
            String strM2526h = AbstractC5371k.m2526h(str);
            OssFileResource.Resource resource = OssFileResource.Resource.INSTANCE;
            this.f12240c = interfaceC8822b0;
            this.f12238a = AbstractC9543h.m17814a(strM2526h);
            this.f12239b = 1;
            objM12237b = OssTokenViewModel.m12237b(this.f12242e.m10820B(), OssFileType.File.INSTANCE, "." + strM2526h, resource, null, null, 0L, this, 56, null);
            if (objM12237b == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            objM12237b = obj;
        }
        OssData ossData = (OssData) objM12237b;
        if (ossData == null) {
            AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.lost_oss_token_please_wait);
            return C8736p.f16368a;
        }
        final OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UploadFileOssWork.class).setInputData(UploadFileOssWork.Companion.m9203a(this.f12241d, ossData.getObjectKey(), ossData.getOssToken())).build();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = this.f12242e.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        final WorkManager companion2 = companion.getInstance(contextRequireContext);
        companion2.enqueue(oneTimeWorkRequestBuild);
        MaterialDialog.C6913g c6913gM6743d = new MaterialDialog.C6913g(this.f12242e.requireContext()).m6749j(this.f12242e.getString(R$string.upload_micro_thumbnail)).m6750k(GravityEnum.CENTER).m6732C(false, 100, true).m6743d(new DialogInterface.OnCancelListener() { // from class: com.zykj.study.ui.home.exercise.train.e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AnswerResultFragment$uploadMicroThumbnail$1.m10858l(companion2, oneTimeWorkRequestBuild, dialogInterface);
            }
        });
        final AnswerResultFragment answerResultFragment = this.f12242e;
        final boolean z10 = this.f12243f;
        final InterfaceC10559a interfaceC10559a = this.f12244g;
        c6913gM6743d.m6735F(new DialogInterface.OnShowListener() { // from class: com.zykj.study.ui.home.exercise.train.f
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AnswerResultFragment$uploadMicroThumbnail$1.m10859m(companion2, oneTimeWorkRequestBuild, answerResultFragment, z10, interfaceC10559a, dialogInterface);
            }
        }).m6759t(R$string.cancel).m6734E();
        return C8736p.f16368a;
    }
}
