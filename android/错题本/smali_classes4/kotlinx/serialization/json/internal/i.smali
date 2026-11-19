.class public final Lkotlinx/serialization/json/internal/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lm7/w;

.field public b:Z


# direct methods
.method public constructor <init>(Lk7/g;)V
    .locals 2

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lm7/w;

    .line 10
    .line 11
    new-instance v1, Lkotlinx/serialization/json/internal/JsonElementMarker$origin$1;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lkotlinx/serialization/json/internal/JsonElementMarker$origin$1;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, Lm7/w;-><init>(Lk7/g;Lr6/e;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lkotlinx/serialization/json/internal/i;->a:Lm7/w;

    .line 20
    .line 21
    return-void
.end method
