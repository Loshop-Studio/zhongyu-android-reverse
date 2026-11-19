package com.zykj.study.repository;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.datastore.core.DataStore;
import com.zykj.http.bean.HeaderBean;
import com.zykj.message.server.bean.ServerInfo;
import com.zykj.study.bean.ClientCodeLiveData;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p130i3.AbstractC8756a;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p198o4.InterfaceC9525h;

/* loaded from: classes3.dex */
public final class RefreshRepositoryImp extends AbstractC8756a {

    /* renamed from: h */
    public static final C7750a f11477h;

    /* renamed from: i */
    public static final int f11478i;

    /* renamed from: j */
    public static final String f11479j;

    /* renamed from: a */
    public final InterfaceC9525h f11480a;

    /* renamed from: b */
    public final DataStore f11481b;

    /* renamed from: c */
    public final InterfaceC9270g f11482c;

    /* renamed from: d */
    public InterfaceC9271h f11483d;

    /* renamed from: e */
    public final ClientCodeLiveData f11484e;

    /* renamed from: f */
    public volatile AtomicBoolean f11485f;

    /* renamed from: g */
    public StringBuffer f11486g;

    /* renamed from: com.zykj.study.repository.RefreshRepositoryImp$a */
    public static final class C7750a {
        public /* synthetic */ C7750a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7750a() {
        }
    }

    static {
        C7750a c7750a = new C7750a(null);
        f11477h = c7750a;
        f11478i = 8;
        String name = c7750a.getClass().getName();
        AbstractC9133u.m16132f(name, "getName(...)");
        f11479j = name;
    }

    public RefreshRepositoryImp(InterfaceC9525h autoService, DataStore serverDataStore, InterfaceC9270g unauthorizedFlow, InterfaceC9271h headerBeanFlow, ClientCodeLiveData clientCodeLiveData) {
        AbstractC9133u.m16133g(autoService, "autoService");
        AbstractC9133u.m16133g(serverDataStore, "serverDataStore");
        AbstractC9133u.m16133g(unauthorizedFlow, "unauthorizedFlow");
        AbstractC9133u.m16133g(headerBeanFlow, "headerBeanFlow");
        AbstractC9133u.m16133g(clientCodeLiveData, "clientCodeLiveData");
        this.f11480a = autoService;
        this.f11481b = serverDataStore;
        this.f11482c = unauthorizedFlow;
        this.f11483d = headerBeanFlow;
        this.f11484e = clientCodeLiveData;
        this.f11485f = new AtomicBoolean(false);
        this.f11486g = new StringBuffer();
    }

    /* renamed from: c */
    public static final C8736p m10385c(RefreshRepositoryImp refreshRepositoryImp, ServerInfo serverInfo) {
        Object value;
        if (serverInfo != null) {
            InterfaceC9271h interfaceC9271h = refreshRepositoryImp.f11483d;
            do {
                value = interfaceC9271h.getValue();
            } while (!interfaceC9271h.mo16686e(value, HeaderBean.copy$default((HeaderBean) value, null, null, null, serverInfo.m9597d(), null, 23, null)));
            refreshRepositoryImp.f11486g.insert(0, serverInfo.m9597d());
        }
        refreshRepositoryImp.f11485f.compareAndSet(true, false);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f5 A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:19:0x0063, B:86:0x027f, B:30:0x00a9, B:72:0x01ea, B:74:0x01f5, B:75:0x01fe, B:76:0x0200, B:78:0x0224), top: B:108:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fe A[Catch: all -> 0x0068, TryCatch #2 {all -> 0x0068, blocks: (B:19:0x0063, B:86:0x027f, B:30:0x00a9, B:72:0x01ea, B:74:0x01f5, B:75:0x01fe, B:76:0x0200, B:78:0x0224), top: B:108:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d1  */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.zykj.lib.login.proto.ServerBean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    @Override // p130i3.AbstractC8756a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo10386a(java.lang.String r25, p179m7.InterfaceC9324c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.repository.RefreshRepositoryImp.mo10386a(java.lang.String, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes3/com/zykj/study/repository/RefreshRepositoryImp.smali:334
    }
}
