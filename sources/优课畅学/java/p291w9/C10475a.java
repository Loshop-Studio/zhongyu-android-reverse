package p291w9;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.C9571d;
import okio.Okio;
import okio.Source;

/* renamed from: w9.a */
/* loaded from: classes5.dex */
public final class C10475a extends AbstractC10476b {

    /* renamed from: g */
    public static final a f20809g = new a(null);

    /* renamed from: h */
    public static final String f20810h = "PublicSuffixDatabase.list";

    /* renamed from: f */
    public final String f20811f;

    /* renamed from: w9.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C10475a(String str, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? f20810h : str);
    }

    @Override // p291w9.AbstractC10476b
    /* renamed from: d */
    public Source mo19589d() throws IOException {
        AssetManager assets;
        Context contextM18115b = C9571d.f19219a.m18115b();
        if (contextM18115b == null || (assets = contextM18115b.getAssets()) == null) {
            throw new IOException("Platform applicationContext not initialized");
        }
        InputStream inputStreamOpen = assets.open(mo19588c());
        AbstractC9133u.m16132f(inputStreamOpen, "open(...)");
        return Okio.source(inputStreamOpen);
    }

    @Override // p291w9.AbstractC10476b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String mo19588c() {
        return this.f20811f;
    }

    public C10475a(String path) {
        AbstractC9133u.m16133g(path, "path");
        this.f20811f = path;
    }
}
