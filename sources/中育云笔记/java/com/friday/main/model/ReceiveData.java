package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ReceiveData {
    public static final int $stable = 0;
    private final String filename;
    private final int filetype;
    private final String sharername;

    public ReceiveData(int i10, String filename, String sharername) {
        AbstractC9979u.m20294g(filename, "filename");
        AbstractC9979u.m20294g(sharername, "sharername");
        this.filetype = i10;
        this.filename = filename;
        this.sharername = sharername;
    }

    public static /* synthetic */ ReceiveData copy$default(ReceiveData receiveData, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = receiveData.filetype;
        }
        if ((i11 & 2) != 0) {
            str = receiveData.filename;
        }
        if ((i11 & 4) != 0) {
            str2 = receiveData.sharername;
        }
        return receiveData.copy(i10, str, str2);
    }

    public final int component1() {
        return this.filetype;
    }

    public final String component2() {
        return this.filename;
    }

    public final String component3() {
        return this.sharername;
    }

    public final ReceiveData copy(int i10, String filename, String sharername) {
        AbstractC9979u.m20294g(filename, "filename");
        AbstractC9979u.m20294g(sharername, "sharername");
        return new ReceiveData(i10, filename, sharername);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiveData)) {
            return false;
        }
        ReceiveData receiveData = (ReceiveData) obj;
        return this.filetype == receiveData.filetype && AbstractC9979u.m20289b(this.filename, receiveData.filename) && AbstractC9979u.m20289b(this.sharername, receiveData.sharername);
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getFiletype() {
        return this.filetype;
    }

    public final String getSharername() {
        return this.sharername;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.filetype) * 31) + this.filename.hashCode()) * 31) + this.sharername.hashCode();
    }

    public String toString() {
        return "ReceiveData(filetype=" + this.filetype + ", filename=" + this.filename + ", sharername=" + this.sharername + ")";
    }
}
