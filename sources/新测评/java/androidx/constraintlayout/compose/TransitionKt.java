package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m13558d2 = {"Transition", "Landroidx/constraintlayout/compose/Transition;", "content", "", "constraintlayout-compose_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/constraintlayout/compose/TransitionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
/* loaded from: classes2.dex */
public final class TransitionKt {
    @ExperimentalMotionApi
    @SuppressLint({"ComposableNaming"})
    public static final Transition Transition(String str) {
        CLObject cLObject;
        try {
            cLObject = CLParser.parse(str);
        } catch (CLParsingException e10) {
            Log.e("CML", "Error parsing JSON " + e10);
            cLObject = null;
        }
        return cLObject != null ? new TransitionImpl(cLObject) : TransitionImpl.INSTANCE.getEMPTY$constraintlayout_compose_release();
    }
}
