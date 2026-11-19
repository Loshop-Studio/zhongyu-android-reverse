package p422y9;

import ba.AbstractC5179a;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: y9.l */
/* loaded from: classes5.dex */
public final class C11933l {

    /* renamed from: a */
    public final AbstractC5179a f28296a;

    /* renamed from: b */
    public final int f28297b;

    /* renamed from: c */
    public final BackgroundLineConfig f28298c;

    public C11933l(AbstractC5179a rootGraph, int i10, BackgroundLineConfig backgroundLineConfig) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        AbstractC9979u.m20294g(backgroundLineConfig, "backgroundLineConfig");
        this.f28296a = rootGraph;
        this.f28297b = i10;
        this.f28298c = backgroundLineConfig;
    }

    /* renamed from: a */
    public final int m26485a() {
        return this.f28297b;
    }

    /* renamed from: b */
    public final BackgroundLineConfig m26486b() {
        return this.f28298c;
    }

    /* renamed from: c */
    public final AbstractC5179a m26487c() {
        return this.f28296a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11933l)) {
            return false;
        }
        C11933l c11933l = (C11933l) obj;
        return AbstractC9979u.m20289b(this.f28296a, c11933l.f28296a) && this.f28297b == c11933l.f28297b && AbstractC9979u.m20289b(this.f28298c, c11933l.f28298c);
    }

    public int hashCode() {
        return (((this.f28296a.hashCode() * 31) + Integer.hashCode(this.f28297b)) * 31) + this.f28298c.hashCode();
    }

    public String toString() {
        return "HistoryData(rootGraph=" + this.f28296a + ", backgroundColor=" + this.f28297b + ", backgroundLineConfig=" + this.f28298c + ')';
    }
}
