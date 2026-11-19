package p295y4;

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
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p087f4.C7437b;
import p285x4.AbstractC9848a;

/* renamed from: y4.r */
/* loaded from: classes4.dex */
public final class C9923r extends AbstractC9848a {

    /* renamed from: e */
    public static final a f17723e = new a(null);

    /* renamed from: c */
    public RecordEntity f17724c;

    /* renamed from: d */
    public TextRecordEntity f17725d;

    /* renamed from: y4.r$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.TextSource m16749a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.TextSource record = EzySource.TextSource.m8400u(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9923r() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m16744g() {
        try {
            TextRecordEntity textRecordEntity = this.f17725d;
            if (textRecordEntity == null) {
                this.f17725d = m16746f();
            } else {
                Intrinsics.checkNotNull(textRecordEntity);
                if (textRecordEntity.m6573c().size() >= 100) {
                    this.f17725d = m16746f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C7437b m16745e(String content, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        C7437b c7437b;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(paint, "paint");
        TextRecordEntity textRecordEntity = this.f17725d;
        if (textRecordEntity != null) {
            TextInfoEntity textInfoEntity = new TextInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.m7973v(), paint.m7972u(), content);
            textInfoEntity.m6560d().m13071t(textRecordEntity);
            textInfoEntity.m6564h();
            textRecordEntity.m6573c().add(textInfoEntity);
            textRecordEntity.m6575e();
            c7437b = new C7437b(textRecordEntity.getFileName(), textRecordEntity.m6573c().m13053r(textInfoEntity.getId()));
        } else {
            c7437b = null;
        }
        m16744g();
        return c7437b;
    }

    /* renamed from: f */
    public final TextRecordEntity m16746f() {
        RecordEntity recordEntity = this.f17724c;
        if (recordEntity == null) {
            return null;
        }
        TextRecordEntity textRecordEntity = new TextRecordEntity(0L, UUID.randomUUID() + "_text.bin", "");
        recordEntity.m6534h().add(textRecordEntity);
        recordEntity.m6536j();
        return textRecordEntity;
    }

    /* renamed from: h */
    public final TextRecordEntity m16747h() {
        ToMany toManyM6534h;
        TextRecordEntity textRecordEntity;
        RecordEntity recordEntity = this.f17724c;
        return (recordEntity == null || (toManyM6534h = recordEntity.m6534h()) == null || (textRecordEntity = (TextRecordEntity) CollectionsKt.lastOrNull((List) toManyM6534h)) == null || textRecordEntity.m6573c().size() >= 100) ? m16746f() : textRecordEntity;
    }

    /* renamed from: i */
    public final void m16748i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f17724c = recordEntity;
        this.f17725d = m16747h();
    }
}
