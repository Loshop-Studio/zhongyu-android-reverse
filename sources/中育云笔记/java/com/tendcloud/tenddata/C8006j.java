package com.tendcloud.tenddata;

import anet.channel.request.Request;
import com.tendcloud.tenddata.InterfaceC7876bh;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.j */
/* loaded from: classes5.dex */
class C8006j {

    /* renamed from: d */
    private static final int f15025d = 30000;

    /* renamed from: e */
    private static final ByteBuffer f15026e = ByteBuffer.allocate(0);

    /* renamed from: a */
    private final a f15027a;

    /* renamed from: b */
    private final b f15028b;

    /* renamed from: c */
    private final URI f15029c;

    /* renamed from: com.tendcloud.tenddata.j$a */
    public interface a {
        void bindEvents(JSONObject jSONObject);

        void cleanup();

        void clearEdits(JSONObject jSONObject);

        void performEdit(JSONObject jSONObject);

        void sendDeviceInfo();

        void sendSnapshot(JSONObject jSONObject);

        void setTweaks(JSONObject jSONObject);
    }

    /* renamed from: com.tendcloud.tenddata.j$b */
    public class b extends AbstractRunnableC7859ar {
        public b(URI uri, int i10, Socket socket) {
            super(uri, new C7862au(), null, i10);
            setSocket(socket);
        }

        @Override // com.tendcloud.tenddata.AbstractRunnableC7859ar
        public void onClose(int i10, String str, boolean z10) {
            try {
                C8006j.this.f15027a.cleanup();
            } catch (Throwable unused) {
            }
        }

        @Override // com.tendcloud.tenddata.AbstractRunnableC7859ar
        public void onError(Exception exc) {
            if (exc != null) {
                exc.getMessage();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
        @Override // com.tendcloud.tenddata.AbstractRunnableC7859ar
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onMessage(java.lang.String r8) {
            /*
                r7 = this;
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L9d
                r0.<init>(r8)     // Catch: java.lang.Throwable -> L9d
                java.lang.String r8 = "type"
                java.lang.String r8 = r0.getString(r8)     // Catch: java.lang.Throwable -> L9d
                int r1 = r8.hashCode()     // Catch: java.lang.Throwable -> L9d
                r2 = 4
                r3 = 2
                r4 = 1
                r5 = 5
                r6 = 3
                switch(r1) {
                    case -2061093049: goto L4a;
                    case -1643924835: goto L40;
                    case -1191248640: goto L36;
                    case -1181127916: goto L2c;
                    case -1149619396: goto L22;
                    case 138947050: goto L18;
                    default: goto L17;
                }     // Catch: java.lang.Throwable -> L9d
            L17:
                goto L54
            L18:
                java.lang.String r1 = "dynamic_event_request"
                boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L9d
                if (r8 == 0) goto L54
                r8 = r6
                goto L55
            L22:
                java.lang.String r1 = "tweak_request"
                boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L9d
                if (r8 == 0) goto L54
                r8 = r5
                goto L55
            L2c:
                java.lang.String r1 = "snapshot_request"
                boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L9d
                if (r8 == 0) goto L54
                r8 = r4
                goto L55
            L36:
                java.lang.String r1 = "change_request"
                boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L9d
                if (r8 == 0) goto L54
                r8 = r3
                goto L55
            L40:
                java.lang.String r1 = "clear_request"
                boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L9d
                if (r8 == 0) goto L54
                r8 = r2
                goto L55
            L4a:
                java.lang.String r1 = "device_info_request"
                boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L9d
                if (r8 == 0) goto L54
                r8 = 0
                goto L55
            L54:
                r8 = -1
            L55:
                if (r8 == 0) goto L94
                if (r8 == r4) goto L8a
                if (r8 == r3) goto L80
                if (r8 == r6) goto L76
                if (r8 == r2) goto L6c
                if (r8 == r5) goto L62
                goto L9d
            L62:
                com.tendcloud.tenddata.j r8 = com.tendcloud.tenddata.C8006j.this     // Catch: java.lang.Throwable -> L9d
                com.tendcloud.tenddata.j$a r8 = com.tendcloud.tenddata.C8006j.m12033a(r8)     // Catch: java.lang.Throwable -> L9d
                r8.setTweaks(r0)     // Catch: java.lang.Throwable -> L9d
                return
            L6c:
                com.tendcloud.tenddata.j r8 = com.tendcloud.tenddata.C8006j.this     // Catch: java.lang.Throwable -> L9d
                com.tendcloud.tenddata.j$a r8 = com.tendcloud.tenddata.C8006j.m12033a(r8)     // Catch: java.lang.Throwable -> L9d
                r8.clearEdits(r0)     // Catch: java.lang.Throwable -> L9d
                return
            L76:
                com.tendcloud.tenddata.j r8 = com.tendcloud.tenddata.C8006j.this     // Catch: java.lang.Throwable -> L9d
                com.tendcloud.tenddata.j$a r8 = com.tendcloud.tenddata.C8006j.m12033a(r8)     // Catch: java.lang.Throwable -> L9d
                r8.bindEvents(r0)     // Catch: java.lang.Throwable -> L9d
                return
            L80:
                com.tendcloud.tenddata.j r8 = com.tendcloud.tenddata.C8006j.this     // Catch: java.lang.Throwable -> L9d
                com.tendcloud.tenddata.j$a r8 = com.tendcloud.tenddata.C8006j.m12033a(r8)     // Catch: java.lang.Throwable -> L9d
                r8.performEdit(r0)     // Catch: java.lang.Throwable -> L9d
                return
            L8a:
                com.tendcloud.tenddata.j r8 = com.tendcloud.tenddata.C8006j.this     // Catch: java.lang.Throwable -> L9d
                com.tendcloud.tenddata.j$a r8 = com.tendcloud.tenddata.C8006j.m12033a(r8)     // Catch: java.lang.Throwable -> L9d
                r8.sendSnapshot(r0)     // Catch: java.lang.Throwable -> L9d
                return
            L94:
                com.tendcloud.tenddata.j r8 = com.tendcloud.tenddata.C8006j.this     // Catch: java.lang.Throwable -> L9d
                com.tendcloud.tenddata.j$a r8 = com.tendcloud.tenddata.C8006j.m12033a(r8)     // Catch: java.lang.Throwable -> L9d
                r8.sendDeviceInfo()     // Catch: java.lang.Throwable -> L9d
            L9d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C8006j.b.onMessage(java.lang.String):void");
        }

        @Override // com.tendcloud.tenddata.AbstractRunnableC7859ar
        public void onOpen(InterfaceC7885bq interfaceC7885bq) {
            try {
                C7896ca.iForDeveloper("Websocket connected");
                C7843ab.setDeveloperMode(true);
            } catch (Throwable unused) {
            }
        }
    }

    public C8006j(URI uri, a aVar, Socket socket) throws Exception {
        this.f15027a = aVar;
        this.f15029c = uri;
        try {
            b bVar = new b(uri, 30000, socket);
            this.f15028b = bVar;
            bVar.connectBlocking();
        } catch (InterruptedException e10) {
            throw new Exception(e10);
        }
    }

    /* renamed from: com.tendcloud.tenddata.j$c */
    public class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                C8006j.this.f15028b.sendFragmentedFrame(InterfaceC7876bh.a.TEXT, C8006j.f15026e, true);
            } catch (Throwable unused) {
            }
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            try {
                write(new byte[]{(byte) i10}, 0, 1);
            } catch (Throwable unused) {
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            try {
                write(bArr, 0, bArr.length);
            } catch (Throwable unused) {
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            try {
                C8006j.this.f15028b.sendFragmentedFrame(InterfaceC7876bh.a.TEXT, ByteBuffer.wrap(bArr, i10, i11), false);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public boolean m12037a() {
        return (this.f15028b.isClosed() || this.f15028b.isClosing() || this.f15028b.isFlushAndClose()) ? false : true;
    }

    /* renamed from: b */
    public BufferedOutputStream m12038b() {
        return new BufferedOutputStream(new c());
    }

    /* renamed from: a */
    private static String m12034a(ByteBuffer byteBuffer) throws CharacterCodingException {
        try {
            CharBuffer charBufferDecode = Charset.forName(Request.DEFAULT_CHARSET).newDecoder().decode(byteBuffer);
            byteBuffer.flip();
            return charBufferDecode.toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
