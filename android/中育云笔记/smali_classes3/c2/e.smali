.class public final synthetic Lc2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Z

.field public final synthetic f:J

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/e;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/e;->d:Ljava/lang/String;

    iput-boolean p3, p0, Lc2/e;->e:Z

    iput-wide p4, p0, Lc2/e;->f:J

    iput-object p6, p0, Lc2/e;->g:Ljava/lang/String;

    iput p7, p0, Lc2/e;->h:I

    iput-object p8, p0, Lc2/e;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lc2/e;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/e;->d:Ljava/lang/String;

    iget-boolean v2, p0, Lc2/e;->e:Z

    iget-wide v3, p0, Lc2/e;->f:J

    iget-object v5, p0, Lc2/e;->g:Ljava/lang/String;

    iget v6, p0, Lc2/e;->h:I

    iget-object v7, p0, Lc2/e;->i:Ljava/lang/String;

    move-object v8, p1

    check-cast v8, Landroidx/sqlite/SQLiteConnection;

    invoke-static/range {v0 .. v8}, Lcom/friday/common/dao/FileDao_Impl;->x0(Ljava/lang/String;Ljava/lang/String;ZJLjava/lang/String;ILjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
