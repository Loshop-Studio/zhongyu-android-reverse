package p183n;

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
import p183n.InterfaceC9073r;
import p297y.C9932m;

/* renamed from: n.j0 */
/* loaded from: classes3.dex */
public abstract class AbstractC9065j0 {
    /* renamed from: b */
    public static final ImageDecoder.Source m14535b(InterfaceC9073r interfaceC9073r, C9932m c9932m, boolean z9) throws ErrnoException {
        Path pathMo14550f;
        if (interfaceC9073r.getFileSystem() == FileSystem.SYSTEM && (pathMo14550f = interfaceC9073r.mo14550f()) != null) {
            return ImageDecoder.createSource(pathMo14550f.toFile());
        }
        InterfaceC9073r.a metadata = interfaceC9073r.getMetadata();
        if (metadata instanceof C9046a) {
            return ImageDecoder.createSource(c9932m.m17108c().getAssets(), ((C9046a) metadata).m14511a());
        }
        if ((metadata instanceof C9056f) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptorM14519a = ((C9056f) metadata).m14519a();
                Os.lseek(assetFileDescriptorM14519a.getFileDescriptor(), assetFileDescriptorM14519a.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: n.i0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC9065j0.m14536c(assetFileDescriptorM14519a);
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof C9075t) {
            C9075t c9075t = (C9075t) metadata;
            if (Intrinsics.areEqual(c9075t.m14556a(), c9932m.m17108c().getPackageName())) {
                return ImageDecoder.createSource(c9932m.m17108c().getResources(), c9075t.m14557b());
            }
        }
        if (!(metadata instanceof C9054e)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z9 || ((C9054e) metadata).m14517a().isDirect()) {
            return ImageDecoder.createSource(((C9054e) metadata).m14517a());
        }
        return null;
    }

    /* renamed from: c */
    public static final AssetFileDescriptor m14536c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
