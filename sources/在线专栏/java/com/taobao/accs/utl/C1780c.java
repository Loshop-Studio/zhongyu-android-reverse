package com.taobao.accs.utl;

import com.alibaba.sdk.android.error.ErrorCode;
import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IAppReceiverV1;
import com.taobao.accs.IAppReceiverV2;
import java.util.Map;

/* renamed from: com.taobao.accs.utl.c */
/* loaded from: classes.dex */
public class C1780c extends IAppReceiverV2 {

    /* renamed from: a */
    private final IAppReceiver f7830a;

    /* renamed from: b */
    private boolean f7831b = false;

    private C1780c(IAppReceiver iAppReceiver) {
        this.f7830a = iAppReceiver;
    }

    /* renamed from: a */
    public static IAppReceiver m6138a(IAppReceiver iAppReceiver) {
        if (iAppReceiver == null) {
            return null;
        }
        return new C1780c(iAppReceiver);
    }

    /* renamed from: b */
    public static void m6142b(ErrorCode errorCode, IAppReceiver iAppReceiver, String str) {
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onBindUser(str, errorCode.getCodeInt(), errorCode.getMsg());
        } else {
            iAppReceiver.onBindUser(str, errorCode.getCodeInt());
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof C1780c ? this.f7830a.equals(((C1780c) obj).f7830a) : this.f7830a.equals(obj);
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public Map<String, String> getAllServices() {
        return this.f7830a.getAllServices();
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public String getService(String str) {
        return this.f7830a.getService(str);
    }

    public int hashCode() {
        return this.f7830a.hashCode();
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onBindApp(int i4) {
        if (this.f7831b) {
            return;
        }
        this.f7831b = true;
        this.f7830a.onBindApp(i4);
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onBindUser(String str, int i4) {
        this.f7830a.onBindUser(str, i4);
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onData(String str, String str2, byte[] bArr) {
        this.f7830a.onData(str, str2, bArr);
    }

    @Override // com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onSendData(String str, int i4) {
        this.f7830a.onSendData(str, i4);
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindApp(int i4) {
        if (this.f7831b) {
            this.f7831b = false;
            this.f7830a.onUnbindApp(i4);
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1, com.taobao.accs.IAppReceiver
    public void onUnbindUser(int i4) {
        this.f7830a.onUnbindUser(i4);
    }

    /* renamed from: a */
    public static void m6140a(ErrorCode errorCode, IAppReceiver iAppReceiver, String str) {
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onBindApp(errorCode.getCodeInt(), errorCode.getMsg(), str);
        } else if (iAppReceiver instanceof IAppReceiverV1) {
            ((IAppReceiverV1) iAppReceiver).onBindApp(errorCode.getCodeInt(), str);
        } else {
            iAppReceiver.onBindApp(errorCode.getCodeInt());
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onBindUser(String str, int i4, String str2) {
        IAppReceiver iAppReceiver = this.f7830a;
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onBindUser(str, i4, str2);
        } else {
            iAppReceiver.onBindUser(str, i4);
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onUnbindUser(int i4, String str) {
        IAppReceiver iAppReceiver = this.f7830a;
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onUnbindUser(i4, str);
        } else {
            iAppReceiver.onUnbindUser(i4);
        }
    }

    /* renamed from: b */
    public static void m6141b(ErrorCode errorCode, IAppReceiver iAppReceiver) {
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onUnbindUser(errorCode.getCodeInt(), errorCode.getMsg());
        } else {
            iAppReceiver.onUnbindUser(errorCode.getCodeInt());
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2, com.taobao.accs.IAppReceiverV1
    public void onBindApp(int i4, String str) {
        if (this.f7831b) {
            return;
        }
        this.f7831b = true;
        IAppReceiver iAppReceiver = this.f7830a;
        if (iAppReceiver instanceof IAppReceiverV1) {
            ((IAppReceiverV1) iAppReceiver).onBindApp(i4, str);
        } else {
            iAppReceiver.onBindApp(i4);
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onUnbindApp(int i4, String str) {
        if (this.f7831b) {
            this.f7831b = false;
            IAppReceiver iAppReceiver = this.f7830a;
            if (iAppReceiver instanceof IAppReceiverV2) {
                ((IAppReceiverV2) iAppReceiver).onUnbindApp(i4, str);
            } else {
                iAppReceiver.onUnbindApp(i4);
            }
        }
    }

    /* renamed from: a */
    public static void m6139a(ErrorCode errorCode, IAppReceiver iAppReceiver) {
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onUnbindApp(errorCode.getCodeInt(), errorCode.getMsg());
        } else {
            iAppReceiver.onUnbindApp(errorCode.getCodeInt());
        }
    }

    @Override // com.taobao.accs.IAppReceiverV2
    public void onBindApp(int i4, String str, String str2) {
        if (this.f7831b) {
            return;
        }
        if (i4 == AccsErrorCode.SUCCESS.getCodeInt()) {
            this.f7831b = true;
        }
        IAppReceiver iAppReceiver = this.f7830a;
        if (iAppReceiver instanceof IAppReceiverV2) {
            ((IAppReceiverV2) iAppReceiver).onBindApp(i4, str, str2);
        } else if (iAppReceiver instanceof IAppReceiverV1) {
            ((IAppReceiverV1) iAppReceiver).onBindApp(i4, str2);
        } else {
            iAppReceiver.onBindApp(i4);
        }
    }
}
