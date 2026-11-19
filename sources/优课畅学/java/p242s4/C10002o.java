package p242s4;

import android.content.Context;
import com.zykj.study.data.AppDatabase;
import com.zykj.study.data.GradeEntityDao;
import com.zykj.study.data.PdfDao;
import com.zykj.study.data.PeriodEntityDao;
import com.zykj.study.data.SearchHistoryEntityDao;
import com.zykj.study.data.SubjectEntityDao;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: s4.o */
/* loaded from: classes3.dex */
public final class C10002o {
    /* renamed from: a */
    public final AppDatabase m18692a(Context appContext) {
        AbstractC9133u.m16133g(appContext, "appContext");
        return AppDatabase.Companion.getInstance(appContext);
    }

    /* renamed from: b */
    public final GradeEntityDao m18693b(AppDatabase appDatabase) {
        AbstractC9133u.m16133g(appDatabase, "appDatabase");
        return appDatabase.gradeEntityDao();
    }

    /* renamed from: c */
    public final PdfDao m18694c(AppDatabase appDatabase) {
        AbstractC9133u.m16133g(appDatabase, "appDatabase");
        return appDatabase.pdfDao();
    }

    /* renamed from: d */
    public final PeriodEntityDao m18695d(AppDatabase appDatabase) {
        AbstractC9133u.m16133g(appDatabase, "appDatabase");
        return appDatabase.periodEntityDao();
    }

    /* renamed from: e */
    public final SearchHistoryEntityDao m18696e(AppDatabase appDatabase) {
        AbstractC9133u.m16133g(appDatabase, "appDatabase");
        return appDatabase.searchHistoryEntityDao();
    }

    /* renamed from: f */
    public final SubjectEntityDao m18697f(AppDatabase appDatabase) {
        AbstractC9133u.m16133g(appDatabase, "appDatabase");
        return appDatabase.subjectEntityDao();
    }
}
