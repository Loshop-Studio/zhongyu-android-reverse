.class public final Lcom/zykj/view/widget/SketchProgressView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/widget/SketchProgressView$Companion;,
        Lcom/zykj/view/widget/SketchProgressView$ProgressListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 V2\u00020\u0001:\u0002WVB\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u0014J\u0017\u0010 \u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010%\u001a\u00020\u000c2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008&\u0010\u001eJ\u000f\u0010\'\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\'\u0010\u001eJ\u000f\u0010(\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008(\u0010\u001eJ\u000f\u0010)\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008+\u0010*J\u0017\u0010,\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008,\u0010$J\u000f\u0010-\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008-\u0010\u001eJ\u000f\u0010.\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008/\u0010\u001eR*\u00101\u001a\u00020\"2\u0006\u00100\u001a\u00020\"8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R*\u0010>\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010*\"\u0004\u0008A\u0010BR*\u0010C\u001a\u00020\"2\u0006\u00100\u001a\u00020\"8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008C\u00102\u001a\u0004\u0008D\u00104\"\u0004\u0008E\u00106R\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0016\u0010L\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u00102R\u0016\u0010M\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u00102R\u0016\u0010N\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008N\u00102R\u0016\u0010O\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008O\u00102R\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010PR\u0016\u0010Q\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Q\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008U\u0010TR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010P\u00a8\u0006X"
    }
    d2 = {
        "Lcom/zykj/view/widget/SketchProgressView;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyle",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "",
        "isTouchable",
        "Ld6/s;",
        "setTouchable",
        "(Z)V",
        "isViewAlwaysShow",
        "setViewAlwaysShow",
        "Landroid/view/MotionEvent;",
        "event",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "onDetachedFromWindow",
        "()V",
        "checkTouchThumb",
        "calculateTouchOffset",
        "(Landroid/view/MotionEvent;)V",
        "",
        "getProgressByEvent",
        "(Landroid/view/MotionEvent;)F",
        "drawThumb",
        "initPaint",
        "calculateThumbRect",
        "calculateMoveRange",
        "getViewMainLength",
        "()I",
        "getViewCrossLength",
        "getLengthPointByEvent",
        "showView",
        "hideView",
        "closeVisible",
        "value",
        "progress",
        "F",
        "getProgress",
        "()F",
        "setProgress",
        "(F)V",
        "Lcom/zykj/view/widget/SketchProgressView$ProgressListener;",
        "progressListener",
        "Lcom/zykj/view/widget/SketchProgressView$ProgressListener;",
        "getProgressListener",
        "()Lcom/zykj/view/widget/SketchProgressView$ProgressListener;",
        "setProgressListener",
        "(Lcom/zykj/view/widget/SketchProgressView$ProgressListener;)V",
        "orientation",
        "I",
        "getOrientation",
        "setOrientation",
        "(I)V",
        "thumbTime",
        "getThumbTime",
        "setThumbTime",
        "Landroid/graphics/RectF;",
        "thumbRectF",
        "Landroid/graphics/RectF;",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/Paint;",
        "minTouch",
        "maxTouch",
        "touchOffset",
        "radius",
        "Z",
        "viewVisible",
        "Lkotlinx/coroutines/w0;",
        "closeVisibleJob",
        "Lkotlinx/coroutines/w0;",
        "job",
        "Companion",
        "ProgressListener",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/view/widget/SketchProgressView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final Horizontal:I = 0x0

.field public static final Vertical:I = 0x1


# instance fields
.field private closeVisibleJob:Lkotlinx/coroutines/w0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isTouchable:Z

.field private isViewAlwaysShow:Z

.field private job:Lkotlinx/coroutines/w0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maxTouch:F

.field private minTouch:F

.field private orientation:I

.field private paint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private progress:F

.field private progressListener:Lcom/zykj/view/widget/SketchProgressView$ProgressListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private radius:F

.field private thumbRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private thumbTime:F

.field private touchOffset:F

.field private viewVisible:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/view/widget/SketchProgressView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/view/widget/SketchProgressView$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/view/widget/SketchProgressView;->Companion:Lcom/zykj/view/widget/SketchProgressView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/widget/SketchProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/widget/SketchProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 5
    iput p3, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    iput v0, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbTime:F

    .line 7
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbRectF:Landroid/graphics/RectF;

    .line 8
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->paint:Landroid/graphics/Paint;

    const/high16 v0, 0x40000000    # 2.0f

    .line 9
    iput v0, p0, Lcom/zykj/view/widget/SketchProgressView;->radius:F

    .line 10
    iput-boolean p3, p0, Lcom/zykj/view/widget/SketchProgressView;->isViewAlwaysShow:Z

    .line 11
    iput-boolean p3, p0, Lcom/zykj/view/widget/SketchProgressView;->viewVisible:Z

    .line 12
    iput-boolean p3, p0, Lcom/zykj/view/widget/SketchProgressView;->isTouchable:Z

    if-eqz p2, :cond_0

    .line 13
    sget-object v1, Lcom/zykj/view/R$styleable;->SketchProgressView:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget p2, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_orientation:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/zykj/view/widget/SketchProgressView;->setOrientation(I)V

    .line 15
    sget p2, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_thumbRadius:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/zykj/view/widget/SketchProgressView;->radius:F

    .line 16
    iget-object p2, p0, Lcom/zykj/view/widget/SketchProgressView;->paint:Landroid/graphics/Paint;

    sget v0, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_thumbColor:I

    const-string v1, "#D9D9D9"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 17
    sget p2, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_alwaysShow:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/zykj/view/widget/SketchProgressView;->isViewAlwaysShow:Z

    .line 18
    sget p2, Lcom/zykj/view/R$styleable;->SketchProgressView_sp_touchable:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/zykj/view/widget/SketchProgressView;->isTouchable:Z

    .line 19
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 20
    :cond_0
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->initPaint()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/widget/SketchProgressView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getPaint$p(Lcom/zykj/view/widget/SketchProgressView;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/widget/SketchProgressView;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$hideView(Lcom/zykj/view/widget/SketchProgressView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->hideView()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setViewVisible$p(Lcom/zykj/view/widget/SketchProgressView;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/widget/SketchProgressView;->viewVisible:Z

    .line 2
    .line 3
    return-void
.end method

.method private final calculateMoveRange()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->getViewMainLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbRectF:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbRectF:Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_0
    const/4 v2, 0x2

    .line 24
    int-to-float v2, v2

    .line 25
    div-float/2addr v1, v2

    .line 26
    iget v3, p0, Lcom/zykj/view/widget/SketchProgressView;->touchOffset:F

    .line 27
    .line 28
    add-float/2addr v1, v3

    .line 29
    iput v1, p0, Lcom/zykj/view/widget/SketchProgressView;->minTouch:F

    .line 30
    .line 31
    int-to-float v0, v0

    .line 32
    sub-float/2addr v0, v1

    .line 33
    mul-float/2addr v2, v3

    .line 34
    add-float/2addr v2, v0

    .line 35
    iput v2, p0, Lcom/zykj/view/widget/SketchProgressView;->maxTouch:F

    .line 36
    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v2, "minTouch -> "

    .line 40
    .line 41
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "SketchProgressView"

    .line 52
    .line 53
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->maxTouch:F

    .line 57
    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v3, "maxTouch -> "

    .line 61
    .line 62
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method private final calculateThumbRect()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->getViewMainLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->getViewCrossLength()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v2, v0

    .line 10
    iget v3, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbTime:F

    .line 11
    .line 12
    mul-float/2addr v2, v3

    .line 13
    float-to-int v2, v2

    .line 14
    if-ge v2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v2

    .line 18
    :goto_0
    sub-int/2addr v0, v1

    .line 19
    int-to-float v0, v0

    .line 20
    iget v2, p0, Lcom/zykj/view/widget/SketchProgressView;->progress:F

    .line 21
    .line 22
    mul-float/2addr v0, v2

    .line 23
    iget v2, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    if-ne v2, v3, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbRectF:Landroid/graphics/RectF;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    int-to-float v3, v3

    .line 36
    int-to-float v1, v1

    .line 37
    add-float/2addr v1, v0

    .line 38
    invoke-virtual {v2, v4, v0, v3, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object v2, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbRectF:Landroid/graphics/RectF;

    .line 43
    .line 44
    int-to-float v1, v1

    .line 45
    add-float/2addr v1, v0

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    int-to-float v3, v3

    .line 51
    invoke-virtual {v2, v0, v4, v1, v3}, Landroid/graphics/RectF;->set(FFFF)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private final calculateTouchOffset(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbRectF:Landroid/graphics/RectF;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_0
    sub-float/2addr p1, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbRectF:Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iput p1, p0, Lcom/zykj/view/widget/SketchProgressView;->touchOffset:F

    .line 30
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, "touchOffset -> "

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "SketchProgressView"

    .line 46
    .line 47
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private final checkTouchThumb(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, v1, p1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method private final closeVisible()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->closeVisibleJob:Lkotlinx/coroutines/w0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    new-instance v0, Lcom/zykj/view/widget/SketchProgressView$closeVisible$1;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/widget/SketchProgressView$closeVisible$1;-><init>(Lcom/zykj/view/widget/SketchProgressView;Lh6/c;)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    sget-object v3, Lkotlinx/coroutines/q0;->a:Lkotlinx/coroutines/q0;

    .line 16
    .line 17
    invoke-static {v3, v1, v1, v0, v2}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->closeVisibleJob:Lkotlinx/coroutines/w0;

    .line 22
    .line 23
    return-void
.end method

.method private final drawThumb(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/widget/SketchProgressView;->radius:F

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/widget/SketchProgressView;->paint:Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final getLengthPointByEvent(Landroid/view/MotionEvent;)F
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method private final getProgressByEvent(Landroid/view/MotionEvent;)F
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->getLengthPointByEvent(Landroid/view/MotionEvent;)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->minTouch:F

    .line 6
    .line 7
    cmpg-float v1, p1, v0

    .line 8
    .line 9
    if-gez v1, :cond_0

    .line 10
    .line 11
    move p1, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v1, p0, Lcom/zykj/view/widget/SketchProgressView;->maxTouch:F

    .line 14
    .line 15
    cmpl-float v2, p1, v1

    .line 16
    .line 17
    if-lez v2, :cond_1

    .line 18
    .line 19
    move p1, v1

    .line 20
    :cond_1
    :goto_0
    iget v1, p0, Lcom/zykj/view/widget/SketchProgressView;->maxTouch:F

    .line 21
    .line 22
    cmpg-float v2, v1, v0

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    return p1

    .line 28
    :cond_2
    sub-float/2addr p1, v0

    .line 29
    sub-float/2addr v1, v0

    .line 30
    div-float/2addr p1, v1

    .line 31
    return p1
.end method

.method private final getViewCrossLength()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method private final getViewMainLength()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method private final hideView()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->job:Lkotlinx/coroutines/w0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    new-instance v0, Lcom/zykj/view/widget/SketchProgressView$hideView$1;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/widget/SketchProgressView$hideView$1;-><init>(Lcom/zykj/view/widget/SketchProgressView;Lh6/c;)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    sget-object v3, Lkotlinx/coroutines/q0;->a:Lkotlinx/coroutines/q0;

    .line 16
    .line 17
    invoke-static {v3, v1, v1, v0, v2}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->job:Lkotlinx/coroutines/w0;

    .line 22
    .line 23
    return-void
.end method

.method private final initPaint()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 11
    .line 12
    .line 13
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, Lcom/zykj/view/widget/SketchProgressView;->isViewAlwaysShow:Z

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/16 v1, 0xff

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method private final showView()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->job:Lkotlinx/coroutines/w0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    new-instance v0, Lcom/zykj/view/widget/SketchProgressView$showView$1;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Lcom/zykj/view/widget/SketchProgressView$showView$1;-><init>(Lcom/zykj/view/widget/SketchProgressView;Lh6/c;)V

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    sget-object v3, Lkotlinx/coroutines/q0;->a:Lkotlinx/coroutines/q0;

    .line 16
    .line 17
    invoke-static {v3, v1, v1, v0, v2}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->job:Lkotlinx/coroutines/w0;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 2
    .line 3
    return v0
.end method

.method public final getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->progress:F

    .line 2
    .line 3
    return v0
.end method

.method public final getProgressListener()Lcom/zykj/view/widget/SketchProgressView$ProgressListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->progressListener:Lcom/zykj/view/widget/SketchProgressView$ProgressListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getThumbTime()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbTime:F

    .line 2
    .line 3
    return v0
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->job:Lkotlinx/coroutines/w0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->closeVisibleJob:Lkotlinx/coroutines/w0;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->calculateThumbRect()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->drawThumb(Landroid/graphics/Canvas;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-le p1, p2, :cond_0

    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->setOrientation(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-ge p1, p2, :cond_1

    .line 32
    .line 33
    iget p1, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p2}, Lcom/zykj/view/widget/SketchProgressView;->setOrientation(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/zykj/view/widget/SketchProgressView;->isTouchable:Z

    .line 7
    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    if-eq v0, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->getProgressByEvent(Landroid/view/MotionEvent;)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->progressListener:Lcom/zykj/view/widget/SketchProgressView$ProgressListener;

    .line 31
    .line 32
    if-eqz p1, :cond_5

    .line 33
    .line 34
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->progress:F

    .line 35
    .line 36
    invoke-interface {p1, v0}, Lcom/zykj/view/widget/SketchProgressView$ProgressListener;->onProgress(F)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->getProgressByEvent(Landroid/view/MotionEvent;)F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->progressListener:Lcom/zykj/view/widget/SketchProgressView$ProgressListener;

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->progress:F

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lcom/zykj/view/widget/SketchProgressView$ProgressListener;->onTouchEnd(F)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->checkTouchThumb(Landroid/view/MotionEvent;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->calculateTouchOffset(Landroid/view/MotionEvent;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const/4 v0, 0x0

    .line 68
    iput v0, p0, Lcom/zykj/view/widget/SketchProgressView;->touchOffset:F

    .line 69
    .line 70
    :goto_0
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->calculateMoveRange()V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->getProgressByEvent(Landroid/view/MotionEvent;)F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->progressListener:Lcom/zykj/view/widget/SketchProgressView$ProgressListener;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-interface {p1}, Lcom/zykj/view/widget/SketchProgressView$ProgressListener;->onTouchStart()V

    .line 85
    .line 86
    .line 87
    :cond_4
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->progressListener:Lcom/zykj/view/widget/SketchProgressView$ProgressListener;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->progress:F

    .line 92
    .line 93
    invoke-interface {p1, v0}, Lcom/zykj/view/widget/SketchProgressView$ProgressListener;->onProgress(F)V

    .line 94
    .line 95
    .line 96
    :cond_5
    :goto_1
    return v1

    .line 97
    :cond_6
    const/4 p1, 0x0

    .line 98
    return p1
.end method

.method public final setOrientation(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/SketchProgressView;->orientation:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setProgress(F)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/widget/SketchProgressView;->isViewAlwaysShow:Z

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbTime:F

    .line 8
    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/zykj/view/widget/SketchProgressView;->viewVisible:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/zykj/view/widget/SketchProgressView;->viewVisible:Z

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->showView()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/zykj/view/widget/SketchProgressView;->closeVisible()V

    .line 24
    .line 25
    .line 26
    :cond_1
    cmpl-float v0, p1, v1

    .line 27
    .line 28
    if-lez v0, :cond_2

    .line 29
    .line 30
    move p1, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 v0, 0x0

    .line 33
    cmpg-float v1, p1, v0

    .line 34
    .line 35
    if-gez v1, :cond_3

    .line 36
    .line 37
    move p1, v0

    .line 38
    :cond_3
    :goto_0
    iput p1, p0, Lcom/zykj/view/widget/SketchProgressView;->progress:F

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final setProgressListener(Lcom/zykj/view/widget/SketchProgressView$ProgressListener;)V
    .locals 0
    .param p1    # Lcom/zykj/view/widget/SketchProgressView$ProgressListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/view/widget/SketchProgressView;->progressListener:Lcom/zykj/view/widget/SketchProgressView$ProgressListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setThumbTime(F)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpl-float v1, p1, v0

    .line 4
    .line 5
    if-lez v1, :cond_0

    .line 6
    .line 7
    :goto_0
    move p1, v0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    cmpg-float v1, p1, v0

    .line 11
    .line 12
    if-gez v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    :goto_1
    iput p1, p0, Lcom/zykj/view/widget/SketchProgressView;->thumbTime:F

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setTouchable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/widget/SketchProgressView;->isTouchable:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setViewAlwaysShow(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/widget/SketchProgressView;->isViewAlwaysShow:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->job:Lkotlinx/coroutines/w0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->closeVisibleJob:Lkotlinx/coroutines/w0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView;->paint:Landroid/graphics/Paint;

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    const/16 p1, 0xff

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const/4 p1, 0x0

    .line 26
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
