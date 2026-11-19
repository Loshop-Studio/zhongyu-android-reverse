package com.zykj.blackboard.core.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.listener.ErrorListener;
import com.zykj.blackboard.listener.PageListener;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H&¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u00132\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190 H&¢\u0006\u0004\b!\u0010\"JK\u0010)\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\u00132\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n0%H&¢\u0006\u0004\b)\u0010*J7\u0010+\u001a\u00020\n2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n0%H&¢\u0006\u0004\b+\u0010,JE\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00022\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0.2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n0%H&¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000102H&¢\u0006\u0004\b4\u00105¨\u00066"}, m5110d2 = {"Lcom/zykj/blackboard/core/edit/IBoardControl;", "", "", "getBoardDirPath", "()Ljava/lang/String;", "Lcom/zykj/blackboard/bean/BoardConfig;", "getConfig", "()Lcom/zykj/blackboard/bean/BoardConfig;", "Lcom/zykj/blackboard/listener/PageListener;", "pageListener", "Ld6/s;", "setPageListener", "(Lcom/zykj/blackboard/listener/PageListener;)V", "getPageListener", "()Lcom/zykj/blackboard/listener/PageListener;", "", "pageIndex", "Lkotlin/Function0;", "renderCallback", "", "currentPage", "(ILr6/a;)Z", "deletePage", "(ILr6/a;)V", "isSwitch", "Lcom/zykj/blackboard/core/edit/IPageControl;", "createPage", "(ZLr6/a;)Lcom/zykj/blackboard/core/edit/IPageControl;", "getCurrentPage", "()Lcom/zykj/blackboard/core/edit/IPageControl;", "getCurrentPageIndex", "()I", "", "getPages", "()Ljava/util/List;", "needClear", "isContentThumbnail", "Lkotlin/Function1;", "callback", "", "error", "save", "(ZZLr6/c;Lr6/c;)V", "drop", "(Lr6/c;Lr6/c;)V", "dirPath", "Lkotlin/Function2;", "", "loadDir", "(Ljava/lang/String;Lr6/e;Lr6/c;)V", "Lcom/zykj/blackboard/listener/ErrorListener;", "errorListener", "setErrorListener", "(Lcom/zykj/blackboard/listener/ErrorListener;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IBoardControl {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ IPageControl createPage$default(IBoardControl iBoardControl, boolean z8, InterfaceC6469a interfaceC6469a, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPage");
            }
            if ((i & 1) != 0) {
                z8 = true;
            }
            if ((i & 2) != 0) {
                interfaceC6469a = new InterfaceC6469a() { // from class: com.zykj.blackboard.core.edit.IBoardControl.createPage.1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13770invoke() {
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13770invoke();
                        return C5443s.f8405a;
                    }
                };
            }
            return iBoardControl.createPage(z8, interfaceC6469a);
        }

        public static /* synthetic */ boolean currentPage$default(IBoardControl iBoardControl, int i, InterfaceC6469a interfaceC6469a, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: currentPage");
            }
            if ((i8 & 2) != 0) {
                interfaceC6469a = new InterfaceC6469a() { // from class: com.zykj.blackboard.core.edit.IBoardControl.currentPage.1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13771invoke() {
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13771invoke();
                        return C5443s.f8405a;
                    }
                };
            }
            return iBoardControl.currentPage(i, interfaceC6469a);
        }

        public static /* synthetic */ void deletePage$default(IBoardControl iBoardControl, int i, InterfaceC6469a interfaceC6469a, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePage");
            }
            if ((i8 & 2) != 0) {
                interfaceC6469a = new InterfaceC6469a() { // from class: com.zykj.blackboard.core.edit.IBoardControl.deletePage.1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13772invoke() {
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13772invoke();
                        return C5443s.f8405a;
                    }
                };
            }
            iBoardControl.deletePage(i, interfaceC6469a);
        }

        public static /* synthetic */ void save$default(IBoardControl iBoardControl, boolean z8, boolean z9, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
            }
            if ((i & 1) != 0) {
                z8 = true;
            }
            if ((i & 2) != 0) {
                z9 = false;
            }
            iBoardControl.save(z8, z9, interfaceC6471c, interfaceC6471c2);
        }
    }

    @NotNull
    IPageControl createPage(boolean isSwitch, @NotNull InterfaceC6469a renderCallback);

    boolean currentPage(int pageIndex, @NotNull InterfaceC6469a renderCallback);

    void deletePage(int pageIndex, @NotNull InterfaceC6469a renderCallback);

    void drop(@NotNull InterfaceC6471c callback, @NotNull InterfaceC6471c error);

    @NotNull
    String getBoardDirPath();

    @NotNull
    /* renamed from: getConfig */
    BoardConfig getBoardConfig();

    @Nullable
    IPageControl getCurrentPage();

    int getCurrentPageIndex();

    @Nullable
    PageListener getPageListener();

    @NotNull
    List<IPageControl> getPages();

    void loadDir(@NotNull String dirPath, @NotNull InterfaceC6473e callback, @NotNull InterfaceC6471c error);

    void save(boolean needClear, boolean isContentThumbnail, @NotNull InterfaceC6471c callback, @NotNull InterfaceC6471c error);

    void setErrorListener(@Nullable ErrorListener errorListener);

    void setPageListener(@NotNull PageListener pageListener);
}
