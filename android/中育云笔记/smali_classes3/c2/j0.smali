.class public final synthetic Lc2/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/j0;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/j0;->d:Ljava/lang/String;

    iput p3, p0, Lc2/j0;->e:I

    iput-object p4, p0, Lc2/j0;->f:Ljava/lang/String;

    iput-object p5, p0, Lc2/j0;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lc2/j0;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/j0;->d:Ljava/lang/String;

    iget v2, p0, Lc2/j0;->e:I

    iget-object v3, p0, Lc2/j0;->f:Ljava/lang/String;

    iget-object v4, p0, Lc2/j0;->g:Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v5}, Lcom/friday/common/dao/FileDao_Impl;->n0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
