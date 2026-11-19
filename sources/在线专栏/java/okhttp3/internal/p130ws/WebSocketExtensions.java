package okhttp3.internal.p130ws;

import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";

    @Nullable
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;

    @Nullable
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00c3 A[PHI: r7 r9
          0x00c3: PHI (r7v6 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v4 java.lang.Integer), (r7v8 java.lang.Integer) binds: [B:45:0x00b9, B:42:0x00b0, B:26:0x0089] A[DONT_GENERATE, DONT_INLINE]
          0x00c3: PHI (r9v9 java.lang.Integer) = (r9v4 java.lang.Integer), (r9v6 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:45:0x00b9, B:42:0x00b0, B:26:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okhttp3.internal.p130ws.WebSocketExtensions parse(@org.jetbrains.annotations.NotNull okhttp3.Headers r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.WebSocketExtensions.Companion.parse(okhttp3.Headers):okhttp3.internal.ws.WebSocketExtensions");
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public WebSocketExtensions(boolean z3, @Nullable Integer num, boolean z4, @Nullable Integer num2, boolean z5, boolean z6) {
        this.perMessageDeflate = z3;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z4;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z5;
        this.unknownValues = z6;
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z3, Integer num, boolean z4, Integer num2, boolean z5, boolean z6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = webSocketExtensions.perMessageDeflate;
        }
        if ((i4 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i4 & 4) != 0) {
            z4 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z7 = z4;
        if ((i4 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i4 & 16) != 0) {
            z5 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z8 = z5;
        if ((i4 & 32) != 0) {
            z6 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z3, num3, z7, num4, z8, z6);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    @Nullable
    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    @Nullable
    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    @NotNull
    public final WebSocketExtensions copy(boolean z3, @Nullable Integer num, boolean z4, @Nullable Integer num2, boolean z5, boolean z6) {
        return new WebSocketExtensions(z3, num, z4, num2, z5, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && C2769l.m9237a(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && C2769l.m9237a(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z3 = this.perMessageDeflate;
        ?? r02 = z3;
        if (z3) {
            r02 = 1;
        }
        int i4 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i4 + (num != null ? num.hashCode() : 0)) * 31;
        ?? r22 = this.clientNoContextTakeover;
        int i5 = r22;
        if (r22 != 0) {
            i5 = 1;
        }
        int i6 = (iHashCode + i5) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.serverNoContextTakeover;
        int i7 = r23;
        if (r23 != 0) {
            i7 = 1;
        }
        int i8 = (iHashCode2 + i7) * 31;
        boolean z4 = this.unknownValues;
        return i8 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z3) {
        return z3 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    @NotNull
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ")";
    }

    public /* synthetic */ WebSocketExtensions(boolean z3, Integer num, boolean z4, Integer num2, boolean z5, boolean z6, int i4, C2764g c2764g) {
        this((i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? false : z4, (i4 & 8) == 0 ? num2 : null, (i4 & 16) != 0 ? false : z5, (i4 & 32) != 0 ? false : z6);
    }
}
