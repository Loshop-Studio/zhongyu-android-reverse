package p054f1;

import com.dylanc.longan.Logger;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: f1.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6292d {
    /* renamed from: a */
    public static final String m6441a(StackTraceElement stackTraceElement) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "<this>");
        String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "className");
        List listSplit$default = StringsKt.split$default((CharSequence) className, new String[]{"."}, false, 0, 6, (Object) null);
        if (listSplit$default.isEmpty()) {
            return null;
        }
        return AbstractC6295g.m6445a((String) CollectionsKt.last(listSplit$default), 23);
    }

    /* renamed from: b */
    public static final boolean m6442b(StackTraceElement stackTraceElement) {
        Intrinsics.checkNotNullParameter(stackTraceElement, "<this>");
        return stackTraceElement.isNativeMethod() || Intrinsics.areEqual(stackTraceElement.getClassName(), Thread.class.getName()) || Intrinsics.areEqual(stackTraceElement.getClassName(), Logger.class.getName());
    }

    /* renamed from: c */
    public static final void m6443c(int i6, String tag, Object obj, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Logger.Companion companion = Logger.f3268a;
        if (((Boolean) companion.m3336b().invoke(Integer.valueOf(i6), tag)).booleanValue()) {
            companion.m3335a().mo6444a(i6, tag, String.valueOf(obj), th);
        }
    }
}
