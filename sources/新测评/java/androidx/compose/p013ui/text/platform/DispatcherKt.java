package androidx.compose.p013ui.text.platform;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13558d2 = {"FontCacheManagementDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getFontCacheManagementDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class DispatcherKt {
    private static final CoroutineDispatcher FontCacheManagementDispatcher = Dispatchers.getMain();

    public static final CoroutineDispatcher getFontCacheManagementDispatcher() {
        return FontCacheManagementDispatcher;
    }
}
