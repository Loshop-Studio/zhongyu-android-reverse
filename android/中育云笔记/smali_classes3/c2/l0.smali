.class public final synthetic Lc2/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/l0;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/l0;->d:Ljava/lang/String;

    iput p3, p0, Lc2/l0;->e:I

    iput-object p4, p0, Lc2/l0;->f:Ljava/lang/String;

    iput-boolean p5, p0, Lc2/l0;->g:Z

    iput-object p6, p0, Lc2/l0;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lc2/l0;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/l0;->d:Ljava/lang/String;

    iget v2, p0, Lc2/l0;->e:I

    iget-object v3, p0, Lc2/l0;->f:Ljava/lang/String;

    iget-boolean v4, p0, Lc2/l0;->g:Z

    iget-object v5, p0, Lc2/l0;->h:Ljava/lang/String;

    move-object v6, p1

    check-cast v6, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/FileDao_Impl;->J0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
