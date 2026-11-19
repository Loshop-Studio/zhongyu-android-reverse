package com.zykj.download.api;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4518i;
import p029c6.InterfaceC4521l;
import p029c6.InterfaceC4524o;
import p029c6.InterfaceC4526q;
import p029c6.InterfaceC4534y;
import p058f5.C6387z;

@Keep
@Metadata(m7879d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ;\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m7880d2 = {"Lcom/zykj/download/api/UploadApi;", "", "", "url", "auth", "checksum", "Lf5/z$c;", "file", "", "gridFs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf5/z$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "zyFs", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public interface UploadApi {
    @InterfaceC4524o
    @InterfaceC4521l
    Object gridFs(@InterfaceC4534y String str, @InterfaceC4518i(HttpHeaders.AUTHORIZATION) String str2, @InterfaceC4518i("Checksum") String str3, @InterfaceC4526q C6387z.c cVar, Continuation<? super Unit> continuation);

    @InterfaceC4524o
    @InterfaceC4521l
    Object zyFs(@InterfaceC4534y String str, @InterfaceC4518i(HttpHeaders.AUTHORIZATION) String str2, @InterfaceC4518i("Checksum") String str3, @InterfaceC4526q C6387z.c cVar, Continuation<? super Unit> continuation);
}
