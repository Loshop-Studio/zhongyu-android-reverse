.class public final synthetic Lc2/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/common/dao/ImageSafetyDao_Impl;

.field public final synthetic d:Lcom/friday/common/entity/ImageSafetyEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/dao/ImageSafetyDao_Impl;Lcom/friday/common/entity/ImageSafetyEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/w0;->c:Lcom/friday/common/dao/ImageSafetyDao_Impl;

    iput-object p2, p0, Lc2/w0;->d:Lcom/friday/common/entity/ImageSafetyEntity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc2/w0;->c:Lcom/friday/common/dao/ImageSafetyDao_Impl;

    iget-object v1, p0, Lc2/w0;->d:Lcom/friday/common/entity/ImageSafetyEntity;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/friday/common/dao/ImageSafetyDao_Impl;->h(Lcom/friday/common/dao/ImageSafetyDao_Impl;Lcom/friday/common/entity/ImageSafetyEntity;Landroidx/sqlite/SQLiteConnection;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
