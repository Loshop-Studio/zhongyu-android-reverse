package com.zykj.download.api;

import androidx.annotation.Keep;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

@Keep
/* loaded from: classes.dex */
public interface UploadApi {
    @POST
    @Nullable
    @Multipart
    Object gridFs(@Url @NotNull String str, @Header("Authorization") @NotNull String str2, @Header("Checksum") @NotNull String str3, @NotNull @Part MultipartBody.Part part, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d);
}
