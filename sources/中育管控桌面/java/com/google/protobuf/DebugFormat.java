package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.TextFormat;

/* loaded from: classes3.dex */
public final class DebugFormat {
    private final boolean isSingleLine;

    private DebugFormat(boolean z6) {
        this.isSingleLine = z6;
    }

    public static DebugFormat multiline() {
        return new DebugFormat(false);
    }

    public static DebugFormat singleLine() {
        return new DebugFormat(true);
    }

    public Object lazyToString(MessageOrBuilder messageOrBuilder) {
        return new LazyDebugOutput(messageOrBuilder, this);
    }

    public String toString(MessageOrBuilder messageOrBuilder) {
        return !this.isSingleLine ? TextFormat.debugFormatPrinter().printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.DEBUG_MULTILINE) : TextFormat.debugFormatPrinter().emittingSingleLine(this.isSingleLine).printToString(messageOrBuilder, TextFormat.Printer.FieldReporterLevel.DEBUG_SINGLE_LINE);
    }

    public Object lazyToString(UnknownFieldSet unknownFieldSet) {
        return new LazyDebugOutput(unknownFieldSet, this);
    }

    public static class LazyDebugOutput {
        private final UnknownFieldSet fields;
        private final DebugFormat format;
        private final MessageOrBuilder message;

        public LazyDebugOutput(MessageOrBuilder messageOrBuilder, DebugFormat debugFormat) {
            this.message = messageOrBuilder;
            this.fields = null;
            this.format = debugFormat;
        }

        public String toString() {
            MessageOrBuilder messageOrBuilder = this.message;
            return messageOrBuilder != null ? this.format.toString(messageOrBuilder) : this.format.toString(this.fields);
        }

        public LazyDebugOutput(UnknownFieldSet unknownFieldSet, DebugFormat debugFormat) {
            this.message = null;
            this.fields = unknownFieldSet;
            this.format = debugFormat;
        }
    }

    public String toString(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        if (!this.isSingleLine) {
            return TextFormat.debugFormatPrinter().printFieldToString(fieldDescriptor, obj);
        }
        return TextFormat.debugFormatPrinter().emittingSingleLine(this.isSingleLine).printFieldToString(fieldDescriptor, obj);
    }

    public String toString(UnknownFieldSet unknownFieldSet) {
        if (!this.isSingleLine) {
            return TextFormat.debugFormatPrinter().printToString(unknownFieldSet);
        }
        return TextFormat.debugFormatPrinter().emittingSingleLine(this.isSingleLine).printToString(unknownFieldSet);
    }
}
