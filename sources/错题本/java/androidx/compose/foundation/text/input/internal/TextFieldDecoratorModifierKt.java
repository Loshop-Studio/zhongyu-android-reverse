package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.MediaType;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p185v7.AbstractC6675d;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m5110d2 = {"MediaTypesAll", "", "Landroidx/compose/foundation/content/MediaType;", "getMediaTypesAll$annotations", "()V", "MediaTypesText", "getMediaTypesText$annotations", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierKt {

    @NotNull
    private static final Set<MediaType> MediaTypesAll;

    @NotNull
    private static final Set<MediaType> MediaTypesText;

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        MediaTypesText = AbstractC6675d.m6354t(companion.getText());
        MediaTypesAll = AbstractC6675d.m6354t(companion.getAll());
    }

    private static /* synthetic */ void getMediaTypesAll$annotations() {
    }

    private static /* synthetic */ void getMediaTypesText$annotations() {
    }
}
