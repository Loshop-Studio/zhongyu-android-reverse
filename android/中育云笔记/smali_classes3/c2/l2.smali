.class public final synthetic Lc2/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLjava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/l2;->c:Ljava/lang/String;

    iput-wide p2, p0, Lc2/l2;->d:J

    iput-object p4, p0, Lc2/l2;->e:Ljava/lang/String;

    iput-wide p5, p0, Lc2/l2;->f:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc2/l2;->c:Ljava/lang/String;

    iget-wide v1, p0, Lc2/l2;->d:J

    iget-object v3, p0, Lc2/l2;->e:Ljava/lang/String;

    iget-wide v4, p0, Lc2/l2;->f:J

    move-object v6, p1

    check-cast v6, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ShareCacheDao_Impl;->h(Ljava/lang/String;JLjava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
