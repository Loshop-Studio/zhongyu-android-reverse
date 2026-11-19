package p199o5;

import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.board.EzySource;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p189n5.AbstractC9095a;
import p272v4.C9764c;

/* renamed from: o5.o */
/* loaded from: classes4.dex */
public final class C9179o extends AbstractC9095a {

    /* renamed from: e */
    public static final a f15568e = new a(null);

    /* renamed from: c */
    public RecordEntity f15569c;

    /* renamed from: d */
    public FileRecordEntity f15570d;

    /* renamed from: o5.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.FileSource m14772a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.FileSource record = EzySource.FileSource.m9344x(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9179o() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m14767g() {
        try {
            FileRecordEntity fileRecordEntity = this.f15570d;
            if (fileRecordEntity == null) {
                this.f15570d = m14769f();
            } else {
                Intrinsics.checkNotNull(fileRecordEntity);
                if (fileRecordEntity.m7464a().size() >= 100) {
                    this.f15570d = m14769f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C9764c m14768e(String fileName, String validate, int i9, int i10) throws IllegalAccessException, IllegalArgumentException {
        C9764c c9764c;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        FileRecordEntity fileRecordEntity = this.f15570d;
        if (fileRecordEntity != null) {
            FileInfoEntity fileInfoEntity = new FileInfoEntity(0L, fileName, i9, i10, validate);
            fileInfoEntity.m7454d().m13190w(fileRecordEntity);
            fileInfoEntity.m7457g();
            fileRecordEntity.m7464a().add(fileInfoEntity);
            fileRecordEntity.m7468e();
            c9764c = new C9764c(fileRecordEntity.getFileName(), fileRecordEntity.m7464a().m13175u(fileInfoEntity.getId()));
        } else {
            c9764c = null;
        }
        m14767g();
        return c9764c;
    }

    /* renamed from: f */
    public final FileRecordEntity m14769f() {
        RecordEntity recordEntity = this.f15569c;
        if (recordEntity == null) {
            return null;
        }
        FileRecordEntity fileRecordEntity = new FileRecordEntity(0L, UUID.randomUUID() + "_file.bin", "");
        recordEntity.m7631c().add(fileRecordEntity);
        recordEntity.m7638j();
        return fileRecordEntity;
    }

    /* renamed from: h */
    public final FileRecordEntity m14770h() {
        ToMany toManyM7631c;
        FileRecordEntity fileRecordEntity;
        RecordEntity recordEntity = this.f15569c;
        return (recordEntity == null || (toManyM7631c = recordEntity.m7631c()) == null || (fileRecordEntity = (FileRecordEntity) CollectionsKt.lastOrNull((List) toManyM7631c)) == null || fileRecordEntity.m7464a().size() >= 100) ? m14769f() : fileRecordEntity;
    }

    /* renamed from: i */
    public final void m14771i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f15569c = recordEntity;
        this.f15570d = m14770h();
    }
}
