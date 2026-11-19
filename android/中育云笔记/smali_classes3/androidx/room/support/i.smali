.class public final synthetic Landroidx/room/support/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/support/i;->c:Ljava/lang/String;

    iput-object p2, p0, Landroidx/room/support/i;->d:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/support/i;->c:Ljava/lang/String;

    iget-object v1, p0, Landroidx/room/support/i;->d:[Ljava/lang/Object;

    check-cast p1, Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-static {v0, v1, p1}, Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;->g(Ljava/lang/String;[Ljava/lang/Object;Landroidx/sqlite/db/SupportSQLiteDatabase;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
