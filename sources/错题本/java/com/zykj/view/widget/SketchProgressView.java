package com.zykj.view.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.view.C5280R;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5993q0;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 V2\u00020\u0001:\u0002WVB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u001eJ\u000f\u0010'\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u001eJ\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010\u001eJ\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010$J\u000f\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u001eJ\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u0010\u001eR*\u00101\u001a\u00020\"2\u0006\u00100\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010>\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010*\"\u0004\bA\u0010BR*\u0010C\u001a\u00020\"2\u0006\u00100\u001a\u00020\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00102\u001a\u0004\bD\u00104\"\u0004\bE\u00106R\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u00102R\u0016\u0010M\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00102R\u0016\u0010N\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u00102R\u0016\u0010O\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u00102R\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010PR\u0016\u0010Q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010P¨\u0006X"}, m5110d2 = {"Lcom/zykj/view/widget/SketchProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isTouchable", "Ld6/s;", "setTouchable", "(Z)V", "isViewAlwaysShow", "setViewAlwaysShow", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "onDetachedFromWindow", "()V", "checkTouchThumb", "calculateTouchOffset", "(Landroid/view/MotionEvent;)V", "", "getProgressByEvent", "(Landroid/view/MotionEvent;)F", "drawThumb", "initPaint", "calculateThumbRect", "calculateMoveRange", "getViewMainLength", "()I", "getViewCrossLength", "getLengthPointByEvent", "showView", "hideView", "closeVisible", "value", "progress", "F", "getProgress", "()F", "setProgress", "(F)V", "Lcom/zykj/view/widget/SketchProgressView$ProgressListener;", "progressListener", "Lcom/zykj/view/widget/SketchProgressView$ProgressListener;", "getProgressListener", "()Lcom/zykj/view/widget/SketchProgressView$ProgressListener;", "setProgressListener", "(Lcom/zykj/view/widget/SketchProgressView$ProgressListener;)V", "orientation", "I", "getOrientation", "setOrientation", "(I)V", "thumbTime", "getThumbTime", "setThumbTime", "Landroid/graphics/RectF;", "thumbRectF", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "minTouch", "maxTouch", "touchOffset", "radius", "Z", "viewVisible", "Lkotlinx/coroutines/w0;", "closeVisibleJob", "Lkotlinx/coroutines/w0;", "job", "Companion", "ProgressListener", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SketchProgressView extends View {
    public static final int Horizontal = 0;
    public static final int Vertical = 1;

    @Nullable
    private InterfaceC6013w0 closeVisibleJob;
    private boolean isTouchable;
    private boolean isViewAlwaysShow;

    @Nullable
    private InterfaceC6013w0 job;
    private float maxTouch;
    private float minTouch;
    private int orientation;

    @NotNull
    private Paint paint;
    private float progress;

    @Nullable
    private ProgressListener progressListener;
    private float radius;

    @NotNull
    private RectF thumbRectF;
    private float thumbTime;
    private float touchOffset;
    private boolean viewVisible;

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\b¨\u0006\nÀ\u0006\u0003"}, m5110d2 = {"Lcom/zykj/view/widget/SketchProgressView$ProgressListener;", "", "Ld6/s;", "onTouchStart", "()V", "", "progress", "onProgress", "(F)V", "onTouchEnd", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface ProgressListener {
        void onProgress(float progress);

        void onTouchEnd(float progress);

        void onTouchStart();
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.widget.SketchProgressView$closeVisible$1", m5303f = "SketchProgressView.kt", m5304i = {}, m5305l = {370}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.widget.SketchProgressView$closeVisible$1 */
    public static final class C53911 extends SuspendLambda implements InterfaceC6473e {
        int label;

        public C53911(InterfaceC5631c<? super C53911> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SketchProgressView.this.new C53911(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                this.label = 1;
                if (AbstractC6014x.m5638i(2000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            SketchProgressView.this.viewVisible = false;
            SketchProgressView.this.hideView();
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53911) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.widget.SketchProgressView$hideView$1", m5303f = "SketchProgressView.kt", m5304i = {0, 0}, m5305l = {360}, m5306m = "invokeSuspend", m5307n = {"$this$launch", "a"}, m5308s = {"L$0", "I$0"})
    /* renamed from: com.zykj.view.widget.SketchProgressView$hideView$1 */
    public static final class C53921 extends SuspendLambda implements InterfaceC6473e {
        int I$0;
        private /* synthetic */ Object L$0;
        int label;

        public C53921(InterfaceC5631c<? super C53921> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C53921 c53921 = SketchProgressView.this.new C53921(interfaceC5631c);
            c53921.L$0 = obj;
            return c53921;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:6:0x0012). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.v r0 = (kotlinx.coroutines.InterfaceC6009v) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r6.label
                r3 = 1
                if (r2 == 0) goto L1c
                if (r2 != r3) goto L14
                int r2 = r6.I$0
                kotlin.AbstractC5774b.m5119b(r7)
            L12:
                r7 = r2
                goto L21
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                kotlin.AbstractC5774b.m5119b(r7)
                r7 = 250(0xfa, float:3.5E-43)
            L21:
                boolean r2 = kotlinx.coroutines.AbstractC6014x.m5648s(r0)
                if (r2 == 0) goto L48
                if (r7 <= 0) goto L48
                int r2 = r7 + (-10)
                com.zykj.view.widget.SketchProgressView r7 = com.zykj.view.widget.SketchProgressView.this
                android.graphics.Paint r7 = com.zykj.view.widget.SketchProgressView.access$getPaint$p(r7)
                r7.setAlpha(r2)
                com.zykj.view.widget.SketchProgressView r7 = com.zykj.view.widget.SketchProgressView.this
                r7.postInvalidate()
                r6.L$0 = r0
                r6.I$0 = r2
                r6.label = r3
                r4 = 10
                java.lang.Object r7 = kotlinx.coroutines.AbstractC6014x.m5638i(r4, r6)
                if (r7 != r1) goto L12
                return r1
            L48:
                com.zykj.view.widget.SketchProgressView r7 = com.zykj.view.widget.SketchProgressView.this
                com.zykj.view.widget.a r0 = new com.zykj.view.widget.a
                r1 = 0
                r0.<init>(r7, r1)
                r7.post(r0)
                d6.s r7 = p045d6.C5443s.f8405a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.SketchProgressView.C53921.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/view/widget/SketchProgressView$hideView$1.smali:213
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53921) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.widget.SketchProgressView$showView$1", m5303f = "SketchProgressView.kt", m5304i = {0, 0}, m5305l = {346}, m5306m = "invokeSuspend", m5307n = {"$this$launch", "a"}, m5308s = {"L$0", "I$0"})
    /* renamed from: com.zykj.view.widget.SketchProgressView$showView$1 */
    public static final class C53931 extends SuspendLambda implements InterfaceC6473e {
        int I$0;
        private /* synthetic */ Object L$0;
        int label;

        public C53931(InterfaceC5631c<? super C53931> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C53931 c53931 = SketchProgressView.this.new C53931(interfaceC5631c);
            c53931.L$0 = obj;
            return c53931;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0046 -> B:6:0x0012). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.L$0
                kotlinx.coroutines.v r0 = (kotlinx.coroutines.InterfaceC6009v) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r6.label
                r3 = 1
                if (r2 == 0) goto L1c
                if (r2 != r3) goto L14
                int r2 = r6.I$0
                kotlin.AbstractC5774b.m5119b(r7)
            L12:
                r7 = r2
                goto L20
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                kotlin.AbstractC5774b.m5119b(r7)
                r7 = 0
            L20:
                boolean r2 = kotlinx.coroutines.AbstractC6014x.m5648s(r0)
                if (r2 == 0) goto L49
                r2 = 250(0xfa, float:3.5E-43)
                if (r7 >= r2) goto L49
                int r2 = r7 + 25
                com.zykj.view.widget.SketchProgressView r7 = com.zykj.view.widget.SketchProgressView.this
                android.graphics.Paint r7 = com.zykj.view.widget.SketchProgressView.access$getPaint$p(r7)
                r7.setAlpha(r2)
                com.zykj.view.widget.SketchProgressView r7 = com.zykj.view.widget.SketchProgressView.this
                r7.postInvalidate()
                r6.L$0 = r0
                r6.I$0 = r2
                r6.label = r3
                r4 = 10
                java.lang.Object r7 = kotlinx.coroutines.AbstractC6014x.m5638i(r4, r6)
                if (r7 != r1) goto L12
                return r1
            L49:
                com.zykj.view.widget.SketchProgressView r7 = com.zykj.view.widget.SketchProgressView.this
                com.zykj.view.widget.a r0 = new com.zykj.view.widget.a
                r1 = 1
                r0.<init>(r7, r1)
                r7.post(r0)
                d6.s r7 = p045d6.C5443s.f8405a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.SketchProgressView.C53931.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/view/widget/SketchProgressView$showView$1.smali:212
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53931) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SketchProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        AbstractC5830k.m5330g(context, "context");
    }

    private final void calculateMoveRange() {
        int viewMainLength = getViewMainLength();
        float fHeight = this.orientation == 1 ? this.thumbRectF.height() : this.thumbRectF.width();
        float f = 2;
        float f7 = this.touchOffset;
        float f8 = (fHeight / f) + f7;
        this.minTouch = f8;
        this.maxTouch = (f * f7) + (viewMainLength - f8);
        Log.i("SketchProgressView", "minTouch -> " + f8);
        Log.i("SketchProgressView", "maxTouch -> " + this.maxTouch);
    }

    private final void calculateThumbRect() {
        int viewMainLength = getViewMainLength();
        int viewCrossLength = getViewCrossLength();
        int i = (int) (viewMainLength * this.thumbTime);
        if (i >= viewCrossLength) {
            viewCrossLength = i;
        }
        float f = (viewMainLength - viewCrossLength) * this.progress;
        if (this.orientation == 1) {
            this.thumbRectF.set(0.0f, f, getWidth(), viewCrossLength + f);
        } else {
            this.thumbRectF.set(f, 0.0f, viewCrossLength + f, getHeight());
        }
    }

    private final void calculateTouchOffset(MotionEvent event) {
        float x3;
        float fCenterX;
        if (this.orientation == 1) {
            x3 = event.getY();
            fCenterX = this.thumbRectF.centerY();
        } else {
            x3 = event.getX();
            fCenterX = this.thumbRectF.centerX();
        }
        float f = x3 - fCenterX;
        this.touchOffset = f;
        Log.i("SketchProgressView", "touchOffset -> " + f);
    }

    private final boolean checkTouchThumb(MotionEvent event) {
        return this.thumbRectF.contains(event.getX(), event.getY());
    }

    private final void closeVisible() {
        InterfaceC6013w0 interfaceC6013w0 = this.closeVisibleJob;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.closeVisibleJob = AbstractC6014x.m5651v(C5993q0.f9492a, null, null, new C53911(null), 3);
    }

    private final void drawThumb(Canvas canvas) {
        RectF rectF = this.thumbRectF;
        float f = this.radius;
        canvas.drawRoundRect(rectF, f, f, this.paint);
    }

    private final float getLengthPointByEvent(MotionEvent event) {
        return this.orientation == 1 ? event.getY() : event.getX();
    }

    private final float getProgressByEvent(MotionEvent event) {
        float lengthPointByEvent = getLengthPointByEvent(event);
        float f = this.minTouch;
        if (lengthPointByEvent < f) {
            lengthPointByEvent = f;
        } else {
            float f7 = this.maxTouch;
            if (lengthPointByEvent > f7) {
                lengthPointByEvent = f7;
            }
        }
        float f8 = this.maxTouch;
        if (f8 == f) {
            return 0.0f;
        }
        return (lengthPointByEvent - f) / (f8 - f);
    }

    private final int getViewCrossLength() {
        return this.orientation == 1 ? getWidth() : getHeight();
    }

    private final int getViewMainLength() {
        return this.orientation == 1 ? getHeight() : getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideView() {
        InterfaceC6013w0 interfaceC6013w0 = this.job;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.job = AbstractC6014x.m5651v(C5993q0.f9492a, null, null, new C53921(null), 3);
    }

    private final void initPaint() {
        Paint paint = this.paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        if (this.isViewAlwaysShow) {
            paint.setAlpha(255);
        }
    }

    private final void showView() {
        InterfaceC6013w0 interfaceC6013w0 = this.job;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.job = AbstractC6014x.m5651v(C5993q0.f9492a, null, null, new C53931(null), 3);
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final float getProgress() {
        return this.progress;
    }

    @Nullable
    public final ProgressListener getProgressListener() {
        return this.progressListener;
    }

    public final float getThumbTime() {
        return this.thumbTime;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC6013w0 interfaceC6013w0 = this.job;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        InterfaceC6013w0 interfaceC6013w02 = this.closeVisibleJob;
        if (interfaceC6013w02 != null) {
            interfaceC6013w02.cancel(null);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        super.onDraw(canvas);
        calculateThumbRect();
        drawThumb(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getWidth() > getHeight() && this.orientation != 0) {
            setOrientation(0);
        } else {
            if (getWidth() >= getHeight() || this.orientation == 1) {
                return;
            }
            setOrientation(1);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (!this.isTouchable) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            if (checkTouchThumb(event)) {
                calculateTouchOffset(event);
            } else {
                this.touchOffset = 0.0f;
            }
            calculateMoveRange();
            setProgress(getProgressByEvent(event));
            ProgressListener progressListener = this.progressListener;
            if (progressListener != null) {
                progressListener.onTouchStart();
            }
            ProgressListener progressListener2 = this.progressListener;
            if (progressListener2 != null) {
                progressListener2.onProgress(this.progress);
            }
        } else if (action == 1) {
            setProgress(getProgressByEvent(event));
            ProgressListener progressListener3 = this.progressListener;
            if (progressListener3 != null) {
                progressListener3.onTouchEnd(this.progress);
            }
        } else if (action == 2) {
            setProgress(getProgressByEvent(event));
            ProgressListener progressListener4 = this.progressListener;
            if (progressListener4 != null) {
                progressListener4.onProgress(this.progress);
            }
        }
        return true;
    }

    public final void setOrientation(int i) {
        this.orientation = i;
        postInvalidate();
    }

    public final void setProgress(float f) {
        if (!this.isViewAlwaysShow) {
            if (this.thumbTime < 1.0f && !this.viewVisible) {
                this.viewVisible = true;
                showView();
            }
            closeVisible();
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.progress = f;
        postInvalidate();
    }

    public final void setProgressListener(@Nullable ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v2 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0004, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setThumbTime(float r3) {
        /*
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L8
        L6:
            r3 = r0
            goto Le
        L8:
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Le
            goto L6
        Le:
            r2.thumbTime = r3
            r2.postInvalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.widget.SketchProgressView.setThumbTime(float):void"); // DEX body: android/错题本/smali_classes3/com/zykj/view/widget/SketchProgressView.smali:1889
    }

    public final void setTouchable(boolean isTouchable) {
        this.isTouchable = isTouchable;
    }

    public final void setViewAlwaysShow(boolean isViewAlwaysShow) {
        this.isViewAlwaysShow = isViewAlwaysShow;
        InterfaceC6013w0 interfaceC6013w0 = this.job;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        InterfaceC6013w0 interfaceC6013w02 = this.closeVisibleJob;
        if (interfaceC6013w02 != null) {
            interfaceC6013w02.cancel(null);
        }
        this.paint.setAlpha(isViewAlwaysShow ? 255 : 0);
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SketchProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5830k.m5330g(context, "context");
    }

    public /* synthetic */ SketchProgressView(Context context, AttributeSet attributeSet, int i, int i8, AbstractC5824e abstractC5824e) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SketchProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC5830k.m5330g(context, "context");
        this.orientation = 1;
        this.thumbTime = 1.0f;
        this.thumbRectF = new RectF();
        this.paint = new Paint();
        this.radius = 2.0f;
        this.isViewAlwaysShow = true;
        this.viewVisible = true;
        this.isTouchable = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5280R.styleable.SketchProgressView);
            AbstractC5830k.m5329f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            setOrientation(typedArrayObtainStyledAttributes.getInt(C5280R.styleable.SketchProgressView_sp_orientation, 1));
            this.radius = typedArrayObtainStyledAttributes.getDimension(C5280R.styleable.SketchProgressView_sp_thumbRadius, 2.0f);
            this.paint.setColor(typedArrayObtainStyledAttributes.getColor(C5280R.styleable.SketchProgressView_sp_thumbColor, Color.parseColor("#D9D9D9")));
            this.isViewAlwaysShow = typedArrayObtainStyledAttributes.getBoolean(C5280R.styleable.SketchProgressView_sp_alwaysShow, true);
            this.isTouchable = typedArrayObtainStyledAttributes.getBoolean(C5280R.styleable.SketchProgressView_sp_touchable, true);
            typedArrayObtainStyledAttributes.recycle();
        }
        initPaint();
    }
}
