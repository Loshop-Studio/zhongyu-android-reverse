package androidx.compose.p006ui.text.android.animation;

import android.text.Layout;
import androidx.compose.p006ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.p006ui.text.android.InternalPlatformTextApi;
import androidx.compose.p006ui.text.android.LayoutCompatKt;
import androidx.compose.p006ui.text.android.LayoutHelper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¨\u0006\u0019"}, m5175d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "()V", "breakInWords", "", "", "layoutHelper", "Landroidx/compose/ui/text/android/LayoutHelper;", "breakOffsets", "segmentType", "Landroidx/compose/ui/text/android/animation/SegmentType;", "breakSegmentWithChar", "Landroidx/compose/ui/text/android/animation/Segment;", "dropSpaces", "", "breakSegmentWithDocument", "breakSegmentWithLine", "breakSegmentWithParagraph", "breakSegmentWithWord", "breakSegments", "breakWithBreakIterator", "text", "", "breaker", "Ljava/text/BreakIterator;", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@InternalPlatformTextApi
@SourceDebugExtension({"SMAP\nSegmentBreaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/android/TempListUtilsKt\n*L\n1#1,312:1\n34#2,6:313\n73#2,11:319\n73#2,11:330\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n66#1:313,6\n226#1:319,11\n275#1:330,11\n*E\n"})
/* loaded from: classes.dex */
public final class SegmentBreaker {
    public static final int $stable = 0;
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentType.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        CharSequence text = layoutHelper.getLayout().getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(lineInstance, "getLineInstance(Locale.getDefault())");
        List<Integer> listBreakWithBreakIterator = breakWithBreakIterator(text, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = listBreakWithBreakIterator.size();
        for (int i4 = 0; i4 < size; i4++) {
            treeSet.add(Integer.valueOf(listBreakWithBreakIterator.get(i4).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i5 = 0; i5 < paragraphCount; i5++) {
            Bidi bidiAnalyzeBidi = layoutHelper.analyzeBidi(i5);
            if (bidiAnalyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i5);
                int runCount = bidiAnalyzeBidi.getRunCount();
                for (int i6 = 0; i6 < runCount; i6++) {
                    treeSet.add(Integer.valueOf(bidiAnalyzeBidi.getRunStart(i6) + paragraphStart));
                }
            }
        }
        return CollectionsKt___CollectionsKt.toList(treeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<androidx.compose.p006ui.text.android.animation.Segment> breakSegmentWithChar(androidx.compose.p006ui.text.android.LayoutHelper r21, boolean r22) {
        /*
            r20 = this;
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            androidx.compose.ui.text.android.animation.SegmentType r2 = androidx.compose.p006ui.text.android.animation.SegmentType.Character
            r3 = r20
            java.util.List r2 = r3.breakOffsets(r0, r2)
            int r4 = r2.size()
            if (r4 == 0) goto Lba
            int r4 = r2.size()
            r5 = 1
            if (r4 != r5) goto L1e
            goto Lba
        L1e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = 0
            java.lang.Object r7 = r2.get(r6)
            int r8 = kotlin.collections.CollectionsKt.getLastIndex(r2)
            r9 = r6
        L2d:
            if (r9 >= r8) goto Lbd
            int r9 = r9 + 1
            java.lang.Object r10 = r2.get(r9)
            r11 = r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r14 = r11.intValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r13 = r7.intValue()
            android.text.Layout r7 = r21.getLayout()
            if (r22 == 0) goto L5d
            int r11 = r13 + 1
            if (r14 != r11) goto L5d
            java.lang.CharSequence r11 = r7.getText()
            char r11 = r11.charAt(r13)
            boolean r11 = r0.isLineEndSpace(r11)
            if (r11 == 0) goto L5d
            r19 = r8
            goto Lae
        L5d:
            int r11 = androidx.compose.p006ui.text.android.LayoutCompatKt.getLineForOffset(r7, r13, r6)
            int r12 = r7.getParagraphDirection(r11)
            r15 = -1
            if (r12 != r15) goto L6a
            r12 = r5
            goto L6b
        L6a:
            r12 = r6
        L6b:
            boolean r15 = r7.isRtlCharAt(r13)
            if (r15 != r12) goto L72
            goto L73
        L72:
            r5 = r6
        L73:
            float r5 = r0.getHorizontalPosition(r13, r5, r6)
            r16 = r7
            double r6 = (double) r5
            double r5 = java.lang.Math.ceil(r6)
            float r5 = (float) r5
            int r5 = (int) r5
            if (r15 != r12) goto L84
            r6 = 1
            goto L85
        L84:
            r6 = 0
        L85:
            r7 = 1
            float r6 = r0.getHorizontalPosition(r14, r6, r7)
            r19 = r8
            double r7 = (double) r6
            double r6 = java.lang.Math.ceil(r7)
            float r6 = (float) r6
            int r6 = (int) r6
            androidx.compose.ui.text.android.animation.Segment r7 = new androidx.compose.ui.text.android.animation.Segment
            int r15 = java.lang.Math.min(r5, r6)
            r8 = r16
            int r16 = r8.getLineTop(r11)
            int r17 = java.lang.Math.max(r5, r6)
            int r18 = r8.getLineBottom(r11)
            r12 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r1.add(r7)
        Lae:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            r4.add(r5)
            r7 = r10
            r8 = r19
            r5 = 1
            r6 = 0
            goto L2d
        Lba:
            kotlin.collections.CollectionsKt.emptyList()
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.text.android.animation.SegmentBreaker.breakSegmentWithChar(androidx.compose.ui.text.android.LayoutHelper, boolean):java.util.List");
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        return CollectionsKt__CollectionsJVMKt.listOf(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i4 = 0; i4 < lineCount; i4++) {
            arrayList.add(new Segment(layout.getLineStart(i4), layout.getLineEnd(i4), dropSpaces ? (int) Math.ceil(layout.getLineLeft(i4)) : 0, layout.getLineTop(i4), dropSpaces ? (int) Math.ceil(layout.getLineRight(i4)) : layout.getWidth(), layout.getLineBottom(i4)));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i4 = 0; i4 < paragraphCount; i4++) {
            int paragraphStart = layoutHelper.getParagraphStart(i4);
            int paragraphEnd = layoutHelper.getParagraphEnd(i4);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean dropSpaces) {
        int i4;
        Layout layout = layoutHelper.getLayout();
        int iCeil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (listBreakOffsets.size() != 0) {
            boolean z3 = true;
            if (listBreakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z4 = false;
                Integer num = listBreakOffsets.get(0);
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listBreakOffsets);
                int i5 = 0;
                while (i5 < lastIndex) {
                    i5++;
                    Integer num2 = listBreakOffsets.get(i5);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, iIntValue2, z4);
                    boolean z5 = layout.getParagraphDirection(lineForOffset) == -1 ? z3 : z4;
                    boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                    if (zIsRtlCharAt != z5) {
                        z3 = z4;
                    }
                    int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z3, z4));
                    boolean z6 = zIsRtlCharAt == z5;
                    int i6 = lastIndex;
                    int iCeil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, z6, true));
                    int iMin = Math.min(iCeil2, iCeil3);
                    int iMax = Math.max(iCeil2, iCeil3);
                    if (dropSpaces && iIntValue != 0 && layout.getText().charAt(iIntValue - 1) == ' ') {
                        i4 = lineForOffset;
                        if (layout.getLineEnd(i4) != iIntValue) {
                            if (zIsRtlCharAt) {
                                iMin += iCeil;
                            } else {
                                iMax -= iCeil;
                            }
                        }
                    } else {
                        i4 = lineForOffset;
                    }
                    arrayList.add(new Segment(iIntValue2, iIntValue, iMin, layout.getLineTop(i4), iMax, layout.getLineBottom(i4)));
                    num = num2;
                    lastIndex = i6;
                    z3 = true;
                    z4 = false;
                }
                return arrayList;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    private final List<Integer> breakWithBreakIterator(CharSequence text, BreakIterator breaker) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(text, 0, text.length());
        List<Integer> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
        breaker.setText(charSequenceCharacterIterator);
        while (breaker.next() != -1) {
            listMutableListOf.add(Integer.valueOf(breaker.current()));
        }
        return listMutableListOf;
    }

    public final List<Integer> breakOffsets(LayoutHelper layoutHelper, SegmentType segmentType) {
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i4 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i5 = 0;
        if (i4 == 1) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(text.length())});
        }
        if (i4 == 2) {
            List<Integer> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i5 < paragraphCount) {
                listMutableListOf.add(Integer.valueOf(layoutHelper.getParagraphEnd(i5)));
                i5++;
            }
            return listMutableListOf;
        }
        if (i4 == 3) {
            List<Integer> listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(0);
            int lineCount = layout.getLineCount();
            while (i5 < lineCount) {
                listMutableListOf2.add(Integer.valueOf(layout.getLineEnd(i5)));
                i5++;
            }
            return listMutableListOf2;
        }
        if (i4 == 4) {
            return breakInWords(layoutHelper);
        }
        if (i4 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullExpressionValue(text, "text");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(Locale.getDefault())");
        return breakWithBreakIterator(text, characterInstance);
    }

    public final List<Segment> breakSegments(LayoutHelper layoutHelper, SegmentType segmentType, boolean dropSpaces) {
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        int i4 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i4 == 1) {
            return breakSegmentWithDocument(layoutHelper);
        }
        if (i4 == 2) {
            return breakSegmentWithParagraph(layoutHelper);
        }
        if (i4 == 3) {
            return breakSegmentWithLine(layoutHelper, dropSpaces);
        }
        if (i4 == 4) {
            return breakSegmentWithWord(layoutHelper, dropSpaces);
        }
        if (i4 == 5) {
            return breakSegmentWithChar(layoutHelper, dropSpaces);
        }
        throw new NoWhenBranchMatchedException();
    }
}
