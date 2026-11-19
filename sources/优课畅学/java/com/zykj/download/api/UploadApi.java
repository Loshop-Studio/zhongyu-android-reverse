package com.zykj.download.api;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import p103fa.InterfaceC8495i;
import p103fa.InterfaceC8498l;
import p103fa.InterfaceC8501o;
import p103fa.InterfaceC8503q;
import p103fa.InterfaceC8511y;
import p123h7.C8736p;
import p136i9.C8928z;
import p179m7.InterfaceC9324c;

@Keep
/* loaded from: classes4.dex */
public interface UploadApi {
    @InterfaceC8498l
    @InterfaceC8501o
    Object gridFs(@InterfaceC8511y String str, @InterfaceC8495i(HttpHeaders.AUTHORIZATION) String str2, @InterfaceC8495i("Checksum") String str3, @InterfaceC8503q C8928z.c cVar, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @InterfaceC8498l
    @InterfaceC8501o
    Object zyFs(@InterfaceC8511y String str, @InterfaceC8495i(HttpHeaders.AUTHORIZATION) String str2, @InterfaceC8495i("Checksum") String str3, @InterfaceC8503q C8928z.c cVar, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
