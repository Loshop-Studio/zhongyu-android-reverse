.class public final synthetic Lv2/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/NewestFragment;

.field public final synthetic d:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/g0;->c:Lcom/friday/document/view/document/NewestFragment;

    iput-object p2, p0, Lv2/g0;->d:Lcom/friday/common/entity/FileEntity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/g0;->c:Lcom/friday/document/view/document/NewestFragment;

    iget-object v1, p0, Lv2/g0;->d:Lcom/friday/common/entity/FileEntity;

    invoke-static {v0, v1}, Lcom/friday/document/view/document/NewestFragment;->Y(Lcom/friday/document/view/document/NewestFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
