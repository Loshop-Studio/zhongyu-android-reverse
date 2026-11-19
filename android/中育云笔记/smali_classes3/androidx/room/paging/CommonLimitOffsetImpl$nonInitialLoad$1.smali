.class final Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/paging/CommonLimitOffsetImpl;->nonInitialLoad(Landroidx/paging/PagingSource$LoadParams;ILvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.room.paging.CommonLimitOffsetImpl"
    f = "LimitOffsetPagingSource.kt"
    l = {
        0x8b,
        0x93
    }
    m = "nonInitialLoad"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/room/paging/CommonLimitOffsetImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/paging/CommonLimitOffsetImpl<",
            "TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/paging/CommonLimitOffsetImpl;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/paging/CommonLimitOffsetImpl<",
            "TValue;>;",
            "Lvc/c<",
            "-",
            "Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->label:I

    iget-object p1, p0, Landroidx/room/paging/CommonLimitOffsetImpl$nonInitialLoad$1;->this$0:Landroidx/room/paging/CommonLimitOffsetImpl;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Landroidx/room/paging/CommonLimitOffsetImpl;->access$nonInitialLoad(Landroidx/room/paging/CommonLimitOffsetImpl;Landroidx/paging/PagingSource$LoadParams;ILvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
