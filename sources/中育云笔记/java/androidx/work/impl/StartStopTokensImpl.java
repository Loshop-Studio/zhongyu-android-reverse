package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
final class StartStopTokensImpl implements StartStopTokens {
    private final Map<WorkGenerationalId, StartStopToken> runs = new LinkedHashMap();

    @Override // androidx.work.impl.StartStopTokens
    public boolean contains(WorkGenerationalId id2) {
        AbstractC9979u.m20294g(id2, "id");
        return this.runs.containsKey(id2);
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken remove(WorkGenerationalId id2) {
        AbstractC9979u.m20294g(id2, "id");
        return this.runs.remove(id2);
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken tokenFor(WorkGenerationalId id2) {
        AbstractC9979u.m20294g(id2, "id");
        Map<WorkGenerationalId, StartStopToken> map = this.runs;
        StartStopToken startStopToken = map.get(id2);
        if (startStopToken == null) {
            startStopToken = new StartStopToken(id2);
            map.put(id2, startStopToken);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public List<StartStopToken> remove(String workSpecId) {
        AbstractC9979u.m20294g(workSpecId, "workSpecId");
        Map<WorkGenerationalId, StartStopToken> map = this.runs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WorkGenerationalId, StartStopToken> entry : map.entrySet()) {
            if (AbstractC9979u.m20289b(entry.getKey().getWorkSpecId(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.runs.remove((WorkGenerationalId) it.next());
        }
        return AbstractC10947g0.m23922X0(linkedHashMap.values());
    }
}
