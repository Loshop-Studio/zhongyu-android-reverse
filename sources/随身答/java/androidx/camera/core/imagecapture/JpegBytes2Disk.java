package androidx.camera.core.imagecapture;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.utils.Exif;
import androidx.camera.core.internal.compat.workaround.InvalidJpegDataParser;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import com.google.auto.value.AutoValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
class JpegBytes2Disk implements Operation<AbstractC0521In, ImageCapture.OutputFileResults> {
    private static final int COPY_BUFFER_SIZE = 1024;
    private static final int NOT_PENDING = 0;
    private static final int PENDING = 1;
    private static final String TEMP_FILE_PREFIX = "CameraX";
    private static final String TEMP_FILE_SUFFIX = ".tmp";

    @AutoValue
    /* renamed from: androidx.camera.core.imagecapture.JpegBytes2Disk$In */
    public static abstract class AbstractC0521In {
        @NonNull
        /* renamed from: of */
        public static AbstractC0521In m542of(@NonNull Packet<byte[]> packet, @NonNull ImageCapture.OutputFileOptions outputFileOptions) {
            return new AutoValue_JpegBytes2Disk_In(packet, outputFileOptions);
        }

        @NonNull
        public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

        @NonNull
        public abstract Packet<byte[]> getPacket();
    }

    private static Uri copyFileToFile(@NonNull File file, @NonNull File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    private static Uri copyFileToMediaStore(@NonNull File file, @NonNull ImageCapture.OutputFileOptions outputFileOptions) throws Throwable {
        Uri uriInsert;
        ContentResolver contentResolver = outputFileOptions.getContentResolver();
        Objects.requireNonNull(contentResolver);
        ContentValues contentValues = outputFileOptions.getContentValues() != null ? new ContentValues(outputFileOptions.getContentValues()) : new ContentValues();
        setContentValuePendingFlag(contentValues, 1);
        Uri uri = null;
        try {
            try {
                uriInsert = contentResolver.insert(outputFileOptions.getSaveCollection(), contentValues);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (SecurityException e11) {
            e = e11;
        }
        try {
            if (uriInsert == null) {
                throw new ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
            }
            copyTempFileToUri(file, uriInsert, contentResolver);
            updateUriPendingStatus(uriInsert, contentResolver, 0);
            return uriInsert;
        } catch (IOException e12) {
            e = e12;
            uri = uriInsert;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (SecurityException e13) {
            e = e13;
            uri = uriInsert;
            throw new ImageCaptureException(1, "Failed to write to MediaStore URI: " + uri, e);
        } catch (Throwable th2) {
            th = th2;
            uri = uriInsert;
            if (uri != null) {
                updateUriPendingStatus(uri, contentResolver, 0);
            }
            throw th;
        }
    }

    private static void copyFileToOutputStream(@NonNull File file, @NonNull OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i9 = fileInputStream.read(bArr);
                if (i9 <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i9);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void copyTempFileToUri(@NonNull File file, @NonNull Uri uri, @NonNull ContentResolver contentResolver) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                copyFileToOutputStream(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @NonNull
    private static File createTempFile(@NonNull ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        try {
            File file = outputFileOptions.getFile();
            if (file == null) {
                return File.createTempFile(TEMP_FILE_PREFIX, TEMP_FILE_SUFFIX);
            }
            return new File(file.getParent(), TEMP_FILE_PREFIX + UUID.randomUUID().toString() + getFileExtensionWithDot(file));
        } catch (IOException e10) {
            throw new ImageCaptureException(1, "Failed to create temp file.", e10);
        }
    }

    private static String getFileExtensionWithDot(File file) {
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "";
    }

    private static boolean isSaveToFile(ImageCapture.OutputFileOptions outputFileOptions) {
        return outputFileOptions.getFile() != null;
    }

    private static boolean isSaveToMediaStore(ImageCapture.OutputFileOptions outputFileOptions) {
        return (outputFileOptions.getSaveCollection() == null || outputFileOptions.getContentResolver() == null || outputFileOptions.getContentValues() == null) ? false : true;
    }

    private static boolean isSaveToOutputStream(ImageCapture.OutputFileOptions outputFileOptions) {
        return outputFileOptions.getOutputStream() != null;
    }

    @Nullable
    public static Uri moveFileToTarget(@NonNull File file, @NonNull ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        Uri uriCopyFileToFile = null;
        try {
            try {
                if (isSaveToMediaStore(outputFileOptions)) {
                    uriCopyFileToFile = copyFileToMediaStore(file, outputFileOptions);
                } else if (isSaveToOutputStream(outputFileOptions)) {
                    OutputStream outputStream = outputFileOptions.getOutputStream();
                    Objects.requireNonNull(outputStream);
                    copyFileToOutputStream(file, outputStream);
                } else if (isSaveToFile(outputFileOptions)) {
                    File file2 = outputFileOptions.getFile();
                    Objects.requireNonNull(file2);
                    uriCopyFileToFile = copyFileToFile(file, file2);
                }
                file.delete();
                return uriCopyFileToFile;
            } catch (IOException unused) {
                throw new ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    private static void setContentValuePendingFlag(@NonNull ContentValues contentValues, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i9));
        }
    }

    private static void updateFileExif(@NonNull File file, @NonNull Exif exif, @NonNull ImageCapture.OutputFileOptions outputFileOptions, int i9) throws Throwable {
        try {
            Exif exifCreateFromFile = Exif.createFromFile(file);
            exif.copyToCroppedImage(exifCreateFromFile);
            if (exifCreateFromFile.getRotation() == 0 && i9 != 0) {
                exifCreateFromFile.rotate(i9);
            }
            ImageCapture.Metadata metadata = outputFileOptions.getMetadata();
            if (metadata.isReversedHorizontal()) {
                exifCreateFromFile.flipHorizontally();
            }
            if (metadata.isReversedVertical()) {
                exifCreateFromFile.flipVertically();
            }
            if (metadata.getLocation() != null) {
                exifCreateFromFile.attachLocation(metadata.getLocation());
            }
            exifCreateFromFile.save();
        } catch (IOException e10) {
            throw new ImageCaptureException(1, "Failed to update Exif data", e10);
        }
    }

    private static void updateUriPendingStatus(@NonNull Uri uri, @NonNull ContentResolver contentResolver, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            setContentValuePendingFlag(contentValues, i9);
            contentResolver.update(uri, contentValues, null, null);
        }
    }

    private static void writeBytesToFile(@NonNull File file, @NonNull byte[] bArr) throws ImageCaptureException, IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new InvalidJpegDataParser().getValidDataLength(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            throw new ImageCaptureException(1, "Failed to write to temp file", e10);
        }
    }

    @Override // androidx.camera.core.processing.Operation
    @NonNull
    public ImageCapture.OutputFileResults apply(@NonNull AbstractC0521In abstractC0521In) throws Throwable {
        Packet<byte[]> packet = abstractC0521In.getPacket();
        ImageCapture.OutputFileOptions outputFileOptions = abstractC0521In.getOutputFileOptions();
        File fileCreateTempFile = createTempFile(outputFileOptions);
        writeBytesToFile(fileCreateTempFile, packet.getData());
        Exif exif = packet.getExif();
        Objects.requireNonNull(exif);
        updateFileExif(fileCreateTempFile, exif, outputFileOptions, packet.getRotationDegrees());
        return new ImageCapture.OutputFileResults(moveFileToTarget(fileCreateTempFile, outputFileOptions));
    }
}
