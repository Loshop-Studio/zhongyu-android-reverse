package com.zykj.message.server;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p108m4.InterfaceC7402a;

@Metadata(m7879d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000fj\u0002\b\u0007¨\u0006\u0010"}, m7880d2 = {"Lcom/zykj/message/server/ClientManage;", "", "<init>", "(Ljava/lang/String;I)V", "", "", "Lm4/a;", "a", "()Ljava/util/Map;", "key", "", "c", "(Ljava/lang/String;)V", "stub", "b", "(Lm4/a;)V", "messageserver_release"}, m7881k = 1, m7882mv = {1, 4, 0})
/* loaded from: classes4.dex */
public enum ClientManage {
    INSTANCES { // from class: com.zykj.message.server.ClientManage.INSTANCES

        /* renamed from: c, reason: from kotlin metadata */
        public final ConcurrentHashMap callBackList = new ConcurrentHashMap();

        @Override // com.zykj.message.server.ClientManage
        /* renamed from: a */
        public Map mo6203a() {
            this.callBackList.size();
            return this.callBackList;
        }

        @Override // com.zykj.message.server.ClientManage
        /* renamed from: b */
        public void mo6204b(InterfaceC7402a stub) {
            Intrinsics.checkParameterIsNotNull(stub, "stub");
            if (this.callBackList.containsKey(stub.getName())) {
                return;
            }
            stub.hashCode();
            stub.getName();
            ConcurrentHashMap concurrentHashMap = this.callBackList;
            String name = stub.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "stub.name");
            concurrentHashMap.put(name, stub);
        }

        @Override // com.zykj.message.server.ClientManage
        /* renamed from: c */
        public void mo6205c(String key) {
            Intrinsics.checkParameterIsNotNull(key, "key");
            Object obj = this.callBackList.get(key);
            if (obj != null) {
                obj.hashCode();
            }
            this.callBackList.remove(key);
        }
    };

    /* renamed from: a */
    public abstract Map mo6203a();

    /* renamed from: b */
    public abstract void mo6204b(InterfaceC7402a stub);

    /* renamed from: c */
    public abstract void mo6205c(String key);

    /* synthetic */ ClientManage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
