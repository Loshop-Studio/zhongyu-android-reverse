package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.C2769l;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(@NotNull FileChannel fileChannel) {
        C2769l.m9241e(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j4, @NotNull Buffer sink, long j5) throws IOException {
        C2769l.m9241e(sink, "sink");
        if (j5 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j5 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j4, j5, sink);
            j4 += jTransferTo;
            j5 -= jTransferTo;
        }
    }

    public final void write(long j4, @NotNull Buffer source, long j5) throws IOException {
        C2769l.m9241e(source, "source");
        if (j5 < 0 || j5 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j6 = j4;
        long j7 = j5;
        while (j7 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j6, j7);
            j6 += jTransferFrom;
            j7 -= jTransferFrom;
        }
    }
}
