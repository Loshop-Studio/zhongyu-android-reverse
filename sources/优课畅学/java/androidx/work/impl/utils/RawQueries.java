package androidx.work.impl.utils;

import androidx.sqlite.p018db.SimpleSQLiteQuery;
import androidx.sqlite.p018db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;

/* loaded from: classes3.dex */
public final class RawQueries {
    private static final void bindings(StringBuilder sb, int i10) {
        if (i10 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add("?");
        }
        sb.append(AbstractC8778f0.m14576v0(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    public static final SupportSQLiteQuery toRawQuery(WorkQuery workQuery) {
        AbstractC9133u.m16133g(workQuery, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        String str = " AND";
        String str2 = " WHERE";
        if (!workQuery.getStates().isEmpty()) {
            List<WorkInfo.State> states = workQuery.getStates();
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(states, 10));
            Iterator<T> it = states.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt((WorkInfo.State) it.next())));
            }
            sb.append(" WHERE state IN (");
            bindings(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        if (!workQuery.getIds().isEmpty()) {
            List<UUID> ids = workQuery.getIds();
            ArrayList arrayList3 = new ArrayList(AbstractC8811w.m14786x(ids, 10));
            Iterator<T> it2 = ids.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((UUID) it2.next()).toString());
            }
            sb.append(str2 + " id IN (");
            bindings(sb, workQuery.getIds().size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        if (workQuery.getTags().isEmpty()) {
            str = str2;
        } else {
            sb.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb, workQuery.getTags().size());
            sb.append("))");
            arrayList.addAll(workQuery.getTags());
        }
        if (!workQuery.getUniqueWorkNames().isEmpty()) {
            sb.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb, workQuery.getUniqueWorkNames().size());
            sb.append("))");
            arrayList.addAll(workQuery.getUniqueWorkNames());
        }
        sb.append(";");
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "builder.toString()");
        return new SimpleSQLiteQuery(string, arrayList.toArray(new Object[0]));
    }
}
