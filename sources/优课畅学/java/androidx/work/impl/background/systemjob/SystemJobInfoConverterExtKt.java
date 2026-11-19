package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(28)
/* loaded from: classes3.dex */
public final class SystemJobInfoConverterExtKt {
    public static final void setRequiredNetworkRequest(JobInfo.Builder builder, NetworkRequest networkRequest) {
        AbstractC9133u.m16133g(builder, "builder");
        builder.setRequiredNetwork(networkRequest);
    }
}
