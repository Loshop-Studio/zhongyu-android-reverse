package com.huawei.hms.api;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.AbstractC7275b;
import com.huawei.hms.core.aidl.C7279f;
import com.huawei.hms.core.aidl.C7282i;
import com.huawei.hms.core.aidl.DataBuffer;
import com.huawei.hms.core.aidl.InterfaceC7276c;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes5.dex */
public class IPCCallback extends InterfaceC7276c.a {
    private static final String TAG = "IPCCallback";
    private final DatagramTransport.InterfaceC7338a mCallback;
    private final Class<? extends InterfaceC7278e> mResponseClass;

    public IPCCallback(Class<? extends InterfaceC7278e> cls, DatagramTransport.InterfaceC7338a interfaceC7338a) {
        this.mResponseClass = cls;
        this.mCallback = interfaceC7338a;
    }

    @Override // com.huawei.hms.core.aidl.InterfaceC7276c
    public void call(DataBuffer dataBuffer) throws RemoteException {
        InterfaceC7278e interfaceC7278eNewResponseInstance;
        if (dataBuffer == null || TextUtils.isEmpty(dataBuffer.f11600c)) {
            HMSLog.m8725e(TAG, "In call, URI cannot be empty.");
            throw new RemoteException();
        }
        C7279f c7279fM8513a = AbstractC7275b.m8513a(dataBuffer.m8510i());
        if (dataBuffer.m8509h() > 0) {
            interfaceC7278eNewResponseInstance = newResponseInstance();
            if (interfaceC7278eNewResponseInstance != null) {
                c7279fM8513a.m8527f(dataBuffer.m8508g(), interfaceC7278eNewResponseInstance);
            }
        } else {
            interfaceC7278eNewResponseInstance = null;
        }
        DatagramTransport.InterfaceC7338a interfaceC7338a = this.mCallback;
        if (interfaceC7338a != null) {
            if (dataBuffer.f11601d == null) {
                interfaceC7338a.mo8680a(0, interfaceC7278eNewResponseInstance);
                return;
            }
            C7282i c7282i = new C7282i();
            c7279fM8513a.m8527f(dataBuffer.f11601d, c7282i);
            this.mCallback.mo8680a(c7282i.m8538a(), interfaceC7278eNewResponseInstance);
        }
    }

    public InterfaceC7278e newResponseInstance() {
        Class<? extends InterfaceC7278e> cls = this.mResponseClass;
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e10) {
            HMSLog.m8725e(TAG, "In newResponseInstance, instancing exception." + e10.getMessage());
            return null;
        }
    }
}
