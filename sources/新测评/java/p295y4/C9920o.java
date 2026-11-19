package p295y4;

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
import p087f4.C7437b;
import p285x4.AbstractC9848a;

/* renamed from: y4.o */
/* loaded from: classes4.dex */
public final class C9920o extends AbstractC9848a {

    /* renamed from: e */
    public static final a f17714e = new a(null);

    /* renamed from: c */
    public RecordEntity f17715c;

    /* renamed from: d */
    public FileRecordEntity f17716d;

    /* renamed from: y4.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.FileSource m16731a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.FileSource record = EzySource.FileSource.m8203u(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9920o() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m16726g() {
        try {
            FileRecordEntity fileRecordEntity = this.f17716d;
            if (fileRecordEntity == null) {
                this.f17716d = m16728f();
            } else {
                Intrinsics.checkNotNull(fileRecordEntity);
                if (fileRecordEntity.m6366a().size() >= 100) {
                    this.f17716d = m16728f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C7437b m16727e(String fileName, String validate, int i10, int i11) throws IllegalAccessException, IllegalArgumentException {
        C7437b c7437b;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(validate, "validate");
        FileRecordEntity fileRecordEntity = this.f17716d;
        if (fileRecordEntity != null) {
            FileInfoEntity fileInfoEntity = new FileInfoEntity(0L, fileName, i10, i11, validate);
            fileInfoEntity.m6356d().m13071t(fileRecordEntity);
            fileInfoEntity.m6359g();
            fileRecordEntity.m6366a().add(fileInfoEntity);
            fileRecordEntity.m6370e();
            c7437b = new C7437b(fileRecordEntity.getFileName(), fileRecordEntity.m6366a().m13053r(fileInfoEntity.getId()));
        } else {
            c7437b = null;
        }
        m16726g();
        return c7437b;
    }

    /* renamed from: f */
    public final FileRecordEntity m16728f() {
        RecordEntity recordEntity = this.f17715c;
        if (recordEntity == null) {
            return null;
        }
        FileRecordEntity fileRecordEntity = new FileRecordEntity(0L, UUID.randomUUID() + "_file.bin", "");
        recordEntity.m6529c().add(fileRecordEntity);
        recordEntity.m6536j();
        return fileRecordEntity;
    }

    /* renamed from: h */
    public final FileRecordEntity m16729h() {
        ToMany toManyM6529c;
        FileRecordEntity fileRecordEntity;
        RecordEntity recordEntity = this.f17715c;
        return (recordEntity == null || (toManyM6529c = recordEntity.m6529c()) == null || (fileRecordEntity = (FileRecordEntity) CollectionsKt.lastOrNull((List) toManyM6529c)) == null || fileRecordEntity.m6366a().size() >= 100) ? m16728f() : fileRecordEntity;
    }

    /* renamed from: i */
    public final void m16730i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f17715c = recordEntity;
        this.f17716d = m16729h();
    }
}
