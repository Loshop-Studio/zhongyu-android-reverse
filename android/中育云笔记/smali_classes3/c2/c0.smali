.class public final synthetic Lc2/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/c0;->c:Ljava/lang/String;

    iput p2, p0, Lc2/c0;->d:I

    iput-boolean p3, p0, Lc2/c0;->e:Z

    iput-object p4, p0, Lc2/c0;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lc2/c0;->c:Ljava/lang/String;

    iget v1, p0, Lc2/c0;->d:I

    iget-boolean v2, p0, Lc2/c0;->e:Z

    iget-object v3, p0, Lc2/c0;->f:Ljava/lang/String;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/friday/common/dao/FileDao_Impl;->c0(Ljava/lang/String;IZLjava/lang/String;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
