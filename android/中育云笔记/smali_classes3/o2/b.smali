.class public final synthetic Lo2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

.field public final synthetic d:Lcom/friday/document/adapter/DocumentAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/b;->c:Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    iput-object p2, p0, Lo2/b;->d:Lcom/friday/document/adapter/DocumentAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/b;->c:Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;

    iget-object v1, p0, Lo2/b;->d:Lcom/friday/document/adapter/DocumentAdapter;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/friday/document/adapter/DocumentAdapter;->h(Lcom/friday/document/adapter/DocumentAdapter$DocumentHolder;Lcom/friday/document/adapter/DocumentAdapter;Landroid/view/View;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
