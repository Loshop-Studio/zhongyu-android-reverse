package androidx.window.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, m13558d2 = {"Landroidx/window/layout/EmptyDecorator;", "Landroidx/window/layout/WindowInfoTrackerDecorator;", "()V", "decorate", "Landroidx/window/layout/WindowInfoTracker;", "tracker", "window_release"}, m13559k = 1, m13560mv = {1, 6, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return tracker;
    }
}
