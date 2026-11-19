package com.friday.lecture.service;

import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.blankj.utilcode.util.CacheMemoryStaticUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.ServiceUtils;
import com.friday.common.activity.PusherService;
import com.friday.common.classtest.MqttRequestEntity;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.classtest.MqttResponseEntity;
import com.friday.common.classtest.RequestScreencastData;
import com.friday.common.entity.HomeworkStatus;
import com.friday.common.entity.IfStudentOnline;
import com.friday.common.entity.MqttEntity;
import com.friday.common.entity.MqttType;
import com.friday.common.entity.SubmitHomeworkStatus;
import com.friday.common.helper.C5962b;
import com.friday.common.service.BaseLifecycleService;
import com.friday.common.util.ShowStudentState;
import com.friday.common.util.StudentState;
import com.friday.lecture.floatwindow.options.C6149a;
import com.friday.lecture.model.ClassTestHelper;
import com.friday.lecture.service.MyMqttService;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.framework.common.BundleUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.AbstractC10006d;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobKt__JobKt;
import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import p170h2.AbstractC9450a;
import p181hd.InterfaceC9529a;
import p187i3.C9586i0;
import p187i3.C9594q;
import p215k2.AbstractC9803u;
import p215k2.AbstractC9804v;
import p215k2.C9799q;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p310qd.C10792c;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;
import p429z1.AbstractC11958b;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import sd.InterfaceC11168v;
import tv.danmaku.ijk.media.player.IMediaPlayer;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MyMqttService extends BaseLifecycleService {

    /* renamed from: t */
    public static final C6154a f8851t = new C6154a(null);

    /* renamed from: u */
    public static final int f8852u = 8;

    /* renamed from: d */
    public MqttConnectOptions f8853d;

    /* renamed from: g */
    public boolean f8856g;

    /* renamed from: k */
    public MqttAndroidClient f8860k;

    /* renamed from: m */
    public final InterfaceC11168v f8862m;

    /* renamed from: n */
    public final InterfaceC11122i0 f8863n;

    /* renamed from: o */
    public InterfaceC10045g f8864o;

    /* renamed from: p */
    public boolean f8865p;

    /* renamed from: q */
    public final IMqttActionListener f8866q;

    /* renamed from: r */
    public long f8867r;

    /* renamed from: s */
    public final MqttCallback f8868s;

    /* renamed from: e */
    public final String f8854e = "admin";

    /* renamed from: f */
    public final String f8855f = "public";

    /* renamed from: h */
    public String f8857h = "";

    /* renamed from: i */
    public final InterfaceC10773d f8858i = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: k3.b
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return MyMqttService.m6795v();
        }
    });

    /* renamed from: j */
    public String f8859j = "";

    /* renamed from: l */
    public final boolean f8861l = C5962b.f6082a.m5299a().m5294v();

    /* renamed from: com.friday.lecture.service.MyMqttService$a */
    public static final class C6154a {
        public /* synthetic */ C6154a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C6154a() {
        }
    }

    /* renamed from: com.friday.lecture.service.MyMqttService$b */
    public static final class C6155b implements IMqttActionListener {

        /* renamed from: com.friday.lecture.service.MyMqttService$b$a */
        public static final class a implements IMqttActionListener {

            /* renamed from: a */
            public final /* synthetic */ MyMqttService f8870a;

            public a(MyMqttService myMqttService) {
                this.f8870a = myMqttService;
            }

            @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
            public void onFailure(IMqttToken iMqttToken, Throwable th) {
                AbstractC11958b.m26588i("连接服务失败，请重试");
                LogUtils.m3887e("MyMqttService -> EndInClassTest,onFailure, " + this.f8870a.m6799u(th));
                LiveEventBus.get("EndInClassTest").post(null);
            }

            @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
            public void onSuccess(IMqttToken iMqttToken) {
                if (!this.f8870a.f8861l) {
                    MyMqttService myMqttService = this.f8870a;
                    String json = GsonUtils.toJson(new MqttRequestEntity(10000, new RequestScreencastData(false, null, null, 7, null)));
                    AbstractC9979u.m20293f(json, "toJson(...)");
                    MyMqttService.m6774B(myMqttService, json, null, false, 6, null);
                    return;
                }
                MyMqttService myMqttService2 = this.f8870a;
                String json2 = GsonUtils.toJson(new MqttRequestEntity(10003, null, 2, null));
                AbstractC9979u.m20293f(json2, "toJson(...)");
                MyMqttService.m6774B(myMqttService2, json2, null, false, 6, null);
                LiveEventBus.get("mqttConnected").post(null);
            }
        }

        public C6155b() {
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onFailure(IMqttToken arg0, Throwable arg1) {
            AbstractC9979u.m20294g(arg0, "arg0");
            AbstractC9979u.m20294g(arg1, "arg1");
            MyMqttService.this.f8856g = false;
            MyMqttService.this.f8865p = false;
            arg1.printStackTrace();
            LogUtils.m3888i("MyMqttService -> onFailure,连接失败, url=" + MyMqttService.this.f8857h + ", " + MyMqttService.this.m6799u(arg1));
            MyMqttService.m6775D(MyMqttService.this, 0L, 1, null);
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onSuccess(IMqttToken arg0) {
            AbstractC9979u.m20294g(arg0, "arg0");
            int i10 = 0;
            MyMqttService.this.f8865p = false;
            InterfaceC10045g interfaceC10045g = MyMqttService.this.f8864o;
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            MyMqttService.this.f8864o = null;
            LogUtils.m3888i("MyMqttService", "连接成功 ");
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(MyMqttService.this.m6801x());
                arrayList.add(MyMqttService.this.m6801x() + "/REQUEST_SCREEN_CAPTURE");
                MqttAndroidClient mqttAndroidClient = MyMqttService.this.f8860k;
                if (mqttAndroidClient != null) {
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arrayList, 10));
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        arrayList2.add(2);
                    }
                    mqttAndroidClient.subscribe(strArr, AbstractC10947g0.m23921W0(arrayList2), (Object) null, new a(MyMqttService.this));
                }
            } catch (Exception e10) {
                AbstractC11958b.m26588i("连接服务失败，请重试");
                LiveEventBus.get("EndInClassTest").post(null);
                e10.printStackTrace();
                LogUtils.m3887e("MyMqttService -> iMqttActionListener catch, " + MyMqttService.this.m6799u(e10));
            }
        }
    }

    /* renamed from: com.friday.lecture.service.MyMqttService$c */
    public static final class C6156c implements IMqttActionListener {
        public C6156c() {
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
            LogUtils.m3886d("MyMqttService -> onDestroy,onFailure, " + MyMqttService.this.m6799u(th));
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
            MqttAndroidClient mqttAndroidClient = MyMqttService.this.f8860k;
            if (mqttAndroidClient != null) {
                mqttAndroidClient.m22290z();
            }
            MqttAndroidClient mqttAndroidClient2 = MyMqttService.this.f8860k;
            if (mqttAndroidClient2 != null) {
                mqttAndroidClient2.close();
            }
            MyMqttService.this.f8860k = null;
        }
    }

    public MyMqttService() {
        InterfaceC11168v interfaceC11168vM20385b = JobKt__JobKt.m20385b(null, 1, null);
        this.f8862m = interfaceC11168vM20385b;
        this.f8863n = AbstractC10006d.m20744a(C11157r0.m24800c().plus(interfaceC11168vM20385b));
        this.f8866q = new C6155b();
        this.f8868s = new MqttCallbackExtended() { // from class: com.friday.lecture.service.MyMqttService$mqttCallback$1
            @Override // org.eclipse.paho.client.mqttv3.MqttCallbackExtended
            public void connectComplete(boolean z10, String str) {
                int i10 = 0;
                this.f8872a.f8865p = false;
                InterfaceC10045g interfaceC10045g = this.f8872a.f8864o;
                if (interfaceC10045g != null) {
                    InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
                }
                this.f8872a.f8864o = null;
                if (!z10 || TextUtils.isEmpty(this.f8872a.f8859j)) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                MqttType[] mqttTypeArrValues = MqttType.values();
                MyMqttService myMqttService = this.f8872a;
                ArrayList arrayList2 = new ArrayList(mqttTypeArrValues.length);
                for (MqttType mqttType : mqttTypeArrValues) {
                    arrayList2.add(myMqttService.f8859j + MqttTopic.TOPIC_LEVEL_SEPARATOR + mqttType.name() + "/all");
                }
                MqttType[] mqttTypeArrValues2 = MqttType.values();
                MyMqttService myMqttService2 = this.f8872a;
                ArrayList arrayList3 = new ArrayList(mqttTypeArrValues2.length);
                for (MqttType mqttType2 : mqttTypeArrValues2) {
                    arrayList3.add(myMqttService2.f8859j + MqttTopic.TOPIC_LEVEL_SEPARATOR + mqttType2.name() + MqttTopic.TOPIC_LEVEL_SEPARATOR + C5962b.f6082a.m5299a().m5292t());
                }
                arrayList.add(this.f8872a.m6801x());
                arrayList.add(this.f8872a.m6801x() + "/REQUEST_SCREEN_CAPTURE");
                arrayList.addAll(arrayList2);
                arrayList.addAll(arrayList3);
                MqttAndroidClient mqttAndroidClient = this.f8872a.f8860k;
                if (mqttAndroidClient != null) {
                    String[] strArr = (String[]) arrayList.toArray(new String[0]);
                    ArrayList arrayList4 = new ArrayList(AbstractC10980x.m24153x(arrayList, 10));
                    int size = arrayList.size();
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        arrayList4.add(2);
                    }
                    mqttAndroidClient.subscribe(strArr, AbstractC10947g0.m23921W0(arrayList4));
                }
                Observable observable = LiveEventBus.get(MqttEntity.class);
                MqttType mqttType3 = MqttType.NONE;
                String json = GsonUtils.toJson(new MqttRequestEntity(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO, null, 2, null));
                AbstractC9979u.m20293f(json, "toJson(...)");
                observable.post(new MqttEntity(mqttType3, json, null, 4, null));
            }

            @Override // org.eclipse.paho.client.mqttv3.MqttCallback
            public void connectionLost(Throwable th) {
                this.f8872a.f8856g = false;
                this.f8872a.f8865p = false;
                LogUtils.m3887e("MyMqttService -> connectionLost,连接断开, " + this.f8872a.m6799u(th));
                if (th instanceof SocketException) {
                    LiveEventBus.get("stopApplicationByPc").post(null);
                }
            }

            @Override // org.eclipse.paho.client.mqttv3.MqttCallback
            public void deliveryComplete(IMqttDeliveryToken arg0) {
                AbstractC9979u.m20294g(arg0, "arg0");
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            @Override // org.eclipse.paho.client.mqttv3.MqttCallback
            public void messageArrived(String topic, MqttMessage message) {
                Object obj;
                MqttResponse.Data data;
                AbstractC9979u.m20294g(topic, "topic");
                AbstractC9979u.m20294g(message, "message");
                try {
                    byte[] payload = message.getPayload();
                    AbstractC9979u.m20293f(payload, "getPayload(...)");
                    String str = new String(payload, C10792c.f26019b);
                    Log.i("MyMqttService", "收到消息：message " + str + "  topic " + topic);
                    List listM23091I0 = AbstractC10793c0.m23091I0(topic, new String[]{MqttTopic.TOPIC_LEVEL_SEPARATOR}, false, 0, 6, null);
                    if (listM23091I0.isEmpty()) {
                    }
                    int i10 = 0;
                    if (AbstractC9979u.m20289b(listM23091I0.get(0), this.f8872a.m6801x())) {
                        if (listM23091I0.size() > 1 && AbstractC9979u.m20289b(listM23091I0.get(1), "REQUEST_SCREEN_CAPTURE")) {
                            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this.f8872a), C11157r0.m24799b(), null, new MyMqttService$mqttCallback$1$messageArrived$1(this.f8872a, str, null), 2, null);
                            return;
                        }
                        MqttResponseEntity mqttResponseEntity = (MqttResponseEntity) GsonUtils.fromJson(str, MqttResponseEntity.class);
                        if (mqttResponseEntity != null) {
                            int type = mqttResponseEntity.getType();
                            if (type != 20000) {
                                if (type == 20007) {
                                    if (!AbstractC9979u.m20289b(AbstractC9450a.m18633c(mqttResponseEntity.getData().getTopic(), "teEb3gnyru3QCnxv"), "zykj_ktzs")) {
                                        LiveEventBus.get("EndInClassTest").post(null);
                                        return;
                                    } else {
                                        LiveEventBus.get("IntranetMqttConnected").post(null);
                                        this.f8872a.f8856g = true;
                                        return;
                                    }
                                }
                                if (type == 20013) {
                                    try {
                                        MyMqttService myMqttService = this.f8872a;
                                        myMqttService.m6797A("", myMqttService.m6801x(), true);
                                    } catch (Exception unused) {
                                    }
                                    LiveEventBus.get("StopScreencast").post(null);
                                    return;
                                } else if (type != 20003) {
                                    if (type == 20004) {
                                        if (mqttResponseEntity.getData().getTimeStamp() > this.f8872a.f8867r) {
                                            this.f8872a.f8867r = mqttResponseEntity.getData().getTimeStamp();
                                            ClassTestHelper.INSTANCE.setStudentList(mqttResponseEntity.getData().getStudentList());
                                            return;
                                        }
                                        return;
                                    }
                                    if (type == 20010) {
                                        AbstractC11958b.m26588i("不允许多个设备同时投屏");
                                        LiveEventBus.get("EndInClassTest").post(null);
                                        return;
                                    } else {
                                        if (type != 20011) {
                                            return;
                                        }
                                        LiveEventBus.get("StartScreencast").post(str);
                                        return;
                                    }
                                }
                            }
                            this.f8872a.f8859j = mqttResponseEntity.getData().getTopic();
                            C9799q.f22994a.m19800b(mqttResponseEntity.getData().getFtpPort());
                            ArrayList arrayList = new ArrayList();
                            MqttType[] mqttTypeArrValues = MqttType.values();
                            MyMqttService myMqttService2 = this.f8872a;
                            ArrayList arrayList2 = new ArrayList(mqttTypeArrValues.length);
                            for (MqttType mqttType : mqttTypeArrValues) {
                                arrayList2.add(myMqttService2.f8859j + MqttTopic.TOPIC_LEVEL_SEPARATOR + mqttType.name() + "/all");
                            }
                            MqttType[] mqttTypeArrValues2 = MqttType.values();
                            MyMqttService myMqttService3 = this.f8872a;
                            ArrayList arrayList3 = new ArrayList(mqttTypeArrValues2.length);
                            int length = mqttTypeArrValues2.length;
                            int i11 = 0;
                            while (i11 < length) {
                                arrayList3.add(myMqttService3.f8859j + MqttTopic.TOPIC_LEVEL_SEPARATOR + mqttTypeArrValues2[i11].name() + MqttTopic.TOPIC_LEVEL_SEPARATOR + C5962b.f6082a.m5299a().m5292t());
                                i11++;
                                myMqttService3 = myMqttService3;
                            }
                            arrayList.addAll(arrayList2);
                            arrayList.addAll(arrayList3);
                            MqttAndroidClient mqttAndroidClient = this.f8872a.f8860k;
                            if (mqttAndroidClient != null) {
                                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                ArrayList arrayList4 = new ArrayList(AbstractC10980x.m24153x(arrayList, 10));
                                int size = arrayList.size();
                                while (i10 < size) {
                                    Object obj2 = arrayList.get(i10);
                                    i10++;
                                    arrayList4.add(2);
                                }
                                mqttAndroidClient.subscribe(strArr, AbstractC10947g0.m23921W0(arrayList4));
                            }
                            Observable observable = LiveEventBus.get(MqttEntity.class);
                            MqttType mqttType2 = MqttType.NONE;
                            String json = GsonUtils.toJson(new MqttRequestEntity(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO, null, 2, null));
                            AbstractC9979u.m20293f(json, "toJson(...)");
                            observable.post(new MqttEntity(mqttType2, json, null, 4, null));
                            if (this.f8872a.f8861l) {
                                AbstractC9804v.f23002a.m19815a("ClassSuccessful");
                                return;
                            } else {
                                AbstractC9804v.f23002a.m19815a("ProjectionSuccessful");
                                return;
                            }
                        }
                        return;
                    }
                    if (listM23091I0.size() <= 1) {
                        return;
                    }
                    String str2 = (String) listM23091I0.get(1);
                    if (this.f8872a.f8861l) {
                        switch (str2.hashCode()) {
                            case -1994759229:
                                if (str2.equals("ARRANGE_HOMEWORK")) {
                                    LiveEventBus.get("receiveHomework").post(str);
                                    Observable observable2 = LiveEventBus.get(MqttEntity.class);
                                    MqttType mqttType3 = MqttType.NONE;
                                    String json2 = GsonUtils.toJson(new MqttRequestEntity(RequestManager.NOTIFY_CONNECT_SUCCESS, null, 2, null));
                                    AbstractC9979u.m20293f(json2, "toJson(...)");
                                    observable2.post(new MqttEntity(mqttType3, json2, null, 4, null));
                                    break;
                                } else {
                                    break;
                                }
                            case -1542260721:
                                if (str2.equals("STOP_APPLICATION_BY_PC")) {
                                    LiveEventBus.get("stopApplicationByPc").post(null);
                                    break;
                                } else {
                                    break;
                                }
                            case -595913395:
                                if (str2.equals("TIME_UP")) {
                                    LiveEventBus.get("homeworkTimeUp").post(null);
                                    break;
                                } else {
                                    break;
                                }
                            case -392732188:
                                if (str2.equals("STOP_SCREENCAST_BY_PC")) {
                                    LiveEventBus.get("stopScreencastByPc").post(null);
                                    break;
                                } else {
                                    break;
                                }
                            case 691515868:
                                if (str2.equals("REQUEST_HOMEWORK_STATUS_REPLY")) {
                                    LiveEventBus.get("requestHomeworkStatusReply").post(str);
                                    break;
                                } else {
                                    break;
                                }
                            case 1176900930:
                                if (str2.equals("SUBMIT_HOMEWORK_REPLY")) {
                                    LiveEventBus.get("submitHomeworkReply").post(str);
                                    break;
                                } else {
                                    break;
                                }
                            case 1344628948:
                                if (str2.equals("END_CLASS")) {
                                    LiveEventBus.get("homeworkEndClass").post(str);
                                    break;
                                } else {
                                    break;
                                }
                            case 1526677676:
                                if (str2.equals("IS_STUDENT_ONLINE")) {
                                    AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(this.f8872a), C11157r0.m24799b(), null, new MyMqttService$mqttCallback$1$messageArrived$4(this.f8872a, str, null), 2, null);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    switch (str2.hashCode()) {
                        case -1542260721:
                            if (str2.equals("STOP_APPLICATION_BY_PC")) {
                                LiveEventBus.get("stopApplicationByPc").post(null);
                                break;
                            }
                            break;
                        case -443198745:
                            if (str2.equals("REQUEST_SUBMIT_HOMEWORK")) {
                                MqttResponse mqttResponse = (MqttResponse) GsonUtils.fromJson(str, MqttResponse.class);
                                ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
                                if (classTestHelper.getRecentlyHomework() == null) {
                                    MyMqttService myMqttService4 = this.f8872a;
                                    String strValueOf = String.valueOf(SubmitHomeworkStatus.END_CLASS);
                                    String str3 = this.f8872a.f8859j;
                                    MqttResponse.Student student = mqttResponse.getData().getStudent();
                                    MyMqttService.m6774B(myMqttService4, strValueOf, str3 + "/SUBMIT_HOMEWORK_REPLY/" + (student != null ? student.getStudentId() : null), false, 4, null);
                                    break;
                                } else {
                                    String guid = mqttResponse.getGuid();
                                    MqttResponse recentlyHomework = classTestHelper.getRecentlyHomework();
                                    if (AbstractC9979u.m20289b(guid, recentlyHomework != null ? recentlyHomework.getGuid() : null)) {
                                        MqttResponse recentlyHomework2 = classTestHelper.getRecentlyHomework();
                                        AbstractC9979u.m20291d(recentlyHomework2);
                                        if (recentlyHomework2.getData().getCanSubmit()) {
                                            classTestHelper.addSubmitted(mqttResponse.getData().getStudent());
                                            C6149a.f8778g.m6662a().m6661r(classTestHelper.getSubmittedCount());
                                            if (mqttResponse.getData().getQstType() == 0) {
                                                C9586i0.f22097d.m18816a().m18812d(mqttResponse.getData().getImagePath(), mqttResponse.getData().getStudent());
                                            } else {
                                                C9594q.f22108d.m18824a().m18820d(mqttResponse.getData().getOptions(), mqttResponse.getData().getQstType(), mqttResponse.getData().getStudent(), mqttResponse.getData().getAnswerList());
                                            }
                                            MyMqttService myMqttService5 = this.f8872a;
                                            String strValueOf2 = String.valueOf(SubmitHomeworkStatus.NORMAL);
                                            String str4 = this.f8872a.f8859j;
                                            MqttResponse.Student student2 = mqttResponse.getData().getStudent();
                                            MyMqttService.m6774B(myMqttService5, strValueOf2, str4 + "/SUBMIT_HOMEWORK_REPLY/" + (student2 != null ? student2.getStudentId() : null), false, 4, null);
                                            break;
                                        } else {
                                            MyMqttService myMqttService6 = this.f8872a;
                                            String strValueOf3 = String.valueOf(SubmitHomeworkStatus.TIME_UP);
                                            String str5 = this.f8872a.f8859j;
                                            MqttResponse.Student student3 = mqttResponse.getData().getStudent();
                                            MyMqttService.m6774B(myMqttService6, strValueOf3, str5 + "/SUBMIT_HOMEWORK_REPLY/" + (student3 != null ? student3.getStudentId() : null), false, 4, null);
                                            break;
                                        }
                                    } else {
                                        MyMqttService myMqttService7 = this.f8872a;
                                        String strValueOf4 = String.valueOf(SubmitHomeworkStatus.ID_ERROR);
                                        String str6 = this.f8872a.f8859j;
                                        MqttResponse.Student student4 = mqttResponse.getData().getStudent();
                                        MyMqttService.m6774B(myMqttService7, strValueOf4, str6 + "/SUBMIT_HOMEWORK_REPLY/" + (student4 != null ? student4.getStudentId() : null), false, 4, null);
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        case -392732188:
                            if (str2.equals("STOP_SCREENCAST_BY_PC")) {
                                LiveEventBus.get("stopScreencastByPc").post(null);
                                break;
                            } else {
                                break;
                            }
                        case 682611921:
                            if (str2.equals("REQUEST_HOMEWORK_STATUS")) {
                                ClassTestHelper classTestHelper2 = ClassTestHelper.INSTANCE;
                                if (classTestHelper2.getRecentlyHomework() == null) {
                                    MyMqttService.m6774B(this.f8872a, String.valueOf(HomeworkStatus.END_CLASS), this.f8872a.f8859j + "/REQUEST_HOMEWORK_STATUS_REPLY/" + str, false, 4, null);
                                    break;
                                } else {
                                    MqttResponse recentlyHomework3 = classTestHelper2.getRecentlyHomework();
                                    if (recentlyHomework3 != null && (data = recentlyHomework3.getData()) != null && !data.getCanSubmit()) {
                                        MyMqttService.m6774B(this.f8872a, String.valueOf(HomeworkStatus.TIME_UP), this.f8872a.f8859j + "/REQUEST_HOMEWORK_STATUS_REPLY/" + str, false, 4, null);
                                        break;
                                    } else {
                                        Iterator<T> it = classTestHelper2.getSubmittedList().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                Object next = it.next();
                                                if (AbstractC9979u.m20289b(((MqttResponse.Student) next).getStudentId(), str)) {
                                                    obj = next;
                                                }
                                            } else {
                                                obj = null;
                                            }
                                        }
                                        if (obj != null) {
                                            MyMqttService.m6774B(this.f8872a, String.valueOf(HomeworkStatus.SUBMITTED), this.f8872a.f8859j + "/REQUEST_HOMEWORK_STATUS_REPLY/" + str, false, 4, null);
                                            break;
                                        } else {
                                            Observable observable3 = LiveEventBus.get(MqttEntity.class);
                                            MqttType mqttType4 = MqttType.ARRANGE_HOMEWORK;
                                            String json3 = GsonUtils.toJson(ClassTestHelper.INSTANCE.getRecentlyHomework());
                                            AbstractC9979u.m20293f(json3, "toJson(...)");
                                            observable3.post(new MqttEntity(mqttType4, json3, str));
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 1320744864:
                            if (str2.equals("STUDENT_SCREEN_OFF")) {
                                IfStudentOnline ifStudentOnline = (IfStudentOnline) GsonUtils.fromJson(str, IfStudentOnline.class);
                                LiveEventBus.get(ShowStudentState.class).post(new ShowStudentState(ifStudentOnline.getUuid(), ifStudentOnline.getUserId(), StudentState.f6163c));
                                break;
                            } else {
                                break;
                            }
                        case 1337106286:
                            if (str2.equals("STUDENT_ONLINE_NOW")) {
                                IfStudentOnline ifStudentOnline2 = (IfStudentOnline) GsonUtils.fromJson(str, IfStudentOnline.class);
                                LiveEventBus.get(ShowStudentState.class).post(new ShowStudentState(ifStudentOnline2.getUuid(), ifStudentOnline2.getUserId(), StudentState.f6164d));
                                break;
                            } else {
                                break;
                            }
                    }
                } catch (Exception e10) {
                    AbstractC11958b.m26588i("收发消息时出现错误");
                    LogUtils.m3887e("MyMqttService -> mqttCallback catch,收发消息时出现错误, " + this.f8872a.m6799u(e10));
                    e10.printStackTrace();
                }
            }
        };
    }

    /* renamed from: B */
    public static /* synthetic */ void m6774B(MyMqttService myMqttService, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "board";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        myMqttService.m6797A(str, str2, z10);
    }

    /* renamed from: D */
    public static /* synthetic */ void m6775D(MyMqttService myMqttService, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 3000;
        }
        myMqttService.m6798C(j10);
    }

    /* renamed from: v */
    public static final String m6795v() {
        C5962b.a aVar = C5962b.f6082a;
        return aVar.m5299a().m5281i() + BundleUtil.UNDERLINE_TAG + aVar.m5299a().m5292t() + BundleUtil.UNDERLINE_TAG + aVar.m5299a().m5293u() + BundleUtil.UNDERLINE_TAG + aVar.m5299a().m5287o() + BundleUtil.UNDERLINE_TAG + AbstractC9803u.m19814a() + BundleUtil.UNDERLINE_TAG + aVar.m5299a().m5278f();
    }

    /* renamed from: z */
    public static final void m6796z(MyMqttService myMqttService, MqttEntity mqttEntity) {
        if (mqttEntity.getSpecifiedId().length() == 0) {
            m6774B(myMqttService, mqttEntity.getMessage(), myMqttService.f8859j + MqttTopic.TOPIC_LEVEL_SEPARATOR + mqttEntity.getType().name() + "/all", false, 4, null);
            return;
        }
        if (AbstractC9979u.m20289b(mqttEntity.getSpecifiedId(), "board")) {
            m6774B(myMqttService, mqttEntity.getMessage(), null, false, 6, null);
            return;
        }
        m6774B(myMqttService, mqttEntity.getMessage(), myMqttService.f8859j + MqttTopic.TOPIC_LEVEL_SEPARATOR + mqttEntity.getType().name() + MqttTopic.TOPIC_LEVEL_SEPARATOR + mqttEntity.getSpecifiedId(), false, 4, null);
    }

    /* renamed from: A */
    public final void m6797A(String str, String str2, boolean z10) {
        try {
            MqttAndroidClient mqttAndroidClient = this.f8860k;
            if (mqttAndroidClient == null || !mqttAndroidClient.isConnected()) {
                LogUtils.m3888i("MyMqttService,publish,当前 MQTT 未连接，topic=" + str2);
                return;
            }
            MqttAndroidClient mqttAndroidClient2 = this.f8860k;
            if (mqttAndroidClient2 != null) {
                byte[] bytes = str.getBytes(C10792c.f26019b);
                AbstractC9979u.m20293f(bytes, "getBytes(...)");
                mqttAndroidClient2.publish(str2, bytes, 2, z10);
            }
        } catch (MqttException e10) {
            e10.printStackTrace();
            LogUtils.m3887e("MyMqttService -> publish() catch, topic=" + str2 + ", " + m6799u(e10));
        }
    }

    /* renamed from: C */
    public final void m6798C(long j10) {
        InterfaceC10045g interfaceC10045g = this.f8864o;
        if (interfaceC10045g == null || !interfaceC10045g.isActive()) {
            this.f8864o = AbstractC11117h.m24726d(this.f8863n, null, null, new MyMqttService$scheduleReconnect$1(j10, this, null), 3, null);
        } else {
            LogUtils.m3888i("MyMqttService,scheduleReconnect,已有重连任务，跳过重复调度");
        }
    }

    @Override // com.friday.common.service.BaseLifecycleService, androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m6802y();
        LiveEventBus.get(MqttEntity.class).observe(this, new Observer() { // from class: k3.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MyMqttService.m6796z(this.f23004c, (MqttEntity) obj);
            }
        });
        LiveEventBus.get("mqttServiceStatus").post(Boolean.TRUE);
    }

    @Override // com.friday.common.service.BaseLifecycleService, androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        C9799q.f22994a.m19800b(null);
        LiveEventBus.get("mqttServiceStatus").post(Boolean.FALSE);
        ClassTestHelper.INSTANCE.resetState();
        InterfaceC10045g interfaceC10045g = this.f8864o;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.f8864o = null;
        this.f8865p = false;
        if (ServiceUtils.isServiceRunning((Class<?>) PusherService.class)) {
            ServiceUtils.stopService((Class<?>) PusherService.class);
        }
        CacheMemoryStaticUtils.remove("SimpleCanvasFingerMode");
        try {
            MqttAndroidClient mqttAndroidClient = this.f8860k;
            if (mqttAndroidClient != null) {
                mqttAndroidClient.disconnect(0L, null, new C6156c());
            }
        } catch (Exception e10) {
            LogUtils.m3887e("MyMqttService -> onDestroy catch, " + m6799u(e10));
            e10.printStackTrace();
        }
        super.onDestroy();
    }

    /* renamed from: u */
    public final String m6799u(Throwable th) {
        if (th == null) {
            return "cause=null";
        }
        return "cause=" + th.getClass().getSimpleName() + ", message=" + th.getMessage();
    }

    /* renamed from: w */
    public final void m6800w() {
        MqttAndroidClient mqttAndroidClient = this.f8860k;
        if (mqttAndroidClient == null) {
            LogUtils.m3888i("MyMqttService,doClientConnection,client 为空，跳过连接");
            return;
        }
        AbstractC9979u.m20291d(mqttAndroidClient);
        if (mqttAndroidClient.isConnected()) {
            InterfaceC10045g interfaceC10045g = this.f8864o;
            if (interfaceC10045g != null) {
                InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
            }
            this.f8864o = null;
            this.f8865p = false;
            LogUtils.m3888i("MyMqttService,doClientConnection,已连接，跳过重复 connect");
            return;
        }
        if (this.f8865p) {
            LogUtils.m3888i("MyMqttService,doClientConnection,已有连接请求在执行，跳过重复 connect");
            return;
        }
        if (!NetworkUtils.isWifiConnected()) {
            LogUtils.m3888i("MyMqttService,doClientConnection,wifi 未连接，等待下次重试");
            return;
        }
        MqttAndroidClient mqttAndroidClient2 = this.f8860k;
        if (mqttAndroidClient2 != null) {
            AbstractC9979u.m20291d(mqttAndroidClient2);
            if (mqttAndroidClient2.isConnected() || !NetworkUtils.isWifiConnected()) {
                return;
            }
            try {
                this.f8865p = true;
                MqttAndroidClient mqttAndroidClient3 = this.f8860k;
                if (mqttAndroidClient3 != null) {
                    mqttAndroidClient3.connect(this.f8853d, null, this.f8866q);
                }
            } catch (MqttException e10) {
                this.f8865p = false;
                e10.printStackTrace();
                LogUtils.m3887e("MyMqttService -> doClientConnection() catch, url=" + this.f8857h + ", " + m6799u(e10));
            }
        }
    }

    /* renamed from: x */
    public final String m6801x() {
        return (String) this.f8858i.getValue();
    }

    /* renamed from: y */
    public final void m6802y() {
        C9799q.f22994a.m19800b(null);
        this.f8857h = "tcp://" + C5962b.f6082a.m5299a().m5283k() + ":61136";
        MqttAndroidClient mqttAndroidClient = new MqttAndroidClient(this, this.f8857h, m6801x(), new MemoryPersistence(), MqttAndroidClient.Ack.AUTO_ACK);
        this.f8860k = mqttAndroidClient;
        mqttAndroidClient.setCallback(this.f8868s);
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        this.f8853d = mqttConnectOptions;
        mqttConnectOptions.setCleanSession(true);
        MqttConnectOptions mqttConnectOptions2 = this.f8853d;
        if (mqttConnectOptions2 != null) {
            mqttConnectOptions2.setAutomaticReconnect(true);
        }
        MqttConnectOptions mqttConnectOptions3 = this.f8853d;
        if (mqttConnectOptions3 != null) {
            mqttConnectOptions3.setConnectionTimeout(10);
        }
        MqttConnectOptions mqttConnectOptions4 = this.f8853d;
        if (mqttConnectOptions4 != null) {
            mqttConnectOptions4.setKeepAliveInterval(60);
        }
        MqttConnectOptions mqttConnectOptions5 = this.f8853d;
        if (mqttConnectOptions5 != null) {
            mqttConnectOptions5.setUserName(this.f8854e);
        }
        MqttConnectOptions mqttConnectOptions6 = this.f8853d;
        if (mqttConnectOptions6 != null) {
            char[] charArray = this.f8855f.toCharArray();
            AbstractC9979u.m20293f(charArray, "toCharArray(...)");
            mqttConnectOptions6.setPassword(charArray);
        }
        m6800w();
    }
}
