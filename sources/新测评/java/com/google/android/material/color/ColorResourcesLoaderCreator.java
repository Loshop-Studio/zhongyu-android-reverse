package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;

@RequiresApi(30)
/* loaded from: classes3.dex */
final class ColorResourcesLoaderCreator {
    private static final String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    @Nullable
    public static ResourcesLoader create(@NonNull Context context, @NonNull Map<Integer, Integer> map) throws Throwable {
        FileDescriptor fileDescriptorMemfd_create;
        try {
            byte[] bArrCreate = ColorResourcesTableCreator.create(context, map);
            Log.i(TAG, "Table created, length: " + bArrCreate.length);
            if (bArrCreate.length == 0) {
                return null;
            }
            try {
                fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
                try {
                    if (fileDescriptorMemfd_create == null) {
                        Log.w(TAG, "Cannot create memory file descriptor.");
                        if (fileDescriptorMemfd_create == null) {
                            return null;
                        }
                        Os.close(fileDescriptorMemfd_create);
                        return null;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                    try {
                        fileOutputStream.write(bArrCreate);
                        ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                        try {
                            AbstractC5536h.m4026a();
                            ResourcesLoader resourcesLoaderM4025a = AbstractC5535g.m4025a();
                            resourcesLoaderM4025a.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                            if (parcelFileDescriptorDup != null) {
                                parcelFileDescriptorDup.close();
                            }
                            fileOutputStream.close();
                            Os.close(fileDescriptorMemfd_create);
                            return resourcesLoaderM4025a;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileDescriptorMemfd_create != null) {
                        Os.close(fileDescriptorMemfd_create);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileDescriptorMemfd_create = null;
            }
        } catch (Exception e10) {
            Log.e(TAG, "Failed to create the ColorResourcesTableCreator.", e10);
            return null;
        }
    }
}
