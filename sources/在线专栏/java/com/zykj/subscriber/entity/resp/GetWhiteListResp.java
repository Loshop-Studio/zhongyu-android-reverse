package com.zykj.subscriber.entity.resp;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class GetWhiteListResp extends ApiResp {

    @NotNull
    private String result = "";

    @NotNull
    public final String getResult() {
        return this.result;
    }

    public final void setResult(@NotNull String str) {
        C2769l.m9241e(str, "<set-?>");
        this.result = str;
    }
}
