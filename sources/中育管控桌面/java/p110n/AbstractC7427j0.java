package p110n;

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
import p110n.InterfaceC7435r;
import p187y.C7880m;

/* renamed from: n.j0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7427j0 {
    /* renamed from: b */
    public static final ImageDecoder.Source m8465b(InterfaceC7435r interfaceC7435r, C7880m c7880m, boolean z6) throws ErrnoException {
        Path pathMo8480f;
        if (interfaceC7435r.getFileSystem() == FileSystem.SYSTEM && (pathMo8480f = interfaceC7435r.mo8480f()) != null) {
            return ImageDecoder.createSource(pathMo8480f.toFile());
        }
        InterfaceC7435r.a metadata = interfaceC7435r.getMetadata();
        if (metadata instanceof C7408a) {
            return ImageDecoder.createSource(c7880m.m9661c().getAssets(), ((C7408a) metadata).m8442a());
        }
        if ((metadata instanceof C7418f) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptorM8450a = ((C7418f) metadata).m8450a();
                Os.lseek(assetFileDescriptorM8450a.getFileDescriptor(), assetFileDescriptorM8450a.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: n.i0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC7427j0.m8466c(assetFileDescriptorM8450a);
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof C7437t) {
            C7437t c7437t = (C7437t) metadata;
            if (Intrinsics.areEqual(c7437t.m8486a(), c7880m.m9661c().getPackageName())) {
                return ImageDecoder.createSource(c7880m.m9661c().getResources(), c7437t.m8487b());
            }
        }
        if (!(metadata instanceof C7416e)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z6 || ((C7416e) metadata).m8448a().isDirect()) {
            return ImageDecoder.createSource(((C7416e) metadata).m8448a());
        }
        return null;
    }

    /* renamed from: c */
    public static final AssetFileDescriptor m8466c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
