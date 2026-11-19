package androidx.compose.runtime.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "sectionName", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lr6/a;)Ljava/lang/Object;", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(@NotNull String str, @NotNull InterfaceC6469a interfaceC6469a) {
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection(str);
        try {
            T t8 = (T) interfaceC6469a.invoke();
            trace.endSection(objBeginSection);
            return t8;
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th;
        }
    }
}
