.class public final synthetic Lc2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/s;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/s;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc2/s;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/s;->d:Ljava/util/List;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/friday/common/dao/FileDao_Impl;->A0(Ljava/lang/String;Ljava/util/List;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
