.class public final Lcom/friday/main/adapter/FullScreenPreviewAdapter$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/adapter/FullScreenPreviewAdapter;->k(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Landroid/widget/ImageView;

.field public final synthetic d:Lcom/friday/main/adapter/FullScreenPreviewAdapter;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Lcom/friday/main/adapter/FullScreenPreviewAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter$b;->c:Landroid/widget/ImageView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter$b;->d:Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lk/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter$b;->c:Landroid/widget/ImageView;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter$b;->d:Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getResources(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1}, Lk/o;->a(Lk/j;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public b(Lk/j;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lk/j;)V
    .locals 0

    .line 1
    return-void
.end method
