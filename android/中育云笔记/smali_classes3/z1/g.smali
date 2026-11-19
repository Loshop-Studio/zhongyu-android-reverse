.class public final synthetic Lz1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/common/MyDataBase_Impl;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/MyDataBase_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/g;->c:Lcom/friday/common/MyDataBase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz1/g;->c:Lcom/friday/common/MyDataBase_Impl;

    invoke-static {v0}, Lcom/friday/common/MyDataBase_Impl;->B(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ImageSafetyDao_Impl;

    move-result-object v0

    return-object v0
.end method
