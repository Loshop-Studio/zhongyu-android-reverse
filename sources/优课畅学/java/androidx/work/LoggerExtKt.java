package androidx.work;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes3.dex */
public final class LoggerExtKt {
    public static final void logd(String tag, InterfaceC10559a block) {
        AbstractC9133u.m16133g(tag, "tag");
        AbstractC9133u.m16133g(block, "block");
        Logger.get().debug(tag, (String) block.invoke());
    }

    public static final void loge(String tag, InterfaceC10559a block) {
        AbstractC9133u.m16133g(tag, "tag");
        AbstractC9133u.m16133g(block, "block");
        Logger.get().error(tag, (String) block.invoke());
    }

    public static final void logi(String tag, InterfaceC10559a block) {
        AbstractC9133u.m16133g(tag, "tag");
        AbstractC9133u.m16133g(block, "block");
        Logger.get().info(tag, (String) block.invoke());
    }

    public static final void logd(String tag, Throwable t10, InterfaceC10559a block) {
        AbstractC9133u.m16133g(tag, "tag");
        AbstractC9133u.m16133g(t10, "t");
        AbstractC9133u.m16133g(block, "block");
        Logger.get().debug(tag, (String) block.invoke(), t10);
    }

    public static final void loge(String tag, Throwable t10, InterfaceC10559a block) {
        AbstractC9133u.m16133g(tag, "tag");
        AbstractC9133u.m16133g(t10, "t");
        AbstractC9133u.m16133g(block, "block");
        Logger.get().error(tag, (String) block.invoke(), t10);
    }

    public static final void logi(String tag, Throwable t10, InterfaceC10559a block) {
        AbstractC9133u.m16133g(tag, "tag");
        AbstractC9133u.m16133g(t10, "t");
        AbstractC9133u.m16133g(block, "block");
        Logger.get().info(tag, (String) block.invoke(), t10);
    }
}
