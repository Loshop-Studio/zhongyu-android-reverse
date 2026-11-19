package com.zykj.http.bean;

import androidx.annotation.Keep;
import androidx.lifecycle.C0511s;
import com.zykj.lib.error.code.ErrorCode;
import org.jetbrains.annotations.NotNull;
import p102i3.C2677j;
import p102i3.InterfaceC2672e;

@Keep
/* loaded from: classes.dex */
public final class HeaderLiveData extends C0511s<HeaderBean> {

    @NotNull
    private final C0511s<ErrorCode> unauthorized = new C0511s<>();

    @NotNull
    private final C0511s<Boolean> offlineMode = new C0511s<>(Boolean.FALSE);

    @NotNull
    private final InterfaceC2672e<Boolean> lessonDeauthorized = C2677j.m8990b(0, 0, null, 7, null);

    @NotNull
    public final InterfaceC2672e<Boolean> getLessonDeauthorized() {
        return this.lessonDeauthorized;
    }

    @NotNull
    public final C0511s<Boolean> getOfflineMode() {
        return this.offlineMode;
    }

    @NotNull
    public final C0511s<ErrorCode> getUnauthorized() {
        return this.unauthorized;
    }
}
