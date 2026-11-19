package p149z2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okio.BufferedSource;

/* renamed from: z2.j */
/* loaded from: classes2.dex */
public interface InterfaceC4717j {

    /* renamed from: b */
    public static final a f6276b = new a(null);

    /* renamed from: a */
    public static final InterfaceC4717j f6275a = new a.C4772a();

    /* renamed from: z2.j$a */
    public static final class a {

        /* renamed from: z2.j$a$a, reason: collision with other inner class name */
        public static final class C4772a implements InterfaceC4717j {
            @Override // p149z2.InterfaceC4717j
            /* renamed from: a */
            public boolean mo6911a(int i4, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // p149z2.InterfaceC4717j
            /* renamed from: b */
            public boolean mo6912b(int i4, List responseHeaders, boolean z3) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // p149z2.InterfaceC4717j
            /* renamed from: c */
            public void mo6913c(int i4, ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // p149z2.InterfaceC4717j
            /* renamed from: d */
            public boolean mo6914d(int i4, BufferedSource source, int i5, boolean z3) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i5);
                return true;
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    boolean mo6911a(int i4, List list);

    /* renamed from: b */
    boolean mo6912b(int i4, List list, boolean z3);

    /* renamed from: c */
    void mo6913c(int i4, ErrorCode errorCode);

    /* renamed from: d */
    boolean mo6914d(int i4, BufferedSource bufferedSource, int i5, boolean z3);
}
