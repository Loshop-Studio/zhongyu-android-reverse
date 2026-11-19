.class public final synthetic Lc2/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/d2;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/d2;->d:Ljava/lang/String;

    iput-object p3, p0, Lc2/d2;->e:Ljava/lang/String;

    iput-wide p4, p0, Lc2/d2;->f:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lc2/d2;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/d2;->d:Ljava/lang/String;

    iget-object v2, p0, Lc2/d2;->e:Ljava/lang/String;

    iget-wide v3, p0, Lc2/d2;->f:J

    move-object v5, p1

    check-cast v5, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v5}, Lcom/friday/common/dao/ResourceDao_Impl;->A0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
