package androidx.compose.foundation.layout;

import com.tencent.smtt.sdk.TbsListener;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", m17801f = "WindowInsetsConnection.android.kt", m17802l = {301, TbsListener.ErrorCode.TEST_THROWABLE_ISNOT_NULL, 352}, m17803m = "fling-huYlsQE")
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$1 extends ContinuationImpl {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, InterfaceC9324c<? super WindowInsetsNestedScrollConnection$fling$1> interfaceC9324c) {
        super(interfaceC9324c);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m20931flinghuYlsQE(0L, 0.0f, false, this);
    }
}
