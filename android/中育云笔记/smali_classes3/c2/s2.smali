.class public final synthetic Lc2/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/s2;->c:Ljava/lang/String;

    iput-wide p2, p0, Lc2/s2;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc2/s2;->c:Ljava/lang/String;

    iget-wide v1, p0, Lc2/s2;->d:J

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, p1}, Lcom/friday/common/dao/UserDao_Impl;->s(Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lcom/friday/common/entity/User;

    move-result-object p1

    return-object p1
.end method
