package com.zykj.study.p065ui.home.find;

import android.content.Context;
import android.content.DialogInterface;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
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
import com.zykj.study.p065ui.home.find.MicroCodeFragment;
import com.zykj.study.viewmodels.OssTokenViewModel;
import java.util.UUID;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p113g8.AbstractC8687z;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.MicroCodeFragment$uploadMicro$1", m17801f = "MicroCodeFragment.kt", m17802l = {152}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroCodeFragment$uploadMicro$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12641a;

    /* renamed from: b */
    public /* synthetic */ Object f12642b;

    /* renamed from: c */
    public final /* synthetic */ MicroCodeFragment f12643c;

    /* renamed from: d */
    public final /* synthetic */ String f12644d;

    /* renamed from: e */
    public final /* synthetic */ String f12645e;

    /* renamed from: com.zykj.study.ui.home.find.MicroCodeFragment$uploadMicro$1$a */
    public static final /* synthetic */ class C7945a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12646a;

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
            f12646a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroCodeFragment$uploadMicro$1(MicroCodeFragment microCodeFragment, String str, String str2, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12643c = microCodeFragment;
        this.f12644d = str;
        this.f12645e = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m11093l(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, DialogInterface dialogInterface) {
        workManager.cancelWorkById(oneTimeWorkRequest.getId());
    }

    /* renamed from: m */
    public static final void m11094m(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, final MicroCodeFragment microCodeFragment, final String str, final OssData ossData, final String str2, final DialogInterface dialogInterface) {
        workManager.getWorkInfoByIdLiveData(oneTimeWorkRequest.getId()).observe(microCodeFragment.getViewLifecycleOwner(), new MicroCodeFragment.C7939a(new InterfaceC10570l() { // from class: com.zykj.study.ui.home.find.g
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroCodeFragment$uploadMicro$1.m11095n(dialogInterface, microCodeFragment, str, ossData, str2, (WorkInfo) obj);
            }
        }));
    }

    /* renamed from: n */
    public static final C8736p m11095n(DialogInterface dialogInterface, MicroCodeFragment microCodeFragment, String str, OssData ossData, String str2, WorkInfo workInfo) {
        WorkInfo.State state = workInfo != null ? workInfo.getState() : null;
        int i10 = state == null ? -1 : C7945a.f12646a[state.ordinal()];
        if (i10 == 1) {
            dialogInterface.dismiss();
            String string = workInfo.getOutputData().getString(OssUtils.SUCCESS_KEY);
            if (string != null) {
                microCodeFragment.m11066D(str, string, ossData, str2);
            }
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
        MicroCodeFragment$uploadMicro$1 microCodeFragment$uploadMicro$1 = new MicroCodeFragment$uploadMicro$1(this.f12643c, this.f12644d, this.f12645e, interfaceC9324c);
        microCodeFragment$uploadMicro$1.f12642b = obj;
        return microCodeFragment$uploadMicro$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroCodeFragment$uploadMicro$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM12237b;
        InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f12642b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f12641a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            OssTokenViewModel ossTokenViewModelM11081v = this.f12643c.m11081v();
            OssFileType.Folder folder = OssFileType.Folder.INSTANCE;
            OssFileResource.Resource resource = OssFileResource.Resource.INSTANCE;
            this.f12642b = interfaceC8822b0;
            this.f12641a = 1;
            objM12237b = OssTokenViewModel.m12237b(ossTokenViewModelM11081v, folder, null, resource, null, null, 0L, this, 58, null);
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
        final OssData ossData = (OssData) objM12237b;
        if (ossData == null) {
            AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.lost_oss_token_please_wait);
            return C8736p.f16368a;
        }
        String string = UUID.randomUUID().toString();
        AbstractC9133u.m16132f(string, "toString(...)");
        final String str = AbstractC8687z.m14101I(string, "-", "", false, 4, null) + "_6";
        final OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UploadFileOssWork.class).setInputData(UploadFileOssWork.Companion.m9203a(this.f12644d, ossData.getObjectKey() + "/" + str + ".zip", ossData.getOssToken())).build();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = this.f12643c.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        final WorkManager companion2 = companion.getInstance(contextRequireContext);
        companion2.enqueue(oneTimeWorkRequestBuild);
        MaterialDialog.C6913g c6913gM6743d = new MaterialDialog.C6913g(this.f12643c.requireContext()).m6749j(this.f12643c.getString(R$string.upload_micro)).m6750k(GravityEnum.CENTER).m6732C(false, 100, true).m6743d(new DialogInterface.OnCancelListener() { // from class: com.zykj.study.ui.home.find.e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                MicroCodeFragment$uploadMicro$1.m11093l(companion2, oneTimeWorkRequestBuild, dialogInterface);
            }
        });
        final MicroCodeFragment microCodeFragment = this.f12643c;
        final String str2 = this.f12645e;
        c6913gM6743d.m6735F(new DialogInterface.OnShowListener() { // from class: com.zykj.study.ui.home.find.f
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                MicroCodeFragment$uploadMicro$1.m11094m(companion2, oneTimeWorkRequestBuild, microCodeFragment, str2, ossData, str, dialogInterface);
            }
        }).m6759t(R$string.cancel).m6734E();
        return C8736p.f16368a;
    }
}
