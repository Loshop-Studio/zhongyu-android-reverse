package p144r0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.AbstractC0621h0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3374e;

/* renamed from: r0.c */
/* loaded from: classes.dex */
public class C3021c {
    /* renamed from: a */
    public static void m10144a(InterfaceC3371b interfaceC3371b) throws SQLException {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorMo3504H = interfaceC3371b.mo3504H("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorMo3504H.moveToNext()) {
            try {
                arrayList.add(cursorMo3504H.getString(0));
            } catch (Throwable th) {
                cursorMo3504H.close();
                throw th;
            }
        }
        cursorMo3504H.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                interfaceC3371b.mo3508h("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: b */
    public static Cursor m10145b(AbstractC0621h0 abstractC0621h0, InterfaceC3374e interfaceC3374e, boolean z3, CancellationSignal cancellationSignal) {
        Cursor cursorM3558z = abstractC0621h0.m3558z(interfaceC3374e, cancellationSignal);
        if (!z3 || !(cursorM3558z instanceof AbstractWindowedCursor)) {
            return cursorM3558z;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorM3558z;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C3020b.m10139a(abstractWindowedCursor) : cursorM3558z;
    }

    /* renamed from: c */
    public static int m10146c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i4 = byteBufferAllocate.getInt();
            channel.close();
            return i4;
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
