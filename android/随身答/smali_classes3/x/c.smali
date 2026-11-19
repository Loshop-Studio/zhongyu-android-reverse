.class public final Lx/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lcoil3/network/NetworkFetcher$Factory;
    .locals 1

    .line 1
    invoke-static {}, Lw/b;->d()Lcoil3/network/NetworkFetcher$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic factory()Lp/k$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx/c;->a()Lcoil3/network/NetworkFetcher$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public priority()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public type()Lkotlin/reflect/KClass;
    .locals 1

    .line 1
    const-class v0, Lk/r;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    return-object v0
.end method
