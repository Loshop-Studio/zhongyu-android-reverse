package android.view;

import android.os.StatFs;
import android.os.SystemClock;
import android.view.compose.LocalLifecycleOwnerKt;
import android.view.viewmodel.CreationExtras;
import android.view.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.navigation.internal.NavBackStackEntryImpl;
import coil3.compose.AbstractC3256m;
import coil3.compose.C3246c;
import coil3.compose.C3253j;
import coil3.disk.C3292j;
import coil3.network.InterfaceC3311c;
import coil3.network.okhttp.internal.C3328c;
import coil3.util.InterfaceC3338b;
import com.zykj.mistake.activity.SketchActivity;
import com.zykj.mistake.feature.ask.C4530k;
import com.zykj.mistake.feature.ask.C4546v;
import com.zykj.mistake.feature.ask.MistakeAskMaterialContract$MaterialType;
import com.zykj.mistake.feature.ask.MistakeAskMaterialContract$SourceType;
import com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultContract$SourceType;
import com.zykj.view.board.board.BoardFragment;
import java.io.File;
import java.util.Arrays;
import java.util.ServiceConfigurationError;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.EmptyCoroutineContext;
import okio.FileSystem;
import okio.Path;
import p045d6.C5443s;
import p118m7.AbstractC6191y0;
import p118m7.C6127d;
import p118m7.C6156m1;
import p152r6.InterfaceC6469a;
import p169t6.AbstractC6600a;
import p214z6.AbstractC6833k;

/* renamed from: androidx.lifecycle.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2766k implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f1186a;

    public /* synthetic */ C2766k(int i) {
        this.f1186a = i;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        switch (this.f1186a) {
            case 0:
                return CreationExtras.Empty.INSTANCE;
            case 1:
                return LocalLifecycleOwnerKt.LocalLifecycleOwner$lambda$3$lambda$2();
            case 2:
                return LocalViewModelStoreOwner.LocalViewModelStoreOwner$lambda$0();
            case 3:
                return NavBackStackEntryImpl.defaultFactory_delegate$lambda$0();
            case 4:
                return NavBackStackEntryImpl.navResultSavedStateFactory_delegate$lambda$10();
            case 5:
                return C5443s.f8405a;
            case 6:
                ProvidableCompositionLocal providableCompositionLocal = AbstractC3256m.f1879a;
                return C3246c.f1849a;
            case 7:
                return C3253j.f1876a;
            case 8:
                FileSystem fileSystem = FileSystem.SYSTEM;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                Path pathResolve = FileSystem.SYSTEM_TEMPORARY_DIRECTORY.resolve("coil3_disk_cache");
                if (pathResolve == null) {
                    throw new IllegalStateException("directory == null");
                }
                long jM5275n = 10485760;
                try {
                    File file = pathResolve.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jM5275n = AbstractC5806u.m5275n((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                }
                return new C3292j(jM5275n, pathResolve, fileSystem, emptyCoroutineContext);
            case 9:
                return InterfaceC3311c.f2001a;
            case 10:
                try {
                    return AbstractC6600a.m6245w(AbstractC6833k.m6499z(AbstractC6833k.m6493t(Arrays.asList(new C3328c()).iterator())));
                } finally {
                }
            case 11:
                try {
                    return AbstractC6600a.m6245w(AbstractC6833k.m6499z(AbstractC6833k.m6493t(Arrays.asList(new InterfaceC3338b[0]).iterator())));
                } finally {
                }
            case 12:
                int i = SketchActivity.f5853v;
                return C5443s.f8405a;
            case 13:
                return new C6127d(C4530k.f6259a, 0);
            case 14:
                return AbstractC6191y0.m5835e("com.zykj.mistake.feature.ask.MistakeAskMaterialContract.MaterialType", MistakeAskMaterialContract$MaterialType.values());
            case 15:
                return new C6127d(C4546v.f6299a, 0);
            case 16:
                return AbstractC6191y0.m5835e("com.zykj.mistake.feature.ask.MistakeAskMaterialContract.SourceType", MistakeAskMaterialContract$SourceType.values());
            case 17:
                return new C6127d(C6156m1.f9829a, 0);
            case 18:
                return new C6127d(C6156m1.f9829a, 0);
            case 19:
                return AbstractC6191y0.m5835e("com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultContract.SourceType", MistakeCollectionFilterResultContract$SourceType.values());
            case 20:
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 21:
                return BoardFragment.mViewModel_delegate$lambda$0();
            case 22:
                return C5443s.f8405a;
            case 23:
                return C5443s.f8405a;
            case 24:
                return C5443s.f8405a;
            case 25:
                return C5443s.f8405a;
            case 26:
                return C5443s.f8405a;
            case 27:
                return C5443s.f8405a;
            case 28:
                return C5443s.f8405a;
            default:
                return C5443s.f8405a;
        }
    }
}
