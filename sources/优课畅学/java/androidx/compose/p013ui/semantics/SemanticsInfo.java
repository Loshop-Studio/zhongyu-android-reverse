package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.layout.LayoutInfo;
import java.util.List;

/* loaded from: classes2.dex */
public interface SemanticsInfo extends LayoutInfo {
    List<SemanticsInfo> getChildrenInfo();

    @Override // androidx.compose.p013ui.layout.LayoutInfo
    SemanticsInfo getParentInfo();

    SemanticsConfiguration getSemanticsConfiguration();

    boolean isTransparent();
}
