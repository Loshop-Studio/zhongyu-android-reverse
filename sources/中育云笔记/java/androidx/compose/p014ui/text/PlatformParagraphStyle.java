package androidx.compose.p014ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class PlatformParagraphStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i10, AbstractC9972n abstractC9972n) {
        this(i10);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m32806equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    /* renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name */
    public final int m32884getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + EmojiSupportMatch.m32807hashCodeimpl(this.emojiSupportMatch);
    }

    public final PlatformParagraphStyle merge(PlatformParagraphStyle platformParagraphStyle) {
        return platformParagraphStyle == null ? this : platformParagraphStyle;
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m32808toStringimpl(this.emojiSupportMatch)) + ')';
    }

    public /* synthetic */ PlatformParagraphStyle(int i10, boolean z10, AbstractC9972n abstractC9972n) {
        this(i10, z10);
    }

    public PlatformParagraphStyle(boolean z10) {
        this.includeFontPadding = z10;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m32811getDefault_3YsG6Y();
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10);
    }

    public /* synthetic */ PlatformParagraphStyle(int i10, boolean z10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? EmojiSupportMatch.Companion.m32811getDefault_3YsG6Y() : i10, (i11 & 2) != 0 ? false : z10, (AbstractC9972n) null);
    }

    private PlatformParagraphStyle(int i10, boolean z10) {
        this.includeFontPadding = z10;
        this.emojiSupportMatch = i10;
    }

    private PlatformParagraphStyle(int i10) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = i10;
    }

    public /* synthetic */ PlatformParagraphStyle(int i10, int i11, AbstractC9972n abstractC9972n) {
        this((i11 & 1) != 0 ? EmojiSupportMatch.Companion.m32811getDefault_3YsG6Y() : i10, (AbstractC9972n) null);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m32811getDefault_3YsG6Y(), false, (AbstractC9972n) null);
    }
}
