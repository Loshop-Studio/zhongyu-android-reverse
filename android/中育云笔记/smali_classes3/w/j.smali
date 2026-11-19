.class public abstract Lw/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcoil3/c$c;

.field public static final b:Lcoil3/c$c;

.field public static final c:Lcoil3/c$c;

.field public static final d:Lcoil3/c$c;

.field public static final e:Lcoil3/c$c;

.field public static final f:Lcoil3/c$c;

.field public static final g:Lcoil3/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcoil3/c$c;

    .line 2
    .line 3
    sget-object v1, Lz/c$a;->b:Lz/c$a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lw/j;->a:Lcoil3/c$c;

    .line 9
    .line 10
    new-instance v0, Lcoil3/c$c;

    .line 11
    .line 12
    invoke-static {}, Lcoil3/util/d;->a()Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lw/j;->b:Lcoil3/c$c;

    .line 20
    .line 21
    new-instance v0, Lcoil3/c$c;

    .line 22
    .line 23
    invoke-static {}, Lcoil3/util/d;->c()Landroid/graphics/ColorSpace;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lw/j;->c:Lcoil3/c$c;

    .line 31
    .line 32
    new-instance v0, Lcoil3/c$c;

    .line 33
    .line 34
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lw/j;->d:Lcoil3/c$c;

    .line 40
    .line 41
    new-instance v0, Lcoil3/c$c;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {v0, v2}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lw/j;->e:Lcoil3/c$c;

    .line 48
    .line 49
    new-instance v0, Lcoil3/c$c;

    .line 50
    .line 51
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lw/j;->f:Lcoil3/c$c;

    .line 55
    .line 56
    new-instance v0, Lcoil3/c$c;

    .line 57
    .line 58
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lw/j;->g:Lcoil3/c$c;

    .line 64
    .line 65
    return-void
.end method

.method public static synthetic a(ILw/g;)Lk/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lw/j;->d(ILw/g;)Lk/j;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lw/g$a;I)Lw/g$a;
    .locals 1

    .line 1
    new-instance v0, Lw/i;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lw/i;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lw/g$a;->g(Lhd/l;)Lw/g$a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final c(Lw/g$a;Landroid/graphics/drawable/Drawable;)Lw/g$a;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lk/o;->c(Landroid/graphics/drawable/Drawable;)Lk/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-virtual {p0, p1}, Lw/g$a;->h(Lk/j;)Lw/g$a;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final d(ILw/g;)Lk/j;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lw/g;->c()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p0}, La0/c;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lk/o;->c(Landroid/graphics/drawable/Drawable;)Lk/j;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final e(Lw/g;)Z
    .locals 1

    .line 1
    sget-object v0, Lw/j;->f:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Lw/g;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final f(Lcoil3/c$c$a;)Lcoil3/c$c;
    .locals 0

    .line 1
    sget-object p0, Lw/j;->g:Lcoil3/c$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final g(Lw/g;)Z
    .locals 1

    .line 1
    sget-object v0, Lw/j;->g:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Lw/g;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final h(Lw/n;)Z
    .locals 1

    .line 1
    sget-object v0, Lw/j;->g:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Lw/n;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final i(Lw/g;)Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    sget-object v0, Lw/j;->b:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Lw/g;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/Bitmap$Config;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final j(Lw/n;)Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    sget-object v0, Lw/j;->b:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Lw/n;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/Bitmap$Config;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final k(Lcoil3/c$c$a;)Lcoil3/c$c;
    .locals 0

    .line 1
    sget-object p0, Lw/j;->b:Lcoil3/c$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final l(Lw/n;)Landroid/graphics/ColorSpace;
    .locals 1

    .line 1
    sget-object v0, Lw/j;->c:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Lw/n;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Landroidx/compose/ui/graphics/e1;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final m(Lw/g;)Landroidx/lifecycle/Lifecycle;
    .locals 1

    .line 1
    sget-object v0, Lw/j;->e:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Lw/g;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/lifecycle/Lifecycle;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final n(Lw/n;)Z
    .locals 1

    .line 1
    sget-object v0, Lw/j;->d:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Lw/n;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final o(Lw/g;)Lz/c$a;
    .locals 1

    .line 1
    sget-object v0, Lw/j;->a:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Lw/g;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lz/c$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final p(Lw/g$a;Landroid/graphics/drawable/Drawable;)Lw/g$a;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lk/o;->c(Landroid/graphics/drawable/Drawable;)Lk/j;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-virtual {p0, p1}, Lw/g$a;->n(Lk/j;)Lw/g$a;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static final q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;
    .locals 1

    .line 1
    new-instance v0, Lcoil3/target/ImageViewTarget;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcoil3/target/ImageViewTarget;-><init>(Landroid/widget/ImageView;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lw/g$a;->s(Ly/a;)Lw/g$a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
