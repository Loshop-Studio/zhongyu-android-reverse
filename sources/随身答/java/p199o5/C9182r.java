package p199o5;

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
import p189n5.AbstractC9095a;
import p272v4.C9764c;

/* renamed from: o5.r */
/* loaded from: classes4.dex */
public final class C9182r extends AbstractC9095a {

    /* renamed from: e */
    public static final a f15577e = new a(null);

    /* renamed from: c */
    public RecordEntity f15578c;

    /* renamed from: d */
    public TextRecordEntity f15579d;

    /* renamed from: o5.r$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EzySource.TextSource m14790a(String pageRootPath, String fileName) throws IOException {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.TextSource record = EzySource.TextSource.m9550x(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9182r() {
        super(null);
    }

    /* renamed from: g */
    private final synchronized void m14785g() {
        try {
            TextRecordEntity textRecordEntity = this.f15579d;
            if (textRecordEntity == null) {
                this.f15579d = m14787f();
            } else {
                Intrinsics.checkNotNull(textRecordEntity);
                if (textRecordEntity.m7675c().size() >= 100) {
                    this.f15579d = m14787f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final C9764c m14786e(String content, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        C9764c c9764c;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(paint, "paint");
        TextRecordEntity textRecordEntity = this.f15579d;
        if (textRecordEntity != null) {
            TextInfoEntity textInfoEntity = new TextInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.m9108y(), paint.m9107x(), content);
            textInfoEntity.m7662d().m13190w(textRecordEntity);
            textInfoEntity.m7666h();
            textRecordEntity.m7675c().add(textInfoEntity);
            textRecordEntity.m7677e();
            c9764c = new C9764c(textRecordEntity.getFileName(), textRecordEntity.m7675c().m13175u(textInfoEntity.getId()));
        } else {
            c9764c = null;
        }
        m14785g();
        return c9764c;
    }

    /* renamed from: f */
    public final TextRecordEntity m14787f() {
        RecordEntity recordEntity = this.f15578c;
        if (recordEntity == null) {
            return null;
        }
        TextRecordEntity textRecordEntity = new TextRecordEntity(0L, UUID.randomUUID() + "_text.bin", "");
        recordEntity.m7636h().add(textRecordEntity);
        recordEntity.m7638j();
        return textRecordEntity;
    }

    /* renamed from: h */
    public final TextRecordEntity m14788h() {
        ToMany toManyM7636h;
        TextRecordEntity textRecordEntity;
        RecordEntity recordEntity = this.f15578c;
        return (recordEntity == null || (toManyM7636h = recordEntity.m7636h()) == null || (textRecordEntity = (TextRecordEntity) CollectionsKt.lastOrNull((List) toManyM7636h)) == null || textRecordEntity.m7675c().size() >= 100) ? m14787f() : textRecordEntity;
    }

    /* renamed from: i */
    public final void m14789i(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f15578c = recordEntity;
        this.f15579d = m14788h();
    }
}
