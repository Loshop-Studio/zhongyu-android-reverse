.class public final synthetic Lc2/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/common/dao/FileDao_Impl;

.field public final synthetic d:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/dao/FileDao_Impl;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/h0;->c:Lcom/friday/common/dao/FileDao_Impl;

    iput-object p2, p0, Lc2/h0;->d:Lcom/friday/common/entity/FileEntity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc2/h0;->c:Lcom/friday/common/dao/FileDao_Impl;

    iget-object v1, p0, Lc2/h0;->d:Lcom/friday/common/entity/FileEntity;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/friday/common/dao/FileDao_Impl;->t0(Lcom/friday/common/dao/FileDao_Impl;Lcom/friday/common/entity/FileEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
