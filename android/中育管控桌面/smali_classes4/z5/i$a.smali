.class public Lz5/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz5/i;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lz5/d0;)Lz5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Type;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Lz5/i;


# direct methods
.method public constructor <init>(Lz5/i;Ljava/lang/reflect/Type;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz5/i$a;->c:Lz5/i;

    .line 2
    .line 3
    iput-object p2, p0, Lz5/i$a;->a:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    iput-object p3, p0, Lz5/i$a;->b:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lz5/i$a;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Lz5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lz5/i$a;->c(Lz5/d;)Lz5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Lz5/d;)Lz5/d;
    .locals 2

    .line 1
    iget-object v0, p0, Lz5/i$a;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v1, Lz5/i$b;

    .line 7
    .line 8
    invoke-direct {v1, v0, p1}, Lz5/i$b;-><init>(Ljava/util/concurrent/Executor;Lz5/d;)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method
