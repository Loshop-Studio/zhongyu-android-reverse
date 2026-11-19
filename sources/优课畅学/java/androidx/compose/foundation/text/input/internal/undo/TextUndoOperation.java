package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.text.UndoManager_jvmKt;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextUndoOperation {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextUndoOperation, Object> Saver = new Saver<TextUndoOperation, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.TextUndoOperation$Companion$Saver$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public TextUndoOperation restore(Object obj) {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            AbstractC9133u.m16131e(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            AbstractC9133u.m16131e(obj3, "null cannot be cast to non-null type kotlin.String");
            Object obj4 = list.get(2);
            AbstractC9133u.m16131e(obj4, "null cannot be cast to non-null type kotlin.String");
            Object obj5 = list.get(3);
            AbstractC9133u.m16131e(obj5, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj5).intValue();
            Object obj6 = list.get(4);
            AbstractC9133u.m16131e(obj6, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange = TextRangeKt.TextRange(iIntValue2, ((Integer) obj6).intValue());
            Object obj7 = list.get(5);
            AbstractC9133u.m16131e(obj7, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) obj7).intValue();
            Object obj8 = list.get(6);
            AbstractC9133u.m16131e(obj8, "null cannot be cast to non-null type kotlin.Int");
            long jTextRange2 = TextRangeKt.TextRange(iIntValue3, ((Integer) obj8).intValue());
            Object obj9 = list.get(7);
            AbstractC9133u.m16131e(obj9, "null cannot be cast to non-null type kotlin.Long");
            return new TextUndoOperation(iIntValue, (String) obj3, (String) obj4, jTextRange, jTextRange2, ((Long) obj9).longValue(), false, 64, null);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Object save(SaverScope saverScope, TextUndoOperation textUndoOperation) {
            return AbstractC8809v.m14774q(Integer.valueOf(textUndoOperation.getIndex()), textUndoOperation.getPreText(), textUndoOperation.getPostText(), Integer.valueOf(TextRange.m26364getStartimpl(textUndoOperation.m21560getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m26359getEndimpl(textUndoOperation.m21560getPreSelectiond9O1mEE())), Integer.valueOf(TextRange.m26364getStartimpl(textUndoOperation.m21559getPostSelectiond9O1mEE())), Integer.valueOf(TextRange.m26359getEndimpl(textUndoOperation.m21559getPostSelectiond9O1mEE())), Long.valueOf(textUndoOperation.getTimeInMillis()));
        }
    };
    private final boolean canMerge;
    private final int index;
    private final long postSelection;
    private final String postText;
    private final long preSelection;
    private final String preText;
    private final TextEditType textEditType;
    private final long timeInMillis;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final Saver<TextUndoOperation, Object> getSaver() {
            return TextUndoOperation.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextUndoOperation(int i10, String str, String str2, long j10, long j11, long j12, boolean z10, AbstractC9126n abstractC9126n) {
        this(i10, str, str2, j10, j11, j12, z10);
    }

    public final boolean getCanMerge() {
        return this.canMerge;
    }

    public final TextDeleteType getDeletionType() {
        return this.textEditType != TextEditType.Delete ? TextDeleteType.NotByUser : !TextRange.m26358getCollapsedimpl(this.postSelection) ? TextDeleteType.NotByUser : TextRange.m26358getCollapsedimpl(this.preSelection) ? TextRange.m26364getStartimpl(this.preSelection) > TextRange.m26364getStartimpl(this.postSelection) ? TextDeleteType.Start : TextDeleteType.End : (TextRange.m26364getStartimpl(this.preSelection) == TextRange.m26364getStartimpl(this.postSelection) && TextRange.m26364getStartimpl(this.preSelection) == this.index) ? TextDeleteType.Inner : TextDeleteType.NotByUser;
    }

    public final int getIndex() {
        return this.index;
    }

    /* renamed from: getPostSelection-d9O1mEE, reason: not valid java name */
    public final long m21559getPostSelectiond9O1mEE() {
        return this.postSelection;
    }

    public final String getPostText() {
        return this.postText;
    }

    /* renamed from: getPreSelection-d9O1mEE, reason: not valid java name */
    public final long m21560getPreSelectiond9O1mEE() {
        return this.preSelection;
    }

    public final String getPreText() {
        return this.preText;
    }

    public final TextEditType getTextEditType() {
        return this.textEditType;
    }

    public final long getTimeInMillis() {
        return this.timeInMillis;
    }

    private TextUndoOperation(int i10, String str, String str2, long j10, long j11, long j12, boolean z10) {
        this.index = i10;
        this.preText = str;
        this.postText = str2;
        this.preSelection = j10;
        this.postSelection = j11;
        this.timeInMillis = j12;
        this.canMerge = z10;
        if (str.length() == 0 && str2.length() == 0) {
            throw new IllegalArgumentException("Either pre or post text must not be empty");
        }
        this.textEditType = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? TextEditType.Replace : TextEditType.Delete : TextEditType.Insert;
    }

    public /* synthetic */ TextUndoOperation(int i10, String str, String str2, long j10, long j11, long j12, boolean z10, int i11, AbstractC9126n abstractC9126n) {
        this(i10, str, str2, j10, j11, (i11 & 32) != 0 ? UndoManager_jvmKt.timeNowMillis() : j12, (i11 & 64) != 0 ? true : z10, null);
    }
}
