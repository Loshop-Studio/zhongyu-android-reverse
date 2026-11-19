package androidx.compose.p013ui.semantics;

import androidx.collection.MutableObjectList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0001H\u0000\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000¨\u0006\u0005"}, m13558d2 = {"findMergingSemanticsParent", "Landroidx/compose/ui/semantics/SemanticsInfo;", "mergedSemanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "nearestParentThatHasSemantics", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsInfo.kt\nandroidx/compose/ui/semantics/SemanticsInfoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,104:1\n1#2:105\n80#3:106\n*S KotlinDebug\n*F\n+ 1 SemanticsInfo.kt\nandroidx/compose/ui/semantics/SemanticsInfoKt\n*L\n88#1:106\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsInfoKt {
    public static final SemanticsInfo findMergingSemanticsParent(SemanticsInfo semanticsInfo) {
        for (SemanticsInfo parentInfo = semanticsInfo.getParentInfo(); parentInfo != null; parentInfo = parentInfo.getParentInfo()) {
            SemanticsConfiguration semanticsConfiguration = parentInfo.getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                return parentInfo;
            }
        }
        return null;
    }

    public static final SemanticsConfiguration mergedSemanticsConfiguration(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants() && !semanticsConfiguration.getIsClearingSemantics()) {
            semanticsConfiguration = semanticsConfiguration.copy();
            MutableObjectList mutableObjectList = new MutableObjectList(semanticsInfo.getChildrenInfo().size());
            mutableObjectList.addAll((List) semanticsInfo.getChildrenInfo());
            while (mutableObjectList.isNotEmpty()) {
                SemanticsInfo semanticsInfo2 = (SemanticsInfo) mutableObjectList.removeAt(mutableObjectList._size - 1);
                SemanticsConfiguration semanticsConfiguration2 = semanticsInfo2.getSemanticsConfiguration();
                if (semanticsConfiguration2 != null && !semanticsConfiguration2.getIsMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.mergeChild$ui_release(semanticsConfiguration2);
                    if (!semanticsConfiguration2.getIsClearingSemantics()) {
                        mutableObjectList.addAll((List) semanticsInfo2.getChildrenInfo());
                    }
                }
            }
        }
        return semanticsConfiguration;
    }

    public static final SemanticsInfo nearestParentThatHasSemantics(SemanticsInfo semanticsInfo) {
        for (SemanticsInfo parentInfo = semanticsInfo.getParentInfo(); parentInfo != null; parentInfo = parentInfo.getParentInfo()) {
            if (parentInfo.getSemanticsConfiguration() != null) {
                return parentInfo;
            }
        }
        return null;
    }
}
