package com.google.protobuf;

import com.google.protobuf.TextFormat;

/* loaded from: classes3.dex */
public final class LegacyUnredactedTextFormat {
    private LegacyUnredactedTextFormat() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m3736a(String[] strArr, Object obj) {
        strArr[0] = obj.toString();
    }

    public static String legacyUnredactedMultilineString(MessageOrBuilder messageOrBuilder) {
        return TextFormat.printer().printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.LEGACY_MULTILINE);
    }

    public static String legacyUnredactedSingleLineString(MessageOrBuilder messageOrBuilder) {
        return TextFormat.printer().emittingSingleLine(true).printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.LEGACY_SINGLE_LINE);
    }

    public static String legacyUnredactedStringValueOf(Object obj) {
        return obj == null ? String.valueOf(obj) : legacyUnredactedToString(obj);
    }

    public static String legacyUnredactedToString(final Object obj) {
        final String[] strArr = new String[1];
        ProtobufToStringOutput.callWithTextFormat(new Runnable() { // from class: com.google.protobuf.a
            @Override // java.lang.Runnable
            public final void run() {
                LegacyUnredactedTextFormat.m3736a(strArr, obj);
            }
        });
        return strArr[0];
    }

    public static String legacyUnredactedMultilineString(UnknownFieldSet unknownFieldSet) {
        return TextFormat.printer().printToString(unknownFieldSet);
    }

    public static String legacyUnredactedSingleLineString(UnknownFieldSet unknownFieldSet) {
        return TextFormat.printer().emittingSingleLine(true).printToString(unknownFieldSet);
    }
}
