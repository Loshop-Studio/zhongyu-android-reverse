package androidx.compose.p014ui.util;

import android.os.Trace;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(String str, InterfaceC9529a interfaceC9529a) {
        Trace.beginSection(str);
        try {
            return (T) interfaceC9529a.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            Trace.endSection();
            AbstractC9977s.m20285a(1);
        }
    }
}
