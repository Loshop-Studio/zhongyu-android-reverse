package p172n;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Path;
import p172n.InterfaceC8603r;
import p290y.C9892k;

/* renamed from: n.j0 */
/* loaded from: classes3.dex */
public abstract class AbstractC8595j0 {
    /* renamed from: b */
    public static final ImageDecoder.Source m14144b(InterfaceC8603r interfaceC8603r, C9892k c9892k, boolean z9) throws ErrnoException {
        Path pathMo14158e;
        if (interfaceC8603r.getFileSystem() == FileSystem.SYSTEM && (pathMo14158e = interfaceC8603r.mo14158e()) != null) {
            return ImageDecoder.createSource(pathMo14158e.toFile());
        }
        InterfaceC8603r.a metadata = interfaceC8603r.getMetadata();
        if (metadata instanceof C8576a) {
            return ImageDecoder.createSource(c9892k.m16700c().getAssets(), ((C8576a) metadata).m14121a());
        }
        if ((metadata instanceof C8586f) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptorM14129a = ((C8586f) metadata).m14129a();
                Os.lseek(assetFileDescriptorM14129a.getFileDescriptor(), assetFileDescriptorM14129a.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: n.i0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC8595j0.m14145c(assetFileDescriptorM14129a);
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof C8605t) {
            C8605t c8605t = (C8605t) metadata;
            if (Intrinsics.areEqual(c8605t.m14165a(), c9892k.m16700c().getPackageName())) {
                return ImageDecoder.createSource(c9892k.m16700c().getResources(), c8605t.m14166b());
            }
        }
        if (!(metadata instanceof C8584e)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z9 || ((C8584e) metadata).m14127a().isDirect()) {
            return ImageDecoder.createSource(((C8584e) metadata).m14127a());
        }
        return null;
    }

    /* renamed from: c */
    public static final AssetFileDescriptor m14145c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
