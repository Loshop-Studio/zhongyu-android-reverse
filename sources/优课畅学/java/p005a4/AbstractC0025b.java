package p005a4;

import com.zykj.message.server.bean.Status;

/* renamed from: a4.b */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC0025b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f73a;

    /* JADX INFO: Access modifiers changed from: package-private */
    static {
        int[] iArr = new int[Status.values().length];
        f73a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
