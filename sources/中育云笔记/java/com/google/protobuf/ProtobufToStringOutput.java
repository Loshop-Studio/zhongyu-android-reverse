package com.google.protobuf;

import androidx.emoji2.text.flatbuffer.C3795b;
import com.google.protobuf.ProtobufToStringOutput;
import java.util.function.Supplier;

/* loaded from: classes5.dex */
public final class ProtobufToStringOutput {
    private static final ThreadLocal<OutputMode> outputMode = new C3795b(new Supplier() { // from class: com.google.protobuf.b
        @Override // java.util.function.Supplier
        public final Object get() {
            return ProtobufToStringOutput.OutputMode.TEXT_FORMAT;
        }
    });

    public enum OutputMode {
        DEBUG_FORMAT,
        TEXT_FORMAT
    }

    private ProtobufToStringOutput() {
    }

    public static void callWithDebugFormat(Runnable runnable) {
        callWithSpecificFormat(runnable, OutputMode.DEBUG_FORMAT);
    }

    private static void callWithSpecificFormat(Runnable runnable, OutputMode outputMode2) {
        OutputMode outputMode3 = setOutputMode(outputMode2);
        try {
            runnable.run();
        } finally {
            setOutputMode(outputMode3);
        }
    }

    public static void callWithTextFormat(Runnable runnable) {
        callWithSpecificFormat(runnable, OutputMode.TEXT_FORMAT);
    }

    private static OutputMode setOutputMode(OutputMode outputMode2) {
        ThreadLocal<OutputMode> threadLocal = outputMode;
        OutputMode outputMode3 = threadLocal.get();
        threadLocal.set(outputMode2);
        return outputMode3;
    }

    public static boolean shouldOutputDebugFormat() {
        return outputMode.get() == OutputMode.DEBUG_FORMAT;
    }
}
