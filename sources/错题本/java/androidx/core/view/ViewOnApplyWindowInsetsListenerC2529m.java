package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: androidx.core.view.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnApplyWindowInsetsListenerC2529m implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return ViewGroupCompat.lambda$installCompatInsetsDispatch$0(view, windowInsets);
    }
}
