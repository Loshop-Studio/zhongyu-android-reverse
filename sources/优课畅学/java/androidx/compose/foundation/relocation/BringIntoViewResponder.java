package androidx.compose.foundation.relocation;

import androidx.compose.p013ui.geometry.Rect;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;

@InterfaceC8721a
/* loaded from: classes.dex */
public interface BringIntoViewResponder {
    Object bringChildIntoView(InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super C8736p> interfaceC9324c);

    Rect calculateRectForParent(Rect rect);
}
