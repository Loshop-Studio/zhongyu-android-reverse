package com.zykj.blackboard.core.edit;

import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.listener.ErrorListener;
import com.zykj.blackboard.listener.PageListener;
import java.util.List;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes4.dex */
public interface IBoardControl {

    public static final class DefaultImpls {
        public static /* synthetic */ IPageControl createPage$default(IBoardControl iBoardControl, boolean z10, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPage");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            if ((i10 & 2) != 0) {
                interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.blackboard.core.edit.IBoardControl.createPage.1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27439invoke() {
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27439invoke();
                        return C8736p.f16368a;
                    }
                };
            }
            return iBoardControl.createPage(z10, interfaceC10559a);
        }

        public static /* synthetic */ boolean currentPage$default(IBoardControl iBoardControl, int i10, InterfaceC10559a interfaceC10559a, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: currentPage");
            }
            if ((i11 & 2) != 0) {
                interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.blackboard.core.edit.IBoardControl.currentPage.1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27440invoke() {
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27440invoke();
                        return C8736p.f16368a;
                    }
                };
            }
            return iBoardControl.currentPage(i10, interfaceC10559a);
        }

        public static /* synthetic */ void deletePage$default(IBoardControl iBoardControl, int i10, InterfaceC10559a interfaceC10559a, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePage");
            }
            if ((i11 & 2) != 0) {
                interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.blackboard.core.edit.IBoardControl.deletePage.1
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27441invoke() {
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27441invoke();
                        return C8736p.f16368a;
                    }
                };
            }
            iBoardControl.deletePage(i10, interfaceC10559a);
        }

        public static /* synthetic */ void save$default(IBoardControl iBoardControl, boolean z10, boolean z11, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: save");
            }
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            if ((i10 & 2) != 0) {
                z11 = false;
            }
            iBoardControl.save(z10, z11, interfaceC10570l, interfaceC10570l2);
        }
    }

    IPageControl createPage(boolean z10, InterfaceC10559a interfaceC10559a);

    boolean currentPage(int i10, InterfaceC10559a interfaceC10559a);

    void deletePage(int i10, InterfaceC10559a interfaceC10559a);

    void drop(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2);

    String getBoardDirPath();

    BoardConfig getConfig();

    IPageControl getCurrentPage();

    int getCurrentPageIndex();

    PageListener getPageListener();

    List<IPageControl> getPages();

    void loadDir(String str, InterfaceC10574p interfaceC10574p, InterfaceC10570l interfaceC10570l);

    void save(boolean z10, boolean z11, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2);

    void setErrorListener(ErrorListener errorListener);

    void setPageListener(PageListener pageListener);
}
