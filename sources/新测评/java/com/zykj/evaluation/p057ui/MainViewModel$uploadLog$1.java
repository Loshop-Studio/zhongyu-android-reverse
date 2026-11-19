package com.zykj.evaluation.p057ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.work.WorkInfo;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.TimeUtils;
import com.zykj.evaluation.upload.OssTaskManger;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import p189o5.AbstractC8710f;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.MainViewModel$uploadLog$1", m13596f = "MainViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/zykj/evaluation/ui/MainViewModel$uploadLog$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,106:1\n1#2:107\n295#3,2:108\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/zykj/evaluation/ui/MainViewModel$uploadLog$1\n*L\n63#1:108,2\n*E\n"})
/* loaded from: classes4.dex */
public final class MainViewModel$uploadLog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9019a;

    /* renamed from: b */
    public final /* synthetic */ MainViewModel f9020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$uploadLog$1(MainViewModel mainViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9020b = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$uploadLog$1(this.f9020b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9019a != 0) {
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
            obj2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String name = ((File) next).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            Intrinsics.checkNotNull(nowString);
            if (!StringsKt.contains$default((CharSequence) name, (CharSequence) nowString, false, 2, (Object) null)) {
                obj2 = next;
                break;
            }
        }
        final File file = (File) obj2;
        if (file == null) {
            return Unit.INSTANCE;
        }
        LogUtils.m3239i("上传日志");
        String name2 = file.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        String strSubstring = AbstractC8710f.m14345a(name2).substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strReplace$default = StringsKt.replace$default(strSubstring, "_", "", false, 4, (Object) null);
        String name3 = file.getName();
        OssTaskManger ossTaskManger = this.f9020b.workManger;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        final LiveData liveDataM10478j = this.f9020b.workManger.m10478j(ossTaskManger.m10489u(absolutePath, 2, new String[]{strReplace$default, name3}));
        liveDataM10478j.observeForever(new Observer<WorkInfo>() { // from class: com.zykj.evaluation.ui.MainViewModel$uploadLog$1$observer$1

            /* renamed from: com.zykj.evaluation.ui.MainViewModel$uploadLog$1$observer$1$a */
            public static final /* synthetic */ class C6881a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f9023a;

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
                    f9023a = iArr;
                }
            }

            @Override // androidx.lifecycle.Observer
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onChanged(WorkInfo value) {
                WorkInfo.State state;
                WorkInfo.State state2 = value != null ? value.getState() : null;
                int i10 = state2 == null ? -1 : C6881a.f9023a[state2.ordinal()];
                if (i10 == 1) {
                    LogUtils.m3239i("上传日志 -> 成功");
                    file.delete();
                } else if (i10 == 2) {
                    LogUtils.m3239i("上传日志 -> 失败");
                } else if (i10 == 3) {
                    LogUtils.m3239i("上传日志 -> 被取消了");
                }
                if (value == null || (state = value.getState()) == null || state.isFinished()) {
                    liveDataM10478j.removeObserver(this);
                }
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((MainViewModel$uploadLog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
