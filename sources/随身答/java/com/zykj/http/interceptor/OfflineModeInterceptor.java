package com.zykj.http.interceptor;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p172l8.C8926y;
import p172l8.InterfaceC8920s;

@Keep
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m13413d2 = {"Lcom/zykj/http/interceptor/OfflineModeInterceptor;", "Ll8/s;", "<init>", "()V", "Ll8/s$a;", "chain", "Ll8/y;", "intercept", "(Ll8/s$a;)Ll8/y;", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lcom/zykj/http/bean/HeaderLiveData;", "getHeaderLiveData", "()Lcom/zykj/http/bean/HeaderLiveData;", "setHeaderLiveData", "(Lcom/zykj/http/bean/HeaderLiveData;)V", "http_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class OfflineModeInterceptor implements InterfaceC8920s {
    public HeaderLiveData headerLiveData;

    public final HeaderLiveData getHeaderLiveData() {
        HeaderLiveData headerLiveData = this.headerLiveData;
        if (headerLiveData != null) {
            return headerLiveData;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headerLiveData");
        throw null;
    }

    @Override // p172l8.InterfaceC8920s
    public C8926y intercept(InterfaceC8920s.a chain) throws RemoteCodeException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Boolean value = getHeaderLiveData().getOfflineMode().getValue();
        if (value != null && value.booleanValue()) {
            throw new RemoteCodeException(ErrorCode.NET_OFFLINE_MODE);
        }
        return chain.mo14025b(chain.mo14024a());
    }

    public final void setHeaderLiveData(HeaderLiveData headerLiveData) {
        Intrinsics.checkNotNullParameter(headerLiveData, "<set-?>");
        this.headerLiveData = headerLiveData;
    }
}
