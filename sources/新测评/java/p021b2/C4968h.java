package p021b2;

import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: b2.h */
/* loaded from: classes4.dex */
public class C4968h {

    /* renamed from: b */
    public Drawable f2439b = null;

    /* renamed from: c */
    public Drawable f2440c = null;

    /* renamed from: d */
    public final LinkedList f2441d = new LinkedList();

    /* renamed from: e */
    public boolean f2442e = false;

    /* renamed from: a */
    public boolean f2438a = false;

    /* renamed from: a */
    public boolean m2435a() {
        return this.f2442e;
    }

    /* renamed from: b */
    public Drawable m2436b() {
        return this.f2439b;
    }

    /* renamed from: c */
    public Drawable m2437c() {
        return this.f2440c;
    }

    /* renamed from: d */
    public List m2438d() {
        return Collections.unmodifiableList(this.f2441d);
    }

    /* renamed from: e */
    public void m2439e() {
        this.f2439b = null;
        this.f2440c = null;
        this.f2441d.clear();
        this.f2438a = false;
        this.f2442e = false;
    }
}
