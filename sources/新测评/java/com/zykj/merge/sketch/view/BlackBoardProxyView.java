package com.zykj.merge.sketch.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.merge.sketch.listener.MoveProxy;
import com.zykj.merge.sketch.listener.Play;
import com.zykj.merge.sketch.listener.PlayStatusListener;
import com.zykj.merge.sketch.view.BlackBoardProxyView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035c5.InterfaceC5121d;
import p035c5.InterfaceC5125h;
import p131j4.C7794c;
import p275w4.InterfaceC9747l;
import p275w4.InterfaceC9748m;

@Metadata(m13557d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\f0\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010#J]\u0010(\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00122!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\f0\u00112!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010#J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010#J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u0010#J\u000f\u00101\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u0010#J\u0017\u00103\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u0002022\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010:\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010#J#\u0010@\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010?\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010?\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bB\u0010AJ\u000f\u0010C\u001a\u00020=H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020=H\u0016¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\u0012H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0012H\u0016¢\u0006\u0004\bH\u0010GJ\u0017\u0010J\u001a\u00020\f2\u0006\u0010I\u001a\u000202H\u0016¢\u0006\u0004\bJ\u00104J\u0017\u0010K\u001a\u00020\f2\u0006\u0010I\u001a\u000202H\u0016¢\u0006\u0004\bK\u00104J\u0011\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001d0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010V\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, m13558d2 = {"Lcom/zykj/merge/sketch/view/BlackBoardProxyView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/merge/sketch/listener/Play;", "Lcom/zykj/merge/sketch/listener/MoveProxy;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljava/lang/Runnable;", "runnable", "", "runAtLeastCreated", "(Ljava/lang/Runnable;)V", "", "path", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.TransitionType.S_DURATION, "onSuccess", "", "onFailure", "loadData", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getPath", "()Ljava/lang/String;", "Lcom/zykj/merge/sketch/listener/PlayStatusListener;", "listener", "addPlayActionListener", "(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V", "removePlayActionListener", "pause", "()V", "waiting", RequestParameters.POSITION, "progress", "throwable", "seekTo", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "start", "resume", "Lcom/zykj/merge/sketch/constant/PlayStatus;", NotificationCompat.CATEGORY_STATUS, "()Lcom/zykj/merge/sketch/constant/PlayStatus;", "reset", "release", "destroy", "", "isRend", "(Z)V", "", "rate", "setRate", "(D)Z", "Lc5/d;", "setAreaMoveListener", "(Lc5/d;)V", "areaMoveStart", "", "horizontalProgress", "verticalProgress", "areaMoving", "(Ljava/lang/Float;Ljava/lang/Float;)V", "areaMoveEnd", "getMoveVerticalProgress", "()F", "getMoveHorizontalProgress", "getMoveMaxHeightTimes", "()I", "getMoveMaxWidthTimes", "isEnable", "setTranslateEnable", "setScaleEnable", "Landroid/graphics/Bitmap;", "getCurrentScreenBitmap", "()Landroid/graphics/Bitmap;", "Lj4/c;", "sketchPlayView", "Lj4/c;", "", "playActionListener", "Ljava/util/List;", "Lw4/m;", "playPageControl", "Lw4/m;", "merge_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class BlackBoardProxyView extends RelativeLayout implements Play, MoveProxy {
    public Map<Integer, View> _$_findViewCache;
    private final List<PlayStatusListener> playActionListener;
    private InterfaceC9748m playPageControl;
    private final C7794c sketchPlayView;

    @Metadata(m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayStatus.values().length];
            iArr[PlayStatus.RECORD_START.ordinal()] = 1;
            iArr[PlayStatus.RECORD_PAUSE.ordinal()] = 2;
            iArr[PlayStatus.RECORD_RESUME.ordinal()] = 3;
            iArr[PlayStatus.RECORD_END.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13558d2 = {"<anonymous>", "", "invoke"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$seekTo$1 */
    public static final class C69631 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1<Integer, Unit> $onSuccess;
        final /* synthetic */ int $position;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C69631(Function1<? super Integer, Unit> function1, int i10) {
            super(0);
            this.$onSuccess = function1;
            this.$position = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m24244invoke$lambda0(Function1 onSuccess, int i10) {
            Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
            onSuccess.invoke(Integer.valueOf(i10));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BlackBoardProxyView blackBoardProxyView = BlackBoardProxyView.this;
            final Function1<Integer, Unit> function1 = this.$onSuccess;
            final int i10 = this.$position;
            blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.e
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoardProxyView.C69631.m24244invoke$lambda0(function1, i10);
                }
            });
        }
    }

    @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m13558d2 = {"<anonymous>", "", "it", "", "invoke"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$seekTo$2 */
    public static final class C69642 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ Function1<Throwable, Unit> $onFailure;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C69642(Function1<? super Throwable, Unit> function1) {
            super(1);
            this.$onFailure = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: invoke$lambda-0, reason: not valid java name */
        public static final void m24245invoke$lambda0(Function1 onFailure, Throwable it) {
            Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
            Intrinsics.checkNotNullParameter(it, "$it");
            onFailure.invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BlackBoardProxyView blackBoardProxyView = BlackBoardProxyView.this;
            final Function1<Throwable, Unit> function1 = this.$onFailure;
            blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.f
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoardProxyView.C69642.m24245invoke$lambda0(function1, it);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackBoardProxyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        C7794c c7794c = new C7794c(context, attributeSet);
        this.sketchPlayView = c7794c;
        this.playActionListener = new ArrayList();
        addView(c7794c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runAtLeastCreated(Runnable runnable) {
        Lifecycle lifecycle;
        Lifecycle.State state;
        LifecycleOwner lifecycleOwnerFindViewTreeLifecycleOwner = ViewKt.findViewTreeLifecycleOwner(this);
        if (lifecycleOwnerFindViewTreeLifecycleOwner == null || (lifecycle = lifecycleOwnerFindViewTreeLifecycleOwner.getLifecycle()) == null || (state = lifecycle.getState()) == null || !state.isAtLeast(Lifecycle.State.CREATED)) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekTo$lambda-0, reason: not valid java name */
    public static final void m24240seekTo$lambda0(Function1 onFailure) {
        Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
        onFailure.invoke(new Exception());
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void addPlayActionListener(PlayStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playActionListener.add(listener);
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void areaMoveEnd(Float horizontalProgress, Float verticalProgress) {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.areaMoveEnd(horizontalProgress, verticalProgress);
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void areaMoveStart() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.areaMoveStart();
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void areaMoving(Float horizontalProgress, Float verticalProgress) {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.areaMoving(horizontalProgress, verticalProgress);
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void destroy() {
        this.sketchPlayView.destroyDrawingCache();
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public Bitmap getCurrentScreenBitmap() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            return interfaceC9748m.mo6805c();
        }
        return null;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public float getMoveHorizontalProgress() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            return interfaceC9748m.getMoveHorizontalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public int getMoveMaxHeightTimes() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            return interfaceC9748m.getMoveMaxHeightTimes();
        }
        return 0;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public int getMoveMaxWidthTimes() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            return interfaceC9748m.getMoveMaxWidthTimes();
        }
        return 0;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public float getMoveVerticalProgress() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            return interfaceC9748m.getMoveVerticalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public String getPath() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            return interfaceC9748m.mo6807e();
        }
        return null;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void isRend(boolean isRend) {
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void loadData(final String path, final Function1<? super Integer, Unit> onSuccess, final Function1<? super Throwable, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        this.sketchPlayView.m13202b(new Function1<InterfaceC9747l, Unit>() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView.loadData.1

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m13558d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
            /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements Function1<Throwable, Unit> {
                final /* synthetic */ Function1<Throwable, Unit> $onFailure;
                final /* synthetic */ BlackBoardProxyView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(BlackBoardProxyView blackBoardProxyView, Function1<? super Throwable, Unit> function1) {
                    super(1);
                    this.this$0 = blackBoardProxyView;
                    this.$onFailure = function1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: invoke$lambda-0, reason: not valid java name */
                public static final void m24243invoke$lambda0(Function1 onFailure, Throwable throwable) {
                    Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
                    Intrinsics.checkNotNullParameter(throwable, "$throwable");
                    onFailure.invoke(throwable);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final Throwable throwable) {
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    BlackBoardProxyView blackBoardProxyView = this.this$0;
                    final Function1<Throwable, Unit> function1 = this.$onFailure;
                    blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlackBoardProxyView.C69621.AnonymousClass2.m24243invoke$lambda0(function1, throwable);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9747l interfaceC9747l) {
                invoke2(interfaceC9747l);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final InterfaceC9747l it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String str = path;
                final BlackBoardProxyView blackBoardProxyView = this;
                final Function1<Integer, Unit> function1 = onSuccess;
                final Function1<Throwable, Unit> function12 = onFailure;
                it.mo6798d(str, new Function1<List<? extends InterfaceC9748m>, Unit>() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView.loadData.1.1

                    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13558d2 = {"<anonymous>", "", "invoke"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
                    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C101411 extends Lambda implements Function0<Unit> {
                        final /* synthetic */ InterfaceC9747l $it;
                        final /* synthetic */ Function1<Integer, Unit> $onSuccess;
                        final /* synthetic */ BlackBoardProxyView this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public C101411(BlackBoardProxyView blackBoardProxyView, InterfaceC9747l interfaceC9747l, Function1<? super Integer, Unit> function1) {
                            super(0);
                            this.this$0 = blackBoardProxyView;
                            this.$it = interfaceC9747l;
                            this.$onSuccess = function1;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        /* renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                        public static final void m24241invoke$lambda1$lambda0(Function1 onSuccess, InterfaceC9748m this_apply) {
                            Intrinsics.checkNotNullParameter(onSuccess, "$onSuccess");
                            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                            onSuccess.invoke(Integer.valueOf((int) this_apply.getDuration()));
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.this$0.playPageControl = this.$it.mo6795a();
                            final InterfaceC9748m interfaceC9748m = this.this$0.playPageControl;
                            if (interfaceC9748m != null) {
                                final BlackBoardProxyView blackBoardProxyView = this.this$0;
                                final Function1<Integer, Unit> function1 = this.$onSuccess;
                                interfaceC9748m.mo16314f(new InterfaceC5125h() { // from class: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$1$1$1
                                    @Override // p035c5.InterfaceC5125h
                                    public void onPlayEnd() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayEnd();
                                        }
                                    }

                                    @Override // p035c5.InterfaceC5125h
                                    public void onPlayPause() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayPause();
                                        }
                                    }

                                    @Override // p035c5.InterfaceC5125h
                                    public void onPlayResume() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayStart();
                                        }
                                    }

                                    @Override // p035c5.InterfaceC5125h
                                    public void onPlayStart() {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onPlayStart();
                                        }
                                    }

                                    @Override // p035c5.InterfaceC5125h
                                    public void onProgress(long progress) {
                                        Iterator it = blackBoardProxyView.playActionListener.iterator();
                                        while (it.hasNext()) {
                                            ((PlayStatusListener) it.next()).onProgress(progress);
                                        }
                                    }
                                });
                                blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BlackBoardProxyView.C69621.AnonymousClass1.C101411.m24241invoke$lambda1$lambda0(function1, interfaceC9748m);
                                    }
                                });
                            }
                        }
                    }

                    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13558d2 = {"<anonymous>", "", "invoke"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
                    /* renamed from: com.zykj.merge.sketch.view.BlackBoardProxyView$loadData$1$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
                        final /* synthetic */ Function1<Throwable, Unit> $onFailure;
                        final /* synthetic */ BlackBoardProxyView this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public AnonymousClass2(BlackBoardProxyView blackBoardProxyView, Function1<? super Throwable, Unit> function1) {
                            super(0);
                            this.this$0 = blackBoardProxyView;
                            this.$onFailure = function1;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        /* renamed from: invoke$lambda-0, reason: not valid java name */
                        public static final void m24242invoke$lambda0(Function1 onFailure) {
                            Intrinsics.checkNotNullParameter(onFailure, "$onFailure");
                            onFailure.invoke(new Exception());
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BlackBoardProxyView blackBoardProxyView = this.this$0;
                            final Function1<Throwable, Unit> function1 = this.$onFailure;
                            blackBoardProxyView.runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BlackBoardProxyView.C69621.AnonymousClass1.AnonymousClass2.m24242invoke$lambda0(function1);
                                }
                            });
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends InterfaceC9748m> list) {
                        invoke2(list);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<? extends InterfaceC9748m> playPageControlList) {
                        Intrinsics.checkNotNullParameter(playPageControlList, "playPageControlList");
                        it.mo6797c(CollectionsKt.getLastIndex(playPageControlList), new C101411(blackBoardProxyView, it, function1), new AnonymousClass2(blackBoardProxyView, function12));
                    }
                }, new AnonymousClass2(this, onFailure));
            }
        });
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void pause() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.pause();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void release() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.release();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void removePlayActionListener(PlayStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.playActionListener.remove(listener);
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void reset() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.start();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void resume() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.resume();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void seekTo(int position, Function1<? super Integer, Unit> onSuccess, final Function1<? super Throwable, Unit> onFailure) {
        Unit unit;
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.mo6806d(position, new C69631(onSuccess, position), new C69642(onFailure));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            runAtLeastCreated(new Runnable() { // from class: com.zykj.merge.sketch.view.a
                @Override // java.lang.Runnable
                public final void run() {
                    BlackBoardProxyView.m24240seekTo$lambda0(onFailure);
                }
            });
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void setAreaMoveListener(InterfaceC5121d listener) {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.setAreaMoveListener(listener);
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public boolean setRate(double rate) {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m == null) {
            return false;
        }
        interfaceC9748m.mo6808g((float) rate);
        return true;
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void setScaleEnable(boolean isEnable) {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.setScaleEnable(isEnable);
        }
    }

    @Override // com.zykj.merge.sketch.listener.MoveProxy
    public void setTranslateEnable(boolean isEnable) {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.setTranslateEnable(isEnable);
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void start() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.start();
        }
    }

    @Override // com.zykj.merge.sketch.listener.Play
    /* renamed from: status */
    public com.zykj.merge.sketch.constant.PlayStatus getPlayStatus() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        PlayStatus playStatusStatus = interfaceC9748m != null ? interfaceC9748m.status() : null;
        int i10 = playStatusStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[playStatusStatus.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? com.zykj.merge.sketch.constant.PlayStatus.RECORD_END : com.zykj.merge.sketch.constant.PlayStatus.RECORD_END : com.zykj.merge.sketch.constant.PlayStatus.RECORD_RESUME : com.zykj.merge.sketch.constant.PlayStatus.RECORD_PAUSE : com.zykj.merge.sketch.constant.PlayStatus.RECORD_START;
    }

    @Override // com.zykj.merge.sketch.listener.Play
    public void waiting() {
        InterfaceC9748m interfaceC9748m = this.playPageControl;
        if (interfaceC9748m != null) {
            interfaceC9748m.pause();
        }
    }
}
