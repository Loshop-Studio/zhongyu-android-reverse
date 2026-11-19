package com.huawei.hms.utils;

import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes5.dex */
public class AgHmsUpdateState {

    /* renamed from: c */
    public static final Object f11812c = new Object();

    /* renamed from: d */
    public static volatile AgHmsUpdateState f11813d;

    /* renamed from: a */
    public HmsCheckedState f11814a = HmsCheckedState.UNCHECKED;

    /* renamed from: b */
    public int f11815b = 0;

    public static AgHmsUpdateState getInstance() {
        if (f11813d == null) {
            synchronized (f11812c) {
                try {
                    if (f11813d == null) {
                        f11813d = new AgHmsUpdateState();
                    }
                } finally {
                }
            }
        }
        return f11813d;
    }

    public HmsCheckedState getCheckedState() {
        return this.f11814a;
    }

    public int getTargetVersionCode() {
        return this.f11815b;
    }

    public boolean isUpdateHms() {
        return getCheckedState() == HmsCheckedState.NEED_UPDATE && this.f11815b != 0;
    }

    public void resetUpdateState() {
        if (getCheckedState() != HmsCheckedState.NEED_UPDATE) {
            return;
        }
        setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
        setTargetVersionCode(0);
    }

    public void setCheckedState(HmsCheckedState hmsCheckedState) {
        if (hmsCheckedState == null) {
            HMSLog.m8725e("AgHmsUpdateState", "para invalid: checkedState is null");
        } else {
            this.f11814a = hmsCheckedState;
        }
    }

    public void setTargetVersionCode(int i10) {
        this.f11815b = i10;
    }
}
