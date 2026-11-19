package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.AbstractC0037f;
import android.util.Log;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.OnBackPressedCallback;
import android.view.OnBackPressedDispatcher;
import android.view.SavedStateReader;
import android.view.SavedStateWriter;
import android.view.ViewModelStore;
import android.view.ViewModelStoreOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.internal.NavContext;
import androidx.navigation.internal.NavControllerImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.AbstractC5773a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.C5801p;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.C5960z;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p207y6.InterfaceC6779c;
import p214z6.AbstractC6833k;

@Metadata(m5109d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 Ò\u00012\u00020\u0001:\u0006Ó\u0001Ô\u0001Ò\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00060\tR\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0019J)\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u001bJ)\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u001eJ.\u0010\u0014\u001a\u00020\u0013\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0014\u0010 J9\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\u001f*\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\"J3\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\u001f*\u00020\u00012\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010#J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010$\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b$\u0010&J\u001c\u0010$\u001a\u00020\u0013\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b$\u0010\u0015J'\u0010$\u001a\u00020\u0013\"\b\b\u0000\u0010\u001f*\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0007¢\u0006\u0004\b$\u0010'J!\u0010$\u001a\u00020\u0013\"\b\b\u0000\u0010\u001f*\u00020\u00012\u0006\u0010\u001d\u001a\u00028\u0000H\u0007¢\u0006\u0004\b$\u0010(J\u000f\u0010)\u001a\u00020\u0013H\u0017¢\u0006\u0004\b)\u0010\u0015J\u0019\u0010+\u001a\u00020\u000f2\b\b\u0001\u0010*\u001a\u00020\u0016H\u0017¢\u0006\u0004\b+\u0010,J)\u0010+\u001a\u00020\u000f2\b\b\u0001\u0010*\u001a\u00020\u00162\u000e\u0010/\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0017¢\u0006\u0004\b+\u00100J'\u0010+\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u000e\u0010/\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0017¢\u0006\u0004\b+\u00103J\u000f\u00105\u001a\u00020\u0013H\u0000¢\u0006\u0004\b4\u0010\u0015J\u0019\u00108\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\u00132\u0006\u0010;\u001a\u00020:H\u0007¢\u0006\u0004\b8\u0010<J'\u0010>\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b>\u0010?J3\u0010A\u001a\u0004\u0018\u00010\u0007*\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010@\u001a\u00020\u00132\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\bA\u0010BJ\u0019\u0010>\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b>\u0010CJ\u0019\u0010E\u001a\u00020\u000f2\b\b\u0001\u0010D\u001a\u00020\u0016H\u0017¢\u0006\u0004\bE\u0010,J)\u0010E\u001a\u00020\u000f2\b\b\u0001\u0010D\u001a\u00020\u00162\u000e\u0010F\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0017¢\u0006\u0004\bE\u00100J3\u0010E\u001a\u00020\u000f2\b\b\u0001\u0010D\u001a\u00020\u00162\u000e\u0010F\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.2\b\u0010H\u001a\u0004\u0018\u00010GH\u0017¢\u0006\u0004\bE\u0010IJ=\u0010E\u001a\u00020\u000f2\b\b\u0001\u0010D\u001a\u00020\u00162\u000e\u0010F\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010K\u001a\u0004\u0018\u00010JH\u0017¢\u0006\u0004\bE\u0010LJ\u0017\u0010E\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bE\u0010OJ!\u0010E\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020M2\b\u0010H\u001a\u0004\u0018\u00010GH\u0017¢\u0006\u0004\bE\u0010PJ+\u0010E\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020M2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010K\u001a\u0004\u0018\u00010JH\u0017¢\u0006\u0004\bE\u0010QJ\u0017\u0010E\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0017¢\u0006\u0004\bE\u0010RJ!\u0010E\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:2\b\u0010H\u001a\u0004\u0018\u00010GH\u0017¢\u0006\u0004\bE\u0010SJ+\u0010E\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010K\u001a\u0004\u0018\u00010JH\u0017¢\u0006\u0004\bE\u0010TJ#\u0010W\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:2\n\u0010F\u001a\u00060-j\u0002`.H\u0000¢\u0006\u0004\bU\u0010VJ\u0017\u0010E\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020XH\u0017¢\u0006\u0004\bE\u0010ZJ!\u0010E\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020X2\b\u0010H\u001a\u0004\u0018\u00010GH\u0017¢\u0006\u0004\bE\u0010[J\u001f\u0010E\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020X2\u0006\u0010K\u001a\u00020JH\u0017¢\u0006\u0004\bE\u0010\\J0\u0010E\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0017\u0010`\u001a\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u000f0]¢\u0006\u0002\b_H\u0007¢\u0006\u0004\bE\u0010aJ/\u0010E\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0004\bE\u0010bJ:\u0010E\u001a\u00020\u000f\"\b\b\u0000\u0010\u001f*\u00020\u00012\u0006\u0010\u001d\u001a\u00028\u00002\u0017\u0010`\u001a\u0013\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u000f0]¢\u0006\u0002\b_H\u0007¢\u0006\u0004\bE\u0010cJ9\u0010E\u001a\u00020\u000f\"\b\b\u0000\u0010\u001f*\u00020\u00012\u0006\u0010\u001d\u001a\u00028\u00002\n\b\u0002\u0010H\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010JH\u0007¢\u0006\u0004\bE\u0010dJ\u000f\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010\u001a\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0017¢\u0006\u0004\b\u001a\u0010hJ\u001f\u0010j\u001a\u00020\u000f2\u000e\u0010i\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.H\u0017¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020lH\u0017¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020\u000f2\u0006\u0010q\u001a\u00020pH\u0017¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020\u0013H\u0017¢\u0006\u0004\bu\u0010vJ\u0017\u0010y\u001a\u00020\u000f2\u0006\u0010x\u001a\u00020wH\u0017¢\u0006\u0004\by\u0010zJ\u0019\u0010}\u001a\u00020|2\b\b\u0001\u0010{\u001a\u00020\u0016H\u0016¢\u0006\u0004\b}\u0010~J\u001c\u0010\u0080\u0001\u001a\u00020\u007f2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0018\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0006\b\u0080\u0001\u0010\u0082\u0001J\u001f\u0010\u0080\u0001\u001a\u00020\u007f\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0006\b\u0080\u0001\u0010\u0083\u0001J(\u0010\u0080\u0001\u001a\u00020\u007f\"\b\b\u0000\u0010\u001f*\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0006\b\u0080\u0001\u0010\u0084\u0001J\"\u0010\u0080\u0001\u001a\u00020\u007f\"\b\b\u0000\u0010\u001f*\u00020\u00012\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0085\u0001J-\u0010\u0086\u0001\u001a\u00020\u00132\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0013H\u0003¢\u0006\u0005\b\u0086\u0001\u0010\u001bJ\u0011\u0010\u0087\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0015J\u0011\u0010\u0088\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0015J9\u00108\u001a\u00020\u00132\u0007\u0010N\u001a\u00030\u0089\u00012\u0015\u0010F\u001a\u0011\u0012\f\u0012\n\u0018\u00010-j\u0004\u0018\u0001`.0\u008a\u00012\u0007\u0010\u008b\u0001\u001a\u00020\u0013H\u0003¢\u0006\u0005\b8\u0010\u008c\u0001J\u001d\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001c2\u0007\u0010N\u001a\u00030\u0089\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J=\u0010E\u001a\u00020\u000f2\u0007\u0010\u008f\u0001\u001a\u00020\u00072\u000e\u0010F\u001a\n\u0018\u00010-j\u0004\u0018\u0001`.2\b\u0010H\u001a\u0004\u0018\u00010G2\b\u0010K\u001a\u0004\u0018\u00010JH\u0003¢\u0006\u0005\bE\u0010\u0090\u0001J\u0012\u0010\u0091\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u0010\u0003\u001a\u00020\u00028G¢\u0006\u000f\n\u0005\b\u0003\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R \u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R'\u0010¤\u0001\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0005\b¦\u0001\u0010\u0015\"\u0005\b§\u0001\u0010vR\u001b\u0010¨\u0001\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010«\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010¥\u0001R!\u0010²\u0001\u001a\u00030¡\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R'\u00102\u001a\u0002012\u0006\u00102\u001a\u0002018W@WX\u0096\u000e¢\u0006\u000f\u001a\u0006\b³\u0001\u0010´\u0001\"\u0005\b+\u0010µ\u0001R\"\u0010º\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u007f0·\u00010¶\u00018G¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\"\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u007f0·\u00010¶\u00018F¢\u0006\b\u001a\u0006\b»\u0001\u0010¹\u0001R,\u0010Ã\u0001\u001a\u00030½\u00012\b\u0010¾\u0001\u001a\u00030½\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Æ\u0001\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0019\u0010È\u0001\u001a\u0004\u0018\u00010\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010\u0083\u0001R\u001b\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00020\u007f0É\u00018F¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0019\u0010Î\u0001\u001a\u0004\u0018\u00010\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010\u0083\u0001R\u0017\u0010Ñ\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001¨\u0006Õ\u0001"}, m5110d2 = {"Landroidx/navigation/NavController;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "createNavControllerNavigatorState$navigation_runtime_release", "(Landroidx/navigation/Navigator;)Landroidx/navigation/NavController$NavControllerNavigatorState;", "createNavControllerNavigatorState", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "listener", "Ld6/s;", "addOnDestinationChangedListener", "(Landroidx/navigation/NavController$OnDestinationChangedListener;)V", "removeOnDestinationChangedListener", "", "popBackStack", "()Z", "", "destinationId", "inclusive", "(IZ)Z", "saveState", "(IZZ)Z", "", "route", "(Ljava/lang/String;ZZ)Z", ExifInterface.GPS_DIRECTION_TRUE, "(ZZ)Z", "Ly6/c;", "(Ly6/c;ZZ)Z", "(Ljava/lang/Object;ZZ)Z", "clearBackStack", "(Ljava/lang/String;)Z", "(I)Z", "(Ly6/c;)Z", "(Ljava/lang/Object;)Z", "navigateUp", "graphResId", "setGraph", "(I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "startDestinationArgs", "(ILandroid/os/Bundle;)V", "Landroidx/navigation/NavGraph;", "graph", "(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V", "checkDeepLinkHandled$navigation_runtime_release", "checkDeepLinkHandled", "Landroid/content/Intent;", "intent", "handleDeepLink", "(Landroid/content/Intent;)Z", "Landroidx/navigation/NavDeepLinkRequest;", "request", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "matchingDest", "findDestination", "(ILandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "searchChildren", "findDestinationComprehensive", "(Landroidx/navigation/NavDestination;IZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "resId", "navigate", "args", "Landroidx/navigation/NavOptions;", "navOptions", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroid/net/Uri;", "deepLink", "(Landroid/net/Uri;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Landroidx/navigation/NavDeepLinkRequest;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "writeIntent$navigation_runtime_release", "(Landroidx/navigation/NavDeepLinkRequest;Landroid/os/Bundle;)V", "writeIntent", "Landroidx/navigation/NavDirections;", "directions", "(Landroidx/navigation/NavDirections;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/Navigator$Extras;)V", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "builder", "(Ljava/lang/String;Lr6/c;)V", "(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Ljava/lang/Object;Lr6/c;)V", "(Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkBuilder;", "createDeepLink", "()Landroidx/navigation/NavDeepLinkBuilder;", "()Landroid/os/Bundle;", "navState", "restoreState", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "setOnBackPressedDispatcher", "(Landroidx/activity/OnBackPressedDispatcher;)V", "enabled", "enableOnBackPressed", "(Z)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "navGraphId", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "(I)Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/navigation/NavBackStackEntry;", "getBackStackEntry", "(I)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", "()Landroidx/navigation/NavBackStackEntry;", "(Ly6/c;)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/Object;)Landroidx/navigation/NavBackStackEntry;", "popBackStackInternal", "tryRelaunchUpToExplicitStack", "tryRelaunchUpToGeneratedStack", "", "", "newTask", "([I[Landroid/os/Bundle;Z)Z", "findInvalidDestinationDisplayNameInDeepLink", "([I)Ljava/lang/String;", "node", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "updateOnBackPressedCallbackEnabled", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/navigation/internal/NavControllerImpl;", "impl", "Landroidx/navigation/internal/NavControllerImpl;", "Landroidx/navigation/internal/NavContext;", "navContext", "Landroidx/navigation/internal/NavContext;", "getNavContext$navigation_runtime_release", "()Landroidx/navigation/internal/NavContext;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Landroidx/navigation/NavInflater;", "inflater", "Landroidx/navigation/NavInflater;", "deepLinkHandled", "Z", "getDeepLinkHandled$navigation_runtime_release", "setDeepLinkHandled$navigation_runtime_release", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "enableOnBackPressedCallback", "navInflater$delegate", "Ld6/e;", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater", "getGraph", "()Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "Lkotlinx/coroutines/flow/m0;", "", "getCurrentBackStack", "()Lkotlinx/coroutines/flow/m0;", "currentBackStack", "getVisibleEntries", "visibleEntries", "Landroidx/navigation/NavigatorProvider;", "value", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "navigatorProvider", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry", "currentBackStackEntry", "Lkotlinx/coroutines/flow/f;", "getCurrentBackStackEntryFlow", "()Lkotlinx/coroutines/flow/f;", "currentBackStackEntryFlow", "getPreviousBackStackEntry", "previousBackStackEntry", "getDestinationCountOnBackStack", "()I", "destinationCountOnBackStack", "Companion", "OnDestinationChangedListener", "NavControllerNavigatorState", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.android.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,1206:1\n233#1:1417\n245#1:1418\n238#1:1419\n183#2,2:1207\n2163#2,2:1420\n27#3:1209\n46#3:1210\n32#3,4:1211\n31#3,7:1221\n27#3:1234\n46#3:1235\n32#3,4:1236\n31#3,7:1246\n27#3:1260\n46#3:1261\n32#3,4:1262\n31#3,7:1272\n27#3:1285\n46#3:1286\n32#3,4:1287\n31#3,7:1297\n27#3:1306\n46#3:1307\n32#3,4:1308\n31#3,7:1318\n27#3:1327\n46#3:1328\n32#3,4:1329\n31#3,7:1339\n27#3:1348\n46#3:1349\n32#3,4:1350\n31#3,7:1360\n27#3:1369\n46#3:1370\n32#3,4:1371\n31#3,7:1381\n27#3:1393\n46#3:1394\n32#3,4:1395\n31#3,7:1405\n126#4:1215\n153#4,3:1216\n126#4:1240\n153#4,3:1241\n126#4:1266\n153#4,3:1267\n126#4:1291\n153#4,3:1292\n126#4:1312\n153#4,3:1313\n126#4:1333\n153#4,3:1334\n126#4:1354\n153#4,3:1355\n126#4:1375\n153#4,3:1376\n126#4:1399\n153#4,3:1400\n37#5,2:1219\n37#5,2:1244\n37#5,2:1270\n37#5,2:1295\n37#5,2:1316\n37#5,2:1337\n37#5,2:1358\n37#5,2:1379\n37#5,2:1403\n1#6:1228\n1#6:1230\n1#6:1253\n1#6:1255\n1#6:1279\n1#6:1304\n1#6:1325\n1#6:1346\n1#6:1367\n1#6:1388\n1#6:1412\n106#7:1229\n106#7:1254\n106#7:1280\n106#7:1282\n106#7:1283\n106#7:1284\n106#7:1305\n106#7:1326\n106#7:1347\n106#7:1368\n106#7:1389\n106#7:1391\n106#7:1392\n106#7:1413\n106#7:1415\n90#7:1416\n1872#8,3:1231\n1782#8,4:1256\n46#9:1281\n46#9:1390\n46#9:1414\n*S KotlinDebug\n*F\n+ 1 NavController.android.kt\nandroidx/navigation/NavController\n*L\n-1#1:1417\n-1#1:1418\n-1#1:1419\n71#1:1207,2\n658#1:1420,2\n359#1:1209\n359#1:1210\n359#1:1211,4\n359#1:1221,7\n384#1:1234\n384#1:1235\n384#1:1236,4\n384#1:1246,7\n524#1:1260\n524#1:1261\n524#1:1262,4\n524#1:1272,7\n563#1:1285\n563#1:1286\n563#1:1287,4\n563#1:1297,7\n609#1:1306\n609#1:1307\n609#1:1308,4\n609#1:1318,7\n617#1:1327\n617#1:1328\n617#1:1329,4\n617#1:1339,7\n860#1:1348\n860#1:1349\n860#1:1350,4\n860#1:1360,7\n865#1:1369\n865#1:1370\n865#1:1371,4\n865#1:1381,7\n1045#1:1393\n1045#1:1394\n1045#1:1395,4\n1045#1:1405,7\n359#1:1215\n359#1:1216,3\n384#1:1240\n384#1:1241,3\n524#1:1266\n524#1:1267,3\n563#1:1291\n563#1:1292,3\n609#1:1312\n609#1:1313,3\n617#1:1333\n617#1:1334,3\n860#1:1354\n860#1:1355,3\n865#1:1375\n865#1:1376,3\n1045#1:1399\n1045#1:1400,3\n359#1:1219,2\n384#1:1244,2\n524#1:1270,2\n563#1:1295,2\n609#1:1316,2\n617#1:1337,2\n860#1:1358,2\n865#1:1379,2\n1045#1:1403,2\n359#1:1228\n384#1:1253\n524#1:1279\n563#1:1304\n609#1:1325\n617#1:1346\n860#1:1367\n865#1:1388\n1045#1:1412\n359#1:1229\n384#1:1254\n524#1:1280\n527#1:1282\n544#1:1283\n560#1:1284\n563#1:1305\n609#1:1326\n617#1:1347\n860#1:1368\n865#1:1389\n867#1:1391\n956#1:1392\n1045#1:1413\n1047#1:1415\n1056#1:1416\n365#1:1231,3\n428#1:1256,4\n524#1:1281\n865#1:1390\n1045#1:1414\n*E\n"})
/* loaded from: classes2.dex */
public class NavController {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";

    @NotNull
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";

    @Nullable
    private Activity activity;

    @NotNull
    private final Context context;
    private boolean deepLinkHandled;
    private boolean enableOnBackPressedCallback;

    @NotNull
    private final NavControllerImpl impl;

    @Nullable
    private NavInflater inflater;

    @NotNull
    private final NavContext navContext;

    /* renamed from: navInflater$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e navInflater;

    @NotNull
    private final OnBackPressedCallback onBackPressedCallback;

    @Nullable
    private OnBackPressedDispatcher onBackPressedDispatcher;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean deepLinkSaveState = true;

    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0003R\u0014\u0010\r\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m5110d2 = {"Landroidx/navigation/NavController$Companion;", "", "<init>", "()V", "", "saveState", "Ld6/s;", "enableDeepLinkSaveState", "(Z)V", "", "KEY_DEEP_LINK_EXTRAS", "Ljava/lang/String;", "getKEY_DEEP_LINK_EXTRAS$annotations", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_INTENT", "deepLinkSaveState", "Z", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        @JvmStatic
        @NavDeepLinkSaveStateControl
        public final void enableDeepLinkSaveState(boolean saveState) {
            NavController.deepLinkSaveState = saveState;
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0090\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u000bJ\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m5110d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "<init>", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "Ld6/s;", "push", "(Landroidx/navigation/NavBackStackEntry;)V", "addInternal", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "createBackStackEntry", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "saveState", "pop", "(Landroidx/navigation/NavBackStackEntry;Z)V", "popWithTransition", "entry", "markTransitionComplete", "prepareForTransition", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public class NavControllerNavigatorState extends NavigatorState {

        @NotNull
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(@NotNull NavController navController, Navigator<? extends NavDestination> navigator) {
            AbstractC5830k.m5330g(navigator, "navigator");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s markTransitionComplete$lambda$1(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry) {
            super.markTransitionComplete(navBackStackEntry);
            return C5443s.f8405a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5443s pop$lambda$0(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z8) {
            super.pop(navBackStackEntry, z8);
            return C5443s.f8405a;
        }

        public final void addInternal(@NotNull NavBackStackEntry backStackEntry) {
            AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
            super.push(backStackEntry);
        }

        @Override // androidx.navigation.NavigatorState
        @NotNull
        public NavBackStackEntry createBackStackEntry(@NotNull NavDestination destination, @Nullable Bundle arguments) {
            AbstractC5830k.m5330g(destination, "destination");
            return this.this$0.impl.createBackStackEntry$navigation_runtime_release(destination, arguments);
        }

        @NotNull
        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.navigation.NavigatorState
        public void markTransitionComplete(@NotNull NavBackStackEntry entry) {
            AbstractC5830k.m5330g(entry, "entry");
            this.this$0.impl.markTransitionComplete$navigation_runtime_release(this, entry, new C2857e(0, this, entry));
        }

        @Override // androidx.navigation.NavigatorState
        public void pop(@NotNull final NavBackStackEntry popUpTo, final boolean saveState) {
            AbstractC5830k.m5330g(popUpTo, "popUpTo");
            this.this$0.impl.pop$navigation_runtime_release(this, popUpTo, saveState, new InterfaceC6469a() { // from class: androidx.navigation.f
                @Override // p152r6.InterfaceC6469a
                public final Object invoke() {
                    return NavController.NavControllerNavigatorState.pop$lambda$0(this.f1307a, popUpTo, saveState);
                }
            });
        }

        @Override // androidx.navigation.NavigatorState
        public void popWithTransition(@NotNull NavBackStackEntry popUpTo, boolean saveState) {
            AbstractC5830k.m5330g(popUpTo, "popUpTo");
            super.popWithTransition(popUpTo, saveState);
        }

        @Override // androidx.navigation.NavigatorState
        public void prepareForTransition(@NotNull NavBackStackEntry entry) {
            AbstractC5830k.m5330g(entry, "entry");
            super.prepareForTransition(entry);
            this.this$0.impl.prepareForTransition$navigation_runtime_release(entry);
        }

        @Override // androidx.navigation.NavigatorState
        public void push(@NotNull NavBackStackEntry backStackEntry) {
            AbstractC5830k.m5330g(backStackEntry, "backStackEntry");
            this.this$0.impl.push$navigation_runtime_release(this, backStackEntry);
        }
    }

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m5110d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "Landroidx/navigation/NavController;", "controller", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "Ld6/s;", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "navigation-runtime_release"}, m5111k = 1, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface OnDestinationChangedListener {
        void onDestinationChanged(@NotNull NavController controller, @NotNull NavDestination destination, @Nullable Bundle arguments);
    }

    public NavController(@NotNull Context context) {
        Object next;
        AbstractC5830k.m5330g(context, "context");
        this.context = context;
        final int i = 0;
        this.impl = new NavControllerImpl(this, new InterfaceC6469a(this) { // from class: androidx.navigation.c

            /* renamed from: b */
            public final /* synthetic */ NavController f1198b;

            {
                this.f1198b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return NavController.impl$lambda$0(this.f1198b);
                    default:
                        return NavController.navInflater_delegate$lambda$10(this.f1198b);
                }
            }
        });
        this.navContext = new NavContext(context);
        Iterator it = AbstractC6833k.m6495v(context, new C2826a(3)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.activity = (Activity) next;
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // android.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new NavGraphNavigator(this.impl.get_navigatorProvider$navigation_runtime_release()));
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new ActivityNavigator(this.context));
        final int i8 = 1;
        this.navInflater = AbstractC5773a.m5117b(new InterfaceC6469a(this) { // from class: androidx.navigation.c

            /* renamed from: b */
            public final /* synthetic */ NavController f1198b;

            {
                this.f1198b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return NavController.impl$lambda$0(this.f1198b);
                    default:
                        return NavController.navInflater_delegate$lambda$10(this.f1198b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context activity$lambda$1(Context it) {
        AbstractC5830k.m5330g(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }

    @JvmStatic
    @NavDeepLinkSaveStateControl
    public static final void enableDeepLinkSaveState(boolean z8) {
        INSTANCE.enableDeepLinkSaveState(z8);
    }

    public static /* synthetic */ NavDestination findDestination$default(NavController navController, int i, NavDestination navDestination, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i8 & 2) != 0) {
            navDestination = null;
        }
        return navController.findDestination(i, navDestination);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$default(NavController navController, NavDestination navDestination, int i, boolean z8, NavDestination navDestination2, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i8 & 4) != 0) {
            navDestination2 = null;
        }
        return navController.findDestinationComprehensive(navDestination, i, z8, navDestination2);
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] deepLink) {
        return this.impl.m1942x7b9ea851(deepLink);
    }

    private final int getDestinationCountOnBackStack() {
        C5801p backQueue = this.impl.getBackQueue();
        int i = 0;
        if (backQueue != null && backQueue.isEmpty()) {
            return 0;
        }
        Iterator<E> it = backQueue.iterator();
        while (it.hasNext()) {
            if (!(((NavBackStackEntry) it.next()).getDestination() instanceof NavGraph) && (i = i + 1) < 0) {
                AbstractC5806u.m5257K();
                throw null;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s handleDeepLink$lambda$21(NavDestination navDestination, NavController navController, NavOptionsBuilder navOptions) {
        AbstractC5830k.m5330g(navOptions, "$this$navOptions");
        navOptions.anim(new C2826a(1));
        if (navDestination instanceof NavGraph) {
            Iterator it = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
            while (true) {
                if (it.hasNext()) {
                    NavDestination navDestination2 = (NavDestination) it.next();
                    NavDestination currentDestination = navController.getCurrentDestination();
                    if (AbstractC5830k.m5325b(navDestination2, currentDestination != null ? currentDestination.getParent() : null)) {
                        break;
                    }
                } else if (deepLinkSaveState) {
                    navOptions.popUpTo(NavGraph.INSTANCE.findStartDestination(navController.getGraph()).getId(), new C2826a(2));
                }
            }
        }
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s handleDeepLink$lambda$21$lambda$18(AnimBuilder anim) {
        AbstractC5830k.m5330g(anim, "$this$anim");
        anim.setEnter(0);
        anim.setExit(0);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s handleDeepLink$lambda$21$lambda$20(PopUpToBuilder popUpTo) {
        AbstractC5830k.m5330g(popUpTo, "$this$popUpTo");
        popUpTo.setSaveState(true);
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s impl$lambda$0(NavController navController) {
        navController.updateOnBackPressedCallbackEnabled();
        return C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavInflater navInflater_delegate$lambda$10(NavController navController) {
        NavInflater navInflater = navController.inflater;
        return navInflater == null ? new NavInflater(navController.context, navController.impl.get_navigatorProvider$navigation_runtime_release()) : navInflater;
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            navOptions = null;
        }
        if ((i & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    public static boolean popBackStack$default(NavController navController, boolean z8, boolean z9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    @MainThread
    private final boolean popBackStackInternal(@IdRes int destinationId, boolean inclusive, boolean saveState) {
        return this.impl.popBackStackInternal$navigation_runtime_release(destinationId, inclusive, saveState);
    }

    public static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i, boolean z8, boolean z9, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i8 & 4) != 0) {
            z9 = false;
        }
        return navController.popBackStackInternal(i, z8, z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean tryRelaunchUpToExplicitStack() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.tryRelaunchUpToExplicitStack():boolean");
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        Pair[] pairArr;
        Bundle bundleAddInDefaultArgs;
        NavDestination currentDestination = getCurrentDestination();
        AbstractC5830k.m5327d(currentDestination);
        int id = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() != id) {
                Map mapM5147A = AbstractC5785e0.m5147A();
                if (mapM5147A.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapM5147A.size());
                    for (Map.Entry entry : mapM5147A.entrySet()) {
                        AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Bundle bundleM13683constructorimpl = SavedStateWriter.m13683constructorimpl(bundleBundleOf);
                Activity activity = this.activity;
                if (activity != null) {
                    AbstractC5830k.m5327d(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        AbstractC5830k.m5327d(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            AbstractC5830k.m5327d(activity3);
                            Intent intent = activity3.getIntent();
                            AbstractC5830k.m5329f(intent, "getIntent(...)");
                            SavedStateWriter.m13707putParcelableimpl(bundleM13683constructorimpl, KEY_DEEP_LINK_INTENT, intent);
                            NavGraph topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release();
                            Activity activity4 = this.activity;
                            AbstractC5830k.m5327d(activity4);
                            Intent intent2 = activity4.getIntent();
                            AbstractC5830k.m5329f(intent2, "getIntent(...)");
                            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(intent2), true, true, topGraph$navigation_runtime_release);
                            if ((deepLinkMatchMatchDeepLinkComprehensive != null ? deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs() : null) != null && (bundleAddInDefaultArgs = deepLinkMatchMatchDeepLinkComprehensive.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs())) != null) {
                                SavedStateWriter.m13687putAllimpl(bundleM13683constructorimpl, bundleAddInDefaultArgs);
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundleBundleOf).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            id = parent.getId();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            androidx.activity.OnBackPressedCallback r0 = r3.onBackPressedCallback
            boolean r1 = r3.enableOnBackPressedCallback
            if (r1 == 0) goto Le
            int r1 = r3.getDestinationCountOnBackStack()
            r2 = 1
            if (r1 <= r2) goto Le
            goto Lf
        Le:
            r2 = 0
        Lf:
            r0.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.updateOnBackPressedCallbackEnabled():void");
    }

    public void addOnDestinationChangedListener(@NotNull OnDestinationChangedListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.impl.addOnDestinationChangedListener$navigation_runtime_release(listener);
    }

    public final boolean checkDeepLinkHandled$navigation_runtime_release() {
        Activity activity;
        if (this.deepLinkHandled || (activity = this.activity) == null) {
            return false;
        }
        AbstractC5830k.m5327d(activity);
        return handleDeepLink(activity.getIntent());
    }

    @MainThread
    public final <T> boolean clearBackStack() {
        AbstractC5830k.m5338o();
        throw null;
    }

    @NotNull
    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    @NotNull
    public final NavControllerNavigatorState createNavControllerNavigatorState$navigation_runtime_release(@NotNull Navigator<? extends NavDestination> navigator) {
        AbstractC5830k.m5330g(navigator, "navigator");
        return new NavControllerNavigatorState(this, navigator);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void enableOnBackPressed(boolean enabled) {
        this.enableOnBackPressedCallback = enabled;
        updateOnBackPressedCallbackEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestination(@IdRes int destinationId, @Nullable NavDestination matchingDest) {
        return this.impl.findDestination$navigation_runtime_release(destinationId, matchingDest);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestinationComprehensive(@NotNull NavDestination navDestination, @IdRes int i, boolean z8, @Nullable NavDestination navDestination2) {
        AbstractC5830k.m5330g(navDestination, "<this>");
        return this.impl.findDestinationComprehensive$navigation_runtime_release(navDestination, i, z8, navDestination2);
    }

    public final <T> NavBackStackEntry getBackStackEntry() {
        AbstractC5830k.m5338o();
        throw null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final InterfaceC5944m0 getCurrentBackStack() {
        return this.impl.getCurrentBackStack();
    }

    @Nullable
    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.impl.getCurrentBackStackEntry$navigation_runtime_release();
    }

    @NotNull
    public final InterfaceC5910f getCurrentBackStackEntryFlow() {
        return new C5960z(this.impl.get_currentBackStackEntryFlow());
    }

    @Nullable
    public NavDestination getCurrentDestination() {
        return this.impl.getCurrentDestination$navigation_runtime_release();
    }

    /* renamed from: getDeepLinkHandled$navigation_runtime_release, reason: from getter */
    public final boolean getDeepLinkHandled() {
        return this.deepLinkHandled;
    }

    @MainThread
    @NotNull
    public NavGraph getGraph() {
        return this.impl.getGraph$navigation_runtime_release();
    }

    @NotNull
    /* renamed from: getNavContext$navigation_runtime_release, reason: from getter */
    public final NavContext getNavContext() {
        return this.navContext;
    }

    @NotNull
    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater.getValue();
    }

    @NotNull
    public NavigatorProvider getNavigatorProvider() {
        return this.impl.get_navigatorProvider();
    }

    @Nullable
    public NavBackStackEntry getPreviousBackStackEntry() {
        return this.impl.getPreviousBackStackEntry$navigation_runtime_release();
    }

    @NotNull
    public ViewModelStoreOwner getViewModelStoreOwner(@IdRes int navGraphId) {
        return this.impl.getViewModelStoreOwner$navigation_runtime_release(navGraphId);
    }

    @NotNull
    public final InterfaceC5944m0 getVisibleEntries() {
        return this.impl.getVisibleEntries();
    }

    @MainThread
    public boolean handleDeepLink(@Nullable Intent intent) {
        int[] intArray;
        Pair[] pairArr;
        NavGraph topGraph$navigation_runtime_release;
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive;
        Pair[] pairArr2;
        Bundle bundle;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
            } catch (Exception e) {
                Log.e(NavControllerImpl.TAG, "handleDeepLink() could not extract deepLink from " + intent, e);
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS) : null;
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapM5147A.size());
            for (Map.Entry entry : mapM5147A.entrySet()) {
                AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList2);
            }
            pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        Bundle bundle2 = extras != null ? extras.getBundle(KEY_DEEP_LINK_EXTRAS) : null;
        if (bundle2 != null) {
            SavedStateWriter.m13687putAllimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf), bundle2);
        }
        if ((intArray == null || intArray.length == 0) && (deepLinkMatchMatchDeepLinkComprehensive = (topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release()).matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(intent), true, true, topGraph$navigation_runtime_release)) != null) {
            NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
            int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
            Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
            if (bundleAddInDefaultArgs != null) {
                SavedStateWriter.m13687putAllimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf), bundleAddInDefaultArgs);
            }
            intArray = iArrBuildDeepLinkIds$default;
        } else {
            arrayList = parcelableArrayList;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strFindInvalidDestinationDisplayNameInDeepLink = findInvalidDestinationDisplayNameInDeepLink(intArray);
        if (strFindInvalidDestinationDisplayNameInDeepLink != null) {
            androidx.navigation.internal.Log.INSTANCE.m1923i(NavControllerImpl.TAG, "Could not find destination " + strFindInvalidDestinationDisplayNameInDeepLink + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        SavedStateWriter.m13707putParcelableimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf), KEY_DEEP_LINK_INTENT, intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < length; i++) {
            Map mapM5147A2 = AbstractC5785e0.m5147A();
            if (mapM5147A2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapM5147A2.size());
                for (Map.Entry entry2 : mapM5147A2.entrySet()) {
                    AbstractC1923c.m1057u((String) entry2.getKey(), entry2.getValue(), arrayList3);
                }
                pairArr2 = (Pair[]) arrayList3.toArray(new Pair[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            Bundle bundleM13683constructorimpl = SavedStateWriter.m13683constructorimpl(bundleBundleOf2);
            SavedStateWriter.m13687putAllimpl(bundleM13683constructorimpl, bundleBundleOf);
            if (arrayList != null && (bundle = (Bundle) arrayList.get(i)) != null) {
                SavedStateWriter.m13687putAllimpl(bundleM13683constructorimpl, bundle);
            }
            bundleArr[i] = bundleBundleOf2;
        }
        int flags = intent.getFlags();
        int i8 = 268435456 & flags;
        if (i8 == 0 || (flags & 32768) != 0) {
            return handleDeepLink(intArray, bundleArr, i8 != 0);
        }
        intent.addFlags(32768);
        TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(intent);
        AbstractC5830k.m5329f(taskStackBuilderAddNextIntentWithParentStack, "addNextIntentWithParentStack(...)");
        taskStackBuilderAddNextIntentWithParentStack.startActivities();
        Activity activity = this.activity;
        if (activity != null) {
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        return true;
    }

    @JvmOverloads
    @MainThread
    public final <T> void navigate(@NotNull T route) {
        AbstractC5830k.m5330g(route, "route");
        navigate$default(this, route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @MainThread
    public boolean navigateUp() {
        Intent intent;
        if (getDestinationCountOnBackStack() != 1) {
            return popBackStack();
        }
        Activity activity = this.activity;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null) != null ? tryRelaunchUpToExplicitStack() : tryRelaunchUpToGeneratedStack();
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(@NotNull T route, boolean z8) {
        AbstractC5830k.m5330g(route, "route");
        return popBackStack$default(this, (Object) route, z8, false, 4, (Object) null);
    }

    public void removeOnDestinationChangedListener(@NotNull OnDestinationChangedListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.impl.removeOnDestinationChangedListener$navigation_runtime_release(listener);
    }

    @CallSuper
    public void restoreState(@Nullable Bundle navState) {
        if (navState != null) {
            navState.setClassLoader(this.context.getClassLoader());
        }
        this.impl.restoreState$navigation_runtime_release(navState);
        if (navState != null) {
            Boolean boolM13609getBooleanOrNullimpl = SavedStateReader.m13609getBooleanOrNullimpl(SavedStateReader.m13597constructorimpl(navState), KEY_DEEP_LINK_HANDLED);
            this.deepLinkHandled = boolM13609getBooleanOrNullimpl != null ? boolM13609getBooleanOrNullimpl.booleanValue() : false;
        }
    }

    @CallSuper
    @Nullable
    public Bundle saveState() {
        Pair[] pairArr;
        Bundle bundleSaveState$navigation_runtime_release = this.impl.saveState$navigation_runtime_release();
        if (this.deepLinkHandled) {
            if (bundleSaveState$navigation_runtime_release == null) {
                Map mapM5147A = AbstractC5785e0.m5147A();
                if (mapM5147A.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapM5147A.size());
                    for (Map.Entry entry : mapM5147A.entrySet()) {
                        AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundleSaveState$navigation_runtime_release = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                SavedStateWriter.m13683constructorimpl(bundleSaveState$navigation_runtime_release);
            }
            SavedStateWriter.m13689putBooleanimpl(SavedStateWriter.m13683constructorimpl(bundleSaveState$navigation_runtime_release), KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundleSaveState$navigation_runtime_release;
    }

    public final void setDeepLinkHandled$navigation_runtime_release(boolean z8) {
        this.deepLinkHandled = z8;
    }

    @CallSuper
    @MainThread
    public void setGraph(@NotNull NavGraph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        this.impl.setGraph$navigation_runtime_release(graph);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setLifecycleOwner(@NotNull LifecycleOwner owner) {
        AbstractC5830k.m5330g(owner, "owner");
        this.impl.setLifecycleOwner$navigation_runtime_release(owner);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setNavigatorProvider(@NotNull NavigatorProvider value) {
        AbstractC5830k.m5330g(value, "value");
        this.impl.setNavigatorProvider$navigation_runtime_release(value);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnBackPressedDispatcher(@NotNull OnBackPressedDispatcher dispatcher) {
        AbstractC5830k.m5330g(dispatcher, "dispatcher");
        if (dispatcher.equals(this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.impl.getLifecycleOwner();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = dispatcher;
        dispatcher.addCallback(lifecycleOwner, this.onBackPressedCallback);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.removeObserver(this.impl.getLifecycleObserver());
        lifecycle.addObserver(this.impl.getLifecycleObserver());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setViewModelStore(@NotNull ViewModelStore viewModelStore) {
        AbstractC5830k.m5330g(viewModelStore, "viewModelStore");
        this.impl.setViewModelStore$navigation_runtime_release(viewModelStore);
    }

    public final void writeIntent$navigation_runtime_release(@NotNull NavDeepLinkRequest request, @NotNull Bundle args) {
        AbstractC5830k.m5330g(request, "request");
        AbstractC5830k.m5330g(args, "args");
        Intent intent = new Intent();
        intent.setDataAndType(request.getUri(), request.getMimeType());
        intent.setAction(request.getAction());
        SavedStateWriter.m13707putParcelableimpl(SavedStateWriter.m13683constructorimpl(args), KEY_DEEP_LINK_INTENT, intent);
    }

    public static /* synthetic */ void navigate$default(NavController navController, Object obj, NavOptions navOptions, Navigator.Extras extras, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            navOptions = null;
        }
        if ((i & 4) != 0) {
            extras = null;
        }
        navController.navigate((NavController) obj, navOptions, extras);
    }

    @MainThread
    public final boolean clearBackStack(@NotNull String route) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.clearBackStack$navigation_runtime_release(route);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findDestination(@NotNull String route) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.findDestination$navigation_runtime_release(route);
    }

    @NotNull
    public NavBackStackEntry getBackStackEntry(@IdRes int destinationId) {
        return this.impl.getBackStackEntry$navigation_runtime_release(destinationId);
    }

    @JvmOverloads
    @MainThread
    public final <T> void navigate(@NotNull T route, @Nullable NavOptions navOptions) {
        AbstractC5830k.m5330g(route, "route");
        navigate$default(this, route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @JvmOverloads
    @MainThread
    public final boolean popBackStack(@NotNull String route, boolean z8) {
        AbstractC5830k.m5330g(route, "route");
        return popBackStack$default(this, route, z8, false, 4, (Object) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int graphResId) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(graphResId), null);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z8, boolean z9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 4) != 0) {
            z9 = false;
        }
        return navController.popBackStack(str, z8, z9);
    }

    @MainThread
    public final boolean clearBackStack(@IdRes int destinationId) {
        return this.impl.clearBackStack$navigation_runtime_release(destinationId);
    }

    @NotNull
    public final NavBackStackEntry getBackStackEntry(@NotNull String route) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.getBackStackEntry$navigation_runtime_release(route);
    }

    @JvmOverloads
    @MainThread
    public final void navigate(@NotNull String route) {
        AbstractC5830k.m5330g(route, "route");
        navigate$default(this, route, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(@NotNull InterfaceC6779c route, boolean z8) {
        AbstractC5830k.m5330g(route, "route");
        return popBackStack$default(this, route, z8, false, 4, (Object) null);
    }

    @CallSuper
    @MainThread
    public void setGraph(@NavigationRes int graphResId, @Nullable Bundle startDestinationArgs) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(graphResId), startDestinationArgs);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, InterfaceC6779c interfaceC6779c, boolean z8, boolean z9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 4) != 0) {
            z9 = false;
        }
        return navController.popBackStack(interfaceC6779c, z8, z9);
    }

    @MainThread
    public final <T> boolean clearBackStack(@NotNull InterfaceC6779c route) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.clearBackStack$navigation_runtime_release(route);
    }

    @NotNull
    public final <T> NavBackStackEntry getBackStackEntry(@NotNull InterfaceC6779c route) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.getBackStackEntry$navigation_runtime_release(route);
    }

    @JvmOverloads
    @MainThread
    public final void navigate(@NotNull String route, @Nullable NavOptions navOptions) {
        AbstractC5830k.m5330g(route, "route");
        navigate$default(this, route, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    @MainThread
    public boolean popBackStack() {
        return this.impl.popBackStack$navigation_runtime_release();
    }

    @CallSuper
    @MainThread
    public void setGraph(@NotNull NavGraph graph, @Nullable Bundle startDestinationArgs) {
        AbstractC5830k.m5330g(graph, "graph");
        this.impl.setGraph$navigation_runtime_release(graph, startDestinationArgs);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, Object obj, boolean z8, boolean z9, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 4) != 0) {
            z9 = false;
        }
        return navController.popBackStack((NavController) obj, z8, z9);
    }

    @MainThread
    public final <T> boolean clearBackStack(@NotNull T route) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.clearBackStack$navigation_runtime_release((NavControllerImpl) route);
    }

    @NotNull
    public final <T> NavBackStackEntry getBackStackEntry(@NotNull T route) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.getBackStackEntry$navigation_runtime_release((NavControllerImpl) route);
    }

    @MainThread
    public void navigate(@IdRes int resId) {
        navigate(resId, (Bundle) null);
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive) {
        return this.impl.popBackStack$navigation_runtime_release(destinationId, inclusive);
    }

    @MainThread
    public void navigate(@IdRes int resId, @Nullable Bundle args) {
        navigate(resId, args, (NavOptions) null);
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(boolean z8) {
        AbstractC5830k.m5338o();
        throw null;
    }

    @MainThread
    public void navigate(@IdRes int resId, @Nullable Bundle args, @Nullable NavOptions navOptions) {
        navigate(resId, args, navOptions, (Navigator.Extras) null);
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(boolean inclusive, boolean saveState) {
        AbstractC5830k.m5338o();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a9  */
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void navigate(@androidx.annotation.IdRes int r11, @org.jetbrains.annotations.Nullable android.os.Bundle r12, @org.jetbrains.annotations.Nullable androidx.navigation.NavOptions r13, @org.jetbrains.annotations.Nullable androidx.navigation.Navigator.Extras r14) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.navigate(int, android.os.Bundle, androidx.navigation.NavOptions, androidx.navigation.Navigator$Extras):void");
    }

    @MainThread
    public boolean popBackStack(@IdRes int destinationId, boolean inclusive, boolean saveState) {
        return this.impl.popBackStack$navigation_runtime_release(destinationId, inclusive, saveState);
    }

    @JvmOverloads
    @MainThread
    public final boolean popBackStack(@NotNull String route, boolean inclusive, boolean saveState) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.popBackStack$navigation_runtime_release(route, inclusive, saveState);
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(@NotNull InterfaceC6779c route, boolean inclusive, boolean saveState) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.popBackStack$navigation_runtime_release(route, inclusive, saveState);
    }

    @JvmOverloads
    @MainThread
    public final <T> boolean popBackStack(@NotNull T route, boolean inclusive, boolean saveState) {
        AbstractC5830k.m5330g(route, "route");
        return this.impl.popBackStack$navigation_runtime_release((NavControllerImpl) route, inclusive, saveState);
    }

    @MainThread
    public final boolean handleDeepLink(@NotNull NavDeepLinkRequest request) {
        Pair[] pairArr;
        Pair[] pairArr2;
        AbstractC5830k.m5330g(request, "request");
        NavGraph topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release();
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(request, true, true, topGraph$navigation_runtime_release);
        if (deepLinkMatchMatchDeepLinkComprehensive == null) {
            return false;
        }
        NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
        int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
        Map mapM5147A = AbstractC5785e0.m5147A();
        if (mapM5147A.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapM5147A.size());
            for (Map.Entry entry : mapM5147A.entrySet()) {
                AbstractC1923c.m1057u((String) entry.getKey(), entry.getValue(), arrayList);
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM13683constructorimpl = SavedStateWriter.m13683constructorimpl(bundleBundleOf);
        Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
        if (bundleAddInDefaultArgs != null) {
            SavedStateWriter.m13687putAllimpl(bundleM13683constructorimpl, bundleAddInDefaultArgs);
        }
        int length = iArrBuildDeepLinkIds$default.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < length; i++) {
            Map mapM5147A2 = AbstractC5785e0.m5147A();
            if (mapM5147A2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapM5147A2.size());
                for (Map.Entry entry2 : mapM5147A2.entrySet()) {
                    AbstractC1923c.m1057u((String) entry2.getKey(), entry2.getValue(), arrayList2);
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            SavedStateWriter.m13687putAllimpl(SavedStateWriter.m13683constructorimpl(bundleBundleOf2), bundleBundleOf);
            bundleArr[i] = bundleBundleOf2;
        }
        return handleDeepLink(iArrBuildDeepLinkIds$default, bundleArr, true);
    }

    @MainThread
    public void navigate(@NotNull Uri deepLink) {
        AbstractC5830k.m5330g(deepLink, "deepLink");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null));
    }

    @MainThread
    public void navigate(@NotNull Uri deepLink, @Nullable NavOptions navOptions) {
        AbstractC5830k.m5330g(deepLink, "deepLink");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions);
    }

    @MainThread
    public void navigate(@NotNull Uri deepLink, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        AbstractC5830k.m5330g(deepLink, "deepLink");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(deepLink, null, null), navOptions);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest request) {
        AbstractC5830k.m5330g(request, "request");
        this.impl.navigate$navigation_runtime_release(request);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest request, @Nullable NavOptions navOptions) {
        AbstractC5830k.m5330g(request, "request");
        this.impl.navigate$navigation_runtime_release(request, navOptions);
    }

    @MainThread
    public void navigate(@NotNull NavDeepLinkRequest request, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        AbstractC5830k.m5330g(request, "request");
        this.impl.navigate$navigation_runtime_release(request, navOptions, navigatorExtras);
    }

    @MainThread
    private final void navigate(NavDestination node, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        this.impl.navigate$navigation_runtime_release(node, args, navOptions, navigatorExtras);
    }

    @MainThread
    public void navigate(@NotNull NavDirections directions) {
        AbstractC5830k.m5330g(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null);
    }

    @MainThread
    public void navigate(@NotNull NavDirections directions, @Nullable NavOptions navOptions) {
        AbstractC5830k.m5330g(directions, "directions");
        navigate(directions.getActionId(), directions.getArguments(), navOptions);
    }

    @MainThread
    public void navigate(@NotNull NavDirections directions, @NotNull Navigator.Extras navigatorExtras) {
        AbstractC5830k.m5330g(directions, "directions");
        AbstractC5830k.m5330g(navigatorExtras, "navigatorExtras");
        navigate(directions.getActionId(), directions.getArguments(), (NavOptions) null, navigatorExtras);
    }

    @MainThread
    public final void navigate(@NotNull String route, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(builder, "builder");
        this.impl.navigate$navigation_runtime_release(route, builder);
    }

    @JvmOverloads
    @MainThread
    public final void navigate(@NotNull String route, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        AbstractC5830k.m5330g(route, "route");
        this.impl.navigate$navigation_runtime_release(route, navOptions, navigatorExtras);
    }

    @MainThread
    public final <T> void navigate(@NotNull T route, @NotNull InterfaceC6471c builder) {
        AbstractC5830k.m5330g(route, "route");
        AbstractC5830k.m5330g(builder, "builder");
        this.impl.navigate$navigation_runtime_release((NavControllerImpl) route, builder);
    }

    @JvmOverloads
    @MainThread
    public final <T> void navigate(@NotNull T route, @Nullable NavOptions navOptions, @Nullable Navigator.Extras navigatorExtras) {
        AbstractC5830k.m5330g(route, "route");
        this.impl.navigate$navigation_runtime_release((NavControllerImpl) route, navOptions, navigatorExtras);
    }

    @MainThread
    private final boolean handleDeepLink(int[] deepLink, Bundle[] args, boolean newTask) {
        NavDestination navDestinationFindNode;
        NavGraph navGraph;
        int i = 0;
        if (newTask) {
            if (!this.impl.getBackQueue().isEmpty()) {
                NavGraph navGraph2 = this.impl.get_graph();
                AbstractC5830k.m5327d(navGraph2);
                popBackStackInternal$default(this, navGraph2.getId(), true, false, 4, null);
            }
            while (i < deepLink.length) {
                int i8 = deepLink[i];
                int i9 = i + 1;
                Bundle bundle = args[i];
                NavDestination navDestinationFindDestination$default = findDestination$default(this, i8, null, 2, null);
                if (navDestinationFindDestination$default != null) {
                    navigate(navDestinationFindDestination$default, bundle, NavOptionsBuilderKt.navOptions(new C2856d(0, navDestinationFindDestination$default, this)), (Navigator.Extras) null);
                    i = i9;
                } else {
                    StringBuilder sbM100y = AbstractC0037f.m100y("Deep Linking failed: destination ", NavDestination.INSTANCE.getDisplayName(this.navContext, i8), " cannot be found from the current destination ");
                    sbM100y.append(getCurrentDestination());
                    throw new IllegalStateException(sbM100y.toString());
                }
            }
            this.deepLinkHandled = true;
            return true;
        }
        NavGraph navGraph3 = this.impl.get_graph();
        int length = deepLink.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = deepLink[i10];
            Bundle bundle2 = args[i10];
            if (i10 == 0) {
                navDestinationFindNode = this.impl.get_graph();
            } else {
                AbstractC5830k.m5327d(navGraph3);
                navDestinationFindNode = navGraph3.findNode(i11);
            }
            if (navDestinationFindNode != null) {
                if (i10 != deepLink.length - 1) {
                    if (navDestinationFindNode instanceof NavGraph) {
                        while (true) {
                            navGraph = (NavGraph) navDestinationFindNode;
                            AbstractC5830k.m5327d(navGraph);
                            if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                                break;
                            }
                            navDestinationFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                        }
                        navGraph3 = navGraph;
                    }
                } else {
                    NavOptions.Builder builder = new NavOptions.Builder();
                    NavGraph navGraph4 = this.impl.get_graph();
                    AbstractC5830k.m5327d(navGraph4);
                    navigate(navDestinationFindNode, bundle2, NavOptions.Builder.setPopUpTo$default(builder, navGraph4.getId(), true, false, 4, (Object) null).setEnterAnim(0).setExitAnim(0).build(), (Navigator.Extras) null);
                }
            } else {
                throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.INSTANCE.getDisplayName(this.navContext, i11) + " cannot be found in graph " + navGraph3);
            }
        }
        this.deepLinkHandled = true;
        return true;
    }
}
