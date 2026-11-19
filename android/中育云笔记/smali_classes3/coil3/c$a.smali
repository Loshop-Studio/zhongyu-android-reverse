.class public final Lcoil3/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil3/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcoil3/c$a;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcoil3/c;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-static {p1}, Lcoil3/c;->a(Lcoil3/c;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/a;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcoil3/c$a;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-static {p1}, Lkotlin/collections/a;->x(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcoil3/c$a;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Lcoil3/c;
    .locals 3

    .line 1
    new-instance v0, Lcoil3/c;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/c$a;->a:Ljava/util/Map;

    .line 4
    .line 5
    invoke-static {v1}, La0/b;->d(Ljava/util/Map;)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, Lcoil3/c;-><init>(Ljava/util/Map;Lkotlin/jvm/internal/n;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final b(Lcoil3/c$c;Ljava/lang/Object;)Lcoil3/c$a;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcoil3/c$a;->a:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    iget-object p2, p0, Lcoil3/c$a;->a:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object p0
.end method
