package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.enums.AbstractC9953a;
import p309qc.C10786q;
import p425yc.InterfaceC11943a;
import vc.InterfaceC11588c;

@VisibleForTesting
/* loaded from: classes3.dex */
public interface ActiveFlowTracker {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FlowType {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ FlowType[] $VALUES;
        public static final FlowType PAGED_DATA_FLOW = new FlowType("PAGED_DATA_FLOW", 0);
        public static final FlowType PAGE_EVENT_FLOW = new FlowType("PAGE_EVENT_FLOW", 1);

        private static final /* synthetic */ FlowType[] $values() {
            return new FlowType[]{PAGED_DATA_FLOW, PAGE_EVENT_FLOW};
        }

        static {
            FlowType[] flowTypeArr$values = $values();
            $VALUES = flowTypeArr$values;
            $ENTRIES = AbstractC9953a.m20230a(flowTypeArr$values);
        }

        private FlowType(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static FlowType valueOf(String str) {
            return (FlowType) Enum.valueOf(FlowType.class, str);
        }

        public static FlowType[] values() {
            return (FlowType[]) $VALUES.clone();
        }
    }

    Object onComplete(FlowType flowType, InterfaceC11588c<? super C10786q> interfaceC11588c);

    void onNewCachedEventFlow(CachedPageEventFlow<?> cachedPageEventFlow);

    Object onStart(FlowType flowType, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
