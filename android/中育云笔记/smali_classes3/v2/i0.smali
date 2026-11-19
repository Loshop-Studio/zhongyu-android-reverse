.class public final synthetic Lv2/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/RecycleBinFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/RecycleBinFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/i0;->c:Lcom/friday/document/view/document/RecycleBinFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/i0;->c:Lcom/friday/document/view/document/RecycleBinFragment;

    check-cast p1, Lcom/friday/document/adapter/c;

    check-cast p2, Lcom/friday/common/entity/FileEntity;

    invoke-static {v0, p1, p2}, Lcom/friday/document/view/document/RecycleBinFragment;->W(Lcom/friday/document/view/document/RecycleBinFragment;Lcom/friday/document/adapter/c;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
