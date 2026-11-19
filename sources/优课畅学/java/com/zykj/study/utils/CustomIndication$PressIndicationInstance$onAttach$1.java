package com.zykj.study.utils;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.node.DrawModifierNodeKt;
import com.zykj.study.utils.CustomIndication;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.utils.CustomIndication$PressIndicationInstance$onAttach$1", m17801f = "CustomIndication.kt", m17802l = {41}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CustomIndication$PressIndicationInstance$onAttach$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public Object f13732a;

    /* renamed from: b */
    public Object f13733b;

    /* renamed from: c */
    public Object f13734c;

    /* renamed from: d */
    public int f13735d;

    /* renamed from: e */
    public final /* synthetic */ CustomIndication.PressIndicationInstance f13736e;

    /* renamed from: com.zykj.study.utils.CustomIndication$PressIndicationInstance$onAttach$1$a */
    public static final class C8134a implements InterfaceC9267d {

        /* renamed from: a */
        public final /* synthetic */ Ref$IntRef f13737a;

        /* renamed from: b */
        public final /* synthetic */ Ref$IntRef f13738b;

        /* renamed from: c */
        public final /* synthetic */ Ref$IntRef f13739c;

        /* renamed from: d */
        public final /* synthetic */ CustomIndication.PressIndicationInstance f13740d;

        public C8134a(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Ref$IntRef ref$IntRef3, CustomIndication.PressIndicationInstance pressIndicationInstance) {
            this.f13737a = ref$IntRef;
            this.f13738b = ref$IntRef2;
            this.f13739c = ref$IntRef3;
            this.f13740d = pressIndicationInstance;
        }

        @Override // p169l8.InterfaceC9267d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(Interaction interaction, InterfaceC9324c interfaceC9324c) {
            if (interaction instanceof PressInteraction.Press) {
                this.f13737a.f17471a++;
            } else if (interaction instanceof PressInteraction.Release) {
                Ref$IntRef ref$IntRef = this.f13737a;
                ref$IntRef.f17471a--;
            } else if (interaction instanceof PressInteraction.Cancel) {
                Ref$IntRef ref$IntRef2 = this.f13737a;
                ref$IntRef2.f17471a--;
            } else if (interaction instanceof HoverInteraction.Enter) {
                this.f13738b.f17471a++;
            } else if (interaction instanceof HoverInteraction.Exit) {
                Ref$IntRef ref$IntRef3 = this.f13738b;
                ref$IntRef3.f17471a--;
            } else if (interaction instanceof FocusInteraction.Focus) {
                this.f13739c.f17471a++;
            } else if (interaction instanceof FocusInteraction.Unfocus) {
                Ref$IntRef ref$IntRef4 = this.f13739c;
                ref$IntRef4.f17471a--;
            }
            boolean z10 = this.f13737a.f17471a > 0;
            if (this.f13740d.f13731b != z10) {
                this.f13740d.f13731b = z10;
                DrawModifierNodeKt.invalidateDraw(this.f13740d);
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomIndication$PressIndicationInstance$onAttach$1(CustomIndication.PressIndicationInstance pressIndicationInstance, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13736e = pressIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CustomIndication$PressIndicationInstance$onAttach$1(this.f13736e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CustomIndication$PressIndicationInstance$onAttach$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13735d;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            InterfaceC9266c interactions = this.f13736e.f13730a.getInteractions();
            C8134a c8134a = new C8134a(ref$IntRef, ref$IntRef2, ref$IntRef3, this.f13736e);
            this.f13732a = AbstractC9543h.m17814a(ref$IntRef);
            this.f13733b = AbstractC9543h.m17814a(ref$IntRef2);
            this.f13734c = AbstractC9543h.m17814a(ref$IntRef3);
            this.f13735d = 1;
            if (interactions.collect(c8134a, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
