package p087j1;

import java.sql.Timestamp;
import java.util.Date;
import p063g1.AbstractC5559g;

/* renamed from: j1.e */
/* loaded from: classes2.dex */
public final class C5736e extends AbstractC5559g {

    /* renamed from: c */
    public final /* synthetic */ int f9071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5736e(Class cls, int i) {
        super(cls);
        this.f9071c = i;
    }

    @Override // p063g1.AbstractC5559g
    /* renamed from: a */
    public final Date mo4903a(Date date) {
        switch (this.f9071c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
