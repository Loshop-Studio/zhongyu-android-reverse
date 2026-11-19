package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10570l;

/* renamed from: androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 */
/* loaded from: classes.dex */
public /* synthetic */ class C1770xe9f87565 extends FunctionReferenceImpl implements InterfaceC10570l {
    public static final C1770xe9f87565 INSTANCE = new C1770xe9f87565();

    public C1770xe9f87565() {
        super(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public final InputMethodManagerImpl invoke(View view) {
        return new InputMethodManagerImpl(view);
    }
}
