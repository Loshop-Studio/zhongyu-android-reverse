.class public final synthetic Lc2/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:I

.field public final synthetic f:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/r1;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/r1;->d:Ljava/util/List;

    iput p3, p0, Lc2/r1;->e:I

    iput-wide p4, p0, Lc2/r1;->f:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lc2/r1;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/r1;->d:Ljava/util/List;

    iget v2, p0, Lc2/r1;->e:I

    iget-wide v3, p0, Lc2/r1;->f:J

    move-object v5, p1

    check-cast v5, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v5}, Lcom/friday/common/dao/ResourceDao_Impl;->l0(Ljava/lang/String;Ljava/util/List;IJLandroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
