package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.animation.core.e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0370e {
    /* renamed from: a */
    public static boolean m148a(Transition.Segment segment, Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, segment.getInitialState()) && Intrinsics.areEqual(obj2, segment.getTargetState());
    }
}
