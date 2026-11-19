.class public final Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;->b(Ljava/io/File;Ljava/util/ArrayList;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;


# direct methods
.method public constructor <init>(Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$d;->c:Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lk/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$d;->c:Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;->a(Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;)Lcom/friday/document/databinding/ItemNoteThumbnailBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/ItemNoteThumbnailBinding;->d:Lcom/friday/common/widget/ScaleImageView;

    .line 8
    .line 9
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "getResources(...)"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v1}, Lk/o;->a(Lk/j;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
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
