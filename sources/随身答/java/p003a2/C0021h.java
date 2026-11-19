package p003a2;

import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: a2.h */
/* loaded from: classes4.dex */
public class C0021h {

    /* renamed from: b */
    public Drawable f89b = null;

    /* renamed from: c */
    public Drawable f90c = null;

    /* renamed from: d */
    public final LinkedList f91d = new LinkedList();

    /* renamed from: e */
    public boolean f92e = false;

    /* renamed from: a */
    public boolean f88a = false;

    /* renamed from: a */
    public boolean m146a() {
        return this.f92e;
    }

    /* renamed from: b */
    public Drawable m147b() {
        return this.f89b;
    }

    /* renamed from: c */
    public Drawable m148c() {
        return this.f90c;
    }

    /* renamed from: d */
    public List m149d() {
        return Collections.unmodifiableList(this.f91d);
    }

    /* renamed from: e */
    public void m150e() {
        this.f89b = null;
        this.f90c = null;
        this.f91d.clear();
        this.f88a = false;
        this.f92e = false;
    }
}
