package androidx.compose.foundation.text.input.internal;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1 */
/* loaded from: classes.dex */
public /* synthetic */ class C1741xe9f87565 extends FunctionReferenceImpl implements Function1<View, InputMethodManagerImpl> {
    public static final C1741xe9f87565 INSTANCE = new C1741xe9f87565();

    public C1741xe9f87565() {
        super(1, InputMethodManagerImpl.class, "<init>", "<init>(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InputMethodManagerImpl invoke(View view) {
        return new InputMethodManagerImpl(view);
    }
}
