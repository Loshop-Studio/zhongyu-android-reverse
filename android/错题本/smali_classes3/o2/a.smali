.class public final Lo2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/a;
.implements Lb3/c;
.implements Lq5/g;
.implements Lretrofit2/m;
.implements Lf0/q;
.implements Ly/a;
.implements Li0/i;
.implements Lm2/a;
.implements Lm4/d;
.implements Lo0/i;
.implements Lo7/f;
.implements Lq/i;


# static fields
.field public static volatile c:Lo2/a;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lo2/a;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 18
    new-instance p1, Lk4/a;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lk4/a;-><init>(I)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void

    .line 21
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void

    .line 23
    :sswitch_1
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 24
    const-string v0, "timeUnit"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance p1, Lokhttp3/internal/connection/m;

    .line 26
    sget-object v0, Lr7/c;->h:Lr7/c;

    .line 27
    invoke-direct {p1, v0}, Lokhttp3/internal/connection/m;-><init>(Lr7/c;)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void

    .line 30
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 32
    iput-object p1, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void

    .line 33
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance p1, Lo2/a;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Lo2/a;-><init>(I)V

    iput-object p1, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void

    .line 35
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance p1, Lf0/m;

    const-wide/16 v0, 0x1f4

    .line 37
    invoke-direct {p1, v0, v1}, Lv0/g;-><init>(J)V

    .line 38
    iput-object p1, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void

    .line 39
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance p1, Lf0/a0;

    const/4 v0, 0x7

    .line 41
    invoke-direct {p1, v0}, Lf0/a0;-><init>(I)V

    .line 42
    iput-object p1, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xf -> :sswitch_5
        0x10 -> :sswitch_4
        0x12 -> :sswitch_3
        0x14 -> :sswitch_2
        0x1b -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lo2/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0xc

    iput v0, p0, Lo2/a;->a:I

    .line 3
    new-instance v0, Ld0/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ld0/e;-><init>(Landroid/content/Context;I)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcoil3/network/k;)V
    .locals 3

    const/4 v0, 0x7

    iput v0, p0, Lo2/a;->a:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iget-object p1, p1, Lcoil3/network/k;->a:Ljava/util/Map;

    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 13
    check-cast v1, Ljava/util/Map$Entry;

    .line 14
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 15
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/t;->E0(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    .line 16
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 17
    :cond_0
    iput-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/gson/g;Lcom/google/gson/p;)V
    .locals 0

    const/16 p1, 0xe

    iput p1, p0, Lo2/a;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p2, p0, Lo2/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lo2/a;->a:I

    iput-object p1, p0, Lo2/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public A(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 4
    .line 5
    iget v1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 6
    .line 7
    const/16 v2, 0x12

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-ne p1, v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move-object v1, p1

    .line 21
    check-cast v1, Lb3/b;

    .line 22
    .line 23
    invoke-interface {v1}, Lb3/b;->a()Lb3/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Lb3/c;->t()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget-object v1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lb3/d;

    .line 41
    .line 42
    if-nez p1, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget p1, p1, Lb3/d;->a:I

    .line 50
    .line 51
    if-eq v1, p1, :cond_4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    iget-object p1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    iget-object p1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrVelocity()F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    const/4 v1, 0x0

    .line 69
    cmpg-float v1, p1, v1

    .line 70
    .line 71
    if-gez v1, :cond_5

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_5
    neg-float p1, p1

    .line 75
    :goto_0
    iget-object v1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c(F)V

    .line 81
    .line 82
    .line 83
    :cond_6
    :goto_1
    return-void
.end method

.method public B(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 6
    .line 7
    const-string v2, "Cache-Control"

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "toLowerCase(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    filled-new-array {p1}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p1}, Lkotlin/collections/u;->A([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public a(Lq/a;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public b(Lq/a;)Lq/b;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public c(Ljava/io/File;)V
    .locals 1

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lh6/i;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {v0, p1}, Lh6/i;->resumeWith(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public clear()V
    .locals 0

    .line 1
    return-void
.end method

.method public convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lokhttp3/m0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lokhttp3/m0;->charStream()Ljava/io/Reader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ll1/a;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ll1/a;-><init>(Ljava/io/Reader;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lcom/google/gson/Strictness;->LEGACY_STRICT:Lcom/google/gson/Strictness;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Ll1/a;->A(Lcom/google/gson/Strictness;)V

    .line 15
    .line 16
    .line 17
    :try_start_0
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lcom/google/gson/p;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/google/gson/p;->b(Ll1/a;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v1}, Ll1/a;->x()Lcom/google/gson/stream/JsonToken;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v2, Lcom/google/gson/stream/JsonToken;->END_DOCUMENT:Lcom/google/gson/stream/JsonToken;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Lokhttp3/m0;->close()V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    :try_start_1
    new-instance v0, Lcom/google/gson/JsonIOException;

    .line 38
    .line 39
    const-string v1, "JSON document was not fully consumed."

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    invoke-virtual {p1}, Lokhttp3/m0;->close()V

    .line 47
    .line 48
    .line 49
    throw v0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh6/i;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lh6/i;->resumeWith(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public e(I)Z
    .locals 4

    .line 1
    iget v0, p0, Lo2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    .line 9
    .line 10
    sget v1, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->j:I

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-gez p1, :cond_0

    .line 19
    .line 20
    if-lez v1, :cond_2

    .line 21
    .line 22
    move v2, v3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->getScrollRange()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lt p1, v0, :cond_1

    .line 33
    .line 34
    move v2, v3

    .line 35
    :cond_1
    xor-int/2addr v2, v3

    .line 36
    :cond_2
    :goto_0
    return v2

    .line 37
    :pswitch_0
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public f()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lo2/a;->u()S

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shl-int/lit8 v0, v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p0}, Lo2/a;->u()S

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    or-int/2addr v0, v1

    .line 12
    return v0
.end method

.method public getSize()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget v0, p0, Lo2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->b(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollOffset()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public i()V
    .locals 3

    .line 1
    iget v0, p0, Lo2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->d()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollRange()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v0, v1, v2}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public j(I)V
    .locals 2

    .line 1
    iget v0, p0, Lo2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->flingScroll(II)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroidx/core/widget/NestedScrollView;->fling(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public k()I
    .locals 1

    .line 1
    iget v0, p0, Lo2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->c(Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollRange()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public l(Ly6/c;Lr6/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/serialization/modules/a;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, p1, p2, v1}, Lkotlinx/serialization/modules/a;->c(Ly6/c;Lr6/c;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public m(Ly6/c;Ly6/c;Li7/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/serialization/modules/a;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, p1, p2, p3, v1}, Lkotlinx/serialization/modules/a;->d(Ly6/c;Ly6/c;Li7/b;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public n(Ly6/c;Li7/b;)V
    .locals 2

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkotlinx/serialization/modules/a;

    .line 9
    .line 10
    new-instance v1, Lo7/a;

    .line 11
    .line 12
    invoke-direct {v1, p2}, Lo7/a;-><init>(Li7/b;)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {v0, p1, v1, p2}, Lkotlinx/serialization/modules/a;->e(Ly6/c;Lo7/c;Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public o(Ly6/c;Lr6/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/serialization/modules/a;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, p1, p2, v1}, Lkotlinx/serialization/modules/a;->b(Ly6/c;Lr6/c;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onComplete()V
    .locals 1

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq5/g;

    .line 4
    .line 5
    invoke-interface {v0}, Lq5/g;->onComplete()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq5/g;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    :try_start_0
    new-instance p1, Lc8/c;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1}, Lq5/g;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lq5/g;->onComplete()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string v1, "error == null"

    .line 24
    .line 25
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    :goto_0
    :try_start_2
    invoke-interface {v0, p1}, Lq5/g;->onError(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :catchall_1
    move-exception v0

    .line 34
    invoke-static {v0}, Lh4/a;->p(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lio/reactivex/exceptions/CompositeException;

    .line 38
    .line 39
    filled-new-array {p1, v0}, [Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v1, p1}, Lio/reactivex/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lv7/d;->q(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lretrofit2/n0;

    .line 2
    .line 3
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lq5/g;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lc8/c;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p1}, Lq5/g;->onNext(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 19
    .line 20
    const-string v0, "response == null"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1
.end method

.method public onSubscribe(Ls5/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq5/g;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lq5/g;->onSubscribe(Ls5/b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public p(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public q(Ly6/c;Lr6/c;)V
    .locals 2

    .line 1
    const-string v0, "kClass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkotlinx/serialization/modules/a;

    .line 9
    .line 10
    new-instance v1, Lo7/b;

    .line 11
    .line 12
    invoke-direct {v1, p2}, Lo7/b;-><init>(Lr6/c;)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {v0, p1, v1, p2}, Lkotlinx/serialization/modules/a;->e(Ly6/c;Lo7/c;Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public r(Lf0/x;)Lf0/p;
    .locals 2

    .line 1
    iget p1, p0, Lo2/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lg0/a;

    .line 7
    .line 8
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lo2/a;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lg0/a;-><init>(Lo2/a;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, Lf0/c;

    .line 17
    .line 18
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lf0/a0;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {p1, v0, v1}, Lf0/c;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public s(Ljava/lang/Object;Ljava/io/File;Ly/f;)Z
    .locals 5

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    const-string p3, "StreamEncoder"

    .line 4
    .line 5
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lc0/g;

    .line 8
    .line 9
    const/high16 v1, 0x10000

    .line 10
    .line 11
    const-class v2, [B

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Lc0/g;->e(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, [B

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    :try_start_0
    new-instance v4, Ljava/io/FileOutputStream;

    .line 22
    .line 23
    invoke-direct {v4, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    :goto_0
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v3, -0x1

    .line 31
    if-eq p2, v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v4, v1, v2, p2}, Ljava/io/OutputStream;->write([BII)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    move-object v3, v4

    .line 39
    goto :goto_3

    .line 40
    :catch_0
    move-exception p1

    .line 41
    move-object v3, v4

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    :try_start_2
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 47
    .line 48
    .line 49
    :catch_1
    invoke-virtual {v0, v1}, Lc0/g;->j(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p1

    .line 55
    goto :goto_3

    .line 56
    :catch_2
    move-exception p1

    .line 57
    :goto_1
    const/4 p2, 0x3

    .line 58
    :try_start_3
    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    const-string p2, "Failed to encode data onto the OutputStream"

    .line 65
    .line 66
    invoke-static {p3, p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    .line 68
    .line 69
    :cond_1
    if-eqz v3, :cond_2

    .line 70
    .line 71
    :try_start_4
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 72
    .line 73
    .line 74
    :catch_3
    :cond_2
    invoke-virtual {v0, v1}, Lc0/g;->j(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    return v2

    .line 78
    :goto_3
    if-eqz v3, :cond_3

    .line 79
    .line 80
    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 81
    .line 82
    .line 83
    :catch_4
    :cond_3
    invoke-virtual {v0, v1}, Lc0/g;->j(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public skip(J)J
    .locals 8

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/InputStream;

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    cmp-long v3, p1, v1

    .line 8
    .line 9
    if-gez v3, :cond_0

    .line 10
    .line 11
    return-wide v1

    .line 12
    :cond_0
    move-wide v3, p1

    .line 13
    :goto_0
    cmp-long v5, v3, v1

    .line 14
    .line 15
    if-lez v5, :cond_3

    .line 16
    .line 17
    invoke-virtual {v0, v3, v4}, Ljava/io/InputStream;->skip(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    cmp-long v7, v5, v1

    .line 22
    .line 23
    if-lez v7, :cond_1

    .line 24
    .line 25
    :goto_1
    sub-long/2addr v3, v5

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, -0x1

    .line 32
    if-ne v5, v6, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    const-wide/16 v5, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    :goto_2
    sub-long/2addr p1, v3

    .line 39
    return-wide p1
.end method

.method public t()Z
    .locals 1

    .line 1
    iget v0, p0, Lo2/a;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lo2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "{fragment="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lcom/bumptech/glide/manager/SupportRequestManagerFragment;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "}"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, "{fragment="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lcom/bumptech/glide/manager/RequestManagerFragment;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, "}"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0

    .line 79
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public u()S
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/InputStream;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    int-to-short v0, v0

    .line 13
    return v0

    .line 14
    :cond_0
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser$Reader$EndOfFileException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public update(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public v()V
    .locals 2

    .line 1
    iget v0, p0, Lo2/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, v1}, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageWebView;->scrollTo(II)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/view/LinkageScrollView;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1, v1}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public w(Lq/a;Lcoil3/k;Ljava/util/Map;J)V
    .locals 7

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Ld2/c;

    .line 5
    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    move-object v4, p3

    .line 9
    move-wide v5, p4

    .line 10
    invoke-virtual/range {v1 .. v6}, Ld2/c;->g(Lq/a;Lcoil3/k;Ljava/util/Map;J)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public x(Lk7/g;Lkotlinx/serialization/json/internal/k;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/Map;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p1, v0

    .line 25
    :goto_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    return-object p1
.end method

.method public y(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    .line 6
    .line 7
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;->NONE:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 8
    .line 9
    iput-object v2, v1, Lcom/xuexiang/xui/widget/imageview/edit/d;->h:Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/opengl/GLSurfaceView;->requestRender()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->c:Lcom/xuexiang/xui/widget/imageview/edit/d;

    .line 15
    .line 16
    iput-object p1, v0, Lcom/xuexiang/xui/widget/imageview/edit/d;->i:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/imageview/edit/d;->g:Z

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v1, "onBitmapLoaded() called with: sourceBitmap = ["

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p1, "]"

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v0, "PhotoEditorView"

    .line 41
    .line 42
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public z(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lo2/a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;

    .line 4
    .line 5
    iget v1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->k:I

    .line 6
    .line 7
    const/16 v2, 0x11

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/lit8 v1, v1, -0x1

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-ne p1, v1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v1, p1

    .line 26
    check-cast v1, Lb3/b;

    .line 27
    .line 28
    invoke-interface {v1}, Lb3/b;->a()Lb3/c;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v1}, Lb3/c;->t()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-object v1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->b:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Lb3/d;

    .line 46
    .line 47
    if-nez p1, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget p1, p1, Lb3/d;->a:I

    .line 55
    .line 56
    if-eq v1, p1, :cond_4

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    iget-object p1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_6

    .line 66
    .line 67
    iget-object p1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrVelocity()F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v1, 0x0

    .line 74
    cmpl-float v1, p1, v1

    .line 75
    .line 76
    if-lez v1, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    neg-float p1, p1

    .line 80
    :goto_0
    iget-object v1, v0, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->d:Landroid/widget/Scroller;

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/layout/linkage/LinkageScrollLayout;->c(F)V

    .line 86
    .line 87
    .line 88
    :cond_6
    :goto_1
    return-void
.end method
