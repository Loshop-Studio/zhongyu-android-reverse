package com.zykj.download.api;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p038c9.C5298x;
import p110f9.InterfaceC7961f;
import p110f9.InterfaceC7964i;
import p110f9.InterfaceC7978w;
import p110f9.InterfaceC7980y;

@Keep
@Metadata(m13412d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, m13413d2 = {"Lcom/zykj/download/api/DownLoadApi;", "", "", "url", "range", "Lc9/x;", "Ll8/z;", "download", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public interface DownLoadApi {
    @InterfaceC7978w
    @InterfaceC7961f
    Object download(@InterfaceC7980y String str, @InterfaceC7964i(HttpHeaders.RANGE) String str2, Continuation<? super C5298x> continuation);
}
