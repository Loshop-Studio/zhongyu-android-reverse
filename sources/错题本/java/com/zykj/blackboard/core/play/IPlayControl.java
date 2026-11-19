package com.zykj.blackboard.core.play;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.listener.PageListener;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001JE\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H&¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m5110d2 = {"Lcom/zykj/blackboard/core/play/IPlayControl;", "", "", "path", "Lkotlin/Function1;", "", "Lcom/zykj/blackboard/core/play/IPlayPageControl;", "Ld6/s;", "successCallBack", "", "failCallBack", "loadPath", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "Lcom/zykj/blackboard/listener/PageListener;", "pageListener", "setPageListener", "(Lcom/zykj/blackboard/listener/PageListener;)V", "", "pageIndex", "Lkotlin/Function0;", "callback", "onError", "", "switchCurrentPlayPage", "(ILr6/a;Lr6/a;)Z", "getPlayPageControlList", "()Ljava/util/List;", "getCurrentPlayPageControl", "()Lcom/zykj/blackboard/core/play/IPlayPageControl;", "getCurrentPlayPageIndex", "()I", "getRootPath", "()Ljava/lang/String;", "release", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IPlayControl {
    @Nullable
    IPlayPageControl getCurrentPlayPageControl();

    /* renamed from: getCurrentPlayPageIndex */
    int getCurrentPageIndex();

    @NotNull
    List<IPlayPageControl> getPlayPageControlList();

    @NotNull
    String getRootPath();

    void loadPath(@NotNull String path, @NotNull InterfaceC6471c successCallBack, @NotNull InterfaceC6471c failCallBack);

    void release();

    void setPageListener(@NotNull PageListener pageListener);

    boolean switchCurrentPlayPage(int pageIndex, @NotNull InterfaceC6469a callback, @NotNull InterfaceC6469a onError);
}
