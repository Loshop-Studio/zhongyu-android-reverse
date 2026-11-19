package com.zykj.http.bean;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Keep
@Metadata(m13412d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00060\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, m13413d2 = {"Lcom/zykj/http/bean/HeaderLiveData;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zykj/http/bean/HeaderBean;", "()V", "lessonDeauthorized", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "getLessonDeauthorized", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "offlineMode", "kotlin.jvm.PlatformType", "getOfflineMode", "()Landroidx/lifecycle/MutableLiveData;", "unauthorized", "Lcom/zykj/lib/error/code/ErrorCode;", "getUnauthorized", "http_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class HeaderLiveData extends MutableLiveData<HeaderBean> {
    private final MutableLiveData<ErrorCode> unauthorized = new MutableLiveData<>();
    private final MutableLiveData<Boolean> offlineMode = new MutableLiveData<>(Boolean.FALSE);
    private final MutableSharedFlow<Boolean> lessonDeauthorized = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    public final MutableSharedFlow<Boolean> getLessonDeauthorized() {
        return this.lessonDeauthorized;
    }

    public final MutableLiveData<Boolean> getOfflineMode() {
        return this.offlineMode;
    }

    public final MutableLiveData<ErrorCode> getUnauthorized() {
        return this.unauthorized;
    }
}
