package p272w1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p218r1.AbstractC8999c;
import p272w1.InterfaceC9727a;

/* renamed from: w1.b */
/* loaded from: classes4.dex */
public class C9728b implements InterfaceC9727a {

    /* renamed from: a */
    public final FileChannel f17062a;

    /* renamed from: b */
    public final ParcelFileDescriptor f17063b;

    /* renamed from: c */
    public final BufferedOutputStream f17064c;

    /* renamed from: d */
    public final FileOutputStream f17065d;

    /* renamed from: w1.b$a */
    public static class a implements InterfaceC9727a.a {
        @Override // p272w1.InterfaceC9727a.a
        /* renamed from: a */
        public InterfaceC9727a mo16263a(Context context, Uri uri, int i10) {
            return new C9728b(context, uri, i10);
        }

        @Override // p272w1.InterfaceC9727a.a
        /* renamed from: b */
        public boolean mo16264b() {
            return true;
        }
    }

    public C9728b(Context context, Uri uri, int i10) throws FileNotFoundException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            throw new FileNotFoundException("result of " + uri + " is null!");
        }
        this.f17063b = parcelFileDescriptorOpenFileDescriptor;
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
        this.f17065d = fileOutputStream;
        this.f17062a = fileOutputStream.getChannel();
        this.f17064c = new BufferedOutputStream(fileOutputStream, i10);
    }

    @Override // p272w1.InterfaceC9727a
    /* renamed from: a */
    public void mo16260a(long j10) {
        try {
            Os.posix_fallocate(this.f17063b.getFileDescriptor(), 0L, j10);
        } catch (Throwable th) {
            if (!(th instanceof ErrnoException)) {
                AbstractC8999c.m15142z("DownloadUriOutputStream", "It can't pre-allocate length(" + j10 + ") on the sdk version(" + Build.VERSION.SDK_INT + "), because of " + th);
                return;
            }
            int i10 = th.errno;
            if (i10 == OsConstants.ENOSYS || i10 == OsConstants.ENOTSUP) {
                AbstractC8999c.m15142z("DownloadUriOutputStream", "fallocate() not supported; falling back to ftruncate()");
                try {
                    Os.ftruncate(this.f17063b.getFileDescriptor(), j10);
                } catch (Throwable th2) {
                    AbstractC8999c.m15142z("DownloadUriOutputStream", "It can't pre-allocate length(" + j10 + ") on the sdk version(" + Build.VERSION.SDK_INT + "), because of " + th2);
                }
            }
        }
    }

    @Override // p272w1.InterfaceC9727a
    /* renamed from: b */
    public void mo16261b() throws IOException {
        this.f17064c.flush();
        this.f17063b.getFileDescriptor().sync();
    }

    @Override // p272w1.InterfaceC9727a
    /* renamed from: c */
    public void mo16262c(long j10) throws IOException {
        this.f17062a.position(j10);
    }

    @Override // p272w1.InterfaceC9727a
    public void close() throws IOException {
        this.f17064c.close();
        this.f17065d.close();
        this.f17063b.close();
    }

    @Override // p272w1.InterfaceC9727a
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f17064c.write(bArr, i10, i11);
    }
}
