package com.efs.sdk.base;

import android.app.Application;
import android.content.Context;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.p020a.p022b.C2905a;
import com.efs.sdk.base.p020a.p022b.InterfaceC2909e;
import com.efs.sdk.base.p020a.p023c.C2913a;
import com.efs.sdk.base.p020a.p023c.p024a.C2916c;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p027e.HandlerC2926d;
import com.efs.sdk.base.p020a.p031h.C2943a;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class EfsReporter {
    private static C2921a sControllerCenter;

    public static class Builder {
        private static Map<String, EfsReporter> sInstanceMap = new ConcurrentHashMap();
        private static boolean sUseAppContext = true;
        private final String TAG;
        private C2913a mGlobalEnvStruct;

        public interface IPublicParams {
            Map<String, String> getRecordHeaders();
        }

        public Builder(@NonNull Application application, @NonNull String str, @NonNull String str2) {
            this(application.getApplicationContext(), str, str2);
        }

        private static Context checkContext(Context context) {
            if (context == null) {
                C2957d.m2214b("efs.base", "context can not be null!", null);
                throw null;
            }
            if (!sUseAppContext || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
                return context;
            }
            C2957d.m2214b("efs.base", "Can not get Application context from given context!", null);
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }

        private void checkParam(String str) {
            C2913a globalEnvStruct = sInstanceMap.get(str).getGlobalEnvStruct();
            if (!globalEnvStruct.f1040c.equals(getGlobalEnvStruct().f1040c)) {
                throw new RuntimeException("efs-core: duplicate init, but application context is different");
            }
            if (!TextUtils.isEmpty(globalEnvStruct.f1039b) && !globalEnvStruct.f1039b.equals(getGlobalEnvStruct().f1039b)) {
                throw new RuntimeException("efs-core: duplicate init, but secret is different");
            }
            if (globalEnvStruct.f1046i != getGlobalEnvStruct().f1046i) {
                throw new RuntimeException("efs-core: duplicate init, but intl setting is different");
            }
            if (!TextUtils.isEmpty(getGlobalEnvStruct().f1045h) && !getGlobalEnvStruct().f1045h.equals(globalEnvStruct.f1045h)) {
                C2957d.m2213a("efs.reporter.builder", "efs-core: duplicate init, but  uid is different", null);
            }
            if (getGlobalEnvStruct().m2091a() == null || getGlobalEnvStruct().m2091a().size() <= 0) {
                return;
            }
            globalEnvStruct.m2092a(getGlobalEnvStruct().m2091a());
        }

        public Builder addEfsReporterObserver(IEfsReporterObserver iEfsReporterObserver) {
            C2913a c2913a = this.mGlobalEnvStruct;
            if (!c2913a.f1052o.contains(iEfsReporterObserver)) {
                c2913a.f1052o.add(iEfsReporterObserver);
            }
            return this;
        }

        public EfsReporter build() {
            String str = getGlobalEnvStruct().f1038a;
            if (!sInstanceMap.containsKey(str)) {
                synchronized (EfsReporter.class) {
                    if (!sInstanceMap.containsKey(str)) {
                        EfsReporter efsReporter = new EfsReporter(this);
                        sInstanceMap.put(str, efsReporter);
                        return efsReporter;
                    }
                }
            }
            C2957d.m2213a("efs.reporter.builder", "efs-core: duplicate init", null);
            checkParam(str);
            return sInstanceMap.get(str);
        }

        public Builder configRefreshAction(@NonNull IConfigRefreshAction iConfigRefreshAction) {
            C2916c.m2097a().f1063b = iConfigRefreshAction;
            return this;
        }

        public Builder configRefreshDelayMills(long j4) {
            this.mGlobalEnvStruct.f1047j = j4;
            return this;
        }

        public Builder debug(boolean z3) {
            this.mGlobalEnvStruct.f1043f = z3;
            return this;
        }

        public Builder efsDirRootName(String str) {
            C2943a.m2169a(str);
            return this;
        }

        public Builder enableSendLog(boolean z3) {
            this.mGlobalEnvStruct.f1042e = z3;
            return this;
        }

        public Builder enableWaStat(boolean z3) {
            this.mGlobalEnvStruct.f1041d = z3;
            return this;
        }

        public C2913a getGlobalEnvStruct() {
            return this.mGlobalEnvStruct;
        }

        public Builder intl(boolean z3) {
            this.mGlobalEnvStruct.f1046i = z3;
            return this;
        }

        public Builder logEncryptAction(ILogEncryptAction iLogEncryptAction) {
            this.mGlobalEnvStruct.f1050m = iLogEncryptAction;
            return this;
        }

        public Builder maxConcurrentUploadCnt(int i4) {
            HandlerC2926d.m2144a().f1097a = i4;
            return this;
        }

        public Builder printLogDetail(boolean z3) {
            this.mGlobalEnvStruct.f1044g = z3;
            return this;
        }

        public Builder publicParams(@NonNull IPublicParams iPublicParams) {
            if (iPublicParams.getRecordHeaders() != null && iPublicParams.getRecordHeaders().size() > 0) {
                this.mGlobalEnvStruct.m2092a(iPublicParams.getRecordHeaders());
            }
            return this;
        }

        public Builder uid(String str) {
            this.mGlobalEnvStruct.f1045h = str;
            return this;
        }

        public Builder(@NonNull Context context, @NonNull String str, @NonNull String str2) {
            this.TAG = "efs.reporter.builder";
            Context contextCheckContext = checkContext(context);
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("EfsReporter init, appid is empty");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new RuntimeException("EfsReporter init, secret is empty");
            }
            C2913a c2913a = new C2913a();
            this.mGlobalEnvStruct = c2913a;
            c2913a.f1040c = contextCheckContext;
            c2913a.f1038a = str;
            c2913a.f1039b = str2;
        }

        public Builder publicParams(@NonNull Map<String, String> map) {
            if (map.size() > 0) {
                this.mGlobalEnvStruct.m2092a(map);
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public C2913a getGlobalEnvStruct() {
        return C2921a.m2128a();
    }

    public void addPublicParams(@NonNull Map<String, String> map) {
        if (map.size() > 0) {
            getGlobalEnvStruct().m2092a(map);
        }
    }

    public void flushRecordLogImmediately(String str) {
        InterfaceC2909e interfaceC2909eM2078a = C2905a.b.f1029a.f1027c.m2078a((byte) 1);
        if (interfaceC2909eM2078a != null) {
            interfaceC2909eM2078a.mo2083a(str);
        }
    }

    public Map<String, String> getAllConfig() {
        return C2916c.m2097a().m2110c();
    }

    public void getAllSdkConfig(String[] strArr, IConfigCallback iConfigCallback) {
        C2916c c2916cM2097a = C2916c.m2097a();
        c2916cM2097a.f1066e.put(iConfigCallback, strArr);
        if (c2916cM2097a.f1065d.f1060e.isEmpty()) {
            return;
        }
        c2916cM2097a.m2111d();
    }

    public void refreshConfig(String str) {
        C2916c.m2097a().m2108a(str);
    }

    public void registerCallback(int i4, ValueCallback<Pair<Message, Message>> valueCallback) {
        C2913a globalEnvStruct = getGlobalEnvStruct();
        if (valueCallback != null) {
            List<ValueCallback<Pair<Message, Message>>> linkedList = globalEnvStruct.f1051n.get(Integer.valueOf(i4));
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                globalEnvStruct.f1051n.putIfAbsent(Integer.valueOf(i4), linkedList);
            }
            linkedList.add(valueCallback);
        }
    }

    public void send(ILogProtocol iLogProtocol) {
        sControllerCenter.m2133a(iLogProtocol);
    }

    public HttpResponse sendSyncImediatelly(String str, int i4, String str2, File file) {
        return sendSyncImediatelly(str, i4, str2, true, file);
    }

    public void setEnableRefreshConfigFromRemote(boolean z3) {
        C2916c.m2097a().f1064c = z3;
    }

    private EfsReporter(Builder builder) {
        sControllerCenter = new C2921a(builder);
    }

    public HttpResponse sendSyncImediatelly(String str, int i4, String str2, boolean z3, File file) {
        return C2921a.m2129a(str, i4, str2, z3, file);
    }

    public Map<String, Object> getAllSdkConfig() {
        return new HashMap(C2916c.m2097a().f1065d.f1060e);
    }
}
