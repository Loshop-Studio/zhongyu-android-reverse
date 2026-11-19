.class public Lc9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc9/g;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lc9/y;)Lc9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/reflect/Type;

.field public final synthetic b:Ljava/util/concurrent/Executor;

.field public final synthetic c:Lc9/g;


# direct methods
.method public constructor <init>(Lc9/g;Ljava/lang/reflect/Type;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc9/g$a;->c:Lc9/g;

    .line 2
    .line 3
    iput-object p2, p0, Lc9/g$a;->a:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    iput-object p3, p0, Lc9/g$a;->b:Ljava/util/concurrent/Executor;

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
    iget-object v0, p0, Lc9/g$a;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Lc9/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc9/g$a;->c(Lc9/b;)Lc9/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Lc9/b;)Lc9/b;
    .locals 2

    .line 1
    iget-object v0, p0, Lc9/g$a;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance v1, Lc9/g$b;

    .line 7
    .line 8
    invoke-direct {v1, v0, p1}, Lc9/g$b;-><init>(Ljava/util/concurrent/Executor;Lc9/b;)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method
