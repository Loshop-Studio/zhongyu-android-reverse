package p194ia;

import com.taobao.accs.common.Constants;
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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ia.c */
/* loaded from: classes5.dex */
public final class C9619c {

    /* renamed from: d */
    public static final a f22151d = new a(null);

    /* renamed from: a */
    public RecordEntity f22152a;

    /* renamed from: b */
    public final CommandRecord f22153b;

    /* renamed from: c */
    public final AudioRecord f22154c;

    /* renamed from: ia.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final String m18862a(String pageRootPath, DocumentType type) {
            AbstractC9979u.m20294g(pageRootPath, "pageRootPath");
            AbstractC9979u.m20294g(type, "type");
            String strM18863b = m18863b(pageRootPath);
            String strName = type.name();
            Locale ROOT = Locale.ROOT;
            AbstractC9979u.m20293f(ROOT, "ROOT");
            String lowerCase = strName.toLowerCase(ROOT);
            AbstractC9979u.m20293f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String absolutePath = new File(strM18863b, lowerCase).getAbsolutePath();
            AbstractC9979u.m20293f(absolutePath, "File(\n                ge…           ).absolutePath");
            return absolutePath;
        }

        /* renamed from: b */
        public final String m18863b(String str) {
            String absolutePath = new File(new File(str).getParent(), Constants.SEND_TYPE_RES).getAbsolutePath();
            AbstractC9979u.m20293f(absolutePath, "File(File(pageRootPath).…E_RES_IMAGE).absolutePath");
            return absolutePath;
        }

        /* renamed from: c */
        public final EzyRouterRecord.RouterRecord m18864c(String path) throws IOException {
            AbstractC9979u.m20294g(path, "path");
            File file = new File(path, "router.bin");
            if (!file.exists()) {
                throw new FileNotFoundException(path);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzyRouterRecord.RouterRecord record = EzyRouterRecord.RouterRecord.m15826U(fileInputStream);
            fileInputStream.close();
            AbstractC9979u.m20293f(record, "record");
            return record;
        }

        public a() {
        }
    }

    public C9619c(C9621e timeRecord) {
        AbstractC9979u.m20294g(timeRecord, "timeRecord");
        this.f22153b = new CommandRecord(timeRecord);
        this.f22154c = new AudioRecord(timeRecord);
    }

    /* renamed from: a */
    public final AudioRecord m18858a() {
        return this.f22154c;
    }

    /* renamed from: b */
    public final boolean m18859b() {
        return this.f22153b.m14603U();
    }

    /* renamed from: c */
    public final CommandRecord m18860c() {
        return this.f22153b;
    }

    /* renamed from: d */
    public final void m18861d(RecordEntity record) {
        AbstractC9979u.m20294g(record, "record");
        this.f22152a = record;
        this.f22153b.m14609d0(record);
        this.f22154c.m14555i(record);
    }
}
