package com.liulishuo.okdownload;

import java.io.File;
import p209p1.C9315d;
import p229r1.C9419c;
import p229r1.InterfaceC9422f;

/* loaded from: classes4.dex */
public abstract class StatusUtil {

    public enum Status {
        PENDING,
        RUNNING,
        COMPLETED,
        IDLE,
        UNKNOWN
    }

    /* renamed from: a */
    public static boolean m4574a(C6593a c6593a) {
        return m4575b(c6593a) == Status.COMPLETED;
    }

    /* renamed from: b */
    public static Status m4575b(C6593a c6593a) {
        InterfaceC9422f interfaceC9422fM15183a = C9315d.m15182k().m15183a();
        C9419c c9419c = interfaceC9422fM15183a.get(c6593a.mo4589c());
        String strMo4588b = c6593a.mo4588b();
        File fileMo4590d = c6593a.mo4590d();
        File fileM4596l = c6593a.m4596l();
        if (c9419c != null) {
            if (!c9419c.m15532m() && c9419c.m15529j() <= 0) {
                return Status.UNKNOWN;
            }
            if (fileM4596l != null && fileM4596l.equals(c9419c.m15525f()) && fileM4596l.exists() && c9419c.m15530k() == c9419c.m15529j()) {
                return Status.COMPLETED;
            }
            if (strMo4588b == null && c9419c.m15525f() != null && c9419c.m15525f().exists()) {
                return Status.IDLE;
            }
            if (fileM4596l != null && fileM4596l.equals(c9419c.m15525f()) && fileM4596l.exists()) {
                return Status.IDLE;
            }
        } else {
            if (interfaceC9422fM15183a.mo15559l() || interfaceC9422fM15183a.mo15554b(c6593a.mo4589c())) {
                return Status.UNKNOWN;
            }
            if (fileM4596l != null && fileM4596l.exists()) {
                return Status.COMPLETED;
            }
            String strMo15557g = interfaceC9422fM15183a.mo15557g(c6593a.mo4592f());
            if (strMo15557g != null && new File(fileMo4590d, strMo15557g).exists()) {
                return Status.COMPLETED;
            }
        }
        return Status.UNKNOWN;
    }

    /* renamed from: c */
    public static boolean m4576c(C6593a c6593a) {
        return C9315d.m15182k().m15187e().m15854g(c6593a) != null;
    }
}
