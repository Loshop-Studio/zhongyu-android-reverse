package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.C0616f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p103j.InterfaceC2685a;
import p144r0.C3023e;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;
import p149s0.InterfaceC3374e;
import p149s0.InterfaceC3375f;

/* renamed from: androidx.room.f */
/* loaded from: classes.dex */
final class C0616f implements InterfaceC3372c, InterfaceC0624j {

    /* renamed from: a */
    private final InterfaceC3372c f3938a;

    /* renamed from: b */
    private final a f3939b;

    /* renamed from: c */
    private final C0606a f3940c;

    /* renamed from: androidx.room.f$a */
    static final class a implements InterfaceC3371b {

        /* renamed from: a */
        private final C0606a f3941a;

        a(C0606a c0606a) {
            this.f3941a = c0606a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static /* synthetic */ Object m3497n(String str, InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h(str);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static /* synthetic */ Object m3498o(String str, Object[] objArr, InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3514z(str, objArr);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public static /* synthetic */ Boolean m3499q(InterfaceC3371b interfaceC3371b) {
            return Boolean.valueOf(interfaceC3371b.mo3512v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public static /* synthetic */ Object m3500r(InterfaceC3371b interfaceC3371b) {
            return null;
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: A */
        public void mo3501A() {
            try {
                this.f3941a.m3479e().mo3501A();
            } catch (Throwable th) {
                this.f3941a.m3476b();
                throw th;
            }
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: D */
        public Cursor mo3502D(InterfaceC3374e interfaceC3374e) {
            try {
                return new c(this.f3941a.m3479e().mo3502D(interfaceC3374e), this.f3941a);
            } catch (Throwable th) {
                this.f3941a.m3476b();
                throw th;
            }
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: E */
        public Cursor mo3503E(InterfaceC3374e interfaceC3374e, CancellationSignal cancellationSignal) {
            try {
                return new c(this.f3941a.m3479e().mo3503E(interfaceC3374e, cancellationSignal), this.f3941a);
            } catch (Throwable th) {
                this.f3941a.m3476b();
                throw th;
            }
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: H */
        public Cursor mo3504H(String str) {
            try {
                return new c(this.f3941a.m3479e().mo3504H(str), this.f3941a);
            } catch (Throwable th) {
                this.f3941a.m3476b();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f3941a.m3475a();
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: e */
        public void mo3505e() {
            if (this.f3941a.m3478d() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                this.f3941a.m3478d().mo3505e();
            } finally {
                this.f3941a.m3476b();
            }
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: f */
        public void mo3506f() {
            try {
                this.f3941a.m3479e().mo3506f();
            } catch (Throwable th) {
                this.f3941a.m3476b();
                throw th;
            }
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: g */
        public List<Pair<String, String>> mo3507g() {
            return (List) this.f3941a.m3477c(new InterfaceC2685a() { // from class: p0.a
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return ((InterfaceC3371b) obj).mo3507g();
                }
            });
        }

        @Override // p149s0.InterfaceC3371b
        public String getPath() {
            return (String) this.f3941a.m3477c(new InterfaceC2685a() { // from class: p0.b
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return ((InterfaceC3371b) obj).getPath();
                }
            });
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: h */
        public void mo3508h(final String str) throws SQLException {
            this.f3941a.m3477c(new InterfaceC2685a() { // from class: androidx.room.b
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return C0616f.a.m3497n(str, (InterfaceC3371b) obj);
                }
            });
        }

        @Override // p149s0.InterfaceC3371b
        public boolean isOpen() {
            InterfaceC3371b interfaceC3371bM3478d = this.f3941a.m3478d();
            if (interfaceC3371bM3478d == null) {
                return false;
            }
            return interfaceC3371bM3478d.isOpen();
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: j */
        public InterfaceC3375f mo3509j(String str) {
            return new b(str, this.f3941a);
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: p */
        public boolean mo3510p() {
            if (this.f3941a.m3478d() == null) {
                return false;
            }
            return ((Boolean) this.f3941a.m3477c(new InterfaceC2685a() { // from class: p0.c
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return Boolean.valueOf(((InterfaceC3371b) obj).mo3510p());
                }
            })).booleanValue();
        }

        /* renamed from: s */
        void m3511s() {
            this.f3941a.m3477c(new InterfaceC2685a() { // from class: androidx.room.e
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return C0616f.a.m3500r((InterfaceC3371b) obj);
                }
            });
        }

        @Override // p149s0.InterfaceC3371b
        @SuppressLint({"UnsafeNewApiCall"})
        /* renamed from: v */
        public boolean mo3512v() {
            return ((Boolean) this.f3941a.m3477c(new InterfaceC2685a() { // from class: androidx.room.d
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return C0616f.a.m3499q((InterfaceC3371b) obj);
                }
            })).booleanValue();
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: x */
        public void mo3513x() {
            InterfaceC3371b interfaceC3371bM3478d = this.f3941a.m3478d();
            if (interfaceC3371bM3478d == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
            interfaceC3371bM3478d.mo3513x();
        }

        @Override // p149s0.InterfaceC3371b
        /* renamed from: z */
        public void mo3514z(final String str, final Object[] objArr) throws SQLException {
            this.f3941a.m3477c(new InterfaceC2685a() { // from class: androidx.room.c
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return C0616f.a.m3498o(str, objArr, (InterfaceC3371b) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.room.f$b */
    static class b implements InterfaceC3375f {

        /* renamed from: a */
        private final String f3942a;

        /* renamed from: b */
        private final ArrayList<Object> f3943b = new ArrayList<>();

        /* renamed from: c */
        private final C0606a f3944c;

        b(String str, C0606a c0606a) {
            this.f3942a = str;
            this.f3944c = c0606a;
        }

        /* renamed from: b */
        private void m3516b(InterfaceC3375f interfaceC3375f) {
            int i4 = 0;
            while (i4 < this.f3943b.size()) {
                int i5 = i4 + 1;
                Object obj = this.f3943b.get(i4);
                if (obj == null) {
                    interfaceC3375f.mo3489k(i5);
                } else if (obj instanceof Long) {
                    interfaceC3375f.mo3491w(i5, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    interfaceC3375f.mo3490l(i5, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    interfaceC3375f.mo3488c(i5, (String) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC3375f.mo3486C(i5, (byte[]) obj);
                }
                i4 = i5;
            }
        }

        /* renamed from: d */
        private <T> T m3517d(final InterfaceC2685a<InterfaceC3375f, T> interfaceC2685a) {
            return (T) this.f3944c.m3477c(new InterfaceC2685a() { // from class: androidx.room.g
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return this.f3952a.m3518m(interfaceC2685a, (InterfaceC3371b) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ Object m3518m(InterfaceC2685a interfaceC2685a, InterfaceC3371b interfaceC3371b) {
            InterfaceC3375f interfaceC3375fMo3509j = interfaceC3371b.mo3509j(this.f3942a);
            m3516b(interfaceC3375fMo3509j);
            return interfaceC2685a.apply(interfaceC3375fMo3509j);
        }

        /* renamed from: n */
        private void m3519n(int i4, Object obj) {
            int i5 = i4 - 1;
            if (i5 >= this.f3943b.size()) {
                for (int size = this.f3943b.size(); size <= i5; size++) {
                    this.f3943b.add(null);
                }
            }
            this.f3943b.set(i5, obj);
        }

        @Override // p149s0.InterfaceC3373d
        /* renamed from: C */
        public void mo3486C(int i4, byte[] bArr) {
            m3519n(i4, bArr);
        }

        @Override // p149s0.InterfaceC3375f
        /* renamed from: G */
        public long mo3520G() {
            return ((Long) m3517d(new InterfaceC2685a() { // from class: p0.e
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return Long.valueOf(((InterfaceC3375f) obj).mo3520G());
                }
            })).longValue();
        }

        @Override // p149s0.InterfaceC3373d
        /* renamed from: c */
        public void mo3488c(int i4, String str) {
            m3519n(i4, str);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // p149s0.InterfaceC3375f
        /* renamed from: i */
        public int mo3521i() {
            return ((Integer) m3517d(new InterfaceC2685a() { // from class: p0.d
                @Override // p103j.InterfaceC2685a
                public final Object apply(Object obj) {
                    return Integer.valueOf(((InterfaceC3375f) obj).mo3521i());
                }
            })).intValue();
        }

        @Override // p149s0.InterfaceC3373d
        /* renamed from: k */
        public void mo3489k(int i4) {
            m3519n(i4, null);
        }

        @Override // p149s0.InterfaceC3373d
        /* renamed from: l */
        public void mo3490l(int i4, double d4) {
            m3519n(i4, Double.valueOf(d4));
        }

        @Override // p149s0.InterfaceC3373d
        /* renamed from: w */
        public void mo3491w(int i4, long j4) {
            m3519n(i4, Long.valueOf(j4));
        }
    }

    /* renamed from: androidx.room.f$c */
    private static final class c implements Cursor {

        /* renamed from: a */
        private final Cursor f3945a;

        /* renamed from: b */
        private final C0606a f3946b;

        c(Cursor cursor, C0606a c0606a) {
            this.f3945a = cursor;
            this.f3946b = c0606a;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3945a.close();
            this.f3946b.m3476b();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i4, CharArrayBuffer charArrayBuffer) {
            this.f3945a.copyStringToBuffer(i4, charArrayBuffer);
        }

        @Override // android.database.Cursor
        @Deprecated
        public void deactivate() {
            this.f3945a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i4) {
            return this.f3945a.getBlob(i4);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f3945a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f3945a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.f3945a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i4) {
            return this.f3945a.getColumnName(i4);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f3945a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f3945a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i4) {
            return this.f3945a.getDouble(i4);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f3945a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i4) {
            return this.f3945a.getFloat(i4);
        }

        @Override // android.database.Cursor
        public int getInt(int i4) {
            return this.f3945a.getInt(i4);
        }

        @Override // android.database.Cursor
        public long getLong(int i4) {
            return this.f3945a.getLong(i4);
        }

        @Override // android.database.Cursor
        @SuppressLint({"UnsafeNewApiCall"})
        public Uri getNotificationUri() {
            return this.f3945a.getNotificationUri();
        }

        @Override // android.database.Cursor
        @SuppressLint({"UnsafeNewApiCall"})
        public List<Uri> getNotificationUris() {
            return this.f3945a.getNotificationUris();
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f3945a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i4) {
            return this.f3945a.getShort(i4);
        }

        @Override // android.database.Cursor
        public String getString(int i4) {
            return this.f3945a.getString(i4);
        }

        @Override // android.database.Cursor
        public int getType(int i4) {
            return this.f3945a.getType(i4);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f3945a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f3945a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f3945a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f3945a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f3945a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f3945a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i4) {
            return this.f3945a.isNull(i4);
        }

        @Override // android.database.Cursor
        public boolean move(int i4) {
            return this.f3945a.move(i4);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f3945a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f3945a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f3945a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i4) {
            return this.f3945a.moveToPosition(i4);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f3945a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f3945a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f3945a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        @Deprecated
        public boolean requery() {
            return this.f3945a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f3945a.respond(bundle);
        }

        @Override // android.database.Cursor
        @SuppressLint({"UnsafeNewApiCall"})
        public void setExtras(Bundle bundle) {
            this.f3945a.setExtras(bundle);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f3945a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        @SuppressLint({"UnsafeNewApiCall"})
        public void setNotificationUris(ContentResolver contentResolver, List<Uri> list) {
            this.f3945a.setNotificationUris(contentResolver, list);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f3945a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f3945a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    C0616f(InterfaceC3372c interfaceC3372c, C0606a c0606a) {
        this.f3938a = interfaceC3372c;
        this.f3940c = c0606a;
        c0606a.m3480f(interfaceC3372c);
        this.f3939b = new a(c0606a);
    }

    @Override // p149s0.InterfaceC3372c
    /* renamed from: F */
    public InterfaceC3371b mo3483F() {
        this.f3939b.m3511s();
        return this.f3939b;
    }

    /* renamed from: a */
    C0606a m3492a() {
        return this.f3940c;
    }

    @Override // p149s0.InterfaceC3372c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            this.f3939b.close();
        } catch (IOException e4) {
            C3023e.m10148a(e4);
        }
    }

    @Override // p149s0.InterfaceC3372c
    public String getDatabaseName() {
        return this.f3938a.getDatabaseName();
    }

    @Override // androidx.room.InterfaceC0624j
    public InterfaceC3372c getDelegate() {
        return this.f3938a;
    }

    @Override // p149s0.InterfaceC3372c
    public void setWriteAheadLoggingEnabled(boolean z3) {
        this.f3938a.setWriteAheadLoggingEnabled(z3);
    }
}
