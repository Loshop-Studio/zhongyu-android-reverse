# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/zykj/blackboard/core/edit/BoardControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/edit/IBoardControl;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010!\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00022\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0011\u0010$\u001a\u0004\u0018\u00010 H\u0016\u00a2\u0006\u0004\u0008$\u0010%J%\u0010\'\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00022\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016\u00a2\u0006\u0004\u0008\'\u0010\u0016J%\u0010(\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016\u00a2\u0006\u0004\u0008(\u0010)J%\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u00142\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u0011\u0010.\u001a\u0004\u0018\u00010+H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u00080\u00101J\u0015\u00103\u001a\u0008\u0012\u0004\u0012\u00020+02H\u0016\u00a2\u0006\u0004\u00083\u00104JG\u0010:\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u00142\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000b07H\u0016\u00a2\u0006\u0004\u0008:\u0010;J7\u0010<\u001a\u00020\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b072\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000b07H\u0016\u00a2\u0006\u0004\u0008<\u0010=JE\u0010A\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\t2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u000b0?2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000b07H\u0016\u00a2\u0006\u0004\u0008A\u0010BJ\u0019\u0010E\u001a\u00020\u000b2\u0008\u0010D\u001a\u0004\u0018\u00010CH\u0016\u00a2\u0006\u0004\u0008E\u0010FJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\t\u00a2\u0006\u0004\u0008G\u0010\rJ\r\u0010H\u001a\u00020\u000b\u00a2\u0006\u0004\u0008H\u0010IR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010JR\u001a\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\u000f0K8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0016\u0010N\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0016\u0010P\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010RR\u0016\u0010S\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR#\u0010[\u001a\n V*\u0004\u0018\u00010U0U8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010ZR(\u0010D\u001a\u0004\u0018\u00010C2\u0008\u0010\\\u001a\u0004\u0018\u00010C8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008D\u0010]\u001a\u0004\u0008^\u0010_\u00a8\u0006`"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/edit/BoardControl;",
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "",
        "width",
        "height",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "renderLayer",
        "<init>",
        "(IILcom/zykj/blackboard/core/canvas/view/RenderLayer;)V",
        "",
        "path",
        "Ld6/s;",
        "initDir",
        "(Ljava/lang/String;)V",
        "pageIndex",
        "Lcom/zykj/blackboard/core/edit/IEditPageControl;",
        "getPage",
        "(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;",
        "Lkotlin/Function0;",
        "callback",
        "",
        "renderPage",
        "(ILr6/a;)Z",
        "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
        "boardEntity",
        "initPageControl",
        "(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V",
        "getBoardDirPath",
        "()Ljava/lang/String;",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "getConfig",
        "()Lcom/zykj/blackboard/bean/BoardConfig;",
        "Lcom/zykj/blackboard/listener/PageListener;",
        "pageListener",
        "setPageListener",
        "(Lcom/zykj/blackboard/listener/PageListener;)V",
        "getPageListener",
        "()Lcom/zykj/blackboard/listener/PageListener;",
        "renderCallback",
        "currentPage",
        "deletePage",
        "(ILr6/a;)V",
        "isSwitch",
        "Lcom/zykj/blackboard/core/edit/IPageControl;",
        "createPage",
        "(ZLr6/a;)Lcom/zykj/blackboard/core/edit/IPageControl;",
        "getCurrentPage",
        "()Lcom/zykj/blackboard/core/edit/IPageControl;",
        "getCurrentPageIndex",
        "()I",
        "",
        "getPages",
        "()Ljava/util/List;",
        "needClear",
        "isContentThumbnail",
        "Lkotlin/Function1;",
        "",
        "error",
        "save",
        "(ZZLr6/c;Lr6/c;)V",
        "drop",
        "(Lr6/c;Lr6/c;)V",
        "dirPath",
        "Lkotlin/Function2;",
        "",
        "loadDir",
        "(Ljava/lang/String;Lr6/e;Lr6/c;)V",
        "Lcom/zykj/blackboard/listener/ErrorListener;",
        "errorListener",
        "setErrorListener",
        "(Lcom/zykj/blackboard/listener/ErrorListener;)V",
        "loadPathForTest",
        "release",
        "()V",
        "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;",
        "",
        "pageList",
        "Ljava/util/List;",
        "boardConfig",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "currentPageIndex",
        "I",
        "Lcom/zykj/blackboard/listener/PageListener;",
        "boardDirPath",
        "Ljava/lang/String;",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "singleExecutor$delegate",
        "Ld6/e;",
        "getSingleExecutor",
        "()Ljava/util/concurrent/ExecutorService;",
        "singleExecutor",
        "<set-?>",
        "Lcom/zykj/blackboard/listener/ErrorListener;",
        "getErrorListener",
        "()Lcom/zykj/blackboard/listener/ErrorListener;",
        "blackboard_release"
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
.field private boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private boardDirPath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private currentPageIndex:I

.field private errorListener:Lcom/zykj/blackboard/listener/ErrorListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final pageList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/edit/IEditPageControl;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private pageListener:Lcom/zykj/blackboard/listener/PageListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final singleExecutor$delegate:Ld6/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(IILcom/zykj/blackboard/core/canvas/view/RenderLayer;)V
    .locals 1
    .param p3    # Lcom/zykj/blackboard/core/canvas/view/RenderLayer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "renderLayer"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 10
    .line 11
    new-instance p3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 17
    .line 18
    new-instance p3, Lcom/zykj/blackboard/bean/BoardConfig;

    .line 19
    .line 20
    invoke-direct {p3, p1, p2}, Lcom/zykj/blackboard/bean/BoardConfig;-><init>(II)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 24
    .line 25
    const/4 p1, -0x1

    .line 26
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 27
    .line 28
    const-string p1, ""

    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardDirPath:Ljava/lang/String;

    .line 31
    .line 32
    sget-object p1, Lcom/zykj/blackboard/core/edit/BoardControl$singleExecutor$2;->INSTANCE:Lcom/zykj/blackboard/core/edit/BoardControl$singleExecutor$2;

    .line 33
    .line 34
    invoke-static {p1}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->singleExecutor$delegate:Ld6/e;

    .line 39
    .line 40
    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->release$lambda-17(Lcom/zykj/blackboard/core/edit/BoardControl;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->save$lambda-9$lambda-7(Ljava/util/ArrayList;Z)V

    return-void
.end method

.method public static synthetic c(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;ZLr6/c;Z)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/blackboard/core/edit/BoardControl;->save$lambda-9(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;ZLr6/c;Z)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/e;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/BoardControl;->loadDir$lambda-14(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/e;Lr6/c;)V

    return-void
.end method

.method private static final drop$lambda-10(Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;)V
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-static {v0, v1, v2, v3, v2}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData$default(Lcom/zykj/blackboard/utils/BoardBox;Ljava/lang/String;Landroid/content/Context;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p1, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static synthetic e(Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->drop$lambda-10(Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;)V

    return-void
.end method

.method private final getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method private final getSingleExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->singleExecutor$delegate:Ld6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    return-object v0
.end method

.method private final initDir(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardDirPath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method private final initPageControl(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getPages()Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 20
    .line 21
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl;

    .line 22
    .line 23
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 24
    .line 25
    invoke-direct {v1, p0, v2, v0}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/listener/PageListener;->addPage(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method private static final loadDir$lambda-14(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/e;Lr6/c;)V
    .locals 7

    .line 1
    const-string v0, "\u9875\u9762BoardControl:loadDir -> dirPath:"

    .line 2
    .line 3
    const-string v1, "$dirPath"

    .line 4
    .line 5
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "this$0"

    .line 9
    .line 10
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "$callback"

    .line 14
    .line 15
    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "$error"

    .line 19
    .line 20
    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, " \u7ebf\u7a0b\u5f00\u59cb"

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 64
    .line 65
    invoke-virtual {v0, v1, p0}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lio/objectbox/query/Query;->c()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    const-wide/16 v2, 0x0

    .line 80
    .line 81
    const/4 v4, 0x1

    .line 82
    if-eqz v0, :cond_0

    .line 83
    .line 84
    const-string p0, "\u9875\u9762BoardControl:loadDir -> \u4ece\u6570\u636e\u5e93\u52a0\u8f7d\u6570\u636e"

    .line 85
    .line 86
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->initPageControl(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 101
    .line 102
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_1

    .line 110
    .line 111
    new-instance v0, Ljava/io/File;

    .line 112
    .line 113
    const-string v5, "page_router.bin"

    .line 114
    .line 115
    invoke-direct {v0, p0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_1

    .line 123
    .line 124
    const-string v0, "\u9875\u9762BoardControl:loadDir -> \u4ece\u672c\u5730\u6587\u4ef6\u52a0\u8f7d\u6570\u636e"

    .line 125
    .line 126
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    sget-object v0, Lcom/zykj/blackboard/core/data/SourceLoad;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceLoad;

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Lcom/zykj/blackboard/core/data/SourceLoad;->loadRecord(Ljava/lang/String;)Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-direct {p1, p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->initPageControl(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_1
    const-string v0, "\u9875\u9762BoardControl:loadDir -> \u65b0\u5efaboard\u7a7a\u767d\u753b\u677f"

    .line 144
    .line 145
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 153
    .line 154
    invoke-direct {v0, v2, v3, p0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;-><init>(JLjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->put()V

    .line 158
    .line 159
    .line 160
    invoke-direct {p1, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->initPageControl(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 161
    .line 162
    .line 163
    move v4, v1

    .line 164
    :goto_0
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    :try_start_1
    iget-object p0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 166
    .line 167
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    if-eqz p0, :cond_2

    .line 172
    .line 173
    const/4 p0, 0x0

    .line 174
    goto :goto_2

    .line 175
    :cond_2
    iget-object p0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 176
    .line 177
    invoke-static {p0}, Lkotlin/collections/t;->f0(Ljava/util/List;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_3

    .line 190
    .line 191
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 196
    .line 197
    new-instance v5, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const-string v6, "\u9875\u9762BoardControl:loadDir -> \u5220\u9664\u4e86\u4e00\u4e2a "

    .line 203
    .line 204
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->getFileName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :catchall_1
    move-exception p0

    .line 227
    goto :goto_3

    .line 228
    :cond_3
    iget-object p0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 229
    .line 230
    invoke-static {p0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast p0, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 235
    .line 236
    new-instance v0, Ljava/lang/StringBuilder;

    .line 237
    .line 238
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 239
    .line 240
    .line 241
    const-string v5, "\u9875\u9762BoardControl:loadDir -> \u4fdd\u7559\u9875: "

    .line 242
    .line 243
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-interface {p0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->getFileName()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    iget-object v0, p1, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 265
    .line 266
    invoke-static {p0}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-interface {v0, v5}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 271
    .line 272
    .line 273
    :goto_2
    :try_start_2
    monitor-exit p1

    .line 274
    if-nez p0, :cond_4

    .line 275
    .line 276
    const-string p0, "\u9875\u9762BoardControl:loadDir -> \u6570\u636e\u52a0\u8f7d\u5b8c\u6bd5, \u6570\u636e\u7a7a"

    .line 277
    .line 278
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 286
    .line 287
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-interface {p2, p0, p1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_4
    invoke-interface {p0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->duration()J

    .line 296
    .line 297
    .line 298
    move-result-wide v2

    .line 299
    new-instance p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;

    .line 300
    .line 301
    invoke-direct {p0, p2, v4, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;-><init>(Lr6/e;ZJ)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1, v1, p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPage(ILr6/a;)Z

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :goto_3
    monitor-exit p1

    .line 309
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 310
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 311
    .line 312
    .line 313
    new-instance p1, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    const-string p2, "\u9875\u9762BoardControl:loadDir -> \u6570\u636e\u52a0\u8f7d\u5931\u8d25\uff0ce: "

    .line 316
    .line 317
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p2

    .line 324
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->b([Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    return-void
.end method

.method private static final release$lambda-17(Lcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->release()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->errorListener:Lcom/zykj/blackboard/listener/ErrorListener;

    .line 37
    .line 38
    return-void
.end method

.method private final renderPage(ILr6/a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lr6/a;",
            ")Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1, v0}, Lcom/zykj/blackboard/listener/PageListener;->changPage(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v0, p2}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->show(Lr6/a;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    return p1
.end method

.method private static final save$lambda-9(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;ZLr6/c;Z)V
    .locals 5

    .line 1
    const-string v0, "$pagesSnapshot"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$boardDirPath"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "this$0"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p2, "$error"

    .line 17
    .line 18
    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p2, "$callback"

    .line 22
    .line 23
    invoke-static {p5, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const-string v0, "\u9875\u9762BoardControl:save() -> ["

    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    const-string p0, "]\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u8be5\u9875\u9762\u5df2\u7ecf\u88ab\u56de\u6536,\u6570\u636e\u4e0d\u5b8c\u6574"

    .line 35
    .line 36
    invoke-static {v0, p1, p0}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    sget-object p2, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 49
    .line 50
    invoke-virtual {p2}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 55
    .line 56
    invoke-virtual {p2, v1}, Lio/objectbox/BoxStore;->c(Ljava/lang/Class;)Lio/objectbox/a;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Lio/objectbox/a;->g()Lio/objectbox/query/QueryBuilder;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 65
    .line 66
    invoke-virtual {p2, v1, p1}, Lio/objectbox/query/QueryBuilder;->b(Lio/objectbox/Property;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p2}, Lio/objectbox/query/Query;->c()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 78
    .line 79
    if-nez p2, :cond_1

    .line 80
    .line 81
    const-string p0, "]\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u8be5\u9875\u9762\u6570\u636e\u5e93\u5df2\u88ab\u6e05\u7406"

    .line 82
    .line 83
    invoke-static {v0, p1, p0}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    const/4 v2, 0x0

    .line 100
    if-eqz v1, :cond_2

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    move v3, v2

    .line 108
    :cond_3
    if-ge v3, v1, :cond_4

    .line 109
    .line 110
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    add-int/lit8 v3, v3, 0x1

    .line 115
    .line 116
    check-cast v4, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 117
    .line 118
    invoke-interface {v4}, Lcom/zykj/blackboard/core/edit/IPageControl;->canSave()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-nez v4, :cond_3

    .line 123
    .line 124
    const-string p0, "]\u6570\u636e\u4fdd\u5b58\u5931\u8d25\uff0c\u6709\u6570\u636e\u6b63\u5728\u4fdd\u5b58\u5230\u6570\u636e\u5e93"

    .line 125
    .line 126
    invoke-static {v0, p1, p0}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    new-instance p0, Ljava/lang/Exception;

    .line 138
    .line 139
    const-string p1, "\u6b63\u5728\u4fdd\u5b58\u6570\u636e\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    .line 140
    .line 141
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_4
    :goto_0
    const-string v1, "]\u5f00\u59cb"

    .line 149
    .line 150
    invoke-static {v0, p1, v1}, Landroid/support/v4/media/f;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :try_start_0
    sget-object v1, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/zykj/blackboard/utils/BoardBox;->getBoxStore()Lio/objectbox/BoxStore;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    new-instance v3, Landroidx/camera/camera2/interop/c;

    .line 168
    .line 169
    const/4 v4, 0x3

    .line 170
    invoke-direct {v3, p0, p6, v4}, Landroidx/camera/camera2/interop/c;-><init>(Ljava/lang/Object;ZI)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v3}, Lio/objectbox/BoxStore;->h(Ljava/lang/Runnable;)V

    .line 174
    .line 175
    .line 176
    new-instance p6, Ljava/util/ArrayList;

    .line 177
    .line 178
    const/16 v1, 0xa

    .line 179
    .line 180
    invoke-static {p0, v1}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-direct {p6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    :goto_1
    if-ge v2, v1, :cond_5

    .line 192
    .line 193
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    add-int/lit8 v2, v2, 0x1

    .line 198
    .line 199
    check-cast v3, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 200
    .line 201
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->getFileName()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-virtual {p6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :catch_0
    move-exception p0

    .line 210
    goto :goto_2

    .line 211
    :cond_5
    sget-object p0, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 212
    .line 213
    invoke-virtual {p0, p2, p6}, Lcom/zykj/blackboard/core/data/SourceSave;->saveRecord(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/util/List;)V

    .line 214
    .line 215
    .line 216
    if-eqz p4, :cond_6

    .line 217
    .line 218
    new-instance p0, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    const-string p2, "]\u5f00\u59cb\u6e05\u9664\u6570\u636e\u5e93"

    .line 230
    .line 231
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    sget-object p0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 246
    .line 247
    const/4 p2, 0x2

    .line 248
    const/4 p4, 0x0

    .line 249
    invoke-static {p0, p1, p4, p2, p4}, Lcom/zykj/blackboard/utils/BoardBox;->clearLocalData$default(Lcom/zykj/blackboard/utils/BoardBox;Ljava/lang/String;Landroid/content/Context;ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    .line 253
    .line 254
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string p2, "]\u4fdd\u5b58\u7ed3\u675f"

    .line 264
    .line 265
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    invoke-interface {p5, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    const-string p2, "\u9875\u9762BoardControl:save() ->\u6570\u636e\u4fdd\u5b58\u5931\u8d25 -> error: "

    .line 286
    .line 287
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-static {p1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    return-void
.end method

.method private static final save$lambda-9$lambda-7(Ljava/util/ArrayList;Z)V
    .locals 7

    .line 1
    const-string v0, "$pagesSnapshot"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v2, v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    add-int/lit8 v4, v1, 0x1

    .line 21
    .line 22
    if-ltz v1, :cond_1

    .line 23
    .line 24
    check-cast v3, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 25
    .line 26
    const-string v5, "\u9875\u9762BoardControl:save() -> ["

    .line 27
    .line 28
    const-string v6, "]["

    .line 29
    .line 30
    invoke-static {v1, v5, v6}, Landroid/support/v4/media/f;->s(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->getFileName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v5, "]\u51c6\u5907\u4fdd\u5b58"

    .line 42
    .line 43
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v1}, Lcom/blankj/utilcode/util/g;->e([Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->saveWithContentThumbnail()V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    invoke-interface {v3}, Lcom/zykj/blackboard/core/edit/IPageControl;->save()V

    .line 64
    .line 65
    .line 66
    :goto_1
    move v1, v4

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0

    .line 73
    :cond_2
    return-void
.end method


# virtual methods
.method public createPage(ZLr6/a;)Lcom/zykj/blackboard/core/edit/IPageControl;
    .locals 7
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lr6/a;",
            ")",
            "Lcom/zykj/blackboard/core/edit/IPageControl;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "\u9875\u9762BoardControl\u9690\u85cf\u4e4b\u524d\u7b2c"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget v1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 40
    .line 41
    iget v1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 42
    .line 43
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 48
    .line 49
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->hide()V

    .line 50
    .line 51
    .line 52
    :cond_0
    new-instance v1, Lcom/zykj/blackboard/core/edit/PageControl;

    .line 53
    .line 54
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 55
    .line 56
    const/4 v5, 0x4

    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    move-object v2, p0

    .line 60
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/edit/PageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;ILkotlin/jvm/internal/e;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iget-object v0, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    invoke-interface {v0, v1}, Lcom/zykj/blackboard/listener/PageListener;->addPage(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    if-eqz p1, :cond_2

    .line 76
    .line 77
    iget-object p1, v2, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->renderPage(ILr6/a;)Z

    .line 84
    .line 85
    .line 86
    :cond_2
    return-object v1
.end method

.method public currentPage(ILr6/a;)Z
    .locals 3
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lr6/a;",
            ")Z"
        }
    .end annotation

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    if-ltz v0, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v0, v2, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 23
    .line 24
    iget v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 31
    .line 32
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->hide()V

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->renderPage(ILr6/a;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    :cond_2
    return v1
.end method

.method public deletePage(ILr6/a;)V
    .locals 3
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "renderCallback"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    add-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    add-int/lit8 v1, p1, -0x1

    .line 22
    .line 23
    invoke-direct {p0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_1
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->onDelete()V

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->release()V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v2, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-interface {v2, v0}, Lcom/zykj/blackboard/listener/PageListener;->removePage(Lcom/zykj/blackboard/core/edit/IPageControl;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 46
    .line 47
    if-ne v0, p1, :cond_3

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->renderPage(ILr6/a;)Z

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 61
    .line 62
    const-string p2, "<this>"

    .line 63
    .line 64
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 72
    .line 73
    return-void
.end method

.method public drop(Lr6/c;Lr6/c;)V
    .locals 2
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Ljava/lang/Thread;

    .line 12
    .line 13
    new-instance v0, Landroidx/camera/core/impl/utils/a;

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    invoke-direct {v0, v1, p0, p1}, Landroidx/camera/core/impl/utils/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public getBoardDirPath()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardDirPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->boardConfig:Lcom/zykj/blackboard/bean/BoardConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCurrentPage()Lcom/zykj/blackboard/core/edit/IPageControl;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getPage(I)Lcom/zykj/blackboard/core/edit/IEditPageControl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getCurrentPageIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->currentPageIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public final getErrorListener()Lcom/zykj/blackboard/listener/ErrorListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->errorListener:Lcom/zykj/blackboard/listener/ErrorListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPageListener()Lcom/zykj/blackboard/listener/PageListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadDir(Ljava/lang/String;Lr6/e;Lr6/c;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/e;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "dirPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "error"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "\u9875\u9762BoardControl:loadDir\u7684\u8def\u5f84 -> dirPath:"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->initDir(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getSingleExecutor()Ljava/util/concurrent/ExecutorService;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, La5/d;

    .line 37
    .line 38
    const/4 v6, 0x5

    .line 39
    move-object v3, p0

    .line 40
    move-object v2, p1

    .line 41
    move-object v4, p2

    .line 42
    move-object v5, p3

    .line 43
    invoke-direct/range {v1 .. v6}, La5/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final loadPathForTest(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "dirPath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->initDir(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final release()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getSingleExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La8/a;

    .line 6
    .line 7
    const/16 v2, 0x12

    .line 8
    .line 9
    invoke-direct {v1, p0, v2}, La8/a;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public save(ZZLr6/c;Lr6/c;)V
    .locals 9
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "error"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageList:Ljava/util/List;

    .line 14
    .line 15
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getBoardDirPath()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-direct {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getSingleExecutor()Ljava/util/concurrent/ExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lcom/zykj/blackboard/core/edit/a;

    .line 27
    .line 28
    move-object v4, p0

    .line 29
    move v6, p1

    .line 30
    move v8, p2

    .line 31
    move-object v7, p3

    .line 32
    move-object v5, p4

    .line 33
    invoke-direct/range {v1 .. v8}, Lcom/zykj/blackboard/core/edit/a;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lr6/c;ZLr6/c;Z)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public setErrorListener(Lcom/zykj/blackboard/listener/ErrorListener;)V
    .locals 0
    .param p1    # Lcom/zykj/blackboard/listener/ErrorListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->errorListener:Lcom/zykj/blackboard/listener/ErrorListener;

    .line 2
    .line 3
    return-void
.end method

.method public setPageListener(Lcom/zykj/blackboard/listener/PageListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/listener/PageListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pageListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl;->pageListener:Lcom/zykj/blackboard/listener/PageListener;

    .line 7
    .line 8
    return-void
.end method
