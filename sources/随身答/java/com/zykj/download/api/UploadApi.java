package com.zykj.download.api;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p110f9.InterfaceC7964i;
import p110f9.InterfaceC7967l;
import p110f9.InterfaceC7970o;
import p110f9.InterfaceC7972q;
import p110f9.InterfaceC7980y;
import p172l8.C8922u;

@Keep
@Metadata(m13412d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ;\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m13413d2 = {"Lcom/zykj/download/api/UploadApi;", "", "", "url", "auth", "checksum", "Ll8/u$c;", "file", "", "gridFs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll8/u$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "zyFs", "download_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public interface UploadApi {
    @InterfaceC7970o
    @InterfaceC7967l
    Object gridFs(@InterfaceC7980y String str, @InterfaceC7964i("Authorization") String str2, @InterfaceC7964i("Checksum") String str3, @InterfaceC7972q C8922u.c cVar, Continuation<? super Unit> continuation);

    @InterfaceC7970o
    @InterfaceC7967l
    Object zyFs(@InterfaceC7980y String str, @InterfaceC7964i("Authorization") String str2, @InterfaceC7964i("Checksum") String str3, @InterfaceC7972q C8922u.c cVar, Continuation<? super Unit> continuation);
}
