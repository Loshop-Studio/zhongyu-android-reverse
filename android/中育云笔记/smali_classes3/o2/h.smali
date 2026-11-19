.class public final synthetic Lo2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;

.field public final synthetic d:Lcom/friday/document/adapter/RecycleBinAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/h;->c:Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;

    iput-object p2, p0, Lo2/h;->d:Lcom/friday/document/adapter/RecycleBinAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/h;->c:Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;

    iget-object v1, p0, Lo2/h;->d:Lcom/friday/document/adapter/RecycleBinAdapter;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/friday/document/adapter/RecycleBinAdapter;->d(Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;Lcom/friday/document/adapter/RecycleBinAdapter;Landroid/view/View;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
