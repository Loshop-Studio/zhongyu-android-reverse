package p115d7;

import android.content.ContentValues;
import android.database.Cursor;
import com.friday.common.entity.FileType;
import com.lzy.okgo.model.Progress;
import java.util.List;

/* renamed from: d7.e */
/* loaded from: classes5.dex */
public class C9003e extends AbstractC8999a {

    /* renamed from: d7.e$b */
    public static class b {

        /* renamed from: a */
        public static final C9003e f20978a = new C9003e();
    }

    /* renamed from: n */
    public static C9003e m17584n() {
        return b.f20978a;
    }

    @Override // p115d7.AbstractC8999a
    /* renamed from: c */
    public String mo17574c() {
        return "download";
    }

    /* renamed from: k */
    public Progress m17585k(String str) {
        return (Progress) m17578g("tag=?", new String[]{str});
    }

    @Override // p115d7.AbstractC8999a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ContentValues mo17573b(Progress progress) {
        return Progress.m9669c(progress);
    }

    /* renamed from: m */
    public List m17587m() {
        return m17577f(null, "status not in(?)", new String[]{FileType.PDF}, null, null, "date ASC", null);
    }

    @Override // p115d7.AbstractC8999a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Progress mo17576e(Cursor cursor) {
        return Progress.m9673g(cursor);
    }

    /* renamed from: p */
    public boolean m17589p(ContentValues contentValues, String str) {
        return m17581j(contentValues, "tag=?", new String[]{str});
    }

    public C9003e() {
        super(new C9001c());
    }
}
