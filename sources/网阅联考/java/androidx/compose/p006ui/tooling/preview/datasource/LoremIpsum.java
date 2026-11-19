package androidx.compose.p006ui.tooling.preview.datasource;

import androidx.compose.p006ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import p051e.AbstractC3720a;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m5175d2 = {"Landroidx/compose/ui/tooling/preview/datasource/LoremIpsum;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", "()V", "words", "", "(I)V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "generateLoremIpsum", "ui-tooling-preview_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i4) {
        this.words = i4;
    }

    private final String generateLoremIpsum(int words) {
        final Ref.IntRef intRef = new Ref.IntRef();
        final int size = LoremIpsumKt.LOREM_IPSUM_SOURCE.size();
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.take(SequencesKt__SequencesKt.generateSequence(new Function0<String>() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum.generateLoremIpsum.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                List list = LoremIpsumKt.LOREM_IPSUM_SOURCE;
                Ref.IntRef intRef2 = intRef;
                int i4 = intRef2.element;
                intRef2.element = i4 + 1;
                return (String) list.get(i4 % size);
            }
        }), words), " ", null, null, 0, null, null, 62, null);
    }

    @Override // androidx.compose.p006ui.tooling.preview.PreviewParameterProvider
    public /* synthetic */ int getCount() {
        return AbstractC3720a.m4719a(this);
    }

    @Override // androidx.compose.p006ui.tooling.preview.PreviewParameterProvider
    public Sequence<String> getValues() {
        return SequencesKt__SequencesKt.sequenceOf(generateLoremIpsum(this.words));
    }

    public LoremIpsum() {
        this(500);
    }
}
