package androidx.paging;

import androidx.annotation.VisibleForTesting;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@VisibleForTesting
/* loaded from: classes3.dex */
public interface ActiveFlowTracker {

    public enum FlowType {
        PAGED_DATA_FLOW,
        PAGE_EVENT_FLOW
    }

    Object onComplete(FlowType flowType, InterfaceC9324c<? super C8736p> interfaceC9324c);

    void onNewCachedEventFlow(CachedPageEventFlow<?> cachedPageEventFlow);

    Object onStart(FlowType flowType, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
