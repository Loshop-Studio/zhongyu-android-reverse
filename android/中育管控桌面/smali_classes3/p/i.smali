.class public final Lp/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp/i$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/graphics/drawable/Drawable;

.field public final b:Ly/m;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Ly/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp/i;->a:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    iput-object p2, p0, Lp/i;->b:Ly/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object p1, p0, Lp/i;->a:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-static {p1}, Lcoil3/util/d;->j(Landroid/graphics/drawable/Drawable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    new-instance v0, Lp/m;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lc0/g;->a:Lc0/g;

    .line 12
    .line 13
    iget-object v2, p0, Lp/i;->a:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    iget-object v3, p0, Lp/i;->b:Ly/m;

    .line 16
    .line 17
    invoke-static {v3}, Ly/i;->j(Ly/m;)Landroid/graphics/Bitmap$Config;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p0, Lp/i;->b:Ly/m;

    .line 22
    .line 23
    invoke-virtual {v4}, Ly/m;->k()Lz/e;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, p0, Lp/i;->b:Ly/m;

    .line 28
    .line 29
    invoke-virtual {v5}, Ly/m;->j()Lcoil3/size/Scale;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, p0, Lp/i;->b:Ly/m;

    .line 34
    .line 35
    invoke-virtual {v6}, Ly/m;->i()Lcoil3/size/Precision;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    sget-object v7, Lcoil3/size/Precision;->b:Lcoil3/size/Precision;

    .line 40
    .line 41
    if-ne v6, v7, :cond_0

    .line 42
    .line 43
    const/4 v6, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v6, 0x0

    .line 46
    :goto_0
    invoke-virtual/range {v1 .. v6}, Lc0/g;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lz/e;Lcoil3/size/Scale;Z)Landroid/graphics/Bitmap;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, Lp/i;->b:Ly/m;

    .line 51
    .line 52
    invoke-virtual {v2}, Ly/m;->c()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    new-instance v3, Landroid/graphics/drawable/BitmapDrawable;

    .line 61
    .line 62
    invoke-direct {v3, v2, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    iget-object v3, p0, Lp/i;->a:Landroid/graphics/drawable/Drawable;

    .line 67
    .line 68
    :goto_1
    invoke-static {v3}, Lk/o;->c(Landroid/graphics/drawable/Drawable;)Lk/j;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v2, Lcoil3/decode/DataSource;->b:Lcoil3/decode/DataSource;

    .line 73
    .line 74
    invoke-direct {v0, v1, p1, v2}, Lp/m;-><init>(Lk/j;ZLcoil3/decode/DataSource;)V

    .line 75
    .line 76
    .line 77
    return-object v0
.end method
