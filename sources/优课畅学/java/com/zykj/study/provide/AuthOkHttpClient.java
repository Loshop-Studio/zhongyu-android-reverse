package com.zykj.study.provide;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

@Qualifier
@Keep
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface AuthOkHttpClient {
}
