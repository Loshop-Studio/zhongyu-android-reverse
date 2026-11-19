package kotlin.annotation;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "SOURCE", "BINARY", "RUNTIME", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AnnotationRetention {
    public static final AnnotationRetention BINARY;
    public static final AnnotationRetention RUNTIME;
    public static final AnnotationRetention SOURCE;

    /* renamed from: a */
    public static final /* synthetic */ AnnotationRetention[] f9159a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f9160b;

    static {
        AnnotationRetention annotationRetention = new AnnotationRetention("SOURCE", 0);
        SOURCE = annotationRetention;
        AnnotationRetention annotationRetention2 = new AnnotationRetention("BINARY", 1);
        BINARY = annotationRetention2;
        AnnotationRetention annotationRetention3 = new AnnotationRetention("RUNTIME", 2);
        RUNTIME = annotationRetention3;
        AnnotationRetention[] annotationRetentionArr = {annotationRetention, annotationRetention2, annotationRetention3};
        f9159a = annotationRetentionArr;
        f9160b = AbstractC5817a.m5310a(annotationRetentionArr);
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f9160b;
    }

    public static AnnotationRetention valueOf(String str) {
        return (AnnotationRetention) Enum.valueOf(AnnotationRetention.class, str);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[]) f9159a.clone();
    }
}
