.class public final synthetic Landroidx/room/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/p;->c:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/p;->c:Lhd/l;

    check-cast p1, Landroidx/sqlite/SQLiteStatement;

    invoke-static {v0, p1}, Landroidx/room/RoomRawQuery;->b(Lhd/l;Landroidx/sqlite/SQLiteStatement;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
