package bb;

import com.zykj.message.server.bean.Status;

/* renamed from: bb.a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC5183a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f3051a;

    static {
        int[] iArr = new int[Status.values().length];
        f3051a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
