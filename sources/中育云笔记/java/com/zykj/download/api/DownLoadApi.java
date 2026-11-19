package com.zykj.download.api;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import gf.InterfaceC9413f;
import gf.InterfaceC9416i;
import gf.InterfaceC9430w;
import gf.InterfaceC9432y;
import je.AbstractC9746z;
import p122df.C9031c0;
import vc.InterfaceC11588c;

@Keep
/* loaded from: classes6.dex */
public interface DownLoadApi {
    @InterfaceC9430w
    @InterfaceC9413f
    Object download(@InterfaceC9432y String str, @InterfaceC9416i(HttpHeaders.RANGE) String str2, InterfaceC11588c<? super C9031c0<AbstractC9746z>> interfaceC11588c);
}
