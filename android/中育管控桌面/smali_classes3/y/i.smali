.class public abstract Ly/i;
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
    sget-object v1, Lb0/c$a;->b:Lb0/c$a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ly/i;->a:Lcoil3/c$c;

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
    sput-object v0, Ly/i;->b:Lcoil3/c$c;

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
    sput-object v0, Ly/i;->c:Lcoil3/c$c;

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
    sput-object v0, Ly/i;->d:Lcoil3/c$c;

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
    sput-object v0, Ly/i;->e:Lcoil3/c$c;

    .line 48
    .line 49
    new-instance v0, Lcoil3/c$c;

    .line 50
    .line 51
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Ly/i;->f:Lcoil3/c$c;

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
    sput-object v0, Ly/i;->g:Lcoil3/c$c;

    .line 64
    .line 65
    return-void
.end method

.method public static synthetic a(ILy/e;)Lk/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly/i;->d(ILy/e;)Lk/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILy/e;)Lk/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly/i;->q(ILy/e;)Lk/j;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly/e$a;I)Ly/e$a;
    .locals 1

    .line 1
    new-instance v0, Ly/g;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ly/g;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ly/e$a;->e(Lkotlin/jvm/functions/Function1;)Ly/e$a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final d(ILy/e;)Lk/j;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ly/e;->c()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p0}, Lc0/c;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

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

.method public static final e(Ly/e;)Z
    .locals 1

    .line 1
    sget-object v0, Ly/i;->f:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Ly/e;Lcoil3/c$c;)Ljava/lang/Object;

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
    sget-object p0, Ly/i;->g:Lcoil3/c$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final g(Ly/e;)Z
    .locals 1

    .line 1
    sget-object v0, Ly/i;->g:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Ly/e;Lcoil3/c$c;)Ljava/lang/Object;

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

.method public static final h(Ly/m;)Z
    .locals 1

    .line 1
    sget-object v0, Ly/i;->g:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Ly/m;Lcoil3/c$c;)Ljava/lang/Object;

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

.method public static final i(Ly/e;)Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    sget-object v0, Ly/i;->b:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Ly/e;Lcoil3/c$c;)Ljava/lang/Object;

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

.method public static final j(Ly/m;)Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    sget-object v0, Ly/i;->b:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Ly/m;Lcoil3/c$c;)Ljava/lang/Object;

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
    sget-object p0, Ly/i;->b:Lcoil3/c$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final l(Ly/m;)Landroid/graphics/ColorSpace;
    .locals 1

    .line 1
    sget-object v0, Ly/i;->c:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Ly/m;Lcoil3/c$c;)Ljava/lang/Object;

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

.method public static final m(Ly/e;)Landroidx/lifecycle/Lifecycle;
    .locals 1

    .line 1
    sget-object v0, Ly/i;->e:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Ly/e;Lcoil3/c$c;)Ljava/lang/Object;

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

.method public static final n(Ly/m;)Z
    .locals 1

    .line 1
    sget-object v0, Ly/i;->d:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Ly/m;Lcoil3/c$c;)Ljava/lang/Object;

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

.method public static final o(Ly/e;)Lb0/c$a;
    .locals 1

    .line 1
    sget-object v0, Ly/i;->a:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Ly/e;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lb0/c$a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final p(Ly/e$a;I)Ly/e$a;
    .locals 1

    .line 1
    new-instance v0, Ly/h;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ly/h;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ly/e$a;->f(Lkotlin/jvm/functions/Function1;)Ly/e$a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final q(ILy/e;)Lk/j;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ly/e;->c()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p0}, Lc0/c;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

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
