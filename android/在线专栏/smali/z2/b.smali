.class public final Lz2/b;
.super Lz2/a;
.source "SourceFile"


# instance fields
.field private final c:Lz2/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz2/a;-><init>()V

    .line 2
    new-instance v0, Lz2/b$a;

    invoke-direct {v0}, Lz2/b$a;-><init>()V

    iput-object v0, p0, Lz2/b;->c:Lz2/b$a;

    return-void
.end method


# virtual methods
.method public c()Ljava/util/Random;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lz2/b;->c:Lz2/b$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "implStorage.get()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
