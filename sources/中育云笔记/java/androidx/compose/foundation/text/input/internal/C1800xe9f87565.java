package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;

/* renamed from: androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 */
/* loaded from: classes.dex */
public /* synthetic */ class C1800xe9f87565 extends FunctionReferenceImpl implements InterfaceC9540l {
    public static final C1800xe9f87565 INSTANCE = new C1800xe9f87565();

    public C1800xe9f87565() {
        super(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public final InputMethodManagerImpl invoke(View view) {
        return new InputMethodManagerImpl(view);
    }
}
