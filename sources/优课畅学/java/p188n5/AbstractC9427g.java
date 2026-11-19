package p188n5;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.rtmp.TXBitrateItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p143j5.C9016c;
import p143j5.C9018e;
import p143j5.C9020g;

/* renamed from: n5.g */
/* loaded from: classes5.dex */
public abstract class AbstractC9427g {
    /* renamed from: a */
    public static C9020g m17278a(TXBitrateItem tXBitrateItem, int i10) {
        C9020g c9020g = new C9020g();
        c9020g.f17243b = tXBitrateItem.bitrate;
        c9020g.f17242a = tXBitrateItem.index;
        switch (i10) {
            case 0:
                c9020g.f17244c = "FLU";
                c9020g.f17245d = "流畅";
                break;
            case 1:
                c9020g.f17244c = "SD";
                c9020g.f17245d = "标清";
                break;
            case 2:
                c9020g.f17244c = "HD";
                c9020g.f17245d = "高清";
                break;
            case 3:
                c9020g.f17244c = "FHD";
                c9020g.f17245d = "超清";
                break;
            case 4:
                c9020g.f17244c = "2K";
                c9020g.f17245d = "2K";
                break;
            case 5:
                c9020g.f17244c = "4K";
                c9020g.f17245d = "4K";
                break;
            case 6:
                c9020g.f17244c = "8K";
                c9020g.f17245d = "8K";
                break;
        }
        return c9020g;
    }

    /* renamed from: b */
    public static C9020g m17279b(TXBitrateItem tXBitrateItem, List list) {
        C9020g c9020g = new C9020g();
        c9020g.f17243b = tXBitrateItem.bitrate;
        c9020g.f17242a = tXBitrateItem.index;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9018e c9018e = (C9018e) it.next();
            int i10 = c9018e.f17237c;
            int i11 = tXBitrateItem.width;
            if ((i10 == i11 && c9018e.f17238d == tXBitrateItem.height) || (i10 == tXBitrateItem.height && c9018e.f17238d == i11)) {
                if ("video".equalsIgnoreCase(c9018e.f17236b)) {
                    c9020g.f17245d = c9018e.f17235a;
                    return c9020g;
                }
            }
        }
        TXCLog.m4994i("TCVideoQualityUtil", "error: could not get quality name!");
        return c9020g;
    }

    /* renamed from: c */
    public static C9020g m17280c(C9016c c9016c) {
        C9020g c9020g = new C9020g();
        c9020g.f17243b = c9016c.m15669a();
        c9020g.f17244c = c9016c.f17230g;
        c9020g.f17245d = c9016c.f17231h;
        c9020g.f17246e = c9016c.f17232i;
        c9020g.f17242a = -1;
        return c9020g;
    }

    /* renamed from: d */
    public static C9020g m17281d(C9016c c9016c, String str) {
        C9020g c9020g = new C9020g();
        c9020g.f17243b = c9016c.m15669a();
        if (str.equals("FLU")) {
            c9020g.f17244c = "FLU";
            c9020g.f17245d = "流畅";
        } else if (str.equals("SD")) {
            c9020g.f17244c = "SD";
            c9020g.f17245d = "标清";
        } else if (str.equals("HD")) {
            c9020g.f17244c = "HD";
            c9020g.f17245d = "高清";
        } else if (str.equals("FHD")) {
            c9020g.f17244c = "FHD";
            c9020g.f17245d = "全高清";
        } else if (str.equals("2K")) {
            c9020g.f17244c = "2K";
            c9020g.f17245d = "2K";
        } else if (str.equals("4K")) {
            c9020g.f17244c = "4K";
            c9020g.f17245d = "4K";
        }
        c9020g.f17246e = c9016c.f17232i;
        c9020g.f17242a = -1;
        return c9020g;
    }

    /* renamed from: e */
    public static List m17282e(HashMap map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(m17280c((C9016c) map.get((String) it.next())));
        }
        return arrayList;
    }
}
