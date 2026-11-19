package p269v1;

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
import p219q1.AbstractC9353c;
import p269v1.InterfaceC9748a;

/* renamed from: v1.b */
/* loaded from: classes4.dex */
public class C9749b implements InterfaceC9748a {

    /* renamed from: a */
    public final FileChannel f17223a;

    /* renamed from: b */
    public final ParcelFileDescriptor f17224b;

    /* renamed from: c */
    public final BufferedOutputStream f17225c;

    /* renamed from: d */
    public final FileOutputStream f17226d;

    /* renamed from: v1.b$a */
    public static class a implements InterfaceC9748a.a {
        @Override // p269v1.InterfaceC9748a.a
        /* renamed from: a */
        public InterfaceC9748a mo16296a(Context context, Uri uri, int i9) {
            return new C9749b(context, uri, i9);
        }

        @Override // p269v1.InterfaceC9748a.a
        /* renamed from: b */
        public boolean mo16297b() {
            return true;
        }
    }

    public C9749b(Context context, Uri uri, int i9) throws FileNotFoundException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            throw new FileNotFoundException("result of " + uri + " is null!");
        }
        this.f17224b = parcelFileDescriptorOpenFileDescriptor;
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
        this.f17226d = fileOutputStream;
        this.f17223a = fileOutputStream.getChannel();
        this.f17225c = new BufferedOutputStream(fileOutputStream, i9);
    }

    @Override // p269v1.InterfaceC9748a
    /* renamed from: a */
    public void mo16293a(long j9) {
        try {
            Os.posix_fallocate(this.f17224b.getFileDescriptor(), 0L, j9);
        } catch (Throwable th) {
            if (!(th instanceof ErrnoException)) {
                AbstractC9353c.m15323z("DownloadUriOutputStream", "It can't pre-allocate length(" + j9 + ") on the sdk version(" + Build.VERSION.SDK_INT + "), because of " + th);
                return;
            }
            int i9 = th.errno;
            if (i9 == OsConstants.ENOSYS || i9 == OsConstants.ENOTSUP) {
                AbstractC9353c.m15323z("DownloadUriOutputStream", "fallocate() not supported; falling back to ftruncate()");
                try {
                    Os.ftruncate(this.f17224b.getFileDescriptor(), j9);
                } catch (Throwable th2) {
                    AbstractC9353c.m15323z("DownloadUriOutputStream", "It can't pre-allocate length(" + j9 + ") on the sdk version(" + Build.VERSION.SDK_INT + "), because of " + th2);
                }
            }
        }
    }

    @Override // p269v1.InterfaceC9748a
    /* renamed from: b */
    public void mo16294b() throws IOException {
        this.f17225c.flush();
        this.f17224b.getFileDescriptor().sync();
    }

    @Override // p269v1.InterfaceC9748a
    /* renamed from: c */
    public void mo16295c(long j9) throws IOException {
        this.f17223a.position(j9);
    }

    @Override // p269v1.InterfaceC9748a
    public void close() throws IOException {
        this.f17225c.close();
        this.f17226d.close();
        this.f17224b.close();
    }

    @Override // p269v1.InterfaceC9748a
    public void write(byte[] bArr, int i9, int i10) throws IOException {
        this.f17225c.write(bArr, i9, i10);
    }
}
