package androidx.compose.foundation;

import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0016¨\u0006\u0006"}, m13558d2 = {"Landroidx/compose/foundation/NoIndicationInstance;", "Landroidx/compose/foundation/IndicationInstance;", "()V", "drawIndication", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class NoIndicationInstance implements IndicationInstance {
    public static final NoIndicationInstance INSTANCE = new NoIndicationInstance();

    private NoIndicationInstance() {
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
    }
}
