package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.extensions.ExtensionsConfig;
import androidx.camera.extensions.internal.AdvancedVendorExtender;
import androidx.camera.extensions.internal.BasicVendorExtender;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.camera.extensions.internal.Version;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class ExtensionsInfo {
    private static final String EXTENDED_CAMERA_CONFIG_PROVIDER_ID_PREFIX = ":camera:camera-extensions-";
    private final CameraProvider mCameraProvider;

    @NonNull
    private VendorExtenderFactory mVendorExtenderFactory = new VendorExtenderFactory() { // from class: androidx.camera.extensions.a
        @Override // androidx.camera.extensions.VendorExtenderFactory
        public final VendorExtender createVendorExtender(int i10) {
            return ExtensionsInfo.getVendorExtender(i10);
        }
    };

    /* renamed from: androidx.camera.extensions.ExtensionsInfo$1 */
    public class C07241 implements VendorExtender {
    }

    public ExtensionsInfo(@NonNull CameraProvider cameraProvider) {
        this.mCameraProvider = cameraProvider;
    }

    /* renamed from: a */
    public static /* synthetic */ CameraConfig m645a(ExtensionsInfo extensionsInfo, int i10, Identifier identifier, CameraInfo cameraInfo, Context context) {
        VendorExtender vendorExtenderCreateVendorExtender = extensionsInfo.mVendorExtenderFactory.createVendorExtender(i10);
        vendorExtenderCreateVendorExtender.init(cameraInfo);
        ExtensionsConfig.Builder useCaseCombinationRequiredRule = new ExtensionsConfig.Builder().setExtensionMode(i10).setUseCaseConfigFactory((UseCaseConfigFactory) new ExtensionsUseCaseConfigFactory(vendorExtenderCreateVendorExtender)).setCompatibilityId(identifier).setZslDisabled(true).setPostviewSupported(vendorExtenderCreateVendorExtender.isPostviewAvailable()).setCaptureProcessProgressSupported(vendorExtenderCreateVendorExtender.isCaptureProcessProgressAvailable()).setUseCaseCombinationRequiredRule(1);
        SessionProcessor sessionProcessorCreateSessionProcessor = vendorExtenderCreateVendorExtender.createSessionProcessor(context);
        if (sessionProcessorCreateSessionProcessor != null) {
            useCaseCombinationRequiredRule.setSessionProcessor(sessionProcessorCreateSessionProcessor);
        }
        return useCaseCombinationRequiredRule.build();
    }

    private static String getExtendedCameraConfigProviderId(int i10) {
        if (i10 == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i10 == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i10 == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i10 == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i10 == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i10 == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }

    private CameraFilter getFilter(int i10) {
        return new ExtensionCameraFilter(getExtendedCameraConfigProviderId(i10), this.mVendorExtenderFactory.createVendorExtender(i10));
    }

    @NonNull
    public static VendorExtender getVendorExtender(int i10) {
        return isAdvancedExtenderSupported() ? new AdvancedVendorExtender(i10) : new BasicVendorExtender(i10);
    }

    private void injectExtensionCameraConfig(final int i10) {
        final Identifier identifierCreate = Identifier.create(getExtendedCameraConfigProviderId(i10));
        if (ExtendedCameraConfigProviderStore.getConfigProvider(identifierCreate) == CameraConfigProvider.EMPTY) {
            ExtendedCameraConfigProviderStore.addConfig(identifierCreate, new CameraConfigProvider() { // from class: androidx.camera.extensions.b
                @Override // androidx.camera.core.impl.CameraConfigProvider
                public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
                    return ExtensionsInfo.m645a(this.f838a, i10, identifierCreate, cameraInfo, context);
                }
            });
        }
    }

    private static boolean isAdvancedExtenderSupported() {
        Version version = Version.VERSION_1_1;
        if (ClientVersion.isMaximumCompatibleVersion(version) || ExtensionVersion.isMaximumCompatibleVersion(version)) {
            return false;
        }
        return ExtensionVersion.isAdvancedExtenderSupported();
    }

    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRange(@NonNull CameraSelector cameraSelector, int i10, @Nullable Size size) {
        List<CameraInfo> listFilter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i10)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (listFilter.isEmpty()) {
            return null;
        }
        CameraInfo cameraInfo = listFilter.get(0);
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i10);
            vendorExtenderCreateVendorExtender.init(cameraInfo);
            return vendorExtenderCreateVendorExtender.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    @NonNull
    public CameraSelector getExtensionCameraSelectorAndInjectCameraConfig(@NonNull CameraSelector cameraSelector, int i10) {
        if (!isExtensionAvailable(cameraSelector, i10)) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ExtensionCameraFilter) {
                throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        injectExtensionCameraConfig(i10);
        CameraSelector.Builder builderFromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        builderFromSelector.addCameraFilter(getFilter(i10));
        return builderFromSelector.build();
    }

    public boolean isExtensionAvailable(@NonNull CameraSelector cameraSelector, int i10) {
        CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i10));
        return !r1.build().filter(this.mCameraProvider.getAvailableCameraInfos()).isEmpty();
    }

    public boolean isImageAnalysisSupported(@NonNull CameraSelector cameraSelector, int i10) {
        List<CameraInfo> listFilter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i10)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (listFilter.isEmpty()) {
            return false;
        }
        CameraInfo cameraInfo = listFilter.get(0);
        VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i10);
        vendorExtenderCreateVendorExtender.init(cameraInfo);
        Size[] supportedYuvAnalysisResolutions = vendorExtenderCreateVendorExtender.getSupportedYuvAnalysisResolutions();
        return supportedYuvAnalysisResolutions != null && supportedYuvAnalysisResolutions.length > 0;
    }

    @VisibleForTesting
    public void setVendorExtenderFactory(@NonNull VendorExtenderFactory vendorExtenderFactory) {
        this.mVendorExtenderFactory = vendorExtenderFactory;
    }
}
