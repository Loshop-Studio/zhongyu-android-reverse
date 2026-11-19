package androidx.compose.p014ui.node;

import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import java.util.List;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes2.dex */
public interface MeasureBlocks {
    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10);

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10);

    /* renamed from: measure-3p2s80s, reason: not valid java name */
    MeasureResult m32452measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10);

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10);
}
