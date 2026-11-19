package p318z3;

import com.zykj.message.server.bean.Status;

/* renamed from: z3.a */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC10708a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f21253a;

    static {
        int[] iArr = new int[Status.values().length];
        f21253a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
