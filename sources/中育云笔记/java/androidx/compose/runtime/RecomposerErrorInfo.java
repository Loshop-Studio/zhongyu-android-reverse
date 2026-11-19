package androidx.compose.runtime;

@InternalComposeApi
/* loaded from: classes2.dex */
public interface RecomposerErrorInfo {
    Throwable getCause();

    boolean getRecoverable();
}
