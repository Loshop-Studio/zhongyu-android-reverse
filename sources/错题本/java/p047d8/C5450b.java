package p047d8;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import okhttp3.AbstractC6297g0;
import okhttp3.AbstractC6326o;
import okhttp3.C6333u;
import okio.Buffer;
import p104l1.C6047b;
import retrofit2.InterfaceC6506m;

/* renamed from: d8.b */
/* loaded from: classes4.dex */
public final class C5450b implements InterfaceC6506m {

    /* renamed from: c */
    public static final C6333u f8414c;

    /* renamed from: a */
    public final C3841g f8415a;

    /* renamed from: b */
    public final AbstractC3869p f8416b;

    static {
        Pattern pattern = C6333u.f10275d;
        f8414c = AbstractC6326o.m5956f("application/json; charset=UTF-8");
    }

    public C5450b(C3841g c3841g, AbstractC3869p abstractC3869p) {
        this.f8415a = c3841g;
        this.f8416b = abstractC3869p;
    }

    @Override // retrofit2.InterfaceC6506m
    public final Object convert(Object obj) throws IOException {
        Buffer buffer = new Buffer();
        C6047b c6047bM2786e = this.f8415a.m2786e(new OutputStreamWriter(buffer.outputStream(), StandardCharsets.UTF_8));
        this.f8416b.mo2780c(c6047bM2786e, obj);
        c6047bM2786e.close();
        return AbstractC6297g0.create(f8414c, buffer.readByteString());
    }
}
