package p160d.p162f.p164b;

import java.util.Objects;

/* JADX WARN: Unexpected interfaces in signature: [java.io.Serializable] */
/* renamed from: d.f.b.e */
/* loaded from: classes.dex */
public abstract class AbstractC1012e<R> implements Object<R> {
    public AbstractC1012e(int i) {
    }

    @Override // java.lang.Object
    public String toString() {
        Objects.requireNonNull(C1013f.f5484a);
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        C1011d.m2808d(string, "Reflection.renderLambdaToString(this)");
        return string;
    }
}
