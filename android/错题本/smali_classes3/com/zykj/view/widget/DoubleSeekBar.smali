.class public final Lcom/zykj/view/widget/DoubleSeekBar;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;,
        Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0010\u0016\n\u0002\u0008\u0007\n\u0002\u0010!\n\u0002\u0008C\u0018\u00002\u00020\u0001:\u0004\u0093\u0001\u0094\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0018H\u0014\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008\"\u0010!J\u000f\u0010#\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008%\u0010$J\u000f\u0010&\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008&\u0010$J\u000f\u0010\'\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\'\u0010$J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0017J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008)\u0010\u0017J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008*\u0010\u0017J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008+\u0010\u0017J\u000f\u0010,\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008,\u0010$J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0002\u00a2\u0006\u0004\u00083\u00104R\u0014\u00105\u001a\u00020\u00068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R$\u0010B\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010E\"\u0004\u0008F\u0010GR\u0016\u0010H\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u00106R6\u0010L\u001a\u0008\u0012\u0004\u0012\u00020J0I2\u000c\u0010K\u001a\u0008\u0012\u0004\u0012\u00020J0I8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008L\u0010M\u001a\u0004\u0008N\u0010O\"\u0004\u0008P\u0010QR\u001a\u0010S\u001a\u0008\u0012\u0004\u0012\u0002000R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010MR*\u0010T\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008T\u00106\u001a\u0004\u0008U\u0010V\"\u0004\u0008W\u0010XR*\u0010Y\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u00106\u001a\u0004\u0008Z\u0010V\"\u0004\u0008[\u0010XR*\u0010\\\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u0010]\u001a\u0004\u0008^\u0010_\"\u0004\u0008`\u0010!R*\u0010a\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008a\u0010]\u001a\u0004\u0008b\u0010_\"\u0004\u0008c\u0010!R*\u0010d\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008d\u00106\u001a\u0004\u0008e\u0010V\"\u0004\u0008f\u0010XR\u0016\u0010g\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008g\u0010]R\u0016\u0010h\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0016\u0010j\u001a\u0002008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008j\u0010kR*\u0010l\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008l\u0010]\u001a\u0004\u0008m\u0010_\"\u0004\u0008n\u0010!R*\u0010o\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008o\u00106\u001a\u0004\u0008p\u0010V\"\u0004\u0008q\u0010XR\u0016\u0010r\u001a\u0002008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010kR\u0016\u0010s\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008s\u00106R*\u0010t\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008t\u00106\u001a\u0004\u0008u\u0010V\"\u0004\u0008v\u0010XR*\u0010w\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008w\u00106\u001a\u0004\u0008x\u0010V\"\u0004\u0008y\u0010XR\u0016\u0010z\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008z\u0010]R\u0016\u0010{\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010]R\u0014\u0010|\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008|\u0010kR\u0016\u0010}\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008}\u00106R+\u0010~\u001a\u00020\u001e2\u0006\u0010K\u001a\u00020\u001e8\u0006@FX\u0086\u000e\u00a2\u0006\u0013\n\u0004\u0008~\u0010]\u001a\u0004\u0008\u007f\u0010_\"\u0005\u0008\u0080\u0001\u0010!R.\u0010\u0081\u0001\u001a\u00020\u00062\u0006\u0010K\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0081\u0001\u00106\u001a\u0005\u0008\u0082\u0001\u0010V\"\u0005\u0008\u0083\u0001\u0010XR\u0018\u0010\u0084\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0084\u0001\u0010]R\u0018\u0010\u0085\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0085\u0001\u00106R\u0018\u0010\u0086\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0086\u0001\u0010kR\u0018\u0010\u0087\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0087\u0001\u00106R\u0018\u0010\u0088\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0088\u0001\u00106R\u0016\u0010\u0089\u0001\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0089\u0001\u0010kR\u0017\u0010\u008a\u0001\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008c\u0001\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008b\u0001R\u0017\u0010\u008d\u0001\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008b\u0001R\u0017\u0010\u008e\u0001\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008e\u0001\u0010\u008b\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u008f\u0001\u0010]R\u0018\u0010\u0090\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0090\u0001\u0010]R\u0018\u0010\u0091\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0091\u0001\u0010]R\u0018\u0010\u0092\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0092\u0001\u0010]\u00a8\u0006\u0095\u0001"
    }
    d2 = {
        "Lcom/zykj/view/widget/DoubleSeekBar;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "Ld6/s;",
        "onMeasure",
        "(II)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;)V",
        "Landroid/os/Parcelable;",
        "onSaveInstanceState",
        "()Landroid/os/Parcelable;",
        "state",
        "onRestoreInstanceState",
        "(Landroid/os/Parcelable;)V",
        "",
        "x",
        "refreshSeekBar",
        "(F)V",
        "refreshMask",
        "calculateTrackLocation",
        "()V",
        "calculateKeyPointLocation",
        "calculateMaskLocation",
        "calculateThumbLocation",
        "drawTrack",
        "drawKeyPoint",
        "drawMask",
        "drawThumb",
        "initPaint",
        "y",
        "handleTouchMode",
        "(FF)I",
        "Landroid/graphics/RectF;",
        "rectF",
        "Landroid/graphics/Path;",
        "calculateLineInRectF",
        "(Landroid/graphics/RectF;)Landroid/graphics/Path;",
        "mTouchOffset",
        "I",
        "Landroid/graphics/Paint;",
        "mPaint",
        "Landroid/graphics/Paint;",
        "Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;",
        "seekChangeListener",
        "Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;",
        "getSeekChangeListener",
        "()Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;",
        "setSeekChangeListener",
        "(Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;)V",
        "Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;",
        "maskChangeListener",
        "Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;",
        "getMaskChangeListener",
        "()Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;",
        "setMaskChangeListener",
        "(Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;)V",
        "mCurrentTouchMode",
        "",
        "",
        "value",
        "keyPointList",
        "Ljava/util/List;",
        "getKeyPointList",
        "()Ljava/util/List;",
        "setKeyPointList",
        "(Ljava/util/List;)V",
        "",
        "mKeyPointRectList",
        "keyPointColor",
        "getKeyPointColor",
        "()I",
        "setKeyPointColor",
        "(I)V",
        "barSize",
        "getBarSize",
        "setBarSize",
        "max",
        "F",
        "getMax",
        "()F",
        "setMax",
        "min",
        "getMin",
        "setMin",
        "seekBarColor",
        "getSeekBarColor",
        "setSeekBarColor",
        "mSeekLength",
        "mIsTouching",
        "Z",
        "mSeekBarRectF",
        "Landroid/graphics/RectF;",
        "progress",
        "getProgress",
        "setProgress",
        "trackColor",
        "getTrackColor",
        "setTrackColor",
        "mTrackRectF",
        "mTrackWidth",
        "thumbSize",
        "getThumbSize",
        "setThumbSize",
        "thumbColor",
        "getThumbColor",
        "setThumbColor",
        "mThumbRadius",
        "mTouchThumbRadius",
        "mThumbRect",
        "mThumbHeight",
        "maskProgress",
        "getMaskProgress",
        "setMaskProgress",
        "maskColor",
        "getMaskColor",
        "setMaskColor",
        "mMaskStrokeSize",
        "mMaskHeight",
        "mMaskRectF",
        "mMaskDecoratorSize",
        "mMaskDecoratorConner",
        "mTempRect",
        "mMaskLeftPath",
        "Landroid/graphics/Path;",
        "mMaskLeftIconPath",
        "mMaskRightPath",
        "mMaskRightLine",
        "mPaddingStart",
        "mPaddingTop",
        "mPaddingRight",
        "mPaddingBottom",
        "OnSeekChangeListener",
        "OnMaskChangeListener",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDoubleSeekBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleSeekBar.kt\ncom/zykj/view/widget/DoubleSeekBar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,595:1\n1869#2,2:596\n1869#2,2:598\n*S KotlinDebug\n*F\n+ 1 DoubleSeekBar.kt\ncom/zykj/view/widget/DoubleSeekBar\n*L\n289#1:596,2\n455#1:598,2\n*E\n"
    }
.end annotation


# instance fields
.field private barSize:I

.field private keyPointColor:I

.field private keyPointList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[J>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mCurrentTouchMode:I

.field private mIsTouching:Z

.field private final mKeyPointRectList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mMaskDecoratorConner:I

.field private mMaskDecoratorSize:I

.field private mMaskHeight:I

.field private final mMaskLeftIconPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mMaskLeftPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mMaskRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mMaskRightLine:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mMaskRightPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mMaskStrokeSize:F

.field private mPaddingBottom:F

.field private mPaddingRight:F

.field private mPaddingStart:F

.field private mPaddingTop:F

.field private final mPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mSeekBarRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mSeekLength:F

.field private final mTempRect:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mThumbHeight:I

.field private mThumbRadius:F

.field private final mThumbRect:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mTouchOffset:I

.field private mTouchThumbRadius:F

.field private mTrackRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mTrackWidth:I

.field private maskChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maskColor:I

.field private maskProgress:F

.field private max:F

.field private min:F

.field private progress:F

.field private seekBarColor:I

.field private seekChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private thumbColor:I

.field private thumbSize:I

.field private trackColor:I


# direct methods
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

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/widget/DoubleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/widget/DoubleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
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

    const/16 p1, 0x19

    .line 5
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTouchOffset:I

    .line 6
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    const/4 p1, -0x1

    .line 7
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mCurrentTouchMode:I

    .line 8
    sget-object p1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 9
    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->keyPointList:Ljava/util/List;

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mKeyPointRectList:Ljava/util/List;

    .line 11
    const-string p1, "#C8C9CC"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->keyPointColor:I

    const/4 p1, 0x6

    .line 12
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->barSize:I

    const/high16 p1, 0x42c80000    # 100.0f

    .line 13
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 14
    const-string p1, "#EBEDF0"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekBarColor:I

    .line 15
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekBarRectF:Landroid/graphics/RectF;

    .line 16
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->trackColor:I

    .line 17
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackRectF:Landroid/graphics/RectF;

    .line 18
    iget p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->barSize:I

    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackWidth:I

    const/16 p1, 0x9

    .line 19
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->thumbSize:I

    .line 20
    const-string p1, "#54576A"

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->thumbColor:I

    .line 21
    iget p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->thumbSize:I

    int-to-float p1, p1

    const/high16 p2, 0x3f000000    # 0.5f

    mul-float/2addr p1, p2

    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbRadius:F

    const p3, 0x3f99999a    # 1.2f

    mul-float/2addr p1, p3

    .line 22
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTouchThumbRadius:F

    .line 23
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbRect:Landroid/graphics/RectF;

    const/16 p1, 0x2f

    .line 24
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbHeight:I

    .line 25
    const-string p3, "#FF3B30"

    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskColor:I

    const/high16 p3, 0x40400000    # 3.0f

    .line 26
    iput p3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskStrokeSize:F

    .line 27
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskHeight:I

    .line 28
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    const/16 p1, 0x10

    .line 29
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorSize:I

    const/4 p1, 0x3

    .line 30
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorConner:I

    .line 31
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTempRect:Landroid/graphics/RectF;

    .line 32
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskLeftPath:Landroid/graphics/Path;

    .line 33
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskLeftIconPath:Landroid/graphics/Path;

    .line 34
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRightPath:Landroid/graphics/Path;

    .line 35
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRightLine:Landroid/graphics/Path;

    .line 36
    iget p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorSize:I

    int-to-float p3, p1

    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskStrokeSize:F

    add-float/2addr p3, v0

    iput p3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingStart:F

    mul-float p3, v0, p2

    .line 37
    iput p3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingTop:F

    int-to-float p1, p1

    add-float/2addr p1, v0

    .line 38
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingRight:F

    mul-float/2addr v0, p2

    .line 39
    iput v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingBottom:F

    .line 40
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->initPaint()V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/view/widget/DoubleSeekBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final calculateKeyPointLocation()V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->keyPointList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, [J

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    aget-wide v4, v2, v3

    .line 26
    .line 27
    long-to-float v4, v4

    .line 28
    iget v5, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 29
    .line 30
    cmpg-float v4, v4, v5

    .line 31
    .line 32
    if-ltz v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    aget-wide v5, v2, v4

    .line 36
    .line 37
    long-to-float v5, v5

    .line 38
    iget v6, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 39
    .line 40
    cmpl-float v5, v5, v6

    .line 41
    .line 42
    if-lez v5, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    new-instance v5, Landroid/graphics/RectF;

    .line 46
    .line 47
    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    .line 48
    .line 49
    .line 50
    iget v6, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingStart:F

    .line 51
    .line 52
    aget-wide v7, v2, v3

    .line 53
    .line 54
    long-to-float v3, v7

    .line 55
    iget v7, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 56
    .line 57
    sub-float/2addr v3, v7

    .line 58
    iget v8, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekLength:F

    .line 59
    .line 60
    mul-float/2addr v3, v8

    .line 61
    iget v9, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 62
    .line 63
    sub-float v10, v9, v7

    .line 64
    .line 65
    div-float/2addr v3, v10

    .line 66
    add-float/2addr v3, v6

    .line 67
    iput v3, v5, Landroid/graphics/RectF;->left:F

    .line 68
    .line 69
    aget-wide v3, v2, v4

    .line 70
    .line 71
    long-to-float v2, v3

    .line 72
    sub-float/2addr v2, v7

    .line 73
    mul-float/2addr v2, v8

    .line 74
    sub-float/2addr v9, v7

    .line 75
    div-float/2addr v2, v9

    .line 76
    add-float/2addr v2, v6

    .line 77
    iput v2, v5, Landroid/graphics/RectF;->right:F

    .line 78
    .line 79
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingTop:F

    .line 80
    .line 81
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskHeight:I

    .line 82
    .line 83
    iget v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackWidth:I

    .line 84
    .line 85
    sub-int/2addr v3, v4

    .line 86
    int-to-float v3, v3

    .line 87
    const/4 v6, 0x2

    .line 88
    int-to-float v6, v6

    .line 89
    div-float/2addr v3, v6

    .line 90
    add-float/2addr v3, v2

    .line 91
    iput v3, v5, Landroid/graphics/RectF;->top:F

    .line 92
    .line 93
    int-to-float v2, v4

    .line 94
    add-float/2addr v3, v2

    .line 95
    iput v3, v5, Landroid/graphics/RectF;->bottom:F

    .line 96
    .line 97
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    :goto_1
    return-void

    .line 102
    :cond_2
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mKeyPointRectList:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mKeyPointRectList:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method private final calculateLineInRectF(Landroid/graphics/RectF;)Landroid/graphics/Path;
    .locals 9

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    add-float v3, v1, v2

    .line 15
    .line 16
    const/16 v4, 0xa

    .line 17
    .line 18
    :goto_0
    int-to-float v5, v4

    .line 19
    cmpg-float v6, v5, v3

    .line 20
    .line 21
    if-gez v6, :cond_3

    .line 22
    .line 23
    cmpl-float v6, v5, v1

    .line 24
    .line 25
    if-lez v6, :cond_0

    .line 26
    .line 27
    cmpg-float v7, v5, v2

    .line 28
    .line 29
    if-gez v7, :cond_0

    .line 30
    .line 31
    iget v6, p1, Landroid/graphics/RectF;->left:F

    .line 32
    .line 33
    iget v7, p1, Landroid/graphics/RectF;->bottom:F

    .line 34
    .line 35
    sub-float v8, v5, v1

    .line 36
    .line 37
    sub-float/2addr v7, v8

    .line 38
    invoke-virtual {v0, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 39
    .line 40
    .line 41
    iget v6, p1, Landroid/graphics/RectF;->right:F

    .line 42
    .line 43
    iget v7, p1, Landroid/graphics/RectF;->bottom:F

    .line 44
    .line 45
    sub-float/2addr v7, v5

    .line 46
    invoke-virtual {v0, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    cmpg-float v7, v5, v2

    .line 51
    .line 52
    if-gez v7, :cond_1

    .line 53
    .line 54
    iget v6, p1, Landroid/graphics/RectF;->right:F

    .line 55
    .line 56
    sub-float/2addr v6, v5

    .line 57
    iget v7, p1, Landroid/graphics/RectF;->bottom:F

    .line 58
    .line 59
    invoke-virtual {v0, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 60
    .line 61
    .line 62
    iget v6, p1, Landroid/graphics/RectF;->right:F

    .line 63
    .line 64
    iget v7, p1, Landroid/graphics/RectF;->bottom:F

    .line 65
    .line 66
    sub-float/2addr v7, v5

    .line 67
    invoke-virtual {v0, v6, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    if-lez v6, :cond_2

    .line 72
    .line 73
    iget v6, p1, Landroid/graphics/RectF;->left:F

    .line 74
    .line 75
    iget v7, p1, Landroid/graphics/RectF;->bottom:F

    .line 76
    .line 77
    sub-float v8, v5, v1

    .line 78
    .line 79
    sub-float/2addr v7, v8

    .line 80
    invoke-virtual {v0, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 81
    .line 82
    .line 83
    iget v6, p1, Landroid/graphics/RectF;->right:F

    .line 84
    .line 85
    sub-float/2addr v5, v2

    .line 86
    sub-float/2addr v6, v5

    .line 87
    iget v5, p1, Landroid/graphics/RectF;->top:F

    .line 88
    .line 89
    invoke-virtual {v0, v6, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    iget v6, p1, Landroid/graphics/RectF;->right:F

    .line 94
    .line 95
    sub-float/2addr v6, v5

    .line 96
    iget v7, p1, Landroid/graphics/RectF;->bottom:F

    .line 97
    .line 98
    invoke-virtual {v0, v6, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 99
    .line 100
    .line 101
    iget v6, p1, Landroid/graphics/RectF;->right:F

    .line 102
    .line 103
    sub-float/2addr v5, v2

    .line 104
    sub-float/2addr v6, v5

    .line 105
    iget v5, p1, Landroid/graphics/RectF;->top:F

    .line 106
    .line 107
    invoke-virtual {v0, v6, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 108
    .line 109
    .line 110
    :goto_1
    add-int/lit8 v4, v4, 0xa

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    return-object v0
.end method

.method private final calculateMaskLocation()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingStart:F

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskProgress:F

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 8
    .line 9
    sub-float/2addr v2, v3

    .line 10
    iget v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekLength:F

    .line 11
    .line 12
    mul-float/2addr v2, v4

    .line 13
    iget v5, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 14
    .line 15
    sub-float/2addr v5, v3

    .line 16
    div-float/2addr v2, v5

    .line 17
    add-float/2addr v2, v1

    .line 18
    iput v2, v0, Landroid/graphics/RectF;->left:F

    .line 19
    .line 20
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingTop:F

    .line 21
    .line 22
    iput v3, v0, Landroid/graphics/RectF;->top:F

    .line 23
    .line 24
    add-float/2addr v1, v4

    .line 25
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 26
    .line 27
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskHeight:I

    .line 28
    .line 29
    int-to-float v1, v1

    .line 30
    add-float/2addr v1, v3

    .line 31
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 32
    .line 33
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskStrokeSize:F

    .line 34
    .line 35
    const/high16 v4, 0x3f000000    # 0.5f

    .line 36
    .line 37
    mul-float v5, v0, v4

    .line 38
    .line 39
    sub-float v5, v2, v5

    .line 40
    .line 41
    iget v6, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorSize:I

    .line 42
    .line 43
    int-to-float v6, v6

    .line 44
    sub-float/2addr v5, v6

    .line 45
    mul-float/2addr v0, v4

    .line 46
    sub-float/2addr v2, v0

    .line 47
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskLeftPath:Landroid/graphics/Path;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 56
    .line 57
    .line 58
    iget v6, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorConner:I

    .line 59
    .line 60
    int-to-float v6, v6

    .line 61
    add-float/2addr v6, v5

    .line 62
    invoke-virtual {v0, v6, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 63
    .line 64
    .line 65
    iget-object v6, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTempRect:Landroid/graphics/RectF;

    .line 66
    .line 67
    iget v7, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorConner:I

    .line 68
    .line 69
    mul-int/lit8 v8, v7, 0x2

    .line 70
    .line 71
    int-to-float v8, v8

    .line 72
    sub-float v8, v1, v8

    .line 73
    .line 74
    mul-int/lit8 v7, v7, 0x2

    .line 75
    .line 76
    int-to-float v7, v7

    .line 77
    add-float/2addr v7, v5

    .line 78
    invoke-virtual {v6, v5, v8, v7, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTempRect:Landroid/graphics/RectF;

    .line 82
    .line 83
    const/high16 v6, 0x42b40000    # 90.0f

    .line 84
    .line 85
    invoke-virtual {v0, v1, v6, v6}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 86
    .line 87
    .line 88
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorConner:I

    .line 89
    .line 90
    int-to-float v1, v1

    .line 91
    add-float/2addr v1, v3

    .line 92
    invoke-virtual {v0, v5, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTempRect:Landroid/graphics/RectF;

    .line 96
    .line 97
    iget v7, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorConner:I

    .line 98
    .line 99
    mul-int/lit8 v8, v7, 0x2

    .line 100
    .line 101
    int-to-float v8, v8

    .line 102
    add-float/2addr v8, v5

    .line 103
    mul-int/lit8 v7, v7, 0x2

    .line 104
    .line 105
    int-to-float v7, v7

    .line 106
    add-float/2addr v7, v3

    .line 107
    invoke-virtual {v1, v5, v3, v8, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTempRect:Landroid/graphics/RectF;

    .line 111
    .line 112
    const/high16 v7, 0x43340000    # 180.0f

    .line 113
    .line 114
    invoke-virtual {v0, v1, v7, v6}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskLeftIconPath:Landroid/graphics/Path;

    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 123
    .line 124
    .line 125
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorSize:I

    .line 126
    .line 127
    div-int/lit8 v1, v1, 0x4

    .line 128
    .line 129
    int-to-float v1, v1

    .line 130
    sub-float v1, v2, v1

    .line 131
    .line 132
    iget-object v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 133
    .line 134
    invoke-virtual {v3}, Landroid/graphics/RectF;->centerY()F

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    iget v7, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorSize:I

    .line 139
    .line 140
    div-int/lit8 v7, v7, 0x2

    .line 141
    .line 142
    int-to-float v7, v7

    .line 143
    sub-float/2addr v3, v7

    .line 144
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 145
    .line 146
    .line 147
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorSize:I

    .line 148
    .line 149
    div-int/lit8 v1, v1, 0x4

    .line 150
    .line 151
    int-to-float v1, v1

    .line 152
    add-float/2addr v5, v1

    .line 153
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 154
    .line 155
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-virtual {v0, v5, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 160
    .line 161
    .line 162
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorSize:I

    .line 163
    .line 164
    div-int/lit8 v1, v1, 0x4

    .line 165
    .line 166
    int-to-float v1, v1

    .line 167
    sub-float/2addr v2, v1

    .line 168
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 169
    .line 170
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorSize:I

    .line 175
    .line 176
    div-int/lit8 v3, v3, 0x2

    .line 177
    .line 178
    int-to-float v3, v3

    .line 179
    add-float/2addr v1, v3

    .line 180
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 181
    .line 182
    .line 183
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 184
    .line 185
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 186
    .line 187
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskStrokeSize:F

    .line 188
    .line 189
    mul-float v3, v2, v4

    .line 190
    .line 191
    add-float/2addr v3, v1

    .line 192
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 193
    .line 194
    mul-float/2addr v2, v4

    .line 195
    add-float/2addr v2, v1

    .line 196
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorSize:I

    .line 197
    .line 198
    int-to-float v1, v1

    .line 199
    add-float/2addr v2, v1

    .line 200
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 201
    .line 202
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRightPath:Landroid/graphics/Path;

    .line 203
    .line 204
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v3, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v3, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 211
    .line 212
    .line 213
    iget v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorConner:I

    .line 214
    .line 215
    int-to-float v4, v4

    .line 216
    sub-float v4, v2, v4

    .line 217
    .line 218
    invoke-virtual {v1, v4, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 219
    .line 220
    .line 221
    iget-object v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTempRect:Landroid/graphics/RectF;

    .line 222
    .line 223
    iget v7, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorConner:I

    .line 224
    .line 225
    mul-int/lit8 v8, v7, 0x2

    .line 226
    .line 227
    int-to-float v8, v8

    .line 228
    sub-float v8, v2, v8

    .line 229
    .line 230
    mul-int/lit8 v7, v7, 0x2

    .line 231
    .line 232
    int-to-float v7, v7

    .line 233
    sub-float v7, v0, v7

    .line 234
    .line 235
    invoke-virtual {v4, v8, v7, v2, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 236
    .line 237
    .line 238
    iget-object v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTempRect:Landroid/graphics/RectF;

    .line 239
    .line 240
    const/high16 v7, -0x3d4c0000    # -90.0f

    .line 241
    .line 242
    invoke-virtual {v1, v4, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 243
    .line 244
    .line 245
    iget v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorConner:I

    .line 246
    .line 247
    int-to-float v4, v4

    .line 248
    add-float/2addr v4, v5

    .line 249
    invoke-virtual {v1, v2, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 250
    .line 251
    .line 252
    iget-object v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTempRect:Landroid/graphics/RectF;

    .line 253
    .line 254
    iget v6, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskDecoratorConner:I

    .line 255
    .line 256
    mul-int/lit8 v8, v6, 0x2

    .line 257
    .line 258
    int-to-float v8, v8

    .line 259
    sub-float v8, v2, v8

    .line 260
    .line 261
    mul-int/lit8 v6, v6, 0x2

    .line 262
    .line 263
    int-to-float v6, v6

    .line 264
    add-float/2addr v6, v5

    .line 265
    invoke-virtual {v4, v8, v5, v2, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 266
    .line 267
    .line 268
    iget-object v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTempRect:Landroid/graphics/RectF;

    .line 269
    .line 270
    const/4 v6, 0x0

    .line 271
    invoke-virtual {v1, v4, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 275
    .line 276
    .line 277
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRightLine:Landroid/graphics/Path;

    .line 278
    .line 279
    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 280
    .line 281
    .line 282
    new-instance v4, Landroid/graphics/RectF;

    .line 283
    .line 284
    invoke-direct {v4, v3, v5, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 285
    .line 286
    .line 287
    invoke-direct {p0, v4}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateLineInRectF(Landroid/graphics/RectF;)Landroid/graphics/Path;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v1, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    .line 292
    .line 293
    .line 294
    return-void
.end method

.method private final calculateThumbLocation()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbRect:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingStart:F

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->progress:F

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 8
    .line 9
    sub-float/2addr v2, v3

    .line 10
    iget v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekLength:F

    .line 11
    .line 12
    mul-float/2addr v2, v4

    .line 13
    iget v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 14
    .line 15
    sub-float/2addr v4, v3

    .line 16
    div-float/2addr v2, v4

    .line 17
    add-float/2addr v2, v1

    .line 18
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbRadius:F

    .line 19
    .line 20
    sub-float/2addr v2, v1

    .line 21
    iput v2, v0, Landroid/graphics/RectF;->left:F

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    int-to-float v3, v3

    .line 25
    mul-float/2addr v1, v3

    .line 26
    add-float/2addr v1, v2

    .line 27
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 28
    .line 29
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingTop:F

    .line 30
    .line 31
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 32
    .line 33
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbHeight:I

    .line 34
    .line 35
    int-to-float v2, v2

    .line 36
    add-float/2addr v1, v2

    .line 37
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 38
    .line 39
    return-void
.end method

.method private final calculateTrackLocation()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingStart:F

    .line 4
    .line 5
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 6
    .line 7
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->progress:F

    .line 8
    .line 9
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 10
    .line 11
    sub-float/2addr v2, v3

    .line 12
    iget v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekLength:F

    .line 13
    .line 14
    mul-float/2addr v2, v4

    .line 15
    iget v5, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 16
    .line 17
    sub-float/2addr v5, v3

    .line 18
    div-float/2addr v2, v5

    .line 19
    add-float/2addr v2, v1

    .line 20
    iput v2, v0, Landroid/graphics/RectF;->right:F

    .line 21
    .line 22
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingTop:F

    .line 23
    .line 24
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskHeight:I

    .line 25
    .line 26
    iget v5, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackWidth:I

    .line 27
    .line 28
    sub-int/2addr v3, v5

    .line 29
    int-to-float v3, v3

    .line 30
    const/4 v6, 0x2

    .line 31
    int-to-float v6, v6

    .line 32
    div-float/2addr v3, v6

    .line 33
    add-float/2addr v3, v1

    .line 34
    iput v3, v0, Landroid/graphics/RectF;->top:F

    .line 35
    .line 36
    int-to-float v1, v5

    .line 37
    add-float/2addr v1, v3

    .line 38
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 39
    .line 40
    iget-object v5, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekBarRectF:Landroid/graphics/RectF;

    .line 41
    .line 42
    iput v2, v5, Landroid/graphics/RectF;->left:F

    .line 43
    .line 44
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 45
    .line 46
    add-float/2addr v0, v4

    .line 47
    iput v0, v5, Landroid/graphics/RectF;->right:F

    .line 48
    .line 49
    iput v3, v5, Landroid/graphics/RectF;->top:F

    .line 50
    .line 51
    iput v1, v5, Landroid/graphics/RectF;->bottom:F

    .line 52
    .line 53
    return-void
.end method

.method private final drawKeyPoint(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->keyPointColor:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mKeyPointRectList:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/graphics/RectF;

    .line 32
    .line 33
    iget-object v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 34
    .line 35
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method private final drawMask(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskColor:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskStrokeSize:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 16
    .line 17
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 30
    .line 31
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskStrokeSize:F

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 37
    .line 38
    sget-object v2, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskLeftPath:Landroid/graphics/Path;

    .line 44
    .line 45
    iget-object v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 46
    .line 47
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 51
    .line 52
    const/4 v2, -0x1

    .line 53
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 57
    .line 58
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskStrokeSize:F

    .line 59
    .line 60
    const/4 v3, 0x2

    .line 61
    int-to-float v3, v3

    .line 62
    div-float/2addr v2, v3

    .line 63
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskLeftIconPath:Landroid/graphics/Path;

    .line 72
    .line 73
    iget-object v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 74
    .line 75
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 79
    .line 80
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskColor:I

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 86
    .line 87
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskStrokeSize:F

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRightPath:Landroid/graphics/Path;

    .line 98
    .line 99
    iget-object v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 100
    .line 101
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 105
    .line 106
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskStrokeSize:F

    .line 107
    .line 108
    div-float/2addr v2, v3

    .line 109
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRightLine:Landroid/graphics/Path;

    .line 118
    .line 119
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 120
    .line 121
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method private final drawThumb(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->thumbColor:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 9
    .line 10
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbRect:Landroid/graphics/RectF;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v2, "rect -> "

    .line 20
    .line 21
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "drawThumb"

    .line 32
    .line 33
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbRect:Landroid/graphics/RectF;

    .line 37
    .line 38
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbRadius:F

    .line 39
    .line 40
    iget-object v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 41
    .line 42
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private final drawTrack(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 9
    .line 10
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 11
    .line 12
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackRectF:Landroid/graphics/RectF;

    .line 13
    .line 14
    iget v1, v1, Landroid/graphics/RectF;->right:F

    .line 15
    .line 16
    cmpg-float v0, v0, v1

    .line 17
    .line 18
    if-gtz v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/RectF;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackRectF:Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 28
    .line 29
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 30
    .line 31
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 32
    .line 33
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 34
    .line 35
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekBarColor:I

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Landroid/graphics/RectF;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackRectF:Landroid/graphics/RectF;

    .line 48
    .line 49
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 53
    .line 54
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 55
    .line 56
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 57
    .line 58
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 59
    .line 60
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->trackColor:I

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 66
    .line 67
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 72
    .line 73
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->trackColor:I

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackRectF:Landroid/graphics/RectF;

    .line 79
    .line 80
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 81
    .line 82
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 86
    .line 87
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekBarColor:I

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekBarRectF:Landroid/graphics/RectF;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 95
    .line 96
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method private final handleTouchMode(FF)I
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingStart:F

    .line 7
    .line 8
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTouchOffset:I

    .line 9
    .line 10
    int-to-float v3, v2

    .line 11
    sub-float v3, v1, v3

    .line 12
    .line 13
    iput v3, v0, Landroid/graphics/RectF;->left:F

    .line 14
    .line 15
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingTop:F

    .line 16
    .line 17
    int-to-float v4, v2

    .line 18
    sub-float v4, v3, v4

    .line 19
    .line 20
    iput v4, v0, Landroid/graphics/RectF;->top:F

    .line 21
    .line 22
    iget v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekLength:F

    .line 23
    .line 24
    add-float/2addr v1, v4

    .line 25
    int-to-float v4, v2

    .line 26
    add-float/2addr v1, v4

    .line 27
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 28
    .line 29
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbHeight:I

    .line 30
    .line 31
    int-to-float v1, v1

    .line 32
    add-float/2addr v3, v1

    .line 33
    int-to-float v1, v2

    .line 34
    add-float/2addr v3, v1

    .line 35
    iput v3, v0, Landroid/graphics/RectF;->bottom:F

    .line 36
    .line 37
    new-instance v1, Landroid/graphics/RectF;

    .line 38
    .line 39
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskRectF:Landroid/graphics/RectF;

    .line 43
    .line 44
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 45
    .line 46
    iget v4, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTouchOffset:I

    .line 47
    .line 48
    int-to-float v5, v4

    .line 49
    sub-float/2addr v3, v5

    .line 50
    iput v3, v1, Landroid/graphics/RectF;->left:F

    .line 51
    .line 52
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    int-to-float v5, v4

    .line 55
    sub-float/2addr v3, v5

    .line 56
    iput v3, v1, Landroid/graphics/RectF;->top:F

    .line 57
    .line 58
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 59
    .line 60
    int-to-float v5, v4

    .line 61
    add-float/2addr v3, v5

    .line 62
    iput v3, v1, Landroid/graphics/RectF;->right:F

    .line 63
    .line 64
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 65
    .line 66
    int-to-float v3, v4

    .line 67
    add-float/2addr v2, v3

    .line 68
    iput v2, v1, Landroid/graphics/RectF;->bottom:F

    .line 69
    .line 70
    invoke-virtual {v1, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    const/4 p1, 0x1

    .line 77
    return p1

    .line 78
    :cond_0
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_1

    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    return p1

    .line 86
    :cond_1
    const/4 p1, -0x1

    .line 87
    return p1
.end method

.method private final initPaint()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaint:Landroid/graphics/Paint;

    .line 2
    .line 3
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final refreshMask(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    cmpl-float v2, p1, v1

    .line 6
    .line 7
    if-ltz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekBarRectF:Landroid/graphics/RectF;

    .line 10
    .line 11
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 12
    .line 13
    cmpg-float v2, p1, v2

    .line 14
    .line 15
    if-gtz v2, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 18
    .line 19
    sub-float/2addr p1, v1

    .line 20
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 21
    .line 22
    sub-float/2addr v1, v0

    .line 23
    mul-float/2addr v1, p1

    .line 24
    iget p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekLength:F

    .line 25
    .line 26
    div-float/2addr v1, p1

    .line 27
    add-float/2addr v1, v0

    .line 28
    invoke-virtual {p0, v1}, Lcom/zykj/view/widget/DoubleSeekBar;->setMaskProgress(F)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    cmpg-float v1, p1, v1

    .line 33
    .line 34
    if-gez v1, :cond_1

    .line 35
    .line 36
    iget p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->setMaskProgress(F)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 43
    .line 44
    cmpl-float p1, p1, v0

    .line 45
    .line 46
    if-lez p1, :cond_2

    .line 47
    .line 48
    iget p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->setMaskProgress(F)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method private final refreshSeekBar(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackRectF:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    cmpl-float v2, p1, v1

    .line 6
    .line 7
    if-ltz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekBarRectF:Landroid/graphics/RectF;

    .line 10
    .line 11
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 12
    .line 13
    cmpg-float v2, p1, v2

    .line 14
    .line 15
    if-gtz v2, :cond_0

    .line 16
    .line 17
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 18
    .line 19
    sub-float/2addr p1, v1

    .line 20
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 21
    .line 22
    sub-float/2addr v1, v0

    .line 23
    mul-float/2addr v1, p1

    .line 24
    iget p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekLength:F

    .line 25
    .line 26
    div-float/2addr v1, p1

    .line 27
    add-float/2addr v1, v0

    .line 28
    invoke-virtual {p0, v1}, Lcom/zykj/view/widget/DoubleSeekBar;->setProgress(F)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    cmpg-float v1, p1, v1

    .line 33
    .line 34
    if-gez v1, :cond_1

    .line 35
    .line 36
    iget p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->setProgress(F)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 43
    .line 44
    cmpl-float p1, p1, v0

    .line 45
    .line 46
    if-lez p1, :cond_2

    .line 47
    .line 48
    iget p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->setProgress(F)V

    .line 51
    .line 52
    .line 53
    :cond_2
    return-void
.end method


# virtual methods
.method public final getBarSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->barSize:I

    .line 2
    .line 3
    return v0
.end method

.method public final getKeyPointColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->keyPointColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getKeyPointList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[J>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->keyPointList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaskChangeListener()Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaskColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getMaskProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskProgress:F

    .line 2
    .line 3
    return v0
.end method

.method public final getMax()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 2
    .line 3
    return v0
.end method

.method public final getMin()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 2
    .line 3
    return v0
.end method

.method public final getProgress()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->progress:F

    .line 2
    .line 3
    return v0
.end method

.method public final getSeekBarColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekBarColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getSeekChangeListener()Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getThumbColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->thumbColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getThumbSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->thumbSize:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTrackColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->trackColor:I

    .line 2
    .line 3
    return v0
.end method

.method public declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "canvas"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->drawTrack(Landroid/graphics/Canvas;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->drawKeyPoint(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->drawMask(Landroid/graphics/Canvas;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->drawThumb(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public declared-synchronized onMeasure(II)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingStart:F

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    int-to-float v2, v2

    .line 21
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iput v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingStart:F

    .line 26
    .line 27
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingTop:F

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    int-to-float v2, v2

    .line 34
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iput v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingTop:F

    .line 39
    .line 40
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingRight:F

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    int-to-float v2, v2

    .line 47
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iput v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingRight:F

    .line 52
    .line 53
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingBottom:F

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    int-to-float v2, v2

    .line 60
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    iput v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingBottom:F

    .line 65
    .line 66
    int-to-float v2, p1

    .line 67
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingStart:F

    .line 68
    .line 69
    sub-float/2addr v2, v3

    .line 70
    iget v3, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingRight:F

    .line 71
    .line 72
    sub-float/2addr v2, v3

    .line 73
    iput v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mSeekLength:F

    .line 74
    .line 75
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mPaddingTop:F

    .line 76
    .line 77
    add-float/2addr v2, v1

    .line 78
    float-to-int v1, v2

    .line 79
    const/high16 v2, 0x40000000    # 2.0f

    .line 80
    .line 81
    if-ne v0, v2, :cond_0

    .line 82
    .line 83
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskHeight:I

    .line 84
    .line 85
    sub-int/2addr p2, v1

    .line 86
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    iput p2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskHeight:I

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto :goto_1

    .line 95
    :cond_0
    :goto_0
    iget p2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mMaskHeight:I

    .line 96
    .line 97
    iput p2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbHeight:I

    .line 98
    .line 99
    add-int/2addr p2, v1

    .line 100
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateTrackLocation()V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateThumbLocation()V

    .line 107
    .line 108
    .line 109
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateMaskLocation()V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateKeyPointLocation()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    monitor-exit p0

    .line 116
    return-void

    .line 117
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    throw p1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1
    .param p1    # Landroid/os/Parcelable;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Landroid/os/Bundle;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Landroid/os/Bundle;

    .line 11
    .line 12
    const-string v0, "seek_bar_progress"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->setProgress(F)V

    .line 19
    .line 20
    .line 21
    const-string v0, "seek_bar_mask_progress"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p0, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->setMaskProgress(F)V

    .line 28
    .line 29
    .line 30
    const-string v0, "seek_bar_state"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "seek_bar_state"

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "seek_bar_progress"

    .line 16
    .line 17
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->progress:F

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 20
    .line 21
    .line 22
    const-string v1, "seek_bar_mask_progress"

    .line 23
    .line 24
    iget v2, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskProgress:F

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v0, v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-eq v0, v2, :cond_3

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mCurrentTouchMode:I

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-direct {p0, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->refreshMask(F)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;

    .line 37
    .line 38
    if-eqz v0, :cond_7

    .line 39
    .line 40
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->progress:F

    .line 41
    .line 42
    invoke-interface {v0, p0, v1}, Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;->onSeeking(Lcom/zykj/view/widget/DoubleSeekBar;F)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-direct {p0, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->refreshSeekBar(F)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;

    .line 54
    .line 55
    if-eqz v0, :cond_7

    .line 56
    .line 57
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->progress:F

    .line 58
    .line 59
    invoke-interface {v0, p0, v1}, Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;->onSeeking(Lcom/zykj/view/widget/DoubleSeekBar;F)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mCurrentTouchMode:I

    .line 64
    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    if-eq v0, v1, :cond_4

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-direct {p0, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->refreshMask(F)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;

    .line 78
    .line 79
    if-eqz v0, :cond_7

    .line 80
    .line 81
    invoke-interface {v0, p0}, Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;->onStopTrackingTouch(Lcom/zykj/view/widget/DoubleSeekBar;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    const/4 v0, 0x0

    .line 86
    iput-boolean v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mIsTouching:Z

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-direct {p0, v0}, Lcom/zykj/view/widget/DoubleSeekBar;->refreshSeekBar(F)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;

    .line 96
    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    invoke-interface {v0, p0}, Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;->onStopTrackingTouch(Lcom/zykj/view/widget/DoubleSeekBar;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-direct {p0, v0, v2}, Lcom/zykj/view/widget/DoubleSeekBar;->handleTouchMode(FF)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iput v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mCurrentTouchMode:I

    .line 116
    .line 117
    if-eqz v0, :cond_a

    .line 118
    .line 119
    if-eq v0, v1, :cond_8

    .line 120
    .line 121
    :cond_7
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    return p1

    .line 126
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->refreshMask(F)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;

    .line 134
    .line 135
    if-eqz p1, :cond_9

    .line 136
    .line 137
    invoke-interface {p1, p0}, Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;->onStartTrackingTouch(Lcom/zykj/view/widget/DoubleSeekBar;)V

    .line 138
    .line 139
    .line 140
    :cond_9
    return v1

    .line 141
    :cond_a
    iput-boolean v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mIsTouching:Z

    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    invoke-direct {p0, p1}, Lcom/zykj/view/widget/DoubleSeekBar;->refreshSeekBar(F)V

    .line 148
    .line 149
    .line 150
    iget-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;

    .line 151
    .line 152
    if-eqz p1, :cond_b

    .line 153
    .line 154
    invoke-interface {p1, p0}, Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;->onStartTrackingTouch(Lcom/zykj/view/widget/DoubleSeekBar;)V

    .line 155
    .line 156
    .line 157
    :cond_b
    return v1
.end method

.method public final setBarSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->barSize:I

    .line 2
    .line 3
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTrackWidth:I

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateTrackLocation()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateKeyPointLocation()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setKeyPointColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->keyPointColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setKeyPointList(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[J>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->keyPointList:Ljava/util/List;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateTrackLocation()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setMaskChangeListener(Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;)V
    .locals 0
    .param p1    # Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnMaskChangeListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setMaskColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setMaskProgress(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->maskProgress:F

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateMaskLocation()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setMax(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateTrackLocation()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateThumbLocation()V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateKeyPointLocation()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final setMin(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/widget/DoubleSeekBar;->max:F

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->min:F

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateTrackLocation()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateThumbLocation()V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateKeyPointLocation()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final setProgress(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->progress:F

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateTrackLocation()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateThumbLocation()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setSeekBarColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekBarColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSeekChangeListener(Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;)V
    .locals 0
    .param p1    # Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->seekChangeListener:Lcom/zykj/view/widget/DoubleSeekBar$OnSeekChangeListener;

    .line 2
    .line 3
    return-void
.end method

.method public final setThumbColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->thumbColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setThumbSize(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->thumbSize:I

    .line 2
    .line 3
    int-to-float p1, p1

    .line 4
    const/high16 v0, 0x3f000000    # 0.5f

    .line 5
    .line 6
    mul-float/2addr p1, v0

    .line 7
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mThumbRadius:F

    .line 8
    .line 9
    const v0, 0x3f99999a    # 1.2f

    .line 10
    .line 11
    .line 12
    mul-float/2addr p1, v0

    .line 13
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->mTouchThumbRadius:F

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/zykj/view/widget/DoubleSeekBar;->calculateThumbLocation()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setTrackColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/view/widget/DoubleSeekBar;->trackColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
