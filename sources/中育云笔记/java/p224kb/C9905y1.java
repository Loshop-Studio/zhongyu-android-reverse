package p224kb;

import com.zykj.view.board.board.AbstractC8850l;
import com.zykj.view.board.board.AbstractC8855q;
import com.zykj.view.board.board.AbstractC8856r;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: kb.y1 */
/* loaded from: classes6.dex */
public final class C9905y1 {

    /* renamed from: a */
    public final AbstractC8855q f23226a;

    /* renamed from: b */
    public final AbstractC8856r f23227b;

    /* renamed from: c */
    public final AbstractC8850l f23228c;

    public C9905y1(AbstractC8855q mainToolType, AbstractC8856r minorToolType, AbstractC8850l expandStatus) {
        AbstractC9979u.m20294g(mainToolType, "mainToolType");
        AbstractC9979u.m20294g(minorToolType, "minorToolType");
        AbstractC9979u.m20294g(expandStatus, "expandStatus");
        this.f23226a = mainToolType;
        this.f23227b = minorToolType;
        this.f23228c = expandStatus;
    }

    /* renamed from: a */
    public final AbstractC8850l m19977a() {
        return this.f23228c;
    }

    /* renamed from: b */
    public final AbstractC8855q m19978b() {
        return this.f23226a;
    }

    /* renamed from: c */
    public final AbstractC8856r m19979c() {
        return this.f23227b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9905y1)) {
            return false;
        }
        C9905y1 c9905y1 = (C9905y1) obj;
        return AbstractC9979u.m20289b(this.f23226a, c9905y1.f23226a) && AbstractC9979u.m20289b(this.f23227b, c9905y1.f23227b) && AbstractC9979u.m20289b(this.f23228c, c9905y1.f23228c);
    }

    public int hashCode() {
        return (((this.f23226a.hashCode() * 31) + this.f23227b.hashCode()) * 31) + this.f23228c.hashCode();
    }

    public String toString() {
        return "SimpleUIState(mainToolType=" + this.f23226a + ", minorToolType=" + this.f23227b + ", expandStatus=" + this.f23228c + ")";
    }
}
