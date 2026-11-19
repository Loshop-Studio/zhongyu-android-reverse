package p054e7;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import p046d7.C5445b;
import p214z6.AbstractC6833k;

/* renamed from: e7.d */
/* loaded from: classes4.dex */
public abstract class AbstractC5472d {

    /* renamed from: a */
    public static final List f8448a;

    static {
        try {
            f8448a = AbstractC6833k.m6499z(AbstractC6833k.m6493t(Arrays.asList(new C5445b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
