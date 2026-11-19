package com.google.protobuf;

import java.nio.Buffer;

/* loaded from: classes4.dex */
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    public static void clear(Buffer buffer) {
        buffer.clear();
    }

    public static void flip(Buffer buffer) {
        buffer.flip();
    }

    public static void limit(Buffer buffer, int i9) {
        buffer.limit(i9);
    }

    public static void mark(Buffer buffer) {
        buffer.mark();
    }

    public static void position(Buffer buffer, int i9) {
        buffer.position(i9);
    }

    public static void reset(Buffer buffer) {
        buffer.reset();
    }
}
