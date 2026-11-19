package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Objects;
import java.util.concurrent.Callable;
import p144r0.C3019a;
import p144r0.C3021c;
import p144r0.C3022d;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;

/* renamed from: androidx.room.k0 */
/* loaded from: classes.dex */
class C0627k0 implements InterfaceC3372c, InterfaceC0624j {

    /* renamed from: a */
    private final Context f4036a;

    /* renamed from: b */
    private final String f4037b;

    /* renamed from: c */
    private final File f4038c;

    /* renamed from: d */
    private final Callable<InputStream> f4039d;

    /* renamed from: e */
    private final int f4040e;

    /* renamed from: f */
    private final InterfaceC3372c f4041f;

    /* renamed from: g */
    private C0622i f4042g;

    /* renamed from: h */
    private boolean f4043h;

    C0627k0(Context context, String str, File file, Callable<InputStream> callable, int i4, InterfaceC3372c interfaceC3372c) {
        this.f4036a = context;
        this.f4037b = str;
        this.f4038c = file;
        this.f4039d = callable;
        this.f4040e = i4;
        this.f4041f = interfaceC3372c;
    }

    /* renamed from: a */
    private void m3600a(File file, boolean z3) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f4037b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f4036a.getAssets().open(this.f4037b));
        } else if (this.f4038c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f4038c).getChannel();
        } else {
            Callable<InputStream> callable = this.f4039d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
            } catch (Exception e4) {
                throw new IOException("inputStreamCallable exception on call", e4);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f4036a.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        C3022d.m10147a(readableByteChannelNewChannel, new FileOutputStream(fileCreateTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        m3601b(fileCreateTempFile, z3);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    /* renamed from: b */
    private void m3601b(File file, boolean z3) {
        C0622i c0622i = this.f4042g;
        if (c0622i != null) {
            Objects.requireNonNull(c0622i);
        }
    }

    /* renamed from: m */
    private void m3602m(boolean z3) {
        String databaseName = getDatabaseName();
        File databasePath = this.f4036a.getDatabasePath(databaseName);
        C0622i c0622i = this.f4042g;
        C3019a c3019a = new C3019a(databaseName, this.f4036a.getFilesDir(), c0622i == null || c0622i.f4007k);
        try {
            c3019a.m10137b();
            if (!databasePath.exists()) {
                try {
                    m3600a(databasePath, z3);
                    c3019a.m10138c();
                    return;
                } catch (IOException e4) {
                    throw new RuntimeException("Unable to copy database file.", e4);
                }
            }
            if (this.f4042g == null) {
                c3019a.m10138c();
                return;
            }
            try {
                int iM10146c = C3021c.m10146c(databasePath);
                int i4 = this.f4040e;
                if (iM10146c == i4) {
                    c3019a.m10138c();
                    return;
                }
                if (this.f4042g.m3576a(iM10146c, i4)) {
                    c3019a.m10138c();
                    return;
                }
                if (this.f4036a.deleteDatabase(databaseName)) {
                    try {
                        m3600a(databasePath, z3);
                    } catch (IOException e5) {
                        Log.w("ROOM", "Unable to copy database file.", e5);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c3019a.m10138c();
                return;
            } catch (IOException e6) {
                Log.w("ROOM", "Unable to read database version.", e6);
                c3019a.m10138c();
                return;
            }
        } catch (Throwable th) {
            c3019a.m10138c();
            throw th;
        }
        c3019a.m10138c();
        throw th;
    }

    @Override // p149s0.InterfaceC3372c
    /* renamed from: F */
    public synchronized InterfaceC3371b mo3483F() {
        if (!this.f4043h) {
            m3602m(true);
            this.f4043h = true;
        }
        return this.f4041f.mo3483F();
    }

    @Override // p149s0.InterfaceC3372c, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f4041f.close();
        this.f4043h = false;
    }

    /* renamed from: d */
    void m3603d(C0622i c0622i) {
        this.f4042g = c0622i;
    }

    @Override // p149s0.InterfaceC3372c
    public String getDatabaseName() {
        return this.f4041f.getDatabaseName();
    }

    @Override // androidx.room.InterfaceC0624j
    public InterfaceC3372c getDelegate() {
        return this.f4041f;
    }

    @Override // p149s0.InterfaceC3372c
    public void setWriteAheadLoggingEnabled(boolean z3) {
        this.f4041f.setWriteAheadLoggingEnabled(z3);
    }
}
