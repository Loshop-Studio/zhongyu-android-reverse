.class public final Lcom/zykj/view/board/simple/SimpleViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0019\u0010\u0003J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001b\u0010\u0003J\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001e\u0010\u0003R\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001d\u0010$\u001a\u0008\u0012\u0004\u0012\u00020 0#8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u001d\u0010-\u001a\u0008\u0012\u0004\u0012\u00020)0,8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\u00a8\u00061"
    }
    d2 = {
        "Lcom/zykj/view/board/simple/SimpleViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "<init>",
        "()V",
        "Ld6/s;",
        "updateConfigAboutPen",
        "updateConfigAboutEraser",
        "",
        "isTouchable",
        "updateTouchable",
        "(Z)V",
        "Lcom/zykj/view/board/board/MainToolType;",
        "mainToolType",
        "updateModeType",
        "(Lcom/zykj/view/board/board/MainToolType;)V",
        "switchPenTool",
        "Lcom/zykj/view/board/simple/SimplePenType;",
        "penType",
        "updatePenType",
        "(Lcom/zykj/view/board/simple/SimplePenType;)V",
        "",
        "level",
        "updatePenSizeLevel",
        "(I)V",
        "updatePenColorLevel",
        "switchEraserTool",
        "updateEraserSizeLevel",
        "handleExpandClick",
        "isOpen",
        "updateExpandState",
        "cleanPage",
        "Lkotlinx/coroutines/flow/y;",
        "Lcom/zykj/view/board/simple/SimpleUIState;",
        "_uiState",
        "Lkotlinx/coroutines/flow/y;",
        "Lkotlinx/coroutines/flow/m0;",
        "uiState",
        "Lkotlinx/coroutines/flow/m0;",
        "getUiState",
        "()Lkotlinx/coroutines/flow/m0;",
        "Lkotlinx/coroutines/flow/x;",
        "Lcom/zykj/view/board/simple/SimpleBoardEvent;",
        "_event",
        "Lkotlinx/coroutines/flow/x;",
        "Lkotlinx/coroutines/flow/c0;",
        "event",
        "Lkotlinx/coroutines/flow/c0;",
        "getEvent",
        "()Lkotlinx/coroutines/flow/c0;",
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
        "SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n226#2,5:248\n226#2,5:253\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel\n*L\n43#1:243,5\n67#1:248,5\n158#1:253,5\n*E\n"
    }
.end annotation


# instance fields
.field private final _event:Lkotlinx/coroutines/flow/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/x;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final _uiState:Lkotlinx/coroutines/flow/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/y;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final event:Lkotlinx/coroutines/flow/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/c0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final uiState:Lkotlinx/coroutines/flow/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 11

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 5
    .line 6
    const/16 v9, 0xff

    .line 7
    .line 8
    const/4 v10, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    invoke-direct/range {v0 .. v10}, Lcom/zykj/view/board/simple/SimpleUIState;-><init>(ZLcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/simple/SimplePenType;Lcom/zykj/view/board/simple/SimplePenSize;Lcom/zykj/view/board/board/PenColor;Lcom/zykj/view/board/board/EraserType;Lcom/zykj/view/board/board/ExpandStatus;ILkotlin/jvm/internal/e;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->_uiState:Lkotlinx/coroutines/flow/y;

    .line 25
    .line 26
    new-instance v1, Lkotlinx/coroutines/flow/a0;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->uiState:Lkotlinx/coroutines/flow/m0;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/4 v1, 0x7

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-static {v2, v1, v0}, Lkotlinx/coroutines/flow/h;->a(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/f0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->_event:Lkotlinx/coroutines/flow/x;

    .line 41
    .line 42
    new-instance v1, Lkotlinx/coroutines/flow/z;

    .line 43
    .line 44
    invoke-direct {v1, v0}, Lkotlinx/coroutines/flow/z;-><init>(Lkotlinx/coroutines/flow/x;)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->event:Lkotlinx/coroutines/flow/c0;

    .line 48
    .line 49
    return-void
.end method

.method public static final synthetic access$get_event$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/x;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->_event:Lkotlinx/coroutines/flow/x;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get_uiState$p(Lcom/zykj/view/board/simple/SimpleViewModel;)Lkotlinx/coroutines/flow/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->_uiState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    return-object p0
.end method

.method private final updateConfigAboutEraser()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutEraser$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private final updateConfigAboutPen()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic updateTouchable$default(Lcom/zykj/view/board/simple/SimpleViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->_uiState:Lkotlinx/coroutines/flow/y;

    .line 6
    .line 7
    check-cast p1, Lkotlinx/coroutines/flow/n0;

    .line 8
    .line 9
    invoke-virtual {p1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/view/board/simple/SimpleUIState;->isTouchable()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    xor-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->updateTouchable(Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final cleanPage()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$cleanPage$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final getEvent()Lkotlinx/coroutines/flow/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/c0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->event:Lkotlinx/coroutines/flow/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUiState()Lkotlinx/coroutines/flow/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/m0;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->uiState:Lkotlinx/coroutines/flow/m0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final handleExpandClick()V
    .locals 4

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$handleExpandClick$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$handleExpandClick$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, v3}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final switchEraserTool()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->_uiState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/simple/SimpleUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Eraser;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Eraser;

    .line 18
    .line 19
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    :goto_0
    move-object v6, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    const/16 v12, 0xfb

    .line 31
    .line 32
    const/4 v13, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    invoke-static/range {v3 .. v13}, Lcom/zykj/view/board/simple/SimpleUIState;->copy$default(Lcom/zykj/view/board/simple/SimpleUIState;ZLcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/simple/SimplePenType;Lcom/zykj/view/board/simple/SimplePenSize;Lcom/zykj/view/board/board/PenColor;Lcom/zykj/view/board/board/EraserType;Lcom/zykj/view/board/board/ExpandStatus;ILjava/lang/Object;)Lcom/zykj/view/board/simple/SimpleUIState;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    return-void
.end method

.method public final switchPenTool()V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->_uiState:Lkotlinx/coroutines/flow/y;

    .line 2
    .line 3
    :cond_0
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 5
    .line 6
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    move-object v3, v2

    .line 11
    check-cast v3, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/zykj/view/board/simple/SimpleUIState;->getMinorToolType()Lcom/zykj/view/board/board/MinorToolType;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Pen;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Pen;

    .line 18
    .line 19
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    :goto_0
    move-object v6, v5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object v5, Lcom/zykj/view/board/board/MinorToolType$Null;->INSTANCE:Lcom/zykj/view/board/board/MinorToolType$Null;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :goto_1
    const/16 v12, 0xfb

    .line 31
    .line 32
    const/4 v13, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v9, 0x0

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    invoke-static/range {v3 .. v13}, Lcom/zykj/view/board/simple/SimpleUIState;->copy$default(Lcom/zykj/view/board/simple/SimpleUIState;ZLcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/simple/SimplePenType;Lcom/zykj/view/board/simple/SimplePenSize;Lcom/zykj/view/board/board/PenColor;Lcom/zykj/view/board/board/EraserType;Lcom/zykj/view/board/board/ExpandStatus;ILjava/lang/Object;)Lcom/zykj/view/board/simple/SimpleUIState;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v1, v2, v3}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    return-void
.end method

.method public final updateEraserSizeLevel(I)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$updateEraserSizeLevel$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateEraserSizeLevel$1;-><init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final updateExpandState(Z)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final updateModeType(Lcom/zykj/view/board/board/MainToolType;)V
    .locals 14
    .param p1    # Lcom/zykj/view/board/board/MainToolType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "mainToolType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel;->_uiState:Lkotlinx/coroutines/flow/y;

    .line 7
    .line 8
    :goto_0
    move-object v1, v0

    .line 9
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 10
    .line 11
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    move-object v3, v2

    .line 16
    check-cast v3, Lcom/zykj/view/board/simple/SimpleUIState;

    .line 17
    .line 18
    const/16 v12, 0xfd

    .line 19
    .line 20
    const/4 v13, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    move-object v5, p1

    .line 29
    invoke-static/range {v3 .. v13}, Lcom/zykj/view/board/simple/SimpleUIState;->copy$default(Lcom/zykj/view/board/simple/SimpleUIState;ZLcom/zykj/view/board/board/MainToolType;Lcom/zykj/view/board/board/MinorToolType;Lcom/zykj/view/board/simple/SimplePenType;Lcom/zykj/view/board/simple/SimplePenSize;Lcom/zykj/view/board/board/PenColor;Lcom/zykj/view/board/board/EraserType;Lcom/zykj/view/board/board/ExpandStatus;ILjava/lang/Object;)Lcom/zykj/view/board/simple/SimpleUIState;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v1, v2, p1}, Lkotlinx/coroutines/flow/n0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    instance-of p1, v5, Lcom/zykj/view/board/board/MainToolType$Pen;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleViewModel;->updateConfigAboutPen()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    instance-of p1, v5, Lcom/zykj/view/board/board/MainToolType$Eraser;

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    invoke-direct {p0}, Lcom/zykj/view/board/simple/SimpleViewModel;->updateConfigAboutEraser()V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void

    .line 55
    :cond_2
    move-object p1, v5

    .line 56
    goto :goto_0
.end method

.method public final updatePenColorLevel(I)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenColorLevel$1;-><init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final updatePenSizeLevel(I)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenSizeLevel$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenSizeLevel$1;-><init>(ILcom/zykj/view/board/simple/SimpleViewModel;Lh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final updatePenType(Lcom/zykj/view/board/simple/SimplePenType;)V
    .locals 3
    .param p1    # Lcom/zykj/view/board/simple/SimplePenType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "penType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$updatePenType$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lcom/zykj/view/board/simple/SimplePenType;Lh6/c;)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final updateTouchable(Z)V
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/v;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateTouchable$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;ZLh6/c;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v2, v1, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 13
    .line 14
    .line 15
    return-void
.end method
