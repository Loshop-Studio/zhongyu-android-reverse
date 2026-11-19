package p208ja;

import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.board.EzySource;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p194ia.AbstractC9617a;
import p307q9.C10763c;
import p325rc.AbstractC10947g0;

/* renamed from: ja.o */
/* loaded from: classes5.dex */
public final class C9704o extends AbstractC9617a {

    /* renamed from: e */
    public static final a f22583e = new a(null);

    /* renamed from: c */
    public RecordEntity f22584c;

    /* renamed from: d */
    public FileRecordEntity f22585d;

    /* renamed from: ja.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final EzySource.FileSource m19190a(String pageRootPath, String fileName) throws IOException {
            AbstractC9979u.m20294g(pageRootPath, "pageRootPath");
            AbstractC9979u.m20294g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.FileSource record = EzySource.FileSource.m15973p(fileInputStream);
            fileInputStream.close();
            AbstractC9979u.m20293f(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9704o() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m19185g() {
        try {
            FileRecordEntity fileRecordEntity = this.f22585d;
            if (fileRecordEntity == null) {
                this.f22585d = m19187f();
            } else {
                AbstractC9979u.m20291d(fileRecordEntity);
                if (fileRecordEntity.m14091a().size() >= 100) {
                    this.f22585d = m19187f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C10763c m19186e(String fileName, String validate, int i10, int i11) throws IllegalAccessException, IllegalArgumentException {
        C10763c c10763c;
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(validate, "validate");
        FileRecordEntity fileRecordEntity = this.f22585d;
        if (fileRecordEntity != null) {
            FileInfoEntity fileInfoEntity = new FileInfoEntity(0L, fileName, i10, i11, validate);
            fileInfoEntity.m14081d().m19043o(fileRecordEntity);
            fileInfoEntity.m14084g();
            fileRecordEntity.m14091a().add(fileInfoEntity);
            fileRecordEntity.m14095e();
            c10763c = new C10763c(fileRecordEntity.m14092b(), fileRecordEntity.m14091a().m19024m(fileInfoEntity.m14080c()));
        } else {
            c10763c = null;
        }
        m19185g();
        return c10763c;
    }

    /* renamed from: f */
    public final FileRecordEntity m19187f() {
        RecordEntity recordEntity = this.f22584c;
        if (recordEntity == null) {
            return null;
        }
        FileRecordEntity fileRecordEntity = new FileRecordEntity(0L, UUID.randomUUID() + "_file.bin", "");
        recordEntity.m14259c().add(fileRecordEntity);
        recordEntity.m14266j();
        return fileRecordEntity;
    }

    /* renamed from: h */
    public final FileRecordEntity m19188h() {
        ToMany toManyM14259c;
        FileRecordEntity fileRecordEntity;
        RecordEntity recordEntity = this.f22584c;
        return (recordEntity == null || (toManyM14259c = recordEntity.m14259c()) == null || (fileRecordEntity = (FileRecordEntity) AbstractC10947g0.m23957z0(toManyM14259c)) == null || fileRecordEntity.m14091a().size() >= 100) ? m19187f() : fileRecordEntity;
    }

    /* renamed from: i */
    public final void m19189i(RecordEntity recordEntity) {
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        this.f22584c = recordEntity;
        this.f22585d = m19188h();
    }
}
