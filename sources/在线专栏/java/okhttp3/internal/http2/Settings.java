package okhttp3.internal.http2;

import kotlin.collections.C2723g;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Settings {
    public static final int COUNT = 10;
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }
    }

    public final void clear() {
        this.set = 0;
        C2723g.m9089k(this.values, 0, 0, 0, 6, null);
    }

    public final int get(int i4) {
        return this.values[i4];
    }

    public final boolean getEnablePush(boolean z3) {
        return (this.set & 4) != 0 ? this.values[2] == 1 : z3;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        return (this.set & 128) != 0 ? this.values[7] : DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int i4) {
        return (this.set & 32) != 0 ? this.values[5] : i4;
    }

    public final int getMaxHeaderListSize(int i4) {
        return (this.set & 64) != 0 ? this.values[6] : i4;
    }

    public final boolean isSet(int i4) {
        return ((1 << i4) & this.set) != 0;
    }

    public final void merge(@NotNull Settings other) {
        C2769l.m9241e(other, "other");
        for (int i4 = 0; i4 < 10; i4++) {
            if (other.isSet(i4)) {
                set(i4, other.get(i4));
            }
        }
    }

    @NotNull
    public final Settings set(int i4, int i5) {
        if (i4 >= 0) {
            int[] iArr = this.values;
            if (i4 < iArr.length) {
                this.set = (1 << i4) | this.set;
                iArr[i4] = i5;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
