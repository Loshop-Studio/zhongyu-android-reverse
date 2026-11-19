package p208ja;

import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzySource;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p194ia.AbstractC9617a;
import p307q9.C10763c;
import p325rc.AbstractC10947g0;

/* renamed from: ja.p */
/* loaded from: classes5.dex */
public final class C9705p extends AbstractC9617a {

    /* renamed from: e */
    public static final a f22586e = new a(null);

    /* renamed from: c */
    public RecordEntity f22587c;

    /* renamed from: d */
    public GeometryRecordEntity f22588d;

    /* renamed from: ja.p$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final EzySource.GeometrySource m19196a(String pageRootPath, String fileName) throws IOException {
            AbstractC9979u.m20294g(pageRootPath, "pageRootPath");
            AbstractC9979u.m20294g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.GeometrySource record = EzySource.GeometrySource.m16040o(fileInputStream);
            fileInputStream.close();
            AbstractC9979u.m20293f(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9705p() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m19191g() {
        try {
            GeometryRecordEntity geometryRecordEntity = this.f22588d;
            if (geometryRecordEntity == null) {
                this.f22588d = m19193f();
            } else {
                AbstractC9979u.m20291d(geometryRecordEntity);
                if (geometryRecordEntity.m14132b().size() >= 100) {
                    this.f22588d = m19193f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C10763c m19192e(int i10, List pointFList, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        C10763c c10763c;
        AbstractC9979u.m20294g(pointFList, "pointFList");
        AbstractC9979u.m20294g(paint, "paint");
        GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.m15724r(), paint.m15723p(), i10);
        Iterator it = pointFList.iterator();
        while (it.hasNext()) {
            EzyPointF.PointF pointF = (EzyPointF.PointF) it.next();
            GeometryPointFEntity geometryPointFEntity = new GeometryPointFEntity(0L, pointF.getX(), pointF.getY());
            geometryPointFEntity.m14121b().m19043o(geometryInfoEntity);
            geometryPointFEntity.m14124e();
            geometryInfoEntity.m14107d().add(geometryPointFEntity);
        }
        geometryInfoEntity.m14112i();
        GeometryRecordEntity geometryRecordEntity = this.f22588d;
        if (geometryRecordEntity != null) {
            geometryInfoEntity.m14108e().m19043o(geometryRecordEntity);
            geometryInfoEntity.m14112i();
            geometryRecordEntity.m14132b().add(geometryInfoEntity);
            geometryRecordEntity.m14135e();
            c10763c = new C10763c(geometryRecordEntity.m14131a(), geometryRecordEntity.m14132b().m19024m(geometryInfoEntity.m14106c()));
        } else {
            c10763c = null;
        }
        m19191g();
        return c10763c;
    }

    /* renamed from: f */
    public final GeometryRecordEntity m19193f() {
        RecordEntity recordEntity = this.f22587c;
        if (recordEntity == null) {
            return null;
        }
        GeometryRecordEntity geometryRecordEntity = new GeometryRecordEntity(0L, UUID.randomUUID() + "_geometry.bin", "");
        recordEntity.m14260d().add(geometryRecordEntity);
        recordEntity.m14266j();
        return geometryRecordEntity;
    }

    /* renamed from: h */
    public final GeometryRecordEntity m19194h() {
        ToMany toManyM14260d;
        GeometryRecordEntity geometryRecordEntity;
        RecordEntity recordEntity = this.f22587c;
        return (recordEntity == null || (toManyM14260d = recordEntity.m14260d()) == null || (geometryRecordEntity = (GeometryRecordEntity) AbstractC10947g0.m23957z0(toManyM14260d)) == null || geometryRecordEntity.m14132b().size() >= 100) ? m19193f() : geometryRecordEntity;
    }

    /* renamed from: i */
    public final void m19195i(RecordEntity recordEntity) {
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        this.f22587c = recordEntity;
        this.f22588d = m19194h();
    }
}
