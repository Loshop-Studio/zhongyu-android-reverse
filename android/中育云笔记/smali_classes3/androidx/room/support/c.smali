.class public final synthetic Landroidx/room/support/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/util/Locale;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Locale;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/room/support/c;->c:Ljava/util/Locale;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/support/c;->c:Ljava/util/Locale;

    check-cast p1, Landroidx/sqlite/db/SupportSQLiteDatabase;

    invoke-static {v0, p1}, Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;->e(Ljava/util/Locale;Landroidx/sqlite/db/SupportSQLiteDatabase;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
