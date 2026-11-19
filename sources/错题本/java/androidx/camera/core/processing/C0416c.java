package androidx.camera.core.processing;

import android.view.View;
import android.view.ViewGroup;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.search.SearchView;

/* renamed from: androidx.camera.core.processing.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0416c implements CallbackToFutureAdapter.Resolver, OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ int f509a;

    /* renamed from: b */
    public final /* synthetic */ int f510b;

    /* renamed from: c */
    public final /* synthetic */ Object f511c;

    public /* synthetic */ C0416c(Object obj, int i, int i8) {
        this.f511c = obj;
        this.f509a = i;
        this.f510b = i8;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((DefaultSurfaceProcessor) this.f511c).lambda$snapshot$8(this.f509a, this.f510b, completer);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return SearchView.lambda$setUpDividerInsetListener$6((ViewGroup.MarginLayoutParams) this.f511c, this.f509a, this.f510b, view, windowInsetsCompat);
    }
}
