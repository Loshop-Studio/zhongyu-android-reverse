package p092k4;

import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;
import p111n0.C7447d;

/* renamed from: k4.a */
/* loaded from: classes4.dex */
public final class C6675a implements InterfaceC6286e {
    @Override // p053f0.InterfaceC6286e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6440j mo2796a(InputStream source, int i6, int i7, C6285d options) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        try {
            return new C7447d(SVG.m2982h(source));
        } catch (SVGParseException e6) {
            throw new IOException("Cannot load SVG from stream", e6);
        }
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(InputStream source, C6285d options) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        return true;
    }
}
