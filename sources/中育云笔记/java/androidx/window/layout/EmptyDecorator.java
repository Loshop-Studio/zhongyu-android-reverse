package androidx.window.layout;

import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker tracker) {
        AbstractC9979u.m20294g(tracker, "tracker");
        return tracker;
    }
}
