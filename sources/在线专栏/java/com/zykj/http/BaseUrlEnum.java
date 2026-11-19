package com.zykj.http;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes.dex */
public enum BaseUrlEnum {
    DEFAULT("https://hagateway.zykj.org/");


    @NotNull
    private String url;

    BaseUrlEnum(String str) {
        this.url = str;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@NotNull String str) {
        C2769l.m9241e(str, "<set-?>");
        this.url = str;
    }
}
