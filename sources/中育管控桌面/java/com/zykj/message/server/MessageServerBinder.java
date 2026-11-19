package com.zykj.message.server;

import com.zykj.message.server.bean.ServerInfo;
import com.zykj.message.server.bean.UserInfo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p108m4.InterfaceC7402a;
import p108m4.InterfaceC7403b;
import p108m4.InterfaceC7405d;

/* loaded from: classes4.dex */
public final class MessageServerBinder extends InterfaceC7403b.a {

    /* renamed from: a */
    public final String f7403a;

    /* renamed from: b */
    public final InterfaceC7405d f7404b;

    public MessageServerBinder(String clientName, InterfaceC7405d userInterface) {
        Intrinsics.checkParameterIsNotNull(clientName, "clientName");
        Intrinsics.checkParameterIsNotNull(userInterface, "userInterface");
        this.f7403a = clientName;
        this.f7404b = userInterface;
    }

    @Override // p108m4.InterfaceC7403b
    /* renamed from: a */
    public void mo6211a(String url, String appName, String appPackageName) {
        Intrinsics.checkParameterIsNotNull(url, "url");
        Intrinsics.checkParameterIsNotNull(appName, "appName");
        Intrinsics.checkParameterIsNotNull(appPackageName, "appPackageName");
        this.f7404b.mo5485a(url, appName, appPackageName);
    }

    @Override // p108m4.InterfaceC7403b
    /* renamed from: d */
    public void mo6212d(ServerInfo serverInfo) {
        Objects.toString(serverInfo);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ClientManage.INSTANCES.mo6203a().entrySet()) {
            try {
                ((InterfaceC7402a) entry.getValue()).mo8414i(serverInfo);
            } catch (Exception e6) {
                e6.printStackTrace();
                entry.getValue().hashCode();
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ClientManage.INSTANCES.mo6205c((String) obj);
        }
    }

    @Override // p108m4.InterfaceC7403b
    /* renamed from: e */
    public UserInfo mo6213e() {
        System.out.println((Object) (this.f7403a + "  getUserInfo"));
        return this.f7404b.mo5488d();
    }

    @Override // p108m4.InterfaceC7403b
    /* renamed from: f */
    public void mo6214f(InterfaceC7402a callback) {
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        ClientManage.INSTANCES.mo6204b(callback);
    }

    @Override // p108m4.InterfaceC7403b
    /* renamed from: k */
    public ServerInfo mo6215k() {
        return this.f7404b.mo5487c();
    }

    @Override // p108m4.InterfaceC7403b
    /* renamed from: l */
    public void mo6216l(final InterfaceC7402a callback) {
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        this.f7404b.mo5489e(new Function1<ServerInfo, Unit>() { // from class: com.zykj.message.server.MessageServerBinder$refreshToken$1
            {
                super(1);
            }

            /* renamed from: a */
            public final void m6220a(ServerInfo it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                try {
                    callback.mo8414i(it);
                } catch (Throwable th) {
                    callback.getName();
                    th.printStackTrace();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ServerInfo serverInfo) {
                m6220a(serverInfo);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p108m4.InterfaceC7403b
    /* renamed from: m */
    public void mo6217m(UserInfo userInfo) {
        Objects.toString(userInfo);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ClientManage.INSTANCES.mo6203a().entrySet()) {
            try {
                ((InterfaceC7402a) entry.getValue()).mo8413c(userInfo);
            } catch (Exception e6) {
                e6.printStackTrace();
                entry.getValue().hashCode();
                arrayList.add(entry.getKey());
            }
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ClientManage.INSTANCES.mo6205c((String) obj);
        }
    }

    @Override // p108m4.InterfaceC7403b
    /* renamed from: n */
    public void mo6218n(InterfaceC7402a callback) {
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        ClientManage clientManage = ClientManage.INSTANCES;
        String name = callback.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "callback.name");
        clientManage.mo6205c(name);
    }

    @Override // p108m4.InterfaceC7403b
    /* renamed from: o */
    public String mo6219o() {
        return this.f7404b.mo5486b();
    }
}
