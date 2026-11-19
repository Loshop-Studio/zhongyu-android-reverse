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
import com.zykj.study.p065ui.home.find.MicroCodeFragment;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p086e5.C8362k;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.MicroCodeFragment$uploadMicroThumbnail$1", m17801f = "MicroCodeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroCodeFragment$uploadMicroThumbnail$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12647a;

    /* renamed from: b */
    public /* synthetic */ Object f12648b;

    /* renamed from: c */
    public final /* synthetic */ String f12649c;

    /* renamed from: d */
    public final /* synthetic */ OssData f12650d;

    /* renamed from: e */
    public final /* synthetic */ String f12651e;

    /* renamed from: f */
    public final /* synthetic */ MicroCodeFragment f12652f;

    /* renamed from: g */
    public final /* synthetic */ String f12653g;

    /* renamed from: com.zykj.study.ui.home.find.MicroCodeFragment$uploadMicroThumbnail$1$a */
    public static final /* synthetic */ class C7946a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12654a;

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
            f12654a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroCodeFragment$uploadMicroThumbnail$1(String str, OssData ossData, String str2, MicroCodeFragment microCodeFragment, String str3, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12649c = str;
        this.f12650d = ossData;
        this.f12651e = str2;
        this.f12652f = microCodeFragment;
        this.f12653g = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m11099l(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, DialogInterface dialogInterface) {
        workManager.cancelWorkById(oneTimeWorkRequest.getId());
    }

    /* renamed from: m */
    public static final void m11100m(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, final MicroCodeFragment microCodeFragment, final String str, final DialogInterface dialogInterface) {
        workManager.getWorkInfoByIdLiveData(oneTimeWorkRequest.getId()).observe(microCodeFragment.getViewLifecycleOwner(), new MicroCodeFragment.C7939a(new InterfaceC10570l() { // from class: com.zykj.study.ui.home.find.j
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroCodeFragment$uploadMicroThumbnail$1.m11101n(dialogInterface, microCodeFragment, str, (WorkInfo) obj);
            }
        }));
    }

    /* renamed from: n */
    public static final C8736p m11101n(DialogInterface dialogInterface, MicroCodeFragment microCodeFragment, String str, WorkInfo workInfo) {
        WorkInfo.State state = workInfo != null ? workInfo.getState() : null;
        int i10 = state == null ? -1 : C7946a.f12654a[state.ordinal()];
        if (i10 == 1) {
            dialogInterface.dismiss();
            microCodeFragment.m11079s(str);
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
        MicroCodeFragment$uploadMicroThumbnail$1 microCodeFragment$uploadMicroThumbnail$1 = new MicroCodeFragment$uploadMicroThumbnail$1(this.f12649c, this.f12650d, this.f12651e, this.f12652f, this.f12653g, interfaceC9324c);
        microCodeFragment$uploadMicroThumbnail$1.f12648b = obj;
        return microCodeFragment$uploadMicroThumbnail$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroCodeFragment$uploadMicroThumbnail$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f12647a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        String strM13641c = new C8362k(this.f12649c, null).m13641c();
        if (strM13641c == null) {
            MicroCodeFragment microCodeFragment = this.f12652f;
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = microCodeFragment.getString(R$string.not_find_micro_thumbnail);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
            return C8736p.f16368a;
        }
        final OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UploadFileOssWork.class).setInputData(UploadFileOssWork.Companion.m9203a(strM13641c, this.f12650d.getObjectKey() + "/" + this.f12651e + ".jpg", this.f12650d.getOssToken())).build();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = this.f12652f.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        final WorkManager companion2 = companion.getInstance(contextRequireContext);
        companion2.enqueue(oneTimeWorkRequestBuild);
        MaterialDialog.C6913g c6913gM6743d = new MaterialDialog.C6913g(this.f12652f.requireContext()).m6749j(this.f12652f.getString(R$string.upload_micro_thumbnail)).m6750k(GravityEnum.CENTER).m6732C(false, 100, true).m6743d(new DialogInterface.OnCancelListener() { // from class: com.zykj.study.ui.home.find.h
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                MicroCodeFragment$uploadMicroThumbnail$1.m11099l(companion2, oneTimeWorkRequestBuild, dialogInterface);
            }
        });
        final MicroCodeFragment microCodeFragment2 = this.f12652f;
        final String str = this.f12653g;
        c6913gM6743d.m6735F(new DialogInterface.OnShowListener() { // from class: com.zykj.study.ui.home.find.i
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                MicroCodeFragment$uploadMicroThumbnail$1.m11100m(companion2, oneTimeWorkRequestBuild, microCodeFragment2, str, dialogInterface);
            }
        }).m6759t(R$string.cancel).m6734E();
        return C8736p.f16368a;
    }
}
