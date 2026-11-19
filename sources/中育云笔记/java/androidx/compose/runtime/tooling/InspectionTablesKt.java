package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Set;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class InspectionTablesKt {
    private static final ProvidableCompositionLocal<Set<CompositionData>> LocalInspectionTables = CompositionLocalKt.staticCompositionLocalOf(new InterfaceC9529a() { // from class: androidx.compose.runtime.tooling.InspectionTablesKt$LocalInspectionTables$1
        @Override // p181hd.InterfaceC9529a
        public final Set<CompositionData> invoke() {
            return null;
        }
    });

    public static final ProvidableCompositionLocal<Set<CompositionData>> getLocalInspectionTables() {
        return LocalInspectionTables;
    }
}
