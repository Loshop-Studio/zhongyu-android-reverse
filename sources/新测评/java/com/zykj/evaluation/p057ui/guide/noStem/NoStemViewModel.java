package com.zykj.evaluation.p057ui.guide.noStem;

import androidx.collection.ArrayMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.zykj.evaluation.base.AbstractC6856a;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.GuideNoStemQuestion;
import com.zykj.evaluation.bean.GuideTaskInfo;
import com.zykj.evaluation.bean.TaskState;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p057ui.guide.BaseGuideViewModel;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.evaluation.upload.OssTaskManger;
import com.zykj.message.server.bean.UserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p101g7.C7589e;
import p122i6.C7670b;
import p122i6.C7690l;
import p122i6.C7697o0;
import p200p5.InterfaceC8843j;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010$\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J#\u0010.\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020)¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0019¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0010¢\u0006\u0004\b5\u0010\u0012J\u0015\u00106\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR+\u0010J\u001a\u00020B2\u0006\u0010C\u001a\u00020B8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR&\u0010N\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001b0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190O0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010;R#\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190O0Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U¨\u0006W"}, m13558d2 = {"Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;", "Lcom/zykj/evaluation/ui/guide/BaseGuideViewModel;", "Lcom/zykj/evaluation/bean/GuideNoStemQuestion;", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "Lcom/zykj/evaluation/upload/OssTaskManger;", "ossTaskManger", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "<init>", "(Lp5/j;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/submit/SubmitTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V", "", "U", "()V", "Lcom/zykj/evaluation/bean/GuideTaskInfo;", "guideTaskInfo", "e0", "(Lcom/zykj/evaluation/bean/GuideTaskInfo;)V", ExifInterface.GPS_DIRECTION_TRUE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uuid", "", "answers", "d0", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "userId", "taskId", "", "state", "X", "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "(J)V", "questionId", "", "isAskForHelp", "Y", "(JZ)V", "localAnswer", "c0", "(Ljava/lang/String;Ljava/util/List;)V", ExifInterface.LONGITUDE_WEST, "()Z", "localPath", "f0", "(Ljava/lang/String;Ljava/lang/String;)V", "a0", "b0", "(Ljava/lang/String;)V", "l", "Lp5/j;", "m", "Lkotlinx/coroutines/flow/MutableStateFlow;", "n", "Lcom/zykj/evaluation/upload/OssTaskManger;", "o", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "p", "Lcom/zykj/evaluation/di/AppDatabase;", "Li6/o0;", "<set-?>", "q", "Landroidx/compose/runtime/MutableState;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "()Li6/o0;", "Z", "(Li6/o0;)V", "noStemViewState", "Landroidx/collection/ArrayMap;", "r", "Landroidx/collection/ArrayMap;", "localAnswerMap", "", "_failedUuid", "Lkotlinx/coroutines/flow/StateFlow;", "t", "Lkotlinx/coroutines/flow/StateFlow;", ExifInterface.LATITUDE_SOUTH, "()Lkotlinx/coroutines/flow/StateFlow;", "failedUuidStateFlow", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nNoStemViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoStemViewModel.kt\ncom/zykj/evaluation/ui/guide/noStem/NoStemViewModel\n+ 2 ArrayMap.jvm.kt\nandroidx/collection/ArrayMapKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,336:1\n27#2:337\n85#3:338\n113#3,2:339\n1563#4:341\n1634#4,2:342\n1563#4:344\n1634#4,3:345\n1636#4:348\n1740#4,2:349\n1740#4,2:351\n1740#4,3:353\n1742#4:356\n1742#4:357\n774#4:363\n865#4,2:364\n1563#4:366\n1634#4,3:367\n230#5,5:358\n*S KotlinDebug\n*F\n+ 1 NoStemViewModel.kt\ncom/zykj/evaluation/ui/guide/noStem/NoStemViewModel\n*L\n73#1:337\n69#1:338\n69#1:339,2\n165#1:341\n165#1:342,2\n167#1:344\n167#1:345,3\n165#1:348\n185#1:349,2\n186#1:351,2\n187#1:353,3\n186#1:356\n185#1:357\n330#1:363\n330#1:364,2\n334#1:366\n334#1:367,3\n242#1:358,5\n*E\n"})
/* loaded from: classes4.dex */
public final class NoStemViewModel extends BaseGuideViewModel<GuideNoStemQuestion> {

    /* renamed from: l, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableStateFlow userInfo;

    /* renamed from: n, reason: from kotlin metadata */
    public final OssTaskManger ossTaskManger;

    /* renamed from: o, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* renamed from: p, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: q, reason: from kotlin metadata */
    public final MutableState noStemViewState;

    /* renamed from: r, reason: from kotlin metadata */
    public final ArrayMap localAnswerMap;

    /* renamed from: s, reason: from kotlin metadata */
    public final MutableStateFlow _failedUuid;

    /* renamed from: t, reason: from kotlin metadata */
    public final StateFlow failedUuidStateFlow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoStemViewModel(InterfaceC8843j service, MutableStateFlow userInfo, OssTaskManger ossTaskManger, SubmitTaskManger submitTaskManger, AppDatabase database) {
        super(service, userInfo);
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Intrinsics.checkNotNullParameter(ossTaskManger, "ossTaskManger");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        Intrinsics.checkNotNullParameter(database, "database");
        this.service = service;
        this.userInfo = userInfo;
        this.ossTaskManger = ossTaskManger;
        this.submitTaskManger = submitTaskManger;
        this.database = database;
        this.noStemViewState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new C7697o0(null, 1, null), null, 2, null);
        this.localAnswerMap = new ArrayMap();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._failedUuid = MutableStateFlow;
        this.failedUuidStateFlow = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public final Object m9823T(Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new NoStemViewModel$getLocalAnswerMap$2(this, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public final Object m9824d0(String str, List list, Continuation continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new NoStemViewModel$updateLocalAnswerMap$2(this, str, list, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* renamed from: S, reason: from getter */
    public final StateFlow getFailedUuidStateFlow() {
        return this.failedUuidStateFlow;
    }

    /* renamed from: U */
    public final void m9826U() {
        BaseViewModel.m8644f(this, null, null, null, null, null, new NoStemViewModel$getNoQstExamTask$1(this, null), 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V */
    public final C7697o0 m9827V() {
        return (C7697o0) this.noStemViewState.getValue();
    }

    /* renamed from: W */
    public final boolean m9828W() {
        List listM12880b = m9827V().m12880b();
        if (listM12880b != null && listM12880b.isEmpty()) {
            return true;
        }
        Iterator it = listM12880b.iterator();
        while (it.hasNext()) {
            List<C7690l> listM12811e = ((C7670b) it.next()).m12811e();
            if (listM12811e == null || !listM12811e.isEmpty()) {
                for (C7690l c7690l : listM12811e) {
                    if (c7690l.m12871d().isEmpty()) {
                        return false;
                    }
                    List listM12871d = c7690l.m12871d();
                    if (listM12871d == null || !listM12871d.isEmpty()) {
                        Iterator it2 = listM12871d.iterator();
                        while (it2.hasNext()) {
                            if (((String) it2.next()).length() <= 0) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9829X(long r9, long r11, int r13, kotlin.coroutines.Continuation r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.zykj.evaluation.p057ui.guide.noStem.NoStemViewModel$loadFailedUuids$1
            if (r0 == 0) goto L14
            r0 = r14
            com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$loadFailedUuids$1 r0 = (com.zykj.evaluation.p057ui.guide.noStem.NoStemViewModel$loadFailedUuids$1) r0
            int r1 = r0.f9585f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f9585f = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$loadFailedUuids$1 r0 = new com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$loadFailedUuids$1
            r0.<init>(r8, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.f9583d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f9585f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r14)
            goto L4e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.ResultKt.throwOnFailure(r14)
            com.zykj.evaluation.di.AppDatabase r14 = r8.database
            n5.i r1 = r14.mo8676h()
            r7.f9580a = r9
            r7.f9581b = r11
            r7.f9582c = r13
            r7.f9585f = r2
            r2 = r9
            r4 = r11
            r6 = r13
            java.lang.Object r14 = r1.mo8726a(r2, r4, r6, r7)
            if (r14 != r0) goto L4e
            return r0
        L4e:
            java.util.List r14 = (java.util.List) r14
            kotlinx.coroutines.flow.MutableStateFlow r9 = r8._failedUuid
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r14.iterator()
        L5b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L8c
            java.lang.Object r12 = r11.next()
            r13 = r12
            n5.h r13 = (p178n5.C8641h) r13
            com.zykj.evaluation.bean.UploadData r14 = r13.m14231c()
            int r14 = r14.getCommitState()
            m5.e$a r0 = p167m5.AbstractC8555e.a.f14189b
            int r0 = r0.m14097a()
            if (r14 == r0) goto L88
            com.zykj.evaluation.bean.UploadData r13 = r13.m14231c()
            int r13 = r13.getCommitState()
            m5.e$d r14 = p167m5.AbstractC8555e.d.f14192b
            int r14 = r14.m14097a()
            if (r13 != r14) goto L5b
        L88:
            r10.add(r12)
            goto L5b
        L8c:
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r10, r12)
            r11.<init>(r12)
            int r12 = r10.size()
            r13 = 0
        L9c:
            if (r13 >= r12) goto Lae
            java.lang.Object r14 = r10.get(r13)
            int r13 = r13 + 1
            n5.h r14 = (p178n5.C8641h) r14
            java.lang.String r14 = r14.m14233e()
            r11.add(r14)
            goto L9c
        Lae:
            java.util.Set r10 = kotlin.collections.CollectionsKt.toSet(r11)
            r9.setValue(r10)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.noStem.NoStemViewModel.m9829X(long, long, int, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/noStem/NoStemViewModel.smali:948
    }

    /* renamed from: Y */
    public final void m9830Y(long questionId, boolean isAskForHelp) {
        BaseViewModel.m8644f(this, null, null, null, null, null, new NoStemViewModel$setAskForHelp$1(this, questionId, isAskForHelp, null), 31, null);
    }

    /* renamed from: Z */
    public final void m9831Z(C7697o0 c7697o0) {
        this.noStemViewState.setValue(c7697o0);
    }

    /* renamed from: a0 */
    public final void m9832a0() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NoStemViewModel$submitNoStem$1(this, null), 3, null);
    }

    /* renamed from: b0 */
    public final void m9833b0(String uuid) {
        Object value;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        MutableStateFlow mutableStateFlow = this._failedUuid;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, SetsKt.minus((Set<? extends String>) value, uuid)));
    }

    /* renamed from: c0 */
    public final void m9834c0(String uuid, List localAnswer) {
        List localAnswer2 = localAnswer;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localAnswer2, "localAnswer");
        BaseViewModel.m8644f(this, null, null, new NoStemViewModel$updateLocalAnswer$1(null), new NoStemViewModel$updateLocalAnswer$2(null), null, new NoStemViewModel$updateLocalAnswer$3(this, uuid, localAnswer2, null), 19, null);
        m9833b0(uuid);
        C7697o0 c7697o0M9827V = m9827V();
        List<C7670b> listM12880b = m9827V().m12880b();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM12880b, 10));
        for (C7670b c7670b : listM12880b) {
            List<C7690l> listM12811e = c7670b.m12811e();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM12811e, 10));
            for (C7690l c7690lM12868b : listM12811e) {
                if (Intrinsics.areEqual(c7690lM12868b.m12876i(), uuid)) {
                    c7690lM12868b = C7690l.m12868b(c7690lM12868b, null, 0L, false, false, 0, null, null, localAnswer2, 127, null);
                }
                arrayList2.add(c7690lM12868b);
                localAnswer2 = localAnswer;
            }
            arrayList.add(C7670b.m12807b(c7670b, null, null, null, arrayList2, 7, null));
            localAnswer2 = localAnswer;
        }
        m9831Z(c7697o0M9827V.m12879a(arrayList));
    }

    /* renamed from: e0 */
    public final void m9835e0(GuideTaskInfo guideTaskInfo) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NoStemViewModel$updateTaskInfo$1(this, guideTaskInfo, null), 3, null);
    }

    /* renamed from: f0 */
    public final void m9836f0(String uuid, String localPath) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        BaseViewModel.m8644f(this, null, AbstractC6856a.a.f8697c, null, null, null, new NoStemViewModel$uploadAnswer$1(this, uuid, localPath, null), 29, null);
    }

    @Override // com.zykj.evaluation.p057ui.guide.BaseGuideViewModel
    /* renamed from: s */
    public void mo9778s(long taskId) {
        super.mo9778s(taskId);
        TaskState.ToDo toDo = TaskState.ToDo.INSTANCE;
        Long lM10602a = ((UserInfo) this.userInfo.getValue()).m10602a();
        Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
        m9782w(new C7589e(toDo, lM10602a.longValue(), m9776q()));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new NoStemViewModel$initData$1(this, null), 3, null);
    }
}
