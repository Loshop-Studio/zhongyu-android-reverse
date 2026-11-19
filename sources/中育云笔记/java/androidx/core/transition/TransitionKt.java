package androidx.core.transition;

import android.transition.Transition;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class TransitionKt {
    public static final Transition.TransitionListener addListener(Transition transition, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5) {
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(interfaceC9540l, interfaceC9540l4, interfaceC9540l5, interfaceC9540l3, interfaceC9540l2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC9540l interfaceC9540l4, InterfaceC9540l interfaceC9540l5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.core.transition.TransitionKt.addListener.1
                public final void invoke(Transition transition2) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Transition) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l2 = new InterfaceC9540l() { // from class: androidx.core.transition.TransitionKt.addListener.2
                public final void invoke(Transition transition2) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Transition) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        InterfaceC9540l interfaceC9540l6 = interfaceC9540l2;
        if ((i10 & 4) != 0) {
            interfaceC9540l3 = new InterfaceC9540l() { // from class: androidx.core.transition.TransitionKt.addListener.3
                public final void invoke(Transition transition2) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Transition) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        if ((i10 & 8) != 0) {
            interfaceC9540l4 = new InterfaceC9540l() { // from class: androidx.core.transition.TransitionKt.addListener.4
                public final void invoke(Transition transition2) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Transition) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        if ((i10 & 16) != 0) {
            interfaceC9540l5 = new InterfaceC9540l() { // from class: androidx.core.transition.TransitionKt.addListener.5
                public final void invoke(Transition transition2) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Transition) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(interfaceC9540l, interfaceC9540l4, interfaceC9540l5, interfaceC9540l3, interfaceC9540l6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener doOnCancel(Transition transition, final InterfaceC9540l interfaceC9540l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                interfaceC9540l.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnEnd(Transition transition, final InterfaceC9540l interfaceC9540l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                interfaceC9540l.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnPause(Transition transition, final InterfaceC9540l interfaceC9540l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                interfaceC9540l.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnResume(Transition transition, final InterfaceC9540l interfaceC9540l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                interfaceC9540l.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnStart(Transition transition, final InterfaceC9540l interfaceC9540l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                interfaceC9540l.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
