package anet.channel.appmonitor;

import android.text.TextUtils;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.config.NetworkConfigCenter;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.appmonitor.a */
/* loaded from: classes3.dex */
public class C4977a implements IAppMonitor {

    /* renamed from: a */
    private static boolean f2333a = false;

    /* renamed from: b */
    private static Map<Class<?>, List<Field>> f2334b = new ConcurrentHashMap();

    /* renamed from: c */
    private static Map<Class<?>, List<Field>> f2335c = new ConcurrentHashMap();

    /* renamed from: d */
    private static Map<Field, String> f2336d = new ConcurrentHashMap();

    /* renamed from: e */
    private static Random f2337e = new Random();

    /* renamed from: f */
    private static Set<Class<?>> f2338f = Collections.newSetFromMap(new ConcurrentHashMap());

    public C4977a() throws ClassNotFoundException {
        try {
            Class.forName("com.alibaba.mtl.appmonitor.AppMonitor");
            f2333a = true;
        } catch (Exception unused) {
            f2333a = false;
        }
    }

    /* renamed from: a */
    public synchronized void m2272a(Class<?> cls) {
        if (cls != null) {
            try {
                if (f2333a) {
                    try {
                    } catch (Exception e10) {
                        ALog.m2528e("awcn.DefaultAppMonitor", "register fail", null, e10, new Object[0]);
                    }
                    if (f2338f.contains(cls)) {
                        return;
                    }
                    Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
                    if (monitor == null) {
                        return;
                    }
                    Field[] fields = cls.getFields();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    DimensionSet dimensionSetCreate = DimensionSet.create();
                    MeasureSet measureSetCreate = MeasureSet.create();
                    for (Field field : fields) {
                        Dimension dimension = (Dimension) field.getAnnotation(Dimension.class);
                        if (dimension != null) {
                            field.setAccessible(true);
                            arrayList.add(field);
                            String name = dimension.name().equals("") ? field.getName() : dimension.name();
                            f2336d.put(field, name);
                            dimensionSetCreate.addDimension(name);
                        } else {
                            Measure measure = (Measure) field.getAnnotation(Measure.class);
                            if (measure != null) {
                                field.setAccessible(true);
                                arrayList2.add(field);
                                String name2 = measure.name().equals("") ? field.getName() : measure.name();
                                f2336d.put(field, name2);
                                if (measure.max() != Double.MAX_VALUE) {
                                    measureSetCreate.addMeasure(new com.alibaba.mtl.appmonitor.model.Measure(name2, Double.valueOf(measure.constantValue()), Double.valueOf(measure.min()), Double.valueOf(measure.max())));
                                } else {
                                    measureSetCreate.addMeasure(name2);
                                }
                            }
                        }
                    }
                    f2334b.put(cls, arrayList);
                    f2335c.put(cls, arrayList2);
                    com.alibaba.mtl.appmonitor.AppMonitor.register(monitor.module(), monitor.monitorPoint(), measureSetCreate, dimensionSetCreate);
                    f2338f.add(cls);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitAlarm(AlarmObject alarmObject) {
        if (!f2333a || alarmObject == null || TextUtils.isEmpty(alarmObject.module) || TextUtils.isEmpty(alarmObject.modulePoint)) {
            return;
        }
        if (ALog.isPrintLog(1)) {
            ALog.m2527d("awcn.DefaultAppMonitor", "commit alarm: " + alarmObject, null, new Object[0]);
        }
        if (alarmObject.isSuccess) {
            AppMonitor.Alarm.commitSuccess(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg));
        } else {
            AppMonitor.Alarm.commitFail(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg), StringUtils.stringNull2Empty(alarmObject.errorCode), StringUtils.stringNull2Empty(alarmObject.errorMsg));
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitCount(CountObject countObject) {
        if (!f2333a || countObject == null || TextUtils.isEmpty(countObject.module) || TextUtils.isEmpty(countObject.modulePoint)) {
            return;
        }
        if (ALog.isPrintLog(2)) {
            ALog.m2530i("awcn.DefaultAppMonitor", "commit count: " + countObject, null, new Object[0]);
        }
        AppMonitor.Counter.commit(countObject.module, countObject.modulePoint, StringUtils.stringNull2Empty(countObject.arg), countObject.value);
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    public void commitStat(StatObject statObject) {
        if (!f2333a || statObject == null) {
            return;
        }
        Class<?> cls = statObject.getClass();
        Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
        if (monitor == null) {
            return;
        }
        if (!f2338f.contains(cls)) {
            m2272a(cls);
        }
        if (statObject.beforeCommit()) {
            if (monitor.monitorPoint().equals("network")) {
                int requestStatisticSampleRate = NetworkConfigCenter.getRequestStatisticSampleRate();
                if (requestStatisticSampleRate > 10000 || requestStatisticSampleRate < 0) {
                    requestStatisticSampleRate = 10000;
                }
                if (requestStatisticSampleRate != 10000 && f2337e.nextInt(10000) >= requestStatisticSampleRate) {
                    return;
                }
            }
            try {
                DimensionValueSet dimensionValueSetCreate = DimensionValueSet.create();
                MeasureValueSet measureValueSetCreate = MeasureValueSet.create();
                List<Field> list = f2334b.get(cls);
                HashMap map = ALog.isPrintLog(1) ? new HashMap() : null;
                if (list != null) {
                    for (Field field : list) {
                        Object obj = field.get(statObject);
                        dimensionValueSetCreate.setValue(f2336d.get(field), obj == null ? "" : obj.toString());
                    }
                    for (Field field2 : f2335c.get(cls)) {
                        double d10 = field2.getDouble(statObject);
                        Double dValueOf = Double.valueOf(d10);
                        measureValueSetCreate.setValue(f2336d.get(field2), d10);
                        if (map != null) {
                            map.put(f2336d.get(field2), dValueOf);
                        }
                    }
                }
                AppMonitor.Stat.commit(monitor.module(), monitor.monitorPoint(), dimensionValueSetCreate, measureValueSetCreate);
                if (ALog.isPrintLog(1)) {
                    ALog.m2527d("awcn.DefaultAppMonitor", "commit stat: " + monitor.monitorPoint(), null, "\nDimensions", dimensionValueSetCreate.getMap().toString(), "\nMeasures", map.toString());
                }
            } catch (Throwable th) {
                ALog.m2528e("awcn.DefaultAppMonitor", "commit monitor point failed", null, th, new Object[0]);
            }
        }
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register() {
    }

    @Override // anet.channel.appmonitor.IAppMonitor
    @Deprecated
    public void register(Class<?> cls) {
    }
}
