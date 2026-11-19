package com.liulishuo.okdownload;

import java.io.File;
import p207q1.C8879d;
import p229s1.C9126c;
import p229s1.InterfaceC9129f;

/* loaded from: classes2.dex */
public abstract class StatusUtil {

    public enum Status {
        PENDING,
        RUNNING,
        COMPLETED,
        IDLE,
        UNKNOWN
    }

    /* renamed from: a */
    public static boolean m4371a(C6327a c6327a) {
        return m4372b(c6327a) == Status.COMPLETED;
    }

    /* renamed from: b */
    public static Status m4372b(C6327a c6327a) {
        InterfaceC9129f interfaceC9129fM14906a = C8879d.m14905k().m14906a();
        C9126c c9126c = interfaceC9129fM14906a.get(c6327a.mo4385c());
        String strMo4384b = c6327a.mo4384b();
        File fileMo4386d = c6327a.mo4386d();
        File fileM4392l = c6327a.m4392l();
        if (c9126c != null) {
            if (!c9126c.m15478m() && c9126c.m15475j() <= 0) {
                return Status.UNKNOWN;
            }
            if (fileM4392l != null && fileM4392l.equals(c9126c.m15471f()) && fileM4392l.exists() && c9126c.m15476k() == c9126c.m15475j()) {
                return Status.COMPLETED;
            }
            if (strMo4384b == null && c9126c.m15471f() != null && c9126c.m15471f().exists()) {
                return Status.IDLE;
            }
            if (fileM4392l != null && fileM4392l.equals(c9126c.m15471f()) && fileM4392l.exists()) {
                return Status.IDLE;
            }
        } else {
            if (interfaceC9129fM14906a.mo15505l() || interfaceC9129fM14906a.mo15502e(c6327a.mo4385c())) {
                return Status.UNKNOWN;
            }
            if (fileM4392l != null && fileM4392l.exists()) {
                return Status.COMPLETED;
            }
            String strMo15504i = interfaceC9129fM14906a.mo15504i(c6327a.mo4388f());
            if (strMo15504i != null && new File(fileMo4386d, strMo15504i).exists()) {
                return Status.COMPLETED;
            }
        }
        return Status.UNKNOWN;
    }
}
