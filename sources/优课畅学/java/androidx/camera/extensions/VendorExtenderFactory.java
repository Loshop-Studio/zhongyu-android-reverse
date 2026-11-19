package androidx.camera.extensions;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.extensions.internal.VendorExtender;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
interface VendorExtenderFactory {
    @NonNull
    VendorExtender createVendorExtender(int i10);
}
