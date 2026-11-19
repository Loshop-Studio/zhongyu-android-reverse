package com.zykj.evaluation.p057ui.sketch;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.TaskState;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p037c7.C5150k;
import p101g7.C7589e;
import p200p5.InterfaceC8843j;
import p302z1.AbstractC9972a;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R+\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R+\u0010/\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m13558d2 = {"Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;", "Lcom/zykj/evaluation/base/BaseViewModel;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "<init>", "(Lp5/j;)V", "", "examId", "questionId", "", "url", "", "t", "(JJLjava/lang/String;)V", "p", "(Ljava/lang/String;)V", "", "readProgress", "Lkotlin/Function0;", "onComplete", "w", "(Ljava/lang/Float;Lkotlin/jvm/functions/Function0;)V", "c", "Lp5/j;", "<set-?>", "d", "Lkotlin/properties/ReadWriteProperty;", "q", "()J", "u", "(J)V", "mExamId", "e", "r", "v", "mQuestionId", "Lg7/e;", "f", "Lg7/e;", "mPathManager", "Lc7/k;", "g", "Landroidx/compose/runtime/MutableState;", "s", "()Lc7/k;", "y", "(Lc7/k;)V", "sketchPlayUIState", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSketchPlayViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SketchPlayViewModel.kt\ncom/zykj/evaluation/ui/sketch/SketchPlayViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,129:1\n85#2:130\n113#2,2:131\n*S KotlinDebug\n*F\n+ 1 SketchPlayViewModel.kt\ncom/zykj/evaluation/ui/sketch/SketchPlayViewModel\n*L\n38#1:130\n38#1:131,2\n*E\n"})
/* loaded from: classes4.dex */
public final class SketchPlayViewModel extends BaseViewModel {

    /* renamed from: h */
    public static final /* synthetic */ KProperty[] f10169h = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SketchPlayViewModel.class, "mExamId", "getMExamId()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SketchPlayViewModel.class, "mQuestionId", "getMQuestionId()J", 0))};

    /* renamed from: i */
    public static final int f10170i = 8;

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: d, reason: from kotlin metadata */
    public final ReadWriteProperty mExamId;

    /* renamed from: e, reason: from kotlin metadata */
    public final ReadWriteProperty mQuestionId;

    /* renamed from: f, reason: from kotlin metadata */
    public C7589e mPathManager;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableState sketchPlayUIState;

    public SketchPlayViewModel(InterfaceC8843j service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        Delegates delegates = Delegates.INSTANCE;
        this.mExamId = delegates.notNull();
        this.mQuestionId = delegates.notNull();
        this.sketchPlayUIState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C5150k(null, 1, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final long m10416q() {
        return ((Number) this.mExamId.getValue(this, f10169h[0])).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final long m10417r() {
        return ((Number) this.mQuestionId.getValue(this, f10169h[1])).longValue();
    }

    /* renamed from: u */
    private final void m10418u(long j10) {
        this.mExamId.setValue(this, f10169h[0], Long.valueOf(j10));
    }

    /* renamed from: v */
    private final void m10419v(long j10) {
        this.mQuestionId.setValue(this, f10169h[1], Long.valueOf(j10));
    }

    /* renamed from: x */
    public static /* synthetic */ void m10420x(SketchPlayViewModel sketchPlayViewModel, Float f10, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = null;
        }
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        sketchPlayViewModel.m10424w(f10, function0);
    }

    /* renamed from: p */
    public final void m10421p(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C7589e c7589e = this.mPathManager;
        if (c7589e == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPathManager");
            c7589e = null;
        }
        File file = new File(c7589e.m12471r(url));
        String parent = file.getParent();
        Intrinsics.checkNotNull(parent);
        new C6327a.a(url, parent, file.getName() + ".zip").m4409c(true).m4407a().m4391k(new AbstractC9972a() { // from class: com.zykj.evaluation.ui.sketch.SketchPlayViewModel$downloadSketch$1
            @Override // p207q1.InterfaceC8876a
            /* renamed from: h */
            public void mo10426h(C6327a task) {
                Intrinsics.checkNotNullParameter(task, "task");
                this.f10176a.m8653k();
            }

            @Override // p207q1.InterfaceC8876a
            /* renamed from: k */
            public void mo10427k(C6327a task, EndCause cause, Exception exc) {
                Intrinsics.checkNotNullParameter(task, "task");
                Intrinsics.checkNotNullParameter(cause, "cause");
                File fileM4392l = task.m4392l();
                if (cause == EndCause.COMPLETED && fileM4392l != null) {
                    BaseViewModel.m8644f(this.f10176a, null, null, new SketchPlayViewModel$downloadSketch$1$taskEnd$1(null), new SketchPlayViewModel$downloadSketch$1$taskEnd$2(this.f10176a, null), null, new SketchPlayViewModel$downloadSketch$1$taskEnd$3(this.f10176a, fileM4392l, null), 19, null);
                } else {
                    XToastUtils.INSTANCE.error("微课下载失败");
                    this.f10176a.m8646c();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public final C5150k m10422s() {
        return (C5150k) this.sketchPlayUIState.getValue();
    }

    /* renamed from: t */
    public final void m10423t(long examId, long questionId, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        m10418u(examId);
        m10419v(questionId);
        m10419v(questionId);
        this.mPathManager = new C7589e(TaskState.Done.INSTANCE, 0L, 0L);
        m10421p(url);
    }

    /* renamed from: w */
    public final void m10424w(Float readProgress, Function0 onComplete) {
        BaseViewModel.m8644f(this, null, null, new SketchPlayViewModel$setMicroClassRead$1(null), new SketchPlayViewModel$setMicroClassRead$2(onComplete, null), null, new SketchPlayViewModel$setMicroClassRead$3(this, readProgress, null), 19, null);
    }

    /* renamed from: y */
    public final void m10425y(C5150k c5150k) {
        Intrinsics.checkNotNullParameter(c5150k, "<set-?>");
        this.sketchPlayUIState.setValue(c5150k);
    }
}
