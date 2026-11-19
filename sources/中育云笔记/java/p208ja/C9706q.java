package p208ja;

import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.board.EzyMatrix;
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

/* renamed from: ja.q */
/* loaded from: classes5.dex */
public final class C9706q extends AbstractC9617a {

    /* renamed from: e */
    public static final a f22589e = new a(null);

    /* renamed from: c */
    public RecordEntity f22590c;

    /* renamed from: d */
    public MatrixRecordEntity f22591d;

    /* renamed from: ja.q$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final EzySource.MatrixSource m19202a(String pageRootPath, String fileName) throws IOException {
            AbstractC9979u.m20294g(pageRootPath, "pageRootPath");
            AbstractC9979u.m20294g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.MatrixSource record = EzySource.MatrixSource.m16115o(fileInputStream);
            fileInputStream.close();
            AbstractC9979u.m20293f(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9706q() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m19197g() {
        try {
            MatrixRecordEntity matrixRecordEntity = this.f22591d;
            if (matrixRecordEntity == null) {
                this.f22591d = m19199f();
            } else {
                AbstractC9979u.m20291d(matrixRecordEntity);
                if (matrixRecordEntity.m14211c().size() >= 100) {
                    this.f22591d = m19199f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C10763c m19198e(List matrix) throws IllegalAccessException, IllegalArgumentException {
        C10763c c10763c;
        AbstractC9979u.m20294g(matrix, "matrix");
        MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
        Iterator it = matrix.iterator();
        while (it.hasNext()) {
            EzyMatrix.Matrix matrix2 = (EzyMatrix.Matrix) it.next();
            MatrixInfoEntity matrixInfoEntity = new MatrixInfoEntity(0L, matrix2.getEventTime(), matrix2.getScaleX(), matrix2.m15476y(), matrix2.m15467A(), matrix2.m15477z(), matrix2.getScaleY(), matrix2.m15468C(), matrix2.m15473t(), matrix2.m15474u(), matrix2.m15475v());
            matrixInfoEntity.m14195f().m19043o(matrixEventEntity);
            matrixInfoEntity.m14202m();
            matrixEventEntity.m14180b().add(matrixInfoEntity);
        }
        matrixEventEntity.m14182d();
        MatrixRecordEntity matrixRecordEntity = this.f22591d;
        if (matrixRecordEntity != null) {
            matrixEventEntity.m14181c().m19043o(matrixRecordEntity);
            matrixEventEntity.m14182d();
            matrixRecordEntity.m14211c().add(matrixEventEntity);
            matrixRecordEntity.m14213e();
            c10763c = new C10763c(matrixRecordEntity.m14209a(), matrixRecordEntity.m14211c().m19024m(matrixEventEntity.m14179a()));
        } else {
            c10763c = null;
        }
        m19197g();
        return c10763c;
    }

    /* renamed from: f */
    public final MatrixRecordEntity m19199f() {
        RecordEntity recordEntity = this.f22590c;
        if (recordEntity == null) {
            return null;
        }
        MatrixRecordEntity matrixRecordEntity = new MatrixRecordEntity(0L, UUID.randomUUID() + "_matrix.bin", "");
        recordEntity.m14262f().add(matrixRecordEntity);
        recordEntity.m14266j();
        return matrixRecordEntity;
    }

    /* renamed from: h */
    public final MatrixRecordEntity m19200h() {
        ToMany toManyM14262f;
        MatrixRecordEntity matrixRecordEntity;
        RecordEntity recordEntity = this.f22590c;
        return (recordEntity == null || (toManyM14262f = recordEntity.m14262f()) == null || (matrixRecordEntity = (MatrixRecordEntity) AbstractC10947g0.m23957z0(toManyM14262f)) == null || matrixRecordEntity.m14211c().size() >= 100) ? m19199f() : matrixRecordEntity;
    }

    /* renamed from: i */
    public final void m19201i(RecordEntity recordEntity) {
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        this.f22590c = recordEntity;
        this.f22591d = m19200h();
    }
}
