package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.C0293a;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.c */
/* loaded from: classes.dex */
public abstract class AbstractC0267c {

    /* renamed from: f */
    public static int f1475f = -1;

    /* renamed from: a */
    int f1476a;

    /* renamed from: b */
    int f1477b;

    /* renamed from: c */
    String f1478c;

    /* renamed from: d */
    protected int f1479d;

    /* renamed from: e */
    HashMap<String, C0293a> f1480e;

    public AbstractC0267c() {
        int i4 = f1475f;
        this.f1476a = i4;
        this.f1477b = i4;
        this.f1478c = null;
    }

    /* renamed from: a */
    public abstract void mo1260a(HashMap<String, AbstractC0282r> map);

    /* renamed from: b */
    abstract void mo1261b(HashSet<String> hashSet);

    /* renamed from: c */
    abstract void mo1262c(Context context, AttributeSet attributeSet);

    /* renamed from: d */
    boolean m1263d(String str) {
        String str2 = this.f1478c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    /* renamed from: e */
    public void mo1264e(HashMap<String, Integer> map) {
    }
}
