package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class LiveLiteralKt {
    private static boolean isLiveLiteralsEnabled;
    private static final HashMap<String, MutableState<Object>> liveLiteralCache = new HashMap<>();

    @InternalComposeApi
    public static final void enableLiveLiterals() {
        isLiveLiteralsEnabled = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return isLiveLiteralsEnabled;
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static /* synthetic */ void isLiveLiteralsEnabled$annotations() {
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static final <T> State<T> liveLiteral(String str, T t10) {
        HashMap<String, MutableState<Object>> map = liveLiteralCache;
        MutableState<Object> mutableStateMutableStateOf$default = map.get(str);
        if (mutableStateMutableStateOf$default == null) {
            mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
            map.put(str, mutableStateMutableStateOf$default);
        }
        AbstractC9979u.m20292e(mutableStateMutableStateOf$default, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return mutableStateMutableStateOf$default;
    }

    @InternalComposeApi
    public static final void updateLiveLiteralValue(String str, Object obj) {
        boolean z10;
        HashMap<String, MutableState<Object>> map = liveLiteralCache;
        MutableState<Object> mutableStateMutableStateOf$default = map.get(str);
        if (mutableStateMutableStateOf$default == null) {
            mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            map.put(str, mutableStateMutableStateOf$default);
            z10 = false;
        } else {
            z10 = true;
        }
        MutableState<Object> mutableState = mutableStateMutableStateOf$default;
        if (z10) {
            mutableState.setValue(obj);
        }
    }
}
