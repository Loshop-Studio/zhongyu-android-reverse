package com.zykj.download.api;

import androidx.annotation.Keep;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p029c6.InterfaceC4515f;
import p029c6.InterfaceC4518i;
import p029c6.InterfaceC4532w;
import p029c6.InterfaceC4534y;
import p058f5.AbstractC6364e0;
import p200z5.C7957c0;

@Keep
@Metadata(m7879d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m7880d2 = {"Lcom/zykj/download/api/DownLoadApi;", "", "", "url", "range", "Lz5/c0;", "Lf5/e0;", "download", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "download_release"}, m7881k = 1, m7882mv = {1, 5, 1}, m7884xi = 48)
/* loaded from: classes3.dex */
public interface DownLoadApi {
    @InterfaceC4532w
    @InterfaceC4515f
    Object download(@InterfaceC4534y String str, @InterfaceC4518i(HttpHeaders.RANGE) String str2, Continuation<? super C7957c0<AbstractC6364e0>> continuation);
}
