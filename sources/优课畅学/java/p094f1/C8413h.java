package p094f1;

import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: f1.h */
/* loaded from: classes4.dex */
public class C8413h {

    /* renamed from: b */
    public Drawable f15973b = null;

    /* renamed from: c */
    public Drawable f15974c = null;

    /* renamed from: d */
    public final LinkedList f15975d = new LinkedList();

    /* renamed from: e */
    public boolean f15976e = false;

    /* renamed from: a */
    public boolean f15972a = false;

    /* renamed from: a */
    public boolean m13738a() {
        return this.f15976e;
    }

    /* renamed from: b */
    public Drawable m13739b() {
        return this.f15973b;
    }

    /* renamed from: c */
    public Drawable m13740c() {
        return this.f15974c;
    }

    /* renamed from: d */
    public List m13741d() {
        return Collections.unmodifiableList(this.f15975d);
    }

    /* renamed from: e */
    public void m13742e() {
        this.f15973b = null;
        this.f15974c = null;
        this.f15975d.clear();
        this.f15972a = false;
        this.f15976e = false;
    }
}
