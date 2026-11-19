# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/merge/sketch/view/MergeSketchPlayView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007JL\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00082!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u000e\u0012\u0004\u0012\u00020\u000f0\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ[\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000b2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u001f\u0012\u0004\u0012\u00020\u000f0\n2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(!\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010%\u001a\u0004\u0018\u00010$\u00a2\u0006\u0004\u0008%\u0010&J\r\u0010\'\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\'\u0010\u001bJ\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(\u00a2\u0006\u0004\u0008)\u0010*J\r\u0010+\u001a\u00020\u000f\u00a2\u0006\u0004\u0008+\u0010\u001bJ\r\u0010,\u001a\u00020\u000f\u00a2\u0006\u0004\u0008,\u0010\u001bJ\r\u0010-\u001a\u00020\u000f\u00a2\u0006\u0004\u0008-\u0010\u001bJ\u0015\u00100\u001a\u00020(2\u0006\u0010/\u001a\u00020.\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u00082\u00103J\u0017\u00105\u001a\u00020\u000f2\u0008\u0010\u0016\u001a\u0004\u0018\u000104\u00a2\u0006\u0004\u00085\u00106J\r\u00107\u001a\u00020\u000f\u00a2\u0006\u0004\u00087\u0010\u001bJ%\u0010;\u001a\u00020\u000f2\n\u0008\u0002\u00109\u001a\u0004\u0018\u0001082\n\u0008\u0002\u0010:\u001a\u0004\u0018\u000108\u00a2\u0006\u0004\u0008;\u0010<J%\u0010=\u001a\u00020\u000f2\n\u0008\u0002\u00109\u001a\u0004\u0018\u0001082\n\u0008\u0002\u0010:\u001a\u0004\u0018\u000108\u00a2\u0006\u0004\u0008=\u0010<J\r\u0010>\u001a\u000208\u00a2\u0006\u0004\u0008>\u0010?J\r\u0010@\u001a\u000208\u00a2\u0006\u0004\u0008@\u0010?J\r\u0010A\u001a\u00020\u000b\u00a2\u0006\u0004\u0008A\u0010BJ\r\u0010C\u001a\u00020\u000b\u00a2\u0006\u0004\u0008C\u0010BJ\u0015\u0010E\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020(\u00a2\u0006\u0004\u0008E\u0010*J\u0015\u0010F\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020(\u00a2\u0006\u0004\u0008F\u0010*J\u000f\u0010H\u001a\u0004\u0018\u00010G\u00a2\u0006\u0004\u0008H\u0010IR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010M\u00a8\u0006N"
    }
    d2 = {
        "Lcom/zykj/merge/sketch/view/MergeSketchPlayView;",
        "Landroid/widget/RelativeLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attributeSet",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "path",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "duration",
        "",
        "onSucceed",
        "",
        "onFailure",
        "loadData",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Lcom/zykj/merge/sketch/listener/PlayStatusListener;",
        "listener",
        "addPlayActionListener",
        "(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V",
        "removePlayActionListener",
        "start",
        "()V",
        "pause",
        "waiting",
        "position",
        "progress",
        "onSuccess",
        "throwable",
        "seekTo",
        "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "Lcom/zykj/merge/sketch/constant/PlayStatus;",
        "status",
        "()Lcom/zykj/merge/sketch/constant/PlayStatus;",
        "resume",
        "",
        "isRend",
        "(Z)V",
        "reset",
        "release",
        "destroy",
        "",
        "rate",
        "setRate",
        "(D)Z",
        "getPath",
        "()Ljava/lang/String;",
        "Ls5/d;",
        "setAreaMoveListener",
        "(Ls5/d;)V",
        "areaMoveStart",
        "",
        "horizontalProgress",
        "verticalProgress",
        "areaMoving",
        "(Ljava/lang/Float;Ljava/lang/Float;)V",
        "areaMoveEnd",
        "getMoveVerticalProgress",
        "()F",
        "getMoveHorizontalProgress",
        "getMoveMaxHeightTimes",
        "()I",
        "getMoveMaxWidthTimes",
        "isEnable",
        "setTranslateEnable",
        "setScaleEnable",
        "Landroid/graphics/Bitmap;",
        "getScreenBitmap",
        "()Landroid/graphics/Bitmap;",
        "Landroid/util/AttributeSet;",
        "Lcom/zykj/merge/sketch/listener/Play;",
        "mRecord",
        "Lcom/zykj/merge/sketch/listener/Play;",
        "merge_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public _$_findViewCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final attributeSet:Landroid/util/AttributeSet;

.field private mRecord:Lcom/zykj/merge/sketch/listener/Play;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->attributeSet:Landroid/util/AttributeSet;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic areaMoveEnd$default(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic areaMoving$default(Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->_$_findViewCache:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final addPlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/zykj/merge/sketch/listener/Play;->addPlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Lcom/zykj/merge/sketch/listener/MoveProxy;->areaMoveEnd(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final areaMoveStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/MoveProxy;->areaMoveStart()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Lcom/zykj/merge/sketch/listener/MoveProxy;->areaMoving(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/Play;->destroy()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final getMoveHorizontalProgress()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/MoveProxy;->getMoveHorizontalProgress()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final getMoveMaxHeightTimes()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/MoveProxy;->getMoveMaxHeightTimes()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final getMoveMaxWidthTimes()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/MoveProxy;->getMoveMaxWidthTimes()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final getMoveVerticalProgress()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/MoveProxy;->getMoveVerticalProgress()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/Play;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final getScreenBitmap()Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/MoveProxy;->getCurrentScreenBitmap()Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public final isRend(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/zykj/merge/sketch/listener/Play;->isRend(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final loadData(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "\u6ca1\u6709\u5408\u9002\u7684\u753b\u677f\u52a0\u8f7d"

    .line 2
    .line 3
    const-string v1, "context"

    .line 4
    .line 5
    const-string v2, "path"

    .line 6
    .line 7
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "onSucceed"

    .line 11
    .line 12
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "onFailure"

    .line 16
    .line 17
    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    :try_start_0
    new-instance v3, Ljava/io/File;

    .line 22
    .line 23
    const-string v4, "header.bin"

    .line 24
    .line 25
    invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    new-instance v3, Lcom/zykj/merge/sketch/view/NewSketchProxyView;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v5, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->attributeSet:Landroid/util/AttributeSet;

    .line 44
    .line 45
    invoke-direct {v3, v4, v5}, Lcom/zykj/merge/sketch/view/NewSketchProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 46
    .line 47
    .line 48
    iput-object v3, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :catch_0
    move-exception v1

    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 59
    .line 60
    const-string v4, "page_router.bin"

    .line 61
    .line 62
    invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    new-instance v3, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v5, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->attributeSet:Landroid/util/AttributeSet;

    .line 81
    .line 82
    invoke-direct {v3, v4, v5}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 83
    .line 84
    .line 85
    iput-object v3, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    new-instance v3, Ljava/io/FileInputStream;

    .line 89
    .line 90
    new-instance v4, Ljava/io/File;

    .line 91
    .line 92
    const-string v5, "actions.bin"

    .line 93
    .line 94
    invoke-direct {v4, p1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v3, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    :try_start_1
    invoke-static {v3}, Lcom/zykj/paint/Actions$EzyActionList;->parseFrom(Ljava/io/InputStream;)Lcom/zykj/paint/Actions$EzyActionList;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-eqz v4, :cond_3

    .line 105
    .line 106
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyActionList;->getActionCount()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    const/4 v6, 0x1

    .line 111
    if-ne v5, v6, :cond_2

    .line 112
    .line 113
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyActionList;->getActionList()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const-string v5, "actionList.actionList"

    .line 118
    .line 119
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Lcom/zykj/paint/Actions$EzyAction;

    .line 127
    .line 128
    invoke-virtual {v4}, Lcom/zykj/paint/Actions$EzyAction;->hasData()Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_2

    .line 133
    .line 134
    new-instance v4, Lcom/zykj/merge/sketch/view/NewSketchProxyView;

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v6, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->attributeSet:Landroid/util/AttributeSet;

    .line 144
    .line 145
    invoke-direct {v4, v5, v6}, Lcom/zykj/merge/sketch/view/NewSketchProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :catchall_1
    move-exception v4

    .line 150
    goto :goto_2

    .line 151
    :cond_2
    new-instance v4, Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    .line 152
    .line 153
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object v6, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->attributeSet:Landroid/util/AttributeSet;

    .line 161
    .line 162
    invoke-direct {v4, v5, v6}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 163
    .line 164
    .line 165
    :goto_0
    iput-object v4, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 166
    .line 167
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    .line 169
    :cond_3
    :try_start_2
    invoke-static {v3, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    .line 171
    .line 172
    :goto_1
    iget-object v1, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 173
    .line 174
    if-eqz v1, :cond_5

    .line 175
    .line 176
    instance-of v2, v1, Landroid/view/View;

    .line 177
    .line 178
    if-eqz v2, :cond_4

    .line 179
    .line 180
    move-object v2, v1

    .line 181
    check-cast v2, Landroid/view/View;

    .line 182
    .line 183
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    :cond_4
    invoke-interface {v1, p1, p2, p3}, Lcom/zykj/merge/sketch/listener/Play;->loadData(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 187
    .line 188
    .line 189
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 190
    .line 191
    :cond_5
    if-nez v2, :cond_9

    .line 192
    .line 193
    new-instance p1, Ljava/lang/Exception;

    .line 194
    .line 195
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :goto_2
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 203
    :catchall_2
    move-exception v5

    .line 204
    :try_start_4
    invoke-static {v3, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    throw v5
    :try_end_4
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 208
    :goto_3
    :try_start_5
    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 209
    .line 210
    .line 211
    iget-object v1, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 212
    .line 213
    if-eqz v1, :cond_7

    .line 214
    .line 215
    instance-of v2, v1, Landroid/view/View;

    .line 216
    .line 217
    if-eqz v2, :cond_6

    .line 218
    .line 219
    move-object v2, v1

    .line 220
    check-cast v2, Landroid/view/View;

    .line 221
    .line 222
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    :cond_6
    invoke-interface {v1, p1, p2, p3}, Lcom/zykj/merge/sketch/listener/Play;->loadData(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 226
    .line 227
    .line 228
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 229
    .line 230
    :cond_7
    if-nez v2, :cond_9

    .line 231
    .line 232
    new-instance p1, Ljava/lang/Exception;

    .line 233
    .line 234
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :goto_4
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :catch_1
    :try_start_6
    new-instance v3, Lcom/zykj/merge/sketch/view/NewSketchProxyView;

    .line 242
    .line 243
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget-object v1, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->attributeSet:Landroid/util/AttributeSet;

    .line 251
    .line 252
    invoke-direct {v3, v4, v1}, Lcom/zykj/merge/sketch/view/NewSketchProxyView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 253
    .line 254
    .line 255
    iput-object v3, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 256
    .line 257
    instance-of v1, v3, Landroid/view/View;

    .line 258
    .line 259
    if-eqz v1, :cond_8

    .line 260
    .line 261
    move-object v1, v3

    .line 262
    check-cast v1, Landroid/view/View;

    .line 263
    .line 264
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 265
    .line 266
    .line 267
    :cond_8
    invoke-interface {v3, p1, p2, p3}, Lcom/zykj/merge/sketch/listener/Play;->loadData(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 268
    .line 269
    .line 270
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 271
    .line 272
    if-nez p1, :cond_9

    .line 273
    .line 274
    new-instance p1, Ljava/lang/Exception;

    .line 275
    .line 276
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_9
    :goto_5
    return-void

    .line 281
    :goto_6
    iget-object v3, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 282
    .line 283
    if-eqz v3, :cond_b

    .line 284
    .line 285
    instance-of v2, v3, Landroid/view/View;

    .line 286
    .line 287
    if-eqz v2, :cond_a

    .line 288
    .line 289
    move-object v2, v3

    .line 290
    check-cast v2, Landroid/view/View;

    .line 291
    .line 292
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 293
    .line 294
    .line 295
    :cond_a
    invoke-interface {v3, p1, p2, p3}, Lcom/zykj/merge/sketch/listener/Play;->loadData(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 296
    .line 297
    .line 298
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 299
    .line 300
    :cond_b
    if-nez v2, :cond_c

    .line 301
    .line 302
    new-instance p1, Ljava/lang/Exception;

    .line 303
    .line 304
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    :cond_c
    throw v1
.end method

.method public final pause()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/Play;->pause()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/Play;->release()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lcom/zykj/merge/sketch/listener/Play;->removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/Play;->reset()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final resume()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/Play;->resume()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final seekTo(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "onSuccess"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onFailure"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1, p2, p3}, Lcom/zykj/merge/sketch/listener/Play;->seekTo(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final setAreaMoveListener(Ls5/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lcom/zykj/merge/sketch/listener/MoveProxy;->setAreaMoveListener(Ls5/d;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setRate(D)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/zykj/merge/sketch/listener/Play;->setRate(D)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public final setScaleEnable(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lcom/zykj/merge/sketch/listener/MoveProxy;->setScaleEnable(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setTranslateEnable(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string v1, "null cannot be cast to non-null type com.zykj.merge.sketch.listener.MoveProxy"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Lcom/zykj/merge/sketch/listener/MoveProxy;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lcom/zykj/merge/sketch/listener/MoveProxy;->setTranslateEnable(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/Play;->start()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final status()Lcom/zykj/merge/sketch/constant/PlayStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/Play;->status()Lcom/zykj/merge/sketch/constant/PlayStatus;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final waiting()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->mRecord:Lcom/zykj/merge/sketch/listener/Play;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/zykj/merge/sketch/listener/Play;->waiting()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
