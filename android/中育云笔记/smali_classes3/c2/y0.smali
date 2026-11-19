.class public final synthetic Lc2/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/y0;->c:Ljava/lang/String;

    iput-object p2, p0, Lc2/y0;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc2/y0;->c:Ljava/lang/String;

    iget-object v1, p0, Lc2/y0;->d:Ljava/lang/String;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/friday/common/dao/ImageSafetyDao_Impl;->f(Ljava/lang/String;Ljava/lang/String;Landroidx/sqlite/SQLiteConnection;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
