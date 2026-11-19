package p228l;

import android.content.res.AssetFileDescriptor;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC9979u;
import okio.FileSystem;
import okio.Path;
import p228l.InterfaceC10085r;
import p380w.C11634n;

/* renamed from: l.j0 */
/* loaded from: classes3.dex */
public abstract class AbstractC10077j0 {
    /* renamed from: b */
    public static final ImageDecoder.Source m21077b(InterfaceC10085r interfaceC10085r, C11634n c11634n, boolean z10) throws ErrnoException {
        Path pathMo21093q;
        if (interfaceC10085r.getFileSystem() == FileSystem.SYSTEM && (pathMo21093q = interfaceC10085r.mo21093q()) != null) {
            return ImageDecoder.createSource(pathMo21093q.toFile());
        }
        InterfaceC10085r.a metadata = interfaceC10085r.getMetadata();
        if (metadata instanceof C10058a) {
            return ImageDecoder.createSource(c11634n.m25743c().getAssets(), ((C10058a) metadata).m21054a());
        }
        if ((metadata instanceof C10068f) && Build.VERSION.SDK_INT >= 29) {
            try {
                final AssetFileDescriptor assetFileDescriptorM21062a = ((C10068f) metadata).m21062a();
                Os.lseek(assetFileDescriptorM21062a.getFileDescriptor(), assetFileDescriptorM21062a.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource((Callable<AssetFileDescriptor>) new Callable() { // from class: l.i0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC10077j0.m21078c(assetFileDescriptorM21062a);
                    }
                });
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof C10087t) {
            C10087t c10087t = (C10087t) metadata;
            if (AbstractC9979u.m20289b(c10087t.m21098a(), c11634n.m25743c().getPackageName())) {
                return ImageDecoder.createSource(c11634n.m25743c().getResources(), c10087t.m21099b());
            }
        }
        if (!(metadata instanceof C10066e)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z10 || ((C10066e) metadata).m21060a().isDirect()) {
            return ImageDecoder.createSource(((C10066e) metadata).m21060a());
        }
        return null;
    }

    /* renamed from: c */
    public static final AssetFileDescriptor m21078c(AssetFileDescriptor assetFileDescriptor) {
        return assetFileDescriptor;
    }
}
