package p024b6;

import com.zykj.message.server.bean.Status;

/* renamed from: b6.a */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC5121a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2245a;

    static {
        int[] iArr = new int[Status.values().length];
        f2245a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
