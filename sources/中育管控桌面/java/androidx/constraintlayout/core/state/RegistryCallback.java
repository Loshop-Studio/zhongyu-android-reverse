package androidx.constraintlayout.core.state;

/* loaded from: classes2.dex */
public interface RegistryCallback {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int i6, int i7);

    void onNewMotionScene(String str);

    void onProgress(float f6);

    void setDrawDebug(int i6);

    void setLayoutInformationMode(int i6);
}
