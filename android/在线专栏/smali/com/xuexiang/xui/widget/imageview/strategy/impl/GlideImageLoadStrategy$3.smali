.class Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;Lcom/xuexiang/xui/widget/imageview/strategy/LoadOption;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/request/RequestListener<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;

.field final synthetic val$listener:Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;


# direct methods
.method constructor <init>(Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$3;->this$0:Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy;

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$3;->val$listener:Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadFailed(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/GlideException;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/drawable/Drawable;",
            ">;Z)Z"
        }
    .end annotation

    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$3;->val$listener:Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;

    invoke-interface {p2, p1}, Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;->onLoadFailed(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/drawable/Drawable;",
            ">;",
            "Lcom/bumptech/glide/load/DataSource;",
            "Z)Z"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$3;->val$listener:Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/imageview/strategy/ILoadListener;->onLoadSuccess()V

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/xuexiang/xui/widget/imageview/strategy/impl/GlideImageLoadStrategy$3;->onResourceReady(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Lcom/bumptech/glide/load/DataSource;Z)Z

    move-result p1

    return p1
.end method
