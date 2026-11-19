package com.friday.common.network;

import com.zykj.http.bean.HeaderBean;
import com.zykj.message.server.bean.ServerInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC9979u;
import p012ab.AbstractC0101a;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;

/* loaded from: classes3.dex */
public final class RefreshRepositoryImpl extends AbstractC0101a {

    /* renamed from: a */
    public final InterfaceC11603l f6105a;

    /* renamed from: b */
    public final AtomicBoolean f6106b;

    /* renamed from: c */
    public StringBuffer f6107c;

    public RefreshRepositoryImpl(InterfaceC11603l headerBeanFlow) {
        AbstractC9979u.m20294g(headerBeanFlow, "headerBeanFlow");
        this.f6105a = headerBeanFlow;
        this.f6106b = new AtomicBoolean(false);
        this.f6107c = new StringBuffer();
    }

    /* renamed from: c */
    public static final C10786q m5356c(RefreshRepositoryImpl refreshRepositoryImpl, ServerInfo serverInfo) {
        Object value;
        if (serverInfo != null) {
            String strM16568c = serverInfo.m16568c();
            AbstractC9979u.m20293f(strM16568c, "getToken(...)");
            if (strM16568c.length() > 0) {
                InterfaceC11603l interfaceC11603l = refreshRepositoryImpl.f6105a;
                do {
                    value = interfaceC11603l.getValue();
                } while (!interfaceC11603l.mo20870e(value, HeaderBean.copy$default((HeaderBean) value, null, null, null, serverInfo.m16568c(), null, 23, null)));
                refreshRepositoryImpl.f6107c = new StringBuffer(serverInfo.m16568c());
            }
        }
        refreshRepositoryImpl.f6106b.compareAndSet(true, false);
        return C10786q.f26013a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        if (kotlinx.coroutines.DelayKt.m20376b(100, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ca -> B:40:0x00cd). Please report as a decompilation issue!!! */
    @Override // p012ab.AbstractC0101a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo273a(java.lang.String r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.network.RefreshRepositoryImpl.mo273a(java.lang.String, vc.c):java.lang.Object"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/network/RefreshRepositoryImpl.smali:236
    }
}
