package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int CAMERA_DEPRECATED_HAL = 1000;
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int MAX_CAMERAS_IN_USE = 5;
    private final CameraAccessException mCameraAccessException;
    private final int mReason;

    @VisibleForTesting
    static final Set<Integer> PLATFORM_ERRORS = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 10001;
    public static final int CAMERA_CHARACTERISTICS_CREATION_ERROR = 10002;

    @VisibleForTesting
    static final Set<Integer> COMPAT_ERRORS = Collections.unmodifiableSet(new HashSet(Arrays.asList(Integer.valueOf(CAMERA_UNAVAILABLE_DO_NOT_DISTURB), Integer.valueOf(CAMERA_CHARACTERISTICS_CREATION_ERROR))));

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface AccessError {
    }

    public CameraAccessExceptionCompat(int i10) {
        super(getDefaultMessage(i10));
        this.mReason = i10;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10) : null;
    }

    private static String getCombinedMessage(int i10, String str) {
        return String.format("%s (%d): %s", getProblemString(i10), Integer.valueOf(i10), str);
    }

    @Nullable
    private static String getDefaultMessage(int i10) {
        if (i10 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i10 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i10 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i10 == 4) {
            return "The camera device is in use already";
        }
        if (i10 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i10 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i10 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    @NonNull
    private static String getProblemString(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 1000 ? i10 != 10001 ? i10 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    @NonNull
    public static CameraAccessExceptionCompat toCameraAccessExceptionCompat(@NonNull CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new CameraAccessExceptionCompat(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int getReason() {
        return this.mReason;
    }

    @Nullable
    public CameraAccessException toCameraAccessException() {
        return this.mCameraAccessException;
    }

    public CameraAccessExceptionCompat(int i10, @Nullable String str) {
        super(getCombinedMessage(i10, str));
        this.mReason = i10;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, str) : null;
    }

    public CameraAccessExceptionCompat(int i10, @Nullable String str, @Nullable Throwable th) {
        super(getCombinedMessage(i10, str), th);
        this.mReason = i10;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, str, th) : null;
    }

    public CameraAccessExceptionCompat(int i10, @Nullable Throwable th) {
        super(getDefaultMessage(i10), th);
        this.mReason = i10;
        this.mCameraAccessException = PLATFORM_ERRORS.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, null, th) : null;
    }

    private CameraAccessExceptionCompat(@NonNull CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }
}
