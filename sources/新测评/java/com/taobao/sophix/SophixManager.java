package com.taobao.sophix;

import android.app.Application;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p042a.C6351e;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class SophixManager {
    public static final String VERSION = "3.3.5";

    public static SophixManager getInstance() {
        return C6351e.f4873a;
    }

    public abstract void cleanPatches();

    public abstract Object getPatchStateInfo();

    public abstract void initialize();

    public abstract void killProcessSafely();

    public abstract void queryAndLoadNewPatch();

    public abstract SophixManager setAesKey(String str);

    public abstract SophixManager setAppVersion(String str);

    public abstract SophixManager setContext(Application application);

    public abstract SophixManager setEnableClassLoaderLog();

    public abstract SophixManager setEnableDebug(boolean z9);

    public abstract SophixManager setEnableFullLog();

    public abstract SophixManager setHost(String str, boolean z9);

    public abstract void setOatSdkVersion(int i10);

    public abstract SophixManager setPatchLoadStatusStub(PatchLoadStatusListener patchLoadStatusListener);

    public abstract SophixManager setPreLoadedClass(Class cls);

    public abstract SophixManager setProcessSpecialClass(Class cls);

    public abstract SophixManager setSecretMetaData(String str, String str2, String str3);

    public abstract SophixManager setTags(List<String> list);

    public abstract SophixManager setUnsupportedModel(String str, int i10);

    public abstract SophixManager setUsingEnhance();
}
