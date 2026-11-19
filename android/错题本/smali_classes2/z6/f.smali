.class public final Lz6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/h;


# instance fields
.field public final a:Lz6/h;

.field public final b:Z

.field public final c:Lr6/c;


# direct methods
.method public constructor <init>(Lz6/h;ZLr6/c;)V
    .locals 1

    .line 1
    const-string v0, "predicate"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lz6/f;->a:Lz6/h;

    .line 10
    .line 11
    iput-boolean p2, p0, Lz6/f;->b:Z

    .line 12
    .line 13
    iput-object p3, p0, Lz6/f;->c:Lr6/c;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lz6/e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lz6/e;-><init>(Lz6/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
