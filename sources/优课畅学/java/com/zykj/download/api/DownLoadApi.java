package com.zykj.download.api;

import androidx.annotation.Keep;
import ca.C5281c0;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import p103fa.InterfaceC8492f;
import p103fa.InterfaceC8495i;
import p103fa.InterfaceC8509w;
import p103fa.InterfaceC8511y;
import p136i9.AbstractC8905e0;
import p179m7.InterfaceC9324c;

@Keep
/* loaded from: classes4.dex */
public interface DownLoadApi {
    @InterfaceC8509w
    @InterfaceC8492f
    Object download(@InterfaceC8511y String str, @InterfaceC8495i(HttpHeaders.RANGE) String str2, InterfaceC9324c<? super C5281c0<AbstractC8905e0>> interfaceC9324c);
}
