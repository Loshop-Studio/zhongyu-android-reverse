package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.platform.ClipEntry;
import androidx.compose.p013ui.platform.ClipMetadata;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class TransferableContent {
    public static final int $stable = 8;
    private final ClipEntry clipEntry;
    private final ClipMetadata clipMetadata;
    private final PlatformTransferableContent platformTransferableContent;
    private final int source;

    @ExperimentalFoundationApi
    public static final class Source {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Keyboard = m20448constructorimpl(0);
        private static final int DragAndDrop = m20448constructorimpl(1);
        private static final int Clipboard = m20448constructorimpl(2);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getClipboard-kB6V9T0, reason: not valid java name */
            public final int m20454getClipboardkB6V9T0() {
                return Source.Clipboard;
            }

            /* renamed from: getDragAndDrop-kB6V9T0, reason: not valid java name */
            public final int m20455getDragAndDropkB6V9T0() {
                return Source.DragAndDrop;
            }

            /* renamed from: getKeyboard-kB6V9T0, reason: not valid java name */
            public final int m20456getKeyboardkB6V9T0() {
                return Source.Keyboard;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Source(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Source m20447boximpl(int i10) {
            return new Source(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m20448constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m20449equalsimpl(int i10, Object obj) {
            return (obj instanceof Source) && i10 == ((Source) obj).m20453unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m20450equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m20451hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m20452toStringimpl(int i10) {
            if (m20450equalsimpl0(i10, Keyboard)) {
                return "Source.Keyboard";
            }
            if (m20450equalsimpl0(i10, DragAndDrop)) {
                return "Source.DragAndDrop";
            }
            if (m20450equalsimpl0(i10, Clipboard)) {
                return "Source.Clipboard";
            }
            return "Invalid (" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return m20449equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m20451hashCodeimpl(this.value);
        }

        public String toString() {
            return m20452toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m20453unboximpl() {
            return this.value;
        }
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i10, PlatformTransferableContent platformTransferableContent, AbstractC9126n abstractC9126n) {
        this(clipEntry, clipMetadata, i10, platformTransferableContent);
    }

    public final ClipEntry getClipEntry() {
        return this.clipEntry;
    }

    public final ClipMetadata getClipMetadata() {
        return this.clipMetadata;
    }

    public final PlatformTransferableContent getPlatformTransferableContent() {
        return this.platformTransferableContent;
    }

    /* renamed from: getSource-kB6V9T0, reason: not valid java name */
    public final int m20446getSourcekB6V9T0() {
        return this.source;
    }

    private TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i10, PlatformTransferableContent platformTransferableContent) {
        this.clipEntry = clipEntry;
        this.clipMetadata = clipMetadata;
        this.source = i10;
        this.platformTransferableContent = platformTransferableContent;
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i10, PlatformTransferableContent platformTransferableContent, int i11, AbstractC9126n abstractC9126n) {
        this(clipEntry, clipMetadata, i10, (i11 & 8) != 0 ? null : platformTransferableContent, null);
    }
}
