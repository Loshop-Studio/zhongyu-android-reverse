package p141f2;

import com.taobao.accs.common.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p364uc.AbstractC11382b;

/* renamed from: f2.e */
/* loaded from: classes3.dex */
public final class C9168e {

    /* renamed from: a */
    public static final C9168e f21413a = new C9168e();

    /* renamed from: f2.e$a */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(((File) obj).getName(), ((File) obj2).getName());
        }
    }

    /* renamed from: a */
    public final boolean m18067a(File pageDir) {
        AbstractC9979u.m20294g(pageDir, "pageDir");
        return new File(pageDir, ".page_deleted").isFile();
    }

    /* renamed from: b */
    public final boolean m18068b(File pageDir) throws IOException {
        AbstractC9979u.m20294g(pageDir, "pageDir");
        if (!pageDir.isDirectory() && !pageDir.mkdirs()) {
            throw new IOException("无法创建页面删除标记目录：" + pageDir);
        }
        if (m18067a(pageDir)) {
            return false;
        }
        if (new File(pageDir, ".page_deleted").createNewFile()) {
            return true;
        }
        throw new IOException("无法创建页面删除标记：" + pageDir);
    }

    /* renamed from: c */
    public final List m18069c(File noteRootDir) {
        List listM24136n;
        AbstractC9979u.m20294g(noteRootDir, "noteRootDir");
        if (m18067a(noteRootDir)) {
            return AbstractC10978w.m24136n();
        }
        File[] fileArrListFiles = noteRootDir.listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory() && !AbstractC9979u.m20289b(file.getName(), Constants.SEND_TYPE_RES) && !AbstractC9979u.m20289b(file.getName(), "page_mdb")) {
                    arrayList.add(file);
                }
            }
            listM24136n = AbstractC10947g0.m23914P0(arrayList, new a());
        } else {
            listM24136n = null;
        }
        if (listM24136n == null) {
            listM24136n = AbstractC10978w.m24136n();
        }
        if (listM24136n.isEmpty()) {
            return AbstractC10976v.m24126e(noteRootDir);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM24136n) {
            File file2 = (File) obj;
            C9168e c9168e = f21413a;
            AbstractC9979u.m20291d(file2);
            if (!c9168e.m18067a(file2)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* renamed from: d */
    public final void m18070d(File pageDir) throws IOException {
        AbstractC9979u.m20294g(pageDir, "pageDir");
        File file = new File(pageDir, ".page_deleted");
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException("无法撤销页面删除标记：" + pageDir);
    }
}
