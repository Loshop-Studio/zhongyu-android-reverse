.class public final Lcoil3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcoil3/i;->a:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Lcoil3/j;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iget-object p1, p1, Lcoil3/j;->a:Ljava/util/Map;

    .line 5
    invoke-static {p1}, Lkotlin/collections/e0;->L(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lcoil3/i;->a:Ljava/util/LinkedHashMap;

    return-void
.end method
