package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;
import p063g1.AbstractC5558f1;
import p063g1.C5573n;
import p104l1.C6047b;

/* renamed from: com.google.gson.j */
/* loaded from: classes2.dex */
public abstract class AbstractC3863j {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C6047b c6047b = new C6047b(stringWriter);
            c6047b.m5778n(Strictness.LENIENT);
            AbstractC5558f1.f8608B.getClass();
            C5573n.m4907f(c6047b, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
