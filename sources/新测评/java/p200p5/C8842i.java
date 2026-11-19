package p200p5;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p5.i */
/* loaded from: classes4.dex */
public final class C8842i implements JsonDeserializer {
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date deserialize(JsonElement element, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Intrinsics.checkNotNullParameter(element, "element");
        String asString = element.getAsString();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return simpleDateFormat.parse(asString);
        } catch (ParseException unused) {
            return null;
        }
    }
}
