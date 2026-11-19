package com.p068uc.crashsdk.p069a;

import anet.channel.util.HttpConstant;
import com.p068uc.crashsdk.C1814a;
import com.p068uc.crashsdk.C1823b;
import com.p068uc.crashsdk.C1826e;
import com.p068uc.crashsdk.C1827f;
import com.taobao.accs.ErrorCode;

/* renamed from: com.uc.crashsdk.a.e */
/* loaded from: classes.dex */
public class RunnableC1819e implements Runnable {

    /* renamed from: a */
    static final /* synthetic */ boolean f7941a = true;

    /* renamed from: b */
    private final int f7942b;

    /* renamed from: c */
    private final Object[] f7943c;

    public RunnableC1819e(int i4) {
        this.f7942b = i4;
        this.f7943c = null;
    }

    /* renamed from: a */
    public final boolean m6274a() {
        int i4 = this.f7942b;
        if (i4 == 451 || i4 == 452) {
            return C1826e.m6519b(i4, this.f7943c);
        }
        switch (i4) {
            case 351:
            case 352:
            case 353:
            case 354:
                return C1822h.m6342b(i4, this.f7943c);
            default:
                switch (i4) {
                    case 751:
                    case 752:
                    case 753:
                        return C1827f.m6598a(i4, this.f7943c);
                    default:
                        C1815a.m6247d("crashsdk", "Unknown sync runnable: " + toString());
                        if (f7941a) {
                            return false;
                        }
                        throw new AssertionError();
                }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i4 = this.f7942b;
        if (i4 == 10) {
            C1820f.m6277a(i4, this.f7943c);
            return;
        }
        if (i4 == 500) {
            C1818d.m6267a(i4);
            return;
        }
        if (i4 == 700) {
            C1827f.m6605b(i4);
            return;
        }
        if (i4 == 800) {
            C1821g.m6289a(i4);
            return;
        }
        if (i4 == 201 || i4 == 202) {
            C1814a.m6212a(i4);
            return;
        }
        switch (i4) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
                C1823b.m6397a(i4);
                return;
            default:
                switch (i4) {
                    case 301:
                    case ErrorCode.DM_DEVICEID_INVALID /* 302 */:
                    case ErrorCode.DM_APPKEY_INVALID /* 303 */:
                        C1822h.m6326a(i4, this.f7943c);
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
                                    case HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE /* 416 */:
                                        break;
                                    default:
                                        C1815a.m6247d("crashsdk", "Unknown async runnable: " + toString());
                                        if (!f7941a) {
                                            throw new AssertionError();
                                        }
                                        return;
                                }
                        }
                        C1826e.m6484a(i4, this.f7943c);
                        return;
                }
        }
    }

    public String toString() {
        return super.toString() + "@action_" + this.f7942b;
    }

    public RunnableC1819e(int i4, Object[] objArr) {
        this.f7942b = i4;
        this.f7943c = objArr;
    }
}
