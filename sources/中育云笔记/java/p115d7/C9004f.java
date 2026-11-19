package p115d7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: d7.f */
/* loaded from: classes5.dex */
public class C9004f {

    /* renamed from: a */
    public String f20979a;

    /* renamed from: b */
    public List f20980b = new ArrayList();

    public C9004f(String str) {
        this.f20979a = str;
    }

    /* renamed from: a */
    public C9004f m17591a(C9000b c9000b) {
        this.f20980b.add(c9000b);
        return this;
    }

    /* renamed from: b */
    public String m17592b() { // 为 okgo.db 的四张表生成建表语句，包括 cookie 的三列复合主键。
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(this.f20979a);
        sb2.append('(');
        for (C9000b c9000b : this.f20980b) {
            if (c9000b.f20969c != null) {
                sb2.append("PRIMARY KEY (");
                for (String str : c9000b.f20969c) {
                    sb2.append(str);
                    sb2.append(",");
                }
                sb2.deleteCharAt(sb2.length() - 1);
                sb2.append(")");
            } else {
                sb2.append(c9000b.f20967a);
                sb2.append(" ");
                sb2.append(c9000b.f20968b);
                if (c9000b.f20971e) {
                    sb2.append(" NOT NULL");
                }
                if (c9000b.f20970d) {
                    sb2.append(" PRIMARY KEY");
                }
                if (c9000b.f20972f) {
                    sb2.append(" AUTOINCREMENT");
                }
                sb2.append(",");
            }
        }
        if (sb2.toString().endsWith(",")) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: c */
    public int m17593c() {
        return this.f20980b.size();
    }

    /* renamed from: d */
    public int m17594d(String str) {
        int iM17593c = m17593c();
        for (int i10 = 0; i10 < iM17593c; i10++) {
            if (((C9000b) this.f20980b.get(i10)).f20967a.equals(str)) {
                return i10;
            }
        }
        return -1;
    }
}
