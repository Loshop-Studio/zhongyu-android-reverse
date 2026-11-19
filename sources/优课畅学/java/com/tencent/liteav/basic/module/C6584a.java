package com.tencent.liteav.basic.module;

/* renamed from: com.tencent.liteav.basic.module.a */
/* loaded from: classes4.dex */
public class C6584a {
    private String mID = "";

    public void clearID() {
        synchronized (this) {
            try {
                if (this.mID.length() != 0) {
                    TXCStatus.m5011b(this.mID);
                    this.mID = "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void finalize() throws Throwable {
        clearID();
        super.finalize();
    }

    public double getDoubleValue(int i10) {
        return TXCStatus.m5014d(this.mID, i10);
    }

    public String getID() {
        return this.mID;
    }

    public int getIntValue(int i10) {
        return TXCStatus.m5012c(this.mID, i10);
    }

    public long getLongValue(int i10) {
        return TXCStatus.m5004a(this.mID, i10);
    }

    public String getStringValue(int i10) {
        return TXCStatus.m5009b(this.mID, i10);
    }

    public void setID(String str) {
        clearID();
        synchronized (this) {
            try {
                if (str.length() != 0) {
                    this.mID = str;
                    TXCStatus.m5006a(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean setStatusValue(int i10, Object obj) {
        return TXCStatus.m5008a(this.mID, i10, obj);
    }

    public double getDoubleValue(int i10, int i11) {
        return TXCStatus.m5015d(this.mID, i10, i11);
    }

    public int getIntValue(int i10, int i11) {
        return TXCStatus.m5013c(this.mID, i10, i11);
    }

    public long getLongValue(int i10, int i11) {
        return TXCStatus.m5005a(this.mID, i10, i11);
    }

    public String getStringValue(int i10, int i11) {
        return TXCStatus.m5010b(this.mID, i10, i11);
    }

    public boolean setStatusValue(int i10, int i11, Object obj) {
        return TXCStatus.m5007a(this.mID, i10, i11, obj);
    }
}
