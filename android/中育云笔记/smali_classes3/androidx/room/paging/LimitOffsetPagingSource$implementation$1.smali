.class final synthetic Landroidx/room/paging/LimitOffsetPagingSource$implementation$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/paging/LimitOffsetPagingSource;-><init>(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lhd/q;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v5, "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v6, 0x0

    const/4 v1, 0x3

    const-class v3, Landroidx/room/paging/LimitOffsetPagingSource;

    const-string v4, "convertRows"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/room/RoomRawQuery;ILvc/c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/RoomRawQuery;",
            "I",
            "Lvc/c<",
            "-",
            "Ljava/util/List<",
            "+TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    check-cast v0, Landroidx/room/paging/LimitOffsetPagingSource;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/room/paging/LimitOffsetPagingSource;->convertRows(Landroidx/room/RoomRawQuery;ILvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Landroidx/room/RoomRawQuery;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lvc/c;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/room/paging/LimitOffsetPagingSource$implementation$1;->invoke(Landroidx/room/RoomRawQuery;ILvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
