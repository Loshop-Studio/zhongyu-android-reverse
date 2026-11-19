package com.friday.document.receiver;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.push.notification.CPushMessage;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.LogUtils;
import com.friday.common.dao.ResourceDao;
import com.friday.common.helper.C5962b;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p300q2.AbstractC10721c;
import p309qc.C10786q;
import p310qd.AbstractC10793c0;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.C11119h1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class AliMessageReceiver extends AbstractC10721c {

    /* renamed from: e */
    public ResourceDao f6642e;

    @StabilityInferred(parameters = 1)
    /* renamed from: com.friday.document.receiver.AliMessageReceiver$a */
    public static final class C5988a {

        /* renamed from: a */
        @SerializedName("Picture")
        private final String f6643a;

        /* renamed from: b */
        @SerializedName("Note")
        private final String f6644b;

        /* renamed from: a */
        public final String m5563a() {
            return this.f6643a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5988a)) {
                return false;
            }
            C5988a c5988a = (C5988a) obj;
            return AbstractC9979u.m20289b(this.f6643a, c5988a.f6643a) && AbstractC9979u.m20289b(this.f6644b, c5988a.f6644b);
        }

        public int hashCode() {
            return (this.f6643a.hashCode() * 31) + this.f6644b.hashCode();
        }

        public String toString() {
            return "DeleteEntity(picture=" + this.f6643a + ", note=" + this.f6644b + ")";
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.document.receiver.AliMessageReceiver$onMessage$1", m26211f = "AliMessageReceiver.kt", m26212l = {60}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.document.receiver.AliMessageReceiver$onMessage$1 */
    public static final class C59891 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public Object f6654c;

        /* renamed from: d */
        public Object f6655d;

        /* renamed from: e */
        public Object f6656e;

        /* renamed from: f */
        public Object f6657f;

        /* renamed from: g */
        public Object f6658g;

        /* renamed from: h */
        public Object f6659h;

        /* renamed from: i */
        public Object f6660i;

        /* renamed from: j */
        public int f6661j;

        /* renamed from: k */
        public int f6662k;

        /* renamed from: l */
        public int f6663l;

        /* renamed from: m */
        public final /* synthetic */ CPushMessage f6664m;

        /* renamed from: n */
        public final /* synthetic */ AliMessageReceiver f6665n;

        /* renamed from: com.friday.document.receiver.AliMessageReceiver$onMessage$1$a */
        public static final class a extends TypeToken<List<C5988a>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C59891(CPushMessage cPushMessage, AliMessageReceiver aliMessageReceiver, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f6664m = cPushMessage;
            this.f6665n = aliMessageReceiver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C59891(this.f6664m, this.f6665n, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Iterator it;
            List list;
            Iterable iterable;
            Iterable iterable2;
            AliMessageReceiver aliMessageReceiver;
            int i10;
            Object objM25952f = AbstractC11725a.m25952f();
            int i11 = this.f6663l;
            try {
                if (i11 == 0) {
                    AbstractC9924b.m20071b(obj);
                    LogUtils.m3888i("页面 AliMessageReceiver.kt -> onMessage，SDK原始收到阿里云推送，title=" + this.f6664m.getTitle() + "，message=" + this.f6664m.getContent());
                    String content = this.f6664m.getContent();
                    AbstractC9979u.m20293f(content, "getContent(...)");
                    if (!AbstractC10793c0.m23108U(content, this.f6665n.m5561e(), false, 2, null)) {
                        LogUtils.m3888i("页面 AliMessageReceiver.kt -> onMessage，推送不包含当前用户id，跳过处理，userId=" + this.f6665n.m5561e() + "，message=" + this.f6664m.getContent());
                        return C10786q.f26013a;
                    }
                    LogUtils.m3888i("页面 AliMessageReceiver.kt -> onMessage，收到阿里云推送，title=" + this.f6664m.getTitle() + "，message=" + this.f6664m.getContent());
                    List arrayList = (List) GsonUtils.fromJson(this.f6664m.getContent(), new a().getType());
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (arrayList.isEmpty()) {
                        LogUtils.m3887e("页面 AliMessageReceiver.kt -> onMessage，推送内容为空或解析失败");
                        return C10786q.f26013a;
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (hashSet.add(((C5988a) obj2).m5563a())) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        LogUtils.m3888i("页面 AliMessageReceiver.kt -> onMessage，检测到重复推送，原始条数=" + arrayList.size() + "，去重后条数=" + arrayList2.size());
                    }
                    AliMessageReceiver aliMessageReceiver2 = this.f6665n;
                    it = arrayList2.iterator();
                    list = arrayList;
                    iterable = arrayList2;
                    iterable2 = iterable;
                    aliMessageReceiver = aliMessageReceiver2;
                    i10 = 0;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = this.f6661j;
                    it = (Iterator) this.f6658g;
                    aliMessageReceiver = (AliMessageReceiver) this.f6657f;
                    iterable = (Iterable) this.f6656e;
                    iterable2 = (List) this.f6655d;
                    list = (List) this.f6654c;
                    AbstractC9924b.m20071b(obj);
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    C5988a c5988a = (C5988a) next;
                    this.f6654c = AbstractC11833h.m26224a(list);
                    this.f6655d = AbstractC11833h.m26224a(iterable2);
                    this.f6656e = AbstractC11833h.m26224a(iterable);
                    this.f6657f = aliMessageReceiver;
                    this.f6658g = it;
                    this.f6659h = AbstractC11833h.m26224a(next);
                    this.f6660i = AbstractC11833h.m26224a(c5988a);
                    this.f6661j = i10;
                    this.f6662k = 0;
                    this.f6663l = 1;
                    if (aliMessageReceiver.m5562f(c5988a, this) == objM25952f) {
                        return objM25952f;
                    }
                }
            } catch (Exception e10) {
                LogUtils.m3887e("页面 AliMessageReceiver.kt -> onMessage，处理阿里云推送失败，异常=" + e10.getMessage());
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C59891) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* renamed from: d */
    public final ResourceDao m5560d() {
        ResourceDao resourceDao = this.f6642e;
        if (resourceDao != null) {
            return resourceDao;
        }
        AbstractC9979u.m20312y("resourceDao");
        return null;
    }

    /* renamed from: e */
    public final String m5561e() {
        return String.valueOf(C5962b.f6082a.m5299a().m5292t());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5562f(com.friday.document.receiver.AliMessageReceiver.C5988a r23, vc.InterfaceC11588c r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.document.receiver.AliMessageReceiver.m5562f(com.friday.document.receiver.AliMessageReceiver$a, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/document/receiver/AliMessageReceiver.smali:139
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    public void onMessage(Context context, CPushMessage cPushMessage) {
        AbstractC9979u.m20294g(cPushMessage, "cPushMessage");
        AbstractC11117h.m24726d(C11119h1.f26784c, C11157r0.m24799b(), null, new C59891(cPushMessage, this, null), 2, null);
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    public void onNotification(Context context, String title, String summary, Map extraMap) {
        AbstractC9979u.m20294g(title, "title");
        AbstractC9979u.m20294g(summary, "summary");
        AbstractC9979u.m20294g(extraMap, "extraMap");
        Log.e("MyMessageReceiver", "Receive notification, title: " + title + ", summary: " + summary + ", extraMap: " + extraMap);
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    public void onNotificationClickedWithNoAction(Context context, String title, String summary, String extraMap) {
        AbstractC9979u.m20294g(title, "title");
        AbstractC9979u.m20294g(summary, "summary");
        AbstractC9979u.m20294g(extraMap, "extraMap");
        Log.e("MyMessageReceiver", "onNotificationClickedWithNoAction, title: " + title + ", summary: " + summary + ", extraMap:" + extraMap);
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    public void onNotificationOpened(Context context, String title, String summary, String extraMap) {
        AbstractC9979u.m20294g(title, "title");
        AbstractC9979u.m20294g(summary, "summary");
        AbstractC9979u.m20294g(extraMap, "extraMap");
        Log.e("MyMessageReceiver", "onNotificationOpened, title: " + title + ", summary: " + summary + ", extraMap:" + extraMap);
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    public void onNotificationReceivedInApp(Context context, String title, String summary, Map extraMap, int i10, String openActivity, String openUrl) {
        AbstractC9979u.m20294g(title, "title");
        AbstractC9979u.m20294g(summary, "summary");
        AbstractC9979u.m20294g(extraMap, "extraMap");
        AbstractC9979u.m20294g(openActivity, "openActivity");
        AbstractC9979u.m20294g(openUrl, "openUrl");
        Log.e("MyMessageReceiver", "onNotificationReceivedInApp, title: " + title + ", summary: " + summary + ", extraMap:" + extraMap + ", openType:" + i10 + ", openActivity:" + openActivity + ", openUrl:" + openUrl);
    }

    @Override // com.alibaba.sdk.android.push.MessageReceiver
    public void onNotificationRemoved(Context context, String str) {
        Log.e("MyMessageReceiver", "onNotificationRemoved");
    }
}
