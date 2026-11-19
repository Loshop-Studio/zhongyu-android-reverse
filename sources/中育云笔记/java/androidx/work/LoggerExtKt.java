package androidx.work;

import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes3.dex */
public final class LoggerExtKt {
    public static final void logd(String tag, InterfaceC9529a block) {
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(block, "block");
        Logger.get().debug(tag, (String) block.invoke());
    }

    public static final void loge(String tag, InterfaceC9529a block) {
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(block, "block");
        Logger.get().error(tag, (String) block.invoke());
    }

    public static final void logi(String tag, InterfaceC9529a block) {
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(block, "block");
        Logger.get().info(tag, (String) block.invoke());
    }

    public static final void logd(String tag, Throwable t10, InterfaceC9529a block) {
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(t10, "t");
        AbstractC9979u.m20294g(block, "block");
        Logger.get().debug(tag, (String) block.invoke(), t10);
    }

    public static final void loge(String tag, Throwable t10, InterfaceC9529a block) {
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(t10, "t");
        AbstractC9979u.m20294g(block, "block");
        Logger.get().error(tag, (String) block.invoke(), t10);
    }

    public static final void logi(String tag, Throwable t10, InterfaceC9529a block) {
        AbstractC9979u.m20294g(tag, "tag");
        AbstractC9979u.m20294g(t10, "t");
        AbstractC9979u.m20294g(block, "block");
        Logger.get().info(tag, (String) block.invoke(), t10);
    }
}
