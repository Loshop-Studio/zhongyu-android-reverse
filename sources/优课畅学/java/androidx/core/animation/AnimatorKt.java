package androidx.core.animation;

import android.animation.Animator;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class AnimatorKt {
    public static final Animator.AnimatorListener addListener(Animator animator, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC10570l interfaceC10570l4) {
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(interfaceC10570l4, interfaceC10570l, interfaceC10570l3, interfaceC10570l2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10570l interfaceC10570l3, InterfaceC10570l interfaceC10570l4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.core.animation.AnimatorKt.addListener.1
                public final void invoke(Animator animator2) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.core.animation.AnimatorKt.addListener.2
                public final void invoke(Animator animator2) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 4) != 0) {
            interfaceC10570l3 = new InterfaceC10570l() { // from class: androidx.core.animation.AnimatorKt.addListener.3
                public final void invoke(Animator animator2) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 8) != 0) {
            interfaceC10570l4 = new InterfaceC10570l() { // from class: androidx.core.animation.AnimatorKt.addListener.4
                public final void invoke(Animator animator2) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(interfaceC10570l4, interfaceC10570l, interfaceC10570l3, interfaceC10570l2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final InterfaceC10570l interfaceC10570l, final InterfaceC10570l interfaceC10570l2) {
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                interfaceC10570l2.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                interfaceC10570l.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.core.animation.AnimatorKt.addPauseListener.1
                public final void invoke(Animator animator2) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l2 = new InterfaceC10570l() { // from class: androidx.core.animation.AnimatorKt.addPauseListener.2
                public final void invoke(Animator animator2) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animator) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        return addPauseListener(animator, interfaceC10570l, interfaceC10570l2);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final InterfaceC10570l interfaceC10570l) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                interfaceC10570l.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final InterfaceC10570l interfaceC10570l) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                interfaceC10570l.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, InterfaceC10570l interfaceC10570l) {
        return addPauseListener$default(animator, null, interfaceC10570l, 1, null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final InterfaceC10570l interfaceC10570l) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                interfaceC10570l.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, InterfaceC10570l interfaceC10570l) {
        return addPauseListener$default(animator, interfaceC10570l, null, 2, null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final InterfaceC10570l interfaceC10570l) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                interfaceC10570l.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
