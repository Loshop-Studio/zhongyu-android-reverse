package p208ja;

import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.board.EzyPaint;
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

/* renamed from: ja.r */
/* loaded from: classes5.dex */
public final class C9707r extends AbstractC9617a {

    /* renamed from: e */
    public static final a f22592e = new a(null);

    /* renamed from: c */
    public RecordEntity f22593c;

    /* renamed from: d */
    public TextRecordEntity f22594d;

    /* renamed from: ja.r$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final EzySource.TextSource m19208a(String pageRootPath, String fileName) throws IOException {
            AbstractC9979u.m20294g(pageRootPath, "pageRootPath");
            AbstractC9979u.m20294g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.TextSource record = EzySource.TextSource.m16179p(fileInputStream);
            fileInputStream.close();
            AbstractC9979u.m20293f(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9707r() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m19203g() {
        try {
            TextRecordEntity textRecordEntity = this.f22594d;
            if (textRecordEntity == null) {
                this.f22594d = m19205f();
            } else {
                AbstractC9979u.m20291d(textRecordEntity);
                if (textRecordEntity.m14303c().size() >= 100) {
                    this.f22594d = m19205f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C10763c m19204e(String content, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        C10763c c10763c;
        AbstractC9979u.m20294g(content, "content");
        AbstractC9979u.m20294g(paint, "paint");
        TextRecordEntity textRecordEntity = this.f22594d;
        if (textRecordEntity != null) {
            TextInfoEntity textInfoEntity = new TextInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.m15724r(), paint.m15723p(), content);
            textInfoEntity.m14290d().m19043o(textRecordEntity);
            textInfoEntity.m14294h();
            textRecordEntity.m14303c().add(textInfoEntity);
            textRecordEntity.m14305e();
            c10763c = new C10763c(textRecordEntity.m14301a(), textRecordEntity.m14303c().m19024m(textInfoEntity.m14289c()));
        } else {
            c10763c = null;
        }
        m19203g();
        return c10763c;
    }

    /* renamed from: f */
    public final TextRecordEntity m19205f() {
        RecordEntity recordEntity = this.f22593c;
        if (recordEntity == null) {
            return null;
        }
        TextRecordEntity textRecordEntity = new TextRecordEntity(0L, UUID.randomUUID() + "_text.bin", "");
        recordEntity.m14264h().add(textRecordEntity);
        recordEntity.m14266j();
        return textRecordEntity;
    }

    /* renamed from: h */
    public final TextRecordEntity m19206h() {
        ToMany toManyM14264h;
        TextRecordEntity textRecordEntity;
        RecordEntity recordEntity = this.f22593c;
        return (recordEntity == null || (toManyM14264h = recordEntity.m14264h()) == null || (textRecordEntity = (TextRecordEntity) AbstractC10947g0.m23957z0(toManyM14264h)) == null || textRecordEntity.m14303c().size() >= 100) ? m19205f() : textRecordEntity;
    }

    /* renamed from: i */
    public final void m19207i(RecordEntity recordEntity) {
        AbstractC9979u.m20294g(recordEntity, "recordEntity");
        this.f22593c = recordEntity;
        this.f22594d = m19206h();
    }
}
