package com.zykj.evaluation.p057ui.guide;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.BaseGuideQuestion;
import com.zykj.evaluation.bean.ExamProgress;
import com.zykj.evaluation.bean.GuideTaskInfo;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.MutableStateFlow;
import p101g7.C7589e;
import p111h6.C7630a;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR+\u0010%\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u000fR+\u0010-\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&8F@DX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u00106\u001a\u00020.2\u0006\u0010/\u001a\u00020.8\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u001aR\u0011\u0010D\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, m13558d2 = {"Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;", "Lcom/zykj/evaluation/bean/BaseGuideQuestion;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/zykj/evaluation/base/BaseViewModel;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "<init>", "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "", "taskId", "", "s", "(J)V", "t", "()V", "z", "Lcom/zykj/evaluation/bean/GuideTaskInfo;", "guideTaskInfo", "B", "(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V", "Lcom/zykj/evaluation/bean/ExamProgress;", "progress", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lcom/zykj/evaluation/bean/ExamProgress;)V", "c", "Lp5/j;", "d", "Lkotlinx/coroutines/flow/MutableStateFlow;", "<set-?>", "e", "Lkotlin/properties/ReadWriteProperty;", "q", "()J", "x", "mTaskId", "Lh6/a;", "f", "Landroidx/compose/runtime/MutableState;", "o", "()Lh6/a;", "v", "(Lh6/a;)V", "leftInfoViewState", "Lg7/e;", "value", "g", "Lg7/e;", "p", "()Lg7/e;", "w", "(Lg7/e;)V", "mPathManager", "h", "Lcom/zykj/evaluation/bean/GuideTaskInfo;", "n", "()Lcom/zykj/evaluation/bean/GuideTaskInfo;", "u", "i", "Lcom/zykj/evaluation/bean/ExamProgress;", "getProgress", "()Lcom/zykj/evaluation/bean/ExamProgress;", "y", "", "r", "()I", "taskState", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBaseGuideViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/BaseGuideViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,149:1\n85#2:150\n113#2,2:151\n*S KotlinDebug\n*F\n+ 1 BaseGuideViewModel.kt\ncom/zykj/evaluation/ui/guide/BaseGuideViewModel\n*L\n48#1:150\n48#1:151,2\n*E\n"})
/* loaded from: classes4.dex */
public abstract class BaseGuideViewModel<T extends BaseGuideQuestion> extends BaseViewModel {

    /* renamed from: j */
    public static final /* synthetic */ KProperty[] f9543j = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseGuideViewModel.class, "mTaskId", "getMTaskId()J", 0))};

    /* renamed from: k */
    public static final int f9544k = 8;

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: e, reason: from kotlin metadata */
    public final ReadWriteProperty mTaskId;

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableState leftInfoViewState;

    /* renamed from: g, reason: from kotlin metadata */
    public C7589e mPathManager;

    /* renamed from: h, reason: from kotlin metadata */
    public GuideTaskInfo guideTaskInfo;

    /* renamed from: i, reason: from kotlin metadata */
    public ExamProgress progress;

    public BaseGuideViewModel(InterfaceC8843j service, MutableStateFlow userInfo) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.service = service;
        this.userInfo = userInfo;
        this.mTaskId = Delegates.INSTANCE.notNull();
        this.leftInfoViewState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C7630a(null, null, null, null, false, null, null, false, null, null, null, null, null, null, 16383, null), null, 2, null);
    }

    /* renamed from: A */
    public final void m9771A(ExamProgress progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        C7630a c7630aM9774o = m9774o();
        m9781v(c7630aM9774o.m12601a((12543 & 1) != 0 ? c7630aM9774o.f12823a : null, (12543 & 2) != 0 ? c7630aM9774o.f12824b : null, (12543 & 4) != 0 ? c7630aM9774o.f12825c : null, (12543 & 8) != 0 ? c7630aM9774o.f12826d : null, (12543 & 16) != 0 ? c7630aM9774o.f12827e : false, (12543 & 32) != 0 ? c7630aM9774o.f12828f : null, (12543 & 64) != 0 ? c7630aM9774o.f12829g : null, (12543 & 128) != 0 ? c7630aM9774o.f12830h : false, (12543 & 256) != 0 ? c7630aM9774o.f12831i : "未交作业：" + progress.getTestingCount() + "人", (12543 & 512) != 0 ? c7630aM9774o.f12832j : progress.getTestingStudents(), (12543 & 1024) != 0 ? c7630aM9774o.f12833k : "未交订正：" + progress.getRevisingCount() + "人", (12543 & 2048) != 0 ? c7630aM9774o.f12834l : progress.getRevisingStudents(), (12543 & 4096) != 0 ? c7630aM9774o.f12835m : null, (12543 & 8192) != 0 ? c7630aM9774o.f12836n : null));
    }

    /* renamed from: B */
    public final void m9772B(GuideTaskInfo guideTaskInfo) {
        String str;
        Intrinsics.checkNotNullParameter(guideTaskInfo, "guideTaskInfo");
        C7630a c7630aM9774o = m9774o();
        String examName = guideTaskInfo.getExamName();
        if (examName == null) {
            examName = "";
        }
        String gradeName = guideTaskInfo.getGradeName();
        if (gradeName == null) {
            gradeName = "";
        }
        String str2 = "年级: " + gradeName;
        String topicName = guideTaskInfo.getTopicName();
        if (topicName == null) {
            topicName = "";
        }
        String str3 = "科目: " + topicName;
        String startTime = guideTaskInfo.getStartTime();
        if (startTime == null) {
            startTime = "---- ----";
        }
        String endTime = guideTaskInfo.getEndTime();
        String str4 = startTime + " ~ " + (endTime != null ? endTime : "---- ----");
        boolean enableScore = guideTaskInfo.getEnableScore();
        String str5 = "总分：" + guideTaskInfo.getScore();
        if (guideTaskInfo.getState() >= TaskState.ToCorrect.INSTANCE.getState()) {
            str = "得分：" + guideTaskInfo.getMyScore();
        } else {
            str = "";
        }
        boolean zIsRepresentative = guideTaskInfo.isRepresentative();
        String examDescription = guideTaskInfo.getExamDescription();
        m9781v(c7630aM9774o.m12601a((12543 & 1) != 0 ? c7630aM9774o.f12823a : examName, (12543 & 2) != 0 ? c7630aM9774o.f12824b : str2, (12543 & 4) != 0 ? c7630aM9774o.f12825c : str3, (12543 & 8) != 0 ? c7630aM9774o.f12826d : str4, (12543 & 16) != 0 ? c7630aM9774o.f12827e : enableScore, (12543 & 32) != 0 ? c7630aM9774o.f12828f : str5, (12543 & 64) != 0 ? c7630aM9774o.f12829g : str, (12543 & 128) != 0 ? c7630aM9774o.f12830h : zIsRepresentative, (12543 & 256) != 0 ? c7630aM9774o.f12831i : null, (12543 & 512) != 0 ? c7630aM9774o.f12832j : null, (12543 & 1024) != 0 ? c7630aM9774o.f12833k : null, (12543 & 2048) != 0 ? c7630aM9774o.f12834l : null, (12543 & 4096) != 0 ? c7630aM9774o.f12835m : examDescription == null ? "" : examDescription, (12543 & 8192) != 0 ? c7630aM9774o.f12836n : null));
    }

    /* renamed from: n, reason: from getter */
    public final GuideTaskInfo getGuideTaskInfo() {
        return this.guideTaskInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public final C7630a m9774o() {
        return (C7630a) this.leftInfoViewState.getValue();
    }

    /* renamed from: p */
    public final C7589e m9775p() {
        C7589e c7589e = this.mPathManager;
        if (c7589e != null) {
            return c7589e;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPathManager");
        return null;
    }

    /* renamed from: q */
    public final long m9776q() {
        return ((Number) this.mTaskId.getValue(this, f9543j[0])).longValue();
    }

    /* renamed from: r */
    public final int m9777r() {
        GuideTaskInfo guideTaskInfo = this.guideTaskInfo;
        if (guideTaskInfo != null) {
            return guideTaskInfo.getState();
        }
        return -1;
    }

    /* renamed from: s */
    public void mo9778s(long taskId) {
        m9783x(taskId);
        TaskState.ToCorrect toCorrect = TaskState.ToCorrect.INSTANCE;
        Long lM10602a = ((UserInfo) this.userInfo.getValue()).m10602a();
        Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
        m9782w(new C7589e(toCorrect, lM10602a.longValue(), m9776q()));
    }

    /* renamed from: t */
    public final void m9779t() {
        BaseViewModel.m8644f(this, null, null, null, null, null, new BaseGuideViewModel$refreshSubmitProgress$1(this, null), 31, null);
    }

    /* renamed from: u */
    public final void m9780u(GuideTaskInfo guideTaskInfo) {
        this.guideTaskInfo = guideTaskInfo;
    }

    /* renamed from: v */
    public final void m9781v(C7630a c7630a) {
        Intrinsics.checkNotNullParameter(c7630a, "<set-?>");
        this.leftInfoViewState.setValue(c7630a);
    }

    /* renamed from: w */
    public final void m9782w(C7589e c7589e) {
        Intrinsics.checkNotNullParameter(c7589e, "<set-?>");
        this.mPathManager = c7589e;
    }

    /* renamed from: x */
    public final void m9783x(long j10) {
        this.mTaskId.setValue(this, f9543j[0], Long.valueOf(j10));
    }

    /* renamed from: y */
    public final void m9784y(ExamProgress examProgress) {
        this.progress = examProgress;
    }

    /* renamed from: z */
    public final void m9785z() {
        BaseViewModel.m8644f(this, null, null, null, null, null, new BaseGuideViewModel$switchCorrectAnalysisState$1(this, null), 31, null);
    }
}
