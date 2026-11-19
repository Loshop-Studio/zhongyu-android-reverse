package com.p040uc.crashsdk.p041a;

import com.p040uc.crashsdk.C3298a;
import com.p040uc.crashsdk.C3307b;
import com.p040uc.crashsdk.C3310e;
import com.p040uc.crashsdk.C3311f;
import com.p040uc.crashsdk.export.ExitType;

/* renamed from: com.uc.crashsdk.a.e */
/* loaded from: classes2.dex */
public class RunnableC3303e implements Runnable {

    /* renamed from: a */
    static final /* synthetic */ boolean f1349a = true;

    /* renamed from: b */
    private final int f1350b;

    /* renamed from: c */
    private final Object[] f1351c;

    public RunnableC3303e(int i4) {
        this.f1350b = i4;
        this.f1351c = null;
    }

    /* renamed from: a */
    public final boolean m2351a() {
        int i4 = this.f1350b;
        if (i4 == 451 || i4 == 452) {
            return C3310e.m2596b(i4, this.f1351c);
        }
        switch (i4) {
            case 351:
            case 352:
            case 353:
            case 354:
                return C3306h.m2419b(i4, this.f1351c);
            default:
                switch (i4) {
                    case 751:
                    case 752:
                    case 753:
                        return C3311f.m2675a(i4, this.f1351c);
                    default:
                        C3299a.m2324d("crashsdk", "Unknown sync runnable: " + toString());
                        if (f1349a) {
                            return false;
                        }
                        throw new AssertionError();
                }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i4 = this.f1350b;
        if (i4 == 10) {
            C3304f.m2354a(i4, this.f1351c);
            return;
        }
        if (i4 == 500) {
            C3302d.m2344a(i4);
            return;
        }
        if (i4 == 700) {
            C3311f.m2682b(i4);
            return;
        }
        if (i4 == 800) {
            C3305g.m2366a(i4);
            return;
        }
        if (i4 == 201 || i4 == 202) {
            C3298a.m2289a(i4);
            return;
        }
        switch (i4) {
            case 100:
            case 101:
            case 102:
            case ExitType.UNEXP_REASON_ANR /* 103 */:
            case 104:
                C3307b.m2474a(i4);
                return;
            default:
                switch (i4) {
                    case 301:
                    case 302:
                    case 303:
                        C3306h.m2403a(i4, this.f1351c);
                        return;
                    default:
                        switch (i4) {
                            case 401:
                            case 402:
                            case 403:
                                break;
                            default:
                                switch (i4) {
                                    case 405:
                                    case 406:
                                    case 407:
                                    case 408:
                                    case 409:
                                    case 410:
                                    case 411:
                                    case 412:
                                    case 413:
                                    case 414:
                                    case 415:
                                    case 416:
                                        break;
                                    default:
                                        C3299a.m2324d("crashsdk", "Unknown async runnable: " + toString());
                                        if (!f1349a) {
                                            throw new AssertionError();
                                        }
                                        return;
                                }
                        }
                        C3310e.m2561a(i4, this.f1351c);
                        return;
                }
        }
    }

    public String toString() {
        return super.toString() + "@action_" + this.f1350b;
    }

    public RunnableC3303e(int i4, Object[] objArr) {
        this.f1350b = i4;
        this.f1351c = objArr;
    }
}
