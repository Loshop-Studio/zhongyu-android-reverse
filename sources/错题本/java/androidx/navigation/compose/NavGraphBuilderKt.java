package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;
import p152r6.InterfaceC6475g;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

@Metadata(m5109d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aT\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0087\u0002\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\r\u0010\u001a\u001a¯\u0002\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0012¢\u0006\u0004\b\r\u0010\u001d\u001aÇ\u0002\u0010\r\u001a\u00020\n\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\n\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122$\b\b\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0012H\u0086\b¢\u0006\u0004\b\r\u0010$\u001aÎ\u0002\u0010\r\u001a\u00020\n\"\b\b\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0002\b\u000b¢\u0006\u0002\b\u0012¢\u0006\u0004\b\r\u0010&\u001a\\\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b)\u0010*\u001að\u0001\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032#\b\u0002\u0010\u0013\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u00122#\b\u0002\u0010\u0015\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u00122#\b\u0002\u0010\u0016\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u00122#\b\u0002\u0010\u0017\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u00122\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b)\u0010+\u001a¬\u0002\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\b¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u00122\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012¢\u0006\u0004\b)\u0010,\u001aÈ\u0002\u0010)\u001a\u00020\n\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\n\u0010'\u001a\u0006\u0012\u0002\b\u00030%2\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\n\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\u0019\b\b\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012H\u0086\b¢\u0006\u0004\b)\u0010-\u001aÏ\u0002\u0010)\u001a\u00020\n\"\b\b\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\n\u0010'\u001a\u0006\u0012\u0002\b\u00030%2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012¢\u0006\u0004\b)\u0010.\u001aÄ\u0002\u0010)\u001a\u00020\n\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\u0006\u0010'\u001a\u00020\u001e2\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\n\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\n\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\u0019\b\b\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012H\u0086\b¢\u0006\u0004\b)\u0010/\u001aË\u0002\u0010)\u001a\u00020\n\"\b\b\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\u0006\u0010'\u001a\u00020\u001e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032(\b\u0002\u0010\u0013\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0015\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u0017\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b¢\u0006\u0002\b\u0011\u0018\u00010\b¢\u0006\u0002\b\u00122\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u0012¢\u0006\u0004\b)\u00100\u001a\\\u00103\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u00102\u001a\u0002012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b3\u00104\u001at\u00103\u001a\u00020\n\"\n\b\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u00102\u001a\u0002012\u0019\b\b\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\b¢\u0006\u0004\b3\u00105\u001a{\u00103\u001a\u00020\n\"\b\b\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u001d\b\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\b\u00030\"¢\u0006\u0002\b\u00110 2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u00102\u001a\u0002012\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b3\u00106¨\u00067"}, m5110d2 = {"Landroidx/navigation/NavGraphBuilder;", "", "route", "", "Landroidx/navigation/NamedNavArgument;", "arguments", "Landroidx/navigation/NavDeepLink;", "deepLinks", "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", ComposeNavigator.NAME, "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/f;)V", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "enterTransition", "Landroidx/compose/animation/ExitTransition;", "exitTransition", "popEnterTransition", "popExitTransition", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Ly6/q;", "Landroidx/navigation/NavType;", "typeMap", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V", "Ly6/c;", "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V", "startDestination", "builder", "navigation", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V", "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V", "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V", "Landroidx/compose/ui/window/DialogProperties;", "dialogProperties", DialogNavigator.NAME, "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V", "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V", "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V", "navigation-compose_release"}, m5111k = 2, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,736:1\n115#2:737\n115#2:742\n115#2:747\n115#2:752\n115#2:763\n115#2:768\n1863#3,2:738\n1863#3,2:740\n1863#3,2:743\n1863#3,2:745\n1863#3,2:748\n1863#3,2:750\n1863#3,2:753\n1863#3,2:755\n1863#3,2:757\n1863#3,2:759\n1863#3,2:761\n1863#3,2:764\n1863#3,2:766\n1863#3,2:770\n1#4:769\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n*L\n56#1:737\n106#1:742\n158#1:747\n265#1:752\n669#1:763\n727#1:768\n59#1:738,2\n62#1:740,2\n108#1:743,2\n109#1:745,2\n160#1:748,2\n161#1:750,2\n271#1:753,2\n400#1:755,2\n401#1:757,2\n518#1:759,2\n635#1:761,2\n675#1:764,2\n676#1:766,2\n733#1:770,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavGraphBuilderKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of composable builder that supports AnimatedContent")
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, final InterfaceC6474f interfaceC6474f) {
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), (InterfaceC6475g) ComposableLambdaKt.composableLambdaInstance(-1516831465, true, new InterfaceC6475g() { // from class: androidx.navigation.compose.NavGraphBuilderKt.composable.1
            @Override // p152r6.InterfaceC6475g
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return C5443s.f8405a;
            }

            @Composable
            public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1516831465, i, -1, "androidx.navigation.compose.composable.<anonymous> (NavGraphBuilder.kt:55)");
                }
                interfaceC6474f.invoke(navBackStackEntry, composer, Integer.valueOf((i >> 3) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        destination.setRoute(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            destination.addArgument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            destination.addDeepLink((NavDeepLink) it2.next());
        }
        navGraphBuilder.addDestination(destination);
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = EmptyList.INSTANCE;
        }
        List list4 = list2;
        InterfaceC6471c interfaceC6471c6 = (i & 8) != 0 ? null : interfaceC6471c;
        InterfaceC6471c interfaceC6471c7 = (i & 16) != 0 ? null : interfaceC6471c2;
        composable(navGraphBuilder, str, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list4, interfaceC6471c6, interfaceC6471c7, (i & 32) != 0 ? interfaceC6471c6 : interfaceC6471c3, (i & 64) != 0 ? interfaceC6471c7 : interfaceC6471c4, (i & 128) != 0 ? null : interfaceC6471c5, interfaceC6475g);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void dialog(NavGraphBuilder navGraphBuilder, Map<InterfaceC6793q, NavType<?>> map, List<NavDeepLink> list, DialogProperties dialogProperties, InterfaceC6474f interfaceC6474f) {
        AbstractC5830k.m5338o();
        throw null;
    }

    public static void dialog$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, DialogProperties dialogProperties, InterfaceC6474f interfaceC6474f, int i, Object obj) {
        if ((i & 2) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = EmptyList.INSTANCE;
        }
        dialog(navGraphBuilder, str, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list2, (i & 8) != 0 ? new DialogProperties(false, false, false, 7, (AbstractC5824e) null) : dialogProperties, interfaceC6474f);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, Object obj, Map<InterfaceC6793q, NavType<?>> map, List<NavDeepLink> list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6) {
        AbstractC5830k.m5338o();
        throw null;
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 4) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = EmptyList.INSTANCE;
        }
        navigation(navGraphBuilder, str, str2, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list2, (InterfaceC6471c) null, (InterfaceC6471c) null, (InterfaceC6471c) null, (InterfaceC6471c) null, (InterfaceC6471c) null, interfaceC6471c);
    }

    public static final void dialog(@NotNull NavGraphBuilder navGraphBuilder, @NotNull String str, @NotNull List<NamedNavArgument> list, @NotNull List<NavDeepLink> list2, @NotNull DialogProperties dialogProperties, @NotNull InterfaceC6474f interfaceC6474f) {
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), str, dialogProperties, interfaceC6474f);
        for (NamedNavArgument namedNavArgument : list) {
            dialogNavigatorDestinationBuilder.argument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            dialogNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.destination(dialogNavigatorDestinationBuilder);
    }

    public static final <T> void navigation(NavGraphBuilder navGraphBuilder, InterfaceC6779c interfaceC6779c, Map<InterfaceC6793q, NavType<?>> map, List<NavDeepLink> list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6) {
        AbstractC5830k.m5338o();
        throw null;
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = EmptyList.INSTANCE;
        }
        List list4 = list2;
        InterfaceC6471c interfaceC6471c5 = (i & 8) != 0 ? null : interfaceC6471c;
        InterfaceC6471c interfaceC6471c6 = (i & 16) != 0 ? null : interfaceC6471c2;
        composable(navGraphBuilder, str, list3, list4, interfaceC6471c5, interfaceC6471c6, (i & 32) != 0 ? interfaceC6471c5 : interfaceC6471c3, (i & 64) != 0 ? interfaceC6471c6 : interfaceC6471c4, interfaceC6475g);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, int i, Object obj) {
        if ((i & 4) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list3 = list;
        List list4 = (i & 8) != 0 ? EmptyList.INSTANCE : list2;
        InterfaceC6471c interfaceC6471c6 = (i & 16) != 0 ? null : interfaceC6471c;
        InterfaceC6471c interfaceC6471c7 = (i & 32) != 0 ? null : interfaceC6471c2;
        navigation(navGraphBuilder, str, str2, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list4, interfaceC6471c6, interfaceC6471c7, (i & 64) != 0 ? interfaceC6471c6 : interfaceC6471c3, (i & 128) != 0 ? interfaceC6471c7 : interfaceC6471c4, (InterfaceC6471c) null, interfaceC6471c5);
    }

    public static void dialog$default(NavGraphBuilder navGraphBuilder, Map map, List list, DialogProperties dialogProperties, InterfaceC6474f interfaceC6474f, int i, Object obj) {
        if ((i & 1) != 0) {
            AbstractC5785e0.m5147A();
        }
        if ((i & 2) != 0) {
            EmptyList emptyList = EmptyList.INSTANCE;
        }
        if ((i & 4) != 0) {
            new DialogProperties(false, false, false, 7, (AbstractC5824e) null);
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    public static final void navigation(@NotNull NavGraphBuilder navGraphBuilder, @NotNull String str, @NotNull String str2, @NotNull List<NamedNavArgument> list, @NotNull List<NavDeepLink> list2, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, @Nullable InterfaceC6471c interfaceC6471c4, @Nullable InterfaceC6471c interfaceC6471c5, @NotNull InterfaceC6471c interfaceC6471c6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        interfaceC6471c6.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        for (NamedNavArgument namedNavArgument : list) {
            navGraphBuild.addArgument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(interfaceC6471c);
            composeNavGraph.setExitTransition$navigation_compose_release(interfaceC6471c2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(interfaceC6471c3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(interfaceC6471c4);
            composeNavGraph.setSizeTransform$navigation_compose_release(interfaceC6471c5);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC6474f interfaceC6474f, int i, Object obj) {
        if ((i & 2) != 0) {
            list = EmptyList.INSTANCE;
        }
        if ((i & 4) != 0) {
            list2 = EmptyList.INSTANCE;
        }
        composable(navGraphBuilder, str, list, list2, interfaceC6474f);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, Object obj) {
        InterfaceC6471c interfaceC6471c7;
        NavGraphBuilder navGraphBuilder2;
        String str3;
        String str4;
        InterfaceC6471c interfaceC6471c8;
        List list3 = (i & 4) != 0 ? EmptyList.INSTANCE : list;
        List list4 = (i & 8) != 0 ? EmptyList.INSTANCE : list2;
        InterfaceC6471c interfaceC6471c9 = (i & 16) != 0 ? null : interfaceC6471c;
        InterfaceC6471c interfaceC6471c10 = (i & 32) != 0 ? null : interfaceC6471c2;
        InterfaceC6471c interfaceC6471c11 = (i & 64) != 0 ? interfaceC6471c9 : interfaceC6471c3;
        InterfaceC6471c interfaceC6471c12 = (i & 128) != 0 ? interfaceC6471c10 : interfaceC6471c4;
        if ((i & 256) != 0) {
            interfaceC6471c7 = null;
            str3 = str;
            str4 = str2;
            interfaceC6471c8 = interfaceC6471c6;
            navGraphBuilder2 = navGraphBuilder;
        } else {
            interfaceC6471c7 = interfaceC6471c5;
            navGraphBuilder2 = navGraphBuilder;
            str3 = str;
            str4 = str2;
            interfaceC6471c8 = interfaceC6471c6;
        }
        navigation(navGraphBuilder2, str3, str4, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list4, interfaceC6471c9, interfaceC6471c10, interfaceC6471c11, interfaceC6471c12, interfaceC6471c7, interfaceC6471c8);
    }

    public static void dialog$default(NavGraphBuilder navGraphBuilder, InterfaceC6779c interfaceC6779c, Map map, List list, DialogProperties dialogProperties, InterfaceC6474f interfaceC6474f, int i, Object obj) {
        if ((i & 2) != 0) {
            map = AbstractC5785e0.m5147A();
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            list = EmptyList.INSTANCE;
        }
        dialog(navGraphBuilder, interfaceC6779c, (Map<InterfaceC6793q, NavType<?>>) map2, (List<NavDeepLink>) list, (i & 8) != 0 ? new DialogProperties(false, false, false, 7, (AbstractC5824e) null) : dialogProperties, interfaceC6474f);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of composable builder that supports sizeTransform")
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6475g interfaceC6475g) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), str, interfaceC6475g);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            composeNavigatorDestinationBuilder.argument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it2.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(interfaceC6471c);
        composeNavigatorDestinationBuilder.setExitTransition(interfaceC6471c2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(interfaceC6471c3);
        composeNavigatorDestinationBuilder.setPopExitTransition(interfaceC6471c4);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder, Map map, List list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 1) != 0) {
            AbstractC5785e0.m5147A();
        }
        if ((i & 2) != 0) {
            EmptyList emptyList = EmptyList.INSTANCE;
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC6779c interfaceC6779c, Map map, List list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, Object obj) {
        if ((i & 2) != 0) {
            AbstractC5785e0.m5147A();
        }
        if ((i & 4) != 0) {
            EmptyList emptyList = EmptyList.INSTANCE;
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    public static final <T> void dialog(@NotNull NavGraphBuilder navGraphBuilder, @NotNull InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull List<NavDeepLink> list, @NotNull DialogProperties dialogProperties, @NotNull InterfaceC6474f interfaceC6474f) {
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), interfaceC6779c, map, dialogProperties, interfaceC6474f);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            dialogNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.destination(dialogNavigatorDestinationBuilder);
    }

    public static void composable$default(NavGraphBuilder navGraphBuilder, InterfaceC6779c interfaceC6779c, Map map, List list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6475g interfaceC6475g, int i, Object obj) {
        if ((i & 2) != 0) {
            map = AbstractC5785e0.m5147A();
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            list = EmptyList.INSTANCE;
        }
        List list2 = list;
        InterfaceC6471c interfaceC6471c6 = (i & 8) != 0 ? null : interfaceC6471c;
        InterfaceC6471c interfaceC6471c7 = (i & 16) != 0 ? null : interfaceC6471c2;
        composable(navGraphBuilder, interfaceC6779c, (Map<InterfaceC6793q, NavType<?>>) map2, (List<NavDeepLink>) list2, interfaceC6471c6, interfaceC6471c7, (i & 32) != 0 ? interfaceC6471c6 : interfaceC6471c3, (i & 64) != 0 ? interfaceC6471c7 : interfaceC6471c4, (i & 128) != 0 ? null : interfaceC6471c5, interfaceC6475g);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder, InterfaceC6779c interfaceC6779c, InterfaceC6779c interfaceC6779c2, Map map, List list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, Object obj) {
        InterfaceC6471c interfaceC6471c7;
        NavGraphBuilder navGraphBuilder2;
        InterfaceC6779c interfaceC6779c3;
        InterfaceC6779c interfaceC6779c4;
        InterfaceC6471c interfaceC6471c8;
        Map mapM5147A = (i & 4) != 0 ? AbstractC5785e0.m5147A() : map;
        List list2 = (i & 8) != 0 ? EmptyList.INSTANCE : list;
        InterfaceC6471c interfaceC6471c9 = (i & 16) != 0 ? null : interfaceC6471c;
        InterfaceC6471c interfaceC6471c10 = (i & 32) != 0 ? null : interfaceC6471c2;
        InterfaceC6471c interfaceC6471c11 = (i & 64) != 0 ? interfaceC6471c9 : interfaceC6471c3;
        InterfaceC6471c interfaceC6471c12 = (i & 128) != 0 ? interfaceC6471c10 : interfaceC6471c4;
        if ((i & 256) != 0) {
            interfaceC6471c7 = null;
            interfaceC6779c3 = interfaceC6779c;
            interfaceC6779c4 = interfaceC6779c2;
            interfaceC6471c8 = interfaceC6471c6;
            navGraphBuilder2 = navGraphBuilder;
        } else {
            interfaceC6471c7 = interfaceC6471c5;
            navGraphBuilder2 = navGraphBuilder;
            interfaceC6779c3 = interfaceC6779c;
            interfaceC6779c4 = interfaceC6779c2;
            interfaceC6471c8 = interfaceC6471c6;
        }
        navigation(navGraphBuilder2, interfaceC6779c3, interfaceC6779c4, (Map<InterfaceC6793q, NavType<?>>) mapM5147A, (List<NavDeepLink>) list2, interfaceC6471c9, interfaceC6471c10, interfaceC6471c11, interfaceC6471c12, interfaceC6471c7, interfaceC6471c8);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder, Object obj, Map map, List list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, Object obj2) {
        if ((i & 2) != 0) {
            AbstractC5785e0.m5147A();
        }
        if ((i & 4) != 0) {
            EmptyList emptyList = EmptyList.INSTANCE;
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    public static final <T> void navigation(@NotNull NavGraphBuilder navGraphBuilder, @NotNull InterfaceC6779c interfaceC6779c, @NotNull InterfaceC6779c interfaceC6779c2, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull List<NavDeepLink> list, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, @Nullable InterfaceC6471c interfaceC6471c4, @Nullable InterfaceC6471c interfaceC6471c5, @NotNull InterfaceC6471c interfaceC6471c6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), interfaceC6779c, interfaceC6779c2, map);
        interfaceC6471c6.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(interfaceC6471c);
            composeNavGraph.setExitTransition$navigation_compose_release(interfaceC6471c2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(interfaceC6471c3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(interfaceC6471c4);
            composeNavGraph.setSizeTransform$navigation_compose_release(interfaceC6471c5);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    public static void navigation$default(NavGraphBuilder navGraphBuilder, Object obj, InterfaceC6779c interfaceC6779c, Map map, List list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, Object obj2) {
        InterfaceC6471c interfaceC6471c7;
        NavGraphBuilder navGraphBuilder2;
        Object obj3;
        InterfaceC6779c interfaceC6779c2;
        InterfaceC6471c interfaceC6471c8;
        Map mapM5147A = (i & 4) != 0 ? AbstractC5785e0.m5147A() : map;
        List list2 = (i & 8) != 0 ? EmptyList.INSTANCE : list;
        InterfaceC6471c interfaceC6471c9 = (i & 16) != 0 ? null : interfaceC6471c;
        InterfaceC6471c interfaceC6471c10 = (i & 32) != 0 ? null : interfaceC6471c2;
        InterfaceC6471c interfaceC6471c11 = (i & 64) != 0 ? interfaceC6471c9 : interfaceC6471c3;
        InterfaceC6471c interfaceC6471c12 = (i & 128) != 0 ? interfaceC6471c10 : interfaceC6471c4;
        if ((i & 256) != 0) {
            interfaceC6471c7 = null;
            obj3 = obj;
            interfaceC6779c2 = interfaceC6779c;
            interfaceC6471c8 = interfaceC6471c6;
            navGraphBuilder2 = navGraphBuilder;
        } else {
            interfaceC6471c7 = interfaceC6471c5;
            navGraphBuilder2 = navGraphBuilder;
            obj3 = obj;
            interfaceC6779c2 = interfaceC6779c;
            interfaceC6471c8 = interfaceC6471c6;
        }
        navigation(navGraphBuilder2, obj3, interfaceC6779c2, (Map<InterfaceC6793q, NavType<?>>) mapM5147A, (List<NavDeepLink>) list2, interfaceC6471c9, interfaceC6471c10, interfaceC6471c11, interfaceC6471c12, interfaceC6471c7, interfaceC6471c8);
    }

    public static final void composable(@NotNull NavGraphBuilder navGraphBuilder, @NotNull String str, @NotNull List<NamedNavArgument> list, @NotNull List<NavDeepLink> list2, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, @Nullable InterfaceC6471c interfaceC6471c4, @Nullable InterfaceC6471c interfaceC6471c5, @NotNull InterfaceC6475g interfaceC6475g) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), str, interfaceC6475g);
        for (NamedNavArgument namedNavArgument : list) {
            composeNavigatorDestinationBuilder.argument(namedNavArgument.getName(), namedNavArgument.getArgument());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(interfaceC6471c);
        composeNavigatorDestinationBuilder.setExitTransition(interfaceC6471c2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(interfaceC6471c3);
        composeNavigatorDestinationBuilder.setPopExitTransition(interfaceC6471c4);
        composeNavigatorDestinationBuilder.setSizeTransform(interfaceC6471c5);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    public static final <T> void navigation(@NotNull NavGraphBuilder navGraphBuilder, @NotNull Object obj, @NotNull InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull List<NavDeepLink> list, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, @Nullable InterfaceC6471c interfaceC6471c4, @Nullable InterfaceC6471c interfaceC6471c5, @NotNull InterfaceC6471c interfaceC6471c6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), obj, interfaceC6779c, map);
        interfaceC6471c6.invoke(navGraphBuilder2);
        NavGraph navGraphBuild = navGraphBuilder2.build();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            navGraphBuild.addDeepLink((NavDeepLink) it.next());
        }
        if (navGraphBuild instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) navGraphBuild;
            composeNavGraph.setEnterTransition$navigation_compose_release(interfaceC6471c);
            composeNavGraph.setExitTransition$navigation_compose_release(interfaceC6471c2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(interfaceC6471c3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(interfaceC6471c4);
            composeNavGraph.setSizeTransform$navigation_compose_release(interfaceC6471c5);
        }
        navGraphBuilder.addDestination(navGraphBuild);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void composable(NavGraphBuilder navGraphBuilder, Map<InterfaceC6793q, NavType<?>> map, List<NavDeepLink> list, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6475g interfaceC6475g) {
        AbstractC5830k.m5338o();
        throw null;
    }

    public static final <T> void composable(@NotNull NavGraphBuilder navGraphBuilder, @NotNull InterfaceC6779c interfaceC6779c, @NotNull Map<InterfaceC6793q, NavType<?>> map, @NotNull List<NavDeepLink> list, @Nullable InterfaceC6471c interfaceC6471c, @Nullable InterfaceC6471c interfaceC6471c2, @Nullable InterfaceC6471c interfaceC6471c3, @Nullable InterfaceC6471c interfaceC6471c4, @Nullable InterfaceC6471c interfaceC6471c5, @NotNull InterfaceC6475g interfaceC6475g) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), interfaceC6779c, map, interfaceC6475g);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(interfaceC6471c);
        composeNavigatorDestinationBuilder.setExitTransition(interfaceC6471c2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(interfaceC6471c3);
        composeNavigatorDestinationBuilder.setPopExitTransition(interfaceC6471c4);
        composeNavigatorDestinationBuilder.setSizeTransform(interfaceC6471c5);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }
}
