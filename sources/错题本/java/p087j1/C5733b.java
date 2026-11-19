package p087j1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3870q;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import p095k1.C5752a;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: j1.b */
/* loaded from: classes2.dex */
public final class C5733b extends AbstractC3869p {

    /* renamed from: b */
    public static final a f9067b = new a();

    /* renamed from: a */
    public final SimpleDateFormat f9068a;

    /* renamed from: j1.b$a */
    public class a implements InterfaceC3870q {
        @Override // com.google.gson.InterfaceC3870q
        /* renamed from: c */
        public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
            if (c5752a.f9103a == Time.class) {
                return new C5733b(0);
            }
            return null;
        }
    }

    public /* synthetic */ C5733b(int i) {
        this();
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        Time time;
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        String strM5762v = c6046a.m5762v();
        synchronized (this) {
            TimeZone timeZone = this.f9068a.getTimeZone();
            try {
                try {
                    time = new Time(this.f9068a.parse(strM5762v).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + strM5762v + "' as SQL Time; at path " + c6046a.m5750h(true), e);
                }
            } finally {
                this.f9068a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            c6047b.m5775k();
            return;
        }
        synchronized (this) {
            str = this.f9068a.format((Date) time);
        }
        c6047b.m5783s(str);
    }

    private C5733b() {
        this.f9068a = new SimpleDateFormat("hh:mm:ss a");
    }
}
