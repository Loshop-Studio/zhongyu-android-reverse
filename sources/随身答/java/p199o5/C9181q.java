package p199o5;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p189n5.AbstractC9095a;
import p272v4.C9764c;

/* renamed from: o5.q */
/* loaded from: classes4.dex */
public final class C9181q extends AbstractC9095a {

    /* renamed from: e */
    public static final a f15574e = new a(null);

    /* renamed from: c */
    public RecordEntity f15575c;

    /* renamed from: d */
    public MatrixRecordEntity f15576d;

    /* renamed from: o5.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.MatrixSource m14784a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.MatrixSource record = EzySource.MatrixSource.m9486w(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9181q() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m14779g() {
        try {
            MatrixRecordEntity matrixRecordEntity = this.f15576d;
            if (matrixRecordEntity == null) {
                this.f15576d = m14781f();
            } else {
                Intrinsics.checkNotNull(matrixRecordEntity);
                if (matrixRecordEntity.m7584c().size() >= 100) {
                    this.f15576d = m14781f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C9764c m14780e(List matrix) throws IllegalAccessException, IllegalArgumentException {
        C9764c c9764c;
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
        Iterator it = matrix.iterator();
        while (it.hasNext()) {
            EzyMatrix.Matrix matrix2 = (EzyMatrix.Matrix) it.next();
            MatrixInfoEntity matrixInfoEntity = new MatrixInfoEntity(0L, matrix2.getEventTime(), matrix2.getScaleX(), matrix2.m8853C(), matrix2.m8855E(), matrix2.m8854D(), matrix2.getScaleY(), matrix2.m8856F(), matrix2.m8861z(), matrix2.m8851A(), matrix2.m8852B());
            matrixInfoEntity.m7568f().m13190w(matrixEventEntity);
            matrixInfoEntity.m7575m();
            matrixEventEntity.m7553b().add(matrixInfoEntity);
        }
        matrixEventEntity.m7555d();
        MatrixRecordEntity matrixRecordEntity = this.f15576d;
        if (matrixRecordEntity != null) {
            matrixEventEntity.m7554c().m13190w(matrixRecordEntity);
            matrixEventEntity.m7555d();
            matrixRecordEntity.m7584c().add(matrixEventEntity);
            matrixRecordEntity.m7586e();
            c9764c = new C9764c(matrixRecordEntity.getFileName(), matrixRecordEntity.m7584c().m13175u(matrixEventEntity.getId()));
        } else {
            c9764c = null;
        }
        m14779g();
        return c9764c;
    }

    /* renamed from: f */
    public final MatrixRecordEntity m14781f() {
        RecordEntity recordEntity = this.f15575c;
        if (recordEntity == null) {
            return null;
        }
        MatrixRecordEntity matrixRecordEntity = new MatrixRecordEntity(0L, UUID.randomUUID() + "_matrix.bin", "");
        recordEntity.m7634f().add(matrixRecordEntity);
        recordEntity.m7638j();
        return matrixRecordEntity;
    }

    /* renamed from: h */
    public final MatrixRecordEntity m14782h() {
        ToMany toManyM7634f;
        MatrixRecordEntity matrixRecordEntity;
        RecordEntity recordEntity = this.f15575c;
        return (recordEntity == null || (toManyM7634f = recordEntity.m7634f()) == null || (matrixRecordEntity = (MatrixRecordEntity) CollectionsKt.lastOrNull((List) toManyM7634f)) == null || matrixRecordEntity.m7584c().size() >= 100) ? m14781f() : matrixRecordEntity;
    }

    /* renamed from: i */
    public final void m14783i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f15575c = recordEntity;
        this.f15576d = m14782h();
    }
}
