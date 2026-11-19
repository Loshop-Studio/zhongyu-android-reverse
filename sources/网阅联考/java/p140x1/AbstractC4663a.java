package p140x1;

import com.zykj.message.server.bean.Status;

/* renamed from: x1.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4663a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f5960a;

    static {
        int[] iArr = new int[Status.values().length];
        f5960a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
