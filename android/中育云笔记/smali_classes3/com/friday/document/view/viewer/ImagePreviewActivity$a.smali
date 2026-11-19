.class public final Lcom/friday/document/view/viewer/ImagePreviewActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/viewer/ImagePreviewActivity;->initData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/document/view/viewer/ImagePreviewActivity;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/viewer/ImagePreviewActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/viewer/ImagePreviewActivity$a;->a:Lcom/friday/document/view/viewer/ImagePreviewActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;La1/h;Z)Z
    .locals 0

    .line 1
    const-string p1, "target"

    .line 2
    .line 3
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/friday/document/view/viewer/ImagePreviewActivity$a;->a:Lcom/friday/document/view/viewer/ImagePreviewActivity;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 10
    .line 11
    .line 12
    const-string p1, "\u56fe\u7247\u4e0b\u8f7d\u5931\u8d25"

    .line 13
    .line 14
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/friday/document/view/viewer/ImagePreviewActivity$a;->a:Lcom/friday/document/view/viewer/ImagePreviewActivity;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/friday/document/view/viewer/ImagePreviewActivity;->O(Lcom/friday/document/view/viewer/ImagePreviewActivity;)Lcom/friday/document/databinding/ActivityImagePreviewBinding;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p1, p1, Lcom/friday/document/databinding/ActivityImagePreviewBinding;->e:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    return p2
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;La1/h;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lcom/friday/document/view/viewer/ImagePreviewActivity$a;->c(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;La1/h;Lcom/bumptech/glide/load/DataSource;Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public c(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;La1/h;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 1
    const-string p3, "resource"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "model"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "dataSource"

    .line 12
    .line 13
    invoke-static {p4, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/friday/document/view/viewer/ImagePreviewActivity$a;->a:Lcom/friday/document/view/viewer/ImagePreviewActivity;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    invoke-virtual {p1, p2}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 20
    .line 21
    .line 22
    return p2
.end method
