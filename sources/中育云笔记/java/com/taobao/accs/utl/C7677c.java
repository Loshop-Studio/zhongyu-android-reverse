package com.taobao.accs.utl;

import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IAppReceiverV1;
import com.taobao.accs.IAppReceiverV2;
import java.util.Map;

/* renamed from: com.taobao.accs.utl.c */
/* loaded from: classes5.dex */
public class C7677c extends IAppReceiverV2 {

    /* renamed from: a */
    private final IAppReceiver f13228a;

    /* renamed from: b */
    private boolean f13229b = false;

    private C7677c(IAppReceiver iAppReceiver) {
        this.f13228a = iAppReceiver;
    }

    /* renamed from: a */
    public static IAppReceiver m10164a(IAppReceiver iAppReceiver) {
        if (iAppReceiver == null) {
            return null;
        }
        return new C7677c(iAppReceiver);
    }

    /* renamed from: b */
    public static void m10168b(ErrorCode errorCode, IAppReceiver iAppReceiver, String str) {
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onBindUser(str, errorCode.getCodeInt(), errorCode.getMsg());
        } else {
            iAppReceiver.onBindUser(str, errorCode.getCodeInt());
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof C7677c ? this.f13228a.equals(((C7677c) obj).f13228a) : this.f13228a.equals(obj);
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public Map<String, String> getAllServices() {
        return this.f13228a.getAllServices();
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public String getService(String str) {
        return this.f13228a.getService(str);
    }

    public int hashCode() {
        return this.f13228a.hashCode();
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onBindApp(int i10) {
        if (this.f13229b) {
            return;
        }
        this.f13229b = true;
        this.f13228a.onBindApp(i10);
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onBindUser(String str, int i10) {
        this.f13228a.onBindUser(str, i10);
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onData(String str, String str2, byte[] bArr) {
        this.f13228a.onData(str, str2, bArr);
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onSendData(String str, int i10) {
        this.f13228a.onSendData(str, i10);
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindApp(int i10) {
        if (this.f13229b) {
            this.f13229b = false;
            this.f13228a.onUnbindApp(i10);
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindUser(int i10) {
        this.f13228a.onUnbindUser(i10);
    }

    /* renamed from: a */
    public static void m10166a(ErrorCode errorCode, IAppReceiver iAppReceiver, String str) {
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onBindApp(errorCode.getCodeInt(), errorCode.getMsg(), str);
        } else if (iAppReceiver instanceof IAppReceiverV1) {
            ((IAppReceiverV1) iAppReceiver).onBindApp(errorCode.getCodeInt(), str);
        } else {
            iAppReceiver.onBindApp(errorCode.getCodeInt());
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onBindUser(String str, int i10, String str2) {
        IAppReceiver iAppReceiver = this.f13228a;
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onBindUser(str, i10, str2);
        } else {
            iAppReceiver.onBindUser(str, i10);
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onUnbindUser(int i10, String str) {
        IAppReceiver iAppReceiver = this.f13228a;
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onUnbindUser(i10, str);
        } else {
            iAppReceiver.onUnbindUser(i10);
        }
    }

    /* renamed from: b */
    public static void m10167b(ErrorCode errorCode, IAppReceiver iAppReceiver) {
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onUnbindUser(errorCode.getCodeInt(), errorCode.getMsg());
        } else {
            iAppReceiver.onUnbindUser(errorCode.getCodeInt());
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1
    public void onBindApp(int i10, String str) {
        if (this.f13229b) {
            return;
        }
        this.f13229b = true;
        IAppReceiver iAppReceiver = this.f13228a;
        if (iAppReceiver instanceof IAppReceiverV1) {
            ((IAppReceiverV1) iAppReceiver).onBindApp(i10, str);
        } else {
            iAppReceiver.onBindApp(i10);
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onUnbindApp(int i10, String str) {
        if (this.f13229b) {
            this.f13229b = false;
            IAppReceiver iAppReceiver = this.f13228a;
            if (iAppReceiver instanceof IAppReceiverV2) {
                ((IAppReceiverV2) iAppReceiver).onUnbindApp(i10, str);
            } else {
                iAppReceiver.onUnbindApp(i10);
            }
        }
    }

    /* renamed from: a */
    public static void m10165a(ErrorCode errorCode, IAppReceiver iAppReceiver) {
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onUnbindApp(errorCode.getCodeInt(), errorCode.getMsg());
        } else {
            iAppReceiver.onUnbindApp(errorCode.getCodeInt());
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onBindApp(int i10, String str, String str2) {
        if (this.f13229b) {
            return;
        }
        if (i10 == AccsErrorCode.SUCCESS.getCodeInt()) {
            this.f13229b = true;
        }
        IAppReceiver iAppReceiver = this.f13228a;
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onBindApp(i10, str, str2);
        } else if (iAppReceiver instanceof IAppReceiverV1) {
            ((IAppReceiverV1) iAppReceiver).onBindApp(i10, str2);
        } else {
            iAppReceiver.onBindApp(i10);
        }
    }
}
