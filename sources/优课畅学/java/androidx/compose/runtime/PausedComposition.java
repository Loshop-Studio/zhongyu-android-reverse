package androidx.compose.runtime;

/* loaded from: classes2.dex */
public interface PausedComposition {
    void apply();

    void cancel();

    boolean isComplete();

    boolean resume(ShouldPauseCallback shouldPauseCallback);
}
