package com.tendcloud.tenddata;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.taobao.accs.common.Constants;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.tendcloud.tenddata.et */
/* loaded from: classes5.dex */
public class C7969et {
    /* renamed from: a */
    public static boolean m11910a(Context context) {
        try {
            return C7963en.m11895l();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectNUBIA(Context context) {
        String string;
        try {
            ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            if (contentProviderClientAcquireContentProviderClient != null) {
                Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
                contentProviderClientAcquireContentProviderClient.close();
                if (bundleCall == null || bundleCall.getInt(Constants.KEY_HTTP_CODE, -1) != 0 || (string = bundleCall.getString(AgooConstants.MESSAGE_ID)) == null) {
                    return;
                }
                C7994fr.m11998a().setOAID(string);
            }
        } catch (Throwable unused) {
        }
    }
}
