package com.efs.sdk.base;

import android.app.Application;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.p039a.p041b.C5645a;
import com.efs.sdk.base.p039a.p041b.InterfaceC5649e;
import com.efs.sdk.base.p039a.p042c.C5653a;
import com.efs.sdk.base.p039a.p042c.p043a.C5656c;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p046e.HandlerC5666d;
import com.efs.sdk.base.p039a.p050h.C5683a;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class EfsReporter {
    private static C5661a sControllerCenter;

    public static class Builder {
        private static Map<String, EfsReporter> sInstanceMap = new ConcurrentHashMap();
        private static boolean sUseAppContext = true;
        private final String TAG;
        private C5653a mGlobalEnvStruct;

        public interface IPublicParams {
            Map<String, String> getRecordHeaders();
        }

        public Builder(@NonNull Application application, @NonNull String str, @NonNull String str2) {
            this(application.getApplicationContext(), str, str2);
        }

        private static Context checkContext(Context context) {
            if (context == null) {
                C5697d.m4183b("efs.base", "context can not be null!", null);
                throw null;
            }
            if (!sUseAppContext || (context instanceof Application)) {
                return context;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null && (applicationContext instanceof Application)) {
                return applicationContext;
            }
            C5697d.m4183b("efs.base", "Can not get Application context from given context!", null);
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }

        private void checkParam(String str) {
            C5653a globalEnvStruct = sInstanceMap.get(str).getGlobalEnvStruct();
            if (!globalEnvStruct.f4644c.equals(getGlobalEnvStruct().f4644c)) {
                throw new RuntimeException("efs-core: duplicate init, but application context is different");
            }
            if (!TextUtils.isEmpty(globalEnvStruct.f4643b) && !globalEnvStruct.f4643b.equals(getGlobalEnvStruct().f4643b)) {
                throw new RuntimeException("efs-core: duplicate init, but secret is different");
            }
            if (globalEnvStruct.f4650i != getGlobalEnvStruct().f4650i) {
                throw new RuntimeException("efs-core: duplicate init, but intl setting is different");
            }
            if (!TextUtils.isEmpty(getGlobalEnvStruct().f4649h) && !getGlobalEnvStruct().f4649h.equals(globalEnvStruct.f4649h)) {
                C5697d.m4182a("efs.reporter.builder", "efs-core: duplicate init, but  uid is different", null);
            }
            if (getGlobalEnvStruct().m4060a() == null || getGlobalEnvStruct().m4060a().size() <= 0) {
                return;
            }
            globalEnvStruct.m4061a(getGlobalEnvStruct().m4060a());
        }

        public Builder addEfsReporterObserver(IEfsReporterObserver iEfsReporterObserver) {
            C5653a c5653a = this.mGlobalEnvStruct;
            if (!c5653a.f4656o.contains(iEfsReporterObserver)) {
                c5653a.f4656o.add(iEfsReporterObserver);
            }
            return this;
        }

        public EfsReporter build() {
            String str = getGlobalEnvStruct().f4642a;
            if (!sInstanceMap.containsKey(str)) {
                synchronized (EfsReporter.class) {
                    try {
                        if (!sInstanceMap.containsKey(str)) {
                            EfsReporter efsReporter = new EfsReporter(this);
                            sInstanceMap.put(str, efsReporter);
                            return efsReporter;
                        }
                    } finally {
                    }
                }
            }
            C5697d.m4182a("efs.reporter.builder", "efs-core: duplicate init", null);
            checkParam(str);
            return sInstanceMap.get(str);
        }

        public Builder configRefreshAction(@NonNull IConfigRefreshAction iConfigRefreshAction) {
            C5656c.m4066a().f4667b = iConfigRefreshAction;
            return this;
        }

        public Builder configRefreshDelayMills(long j9) {
            this.mGlobalEnvStruct.f4651j = j9;
            return this;
        }

        public Builder debug(boolean z9) {
            this.mGlobalEnvStruct.f4647f = z9;
            return this;
        }

        public Builder efsDirRootName(String str) {
            C5683a.m4138a(str);
            return this;
        }

        public Builder enableSendLog(boolean z9) {
            this.mGlobalEnvStruct.f4646e = z9;
            return this;
        }

        public Builder enableWaStat(boolean z9) {
            this.mGlobalEnvStruct.f4645d = z9;
            return this;
        }

        public C5653a getGlobalEnvStruct() {
            return this.mGlobalEnvStruct;
        }

        public Builder intl(boolean z9) {
            this.mGlobalEnvStruct.f4650i = z9;
            return this;
        }

        public Builder logEncryptAction(ILogEncryptAction iLogEncryptAction) {
            this.mGlobalEnvStruct.f4654m = iLogEncryptAction;
            return this;
        }

        public Builder maxConcurrentUploadCnt(int i9) {
            HandlerC5666d.m4113a().f4701a = i9;
            return this;
        }

        public Builder printLogDetail(boolean z9) {
            this.mGlobalEnvStruct.f4648g = z9;
            return this;
        }

        public Builder publicParams(@NonNull IPublicParams iPublicParams) {
            if (iPublicParams.getRecordHeaders() != null && iPublicParams.getRecordHeaders().size() > 0) {
                this.mGlobalEnvStruct.m4061a(iPublicParams.getRecordHeaders());
            }
            return this;
        }

        public Builder uid(String str) {
            this.mGlobalEnvStruct.f4649h = str;
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
            C5653a c5653a = new C5653a();
            this.mGlobalEnvStruct = c5653a;
            c5653a.f4644c = contextCheckContext;
            c5653a.f4642a = str;
            c5653a.f4643b = str2;
        }

        public Builder publicParams(@NonNull Map<String, String> map) {
            if (map.size() > 0) {
                this.mGlobalEnvStruct.m4061a(map);
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public C5653a getGlobalEnvStruct() {
        return C5661a.m4097a();
    }

    public void addPublicParams(@NonNull Map<String, String> map) {
        if (map.size() > 0) {
            getGlobalEnvStruct().m4061a(map);
        }
    }

    public void flushRecordLogImmediately(String str) {
        InterfaceC5649e interfaceC5649eM4047a = C5645a.b.f4633a.f4631c.m4047a((byte) 1);
        if (interfaceC5649eM4047a != null) {
            interfaceC5649eM4047a.mo4052a(str);
        }
    }

    public Map<String, String> getAllConfig() {
        return C5656c.m4066a().m4079c();
    }

    public void getAllSdkConfig(String[] strArr, IConfigCallback iConfigCallback) {
        C5656c c5656cM4066a = C5656c.m4066a();
        c5656cM4066a.f4670e.put(iConfigCallback, strArr);
        if (c5656cM4066a.f4669d.f4664e.isEmpty()) {
            return;
        }
        c5656cM4066a.m4080d();
    }

    public void refreshConfig(String str) {
        C5656c.m4066a().m4077a(str);
    }

    public void registerCallback(int i9, ValueCallback<Pair<Message, Message>> valueCallback) {
        C5653a globalEnvStruct = getGlobalEnvStruct();
        if (valueCallback != null) {
            List<ValueCallback<Pair<Message, Message>>> linkedList = globalEnvStruct.f4655n.get(Integer.valueOf(i9));
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                globalEnvStruct.f4655n.putIfAbsent(Integer.valueOf(i9), linkedList);
            }
            linkedList.add(valueCallback);
        }
    }

    public void send(ILogProtocol iLogProtocol) {
        sControllerCenter.m4102a(iLogProtocol);
    }

    public HttpResponse sendSyncImediatelly(String str, int i9, String str2, File file) {
        return sendSyncImediatelly(str, i9, str2, true, file);
    }

    public void setEnableRefreshConfigFromRemote(boolean z9) {
        C5656c.m4066a().f4668c = z9;
    }

    private EfsReporter(Builder builder) {
        sControllerCenter = new C5661a(builder);
    }

    public HttpResponse sendSyncImediatelly(String str, int i9, String str2, boolean z9, File file) {
        return C5661a.m4098a(str, i9, str2, z9, file);
    }

    public Map<String, Object> getAllSdkConfig() {
        return new HashMap(C5656c.m4066a().f4669d.f4664e);
    }
}
