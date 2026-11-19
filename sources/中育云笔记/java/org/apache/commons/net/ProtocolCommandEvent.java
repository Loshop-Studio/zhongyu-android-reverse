package org.apache.commons.net;

import java.util.EventObject;

/* loaded from: classes6.dex */
public class ProtocolCommandEvent extends EventObject {

    /* renamed from: c */
    public final int f25349c;

    /* renamed from: d */
    public final boolean f25350d;

    /* renamed from: e */
    public final String f25351e;

    /* renamed from: f */
    public final String f25352f;

    public ProtocolCommandEvent(Object obj, String str, String str2) {
        super(obj);
        this.f25349c = 0;
        this.f25351e = str2;
        this.f25350d = true;
        this.f25352f = str;
    }

    public ProtocolCommandEvent(Object obj, int i10, String str) {
        super(obj);
        this.f25349c = i10;
        this.f25351e = str;
        this.f25350d = false;
        this.f25352f = null;
    }
}
