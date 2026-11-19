package na;

import android.content.Context;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.core.data.dao.AbstractC8434a;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.PageEntity_;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import io.objectbox.BoxStore;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.AbstractC9979u;
import p210jc.C9710a;
import p309qc.C10786q;
import p325rc.AbstractC10980x;

/* renamed from: na.d */
/* loaded from: classes5.dex */
public final class C10341d {

    /* renamed from: a */
    public static final C10341d f24644a = new C10341d();

    /* renamed from: b */
    public static BoxStore f24645b;

    /* renamed from: c */
    public static String f24646c;

    /* renamed from: d */
    public static boolean f24647d;

    /* renamed from: c */
    public static /* synthetic */ void m21622c(C10341d c10341d, String str, Context context, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            context = null;
        }
        c10341d.m21624b(str, context);
    }

    /* renamed from: d */
    public static final void m21623d(String dirName) {
        AbstractC9979u.m20294g(dirName, "$dirName");
        C9710a c9710aM18954g = f24644a.m21626f().m18954g(BlackBoardEntity.class);
        AbstractC9979u.m20293f(c9710aM18954g, "");
        QueryBuilder builder = c9710aM18954g.m19229o();
        AbstractC9979u.m20293f(builder, "builder");
        builder.m19013g(BlackBoardEntity_.f18099h, dirName);
        Query queryM19011e = builder.m19011e();
        AbstractC9979u.m20293f(queryM19011e, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM19011e.m19005n();
        if (blackBoardEntity != null) {
            ToMany toManyM14041c = blackBoardEntity.m14041c();
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(toManyM14041c, 10));
            Iterator<TARGET> it = toManyM14041c.iterator();
            while (it.hasNext()) {
                arrayList.add(((PageEntity) it.next()).m14239d());
            }
            c9710aM18954g.m19235u(blackBoardEntity);
            LogUtils.m3888i("[board: " + dirName + "] 已被清除");
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C10341d c10341d = f24644a;
                C9710a c9710aM18954g2 = c10341d.m21626f().m18954g(PageEntity.class);
                AbstractC9979u.m20293f(c9710aM18954g2, "boxStore.boxFor(PageEntity::class.java)");
                QueryBuilder builder2 = c9710aM18954g2.m19229o();
                AbstractC9979u.m20293f(builder2, "builder");
                builder2.m19013g(PageEntity_.f18380h, (String) obj);
                Query queryM19011e2 = builder2.m19011e();
                AbstractC9979u.m20293f(queryM19011e2, "builder.build()");
                PageEntity it2 = (PageEntity) queryM19011e2.m19005n();
                if (it2 != null) {
                    AbstractC9979u.m20293f(it2, "it");
                    c10341d.m21625e(it2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m21624b(final String dirName, Context context) {
        AbstractC9979u.m20294g(dirName, "dirName");
        if (!f24647d || f24646c == null) {
            if (context != null) {
                f24644a.m21627g(context);
            }
            m21626f().m18946I(new Runnable() { // from class: na.c
                @Override // java.lang.Runnable
                public final void run() {
                    C10341d.m21623d(dirName);
                }
            });
        }
    }

    /* renamed from: e */
    public final void m21625e(PageEntity pageEntity) {
        Object objM20054c;
        AbstractC9979u.m20294g(pageEntity, "pageEntity");
        m21626f().m18954g(HeaderEntity.class).m19234t(pageEntity.m14240e().m19038f());
        LogUtils.m3888i("[page: " + pageEntity.m14239d() + "] header 已被清除");
        try {
            Result.C9921a c9921a = Result.f23263d;
            RecordEntity recordEntity = (RecordEntity) pageEntity.m14242g().m19036d();
            Iterator<TARGET> it = recordEntity.m14258b().iterator();
            while (it.hasNext()) {
                m21626f().m18954g(CommandInfoEntity.class).m19233s(((CommandRecordEntity) it.next()).m14065a());
            }
            m21626f().m18954g(CommandRecordEntity.class).m19233s(recordEntity.m14258b());
            for (TouchRecordEntity touchRecordEntity : recordEntity.m14265i()) {
                Iterator<TARGET> it2 = touchRecordEntity.m14345c().iterator();
                while (it2.hasNext()) {
                    m21626f().m18954g(TouchInfoEntity.class).m19233s(((TouchEventEntity) it2.next()).m14321h());
                }
                m21626f().m18954g(TouchEventEntity.class).m19233s(touchRecordEntity.m14345c());
            }
            m21626f().m18954g(TouchRecordEntity.class).m19233s(recordEntity.m14265i());
            for (MatrixRecordEntity matrixRecordEntity : recordEntity.m14262f()) {
                Iterator<TARGET> it3 = matrixRecordEntity.m14211c().iterator();
                while (it3.hasNext()) {
                    m21626f().m18954g(MatrixInfoEntity.class).m19233s(((MatrixEventEntity) it3.next()).m14180b());
                }
                m21626f().m18954g(MatrixEventEntity.class).m19233s(matrixRecordEntity.m14211c());
            }
            m21626f().m18954g(MatrixRecordEntity.class).m19233s(recordEntity.m14262f());
            Iterator<TARGET> it4 = recordEntity.m14259c().iterator();
            while (it4.hasNext()) {
                m21626f().m18954g(FileInfoEntity.class).m19233s(((FileRecordEntity) it4.next()).m14091a());
            }
            m21626f().m18954g(FileRecordEntity.class).m19233s(recordEntity.m14259c());
            Iterator<TARGET> it5 = recordEntity.m14264h().iterator();
            while (it5.hasNext()) {
                m21626f().m18954g(TextInfoEntity.class).m19233s(((TextRecordEntity) it5.next()).m14303c());
            }
            m21626f().m18954g(TextRecordEntity.class).m19233s(recordEntity.m14264h());
            Iterator<TARGET> it6 = recordEntity.m14257a().iterator();
            while (it6.hasNext()) {
                m21626f().m18954g(AudioInfoEntity.class).m19233s(((AudioRecordEntity) it6.next()).m14003a());
            }
            m21626f().m18954g(AudioRecordEntity.class).m19233s(recordEntity.m14257a());
            objM20054c = Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        if (Result.m20056e(objM20054c) != null) {
            f24644a.m21626f().m18954g(RecordEntity.class).m19234t(pageEntity.m14242g().m19038f());
        }
        LogUtils.m3888i("[page: " + pageEntity.m14239d() + "] record 已被清除");
        m21626f().m18954g(PageEntity.class).m19234t(pageEntity.m14241f());
        LogUtils.m3888i("[page: " + pageEntity.m14239d() + "] 已完全被清除");
    }

    /* renamed from: f */
    public final BoxStore m21626f() {
        BoxStore boxStore = f24645b;
        if (boxStore == null) {
            throw new UninitializedPropertyAccessException("boxStore not init");
        }
        AbstractC9979u.m20291d(boxStore);
        return boxStore;
    }

    /* renamed from: g */
    public final synchronized void m21627g(Context context) {
        AbstractC9979u.m20294g(context, "context");
        if (f24645b == null) {
            LogUtils.m3888i("BBD: initializing box store : " + context.getApplicationContext().getFilesDir());
            BoxStore boxStoreM19242b = AbstractC8434a.m14380y().m19241a(context.getApplicationContext()).m19248l(8388608L).m19242b();
            AbstractC9979u.m20293f(boxStoreM19242b, "builder()\n              …\n                .build()");
            m21629i(boxStoreM19242b);
        }
    }

    /* renamed from: h */
    public final synchronized void m21628h(Context context, String file) {
        try {
            AbstractC9979u.m20294g(context, "context");
            AbstractC9979u.m20294g(file, "file");
            LogUtils.m3888i("BBD:init object box with file: " + file);
            BoxStore boxStore = f24645b;
            if (boxStore != null) {
                AbstractC9979u.m20291d(boxStore);
                boxStore.close();
            }
            BoxStore boxStoreM19242b = AbstractC8434a.m14380y().m19245f(new File(file)).m19241a(context.getApplicationContext()).m19248l(8388608L).m19242b();
            AbstractC9979u.m20293f(boxStoreM19242b, "builder()\n            .d…024)\n            .build()");
            m21629i(boxStoreM19242b);
            f24647d = true;
            f24646c = file;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: i */
    public final void m21629i(BoxStore boxStore) {
        f24645b = boxStore;
    }
}
