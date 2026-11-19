.class public final synthetic Lc2/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/room/RoomRawQuery;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/RoomRawQuery;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/s0;->c:Landroidx/room/RoomRawQuery;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc2/s0;->c:Landroidx/room/RoomRawQuery;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, p1}, Lcom/friday/common/dao/FileDao_Impl$getByParentIdByTimePagingForStudent$1;->c(Landroidx/room/RoomRawQuery;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
