package com.taobao.sophix.p094c;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taobao.sophix.c.c */
/* loaded from: classes5.dex */
public class C7733c {

    /* renamed from: j */
    private static String f13363j = UUID.randomUUID().toString();

    /* renamed from: k */
    private static AtomicInteger f13364k = new AtomicInteger(0);

    /* renamed from: a */
    public String f13365a;

    /* renamed from: b */
    public int f13366b;

    /* renamed from: c */
    public String f13367c;

    /* renamed from: d */
    public int f13368d;

    /* renamed from: e */
    public long f13369e;

    /* renamed from: f */
    public int f13370f;

    /* renamed from: g */
    public long f13371g;

    /* renamed from: h */
    public int f13372h;

    /* renamed from: i */
    public int f13373i;

    public C7733c(int i10) {
        this.f13369e = -9999L;
        this.f13370f = -9999;
        this.f13371g = -9999L;
        this.f13372h = -9999;
        this.f13373i = -9999;
        this.f13365a = f13363j + "-" + f13364k.incrementAndGet();
        this.f13366b = i10;
    }

    /* renamed from: a */
    public void m10331a() {
        this.f13367c = null;
        this.f13369e = -9999L;
        this.f13373i = -9999;
    }

    /* renamed from: b */
    public String m10332b() {
        StringBuilder sb2 = new StringBuilder("path");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f13366b);
        if (this.f13369e != -9999) {
            sb2.append(",");
            sb2.append("cost");
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(this.f13369e);
        }
        if (this.f13371g != -9999) {
            sb2.append(",");
            sb2.append("dex");
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(this.f13371g);
        }
        if (this.f13370f != -9999) {
            sb2.append(",");
            sb2.append("genre");
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(this.f13370f);
        }
        if (this.f13372h != -9999) {
            sb2.append(",");
            sb2.append("load");
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(this.f13372h);
        }
        return sb2.toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PatchStat{");
        sb2.append("id='");
        sb2.append(this.f13365a);
        sb2.append('\'');
        sb2.append(", path=");
        sb2.append(this.f13366b);
        sb2.append(", status='");
        sb2.append(this.f13367c);
        sb2.append('\'');
        sb2.append(", version='");
        sb2.append(this.f13368d);
        sb2.append('\'');
        if (this.f13369e != -9999) {
            sb2.append(", cost=");
            sb2.append(this.f13369e);
        }
        if (this.f13370f != -9999) {
            sb2.append(", genre=");
            sb2.append(this.f13370f);
        }
        if (this.f13371g != -9999) {
            sb2.append(", dex=");
            sb2.append(this.f13371g);
        }
        if (this.f13372h != -9999) {
            sb2.append(", load=");
            sb2.append(this.f13372h);
        }
        if (this.f13373i != -9999) {
            sb2.append(", errorCode=");
            sb2.append(this.f13373i);
        }
        sb2.append('}');
        return sb2.toString();
    }

    public C7733c(C7733c c7733c) {
        this.f13369e = -9999L;
        this.f13370f = -9999;
        this.f13371g = -9999L;
        this.f13372h = -9999;
        this.f13373i = -9999;
        this.f13365a = c7733c.f13365a;
        this.f13366b = c7733c.f13366b;
        this.f13367c = c7733c.f13367c;
        this.f13368d = c7733c.f13368d;
        this.f13369e = c7733c.f13369e;
        this.f13370f = c7733c.f13370f;
        this.f13371g = c7733c.f13371g;
        this.f13372h = c7733c.f13372h;
        this.f13373i = c7733c.f13373i;
    }
}
