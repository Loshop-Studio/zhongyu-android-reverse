package com.tendcloud.tenddata;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.SparseArray;
import java.util.TreeMap;

/* renamed from: com.tendcloud.tenddata.ee */
/* loaded from: classes5.dex */
public class C7954ee {

    /* renamed from: d */
    private static volatile C7954ee f14830d;

    /* renamed from: a */
    private SensorManager f14831a;

    /* renamed from: b */
    private a f14832b;

    /* renamed from: c */
    private int[] f14833c = {13, 12, 11, 5, 6, 2};

    /* renamed from: com.tendcloud.tenddata.ee$a */
    public class a implements SensorEventListener {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String arrayToString(float[] fArr) {
            if (fArr == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            for (float f10 : fArr) {
                sb2.append(f10);
                sb2.append(',');
            }
            return sb2.toString().substring(0, sb2.toString().length() - 1);
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(final SensorEvent sensorEvent) {
            try {
                C7912cq.execute(new Runnable() { // from class: com.tendcloud.tenddata.ee.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        TreeMap treeMap = new TreeMap();
                        treeMap.put("type", sensorEvent.sensor.getType() + "");
                        treeMap.put("values", a.this.arrayToString(sensorEvent.values));
                        treeMap.put("ts", Long.valueOf(sensorEvent.timestamp));
                        treeMap.put("accuracy", Integer.valueOf(sensorEvent.accuracy));
                        C7961el c7961el = new C7961el();
                        c7961el.f14869b = "env";
                        c7961el.f14870c = "sensorPoint";
                        c7961el.f14871d = treeMap;
                        c7961el.f14868a = AbstractC7841a.ENV;
                        C7913cr.m11625a().post(c7961el);
                    }
                });
            } catch (Throwable unused) {
            }
            C7954ee.this.f14831a.unregisterListener(C7954ee.this.f14832b, sensorEvent.sensor);
        }
    }

    static {
        try {
            C7913cr.m11625a().register(m11865b());
        } catch (Throwable unused) {
        }
    }

    private C7954ee() {
        this.f14831a = null;
        this.f14832b = null;
        try {
            this.f14831a = (SensorManager) C7843ab.f14307g.getSystemService("sensor");
            this.f14832b = new a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private void m11866c() {
        this.f14831a.unregisterListener(this.f14832b);
    }

    public final void onTDEBEventSensor(SparseArray<C7959ej> sparseArray) {
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            try {
                C7959ej c7959ejValueAt = sparseArray.valueAt(i10);
                int i11 = c7959ejValueAt.f14864c;
                if (i11 == 12) {
                    m11863a(c7959ejValueAt);
                } else if (i11 != 13) {
                    m11862a(i11, c7959ejValueAt.f14865d);
                } else {
                    m11863a(c7959ejValueAt);
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m11863a(C7959ej c7959ej) {
        try {
            m11862a(c7959ej.f14864c, c7959ej.f14865d);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static C7954ee m11865b() {
        if (f14830d == null) {
            synchronized (C7955ef.class) {
                try {
                    if (f14830d == null) {
                        f14830d = new C7954ee();
                    }
                } finally {
                }
            }
        }
        return f14830d;
    }

    /* renamed from: a */
    public void m11867a() {
        int i10 = 0;
        while (true) {
            try {
                int[] iArr = this.f14833c;
                if (i10 >= iArr.length) {
                    return;
                }
                int i11 = iArr[i10];
                if ((i11 != 13 && i11 != 12) || C7912cq.m11595a(14)) {
                    m11862a(this.f14833c[i10], 3);
                }
                i10++;
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m11862a(int i10, int i11) {
        try {
            Sensor defaultSensor = this.f14831a.getDefaultSensor(i10);
            if (defaultSensor != null) {
                this.f14831a.registerListener(this.f14832b, defaultSensor, i11);
            }
        } catch (Throwable unused) {
        }
    }
}
