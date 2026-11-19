package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.AbstractC2770m;
import org.jetbrains.annotations.NotNull;
import p171x2.InterfaceC3459a;

/* loaded from: classes.dex */
final class Handshake$Companion$handshake$1 extends AbstractC2770m implements InterfaceC3459a<List<? extends Certificate>> {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Handshake$Companion$handshake$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // p171x2.InterfaceC3459a
    @NotNull
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
