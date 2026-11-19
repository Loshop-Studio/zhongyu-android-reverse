package p035c6;

import com.zykj.message.server.bean.Status;

/* renamed from: c6.b */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC5233b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f2472a;

    static {
        int[] iArr = new int[Status.values().length];
        f2472a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
