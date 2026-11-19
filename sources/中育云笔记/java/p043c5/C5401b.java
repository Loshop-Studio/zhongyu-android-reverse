package p043c5;

import android.content.Context;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import java.util.Arrays;

/* renamed from: c5.b */
/* loaded from: classes5.dex */
public class C5401b extends AbstractClientBuilder {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5400a buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        clientSettings.setApiName(Arrays.asList(HuaweiApiAvailability.HMS_API_NAME_PUSH, "Core.API"));
        return new C5400a(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
