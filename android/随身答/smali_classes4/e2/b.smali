.class public Le2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/framework/UMLogDataProtocol;
.implements Ln2/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le2/b$b;
    }
.end annotation


# static fields
.field public static a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le2/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le2/b;-><init>()V

    return-void
.end method

.method public static f(Landroid/content/Context;)Le2/b;
    .locals 1

    .line 1
    sget-object v0, Le2/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sput-object p0, Le2/b;->a:Landroid/content/Context;

    .line 12
    .line 13
    :cond_0
    invoke-static {}, Le2/b$b;->a()Le2/b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Le2/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lg2/k0;->e(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    sget-object v0, Le2/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lg2/k0;->p()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public c(Ljava/lang/Object;I)V
    .locals 1

    .line 1
    sget-object v0, Le2/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, Lg2/k0;->f(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(J)Lorg/json/JSONObject;
    .locals 1

    .line 1
    sget-object v0, Le2/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1, p2}, Lg2/k0;->b(J)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public e()V
    .locals 1

    .line 1
    sget-object v0, Le2/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/k0;->a(Landroid/content/Context;)Lg2/k0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lg2/k0;->d()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
