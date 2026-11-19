package p189n5;

import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.dataRecorder.AudioRecord;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyRouterRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n5.c */
/* loaded from: classes4.dex */
public final class C9097c {

    /* renamed from: d */
    public static final a f15322d = new a(null);

    /* renamed from: a */
    public RecordEntity f15323a;

    /* renamed from: b */
    public final CommandRecord f15324b;

    /* renamed from: c */
    public final AudioRecord f15325c;

    /* renamed from: n5.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m14637a(String pageRootPath, DocumentType type) {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(type, "type");
            String strM14638b = m14638b(pageRootPath);
            String strName = type.name();
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = strName.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String absolutePath = new File(strM14638b, lowerCase).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "File(\n                ge…           ).absolutePath");
            return absolutePath;
        }

        /* renamed from: b */
        public final String m14638b(String str) {
            String absolutePath = new File(new File(str).getParent(), "res").getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "File(File(pageRootPath).…E_RES_IMAGE).absolutePath");
            return absolutePath;
        }

        /* renamed from: c */
        public final EzyRouterRecord.RouterRecord m14639c(String path) throws IOException {
            Intrinsics.checkNotNullParameter(path, "path");
            File file = new File(path, "router.bin");
            if (!file.exists()) {
                throw new FileNotFoundException(path);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzyRouterRecord.RouterRecord record = EzyRouterRecord.RouterRecord.m9212X(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9097c(C9099e timeRecord) {
        Intrinsics.checkNotNullParameter(timeRecord, "timeRecord");
        this.f15324b = new CommandRecord(timeRecord);
        this.f15325c = new AudioRecord(timeRecord);
    }

    /* renamed from: a */
    public final AudioRecord m14633a() {
        return this.f15325c;
    }

    /* renamed from: b */
    public final boolean m14634b() {
        return this.f15324b.m7979U();
    }

    /* renamed from: c */
    public final CommandRecord m14635c() {
        return this.f15324b;
    }

    /* renamed from: d */
    public final void m14636d(RecordEntity record) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.f15323a = record;
        this.f15324b.m7985d0(record);
        this.f15325c.m7931i(record);
    }
}
