.class public Lb/c/a/e/f/c/d/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/c/a/e/f/c/d/b;


# instance fields
.field public a:Lcom/bumptech/glide/request/RequestOptions;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lcom/bumptech/glide/request/RequestOptions;

    invoke-direct {v0}, Lcom/bumptech/glide/request/RequestOptions;-><init>()V

    const v1, 0x7f0800ee

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/RequestOptions;->error(I)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/request/RequestOptions;

    sget-object v1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->ALL:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/request/RequestOptions;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/request/RequestOptions;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lb/c/a/e/f/c/d/a;->a:Lcom/bumptech/glide/request/RequestOptions;

    return-void
.end method


# virtual methods
.method public a(La/k/b/m;)V
    .locals 0

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(La/k/b/m;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->onStop()V

    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->get(Landroid/content/Context;)Lcom/bumptech/glide/Glide;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/Glide;->clearMemory()V

    return-void
.end method

.method public c(La/k/b/m;Ljava/lang/String;Landroid/widget/ImageView;Lb/c/a/e/f/c/d/c;)V
    .locals 1

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(La/k/b/m;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->asBitmap()Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    iget-object v0, p0, Lb/c/a/e/f/c/d/a;->a:Lcom/bumptech/glide/request/RequestOptions;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    new-instance p2, Lb/c/a/e/f/c/d/a$a;

    invoke-direct {p2, p0, p4}, Lb/c/a/e/f/c/d/a$a;-><init>(Lb/c/a/e/f/c/d/a;Lb/c/a/e/f/c/d/c;)V

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestBuilder;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public d(La/k/b/m;Ljava/lang/String;Landroid/widget/ImageView;Lb/c/a/e/f/c/d/c;)V
    .locals 1

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(La/k/b/m;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->asGif()Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    iget-object v0, p0, Lb/c/a/e/f/c/d/a;->a:Lcom/bumptech/glide/request/RequestOptions;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    new-instance p2, Lb/c/a/e/f/c/d/a$b;

    invoke-direct {p2, p0, p4}, Lb/c/a/e/f/c/d/a$b;-><init>(Lb/c/a/e/f/c/d/a;Lb/c/a/e/f/c/d/c;)V

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestBuilder;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method
