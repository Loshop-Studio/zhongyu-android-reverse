package p122n0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: n0.b */
/* loaded from: classes.dex */
final class C2879b implements Closeable {

    /* renamed from: a */
    private final File f11289a;

    /* renamed from: b */
    private final long f11290b;

    /* renamed from: c */
    private final File f11291c;

    /* renamed from: d */
    private final RandomAccessFile f11292d;

    /* renamed from: e */
    private final FileChannel f11293e;

    /* renamed from: f */
    private final FileLock f11294f;

    /* renamed from: n0.b$a */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: n0.b$b */
    private static class b extends File {

        /* renamed from: a */
        public long f11296a;

        public b(File file, String str) {
            super(file, str);
            this.f11296a = -1L;
        }
    }

    C2879b(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f11289a = file;
        this.f11291c = file2;
        this.f11290b = m9910o(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f11292d = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f11293e = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f11294f = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e4) {
                e = e4;
                m9906b(this.f11293e);
                throw e;
            } catch (Error e5) {
                e = e5;
                m9906b(this.f11293e);
                throw e;
            } catch (RuntimeException e6) {
                e = e6;
                m9906b(this.f11293e);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e7) {
            m9906b(this.f11292d);
            throw e7;
        }
    }

    /* renamed from: a */
    private void m9905a() {
        File[] fileArrListFiles = this.f11291c.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f11291c.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    /* renamed from: b */
    private static void m9906b(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e4) {
            Log.w("MultiDex", "Failed to close resource", e4);
        }
    }

    /* renamed from: d */
    private static void m9907d(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i4 = inputStream.read(bArr); i4 != -1; i4 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i4);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            m9906b(inputStream);
            fileCreateTempFile.delete();
        }
    }

    /* renamed from: m */
    private static SharedPreferences m9908m(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* renamed from: n */
    private static long m9909n(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    /* renamed from: o */
    private static long m9910o(File file) throws IOException {
        long jM9918c = C2880c.m9918c(file);
        return jM9918c == -1 ? jM9918c - 1 : jM9918c;
    }

    /* renamed from: q */
    private static boolean m9911q(Context context, File file, long j4, String str) {
        SharedPreferences sharedPreferencesM9908m = m9908m(context);
        if (sharedPreferencesM9908m.getLong(str + "timestamp", -1L) == m9909n(file)) {
            if (sharedPreferencesM9908m.getLong(str + "crc", -1L) == j4) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    private List<b> m9912s(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f11289a.getName() + ".classes";
        SharedPreferences sharedPreferencesM9908m = m9908m(context);
        int i4 = sharedPreferencesM9908m.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i4 + (-1));
        int i5 = 2;
        while (i5 <= i4) {
            b bVar = new b(this.f11291c, str2 + i5 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f11296a = m9910o(bVar);
            long j4 = sharedPreferencesM9908m.getLong(str + "dex.crc." + i5, -1L);
            long j5 = sharedPreferencesM9908m.getLong(str + "dex.time." + i5, -1L);
            long jLastModified = bVar.lastModified();
            if (j5 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesM9908m;
                if (j4 == bVar.f11296a) {
                    arrayList.add(bVar);
                    i5++;
                    sharedPreferencesM9908m = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j5 + ", modification time: " + jLastModified + ", expected crc: " + j4 + ", file crc: " + bVar.f11296a);
        }
        return arrayList;
    }

    /* renamed from: t */
    private List<b> m9913t() throws IOException {
        boolean z3;
        String str = this.f11289a.getName() + ".classes";
        m9905a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f11289a);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i4 = 2;
            while (entry != null) {
                b bVar = new b(this.f11291c, str + i4 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i5 = 0;
                boolean z4 = false;
                while (i5 < 3 && !z4) {
                    int i6 = i5 + 1;
                    m9907d(zipFile, entry, bVar, str);
                    try {
                        bVar.f11296a = m9910o(bVar);
                        z3 = true;
                    } catch (IOException e4) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e4);
                        z3 = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z3 ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f11296a);
                    Log.i("MultiDex", sb.toString());
                    if (!z3) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z4 = z3;
                    i5 = i6;
                }
                if (!z4) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i4 + ")");
                }
                i4++;
                entry = zipFile.getEntry("classes" + i4 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e5) {
                Log.w("MultiDex", "Failed to close resource", e5);
            }
            return arrayList;
        } finally {
        }
    }

    /* renamed from: u */
    private static void m9914u(Context context, String str, long j4, long j5, List<b> list) {
        SharedPreferences.Editor editorEdit = m9908m(context).edit();
        editorEdit.putLong(str + "timestamp", j4);
        editorEdit.putLong(str + "crc", j5);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i4 = 2;
        for (b bVar : list) {
            editorEdit.putLong(str + "dex.crc." + i4, bVar.f11296a);
            editorEdit.putLong(str + "dex.time." + i4, bVar.lastModified());
            i4++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f11294f.release();
        this.f11293e.close();
        this.f11292d.close();
    }

    /* renamed from: r */
    List<? extends File> m9915r(Context context, String str, boolean z3) throws IOException {
        List<b> listM9913t;
        List<b> listM9912s;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f11289a.getPath() + ", " + z3 + ", " + str + ")");
        if (!this.f11294f.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z3 && !m9911q(context, this.f11289a, this.f11290b, str)) {
            try {
                listM9912s = m9912s(context, str);
            } catch (IOException e4) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e4);
                listM9913t = m9913t();
                m9914u(context, str, m9909n(this.f11289a), this.f11290b, listM9913t);
            }
            Log.i("MultiDex", "load found " + listM9912s.size() + " secondary dex files");
            return listM9912s;
        }
        if (z3) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listM9913t = m9913t();
        m9914u(context, str, m9909n(this.f11289a), this.f11290b, listM9913t);
        listM9912s = listM9913t;
        Log.i("MultiDex", "load found " + listM9912s.size() + " secondary dex files");
        return listM9912s;
    }
}
