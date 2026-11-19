package p086e5;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.zykj.study.bean.exercise.QuestionExtra;
import java.lang.reflect.Type;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: e5.l */
/* loaded from: classes5.dex */
public final class C8363l implements JsonDeserializer {
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public QuestionExtra deserialize(JsonElement element, Type type, JsonDeserializationContext jsonDeserializationContext) {
        AbstractC9133u.m16133g(element, "element");
        try {
            return (QuestionExtra) new Gson().fromJson(element.getAsString(), QuestionExtra.class);
        } catch (JsonParseException unused) {
            return null;
        }
    }
}
