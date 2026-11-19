package com.zykj.download.api;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3012d;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

@Keep
/* loaded from: classes.dex */
public interface DownLoadApi {
    @Streaming
    @GET
    @Nullable
    Object download(@Url @NotNull String str, @Header(HttpHeaders.RANGE) @NotNull String str2, @NotNull InterfaceC3012d<? super Response<ResponseBody>> interfaceC3012d);
}
