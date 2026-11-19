package p219k6;

import android.content.Context;
import android.content.ContextWrapper;
import p319r6.AbstractC10910b;

/* renamed from: k6.c */
/* loaded from: classes5.dex */
public class C9821c extends ContextWrapper {
    public C9821c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static ContextWrapper m19894a(Context context, int i10) {
        if (i10 != -2) {
            AbstractC10910b.m23751d(context, i10);
        }
        return new C9821c(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return "audio".equals(str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
    }
}
