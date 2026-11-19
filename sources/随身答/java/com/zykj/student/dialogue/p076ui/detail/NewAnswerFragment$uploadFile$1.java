package com.zykj.student.dialogue.p076ui.detail;

import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.Data;
import androidx.work.WorkInfo;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$uploadFile$1", m13451f = "NewAnswerFragment.kt", m13452i = {0, 0, 1, 1}, m13453l = {277, 279}, m13454m = "invokeSuspend", m13455n = {"$this$launch", "imageUrlSet", "$this$launch", "imageUrlSet"}, m13456s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes5.dex */
public final class NewAnswerFragment$uploadFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f11099a;

    /* renamed from: b */
    public int f11100b;

    /* renamed from: c */
    public /* synthetic */ Object f11101c;

    /* renamed from: d */
    public final /* synthetic */ NewAnswerFragment f11102d;

    @Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "", "Landroidx/work/WorkInfo;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.NewAnswerFragment$uploadFile$1$2", m13451f = "NewAnswerFragment.kt", m13452i = {0, 0, 0, 0}, m13453l = {340}, m13454m = "invokeSuspend", m13455n = {"it", "workInfoList", "screenshotUrl", "contentUrl"}, m13456s = {"L$0", "L$1", "L$2", "L$3"})
    @SourceDebugExtension({"SMAP\nNewAnswerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewAnswerFragment.kt\ncom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n1869#2:401\n1788#2,4:402\n1870#2:406\n1761#2,3:407\n1788#2,4:410\n*S KotlinDebug\n*F\n+ 1 NewAnswerFragment.kt\ncom/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1$2\n*L\n286#1:401\n307#1:402,4\n286#1:406\n317#1:407,3\n323#1:410,4\n*E\n"})
    /* renamed from: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$uploadFile$1$2 */
    public static final class C75192 extends SuspendLambda implements Function2<List<? extends WorkInfo>, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public Object f11103a;

        /* renamed from: b */
        public Object f11104b;

        /* renamed from: c */
        public Object f11105c;

        /* renamed from: d */
        public int f11106d;

        /* renamed from: e */
        public /* synthetic */ Object f11107e;

        /* renamed from: f */
        public final /* synthetic */ CoroutineScope f11108f;

        /* renamed from: g */
        public final /* synthetic */ NewAnswerFragment f11109g;

        /* renamed from: h */
        public final /* synthetic */ LinkedHashSet f11110h;

        /* renamed from: com.zykj.student.dialogue.ui.detail.NewAnswerFragment$uploadFile$1$2$a */
        public static final /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f11111a;

            static {
                int[] iArr = new int[WorkInfo.State.values().length];
                try {
                    iArr[WorkInfo.State.FAILED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WorkInfo.State.CANCELLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f11111a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C75192(CoroutineScope coroutineScope, NewAnswerFragment newAnswerFragment, LinkedHashSet linkedHashSet, Continuation continuation) {
            super(2, continuation);
            this.f11108f = coroutineScope;
            this.f11109g = newAnswerFragment;
            this.f11110h = linkedHashSet;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List list, Continuation continuation) {
            return ((C75192) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C75192 c75192 = new C75192(this.f11108f, this.f11109g, this.f11110h, continuation);
            c75192.f11107e = obj;
            return c75192;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i9;
            Object next;
            Object next2;
            String str;
            String str2;
            Data outputData;
            Data outputData2;
            int i10;
            String string;
            List<WorkInfo> list = (List) this.f11107e;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f11106d;
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                if (list == null) {
                    NewAnswerFragment newAnswerFragment = this.f11109g;
                    newAnswerFragment.m10418I();
                    NewAnswerFragment.m10397e0(newAnswerFragment, null, 1, null);
                    return Boxing.boxBoolean(true);
                }
                if (list.isEmpty()) {
                    return Boxing.boxBoolean(false);
                }
                NewAnswerFragment newAnswerFragment2 = this.f11109g;
                LinkedHashSet linkedHashSet = this.f11110h;
                for (WorkInfo workInfo : list) {
                    int i12 = a.f11111a[workInfo.getState().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        newAnswerFragment2.m10418I();
                        if (workInfo.getOutputData().getInt("ERROR_KEY", 0) == ErrorCode.OSS_CLIENT_SOCKET_TIME_OUT.getErrorCodeInfo().getCode()) {
                            MaterialDialog materialDialog = newAnswerFragment2.timeoutDialog;
                            if (materialDialog == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("timeoutDialog");
                                materialDialog = null;
                            }
                            materialDialog.show();
                        } else {
                            XToastUtils xToastUtils = XToastUtils.INSTANCE;
                            String string2 = newAnswerFragment2.getString(R.string.dialogue_image_upload_fail);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            xToastUtils.error(string2);
                        }
                    } else if (i12 == 3) {
                        if (workInfo.getTags().contains("ADDED_IMAGE") && (string = workInfo.getOutputData().getString("SUCCESS_KEY")) != null) {
                            Boxing.boxBoolean(linkedHashSet.add(string));
                        }
                        if (list.isEmpty()) {
                            i10 = 0;
                        } else {
                            Iterator it = list.iterator();
                            i10 = 0;
                            while (it.hasNext()) {
                                if (((WorkInfo) it.next()).getState() == WorkInfo.State.SUCCEEDED && (i10 = i10 + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                        int size = (int) ((i10 / list.size()) * 100);
                        MaterialDialog materialDialog2 = newAnswerFragment2.uploadDialog;
                        if (materialDialog2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("uploadDialog");
                            materialDialog2 = null;
                        }
                        materialDialog2.m6686t(size);
                    }
                }
                if (!list.isEmpty()) {
                    for (WorkInfo workInfo2 : list) {
                        if (workInfo2.getState() == WorkInfo.State.FAILED || workInfo2.getState() == WorkInfo.State.CANCELLED) {
                            return Boxing.boxBoolean(true);
                        }
                    }
                }
                if (list.isEmpty()) {
                    i9 = 0;
                } else {
                    Iterator it2 = list.iterator();
                    i9 = 0;
                    while (it2.hasNext()) {
                        if (((WorkInfo) it2.next()).getState() == WorkInfo.State.SUCCEEDED && (i9 = i9 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i9 != list.size()) {
                    return Boxing.boxBoolean(false);
                }
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (((WorkInfo) next).getTags().contains("SCREENSHOT")) {
                        break;
                    }
                }
                WorkInfo workInfo3 = (WorkInfo) next;
                String string3 = (workInfo3 == null || (outputData2 = workInfo3.getOutputData()) == null) ? null : outputData2.getString("SUCCESS_KEY");
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    if (((WorkInfo) next2).getTags().contains("ZIP")) {
                        break;
                    }
                }
                WorkInfo workInfo4 = (WorkInfo) next2;
                String string4 = (workInfo4 == null || (outputData = workInfo4.getOutputData()) == null) ? null : outputData.getString("SUCCESS_KEY");
                if (string3 == null || string3.length() == 0 || string4 == null || string4.length() == 0) {
                    this.f11109g.m10418I();
                    NewAnswerFragment.m10397e0(this.f11109g, null, 1, null);
                    return Boxing.boxBoolean(true);
                }
                NewAnswerViewModel newAnswerViewModelM10383P = this.f11109g.m10383P();
                LinkedHashSet linkedHashSet2 = this.f11110h;
                this.f11107e = SpillingKt.nullOutSpilledVariable(list);
                this.f11103a = SpillingKt.nullOutSpilledVariable(list);
                this.f11104b = string3;
                this.f11105c = string4;
                this.f11106d = 1;
                if (newAnswerViewModelM10383P.m10494t(linkedHashSet2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = string3;
                str2 = string4;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = (String) this.f11105c;
                String str4 = (String) this.f11104b;
                ResultKt.throwOnFailure(obj);
                str2 = str3;
                str = str4;
            }
            if (TextUtils.isEmpty(this.f11109g.m10422M().getCourseId())) {
                this.f11109g.m10383P().m10489o(this.f11109g.m10422M().getSessionId(), str2, str);
            } else {
                this.f11109g.m10383P().m10490p(this.f11109g.m10422M().getCourseId(), str2, str, this.f11109g.m10422M().getAnswerUserIds(), this.f11109g.m10422M().getSummary());
            }
            return Boxing.boxBoolean(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewAnswerFragment$uploadFile$1(NewAnswerFragment newAnswerFragment, Continuation continuation) {
        super(2, continuation);
        this.f11102d = newAnswerFragment;
    }

    /* renamed from: c */
    public static final void m10430c(NewAnswerFragment newAnswerFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        newAnswerFragment.m10424f0();
        materialDialog.dismiss();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NewAnswerFragment$uploadFile$1 newAnswerFragment$uploadFile$1 = new NewAnswerFragment$uploadFile$1(this.f11102d, continuation);
        newAnswerFragment$uploadFile$1.f11101c = obj;
        return newAnswerFragment$uploadFile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first((kotlinx.coroutines.flow.Flow) r10, r5, r9) == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f11101c
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.f11100b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 == r5) goto L2a
            if (r2 != r4) goto L22
            java.lang.Object r0 = r9.f11099a
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            goto Lee
        L1c:
            r10 = move-exception
            goto Le4
        L1f:
            r10 = move-exception
            goto Lf1
        L22:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2a:
            java.lang.Object r2 = r9.f11099a
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            goto Lc6
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r2.<init>()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment r10 = r9.f11102d     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = new com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            android.content.Context r7 = r10.requireContext()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r6.<init>(r7)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.String r7 = "正在上传"
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = r6.m6696f(r7)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum r7 = com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum.CENTER     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = r6.m6697g(r7)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r7 = 100
            r8 = 0
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = r6.m6703m(r8, r7, r5)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = r6.m6693c(r8)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog r6 = r6.m6704n()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.String r7 = "show(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment.m10378F(r10, r6)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment r10 = r9.f11102d     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = new com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            android.content.Context r7 = r10.requireContext()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r6.<init>(r7)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.String r7 = "提示"
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = r6.m6705o(r7)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.String r7 = "网络超时，提交失败"
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = r6.m6696f(r7)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.String r7 = "重试"
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = r6.m6701k(r7)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = r6.m6693c(r5)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment r7 = r9.f11102d     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.ui.detail.m r8 = new com.zykj.student.dialogue.ui.detail.m     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r8.<init>()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g r6 = r6.m6700j(r8)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog r6 = r6.m6691a()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.String r7 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment.m10377E(r10, r6)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment r10 = r9.f11102d     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.ui.detail.viewmodel.NewAnswerViewModel r10 = com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment.m10417z(r10)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment r6 = r9.f11102d     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.view.board.board.BoardFragment r6 = com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment.m10373A(r6)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            if (r6 != 0) goto Lb5
            java.lang.String r6 = "sketchFragment"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r6 = r3
        Lb5:
            java.util.List r6 = r6.m11211t0()     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r9.f11101c = r0     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r9.f11099a = r2     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r9.f11100b = r5     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.Object r10 = r10.m10496v(r6, r9)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            if (r10 != r1) goto Lc6
            goto Le3
        Lc6:
            kotlinx.coroutines.flow.Flow r10 = (kotlinx.coroutines.flow.Flow) r10     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment$uploadFile$1$2 r5 = new com.zykj.student.dialogue.ui.detail.NewAnswerFragment$uploadFile$1$2     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment r6 = r9.f11102d     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r5.<init>(r0, r6, r2, r3)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r9.f11101c = r0     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.Object r0 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r9.f11099a = r0     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            r9.f11100b = r4     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.first(r10, r5, r9)     // Catch: java.lang.Exception -> L1c java.util.concurrent.CancellationException -> L1f
            if (r10 != r1) goto Lee
        Le3:
            return r1
        Le4:
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment r0 = r9.f11102d
            com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment.m10411t(r0)
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment r0 = r9.f11102d
            com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment.m10379G(r0, r10)
        Lee:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        Lf1:
            com.zykj.student.dialogue.ui.detail.NewAnswerFragment r0 = r9.f11102d
            com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment.m10411t(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment$uploadFile$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/detail/NewAnswerFragment$uploadFile$1.smali:179
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NewAnswerFragment$uploadFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
