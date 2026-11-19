.class public final synthetic Ls3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/main/adapter/SearchAdapter;

.field public final synthetic d:Lcom/friday/common/entity/FileEntity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/b;->c:Lcom/friday/main/adapter/SearchAdapter;

    iput-object p2, p0, Ls3/b;->d:Lcom/friday/common/entity/FileEntity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls3/b;->c:Lcom/friday/main/adapter/SearchAdapter;

    iget-object v1, p0, Ls3/b;->d:Lcom/friday/common/entity/FileEntity;

    invoke-static {v0, v1, p1}, Lcom/friday/main/adapter/SearchAdapter;->d(Lcom/friday/main/adapter/SearchAdapter;Lcom/friday/common/entity/FileEntity;Landroid/view/View;)V

    return-void
.end method
