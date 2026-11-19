package com.zykj.mistake.feature.notebook.detail;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;

/* renamed from: com.zykj.mistake.feature.notebook.detail.p4 */
/* loaded from: classes3.dex */
public final class C4856p4 implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC6471c f7250a;

    /* renamed from: b */
    public final /* synthetic */ C4771b5 f7251b;

    /* renamed from: c */
    public final /* synthetic */ float f7252c;

    /* renamed from: d */
    public final /* synthetic */ List f7253d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6471c f7254e;

    /* renamed from: f */
    public final /* synthetic */ MutableState f7255f;

    /* renamed from: g */
    public final /* synthetic */ MutableState f7256g;

    /* renamed from: h */
    public final /* synthetic */ MutableState f7257h;

    public C4856p4(InterfaceC6471c interfaceC6471c, C4771b5 c4771b5, float f, List list, InterfaceC6471c interfaceC6471c2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        this.f7250a = interfaceC6471c;
        this.f7251b = c4771b5;
        this.f7252c = f;
        this.f7253d = list;
        this.f7254e = interfaceC6471c2;
        this.f7255f = mutableState;
        this.f7256g = mutableState2;
        this.f7257h = mutableState3;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, InterfaceC5631c interfaceC5631c) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new MistakeDetailNotePanelKt$DraggableNotePictureRow$2$1$3$1$1(this.f7250a, this.f7251b, this.f7252c, this.f7253d, this.f7254e, this.f7255f, this.f7256g, this.f7257h, null), interfaceC5631c);
        return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : C5443s.f8405a;
    }
}
