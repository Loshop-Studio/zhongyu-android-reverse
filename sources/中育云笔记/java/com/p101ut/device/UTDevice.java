package com.p101ut.device;

import android.content.Context;
import com.p074ta.utdid2.device.C7595d;

/* loaded from: classes5.dex */
public class UTDevice {
    public static String getUtdid(Context context) {
        return com.p074ta.utdid2.device.UTDevice.getUtdid(context);
    }

    public static void setExtendFactor(String str) {
        C7595d.setExtendFactor(str);
    }
}
