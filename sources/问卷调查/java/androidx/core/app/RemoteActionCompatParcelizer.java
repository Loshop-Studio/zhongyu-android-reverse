package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import p000a.p067s.AbstractC0442a;
import p000a.p067s.InterfaceC0444c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0442a abstractC0442a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0444c interfaceC0444cM1515o = remoteActionCompat.f3133a;
        if (abstractC0442a.mo1509i(1)) {
            interfaceC0444cM1515o = abstractC0442a.m1515o();
        }
        remoteActionCompat.f3133a = (IconCompat) interfaceC0444cM1515o;
        CharSequence charSequenceMo1508h = remoteActionCompat.f3134b;
        if (abstractC0442a.mo1509i(2)) {
            charSequenceMo1508h = abstractC0442a.mo1508h();
        }
        remoteActionCompat.f3134b = charSequenceMo1508h;
        CharSequence charSequenceMo1508h2 = remoteActionCompat.f3135c;
        if (abstractC0442a.mo1509i(3)) {
            charSequenceMo1508h2 = abstractC0442a.mo1508h();
        }
        remoteActionCompat.f3135c = charSequenceMo1508h2;
        remoteActionCompat.f3136d = (PendingIntent) abstractC0442a.m1513m(remoteActionCompat.f3136d, 4);
        boolean zMo1506f = remoteActionCompat.f3137e;
        if (abstractC0442a.mo1509i(5)) {
            zMo1506f = abstractC0442a.mo1506f();
        }
        remoteActionCompat.f3137e = zMo1506f;
        boolean zMo1506f2 = remoteActionCompat.f3138f;
        if (abstractC0442a.mo1509i(6)) {
            zMo1506f2 = abstractC0442a.mo1506f();
        }
        remoteActionCompat.f3138f = zMo1506f2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0442a abstractC0442a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Objects.requireNonNull(abstractC0442a);
        IconCompat iconCompat = remoteActionCompat.f3133a;
        abstractC0442a.mo1516p(1);
        abstractC0442a.m1523w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3134b;
        abstractC0442a.mo1516p(2);
        abstractC0442a.mo1519s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f3135c;
        abstractC0442a.mo1516p(3);
        abstractC0442a.mo1519s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f3136d;
        abstractC0442a.mo1516p(4);
        abstractC0442a.mo1521u(pendingIntent);
        boolean z = remoteActionCompat.f3137e;
        abstractC0442a.mo1516p(5);
        abstractC0442a.mo1517q(z);
        boolean z2 = remoteActionCompat.f3138f;
        abstractC0442a.mo1516p(6);
        abstractC0442a.mo1517q(z2);
    }
}
