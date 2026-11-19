.class public final synthetic Landroidx/room/support/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/sqlite/db/SupportSQLiteStatement;

    invoke-static {p1}, Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;->d(Landroidx/sqlite/db/SupportSQLiteStatement;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
