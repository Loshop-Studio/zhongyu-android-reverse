package com.zykj.huiwei.launcher.ext;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public abstract class ViewModelExtKt {
    /* renamed from: a */
    public static final LiveData m5318a(BaseViewModel baseViewModel, Flow flow, Function1 function1, Function1 function12, Function2 function2) {
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return m5320c(baseViewModel, flow, function1, function12, function2);
    }

    /* renamed from: b */
    public static /* synthetic */ LiveData m5319b(BaseViewModel baseViewModel, Flow flow, Function1 function1, Function1 function12, Function2 function2, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            function1 = new ViewModelExtKt$flowAsLiveDataNoLoading$1(null);
        }
        if ((i6 & 4) != 0) {
            function12 = new ViewModelExtKt$flowAsLiveDataNoLoading$2(null);
        }
        if ((i6 & 8) != 0) {
            function2 = null;
        }
        return m5318a(baseViewModel, flow, function1, function12, function2);
    }

    /* renamed from: c */
    public static final LiveData m5320c(BaseViewModel baseViewModel, Flow flow, Function1 function1, Function1 function12, Function2 function2) {
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return FlowLiveDataConversions.asLiveData$default(FlowKt.m18689catch(FlowKt.onCompletion(FlowKt.onStart(FlowKt.flowOn(flow, Dispatchers.getIO()), new ViewModelExtKt$flowAsLiveDataWithLoading$1(function1, baseViewModel, null)), new ViewModelExtKt$flowAsLiveDataWithLoading$2(function12, baseViewModel, null)), new ViewModelExtKt$flowAsLiveDataWithLoading$3(function2, baseViewModel, null)), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    /* renamed from: d */
    public static final void m5321d(BaseViewModel baseViewModel, Flow flow, Function1 function1, Function1 function12, Function2 function2, Function2 function22) {
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(flow, "flow");
        m5323f(baseViewModel, flow, function1, function12, function2, function22);
    }

    /* renamed from: e */
    public static /* synthetic */ void m5322e(BaseViewModel baseViewModel, Flow flow, Function1 function1, Function1 function12, Function2 function2, Function2 function22, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            function1 = new ViewModelExtKt$flowLaunchNoLoading$1(null);
        }
        Function1 function13 = function1;
        if ((i6 & 4) != 0) {
            function12 = new ViewModelExtKt$flowLaunchNoLoading$2(null);
        }
        m5321d(baseViewModel, flow, function13, function12, (i6 & 8) != 0 ? null : function2, (i6 & 16) != 0 ? null : function22);
    }

    /* renamed from: f */
    public static final void m5323f(BaseViewModel baseViewModel, Flow flow, Function1 function1, Function1 function12, Function2 function2, Function2 function22) {
        Intrinsics.checkNotNullParameter(baseViewModel, "<this>");
        Intrinsics.checkNotNullParameter(flow, "flow");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(baseViewModel), null, null, new ViewModelExtKt$flowLaunchWithLoading$1(flow, function1, baseViewModel, function12, function2, function22, null), 3, null);
    }

    /* renamed from: g */
    public static /* synthetic */ void m5324g(BaseViewModel baseViewModel, Flow flow, Function1 function1, Function1 function12, Function2 function2, Function2 function22, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            function1 = null;
        }
        if ((i6 & 4) != 0) {
            function12 = null;
        }
        if ((i6 & 8) != 0) {
            function2 = null;
        }
        if ((i6 & 16) != 0) {
            function22 = null;
        }
        m5323f(baseViewModel, flow, function1, function12, function2, function22);
    }
}
