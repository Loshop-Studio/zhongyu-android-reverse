.class public final synthetic Lc2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/m;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/m;->d:Ljava/lang/String;

    iput p3, p0, Lc2/m;->e:I

    iput-object p4, p0, Lc2/m;->f:Ljava/lang/String;

    iput-object p5, p0, Lc2/m;->g:Ljava/util/List;

    iput p6, p0, Lc2/m;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc2/m;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/m;->d:Ljava/lang/String;

    iget v2, p0, Lc2/m;->e:I

    iget-object v3, p0, Lc2/m;->f:Ljava/lang/String;

    iget-object v4, p0, Lc2/m;->g:Ljava/util/List;

    iget v5, p0, Lc2/m;->h:I

    move-object v6, p1

    check-cast v6, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/FileDao_Impl;->s0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ILandroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
