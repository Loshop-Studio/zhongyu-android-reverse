package p144y1;

import com.zykj.message.server.bean.Status;

/* renamed from: y1.b */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4686b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f6006a;

    static {
        int[] iArr = new int[Status.values().length];
        f6006a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
