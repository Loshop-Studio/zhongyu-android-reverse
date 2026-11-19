package com.zykj.study.p065ui.home.exercise;

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
import com.zykj.study.p065ui.home.exercise.MicroEditFragment;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.MicroEditFragment$uploadMicroThumbnail$1", m17801f = "MicroEditFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MicroEditFragment$uploadMicroThumbnail$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12078a;

    /* renamed from: b */
    public /* synthetic */ Object f12079b;

    /* renamed from: c */
    public final /* synthetic */ String f12080c;

    /* renamed from: d */
    public final /* synthetic */ OssData f12081d;

    /* renamed from: e */
    public final /* synthetic */ String f12082e;

    /* renamed from: f */
    public final /* synthetic */ MicroEditFragment f12083f;

    /* renamed from: g */
    public final /* synthetic */ String f12084g;

    /* renamed from: com.zykj.study.ui.home.exercise.MicroEditFragment$uploadMicroThumbnail$1$a */
    public static final /* synthetic */ class C7839a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12085a;

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
            f12085a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroEditFragment$uploadMicroThumbnail$1(String str, OssData ossData, String str2, MicroEditFragment microEditFragment, String str3, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12080c = str;
        this.f12081d = ossData;
        this.f12082e = str2;
        this.f12083f = microEditFragment;
        this.f12084g = str3;
    }

    /* renamed from: l */
    public static final void m10770l(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, DialogInterface dialogInterface) {
        workManager.cancelWorkById(oneTimeWorkRequest.getId());
    }

    /* renamed from: m */
    public static final void m10771m(WorkManager workManager, OneTimeWorkRequest oneTimeWorkRequest, final MicroEditFragment microEditFragment, final String str, final DialogInterface dialogInterface) {
        workManager.getWorkInfoByIdLiveData(oneTimeWorkRequest.getId()).observe(microEditFragment.getViewLifecycleOwner(), new MicroEditFragment.C7833c(new InterfaceC10570l() { // from class: com.zykj.study.ui.home.exercise.h
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MicroEditFragment$uploadMicroThumbnail$1.m10772n(microEditFragment, str, dialogInterface, (WorkInfo) obj);
            }
        }));
    }

    /* renamed from: n */
    public static final C8736p m10772n(MicroEditFragment microEditFragment, String str, DialogInterface dialogInterface, WorkInfo workInfo) {
        WorkInfo.State state = workInfo != null ? workInfo.getState() : null;
        int i10 = state == null ? -1 : C7839a.f12085a[state.ordinal()];
        if (i10 == 1) {
            microEditFragment.m10763y(str);
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
        MicroEditFragment$uploadMicroThumbnail$1 microEditFragment$uploadMicroThumbnail$1 = new MicroEditFragment$uploadMicroThumbnail$1(this.f12080c, this.f12081d, this.f12082e, this.f12083f, this.f12084g, interfaceC9324c);
        microEditFragment$uploadMicroThumbnail$1.f12079b = obj;
        return microEditFragment$uploadMicroThumbnail$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MicroEditFragment$uploadMicroThumbnail$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f12078a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        String strM13641c = new C8362k(this.f12080c, null).m13641c();
        if (strM13641c == null) {
            MicroEditFragment microEditFragment = this.f12083f;
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = microEditFragment.getString(R$string.not_find_micro_thumbnail);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
            return C8736p.f16368a;
        }
        final OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) UploadFileOssWork.class).setInputData(UploadFileOssWork.Companion.m9203a(strM13641c, this.f12081d.getObjectKey() + "/" + this.f12082e + ".jpg", this.f12081d.getOssToken())).build();
        WorkManager.Companion companion = WorkManager.Companion;
        Context contextRequireContext = this.f12083f.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        final WorkManager companion2 = companion.getInstance(contextRequireContext);
        companion2.enqueue(oneTimeWorkRequestBuild);
        MaterialDialog.C6913g c6913gM6743d = new MaterialDialog.C6913g(this.f12083f.requireContext()).m6749j(this.f12083f.getString(R$string.upload_micro_thumbnail)).m6750k(GravityEnum.CENTER).m6732C(false, 100, true).m6743d(new DialogInterface.OnCancelListener() { // from class: com.zykj.study.ui.home.exercise.f
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                MicroEditFragment$uploadMicroThumbnail$1.m10770l(companion2, oneTimeWorkRequestBuild, dialogInterface);
            }
        });
        final MicroEditFragment microEditFragment2 = this.f12083f;
        final String str = this.f12084g;
        c6913gM6743d.m6735F(new DialogInterface.OnShowListener() { // from class: com.zykj.study.ui.home.exercise.g
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                MicroEditFragment$uploadMicroThumbnail$1.m10771m(companion2, oneTimeWorkRequestBuild, microEditFragment2, str, dialogInterface);
            }
        }).m6759t(R$string.cancel).m6734E();
        return C8736p.f16368a;
    }
}
