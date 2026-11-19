package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9108a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;
import p212p7.InterfaceC9760a;

/* loaded from: classes3.dex */
public abstract class Lifecycle {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Event {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Companion Companion;
        public static final Event ON_CREATE = new Event("ON_CREATE", 0);
        public static final Event ON_START = new Event("ON_START", 1);
        public static final Event ON_RESUME = new Event("ON_RESUME", 2);
        public static final Event ON_PAUSE = new Event("ON_PAUSE", 3);
        public static final Event ON_STOP = new Event("ON_STOP", 4);
        public static final Event ON_DESTROY = new Event("ON_DESTROY", 5);
        public static final Event ON_ANY = new Event("ON_ANY", 6);

        public static final class Companion {

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            public final Event downFrom(State state) {
                AbstractC9133u.m16133g(state, "state");
                int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_DESTROY;
                }
                if (i10 == 2) {
                    return Event.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            public final Event downTo(State state) {
                AbstractC9133u.m16133g(state, "state");
                int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_STOP;
                }
                if (i10 == 2) {
                    return Event.ON_PAUSE;
                }
                if (i10 != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            public final Event upFrom(State state) {
                AbstractC9133u.m16133g(state, "state");
                int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_START;
                }
                if (i10 == 2) {
                    return Event.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            public final Event upTo(State state) {
                AbstractC9133u.m16133g(state, "state");
                int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i10 == 1) {
                    return Event.ON_CREATE;
                }
                if (i10 == 2) {
                    return Event.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }

            private Companion() {
            }
        }

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ Event[] $values() {
            return new Event[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        static {
            Event[] eventArr$values = $values();
            $VALUES = eventArr$values;
            $ENTRIES = AbstractC9108a.m16085a(eventArr$values);
            Companion = new Companion(null);
        }

        private Event(String str, int i10) {
        }

        public static final Event downFrom(State state) {
            return Companion.downFrom(state);
        }

        public static final Event downTo(State state) {
            return Companion.downTo(state);
        }

        public static InterfaceC9760a getEntries() {
            return $ENTRIES;
        }

        public static final Event upFrom(State state) {
            return Companion.upFrom(state);
        }

        public static final Event upTo(State state) {
            return Companion.upTo(state);
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public final State getTargetState() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DESTROYED = new State("DESTROYED", 0);
        public static final State INITIALIZED = new State("INITIALIZED", 1);
        public static final State CREATED = new State("CREATED", 2);
        public static final State STARTED = new State("STARTED", 3);
        public static final State RESUMED = new State("RESUMED", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = AbstractC9108a.m16085a(stateArr$values);
        }

        private State(String str, int i10) {
        }

        public static InterfaceC9760a getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final boolean isAtLeast(State state) {
            AbstractC9133u.m16133g(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_currentStateFlow_$lambda$0(InterfaceC9271h interfaceC9271h, LifecycleOwner lifecycleOwner, Event event) {
        AbstractC9133u.m16133g(lifecycleOwner, "<unused var>");
        AbstractC9133u.m16133g(event, "event");
        interfaceC9271h.setValue(event.getTargetState());
    }

    @MainThread
    public abstract void addObserver(LifecycleObserver lifecycleObserver);

    @MainThread
    public abstract State getCurrentState();

    public InterfaceC9280q getCurrentStateFlow() {
        final InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(getCurrentState());
        addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.g
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle._get_currentStateFlow_$lambda$0(interfaceC9271hM17054a, lifecycleOwner, event);
            }
        });
        return AbstractC9268e.m17012b(interfaceC9271hM17054a);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    @MainThread
    public abstract void removeObserver(LifecycleObserver lifecycleObserver);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        AbstractC9133u.m16133g(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
