package p148j6;

import android.content.Context;
import androidx.work.WorkManager;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* renamed from: j6.a */
/* loaded from: classes5.dex */
public final class C8217a {

    /* renamed from: a */
    public static final C8217a f14294a = new C8217a();

    /* renamed from: a */
    public final MutableStateFlow m13256a() {
        return StateFlowKt.MutableStateFlow(null);
    }

    /* renamed from: b */
    public final WorkManager m13257b(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return WorkManager.INSTANCE.getInstance(appContext);
    }
}
