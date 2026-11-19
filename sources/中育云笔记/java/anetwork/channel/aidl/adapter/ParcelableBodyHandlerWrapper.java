package anetwork.channel.aidl.adapter;

import anetwork.channel.IBodyHandler;
import anetwork.channel.aidl.ParcelableBodyHandler;

/* loaded from: classes3.dex */
public class ParcelableBodyHandlerWrapper extends ParcelableBodyHandler.Stub {
    private static final String TAG = "anet.ParcelableBodyHandlerWrapper";
    private IBodyHandler handler;

    public ParcelableBodyHandlerWrapper(IBodyHandler iBodyHandler) {
        this.handler = iBodyHandler;
    }

    @Override // anetwork.channel.aidl.ParcelableBodyHandler
    public boolean isCompleted() {
        IBodyHandler iBodyHandler = this.handler;
        if (iBodyHandler != null) {
            return iBodyHandler.isCompleted();
        }
        return true;
    }

    @Override // anetwork.channel.aidl.ParcelableBodyHandler
    public int read(byte[] bArr) {
        IBodyHandler iBodyHandler = this.handler;
        if (iBodyHandler != null) {
            return iBodyHandler.read(bArr);
        }
        return 0;
    }

    public String toString() {
        return super.toString() + " handle:" + this.handler;
    }
}
