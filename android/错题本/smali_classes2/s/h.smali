.class public abstract Ls/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo2/a;

.field public static final b:Lo2/a;

.field public static final c:Lo2/a;

.field public static final d:Lo2/a;

.field public static final e:Lo2/a;

.field public static final f:Lo2/a;

.field public static final g:Lo2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lo2/a;

    .line 2
    .line 3
    sget-object v1, Lv/a;->a:Lv/a;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ls/h;->a:Lo2/a;

    .line 10
    .line 11
    new-instance v0, Lo2/a;

    .line 12
    .line 13
    sget-object v1, Lcoil3/util/l;->b:Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Ls/h;->b:Lo2/a;

    .line 19
    .line 20
    new-instance v0, Lo2/a;

    .line 21
    .line 22
    const/4 v1, 0x6

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v0, v2, v1}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ls/h;->c:Lo2/a;

    .line 28
    .line 29
    new-instance v0, Lo2/a;

    .line 30
    .line 31
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    const/4 v3, 0x6

    .line 34
    invoke-direct {v0, v1, v3}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Ls/h;->d:Lo2/a;

    .line 38
    .line 39
    new-instance v0, Lo2/a;

    .line 40
    .line 41
    invoke-direct {v0, v2, v3}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Ls/h;->e:Lo2/a;

    .line 45
    .line 46
    new-instance v0, Lo2/a;

    .line 47
    .line 48
    const/4 v2, 0x6

    .line 49
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    sput-object v0, Ls/h;->f:Lo2/a;

    .line 53
    .line 54
    new-instance v0, Lo2/a;

    .line 55
    .line 56
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Ls/h;->g:Lo2/a;

    .line 62
    .line 63
    return-void
.end method

.method public static final a(Ls/c;)V
    .locals 3

    .line 1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    iget-object v1, p0, Ls/c;->q:Ljava/lang/Object;

    .line 4
    .line 5
    instance-of v2, v1, Lcoil3/i;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    check-cast v1, Lcoil3/i;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    instance-of v2, v1, Lcoil3/j;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    check-cast v1, Lcoil3/j;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v2, Lcoil3/i;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Lcoil3/i;-><init>(Lcoil3/j;)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Ls/c;->q:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v1, v2

    .line 29
    :goto_0
    iget-object p0, v1, Lcoil3/i;->a:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    sget-object v1, Ls/h;->b:Lo2/a;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-interface {p0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    .line 44
    .line 45
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static final b(Ls/l;)Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    sget-object v0, Ls/h;->b:Lo2/a;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/o;->f(Ls/l;Lo2/a;)Ljava/lang/Object;

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
