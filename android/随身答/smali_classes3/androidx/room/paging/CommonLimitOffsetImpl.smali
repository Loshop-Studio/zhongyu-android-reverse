.class public final Landroidx/room/paging/CommonLimitOffsetImpl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/room/paging/CommonLimitOffsetImpl$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Value:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 (*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0001(BU\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u0004\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007\u0012.\u0010\u0008\u001a*\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\r0\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ(\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\"H\u0086@\u00a2\u0006\u0002\u0010#J(\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\"H\u0082@\u00a2\u0006\u0002\u0010#J0\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\"2\u0006\u0010&\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0002\u0010\'R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R8\u0010\u0008\u001a*\u0008\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\r0\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Landroidx/room/paging/CommonLimitOffsetImpl;",
        "Value",
        "",
        "tables",
        "",
        "",
        "pagingSource",
        "Landroidx/room/paging/LimitOffsetPagingSource;",
        "convertRows",
        "Lkotlin/Function3;",
        "Landroidx/room/RoomRawQuery;",
        "",
        "Lkotlin/coroutines/Continuation;",
        "",
        "<init>",
        "([Ljava/lang/String;Landroidx/room/paging/LimitOffsetPagingSource;Lkotlin/jvm/functions/Function3;)V",
        "[Ljava/lang/String;",
        "Lkotlin/jvm/functions/Function3;",
        "db",
        "Landroidx/room/RoomDatabase;",
        "sourceQuery",
        "itemCount",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Landroidx/room/concurrent/AtomicInt;",
        "getItemCount$room_paging_release",
        "()Ljava/util/concurrent/atomic/AtomicInteger;",
        "invalidationFlowStarted",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Landroidx/room/concurrent/AtomicBoolean;",
        "invalidationFlowJob",
        "Lkotlinx/coroutines/Job;",
        "load",
        "Landroidx/paging/PagingSource$LoadResult;",
        "params",
        "Landroidx/paging/PagingSource$LoadParams;",
        "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "initialLoad",
        "nonInitialLoad",
        "tempCount",
        "(Landroidx/paging/PagingSource$LoadParams;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "room-paging_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final BUG_LINK:Ljava/lang/String; = "https://issuetracker.google.com/issues/new?component=413107&template=1096568"

.field public static final Companion:Landroidx/room/paging/CommonLimitOffsetImpl$Companion;

.field private static final INVALID:Landroidx/paging/PagingSource$LoadResult$Invalid;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingSource$LoadResult$Invalid<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final convertRows:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/room/RoomRawQuery;",
            "Ljava/lang/Integer;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "+TValue;>;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final db:Landroidx/room/RoomDatabase;

.field private invalidationFlowJob:Lkotlinx/coroutines/Job;

.field private final invalidationFlowStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final itemCount:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final pagingSource:Landroidx/room/paging/LimitOffsetPagingSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/paging/LimitOffsetPagingSource<",
            "TValue;>;"
        }
    .end annotation
.end field

.field private final sourceQuery:Landroidx/room/RoomRawQuery;

.field private final tables:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/room/paging/CommonLimitOffsetImpl$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/room/paging/CommonLimitOffsetImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/room/paging/CommonLimitOffsetImpl;->Companion:Landroidx/room/paging/CommonLimitOffsetImpl$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/paging/PagingSource$LoadResult$Invalid;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/paging/PagingSource$LoadResult$Invalid;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Landroidx/room/paging/CommonLimitOffsetImpl;->INVALID:Landroidx/paging/PagingSource$LoadResult$Invalid;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>([Ljava/lang/String;Landroidx/room/paging/LimitOffsetPagingSource;Lkotlin/jvm/functions/Function3;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            "Landroidx/room/paging/LimitOffsetPagingSource<",
            "TValue;>;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/room/RoomRawQuery;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "+TValue;>;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "tables"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "pagingSource"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "convertRows"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->tables:[Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->pagingSource:Landroidx/room/paging/LimitOffsetPagingSource;

    .line 22
    .line 23
    iput-object p3, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->convertRows:Lkotlin/jvm/functions/Function3;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroidx/room/paging/LimitOffsetPagingSource;->getDb()Landroidx/room/RoomDatabase;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->db:Landroidx/room/RoomDatabase;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroidx/room/paging/LimitOffsetPagingSource;->getSourceQuery()Landroidx/room/RoomRawQuery;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->sourceQuery:Landroidx/room/RoomRawQuery;

    .line 36
    .line 37
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 38
    .line 39
    const/4 p3, -0x1

    .line 40
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->itemCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 44
    .line 45
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 46
    .line 47
    const/4 p3, 0x0

    .line 48
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->invalidationFlowStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 52
    .line 53
    new-instance p1, Landroidx/room/paging/a;

    .line 54
    .line 55
    invoke-direct {p1, p0}, Landroidx/room/paging/a;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, p1}, Landroidx/paging/PagingSource;->registerInvalidatedCallback(Lkotlin/jvm/functions/Function0;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method private static final _init_$lambda$0(Landroidx/room/paging/CommonLimitOffsetImpl;)Lkotlin/Unit;
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->invalidationFlowJob:Lkotlinx/coroutines/Job;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p0, v1, v0, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic a(Landroidx/room/paging/CommonLimitOffsetImpl;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/room/paging/CommonLimitOffsetImpl;->_init_$lambda$0(Landroidx/room/paging/CommonLimitOffsetImpl;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getConvertRows$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Lkotlin/jvm/functions/Function3;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->convertRows:Lkotlin/jvm/functions/Function3;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getDb$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Landroidx/room/RoomDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getINVALID$cp()Landroidx/paging/PagingSource$LoadResult$Invalid;
    .locals 1

    .line 1
    sget-object v0, Landroidx/room/paging/CommonLimitOffsetImpl;->INVALID:Landroidx/paging/PagingSource$LoadResult$Invalid;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getPagingSource$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Landroidx/room/paging/LimitOffsetPagingSource;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->pagingSource:Landroidx/room/paging/LimitOffsetPagingSource;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSourceQuery$p(Landroidx/room/paging/CommonLimitOffsetImpl;)Landroidx/room/RoomRawQuery;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->sourceQuery:Landroidx/room/RoomRawQuery;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getTables$p(Landroidx/room/paging/CommonLimitOffsetImpl;)[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->tables:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$initialLoad(Landroidx/room/paging/CommonLimitOffsetImpl;Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/room/paging/CommonLimitOffsetImpl;->initialLoad(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$nonInitialLoad(Landroidx/room/paging/CommonLimitOffsetImpl;Landroidx/paging/PagingSource$LoadParams;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/room/paging/CommonLimitOffsetImpl;->nonInitialLoad(Landroidx/paging/PagingSource$LoadParams;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final initialLoad(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->db:Landroidx/room/RoomDatabase;

    .line 2
    .line 3
    new-instance v1, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, Landroidx/room/paging/CommonLimitOffsetImpl$initialLoad$2;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, p2}, Landroidx/room/RoomDatabaseKt;->useReaderConnection(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method private final nonInitialLoad(Landroidx/paging/PagingSource$LoadParams;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Landroidx/paging/PagingSource$LoadResult;

    .line 44
    .line 45
    iget-object p2, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 48
    .line 49
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    iget-object p1, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 64
    .line 65
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object p2, p1

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object p3, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->sourceQuery:Landroidx/room/RoomRawQuery;

    .line 74
    .line 75
    iget-object v2, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->convertRows:Lkotlin/jvm/functions/Function3;

    .line 76
    .line 77
    iput-object p0, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    iput v4, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->label:I

    .line 80
    .line 81
    invoke-static {p1, p3, p2, v2, v0}, Landroidx/room/paging/util/RoomPagingUtil;->queryDatabase(Landroidx/paging/PagingSource$LoadParams;Landroidx/room/RoomRawQuery;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    if-ne p3, v1, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move-object p2, p0

    .line 89
    :goto_1
    move-object p1, p3

    .line 90
    check-cast p1, Landroidx/paging/PagingSource$LoadResult;

    .line 91
    .line 92
    iget-object p3, p2, Landroidx/room/paging/CommonLimitOffsetImpl;->db:Landroidx/room/RoomDatabase;

    .line 93
    .line 94
    invoke-virtual {p3}, Landroidx/room/RoomDatabase;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-interface {p3}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    new-instance v2, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$2;

    .line 103
    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-direct {v2, p2, v4}, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$2;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;Lkotlin/coroutines/Continuation;)V

    .line 106
    .line 107
    .line 108
    iput-object p2, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object p1, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->L$1:Ljava/lang/Object;

    .line 111
    .line 112
    iput v3, v0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->label:I

    .line 113
    .line 114
    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    if-ne p3, v1, :cond_5

    .line 119
    .line 120
    :goto_2
    return-object v1

    .line 121
    :cond_5
    :goto_3
    iget-object p2, p2, Landroidx/room/paging/CommonLimitOffsetImpl;->pagingSource:Landroidx/room/paging/LimitOffsetPagingSource;

    .line 122
    .line 123
    invoke-virtual {p2}, Landroidx/paging/PagingSource;->getInvalid()Z

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-eqz p2, :cond_6

    .line 128
    .line 129
    sget-object p1, Landroidx/room/paging/CommonLimitOffsetImpl;->INVALID:Landroidx/paging/PagingSource$LoadResult$Invalid;

    .line 130
    .line 131
    const-string p2, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Invalid<kotlin.Int, Value of androidx.room.paging.CommonLimitOffsetImpl>"

    .line 132
    .line 133
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_6
    return-object p1
.end method


# virtual methods
.method public final getItemCount$room_paging_release()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->itemCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    return-object v0
.end method

.method public final load(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :catch_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    goto :goto_4

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->invalidationFlowStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-virtual {p2, v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-eqz p2, :cond_4

    .line 71
    .line 72
    iget-object p2, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->db:Landroidx/room/RoomDatabase;

    .line 73
    .line 74
    invoke-virtual {p2}, Landroidx/room/RoomDatabase;->getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    new-instance v8, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;

    .line 79
    .line 80
    const/4 p2, 0x0

    .line 81
    invoke-direct {v8, p0, p2}, Landroidx/room/paging/CommonLimitOffsetImpl$load$2;-><init>(Landroidx/room/paging/CommonLimitOffsetImpl;Lkotlin/coroutines/Continuation;)V

    .line 82
    .line 83
    .line 84
    const/4 v9, 0x3

    .line 85
    const/4 v10, 0x0

    .line 86
    const/4 v6, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    iput-object p2, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->invalidationFlowJob:Lkotlinx/coroutines/Job;

    .line 93
    .line 94
    :cond_4
    iget-object p2, p0, Landroidx/room/paging/CommonLimitOffsetImpl;->itemCount:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    const/4 v2, -0x1

    .line 101
    if-ne p2, v2, :cond_6

    .line 102
    .line 103
    :try_start_2
    iput v4, v0, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;->label:I

    .line 104
    .line 105
    invoke-direct {p0, p1, v0}, Landroidx/room/paging/CommonLimitOffsetImpl;->initialLoad(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-ne p2, v1, :cond_5

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    :goto_1
    check-cast p2, Landroidx/paging/PagingSource$LoadResult;

    .line 113
    .line 114
    return-object p2

    .line 115
    :cond_6
    iput v3, v0, Landroidx/room/paging/CommonLimitOffsetImpl$load$1;->label:I

    .line 116
    .line 117
    invoke-direct {p0, p1, p2, v0}, Landroidx/room/paging/CommonLimitOffsetImpl;->nonInitialLoad(Landroidx/paging/PagingSource$LoadParams;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    if-ne p2, v1, :cond_7

    .line 122
    .line 123
    :goto_2
    return-object v1

    .line 124
    :cond_7
    :goto_3
    check-cast p2, Landroidx/paging/PagingSource$LoadResult;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 125
    .line 126
    return-object p2

    .line 127
    :goto_4
    new-instance p2, Landroidx/paging/PagingSource$LoadResult$Error;

    .line 128
    .line 129
    invoke-direct {p2, p1}, Landroidx/paging/PagingSource$LoadResult$Error;-><init>(Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    return-object p2
.end method
