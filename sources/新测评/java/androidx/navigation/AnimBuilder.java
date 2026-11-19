package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0013"}, m13558d2 = {"Landroidx/navigation/AnimBuilder;", "", "<init>", "()V", "enter", "", "getEnter", "()I", "setEnter", "(I)V", "exit", "getExit", "setExit", "popEnter", "getPopEnter", "setPopEnter", "popExit", "getPopExit", "setPopExit", "navigation-common_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@NavOptionsDsl
/* loaded from: classes3.dex */
public final class AnimBuilder {

    @AnimRes
    @AnimatorRes
    private int enter = -1;

    @AnimRes
    @AnimatorRes
    private int exit = -1;

    @AnimRes
    @AnimatorRes
    private int popEnter = -1;

    @AnimRes
    @AnimatorRes
    private int popExit = -1;

    public final int getEnter() {
        return this.enter;
    }

    public final int getExit() {
        return this.exit;
    }

    public final int getPopEnter() {
        return this.popEnter;
    }

    public final int getPopExit() {
        return this.popExit;
    }

    public final void setEnter(int i10) {
        this.enter = i10;
    }

    public final void setExit(int i10) {
        this.exit = i10;
    }

    public final void setPopEnter(int i10) {
        this.popEnter = i10;
    }

    public final void setPopExit(int i10) {
        this.popExit = i10;
    }
}
