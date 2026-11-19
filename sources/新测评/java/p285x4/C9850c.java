package p285x4;

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

/* renamed from: x4.c */
/* loaded from: classes4.dex */
public final class C9850c {

    /* renamed from: d */
    public static final a f17405d = new a(null);

    /* renamed from: a */
    public RecordEntity f17406a;

    /* renamed from: b */
    public final CommandRecord f17407b;

    /* renamed from: c */
    public final AudioRecord f17408c;

    /* renamed from: x4.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m16497a(String pageRootPath, DocumentType type) {
            Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
            Intrinsics.checkNotNullParameter(type, "type");
            String strM16498b = m16498b(pageRootPath);
            String strName = type.name();
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = strName.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String absolutePath = new File(strM16498b, lowerCase).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "File(\n                ge…           ).absolutePath");
            return absolutePath;
        }

        /* renamed from: b */
        public final String m16498b(String str) {
            String absolutePath = new File(new File(str).getParent(), "res").getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "File(File(pageRootPath).…E_RES_IMAGE).absolutePath");
            return absolutePath;
        }

        /* renamed from: c */
        public final EzyRouterRecord.RouterRecord m16499c(String path) throws IOException {
            Intrinsics.checkNotNullParameter(path, "path");
            File file = new File(path, "router.bin");
            if (!file.exists()) {
                throw new FileNotFoundException(path);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzyRouterRecord.RouterRecord record = EzyRouterRecord.RouterRecord.m8077U(fileInputStream);
            fileInputStream.close();
            Intrinsics.checkNotNullExpressionValue(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9850c(C9852e timeRecord) {
        Intrinsics.checkNotNullParameter(timeRecord, "timeRecord");
        this.f17407b = new CommandRecord(timeRecord);
        this.f17408c = new AudioRecord(timeRecord);
    }

    /* renamed from: a */
    public final AudioRecord m16494a() {
        return this.f17408c;
    }

    /* renamed from: b */
    public final CommandRecord m16495b() {
        return this.f17407b;
    }

    /* renamed from: c */
    public final void m16496c(RecordEntity record) {
        Intrinsics.checkNotNullParameter(record, "record");
        this.f17406a = record;
        this.f17407b.m6872c0(record);
        this.f17408c.m6819i(record);
    }
}
