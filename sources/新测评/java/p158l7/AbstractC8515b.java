package p158l7;

import com.zykj.message.server.bean.Status;

/* renamed from: l7.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8515b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f14128a;

    static {
        int[] iArr = new int[Status.values().length];
        f14128a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
