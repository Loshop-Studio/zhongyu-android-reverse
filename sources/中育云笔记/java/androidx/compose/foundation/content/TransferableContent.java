package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.platform.ClipEntry;
import androidx.compose.p014ui.platform.ClipMetadata;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

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
        private static final int Keyboard = m27050constructorimpl(0);
        private static final int DragAndDrop = m27050constructorimpl(1);
        private static final int Clipboard = m27050constructorimpl(2);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getClipboard-kB6V9T0, reason: not valid java name */
            public final int m27056getClipboardkB6V9T0() {
                return Source.Clipboard;
            }

            /* renamed from: getDragAndDrop-kB6V9T0, reason: not valid java name */
            public final int m27057getDragAndDropkB6V9T0() {
                return Source.DragAndDrop;
            }

            /* renamed from: getKeyboard-kB6V9T0, reason: not valid java name */
            public final int m27058getKeyboardkB6V9T0() {
                return Source.Keyboard;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Source(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Source m27049boximpl(int i10) {
            return new Source(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m27050constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m27051equalsimpl(int i10, Object obj) {
            return (obj instanceof Source) && i10 == ((Source) obj).m27055unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m27052equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m27053hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m27054toStringimpl(int i10) {
            if (m27052equalsimpl0(i10, Keyboard)) {
                return "Source.Keyboard";
            }
            if (m27052equalsimpl0(i10, DragAndDrop)) {
                return "Source.DragAndDrop";
            }
            if (m27052equalsimpl0(i10, Clipboard)) {
                return "Source.Clipboard";
            }
            return "Invalid (" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return m27051equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m27053hashCodeimpl(this.value);
        }

        public String toString() {
            return m27054toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m27055unboximpl() {
            return this.value;
        }
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i10, PlatformTransferableContent platformTransferableContent, AbstractC9972n abstractC9972n) {
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
    public final int m27048getSourcekB6V9T0() {
        return this.source;
    }

    private TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i10, PlatformTransferableContent platformTransferableContent) {
        this.clipEntry = clipEntry;
        this.clipMetadata = clipMetadata;
        this.source = i10;
        this.platformTransferableContent = platformTransferableContent;
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i10, PlatformTransferableContent platformTransferableContent, int i11, AbstractC9972n abstractC9972n) {
        this(clipEntry, clipMetadata, i10, (i11 & 8) != 0 ? null : platformTransferableContent, null);
    }
}
