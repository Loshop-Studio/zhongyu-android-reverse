package p048cb;

import com.zykj.message.server.bean.Status;

/* renamed from: cb.c */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC5417c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f3500a;

    static {
        int[] iArr = new int[Status.values().length];
        f3500a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
