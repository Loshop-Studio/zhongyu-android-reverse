package androidx.compose.p011ui.window;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.autofill.HintConstants;
import androidx.compose.p011ui.platform.AbstractComposeView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6475g;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0080\u0001\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002`\u0010\u0014\u001a\\\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00028\u00000\fH\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u001f\u0010 J7\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0010¢\u0006\u0004\b#\u0010$J(\u0010+\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&2\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u001a0(¢\u0006\u0002\b)¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00172\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001aH\u0017¢\u0006\u0004\b7\u00108R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;RA\u0010*\u001a\r\u0012\u0004\u0012\u00020\u001a0(¢\u0006\u0002\b)2\u0011\u0010<\u001a\r\u0012\u0004\u0012\u00020\u001a0(¢\u0006\u0002\b)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\b+\u0010AR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010BR\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010BR\u0016\u0010C\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR$\u0010D\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u00178\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010F¨\u0006G"}, m5110d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "Landroidx/core/view/OnApplyWindowInsetsListener;", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", ExifInterface.GPS_DIRECTION_TRUE, "unchangedValue", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "left", "top", "right", "bottom", "block", "insetValue", "(Ljava/lang/Object;Lr6/g;)Ljava/lang/Object;", "", "usePlatformDefaultWidth", "decorFitsSystemWindows", "Ld6/s;", "updateProperties", "(ZZ)V", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "(II)V", "internalOnMeasure", "changed", "internalOnLayout$ui_release", "(ZIIII)V", "internalOnLayout", "Landroidx/compose/runtime/CompositionContext;", "parent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Landroidx/compose/runtime/CompositionContext;Lr6/e;)V", "Landroid/view/View;", "v", "Landroidx/core/view/WindowInsetsCompat;", "insets", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "isInsideContent", "(Landroid/view/MotionEvent;)Z", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "content$delegate", "Landroidx/compose/runtime/MutableState;", "getContent", "()Lr6/e;", "(Lr6/e;)V", "Z", "hasCalledSetLayout", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,627:1\n385#1,12:633\n85#2:628\n113#2,2:629\n105#3:631\n105#3:632\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n379#1:633,12\n229#1:628\n229#1:629,2\n305#1:631\n306#1:632\n*E\n"})
/* loaded from: classes2.dex */
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider, OnApplyWindowInsetsListener {

    /* renamed from: content$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState content;
    private boolean decorFitsSystemWindows;
    private boolean hasCalledSetLayout;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;

    @NotNull
    private final Window window;

    public DialogLayout(@NotNull Context context, @NotNull Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m13569getLambda1$ui_release(), null, 2, null);
        ViewCompat.setOnApplyWindowInsetsListener(this, this);
        ViewCompat.setWindowInsetsAnimationCallback(this, new WindowInsetsAnimationCompat.Callback() { // from class: androidx.compose.ui.window.DialogLayout.1
            {
                super(1);
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List<WindowInsetsAnimationCompat> runningAnimations) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        return insets.inset(iMax, iMax2, iMax3, iMax4);
                    }
                }
                return insets;
            }

            @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
            public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.BoundsCompat bounds) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int iMax = Math.max(0, childAt.getLeft());
                    int iMax2 = Math.max(0, childAt.getTop());
                    int iMax3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int iMax4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                        return bounds.inset(Insets.m1565of(iMax, iMax2, iMax3, iMax4));
                    }
                }
                return bounds;
            }
        });
    }

    private final InterfaceC6473e getContent() {
        return (InterfaceC6473e) this.content.getValue();
    }

    private final <T> T insetValue(T unchangedValue, InterfaceC6475g block) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return (T) block.invoke(Integer.valueOf(iMax), Integer.valueOf(iMax2), Integer.valueOf(iMax3), Integer.valueOf(iMax4));
            }
        }
        return unchangedValue;
    }

    private final void setContent(InterfaceC6473e interfaceC6473e) {
        this.content.setValue(interfaceC6473e);
    }

    @Override // androidx.compose.p011ui.platform.AbstractComposeView
    @Composable
    public void Content(@Nullable Composer composer, int i) {
        composer.startReplaceGroup(1735448596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735448596, i, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:410)");
        }
        getContent().invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // androidx.compose.p011ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.p011ui.window.DialogWindowProvider
    @NotNull
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.p011ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean changed, int left, int top2, int right, int bottom) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i = right - left;
        int i8 = bottom - top2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i8 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.p011ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int widthMeasureSpec, int heightMeasureSpec) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui_release(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int i = (mode != Integer.MIN_VALUE || this.usePlatformDefaultWidth || this.decorFitsSystemWindows || getWindow().getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i8 = size - paddingRight;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = i - paddingBottom;
        int i10 = i9 >= 0 ? i9 : 0;
        int mode2 = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode2 != 0) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        }
        childAt.measure(widthMeasureSpec, heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.usePlatformDefaultWidth || this.decorFitsSystemWindows || childAt.getMeasuredHeight() + paddingBottom <= size2 || getWindow().getAttributes().height != -2) {
            return;
        }
        getWindow().setLayout(-1, -1);
    }

    public final boolean isInsideContent(@NotNull MotionEvent event) {
        View childAt;
        int iM6241q;
        float x3 = event.getX();
        if (!Float.isInfinite(x3) && !Float.isNaN(x3)) {
            float y2 = event.getY();
            if (Float.isInfinite(y2) || Float.isNaN(y2) || (childAt = getChildAt(0)) == null) {
                return false;
            }
            int left = childAt.getLeft() + getLeft();
            int width = childAt.getWidth() + left;
            int top2 = childAt.getTop() + getTop();
            int height = childAt.getHeight() + top2;
            int iM6241q2 = AbstractC6600a.m6241q(event.getX());
            if (left <= iM6241q2 && iM6241q2 <= width && top2 <= (iM6241q = AbstractC6600a.m6241q(event.getY())) && iM6241q <= height) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    @NotNull
    public WindowInsetsCompat onApplyWindowInsets(@NotNull View v2, @NotNull WindowInsetsCompat insets) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return insets.inset(iMax, iMax2, iMax3, iMax4);
            }
        }
        return insets;
    }

    public final void updateProperties(boolean usePlatformDefaultWidth, boolean decorFitsSystemWindows) {
        boolean z8 = (this.hasCalledSetLayout && usePlatformDefaultWidth == this.usePlatformDefaultWidth && decorFitsSystemWindows == this.decorFitsSystemWindows) ? false : true;
        this.usePlatformDefaultWidth = usePlatformDefaultWidth;
        this.decorFitsSystemWindows = decorFitsSystemWindows;
        if (z8) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            int i = usePlatformDefaultWidth ? -2 : -1;
            if (i == attributes.width && this.hasCalledSetLayout) {
                return;
            }
            getWindow().setLayout(i, -2);
            this.hasCalledSetLayout = true;
        }
    }

    public final void setContent(@NotNull CompositionContext parent, @NotNull InterfaceC6473e content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }
}
