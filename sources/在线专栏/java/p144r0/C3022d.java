package p144r0;

import android.annotation.SuppressLint;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* renamed from: r0.d */
/* loaded from: classes.dex */
public class C3022d {
    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public static void m10147a(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(fileChannel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i4 = inputStreamNewInputStream.read(bArr);
                    if (i4 <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i4);
                    }
                }
            } else {
                fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            }
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
