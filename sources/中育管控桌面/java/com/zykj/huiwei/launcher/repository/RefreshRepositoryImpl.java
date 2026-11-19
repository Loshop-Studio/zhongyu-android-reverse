package com.zykj.huiwei.launcher.repository;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.datastore.core.DataStore;
import com.zykj.huiwei.launcher.api.AuthService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import p135q3.AbstractC7624a;

/* loaded from: classes4.dex */
public final class RefreshRepositoryImpl extends AbstractC7624a {

    /* renamed from: e */
    public static final C6079a f6183e;

    /* renamed from: f */
    public static final int f6184f;

    /* renamed from: g */
    public static final String f6185g;

    /* renamed from: a */
    public final AuthService f6186a;

    /* renamed from: b */
    public final DataStore f6187b;

    /* renamed from: c */
    public final MutableStateFlow f6188c;

    /* renamed from: d */
    public volatile AtomicBoolean f6189d;

    /* renamed from: com.zykj.huiwei.launcher.repository.RefreshRepositoryImpl$a */
    public static final class C6079a {
        public /* synthetic */ C6079a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C6079a() {
        }
    }

    static {
        C6079a c6079a = new C6079a(null);
        f6183e = c6079a;
        f6184f = 8;
        String name = c6079a.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        f6185g = name;
    }

    public RefreshRepositoryImpl(AuthService autoService, DataStore serverBeanDataStore, MutableStateFlow headerBeanFlow) {
        Intrinsics.checkNotNullParameter(autoService, "autoService");
        Intrinsics.checkNotNullParameter(serverBeanDataStore, "serverBeanDataStore");
        Intrinsics.checkNotNullParameter(headerBeanFlow, "headerBeanFlow");
        this.f6186a = autoService;
        this.f6187b = serverBeanDataStore;
        this.f6188c = headerBeanFlow;
        this.f6189d = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f2, code lost:
    
        if (r2 == r3) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    @Override // p135q3.AbstractC7624a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5430a(java.lang.String r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.repository.RefreshRepositoryImpl.mo5430a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/repository/RefreshRepositoryImpl.smali:163
    }
}
