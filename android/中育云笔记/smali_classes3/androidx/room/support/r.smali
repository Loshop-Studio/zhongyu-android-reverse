.class public final synthetic Landroidx/room/support/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;

.field public final synthetic d:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/support/r;->c:Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;

    iput-object p2, p0, Landroidx/room/support/r;->d:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/support/r;->c:Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;

    iget-object v1, p0, Landroidx/room/support/r;->d:Lhd/l;

    check-cast p1, Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-static {v0, v1, p1}, Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;->f(Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;Lhd/l;Landroidx/sqlite/db/SupportSQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
