package p249m7;

import java.io.BufferedInputStream;
import java.io.File;
import java.util.Map;

/* renamed from: m7.a */
/* loaded from: classes5.dex */
public class C10207a {

    /* renamed from: a */
    public String f24311a;

    /* renamed from: b */
    public File f24312b;

    /* renamed from: c */
    public Map f24313c;

    /* renamed from: d */
    public float f24314d;

    /* renamed from: e */
    public boolean f24315e;

    /* renamed from: f */
    public boolean f24316f;

    /* renamed from: g */
    public String f24317g;

    /* renamed from: h */
    public BufferedInputStream f24318h;

    public C10207a(String str, Map map, boolean z10, float f10, boolean z11, File file, String str2) {
        this.f24311a = str;
        this.f24313c = map;
        this.f24315e = z10;
        this.f24314d = f10;
        this.f24316f = z11;
        this.f24312b = file;
        this.f24317g = str2;
    }

    /* renamed from: a */
    public File m21335a() {
        return this.f24312b;
    }

    /* renamed from: b */
    public Map m21336b() {
        return this.f24313c;
    }

    /* renamed from: c */
    public float m21337c() {
        return this.f24314d;
    }

    /* renamed from: d */
    public String m21338d() {
        return this.f24311a;
    }

    /* renamed from: e */
    public BufferedInputStream m21339e() {
        return this.f24318h;
    }

    /* renamed from: f */
    public boolean m21340f() {
        return this.f24316f;
    }

    /* renamed from: g */
    public boolean m21341g() {
        return this.f24315e;
    }

    public C10207a(BufferedInputStream bufferedInputStream, Map map, boolean z10, float f10, boolean z11, File file, String str) {
        this.f24313c = map;
        this.f24315e = z10;
        this.f24314d = f10;
        this.f24316f = z11;
        this.f24312b = file;
        this.f24317g = str;
        this.f24318h = bufferedInputStream;
    }
}
