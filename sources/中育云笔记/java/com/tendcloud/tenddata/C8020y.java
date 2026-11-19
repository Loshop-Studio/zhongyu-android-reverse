package com.tendcloud.tenddata;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import androidx.camera.video.AudioStats;
import com.tendcloud.dot.DotActivityLifeCycleManager;
import com.tendcloud.dot.DotFragmentManager;
import com.tendcloud.dot.DotGroupRadioOnCheckedChangeListener;
import com.tendcloud.dot.DotOnCheckedChangeListener;
import com.tendcloud.dot.DotOnItemClickListener;
import com.tendcloud.dot.DotOnclickListener;
import com.tendcloud.dot.LayoutInflaterHooker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.y */
/* loaded from: classes5.dex */
public class C8020y implements DotActivityLifeCycleManager.DotActivityLifecycleCallbacks, DotFragmentManager.DotFragmentMangerCallback, DotGroupRadioOnCheckedChangeListener.OnGroupRadioCheckChangedCallback, DotOnCheckedChangeListener.CheckChangedCallback, DotOnItemClickListener.DotOnItemClickCallBack, DotOnclickListener.DotClickCallBack {

    /* renamed from: a */
    private static final String f15133a = "ModuleCodelessInstrumentation";

    /* renamed from: b */
    private static volatile C8020y f15134b;

    /* renamed from: c */
    private HandlerThread f15135c;

    /* renamed from: d */
    private Handler f15136d;

    /* renamed from: e */
    private String f15137e = null;

    static {
        try {
            C7913cr.m11625a().register(m12122a());
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    private C8020y() {
        try {
            HandlerThread handlerThread = new HandlerThread(f15133a);
            this.f15135c = handlerThread;
            handlerThread.start();
            this.f15136d = new HandlerC8019x(this, this.f15135c.getLooper());
            m12126b();
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    /* renamed from: e */
    private void m12124e() {
        try {
            DotActivityLifeCycleManager.getInstance().registerDotActivityLifecycleCallbacks(this);
            DotOnclickListener.setCallBack(this);
            DotFragmentManager.setCallback(this);
            DotOnItemClickListener.setCallBack(this);
            DotGroupRadioOnCheckedChangeListener.setCallback(this);
            DotOnCheckedChangeListener.setCallback(this);
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    /* renamed from: a */
    public void m12125a(Message message) {
    }

    /* renamed from: b */
    public void m12126b() {
        try {
            m12124e();
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    /* renamed from: c */
    public void m12128c() {
        try {
            C8011o.m12058a().m12066b();
            C7846ae.m11117a();
            String strM12064a = C8011o.m12058a().m12064a(C8011o.f15052d, C8011o.f15051c);
            if (!TextUtils.isEmpty(strM12064a)) {
                C7846ae.addConfigFromString(strM12064a);
            }
            String strM12064a2 = C8011o.m12058a().m12064a(this.f15137e, C8011o.f15049a);
            if (!TextUtils.isEmpty(strM12064a2)) {
                C7846ae.addConfigFromString(strM12064a2);
            }
            C8011o.m12058a().m12067c();
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    /* renamed from: d */
    public Handler m12129d() {
        return this.f15136d;
    }

    public void enableXmlCLickHook(boolean z10) {
        try {
            LayoutInflaterHooker.hookLayoutXmlOnClick = z10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void handleActivityResume(Message message) {
        try {
            this.f15137e = (String) message.obj;
            m12128c();
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    public void handleCodelessConfigSave(JSONObject jSONObject) {
        try {
            C8008l.m12042a().saveConfig(jSONObject);
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    @Override // com.tendcloud.dot.DotActivityLifeCycleManager.DotActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.tendcloud.dot.DotActivityLifeCycleManager.DotActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // com.tendcloud.dot.DotActivityLifeCycleManager.DotActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // com.tendcloud.dot.DotActivityLifeCycleManager.DotActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (activity != null) {
            try {
                String name = activity.getClass().getName();
                Message messageObtainMessage = m12129d().obtainMessage();
                messageObtainMessage.what = 4;
                messageObtainMessage.obj = name;
                messageObtainMessage.sendToTarget();
            } catch (Exception e10) {
                C7896ca.eForInternal(e10);
            }
        }
    }

    @Override // com.tendcloud.dot.DotActivityLifeCycleManager.DotActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.tendcloud.dot.DotActivityLifeCycleManager.DotActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // com.tendcloud.dot.DotGroupRadioOnCheckedChangeListener.OnGroupRadioCheckChangedCallback
    public void onCheckedChanged(RadioGroup radioGroup, int i10) {
        if (i10 == -1) {
            return;
        }
        try {
            C8018w c8018wM11116a = C7846ae.m11116a(radioGroup.findViewById(i10), false);
            if (c8018wM11116a == null) {
                return;
            }
            m12123a(c8018wM11116a, C8017v.m12097a(radioGroup, c8018wM11116a));
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    @Override // com.tendcloud.dot.DotOnclickListener.DotClickCallBack
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        try {
            C8018w c8018wM11116a = C7846ae.m11116a(view, false);
            if (c8018wM11116a == null) {
                return;
            }
            m12123a(c8018wM11116a, C8017v.m12097a(view, c8018wM11116a));
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    @Override // com.tendcloud.dot.DotFragmentManager.DotFragmentMangerCallback
    @android.annotation.TargetApi(11)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFragmentVisibilityChanged(java.lang.Object r3, boolean r4, boolean r5) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r5 = r3 instanceof android.app.Fragment     // Catch: java.lang.Exception -> L1f
            if (r5 == 0) goto L21
            r5 = 11
            boolean r5 = com.tendcloud.tenddata.C7912cq.m11595a(r5)     // Catch: java.lang.Exception -> L1f
            if (r5 == 0) goto L4d
            r5 = r3
            android.app.Fragment r5 = (android.app.Fragment) r5     // Catch: java.lang.Exception -> L1f
            android.app.Activity r5 = r5.getActivity()     // Catch: java.lang.Exception -> L1f
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Exception -> L1f
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Exception -> L1f
            goto L4e
        L1f:
            r3 = move-exception
            goto L7b
        L21:
            boolean r5 = com.tendcloud.tenddata.C8017v.m12100a(r3)     // Catch: java.lang.Exception -> L1f
            if (r5 == 0) goto L37
            r5 = r3
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5     // Catch: java.lang.Exception -> L1f
            androidx.fragment.app.FragmentActivity r5 = r5.getActivity()     // Catch: java.lang.Exception -> L1f
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Exception -> L1f
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Exception -> L1f
            goto L4e
        L37:
            boolean r5 = com.tendcloud.tenddata.C8017v.m12104b(r3)     // Catch: java.lang.Exception -> L1f
            if (r5 == 0) goto L4d
            r5 = r3
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5     // Catch: java.lang.Exception -> L1f
            androidx.fragment.app.FragmentActivity r5 = r5.getActivity()     // Catch: java.lang.Exception -> L1f
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Exception -> L1f
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Exception -> L1f
            goto L4e
        L4d:
            r5 = 0
        L4e:
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Exception -> L1f
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L1f
            android.os.Handler r0 = r2.f15136d     // Catch: java.lang.Exception -> L1f
            android.os.Message r0 = r0.obtainMessage()     // Catch: java.lang.Exception -> L1f
            r1 = 3
            r0.what = r1     // Catch: java.lang.Exception -> L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1f
            r1.<init>()     // Catch: java.lang.Exception -> L1f
            r1.append(r5)     // Catch: java.lang.Exception -> L1f
            java.lang.String r5 = "/"
            r1.append(r5)     // Catch: java.lang.Exception -> L1f
            r1.append(r3)     // Catch: java.lang.Exception -> L1f
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Exception -> L1f
            r0.obj = r3     // Catch: java.lang.Exception -> L1f
            r0.arg1 = r4     // Catch: java.lang.Exception -> L1f
            r0.sendToTarget()     // Catch: java.lang.Exception -> L1f
            return
        L7b:
            com.tendcloud.tenddata.C7896ca.eForInternal(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C8020y.onFragmentVisibilityChanged(java.lang.Object, boolean, boolean):void");
    }

    @Override // com.tendcloud.dot.DotOnItemClickListener.DotOnItemClickCallBack
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        if (adapterView == null || view == null) {
            return;
        }
        try {
            C8018w c8018wM11116a = C7846ae.m11116a(view, true);
            if (c8018wM11116a == null) {
                return;
            }
            m12123a(c8018wM11116a, C8017v.m12097a(view, c8018wM11116a));
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    public void onSaveConfig(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            C7896ca.dForInternal("process with config");
            Message messageObtainMessage = m12129d().obtainMessage();
            messageObtainMessage.what = 7;
            messageObtainMessage.obj = jSONObject;
            messageObtainMessage.sendToTarget();
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    @Override // com.tendcloud.dot.DotFragmentManager.DotFragmentMangerCallback
    public void onViewCreated(Object obj, View view, Bundle bundle) {
        try {
            C8017v.trackFragment(obj);
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    /* renamed from: a */
    public static C8020y m12122a() {
        try {
            if (f15134b == null) {
                synchronized (C8020y.class) {
                    try {
                        if (f15134b == null) {
                            f15134b = new C8020y();
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
        return f15134b;
    }

    /* renamed from: b */
    public void m12127b(Message message) {
        try {
            C7845ad c7845ad = (C7845ad) message.obj;
            TalkingDataSDK.onEvent(C7843ab.f14307g, c7845ad.f14328a, AudioStats.AUDIO_AMPLITUDE_NONE, c7845ad.f14330c);
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    @Override // com.tendcloud.dot.DotOnCheckedChangeListener.CheckChangedCallback
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        try {
            C8018w c8018wM11116a = C7846ae.m11116a(compoundButton, false);
            if (c8018wM11116a == null) {
                return;
            }
            m12123a(c8018wM11116a, C8017v.m12097a(compoundButton, c8018wM11116a));
        } catch (Exception e10) {
            C7896ca.eForInternal(e10);
        }
    }

    /* renamed from: a */
    private void m12123a(C8018w c8018w, Map<String, Object> map) {
        try {
            HashMap map2 = new HashMap(16);
            map2.put(C8003g.f15012a, "1");
            if (map != null && map.size() > 0) {
                map2.putAll(map);
            }
            Message messageObtainMessage = this.f15136d.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = new C7845ad(c8018w.m12117f(), c8018w.m12118g(), map2);
            messageObtainMessage.sendToTarget();
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
    }
}
