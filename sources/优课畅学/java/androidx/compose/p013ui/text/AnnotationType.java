package androidx.compose.p013ui.text;

import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class AnnotationType {
    private static final /* synthetic */ InterfaceC9760a $ENTRIES;
    private static final /* synthetic */ AnnotationType[] $VALUES;
    public static final AnnotationType Paragraph = new AnnotationType("Paragraph", 0);
    public static final AnnotationType Span = new AnnotationType("Span", 1);
    public static final AnnotationType VerbatimTts = new AnnotationType("VerbatimTts", 2);
    public static final AnnotationType Url = new AnnotationType("Url", 3);
    public static final AnnotationType Link = new AnnotationType("Link", 4);
    public static final AnnotationType Clickable = new AnnotationType("Clickable", 5);
    public static final AnnotationType String = new AnnotationType("String", 6);

    private static final /* synthetic */ AnnotationType[] $values() {
        return new AnnotationType[]{Paragraph, Span, VerbatimTts, Url, Link, Clickable, String};
    }

    static {
        AnnotationType[] annotationTypeArr$values = $values();
        $VALUES = annotationTypeArr$values;
        $ENTRIES = AbstractC9108a.m16085a(annotationTypeArr$values);
    }

    private AnnotationType(String str, int i10) {
    }

    public static InterfaceC9760a getEntries() {
        return $ENTRIES;
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) $VALUES.clone();
    }
}
