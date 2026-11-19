.class public final synthetic Lc2/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/v1;->c:Ljava/lang/String;

    iput-wide p2, p0, Lc2/v1;->d:J

    iput-object p4, p0, Lc2/v1;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lc2/v1;->c:Ljava/lang/String;

    iget-wide v1, p0, Lc2/v1;->d:J

    iget-object v3, p0, Lc2/v1;->e:Ljava/lang/String;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/friday/common/dao/ResourceDao_Impl;->g0(Ljava/lang/String;JLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
