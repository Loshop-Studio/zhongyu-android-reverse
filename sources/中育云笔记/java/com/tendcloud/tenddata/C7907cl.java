package com.tendcloud.tenddata;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.tendcloud.tenddata.cl */
/* loaded from: classes5.dex */
public class C7907cl {
    private C7907cl() {
    }

    /* renamed from: a */
    public static List<C7893by> m11571a() {
        ArrayList arrayList = new ArrayList();
        try {
            for (File file : new File("/proc").listFiles()) {
                if (file != null && file.isDirectory()) {
                    try {
                        int i10 = Integer.parseInt(file.getName());
                        C7893by c7893by = new C7893by(-1);
                        int i11 = c7893by.f14472b;
                        if ((i11 < 1000 || i11 > 9999) && !c7893by.f14473c.contains(":") && !c7893by.f14473c.contains(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
                            arrayList.add(new C7893by(i10));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m11574b() {
        try {
            List<C7893by> listM11571a = m11571a();
            int iMyPid = Process.myPid();
            for (C7893by c7893by : listM11571a) {
                if (c7893by.f14474d == iMyPid && c7893by.f14471a) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static List<ActivityManager.RunningAppProcessInfo> m11573b(Context context) {
        try {
            List<C7893by> listM11571a = m11571a();
            ArrayList arrayList = new ArrayList();
            for (C7893by c7893by : listM11571a) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo(c7893by.f14473c, c7893by.f14474d, null);
                runningAppProcessInfo.uid = c7893by.f14472b;
                arrayList.add(runningAppProcessInfo);
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static List<C7893by> m11572a(Context context) {
        int i10;
        ArrayList arrayList = new ArrayList();
        try {
            File[] fileArrListFiles = new File("/proc").listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file != null && file.isDirectory()) {
                        try {
                            C7893by c7893by = new C7893by(Integer.parseInt(file.getName()));
                            if (c7893by.f14471a && (((i10 = c7893by.f14472b) < 1000 || i10 > 9999) && !c7893by.f14473c.contains(":") && !c7893by.f14473c.contains(MqttTopic.TOPIC_LEVEL_SEPARATOR))) {
                                arrayList.add(c7893by);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m11570a(Context context, int i10) {
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i10) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
