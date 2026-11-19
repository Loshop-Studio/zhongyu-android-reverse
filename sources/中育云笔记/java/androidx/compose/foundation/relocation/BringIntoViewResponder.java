package androidx.compose.foundation.relocation;

import androidx.compose.p014ui.geometry.Rect;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import vc.InterfaceC11588c;

@InterfaceC10770a
/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    Object bringChildIntoView(InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C10786q> interfaceC11588c);

    Rect calculateRectForParent(Rect rect);
}
