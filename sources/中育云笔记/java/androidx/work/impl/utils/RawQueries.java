package androidx.work.impl.utils;

import androidx.sqlite.p019db.SimpleSQLiteQuery;
import androidx.sqlite.p019db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;

/* loaded from: classes3.dex */
public final class RawQueries {
    private static final void bindings(StringBuilder sb2, int i10) {
        if (i10 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add("?");
        }
        sb2.append(AbstractC10947g0.m23954w0(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    public static final SupportSQLiteQuery toRawQuery(WorkQuery workQuery) {
        AbstractC9979u.m20294g(workQuery, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        String str = " AND";
        String str2 = " WHERE";
        if (!workQuery.getStates().isEmpty()) {
            List<WorkInfo.State> states = workQuery.getStates();
            ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(states, 10));
            Iterator<T> it = states.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt((WorkInfo.State) it.next())));
            }
            sb2.append(" WHERE state IN (");
            bindings(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        if (!workQuery.getIds().isEmpty()) {
            List<UUID> ids = workQuery.getIds();
            ArrayList arrayList3 = new ArrayList(AbstractC10980x.m24153x(ids, 10));
            Iterator<T> it2 = ids.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((UUID) it2.next()).toString());
            }
            sb2.append(str2 + " id IN (");
            bindings(sb2, workQuery.getIds().size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        if (workQuery.getTags().isEmpty()) {
            str = str2;
        } else {
            sb2.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb2, workQuery.getTags().size());
            sb2.append("))");
            arrayList.addAll(workQuery.getTags());
        }
        if (!workQuery.getUniqueWorkNames().isEmpty()) {
            sb2.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb2, workQuery.getUniqueWorkNames().size());
            sb2.append("))");
            arrayList.addAll(workQuery.getUniqueWorkNames());
        }
        sb2.append(";");
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "builder.toString()");
        return new SimpleSQLiteQuery(string, arrayList.toArray(new Object[0]));
    }
}
