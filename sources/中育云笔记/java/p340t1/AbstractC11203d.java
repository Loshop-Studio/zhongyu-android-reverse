package p340t1;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import p329s1.AbstractC11039f;

/* renamed from: t1.d */
/* loaded from: classes3.dex */
public abstract class AbstractC11203d {

    /* renamed from: t1.d$b */
    public static final class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return m24919b(file.lastModified(), file2.lastModified());
        }

        /* renamed from: b */
        public final int m24919b(long j10, long j11) {
            return Long.compare(j10, j11);
        }
    }

    /* renamed from: a */
    public static List m24913a(File file) {
        LinkedList linkedList = new LinkedList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return linkedList;
        }
        List listAsList = Arrays.asList(fileArrListFiles);
        Collections.sort(listAsList, new b());
        return listAsList;
    }

    /* renamed from: b */
    public static void m24914b(File file) throws IOException {
        if (!file.exists()) {
            if (!file.mkdirs()) {
                throw new IOException(String.format("Directory %s can't be created", file.getAbsolutePath()));
            }
        } else {
            if (file.isDirectory()) {
                return;
            }
            throw new IOException("File " + file + " is not directory!");
        }
    }

    /* renamed from: c */
    public static void m24915c(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            m24916d(file);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        long j10 = length - 1;
        randomAccessFile.seek(j10);
        byte b10 = randomAccessFile.readByte();
        randomAccessFile.seek(j10);
        randomAccessFile.write(b10);
        randomAccessFile.close();
    }

    /* renamed from: d */
    public static void m24916d(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        throw new IOException("Error recreate zero-size file " + file);
    }

    /* renamed from: e */
    public static void m24917e(File file) throws IOException {
        if (file.exists()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(jCurrentTimeMillis)) {
                return;
            }
            m24915c(file);
            if (file.lastModified() < jCurrentTimeMillis) {
                AbstractC11039f.m24407g("Last modified date {} is not set for file {}", new Date(file.lastModified()).toString() + SignParameters.NEW_LINE + file.getAbsolutePath());
            }
        }
    }
}
