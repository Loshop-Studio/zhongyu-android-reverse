package p158t5;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.C7537d;
import okio.Okio;
import okio.Source;

/* renamed from: t5.a */
/* loaded from: classes4.dex */
public final class C7729a extends AbstractC7730b {

    /* renamed from: g */
    public static final a f10210g = new a(null);

    /* renamed from: h */
    public static final String f10211h = "PublicSuffixDatabase.list";

    /* renamed from: f */
    public final String f10212f;

    /* renamed from: t5.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C7729a(String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? f10211h : str);
    }

    @Override // p158t5.AbstractC7730b
    /* renamed from: d */
    public Source mo9211d() throws IOException {
        AssetManager assets;
        Context contextM8934b = C7537d.f9997a.m8934b();
        if (contextM8934b == null || (assets = contextM8934b.getAssets()) == null) {
            throw new IOException("Platform applicationContext not initialized");
        }
        InputStream inputStreamOpen = assets.open(mo9210c());
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return Okio.source(inputStreamOpen);
    }

    @Override // p158t5.AbstractC7730b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String mo9210c() {
        return this.f10212f;
    }

    public C7729a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f10212f = path;
    }
}
