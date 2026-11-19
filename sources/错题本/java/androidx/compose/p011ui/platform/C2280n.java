package androidx.compose.p011ui.platform;

import android.view.View;
import androidx.compose.p011ui.platform.WindowRecomposerFactory;
import androidx.compose.runtime.Recomposer;

/* renamed from: androidx.compose.ui.platform.n */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2280n implements WindowRecomposerFactory {
    @Override // androidx.compose.p011ui.platform.WindowRecomposerFactory
    public final Recomposer createRecomposer(View view) {
        return WindowRecomposerFactory.Companion.LifecycleAware$lambda$0(view);
    }
}
