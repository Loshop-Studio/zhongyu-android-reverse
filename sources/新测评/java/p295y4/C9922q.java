package p295y4;

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
import p087f4.C7437b;
import p285x4.AbstractC9848a;

/* renamed from: y4.q */
/* loaded from: classes4.dex */
public final class C9922q extends AbstractC9848a {

    /* renamed from: e */
    public static final a f17720e = new a(null);

    /* renamed from: c */
    public RecordEntity f17721c;

    /* renamed from: d */
    public MatrixRecordEntity f17722d;

    /* renamed from: y4.q$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.MatrixSource m16743a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.MatrixSource record = EzySource.MatrixSource.m8339t(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9922q() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m16738g() {
        try {
            MatrixRecordEntity matrixRecordEntity = this.f17722d;
            if (matrixRecordEntity == null) {
                this.f17722d = m16740f();
            } else {
                Intrinsics.checkNotNull(matrixRecordEntity);
                if (matrixRecordEntity.m6483c().size() >= 100) {
                    this.f17722d = m16740f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C7437b m16739e(List matrix) throws IllegalAccessException, IllegalArgumentException {
        C7437b c7437b;
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
        Iterator it = matrix.iterator();
        while (it.hasNext()) {
            EzyMatrix.Matrix matrix2 = (EzyMatrix.Matrix) it.next();
            MatrixInfoEntity matrixInfoEntity = new MatrixInfoEntity(0L, matrix2.getEventTime(), matrix2.getScaleX(), matrix2.m7732z(), matrix2.m7723B(), matrix2.m7722A(), matrix2.getScaleY(), matrix2.m7724C(), matrix2.m7729w(), matrix2.m7730x(), matrix2.m7731y());
            matrixInfoEntity.m6467f().m13071t(matrixEventEntity);
            matrixInfoEntity.m6474m();
            matrixEventEntity.m6452b().add(matrixInfoEntity);
        }
        matrixEventEntity.m6454d();
        MatrixRecordEntity matrixRecordEntity = this.f17722d;
        if (matrixRecordEntity != null) {
            matrixEventEntity.m6453c().m13071t(matrixRecordEntity);
            matrixEventEntity.m6454d();
            matrixRecordEntity.m6483c().add(matrixEventEntity);
            matrixRecordEntity.m6485e();
            c7437b = new C7437b(matrixRecordEntity.getFileName(), matrixRecordEntity.m6483c().m13053r(matrixEventEntity.getId()));
        } else {
            c7437b = null;
        }
        m16738g();
        return c7437b;
    }

    /* renamed from: f */
    public final MatrixRecordEntity m16740f() {
        RecordEntity recordEntity = this.f17721c;
        if (recordEntity == null) {
            return null;
        }
        MatrixRecordEntity matrixRecordEntity = new MatrixRecordEntity(0L, UUID.randomUUID() + "_matrix.bin", "");
        recordEntity.m6532f().add(matrixRecordEntity);
        recordEntity.m6536j();
        return matrixRecordEntity;
    }

    /* renamed from: h */
    public final MatrixRecordEntity m16741h() {
        ToMany toManyM6532f;
        MatrixRecordEntity matrixRecordEntity;
        RecordEntity recordEntity = this.f17721c;
        return (recordEntity == null || (toManyM6532f = recordEntity.m6532f()) == null || (matrixRecordEntity = (MatrixRecordEntity) CollectionsKt.lastOrNull((List) toManyM6532f)) == null || matrixRecordEntity.m6483c().size() >= 100) ? m16740f() : matrixRecordEntity;
    }

    /* renamed from: i */
    public final void m16742i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f17721c = recordEntity;
        this.f17722d = m16741h();
    }
}
