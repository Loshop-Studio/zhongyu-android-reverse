.class public final synthetic Landroidx/room/paging/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Landroidx/room/RoomRawQuery;

.field public final synthetic b:Landroidx/room/paging/LimitOffsetPagingSource;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroidx/room/RoomRawQuery;Landroidx/room/paging/LimitOffsetPagingSource;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/paging/b;->a:Landroidx/room/RoomRawQuery;

    iput-object p2, p0, Landroidx/room/paging/b;->b:Landroidx/room/paging/LimitOffsetPagingSource;

    iput p3, p0, Landroidx/room/paging/b;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/room/paging/b;->a:Landroidx/room/RoomRawQuery;

    iget-object v1, p0, Landroidx/room/paging/b;->b:Landroidx/room/paging/LimitOffsetPagingSource;

    iget v2, p0, Landroidx/room/paging/b;->c:I

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, p1}, Landroidx/room/paging/LimitOffsetPagingSource;->a(Landroidx/room/RoomRawQuery;Landroidx/room/paging/LimitOffsetPagingSource;ILandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
