package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Set;

@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;

    @Nullable
    private final int[] mEmojiAsDefaultStyleExceptions;

    @NonNull
    private EmojiCompat.GlyphChecker mGlyphChecker;

    @NonNull
    private final MetadataRepo mMetadataRepo;

    @NonNull
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    @RequiresApi(19)
    public static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        public static int findIndexBackward(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z3 = false;
                while (i5 != 0) {
                    i4--;
                    if (i4 < 0) {
                        return z3 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i4);
                    if (z3) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i5--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i5--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z3 = true;
                    }
                }
                return i4;
            }
        }

        public static int findIndexForward(CharSequence charSequence, int i4, int i5) {
            int length = charSequence.length();
            if (i4 < 0 || length < i4 || i5 < 0) {
                return -1;
            }
            while (true) {
                boolean z3 = false;
                while (i5 != 0) {
                    if (i4 >= length) {
                        if (z3) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i4);
                    if (z3) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i5--;
                        i4++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i5--;
                        i4++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i4++;
                        z3 = true;
                    }
                }
                return i4;
            }
        }
    }

    public static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        private final EmojiCompat.SpanFactory mSpanFactory;

        @Nullable
        public UnprecomputeTextOnModificationSpannable spannable;

        public EmojiProcessAddSpanCallback(@Nullable UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i4, int i5, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                this.spannable = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i4, i5, 33);
            return true;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }
    }

    public interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(@NonNull CharSequence charSequence, int i4, int i5, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    public static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        public EmojiProcessLookupCallback(int i4) {
            this.mOffset = i4;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i4, int i5, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i6 = this.mOffset;
            if (i4 > i6 || i6 >= i5) {
                return i5 <= i6;
            }
            this.start = i4;
            this.end = i5;
            return false;
        }
    }

    public static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        private final String mExclusion;

        public MarkExclusionCallback(String str) {
            this.mExclusion = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i4, int i5, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i4, i5), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }
    }

    public static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        public ProcessorSm(MetadataRepo.Node node, boolean z3, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z3;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        private static boolean isEmojiStyle(int i4) {
            return i4 == 65039;
        }

        private static boolean isTextStyle(int i4) {
            return i4 == 65038;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        public int check(int i4) {
            MetadataRepo.Node node = this.mCurrentNode.get(i4);
            int iReset = 2;
            if (this.mState != 2) {
                if (node == null) {
                    iReset = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i4)) {
                iReset = reset();
            } else if (!isEmojiStyle(i4)) {
                if (this.mCurrentNode.getData() != null) {
                    iReset = 3;
                    if (this.mCurrentDepth != 1 || shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else {
                        iReset = reset();
                    }
                } else {
                    iReset = reset();
                }
            }
            this.mLastCodepoint = i4;
            return iReset;
        }

        public TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        public TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        public boolean isInFlushableState() {
            return this.mState == 2 && this.mCurrentNode.getData() != null && (this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint());
        }
    }

    public EmojiProcessor(@NonNull MetadataRepo metadataRepo, @NonNull EmojiCompat.SpanFactory spanFactory, @NonNull EmojiCompat.GlyphChecker glyphChecker, boolean z3, @Nullable int[] iArr, @NonNull Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z3;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    private static boolean delete(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z3) {
        EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5, boolean z3) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i4 >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z3) {
                iMax = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i4, 0));
                iMin = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i5, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i4, 0);
                iMin = Math.min(selectionEnd + i5, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(iMax, iMin, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean handleOnKeyDown(@NonNull Editable editable, int i4, @NonNull KeyEvent keyEvent) {
        if (!(i4 != 67 ? i4 != 112 ? false : delete(editable, keyEvent, true) : delete(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean hasGlyph(CharSequence charSequence, int i4, int i5, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i4, i5, typefaceEmojiRasterizer.getSdkAdded()));
        }
        return typefaceEmojiRasterizer.getHasGlyph() == 2;
    }

    private static boolean hasInvalidSelection(int i4, int i5) {
        return i4 == -1 || i5 == -1 || i4 != i5;
    }

    private static boolean hasModifiers(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void initExclusions(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            process(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
        }
    }

    public int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i4) {
        if (i4 < 0 || i4 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i4, i4 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i4 - 16), Math.min(charSequence.length(), i4 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i4))).end;
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    public int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i4) {
        if (i4 < 0 || i4 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i4, i4 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i4 - 16), Math.min(charSequence.length(), i4 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i4))).start;
    }

    public CharSequence process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5, @IntRange(from = 0) int i6, boolean z3) {
        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable;
        EmojiSpan[] emojiSpanArr;
        boolean z4 = charSequence instanceof SpannableBuilder;
        if (z4) {
            ((SpannableBuilder) charSequence).beginBatchEdit();
        }
        if (!z4) {
            try {
                unprecomputeTextOnModificationSpannable = charSequence instanceof Spannable ? new UnprecomputeTextOnModificationSpannable((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i4 + (-1), i5 + 1, EmojiSpan.class) > i5) ? null : new UnprecomputeTextOnModificationSpannable(charSequence);
            } finally {
                if (z4) {
                    ((SpannableBuilder) charSequence).endBatchEdit();
                }
            }
        }
        if (unprecomputeTextOnModificationSpannable != null && (emojiSpanArr = (EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(i4, i5, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = unprecomputeTextOnModificationSpannable.getSpanStart(emojiSpan);
                int spanEnd = unprecomputeTextOnModificationSpannable.getSpanEnd(emojiSpan);
                if (spanStart != i5) {
                    unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                }
                i4 = Math.min(spanStart, i4);
                i5 = Math.max(spanEnd, i5);
            }
        }
        int i7 = i5;
        if (i4 != i7 && i4 < charSequence.length()) {
            if (i6 != Integer.MAX_VALUE && unprecomputeTextOnModificationSpannable != null) {
                i6 -= ((EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), EmojiSpan.class)).length;
            }
            UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2 = (UnprecomputeTextOnModificationSpannable) process(charSequence, i4, i7, i6, z3, new EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, this.mSpanFactory));
            if (unprecomputeTextOnModificationSpannable2 != null) {
                return unprecomputeTextOnModificationSpannable2.getUnwrappedSpannable();
            }
            if (z4) {
                ((SpannableBuilder) charSequence).endBatchEdit();
            }
            return charSequence;
        }
        if (z4) {
            ((SpannableBuilder) charSequence).endBatchEdit();
        }
        return charSequence;
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence, int i4) {
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int iCharCount = 0;
        int i5 = 0;
        int i6 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iCheck = processorSm.check(iCodePointAt);
            TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (iCheck == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i6 = 0;
            } else if (iCheck == 2) {
                iCharCount += Character.charCount(iCodePointAt);
            } else if (iCheck == 3) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i4) {
                    i5++;
                }
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i4) {
                i6++;
            }
        }
        if (i5 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i4) {
            return i6 == 0 ? 0 : 2;
        }
        return 1;
    }

    private <T> T process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5, @IntRange(from = 0) int i6, boolean z3, EmojiProcessCallback<T> emojiProcessCallback) {
        int iCharCount;
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int i7 = 0;
        boolean zHandleEmoji = true;
        int iCodePointAt = Character.codePointAt(charSequence, i4);
        loop0: while (true) {
            iCharCount = i4;
            while (i4 < i5 && i7 < i6 && zHandleEmoji) {
                int iCheck = processorSm.check(iCodePointAt);
                if (iCheck == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i5) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i4 = iCharCount;
                } else if (iCheck == 2) {
                    i4 += Character.charCount(iCodePointAt);
                    if (i4 < i5) {
                        iCodePointAt = Character.codePointAt(charSequence, i4);
                    }
                } else if (iCheck == 3) {
                    if (z3 || !hasGlyph(charSequence, iCharCount, i4, processorSm.getFlushMetadata())) {
                        i7++;
                        zHandleEmoji = emojiProcessCallback.handleEmoji(charSequence, iCharCount, i4, processorSm.getFlushMetadata());
                    }
                }
            }
            break loop0;
        }
        if (processorSm.isInFlushableState() && i7 < i6 && zHandleEmoji && (z3 || !hasGlyph(charSequence, iCharCount, i4, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, iCharCount, i4, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }
}
