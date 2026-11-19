package com.efs.sdk.base;

import android.app.Application;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.p035a.p037b.C1277a;
import com.efs.sdk.base.p035a.p037b.InterfaceC1281e;
import com.efs.sdk.base.p035a.p038c.C1285a;
import com.efs.sdk.base.p035a.p038c.p039a.C1288c;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p042e.HandlerC1298d;
import com.efs.sdk.base.p035a.p046h.C1315a;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class EfsReporter {
    private static C1293a sControllerCenter;

    public static class Builder {
        private static Map<String, EfsReporter> sInstanceMap = new ConcurrentHashMap();
        private static boolean sUseAppContext = true;
        private final String TAG;
        private C1285a mGlobalEnvStruct;

        public interface IPublicParams {
            Map<String, String> getRecordHeaders();
        }

        public Builder(Application application, String str, String str2) {
            this(application.getApplicationContext(), str, str2);
        }

        private static Context checkContext(Context context) {
            if (context == null) {
                C1329d.m5573b("efs.base", "context can not be null!", null);
                throw null;
            }
            if (!sUseAppContext || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
                return context;
            }
            C1329d.m5573b("efs.base", "Can not get Application context from given context!", null);
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }

        private void checkParam(String str) {
            C1285a globalEnvStruct = sInstanceMap.get(str).getGlobalEnvStruct();
            if (!globalEnvStruct.f7010c.equals(getGlobalEnvStruct().f7010c)) {
                throw new RuntimeException("efs-core: duplicate init, but application context is different");
            }
            if (!TextUtils.isEmpty(globalEnvStruct.f7009b) && !globalEnvStruct.f7009b.equals(getGlobalEnvStruct().f7009b)) {
                throw new RuntimeException("efs-core: duplicate init, but secret is different");
            }
            if (globalEnvStruct.f7016i != getGlobalEnvStruct().f7016i) {
                throw new RuntimeException("efs-core: duplicate init, but intl setting is different");
            }
            if (!TextUtils.isEmpty(getGlobalEnvStruct().f7015h) && !getGlobalEnvStruct().f7015h.equals(globalEnvStruct.f7015h)) {
                C1329d.m5572a("efs.reporter.builder", "efs-core: duplicate init, but  uid is different", null);
            }
            if (getGlobalEnvStruct().m5450a() == null || getGlobalEnvStruct().m5450a().size() <= 0) {
                return;
            }
            globalEnvStruct.m5451a(getGlobalEnvStruct().m5450a());
        }

        public Builder addEfsReporterObserver(IEfsReporterObserver iEfsReporterObserver) {
            C1285a c1285a = this.mGlobalEnvStruct;
            if (!c1285a.f7022o.contains(iEfsReporterObserver)) {
                c1285a.f7022o.add(iEfsReporterObserver);
            }
            return this;
        }

        public EfsReporter build() {
            String str = getGlobalEnvStruct().f7008a;
            if (!sInstanceMap.containsKey(str)) {
                synchronized (EfsReporter.class) {
                    if (!sInstanceMap.containsKey(str)) {
                        EfsReporter efsReporter = new EfsReporter(this);
                        sInstanceMap.put(str, efsReporter);
                        return efsReporter;
                    }
                }
            }
            C1329d.m5572a("efs.reporter.builder", "efs-core: duplicate init", null);
            checkParam(str);
            return sInstanceMap.get(str);
        }

        public Builder configRefreshAction(IConfigRefreshAction iConfigRefreshAction) {
            C1288c.m5456a().f7033b = iConfigRefreshAction;
            return this;
        }

        public Builder configRefreshDelayMills(long j4) {
            this.mGlobalEnvStruct.f7017j = j4;
            return this;
        }

        public Builder debug(boolean z3) {
            this.mGlobalEnvStruct.f7013f = z3;
            return this;
        }

        public Builder efsDirRootName(String str) {
            C1315a.m5528a(str);
            return this;
        }

        public Builder enableSendLog(boolean z3) {
            this.mGlobalEnvStruct.f7012e = z3;
            return this;
        }

        public Builder enableWaStat(boolean z3) {
            this.mGlobalEnvStruct.f7011d = z3;
            return this;
        }

        public C1285a getGlobalEnvStruct() {
            return this.mGlobalEnvStruct;
        }

        public Builder intl(boolean z3) {
            this.mGlobalEnvStruct.f7016i = z3;
            return this;
        }

        public Builder logEncryptAction(ILogEncryptAction iLogEncryptAction) {
            this.mGlobalEnvStruct.f7020m = iLogEncryptAction;
            return this;
        }

        public Builder maxConcurrentUploadCnt(int i4) {
            HandlerC1298d.m5503a().f7067a = i4;
            return this;
        }

        public Builder printLogDetail(boolean z3) {
            this.mGlobalEnvStruct.f7014g = z3;
            return this;
        }

        public Builder publicParams(IPublicParams iPublicParams) {
            if (iPublicParams.getRecordHeaders() != null && iPublicParams.getRecordHeaders().size() > 0) {
                this.mGlobalEnvStruct.m5451a(iPublicParams.getRecordHeaders());
            }
            return this;
        }

        public Builder uid(String str) {
            this.mGlobalEnvStruct.f7015h = str;
            return this;
        }

        public Builder(Context context, String str, String str2) {
            this.TAG = "efs.reporter.builder";
            Context contextCheckContext = checkContext(context);
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("EfsReporter init, appid is empty");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new RuntimeException("EfsReporter init, secret is empty");
            }
            C1285a c1285a = new C1285a();
            this.mGlobalEnvStruct = c1285a;
            c1285a.f7010c = contextCheckContext;
            c1285a.f7008a = str;
            c1285a.f7009b = str2;
        }

        public Builder publicParams(Map<String, String> map) {
            if (map.size() > 0) {
                this.mGlobalEnvStruct.m5451a(map);
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1285a getGlobalEnvStruct() {
        return C1293a.m5487a();
    }

    public void addPublicParams(Map<String, String> map) {
        if (map.size() > 0) {
            getGlobalEnvStruct().m5451a(map);
        }
    }

    public void flushRecordLogImmediately(String str) {
        InterfaceC1281e interfaceC1281eM5437a = C1277a.b.f6999a.f6997c.m5437a((byte) 1);
        if (interfaceC1281eM5437a != null) {
            interfaceC1281eM5437a.mo5442a(str);
        }
    }

    public Map<String, String> getAllConfig() {
        return C1288c.m5456a().m5469c();
    }

    public void getAllSdkConfig(String[] strArr, IConfigCallback iConfigCallback) {
        C1288c c1288cM5456a = C1288c.m5456a();
        c1288cM5456a.f7036e.put(iConfigCallback, strArr);
        if (c1288cM5456a.f7035d.f7030e.isEmpty()) {
            return;
        }
        c1288cM5456a.m5470d();
    }

    public void refreshConfig(String str) {
        C1288c.m5456a().m5467a(str);
    }

    public void registerCallback(int i4, ValueCallback<Pair<Message, Message>> valueCallback) {
        C1285a globalEnvStruct = getGlobalEnvStruct();
        if (valueCallback != null) {
            List<ValueCallback<Pair<Message, Message>>> linkedList = globalEnvStruct.f7021n.get(Integer.valueOf(i4));
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                globalEnvStruct.f7021n.putIfAbsent(Integer.valueOf(i4), linkedList);
            }
            linkedList.add(valueCallback);
        }
    }

    public void send(ILogProtocol iLogProtocol) {
        sControllerCenter.m5492a(iLogProtocol);
    }

    public HttpResponse sendSyncImediatelly(String str, int i4, String str2, File file) {
        return sendSyncImediatelly(str, i4, str2, true, file);
    }

    public void setEnableRefreshConfigFromRemote(boolean z3) {
        C1288c.m5456a().f7034c = z3;
    }

    private EfsReporter(Builder builder) {
        sControllerCenter = new C1293a(builder);
    }

    public HttpResponse sendSyncImediatelly(String str, int i4, String str2, boolean z3, File file) {
        return C1293a.m5488a(str, i4, str2, z3, file);
    }

    public Map<String, Object> getAllSdkConfig() {
        return new HashMap(C1288c.m5456a().f7035d.f7030e);
    }
}
