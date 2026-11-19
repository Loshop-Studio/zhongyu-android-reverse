package p359u6;

import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC11370a {

    /* renamed from: a */
    public static final ArrayList f27182a = new ArrayList();

    /* renamed from: b */
    public static final ArrayList f27183b = new ArrayList();

    /* renamed from: c */
    public static final ArrayList f27184c = new ArrayList();

    /* renamed from: d */
    public static final ArrayList f27185d = new ArrayList();

    /* renamed from: e */
    public static LocalMediaFolder f27186e;

    /* renamed from: a */
    public static void m25293a(List list) {
        if (list != null) {
            m25297e();
            f27185d.addAll(list);
        }
    }

    /* renamed from: b */
    public static void m25294b(ArrayList arrayList) {
        if (arrayList != null) {
            m25298f();
            f27184c.addAll(arrayList);
        }
    }

    /* renamed from: c */
    public static synchronized void m25295c(LocalMedia localMedia) {
        f27182a.add(localMedia);
    }

    /* renamed from: d */
    public static void m25296d(ArrayList arrayList) {
        m25299g();
        f27183b.addAll(arrayList);
    }

    /* renamed from: e */
    public static void m25297e() {
        ArrayList arrayList = f27185d;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    /* renamed from: f */
    public static void m25298f() {
        ArrayList arrayList = f27184c;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    /* renamed from: g */
    public static void m25299g() {
        ArrayList arrayList = f27183b;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    /* renamed from: h */
    public static synchronized void m25300h() {
        ArrayList arrayList = f27182a;
        if (arrayList.size() > 0) {
            arrayList.clear();
        }
    }

    /* renamed from: i */
    public static ArrayList m25301i() {
        return f27185d;
    }

    /* renamed from: j */
    public static LocalMediaFolder m25302j() {
        return f27186e;
    }

    /* renamed from: k */
    public static ArrayList m25303k() {
        return f27184c;
    }

    /* renamed from: l */
    public static int m25304l() {
        return f27182a.size();
    }

    /* renamed from: m */
    public static ArrayList m25305m() {
        return f27183b;
    }

    /* renamed from: n */
    public static synchronized ArrayList m25306n() {
        return f27182a;
    }

    /* renamed from: o */
    public static String m25307o() {
        ArrayList arrayList = f27182a;
        return arrayList.size() > 0 ? ((LocalMedia) arrayList.get(0)).m9397t() : "";
    }

    /* renamed from: p */
    public static void m25308p(LocalMediaFolder localMediaFolder) {
        f27186e = localMediaFolder;
    }
}
