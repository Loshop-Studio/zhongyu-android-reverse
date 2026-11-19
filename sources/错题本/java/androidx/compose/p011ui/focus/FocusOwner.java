package androidx.compose.p011ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableObjectList;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.input.rotary.RotaryScrollEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b`\u0018\u00002\u00020\u0001J&\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH&ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010%\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!H&ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH&ø\u0001\u0000¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!H&¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\fH&¢\u0006\u0004\b.\u0010/J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u000200H&¢\u0006\u0004\b.\u00101J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u000202H&¢\u0006\u0004\b.\u00103J\u000f\u00104\u001a\u00020\u0014H&¢\u0006\u0004\b4\u0010\u0016R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001e\u0010I\u001a\u0004\u0018\u00010\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010/R\u001c\u0010J\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010Mø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006NÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/FocusManager;", "Landroidx/compose/ui/focus/FocusDirection;", "focusDirection", "Landroidx/compose/ui/geometry/Rect;", "previouslyFocusedRect", "", "requestFocusForOwner-7o62pno", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "requestFocusForOwner", "focusedRect", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lr6/c;)Ljava/lang/Boolean;", "focusSearch", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "takeFocus", "Ld6/s;", "releaseFocus", "()V", "force", "refreshFocusEvents", "clearOwnerFocus", "clearFocus-I7lrPNg", "(ZZZI)Z", "clearFocus", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "Lkotlin/Function0;", "onFocusedItem", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lr6/a;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", NotificationCompat.CATEGORY_EVENT, "dispatchRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lr6/a;)Z", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "scheduleInvalidationForOwner", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/focus/FocusTransactionManager;", "getFocusTransactionManager", "()Landroidx/compose/ui/focus/FocusTransactionManager;", "focusTransactionManager", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "getListeners", "()Landroidx/collection/MutableObjectList;", "listeners", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "rootState", "getActiveFocusTargetNode", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setActiveFocusTargetNode", "activeFocusTargetNode", "isFocusCaptured", "()Z", "setFocusCaptured", "(Z)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface FocusOwner extends FocusManager {
    /* renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
    static /* synthetic */ boolean m10334dispatchKeyEventYhN2O0w$default(FocusOwner focusOwner, KeyEvent keyEvent, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
        }
        if ((i & 2) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.ui.focus.FocusOwner$dispatchKeyEvent$1
                @Override // p152r6.InterfaceC6469a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.mo10337dispatchKeyEventYhN2O0w(keyEvent, interfaceC6469a);
    }

    static /* synthetic */ boolean dispatchRotaryEvent$default(FocusOwner focusOwner, RotaryScrollEvent rotaryScrollEvent, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
        }
        if ((i & 2) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: androidx.compose.ui.focus.FocusOwner.dispatchRotaryEvent.1
                @Override // p152r6.InterfaceC6469a
                public final Boolean invoke() {
                    return Boolean.FALSE;
                }
            };
        }
        return focusOwner.dispatchRotaryEvent(rotaryScrollEvent, interfaceC6469a);
    }

    /* renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo10335clearFocusI7lrPNg(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo10336dispatchInterceptedSoftKeyboardEventZmokQxo(@NotNull KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo10337dispatchKeyEventYhN2O0w(@NotNull KeyEvent keyEvent, @NotNull InterfaceC6469a onFocusedItem);

    boolean dispatchRotaryEvent(@NotNull RotaryScrollEvent event, @NotNull InterfaceC6469a onFocusedItem);

    @Nullable
    /* renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    Boolean mo10338focusSearchULY8qGw(int focusDirection, @Nullable Rect focusedRect, @NotNull InterfaceC6471c onFound);

    @Nullable
    FocusTargetNode getActiveFocusTargetNode();

    @Nullable
    Rect getFocusRect();

    @NotNull
    FocusTransactionManager getFocusTransactionManager();

    @NotNull
    MutableObjectList<FocusListener> getListeners();

    @NotNull
    Modifier getModifier();

    @NotNull
    FocusState getRootState();

    /* renamed from: isFocusCaptured */
    boolean getIsFocusCaptured();

    void releaseFocus();

    /* renamed from: requestFocusForOwner-7o62pno, reason: not valid java name */
    boolean mo10339requestFocusForOwner7o62pno(@Nullable FocusDirection focusDirection, @Nullable Rect previouslyFocusedRect);

    void scheduleInvalidation(@NotNull FocusEventModifierNode node);

    void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node);

    void scheduleInvalidation(@NotNull FocusTargetNode node);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(@Nullable FocusTargetNode focusTargetNode);

    void setFocusCaptured(boolean z8);

    /* renamed from: takeFocus-aToIllA, reason: not valid java name */
    boolean mo10340takeFocusaToIllA(int focusDirection, @Nullable Rect previouslyFocusedRect);
}
