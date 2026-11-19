.class public final synthetic Lc2/j2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/j2;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/j2;->d:Ljava/lang/String;

    iput-wide p3, p0, Lc2/j2;->e:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lc2/j2;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/j2;->d:Ljava/lang/String;

    iget-wide v2, p0, Lc2/j2;->e:J

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/friday/common/dao/ShareCacheDao_Impl;->k(Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
