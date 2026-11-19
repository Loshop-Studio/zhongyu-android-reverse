package com.p071uc.crashsdk.p072a;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.p071uc.crashsdk.C6737a;
import com.p071uc.crashsdk.C6746b;
import com.p071uc.crashsdk.C6749e;
import com.p071uc.crashsdk.C6750f;

/* renamed from: com.uc.crashsdk.a.e */
/* loaded from: classes4.dex */
public class RunnableC6742e implements Runnable {

    /* renamed from: a */
    static final /* synthetic */ boolean f6347a = true;

    /* renamed from: b */
    private final int f6348b;

    /* renamed from: c */
    private final Object[] f6349c;

    public RunnableC6742e(int i9) {
        this.f6348b = i9;
        this.f6349c = null;
    }

    /* renamed from: a */
    public final boolean m5595a() {
        int i9 = this.f6348b;
        if (i9 == 451 || i9 == 452) {
            return C6749e.m5840b(i9, this.f6349c);
        }
        switch (i9) {
            case 351:
            case 352:
            case 353:
            case 354:
                return C6745h.m5663b(i9, this.f6349c);
            default:
                switch (i9) {
                    case 751:
                    case 752:
                    case 753:
                        return C6750f.m5919a(i9, this.f6349c);
                    default:
                        C6738a.m5568d("crashsdk", "Unknown sync runnable: " + toString());
                        if (f6347a) {
                            return false;
                        }
                        throw new AssertionError();
                }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i9 = this.f6348b;
        if (i9 == 10) {
            C6743f.m5598a(i9, this.f6349c);
            return;
        }
        if (i9 == 500) {
            C6741d.m5588a(i9);
            return;
        }
        if (i9 == 700) {
            C6750f.m5926b(i9);
            return;
        }
        if (i9 == 800) {
            C6744g.m5610a(i9);
            return;
        }
        if (i9 == 201 || i9 == 202) {
            C6737a.m5533a(i9);
            return;
        }
        switch (i9) {
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
                C6746b.m5718a(i9);
                return;
            default:
                switch (i9) {
                    case 301:
                    case 302:
                    case 303:
                        C6745h.m5647a(i9, this.f6349c);
                        return;
                    default:
                        switch (i9) {
                            case TypedValues.CycleType.TYPE_CURVE_FIT /* 401 */:
                            case TypedValues.CycleType.TYPE_VISIBILITY /* 402 */:
                            case TypedValues.CycleType.TYPE_ALPHA /* 403 */:
                                break;
                            default:
                                switch (i9) {
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
                                    case TypedValues.CycleType.TYPE_PATH_ROTATE /* 416 */:
                                        break;
                                    default:
                                        C6738a.m5568d("crashsdk", "Unknown async runnable: " + toString());
                                        if (!f6347a) {
                                            throw new AssertionError();
                                        }
                                        return;
                                }
                        }
                        C6749e.m5805a(i9, this.f6349c);
                        return;
                }
        }
    }

    public String toString() {
        return super.toString() + "@action_" + this.f6348b;
    }

    public RunnableC6742e(int i9, Object[] objArr) {
        this.f6348b = i9;
        this.f6349c = objArr;
    }
}
