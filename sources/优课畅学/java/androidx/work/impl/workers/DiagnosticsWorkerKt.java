package androidx.work.impl.workers;

import androidx.work.Logger;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.model.WorkTagDao;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes3.dex */
public final class DiagnosticsWorkerKt {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("DiagnosticsWrkr");
        AbstractC9133u.m16132f(strTagWithPrefix, "tagWithPrefix(\"DiagnosticsWrkr\")");
        TAG = strTagWithPrefix;
    }

    private static final String workSpecRow(WorkSpec workSpec, String str, Integer num, String str2) {
        return '\n' + workSpec.f2050id + "\t " + workSpec.workerClassName + "\t " + num + "\t " + workSpec.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String workSpecRows(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List<WorkSpec> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (WorkSpec workSpec : list) {
            SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(WorkSpecKt.generationalId(workSpec));
            sb.append(workSpecRow(workSpec, AbstractC8778f0.m14576v0(workNameDao.getNamesForWorkSpecId(workSpec.f2050id), ",", null, null, 0, null, null, 62, null), systemIdInfo != null ? Integer.valueOf(systemIdInfo.systemId) : null, AbstractC8778f0.m14576v0(workTagDao.getTagsForWorkSpecId(workSpec.f2050id), ",", null, null, 0, null, null, 62, null)));
        }
        String string = sb.toString();
        AbstractC9133u.m16132f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
