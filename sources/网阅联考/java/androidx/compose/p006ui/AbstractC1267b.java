package androidx.compose.p006ui;

import androidx.compose.p006ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1267b {
    /* renamed from: a */
    public static boolean m309a(Modifier.Element element, Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    /* renamed from: b */
    public static boolean m310b(Modifier.Element element, Function1 predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return ((Boolean) predicate.invoke(element)).booleanValue();
    }

    /* renamed from: c */
    public static Object m311c(Modifier.Element element, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, element);
    }

    /* renamed from: d */
    public static Object m312d(Modifier.Element element, Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(element, obj);
    }
}
