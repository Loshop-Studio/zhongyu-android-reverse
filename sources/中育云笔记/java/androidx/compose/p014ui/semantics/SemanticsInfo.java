package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.layout.LayoutInfo;
import java.util.List;

/* loaded from: classes2.dex */
public interface SemanticsInfo extends LayoutInfo {
    List<SemanticsInfo> getChildrenInfo();

    @Override // androidx.compose.p014ui.layout.LayoutInfo
    SemanticsInfo getParentInfo();

    SemanticsConfiguration getSemanticsConfiguration();

    boolean isTransparent();
}
