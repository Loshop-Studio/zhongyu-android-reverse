package p145k7;

import com.zykj.message.server.bean.Status;

/* renamed from: k7.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7898a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f13771a;

    static {
        int[] iArr = new int[Status.values().length];
        f13771a = iArr;
        iArr[Status.LOGIN.ordinal()] = 1;
        iArr[Status.LOGOUT.ordinal()] = 2;
        iArr[Status.CRACK.ordinal()] = 3;
    }
}
