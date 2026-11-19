package androidx.compose.p013ui.text;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.LinkAnnotation;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8768a0;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p168l7.AbstractC9260b;
import p300x7.InterfaceC10570l;

@Immutable
/* loaded from: classes2.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();
    private final List<Range<? extends Annotation>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    public interface Annotation {
    }

    @StabilityInferred(parameters = 0)
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Annotation>> annotations;
        private final BulletScope bulletScope;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        @StabilityInferred(parameters = 0)
        public static final class BulletScope {
            public static final int $stable = 8;
            private final Builder builder;
            private final List<Pair<TextUnit, Bullet>> bulletListSettingStack = new ArrayList();

            public BulletScope(Builder builder) {
                this.builder = builder;
            }

            public final Builder getBuilder$ui_text_release() {
                return this.builder;
            }

            public final List<Pair<TextUnit, Bullet>> getBulletListSettingStack$ui_text_release() {
                return this.bulletListSettingStack;
            }
        }

        public static final class MutableRange<T> {
            public static final Companion Companion = new Companion(null);
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            public static final class Companion {
                public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                    this();
                }

                public final <T> MutableRange<T> fromRange(Range<T> range) {
                    return new MutableRange<>(range.getItem(), range.getStart(), range.getEnd(), range.getTag());
                }

                private Companion() {
                }
            }

            public MutableRange(T t10, int i10, int i11, String str) {
                this.item = t10;
                this.start = i10;
                this.end = i11;
                this.tag = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i10, int i11, String str, int i12, Object obj2) {
                if ((i12 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i12 & 2) != 0) {
                    i10 = mutableRange.start;
                }
                if ((i12 & 4) != 0) {
                    i11 = mutableRange.end;
                }
                if ((i12 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i10, i11, str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i10);
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            public final String component4() {
                return this.tag;
            }

            public final MutableRange<T> copy(T t10, int i10, int i11, String str) {
                return new MutableRange<>(t10, i10, i11, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return AbstractC9133u.m16128b(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && AbstractC9133u.m16128b(this.tag, mutableRange.tag);
            }

            public final int getEnd() {
                return this.end;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final String getTag() {
                return this.tag;
            }

            public int hashCode() {
                T t10 = this.item;
                return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public final void setEnd(int i10) {
                this.end = i10;
            }

            public final Range<T> toRange(int i10) {
                int i11 = this.end;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (!(i10 != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, i10, this.tag);
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, InterfaceC10570l interfaceC10570l, int i10, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(interfaceC10570l, i10);
            }

            public final <R> Range<R> toRange(InterfaceC10570l interfaceC10570l, int i10) {
                int i11 = this.end;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (!(i10 != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(interfaceC10570l.invoke(this.item), this.start, i10, this.tag);
            }

            public /* synthetic */ MutableRange(Object obj, int i10, int i11, String str, int i12, AbstractC9126n abstractC9126n) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public Builder() {
            this(0, 1, null);
        }

        /* renamed from: withBulletList-o2QH7mI$ui_text_release$default, reason: not valid java name */
        public static /* synthetic */ Object m26194withBulletListo2QH7mI$ui_text_release$default(Builder builder, long j10, Bullet bullet, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = BulletKt.getDefaultBulletIndentation();
            }
            if ((i10 & 2) != 0) {
                bullet = BulletKt.getDefaultBullet();
            }
            return builder.m26196withBulletListo2QH7mI$ui_text_release(j10, bullet, interfaceC10570l);
        }

        public final void addBullet$ui_text_release(Bullet bullet, int i10, int i11) {
            this.annotations.add(new MutableRange<>(bullet, i10, i11, null, 8, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: addBullet-r9BaKPg$ui_text_release, reason: not valid java name */
        public final void m26195addBulletr9BaKPg$ui_text_release(Bullet bullet, long j10, int i10, int i11) {
            Object[] objArr = 0 == true ? 1 : 0;
            this.annotations.add(new MutableRange<>(new ParagraphStyle(0, 0, 0L, new TextIndent(j10, j10, null), (PlatformParagraphStyle) objArr, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (AbstractC9126n) null), i10, i11, null, 8, 0 == true ? 1 : 0));
            this.annotations.add(new MutableRange<>(bullet, i10, i11, 0 == true ? 1 : 0, 8, null));
        }

        public final void addLink(LinkAnnotation.Url url, int i10, int i11) {
            this.annotations.add(new MutableRange<>(url, i10, i11, null, 8, null));
        }

        public final void addStringAnnotation(String str, String str2, int i10, int i11) {
            this.annotations.add(new MutableRange<>(StringAnnotation.m26312boximpl(StringAnnotation.m26313constructorimpl(str2)), i10, i11, str));
        }

        public final void addStyle(SpanStyle spanStyle, int i10, int i11) {
            this.annotations.add(new MutableRange<>(spanStyle, i10, i11, null, 8, null));
        }

        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int i10, int i11) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, i10, i11, null, 8, null));
        }

        @ExperimentalTextApi
        @InterfaceC8721a
        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int i10, int i11) {
            this.annotations.add(new MutableRange<>(urlAnnotation, i10, i11, null, 8, null));
        }

        public final void flatMapAnnotations$ui_text_release(InterfaceC10570l interfaceC10570l) {
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list2 = (List) interfaceC10570l.invoke(MutableRange.toRange$default(list.get(i10), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(MutableRange.Companion.fromRange((Range) list2.get(i11)));
                }
                AbstractC8768a0.m14481C(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void mapAnnotations$ui_text_release(InterfaceC10570l interfaceC10570l) {
            int size = this.annotations.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.annotations.set(i10, MutableRange.Companion.fromRange((Range) interfaceC10570l.invoke(MutableRange.toRange$default(this.annotations.get(i10), 0, 1, null))));
            }
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).setEnd(this.text.length());
        }

        public final int pushBullet$ui_text_release(Bullet bullet) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(bullet, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(LinkAnnotation linkAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(linkAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(String str, String str2) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(StringAnnotation.m26312boximpl(StringAnnotation.m26313constructorimpl(str2)), this.text.length(), 0, str, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(SpanStyle spanStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(spanStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @ExperimentalTextApi
        @InterfaceC8721a
        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final AnnotatedString toAnnotatedString() {
            String string = this.text.toString();
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).toRange(this.text.length()));
            }
            return new AnnotatedString(string, arrayList);
        }

        /* renamed from: withBulletList-o2QH7mI$ui_text_release, reason: not valid java name */
        public final <R> R m26196withBulletListo2QH7mI$ui_text_release(long j10, Bullet bullet, InterfaceC10570l interfaceC10570l) {
            long sp;
            Pair pair = (Pair) AbstractC8778f0.m14579y0(this.bulletScope.getBulletListSettingStack$ui_text_release());
            if (pair != null) {
                long jM27102unboximpl = ((TextUnit) pair.m15906e()).m27102unboximpl();
                if (!TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(jM27102unboximpl), TextUnit.m27092getTypeUIouoOA(j10))) {
                    InlineClassHelperKt.throwIllegalStateException("Indentation unit types of nested bullet lists must match. Current " + ((Object) TextUnit.m27100toStringimpl(jM27102unboximpl)) + " and previous is " + ((Object) TextUnit.m27100toStringimpl(j10)));
                }
                long jM27092getTypeUIouoOA = TextUnit.m27092getTypeUIouoOA(j10);
                TextUnitType.Companion companion = TextUnitType.Companion;
                sp = TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27126getSpUIouoOA()) ? TextUnitKt.getSp(TextUnit.m27093getValueimpl(j10) + TextUnit.m27093getValueimpl(jM27102unboximpl)) : TextUnitType.m27121equalsimpl0(jM27092getTypeUIouoOA, companion.m27125getEmUIouoOA()) ? TextUnitKt.getEm(TextUnit.m27093getValueimpl(j10) + TextUnit.m27093getValueimpl(jM27102unboximpl)) : j10;
            } else {
                sp = j10;
            }
            int iPushStyle = pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(sp, sp, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (AbstractC9126n) null));
            this.bulletScope.getBulletListSettingStack$ui_text_release().add(new Pair<>(TextUnit.m27083boximpl(sp), bullet));
            try {
                return (R) interfaceC10570l.invoke(this.bulletScope);
            } finally {
                if (!this.bulletScope.getBulletListSettingStack$ui_text_release().isEmpty()) {
                    this.bulletScope.getBulletListSettingStack$ui_text_release().remove(AbstractC8809v.m14773p(this.bulletScope.getBulletListSettingStack$ui_text_release()));
                }
                pop(iPushStyle);
            }
        }

        public Builder(int i10) {
            this.text = new StringBuilder(i10);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        public final void addLink(LinkAnnotation.Clickable clickable, int i10, int i11) {
            this.annotations.add(new MutableRange<>(clickable, i10, i11, null, 8, null));
        }

        public final void addStyle(ParagraphStyle paragraphStyle, int i10, int i11) {
            this.annotations.add(new MutableRange<>(paragraphStyle, i10, i11, null, 8, null));
        }

        public final void append(String str) {
            this.text.append(str);
        }

        public final void pop(int i10) {
            if (!(i10 < this.styleStack.size())) {
                InlineClassHelperKt.throwIllegalStateException(i10 + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= i10) {
                pop();
            }
        }

        public final int pushStyle(ParagraphStyle paragraphStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(paragraphStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
                return this;
            }
            this.text.append(charSequence);
            return this;
        }

        public /* synthetic */ Builder(int i10, int i11, AbstractC9126n abstractC9126n) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public Builder(String str) {
            this(0, 1, null);
            append(str);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence, int i10, int i11) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i10, i11);
                return this;
            }
            this.text.append(charSequence, i10, i11);
            return this;
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        @Override // java.lang.Appendable
        public Builder append(char c10) {
            this.text.append(c10);
            return this;
        }

        public final void append(AnnotatedString annotatedString) {
            int length = this.text.length();
            this.text.append(annotatedString.getText());
            List<Range<? extends Annotation>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size = annotations$ui_text_release.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range<? extends Annotation> range = annotations$ui_text_release.get(i10);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void append(AnnotatedString annotatedString, int i10, int i11) {
            int length = this.text.length();
            this.text.append((CharSequence) annotatedString.getText(), i10, i11);
            List localAnnotations$default = AnnotatedStringKt.getLocalAnnotations$default(annotatedString, i10, i11, null, 4, null);
            if (localAnnotations$default != null) {
                int size = localAnnotations$default.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Range range = (Range) localAnnotations$default.get(i12);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<AnnotatedString, ?> getSaver() {
            return AnnotatedString.Saver;
        }

        private Companion() {
        }
    }

    public static final class ExhaustiveAnnotation implements Annotation {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(List<? extends Range<? extends Annotation>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                Range<SpanStyle> range = (Range) list.get(i10);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    AbstractC9133u.m16131e(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    AbstractC9133u.m16131e(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listM14536M0 = arrayList2 != null ? AbstractC8778f0.m14536M0(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC9260b.m16977d(Integer.valueOf(((AnnotatedString.Range) t10).getStart()), Integer.valueOf(((AnnotatedString.Range) t11).getStart()));
            }
        }) : null;
        if (listM14536M0 == null || listM14536M0.isEmpty()) {
            return;
        }
        MutableIntList mutableIntListMutableIntListOf = IntListKt.mutableIntListOf(((Range) AbstractC8778f0.m14566l0(listM14536M0)).getEnd());
        int size2 = listM14536M0.size();
        for (int i11 = 1; i11 < size2; i11++) {
            Range range2 = (Range) listM14536M0.get(i11);
            while (true) {
                if (mutableIntListMutableIntListOf._size == 0) {
                    break;
                }
                int iLast = mutableIntListMutableIntListOf.last();
                if (range2.getStart() >= iLast) {
                    mutableIntListMutableIntListOf.removeAt(mutableIntListMutableIntListOf._size - 1);
                } else if (!(range2.getEnd() <= iLast)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Paragraph overlap not allowed, end " + range2.getEnd() + " should be less than or equal to " + iLast);
                }
            }
            mutableIntListMutableIntListOf.add(range2.getEnd());
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return get(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return AbstractC9133u.m16128b(this.text, annotatedString.text) && AbstractC9133u.m16128b(this.annotations, annotatedString.annotations);
    }

    public final AnnotatedString flatMapAnnotations(InterfaceC10570l interfaceC10570l) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text_release(interfaceC10570l);
        return builder.toAnnotatedString();
    }

    public char get(int i10) {
        return this.text.charAt(i10);
    }

    public final List<Range<? extends Annotation>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List<Range<LinkAnnotation>> getLinkAnnotations(int i10, int i11) {
        List listM14771n;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            listM14771n = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Range<? extends Annotation> range = list.get(i12);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i10, i11, range2.getStart(), range2.getEnd())) {
                    listM14771n.add(range);
                }
            }
        } else {
            listM14771n = AbstractC8809v.m14771n();
        }
        AbstractC9133u.m16131e(listM14771n, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listM14771n;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? AbstractC8809v.m14771n() : list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? AbstractC8809v.m14771n() : list;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    public final List<Range<String>> getStringAnnotations(String str, int i10, int i11) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Range<? extends Annotation> range = list.get(i12);
            if ((range.getItem() instanceof StringAnnotation) && AbstractC9133u.m16128b(str, range.getTag()) && AnnotatedStringKt.intersect(i10, i11, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotationKt.unbox(range));
            }
        }
        return arrayList;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i10, int i11) {
        List listM14771n;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            listM14771n = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Range<? extends Annotation> range = list.get(i12);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i10, i11, range2.getStart(), range2.getEnd())) {
                    listM14771n.add(range);
                }
            }
        } else {
            listM14771n = AbstractC8809v.m14771n();
        }
        AbstractC9133u.m16131e(listM14771n, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listM14771n;
    }

    @ExperimentalTextApi
    @InterfaceC8721a
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i10, int i11) {
        List listM14771n;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            listM14771n = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Range<? extends Annotation> range = list.get(i12);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(i10, i11, range2.getStart(), range2.getEnd())) {
                    listM14771n.add(range);
                }
            }
        } else {
            listM14771n = AbstractC8809v.m14771n();
        }
        AbstractC9133u.m16131e(listM14771n, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listM14771n;
    }

    public final boolean hasEqualAnnotations(AnnotatedString annotatedString) {
        return AbstractC9133u.m16128b(this.annotations, annotatedString.annotations);
    }

    public final boolean hasLinkAnnotations(int i10, int i11) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Range<? extends Annotation> range = list.get(i12);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i10, i11, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasStringAnnotations(String str, int i10, int i11) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Range<? extends Annotation> range = list.get(i12);
                if ((range.getItem() instanceof StringAnnotation) && AbstractC9133u.m16128b(str, range.getTag()) && AnnotatedStringKt.intersect(i10, i11, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<? extends Annotation>> list = this.annotations;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final AnnotatedString mapAnnotations(InterfaceC10570l interfaceC10570l) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text_release(interfaceC10570l);
        return builder.toAnnotatedString();
    }

    @Stable
    public final AnnotatedString plus(AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m26193subSequence5zctL8(long j10) {
        return subSequence(TextRange.m26362getMinimpl(j10), TextRange.m26361getMaximpl(j10));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int i10, int i11) {
        if (!(i10 <= i11)) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        if (i10 == 0 && i11 == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(i10, i11);
        AbstractC9133u.m16132f(strSubstring, "substring(...)");
        return new AnnotatedString((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.filterRanges(this.annotations, i10, i11), strSubstring);
    }

    @Immutable
    public static final class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        public Range(T t10, int i10, int i11, String str) {
            this.item = t10;
            this.start = i10;
            this.end = i11;
            this.tag = str;
            if (i10 <= i11) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = range.item;
            }
            if ((i12 & 2) != 0) {
                i10 = range.start;
            }
            if ((i12 & 4) != 0) {
                i11 = range.end;
            }
            if ((i12 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i10, i11, str);
        }

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public final String component4() {
            return this.tag;
        }

        public final Range<T> copy(T t10, int i10, int i11, String str) {
            return new Range<>(t10, i10, i11, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return AbstractC9133u.m16128b(this.item, range.item) && this.start == range.start && this.end == range.end && AbstractC9133u.m16128b(this.tag, range.tag);
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t10 = this.item;
            return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    public final List<Range<String>> getStringAnnotations(int i10, int i11) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                Range<? extends Annotation> range = list.get(i12);
                if ((range.getItem() instanceof StringAnnotation) && AnnotatedStringKt.intersect(i10, i11, range.getStart(), range.getEnd())) {
                    arrayList.add(StringAnnotationKt.unbox(range));
                }
            }
            return arrayList;
        }
        return AbstractC8809v.m14771n();
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i10, AbstractC9126n abstractC9126n) {
        this(str, (i10 & 2) != 0 ? AbstractC8809v.m14771n() : list, (i10 & 4) != 0 ? AbstractC8809v.m14771n() : list2);
    }

    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.constructAnnotationsFromSpansAndParagraphs(list, list2), str);
    }

    public /* synthetic */ AnnotatedString(String str, List list, int i10, AbstractC9126n abstractC9126n) {
        this(str, (List<? extends Range<? extends Annotation>>) ((i10 & 2) != 0 ? AbstractC8809v.m14771n() : list));
    }

    public AnnotatedString(String str, List<? extends Range<? extends Annotation>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
