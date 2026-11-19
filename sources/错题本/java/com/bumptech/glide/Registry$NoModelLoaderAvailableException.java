package com.bumptech.glide;

import androidx.annotation.NonNull;
import java.util.List;
import p055f0.InterfaceC5511p;

/* loaded from: classes2.dex */
public class Registry$NoModelLoaderAvailableException extends Registry$MissingComponentException {
    public Registry$NoModelLoaderAvailableException(@NonNull Object obj) {
        super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public <M> Registry$NoModelLoaderAvailableException(@NonNull M m8, @NonNull List<InterfaceC5511p> list) {
        super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m8);
    }

    public Registry$NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
    }
}
